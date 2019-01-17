
package com.ofss.fcubs.service.fcubsldservice;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ChangeLog-Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChangeLog-Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CHGSN" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="DTCHANGED" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FLDCHANGED" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FLDDESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OLDVAL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OLDDISPVAL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NEWVAL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NEWDISPVAL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChangeLog-Type", propOrder = {
    "chgsn",
    "dtchanged",
    "fldchanged",
    "flddesc",
    "oldval",
    "olddispval",
    "newval",
    "newdispval"
})
public class ChangeLogType {

    @XmlElement(name = "CHGSN")
    protected BigDecimal chgsn;
    @XmlElement(name = "DTCHANGED")
    protected String dtchanged;
    @XmlElement(name = "FLDCHANGED")
    protected String fldchanged;
    @XmlElement(name = "FLDDESC")
    protected String flddesc;
    @XmlElement(name = "OLDVAL")
    protected String oldval;
    @XmlElement(name = "OLDDISPVAL")
    protected String olddispval;
    @XmlElement(name = "NEWVAL")
    protected String newval;
    @XmlElement(name = "NEWDISPVAL")
    protected String newdispval;

    /**
     * Gets the value of the chgsn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCHGSN() {
        return chgsn;
    }

    /**
     * Sets the value of the chgsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCHGSN(BigDecimal value) {
        this.chgsn = value;
    }

    /**
     * Gets the value of the dtchanged property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDTCHANGED() {
        return dtchanged;
    }

    /**
     * Sets the value of the dtchanged property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDTCHANGED(String value) {
        this.dtchanged = value;
    }

    /**
     * Gets the value of the fldchanged property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFLDCHANGED() {
        return fldchanged;
    }

    /**
     * Sets the value of the fldchanged property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFLDCHANGED(String value) {
        this.fldchanged = value;
    }

    /**
     * Gets the value of the flddesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFLDDESC() {
        return flddesc;
    }

    /**
     * Sets the value of the flddesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFLDDESC(String value) {
        this.flddesc = value;
    }

    /**
     * Gets the value of the oldval property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOLDVAL() {
        return oldval;
    }

    /**
     * Sets the value of the oldval property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOLDVAL(String value) {
        this.oldval = value;
    }

    /**
     * Gets the value of the olddispval property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOLDDISPVAL() {
        return olddispval;
    }

    /**
     * Sets the value of the olddispval property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOLDDISPVAL(String value) {
        this.olddispval = value;
    }

    /**
     * Gets the value of the newval property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNEWVAL() {
        return newval;
    }

    /**
     * Sets the value of the newval property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNEWVAL(String value) {
        this.newval = value;
    }

    /**
     * Gets the value of the newdispval property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNEWDISPVAL() {
        return newdispval;
    }

    /**
     * Sets the value of the newdispval property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNEWDISPVAL(String value) {
        this.newdispval = value;
    }

}
