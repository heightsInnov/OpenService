
package com.ofss.fcubs.service.fcubsldservice;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SettlementClearingDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SettlementClearingDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FCCREF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ESN" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="AMTTAG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BRNCD" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="MSGTYPE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CLGNW" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CRBNCD" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SNDR_CUSNM1" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SNDR_CUSNM2" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SNDR_CUSNM3" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SNDR_CUSNM4" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="RCVR_CUSNM1" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="RCVR_CUSNM2" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="RCVR_CUSNM3" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="RCVR_CUSNM4" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SNDR_RCVR_PRCNT" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="SNDR_ACC" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="RCVR_ACC" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ULT_BKCD" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ADDINFO1" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ADDINFO2" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ADDINFO3" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ADDINFO4" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="NIPPYR" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="SUPPID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PYRIDFR" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PYMTTYPE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DLCLR" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="NOFDCLR" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="NOFCHK" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="REPRRES1" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="REPRRES2" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="REPRRES3" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="REPRRES4" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CDFDOC" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="ADDIDFR" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SNDR_INFO1" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SNDR_INFO2" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SNDR_INFO3" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SNDR_INFO4" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SNDR_INFO5" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SNDR_INFO6" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="GENRT" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="FRETXT1" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="FRETXT2" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="FRETXT3" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PMTCD" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ADDINFOSBR" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SettlementClearingDetails", propOrder = {
    "fccref",
    "esn",
    "amttag",
    "brncd",
    "msgtype",
    "clgnw",
    "crbncd",
    "sndrcusnm1",
    "sndrcusnm2",
    "sndrcusnm3",
    "sndrcusnm4",
    "rcvrcusnm1",
    "rcvrcusnm2",
    "rcvrcusnm3",
    "rcvrcusnm4",
    "sndrrcvrprcnt",
    "sndracc",
    "rcvracc",
    "ultbkcd",
    "addinfo1",
    "addinfo2",
    "addinfo3",
    "addinfo4",
    "nippyr",
    "suppid",
    "pyridfr",
    "pymttype",
    "dlclr",
    "nofdclr",
    "nofchk",
    "reprres1",
    "reprres2",
    "reprres3",
    "reprres4",
    "cdfdoc",
    "addidfr",
    "sndrinfo1",
    "sndrinfo2",
    "sndrinfo3",
    "sndrinfo4",
    "sndrinfo5",
    "sndrinfo6",
    "genrt",
    "fretxt1",
    "fretxt2",
    "fretxt3",
    "pmtcd",
    "addinfosbr"
})
public class SettlementClearingDetails {

