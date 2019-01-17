
package com.ofss.fcubs.service.fcubsldservice;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for FeeAccrualAuditType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FeeAccrualAuditType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ESN" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="MAKERID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MAKERSTAMP" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="CHECKERID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CHECKERSTAMP" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="CONTSTAT" type="{http://fcubs.ofss.com/service/FCUBSLDService}ContStatType" minOccurs="0"/>
 *         &lt;element name="AUTHSTAT" type="{http://fcubs.ofss.com/service/FCUBSLDService}AuthStatType" minOccurs="0"/>
 *         &lt;element name="REVR_MAKERID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="REVR_MAKERSTAMP" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="REVR_CHECKERID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="REVR_CHECKERSTAMP" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FeeAccrualAuditType", propOrder = {
    "esn",
    "makerid",
    "makerstamp",
    "checkerid",
    "checkerstamp",
    "contstat",
    "authstat",
    "revrmakerid",
    "revrmakerstamp",
    "revrcheckerid",
    "revrcheckerstamp"
})
public class FeeAccrualAuditType {

    @XmlElement(name = "ESN")
    protected BigInteger esn;
    @XmlElement(name = "MAKERID")
    protected String makerid;
    @XmlElement(name = "MAKERSTAMP")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar makerstamp;
    @XmlElement(name = "CHECKERID")
    protected String checkerid;
    @XmlElement(name = "CHECKERSTAMP")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar checkerstamp;
    @XmlElement(name = "CONTSTAT")
    @XmlSchemaType(name = "string")
    protected ContStatType contstat;
    @XmlElement(name = "AUTHSTAT")
    @XmlSchemaType(name = "string")
    protected AuthStatType authstat;
    @XmlElement(name = "REVR_MAKERID")
    protected String revrmakerid;
    @XmlElement(name = "REVR_MAKERSTAMP")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar revrmakerstamp;
    @XmlElement(name = "REVR_CHECKERID")
    protected String revrcheckerid;
    @XmlElement(name = "REVR_CHECKERSTAMP")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar revrcheckerstamp;

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
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMAKERSTAMP() {
        return makerstamp;
    }

    /**
     * Sets the value of the makerstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMAKERSTAMP(XMLGregorianCalendar value) {
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
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCHECKERSTAMP() {
        return checkerstamp;
    }

    /**
     * Sets the value of the checkerstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCHECKERSTAMP(XMLGregorianCalendar value) {
        this.checkerstamp = value;
    }

    /**
     * Gets the value of the contstat property.
     * 
     * @return
     *     possible object is
     *     {@link ContStatType }
     *     
     */
    public ContStatType getCONTSTAT() {
        return contstat;
    }

    /**
     * Sets the value of the contstat property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContStatType }
     *     
     */
    public void setCONTSTAT(ContStatType value) {
        this.contstat = value;
    }

    /**
     * Gets the value of the authstat property.
     * 
     * @return
     *     possible object is
     *     {@link AuthStatType }
     *     
     */
    public AuthStatType getAUTHSTAT() {
        return authstat;
    }

    /**
     * Sets the value of the authstat property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthStatType }
     *     
     */
    public void setAUTHSTAT(AuthStatType value) {
        this.authstat = value;
    }

    /**
     * Gets the value of the revrmakerid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getREVRMAKERID() {
        return revrmakerid;
    }

    /**
     * Sets the value of the revrmakerid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setREVRMAKERID(String value) {
        this.revrmakerid = value;
    }

    /**
     * Gets the value of the revrmakerstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getREVRMAKERSTAMP() {
        return revrmakerstamp;
    }

    /**
     * Sets the value of the revrmakerstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setREVRMAKERSTAMP(XMLGregorianCalendar value) {
        this.revrmakerstamp = value;
    }

    /**
     * Gets the value of the revrcheckerid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getREVRCHECKERID() {
        return revrcheckerid;
    }

    /**
     * Sets the value of the revrcheckerid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setREVRCHECKERID(String value) {
        this.revrcheckerid = value;
    }

    /**
     * Gets the value of the revrcheckerstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getREVRCHECKERSTAMP() {
        return revrcheckerstamp;
    }

    /**
     * Sets the value of the revrcheckerstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setREVRCHECKERSTAMP(XMLGregorianCalendar value) {
        this.revrcheckerstamp = value;
    }

}
