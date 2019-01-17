
package com.ofss.fcubs.service.fcubsldservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EventlogType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EventlogType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MAKERID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MAKERSTAMP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CHECKERID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CHECKERSTAMP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CONTSTAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AUTHSTAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EventlogType", propOrder = {
    "makerid",
    "makerstamp",
    "checkerid",
    "checkerstamp",
    "contstat",
    "authstat"
})
public class EventlogType {

    @XmlElement(name = "MAKERID")
    protected String makerid;
    @XmlElement(name = "MAKERSTAMP")
    protected String makerstamp;
    @XmlElement(name = "CHECKERID")
    protected String checkerid;
    @XmlElement(name = "CHECKERSTAMP")
    protected String checkerstamp;
    @XmlElement(name = "CONTSTAT")
    protected String contstat;
    @XmlElement(name = "AUTHSTAT")
    protected String authstat;

    /**
     * Gets the value of the makerid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMAKERID() {
        return makerid;
    }

    /**
     * Sets the value of the makerid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMAKERID(String value) {
        this.makerid = value;
    }

    /**
     * Gets the value of the makerstamp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMAKERSTAMP() {
        return makerstamp;
    }

    /**
     * Sets the value of the makerstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMAKERSTAMP(String value) {
        this.makerstamp = value;
    }

    /**
     * Gets the value of the checkerid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCHECKERID() {
        return checkerid;
    }

    /**
     * Sets the value of the checkerid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCHECKERID(String value) {
        this.checkerid = value;
    }

    /**
     * Gets the value of the checkerstamp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCHECKERSTAMP() {
        return checkerstamp;
    }

    /**
     * Sets the value of the checkerstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCHECKERSTAMP(String value) {
        this.checkerstamp = value;
    }

    /**
     * Gets the value of the contstat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCONTSTAT() {
        return contstat;
    }

    /**
     * Sets the value of the contstat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCONTSTAT(String value) {
        this.contstat = value;
    }

    /**
     * Gets the value of the authstat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAUTHSTAT() {
        return authstat;
    }

    /**
     * Sets the value of the authstat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAUTHSTAT(String value) {
        this.authstat = value;
    }

}