    @XmlElement(name = "FCCREF")
    protected String fccref;
    @XmlElement(name = "ESN")
    protected BigInteger esn;
    @XmlElement(name = "AMTTAG")
    protected String amttag;
    @XmlElement(name = "BRNCD", required = true)
    protected String brncd;
    @XmlElement(name = "MSGTYPE", required = true)
    protected String msgtype;
    @XmlElement(name = "CLGNW", required = true)
    protected String clgnw;
    @XmlElement(name = "CRBNCD", required = true)
    protected String crbncd;
    @XmlElement(name = "SNDR_CUSNM1", required = true)
    protected String sndrcusnm1;
    @XmlElement(name = "SNDR_CUSNM2", required = true)
    protected String sndrcusnm2;
    @XmlElement(name = "SNDR_CUSNM3", required = true)
    protected String sndrcusnm3;
    @XmlElement(name = "SNDR_CUSNM4", required = true)
    protected String sndrcusnm4;
    @XmlElement(name = "RCVR_CUSNM1", required = true)
    protected String rcvrcusnm1;
    @XmlElement(name = "RCVR_CUSNM2", required = true)
    protected String rcvrcusnm2;
    @XmlElement(name = "RCVR_CUSNM3", required = true)
    protected String rcvrcusnm3;
    @XmlElement(name = "RCVR_CUSNM4", required = true)
    protected String rcvrcusnm4;
    @XmlElement(name = "SNDR_RCVR_PRCNT", required = true)
    protected BigInteger sndrrcvrprcnt;
    @XmlElement(name = "SNDR_ACC", required = true)
    protected String sndracc;
    @XmlElement(name = "RCVR_ACC", required = true)
    protected String rcvracc;
    @XmlElement(name = "ULT_BKCD", required = true)
    protected String ultbkcd;
    @XmlElement(name = "ADDINFO1", required = true)
    protected String addinfo1;
    @XmlElement(name = "ADDINFO2", required = true)
    protected String addinfo2;
    @XmlElement(name = "ADDINFO3", required = true)
    protected String addinfo3;
    @XmlElement(name = "ADDINFO4", required = true)
    protected String addinfo4;
    @XmlElement(name = "NIPPYR", required = true)
    protected BigInteger nippyr;
    @XmlElement(name = "SUPPID", required = true)
    protected String suppid;
    @XmlElement(name = "PYRIDFR", required = true)
    protected String pyridfr;
    @XmlElement(name = "PYMTTYPE", required = true)
    protected String pymttype;
    @XmlElement(name = "DLCLR", required = true)
    protected BigInteger dlclr;
    @XmlElement(name = "NOFDCLR", required = true)
    protected BigInteger nofdclr;
    @XmlElement(name = "NOFCHK", required = true)
    protected String nofchk;
    @XmlElement(name = "REPRRES1", required = true)
    protected String reprres1;
    @XmlElement(name = "REPRRES2", required = true)
    protected String reprres2;
    @XmlElement(name = "REPRRES3", required = true)
    protected String reprres3;
    @XmlElement(name = "REPRRES4", required = true)
    protected String reprres4;
    @XmlElement(name = "CDFDOC", required = true)
    protected BigInteger cdfdoc;
    @XmlElement(name = "ADDIDFR", required = true)
    protected String addidfr;
    @XmlElement(name = "SNDR_INFO1", required = true)
    protected String sndrinfo1;
    @XmlElement(name = "SNDR_INFO2", required = true)
    protected String sndrinfo2;
    @XmlElement(name = "SNDR_INFO3", required = true)
    protected String sndrinfo3;
    @XmlElement(name = "SNDR_INFO4", required = true)
    protected String sndrinfo4;
    @XmlElement(name = "SNDR_INFO5", required = true)
    protected String sndrinfo5;
    @XmlElement(name = "SNDR_INFO6", required = true)
    protected String sndrinfo6;
    @XmlElement(name = "GENRT", required = true)
    protected String genrt;
    @XmlElement(name = "FRETXT1", required = true)
    protected String fretxt1;
    @XmlElement(name = "FRETXT2", required = true)
    protected String fretxt2;
    @XmlElement(name = "FRETXT3", required = true)
    protected String fretxt3;
    @XmlElement(name = "PMTCD", required = true)
    protected String pmtcd;
    @XmlElement(name = "ADDINFOSBR", required = true)
    protected String addinfosbr;

