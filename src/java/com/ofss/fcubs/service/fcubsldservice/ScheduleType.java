
package com.ofss.fcubs.service.fcubsldservice;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ScheduleType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ScheduleType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SCOMP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SCHD_TYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FREQ" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FREQ_UNIT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="LCYEQINDLN" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="STDT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="NO_OF_SCHD" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="AMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ScheduleType", propOrder = {
    "scomp",
    "schdtype",
    "freq",
    "frequnit",
    "lcyeqindln",
    "stdt",
    "noofschd",
    "amt"
})
public class ScheduleType {

    @XmlElement(name = "SCOMP")
    protected String scomp;
    @XmlElement(name = "SCHD_TYPE")
    protected String schdtype;
    @XmlElement(name = "FREQ")
    protected String freq;
    @XmlElement(name = "FREQ_UNIT")
    protected BigDecimal frequnit;
    @XmlElement(name = "LCYEQINDLN")
    protected BigDecimal lcyeqindln;
    @XmlElement(name = "STDT")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar stdt;
    @XmlElement(name = "NO_OF_SCHD")
    protected BigDecimal noofschd;
    @XmlElement(name = "AMT")
    protected BigDecimal amt;

    /**
     * Gets the value of the scomp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSCOMP() {
        return scomp;
    }

    /**
     * Sets the value of the scomp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSCOMP(String value) {
        this.scomp = value;
    }

    /**
     * Gets the value of the schdtype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSCHDTYPE() {
        return schdtype;
    }

    /**
     * Sets the value of the schdtype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSCHDTYPE(String value) {
        this.schdtype = value;
    }

    /**
     * Gets the value of the freq property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFREQ() {
        return freq;
    }

    /**
     * Sets the value of the freq property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFREQ(String value) {
        this.freq = value;
    }

    /**
     * Gets the value of the frequnit property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFREQUNIT() {
        return frequnit;
    }

    /**
     * Sets the value of the frequnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFREQUNIT(BigDecimal value) {
        this.frequnit = value;
    }

    /**
     * Gets the value of the lcyeqindln property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLCYEQINDLN() {
        return lcyeqindln;
    }

    /**
     * Sets the value of the lcyeqindln property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLCYEQINDLN(BigDecimal value) {
        this.lcyeqindln = value;
    }

    /**
     * Gets the value of the stdt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSTDT() {
        return stdt;
    }

    /**
     * Sets the value of the stdt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSTDT(XMLGregorianCalendar value) {
        this.stdt = value;
    }

    /**
     * Gets the value of the noofschd property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNOOFSCHD() {
        return noofschd;
    }

    /**
     * Sets the value of the noofschd property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNOOFSCHD(BigDecimal value) {
        this.noofschd = value;
    }

    /**
     * Gets the value of the amt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAMT() {
        return amt;
    }

    /**
     * Sets the value of the amt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAMT(BigDecimal value) {
        this.amt = value;
    }

}
