
package com.ofss.fcubs.service.fcubsldservice;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BrnPrmDtls-Reopen-IO-Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BrnPrmDtls-Reopen-IO-Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BRNCD" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="MODNO" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BrnPrmDtls-Reopen-IO-Type", propOrder = {
    "brncd",
    "modno"
})
public class BrnPrmDtlsReopenIOType {

    @XmlElement(name = "BRNCD", required = true)
    protected String brncd;
    @XmlElement(name = "MODNO")
    protected BigInteger modno;

    /**
     * Gets the value of the brncd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBRNCD() {
        return brncd;
    }

    /**
     * Sets the value of the brncd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBRNCD(String value) {
        this.brncd = value;
    }

    /**
     * Gets the value of the modno property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMODNO() {
        return modno;
    }

    /**
     * Sets the value of the modno property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMODNO(BigInteger value) {
        this.modno = value;
    }

}