    /**
     * Gets the value of the fccref property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFCCREF() {
        return fccref;
    }

    /**
     * Sets the value of the fccref property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFCCREF(String value) {
        this.fccref = value;
    }

    /**
     * Gets the value of the esn property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getESN() {
        return esn;
    }

    /**
     * Sets the value of the esn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setESN(BigInteger value) {
        this.esn = value;
    }

    /**
     * Gets the value of the amttag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAMTTAG() {
        return amttag;
    }

    /**
     * Sets the value of the amttag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAMTTAG(String value) {
        this.amttag = value;
    }

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
     * Gets the value of the msgtype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMSGTYPE() {
        return msgtype;
    }

    /**
     * Sets the value of the msgtype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMSGTYPE(String value) {
        this.msgtype = value;
    }

    /**
     * Gets the value of the clgnw property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCLGNW() {
        return clgnw;
    }

    /**
     * Sets the value of the clgnw property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCLGNW(String value) {
        this.clgnw = value;
    }

    /**
     * Gets the value of the crbncd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCRBNCD() {
        return crbncd;
    }

    /**
     * Sets the value of the crbncd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCRBNCD(String value) {
        this.crbncd = value;
    }

    /**
     * Gets the value of the sndrcusnm1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSNDRCUSNM1() {
        return sndrcusnm1;
    }

    /**
     * Sets the value of the sndrcusnm1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSNDRCUSNM1(String value) {
        this.sndrcusnm1 = value;
    }

    /**
     * Gets the value of the sndrcusnm2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSNDRCUSNM2() {
        return sndrcusnm2;
    }

    /**
     * Sets the value of the sndrcusnm2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSNDRCUSNM2(String value) {
        this.sndrcusnm2 = value;
    }

    /**
     * Gets the value of the sndrcusnm3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSNDRCUSNM3() {
        return sndrcusnm3;
    }

    /**
     * Sets the value of the sndrcusnm3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSNDRCUSNM3(String value) {
        this.sndrcusnm3 = value;
    }

    /**
     * Gets the value of the sndrcusnm4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSNDRCUSNM4() {
        return sndrcusnm4;
    }

    /**
     * Sets the value of the sndrcusnm4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSNDRCUSNM4(String value) {
        this.sndrcusnm4 = value;
    }

    /**
     * Gets the value of the rcvrcusnm1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRCVRCUSNM1() {
        return rcvrcusnm1;
    }

    /**
     * Sets the value of the rcvrcusnm1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRCVRCUSNM1(String value) {
        this.rcvrcusnm1 = value;
    }

    /**
     * Gets the value of the rcvrcusnm2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRCVRCUSNM2() {
        return rcvrcusnm2;
    }

    /**
     * Sets the value of the rcvrcusnm2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRCVRCUSNM2(String value) {
        this.rcvrcusnm2 = value;
    }

    /**
     * Gets the value of the rcvrcusnm3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRCVRCUSNM3() {
        return rcvrcusnm3;
    }

    /**
     * Sets the value of the rcvrcusnm3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRCVRCUSNM3(String value) {
        this.rcvrcusnm3 = value;
    }

    /**
     * Gets the value of the rcvrcusnm4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRCVRCUSNM4() {
        return rcvrcusnm4;
    }

    /**
     * Sets the value of the rcvrcusnm4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRCVRCUSNM4(String value) {
        this.rcvrcusnm4 = value;
    }

    /**
     * Gets the value of the sndrrcvrprcnt property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSNDRRCVRPRCNT() {
        return sndrrcvrprcnt;
    }

    /**
     * Sets the value of the sndrrcvrprcnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSNDRRCVRPRCNT(BigInteger value) {
        this.sndrrcvrprcnt = value;
    }

    /**
     * Gets the value of the sndracc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSNDRACC() {
        return sndracc;
    }

    /**
     * Sets the value of the sndracc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSNDRACC(String value) {
        this.sndracc = value;
    }

    /**
     * Gets the value of the rcvracc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRCVRACC() {
        return rcvracc;
    }

    /**
     * Sets the value of the rcvracc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRCVRACC(String value) {
        this.rcvracc = value;
    }

    /**
     * Gets the value of the ultbkcd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getULTBKCD() {
        return ultbkcd;
    }

    /**
     * Sets the value of the ultbkcd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setULTBKCD(String value) {
        this.ultbkcd = value;
    }

    /**
     * Gets the value of the addinfo1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getADDINFO1() {
        return addinfo1;
    }

    /**
     * Sets the value of the addinfo1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setADDINFO1(String value) {
        this.addinfo1 = value;
    }

    /**
     * Gets the value of the addinfo2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getADDINFO2() {
        return addinfo2;
    }

    /**
     * Sets the value of the addinfo2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setADDINFO2(String value) {
        this.addinfo2 = value;
    }

    /**
     * Gets the value of the addinfo3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getADDINFO3() {
        return addinfo3;
    }

    /**
     * Sets the value of the addinfo3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setADDINFO3(String value) {
        this.addinfo3 = value;
    }

    /**
     * Gets the value of the addinfo4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getADDINFO4() {
        return addinfo4;
    }

    /**
     * Sets the value of the addinfo4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setADDINFO4(String value) {
        this.addinfo4 = value;
    }

    /**
     * Gets the value of the nippyr property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNIPPYR() {
        return nippyr;
    }

    /**
     * Sets the value of the nippyr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNIPPYR(BigInteger value) {
        this.nippyr = value;
    }

    /**
     * Gets the value of the suppid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSUPPID() {
        return suppid;
    }

    /**
     * Sets the value of the suppid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSUPPID(String value) {
        this.suppid = value;
    }

    /**
     * Gets the value of the pyridfr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPYRIDFR() {
        return pyridfr;
    }

    /**
     * Sets the value of the pyridfr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPYRIDFR(String value) {
        this.pyridfr = value;
    }

    /**
     * Gets the value of the pymttype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPYMTTYPE() {
        return pymttype;
    }

    /**
     * Sets the value of the pymttype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPYMTTYPE(String value) {
        this.pymttype = value;
    }

    /**
     * Gets the value of the dlclr property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDLCLR() {
        return dlclr;
    }

    /**
     * Sets the value of the dlclr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDLCLR(BigInteger value) {
        this.dlclr = value;
    }

    /**
     * Gets the value of the nofdclr property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNOFDCLR() {
        return nofdclr;
    }

    /**
     * Sets the value of the nofdclr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNOFDCLR(BigInteger value) {
        this.nofdclr = value;
    }

    /**
     * Gets the value of the nofchk property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNOFCHK() {
        return nofchk;
    }

    /**
     * Sets the value of the nofchk property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNOFCHK(String value) {
        this.nofchk = value;
    }

    /**
     * Gets the value of the reprres1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getREPRRES1() {
        return reprres1;
    }

    /**
     * Sets the value of the reprres1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setREPRRES1(String value) {
        this.reprres1 = value;
    }

    /**
     * Gets the value of the reprres2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getREPRRES2() {
        return reprres2;
    }

    /**
     * Sets the value of the reprres2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setREPRRES2(String value) {
        this.reprres2 = value;
    }

    /**
     * Gets the value of the reprres3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getREPRRES3() {
        return reprres3;
    }

    /**
     * Sets the value of the reprres3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setREPRRES3(String value) {
        this.reprres3 = value;
    }

    /**
     * Gets the value of the reprres4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getREPRRES4() {
        return reprres4;
    }

    /**
     * Sets the value of the reprres4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setREPRRES4(String value) {
        this.reprres4 = value;
    }

    /**
     * Gets the value of the cdfdoc property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCDFDOC() {
        return cdfdoc;
    }

    /**
     * Sets the value of the cdfdoc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCDFDOC(BigInteger value) {
        this.cdfdoc = value;
    }

    /**
     * Gets the value of the addidfr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getADDIDFR() {
        return addidfr;
    }

    /**
     * Sets the value of the addidfr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setADDIDFR(String value) {
        this.addidfr = value;
    }

    /**
     * Gets the value of the sndrinfo1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSNDRINFO1() {
        return sndrinfo1;
    }

    /**
     * Sets the value of the sndrinfo1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSNDRINFO1(String value) {
        this.sndrinfo1 = value;
    }

    /**
     * Gets the value of the sndrinfo2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSNDRINFO2() {
        return sndrinfo2;
    }

    /**
     * Sets the value of the sndrinfo2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSNDRINFO2(String value) {
        this.sndrinfo2 = value;
    }

    /**
     * Gets the value of the sndrinfo3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSNDRINFO3() {
        return sndrinfo3;
    }

    /**
     * Sets the value of the sndrinfo3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSNDRINFO3(String value) {
        this.sndrinfo3 = value;
    }

    /**
     * Gets the value of the sndrinfo4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSNDRINFO4() {
        return sndrinfo4;
    }

    /**
     * Sets the value of the sndrinfo4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSNDRINFO4(String value) {
        this.sndrinfo4 = value;
    }

    /**
     * Gets the value of the sndrinfo5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSNDRINFO5() {
        return sndrinfo5;
    }

    /**
     * Sets the value of the sndrinfo5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSNDRINFO5(String value) {
        this.sndrinfo5 = value;
    }

    /**
     * Gets the value of the sndrinfo6 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSNDRINFO6() {
        return sndrinfo6;
    }

    /**
     * Sets the value of the sndrinfo6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSNDRINFO6(String value) {
        this.sndrinfo6 = value;
    }

    /**
     * Gets the value of the genrt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGENRT() {
        return genrt;
    }

    /**
     * Sets the value of the genrt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGENRT(String value) {
        this.genrt = value;
    }

    /**
     * Gets the value of the fretxt1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFRETXT1() {
        return fretxt1;
    }

    /**
     * Sets the value of the fretxt1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFRETXT1(String value) {
        this.fretxt1 = value;
    }

    /**
     * Gets the value of the fretxt2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFRETXT2() {
        return fretxt2;
    }

    /**
     * Sets the value of the fretxt2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFRETXT2(String value) {
        this.fretxt2 = value;
    }

    /**
     * Gets the value of the fretxt3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFRETXT3() {
        return fretxt3;
    }

    /**
     * Sets the value of the fretxt3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFRETXT3(String value) {
        this.fretxt3 = value;
    }

    /**
     * Gets the value of the pmtcd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPMTCD() {
        return pmtcd;
    }

    /**
     * Sets the value of the pmtcd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPMTCD(String value) {
        this.pmtcd = value;
    }

    /**
     * Gets the value of the addinfosbr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getADDINFOSBR() {
        return addinfosbr;
    }

    /**
     * Sets the value of the addinfosbr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setADDINFOSBR(String value) {
        this.addinfosbr = value;
    }

}
