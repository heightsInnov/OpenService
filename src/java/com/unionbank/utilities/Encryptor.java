package com.unionbank.utilities;

import java.io.PrintStream;
import org.bouncycastle.crypto.BufferedBlockCipher;
import org.bouncycastle.crypto.CryptoException;
import org.bouncycastle.crypto.engines.DESEngine;
import org.bouncycastle.crypto.modes.CBCBlockCipher;
import org.bouncycastle.crypto.modes.PaddedBlockCipher;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.util.encoders.Base64;

public class Encryptor {

	public static final String KEY = "ghk55rTB";
	private BufferedBlockCipher cipher;
	private KeyParameter key;

	public Encryptor(byte[] key) {
		this.cipher = new PaddedBlockCipher(new CBCBlockCipher(new DESEngine()));

		this.key = new KeyParameter(key);
	}

	public Encryptor(String key) {
		this(key.getBytes());
	}

	private byte[] callCipher(byte[] data)
			throws CryptoException {
		int size = this.cipher.getOutputSize(data.length);

		byte[] result = new byte[size];
		int olen = this.cipher.processBytes(data, 0, data.length, result, 0);

		olen += this.cipher.doFinal(result, olen);

		if (olen < size) {
			byte[] tmp = new byte[olen];
			System.arraycopy(result, 0, tmp, 0, olen);

			result = tmp;
		}

		return result;
	}

	public synchronized byte[] encrypt(byte[] data)
			throws CryptoException {
		if ((data == null) || (data.length == 0)) {
			return new byte[0];
		}

		this.cipher.init(true, this.key);
		return callCipher(data);
	}

	public byte[] encryptString(String data)
			throws CryptoException {
		if ((data == null) || (data.length() == 0)) {
			return new byte[0];
		}

		return encrypt(data.getBytes());
	}

	public String encryptStringEncoded(String data) {
		String dataString = "";
		try {
			byte[] dataEncrypt = encryptString(data);
			dataString = new String(Base64.encode(dataEncrypt));
		} catch (CryptoException e) {
			e.printStackTrace();
		}
		return dataString;
	}

	public String decryptStringEncoded(String data) {
		String decodedString = "";
		try {
			byte[] decodedData = Base64.decode(data);
			if ((data == null) || (decodedData.length == 0)) {
				return "";
			}
			decodedString = new String(decrypt(decodedData));
		} catch (CryptoException e) {
			e.printStackTrace();
		}
		return decodedString;
	}

	public synchronized byte[] decrypt(byte[] data)
			throws CryptoException {
		if ((data == null) || (data.length == 0)) {
			return new byte[0];
		}

		this.cipher.init(false, this.key);
		return callCipher(data);
	}

	public String decryptString(byte[] data)
			throws CryptoException {
		if ((data == null) || (data.length == 0)) {
			return "";
		}

		return new String(decrypt(data));
	}

	public static void main(String[] args) {
		Encryptor encryptor = new Encryptor("ghk55rTB");

		String encrpt = encryptor.encryptStringEncoded("5678");
		System.out.println(encrpt);
		System.out.println(encryptor.decryptStringEncoded(encrpt));
	}
}
