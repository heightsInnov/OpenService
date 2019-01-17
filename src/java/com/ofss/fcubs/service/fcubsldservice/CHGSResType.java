
package com.ofss.fcubs.service.fcubsldservice;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for CHGSResType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CHGSResType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CHGCOMP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CHGDESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CHGAMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="CHGCCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CHGRATE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="VALDT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="TRNDT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="STATUS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DISACR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WAIVER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CHGSResType", propOrder = {
    "chgcomp",
    "chgdesc",
    "chgamt",
    "chgccy",
    "chgrate",
    "valdt",
    "trndt",
    "status",
    "disacr",
    "waiver"
})
public class CHGSResType {

    @XmlElement(name = "CHGCOMP")
    protected String chgcomp;
    @XmlElement(name = "CHGDESC")
    protected String chgdesc;
    @XmlElement(name = "CHGAMT")
    protected BigDecimal chgamt;
    @XmlElement(name = "CHGCCY")
    protected String chgccy;
    @XmlElement(name = "CHGRATE")
    protected BigDecimal chgrate;
    @XmlElement(name = "VALDT")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar valdt;
    @XmlElement(name = "TRNDT")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar trndt;
    @XmlElement(name = "STATUS")
    protected String status;
    @XmlElement(name = "DISACR")
    protected String disacr;
    @XmlElement(name = "WAIVER")
    protected String waiver;

    /**
     * Gets the value of the chgcomp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCHGCOMP() {
        return chgcomp;
    }

    /**
     * Sets the value of the chgcomp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCHGCOMP(String value) {
        this.chgcomp = value;
    }

    /**
     * Gets the value of the chgdesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCHGDESC() {
        return chgdesc;
    }

    /**
     * Sets the value of the chgdesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCHGDESC(String value) {
        this.chgdesc = value;
    }

    /**
     * Gets the value of the chgamt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCHGAMT() {
        return chgamt;
    }

    /**
     * Sets the value of the chgamt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCHGAMT(BigDecimal value) {
        this.chgamt = value;
    }

    /**
     * Gets the value of the chgccy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCHGCCY() {
        return chgccy;
    }

    /**
     * Sets the value of the chgccy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCHGCCY(String value) {
        this.chgccy = value;
    }

    /**
     * Gets the value of the chgrate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCHGRATE() {
        return chgrate;
    }

    /**
     * Sets the value of the chgrate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCHGRATE(BigDecimal value) {
        this.chgrate = value;
    }

    /**
     * Gets the value of the valdt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getVALDT() {
        return valdt;
    }

    /**
     * Sets the value of the valdt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setVALDT(XMLGregorianCalendar value) {
        this.valdt = value;
    }

    /**
     * Gets the value of the trndt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTRNDT() {
        return trndt;
    }

    /**
     * Sets the value of the trndt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTRNDT(XMLGregorianCalendar value) {
        this.trndt = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTATUS() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSTATUS(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the disacr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDISACR() {
        return disacr;
    }

    /**
     * Sets the value of the disacr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDISACR(String value) {
        this.disacr = value;
    }

    /**
     * Gets the value of the waiver property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWAIVER() {
        return waiver;
    }

    /**
     * Sets the value of the waiver property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWAIVER(String value) {
        this.waiver = value;
    }

}
