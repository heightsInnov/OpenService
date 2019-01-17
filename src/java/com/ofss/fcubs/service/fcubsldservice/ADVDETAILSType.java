
package com.ofss.fcubs.service.fcubsldservice;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ADVDETAILSType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ADVDETAILSType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MSGTYPE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PARTYID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MEDIUM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SUPPRESS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PRIORITY" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="CHGREQ" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ADVDETAILSType", propOrder = {
    "msgtype",
    "partyid",
    "medium",
    "suppress",
    "priority",
    "chgreq"
})
public class ADVDETAILSType {

    @XmlElement(name = "MSGTYPE", required = true)
    protected String msgtype;
    @XmlElement(name = "PARTYID")
    protected String partyid;
    @XmlElement(name = "MEDIUM")
    protected String medium;
    @XmlElement(name = "SUPPRESS")
    protected String suppress;
    @XmlElement(name = "PRIORITY")
    protected BigInteger priority;
    @XmlElement(name = "CHGREQ")
    protected String chgreq;

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
     * Gets the value of the partyid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPARTYID() {
        return partyid;
    }

    /**
     * Sets the value of the partyid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPARTYID(String value) {
        this.partyid = value;
    }

    /**
     * Gets the value of the medium property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMEDIUM() {
        return medium;
    }

    /**
     * Sets the value of the medium property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMEDIUM(String value) {
        this.medium = value;
    }

    /**
     * Gets the value of the suppress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSUPPRESS() {
        return suppress;
    }

    /**
     * Sets the value of the suppress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSUPPRESS(String value) {
        this.suppress = value;
    }

    /**
     * Gets the value of the priority property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPRIORITY() {
        return priority;
    }

    /**
     * Sets the value of the priority property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPRIORITY(BigInteger value) {
        this.priority = value;
    }

    /**
     * Gets the value of the chgreq property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCHGREQ() {
        return chgreq;
    }

    /**
     * Sets the value of the chgreq property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCHGREQ(String value) {
        this.chgreq = value;
    }

}
