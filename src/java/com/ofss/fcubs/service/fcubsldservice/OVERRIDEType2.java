
package com.ofss.fcubs.service.fcubsldservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OVERRIDEType2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OVERRIDEType2">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OVDSN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MODULE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ERRCODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PARAM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ONLAUTHID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="REMARKS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AUTHBY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AUTHDTSTAMP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TXTSTATUS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OVDSTATUS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CONFIRMED" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OVDREMARKS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OVDTXT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OVERRIDEType2", propOrder = {
    "ovdsn",
    "module",
    "errcode",
    "param",
    "onlauthid",
    "remarks",
    "authby",
    "authdtstamp",
    "txtstatus",
    "ovdstatus",
    "confirmed",
    "ovdremarks",
    "ovdtxt"
})
public class OVERRIDEType2 {

    @XmlElement(name = "OVDSN")
    protected String ovdsn;
    @XmlElement(name = "MODULE")
    protected String module;
    @XmlElement(name = "ERRCODE")
    protected String errcode;
    @XmlElement(name = "PARAM")
    protected String param;
    @XmlElement(name = "ONLAUTHID")
    protected String onlauthid;
    @XmlElement(name = "REMARKS")
    protected String remarks;
    @XmlElement(name = "AUTHBY")
    protected String authby;
    @XmlElement(name = "AUTHDTSTAMP")
    protected String authdtstamp;
    @XmlElement(name = "TXTSTATUS")
    protected String txtstatus;
    @XmlElement(name = "OVDSTATUS")
    protected String ovdstatus;
    @XmlElement(name = "CONFIRMED")
    protected String confirmed;
    @XmlElement(name = "OVDREMARKS")
    protected String ovdremarks;
    @XmlElement(name = "OVDTXT")
    protected String ovdtxt;

    /**
     * Gets the value of the ovdsn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOVDSN() {
        return ovdsn;
    }

    /**
     * Sets the value of the ovdsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOVDSN(String value) {
        this.ovdsn = value;
    }

    /**
     * Gets the value of the module property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMODULE() {
        return module;
    }

    /**
     * Sets the value of the module property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMODULE(String value) {
        this.module = value;
    }

    /**
     * Gets the value of the errcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getERRCODE() {
        return errcode;
    }

    /**
     * Sets the value of the errcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setERRCODE(String value) {
        this.errcode = value;
    }

    /**
     * Gets the value of the param property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPARAM() {
        return param;
    }

    /**
     * Sets the value of the param property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPARAM(String value) {
        this.param = value;
    }

    /**
     * Gets the value of the onlauthid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getONLAUTHID() {
        return onlauthid;
    }

    /**
     * Sets the value of the onlauthid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setONLAUTHID(String value) {
        this.onlauthid = value;
    }

    /**
     * Gets the value of the remarks property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getREMARKS() {
        return remarks;
    }

    /**
     * Sets the value of the remarks property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setREMARKS(String value) {
        this.remarks = value;
    }

    /**
     * Gets the value of the authby property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAUTHBY() {
        return authby;
    }

    /**
     * Sets the value of the authby property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAUTHBY(String value) {
        this.authby = value;
    }

    /**
     * Gets the value of the authdtstamp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAUTHDTSTAMP() {
        return authdtstamp;
    }

    /**
     * Sets the value of the authdtstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAUTHDTSTAMP(String value) {
        this.authdtstamp = value;
    }

    /**
     * Gets the value of the txtstatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTXTSTATUS() {
        return txtstatus;
    }

    /**
     * Sets the value of the txtstatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTXTSTATUS(String value) {
        this.txtstatus = value;
    }

    /**
     * Gets the value of the ovdstatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOVDSTATUS() {
        return ovdstatus;
    }

    /**
     * Sets the value of the ovdstatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOVDSTATUS(String value) {
        this.ovdstatus = value;
    }

    /**
     * Gets the value of the confirmed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCONFIRMED() {
        return confirmed;
    }

    /**
     * Sets the value of the confirmed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCONFIRMED(String value) {
        this.confirmed = value;
    }

    /**
     * Gets the value of the ovdremarks property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOVDREMARKS() {
        return ovdremarks;
    }

    /**
     * Sets the value of the ovdremarks property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOVDREMARKS(String value) {
        this.ovdremarks = value;
    }

    /**
     * Gets the value of the ovdtxt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOVDTXT() {
        return ovdtxt;
    }

    /**
     * Sets the value of the ovdtxt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOVDTXT(String value) {
        this.ovdtxt = value;
    }

}
