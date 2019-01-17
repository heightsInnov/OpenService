
package com.ofss.fcubs.service.fcubsldservice;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for INTBASType4 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="INTBASType4">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="INTCOMP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ROLLOIFROM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RATETYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RATEUSCD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="INTRATE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="INTBASIS" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="RATECD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SPREAD" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="MARGIN" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="AMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ROLSTENOR" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "INTBASType4", propOrder = {
    "intcomp",
    "rolloifrom",
    "ratetype",
    "rateuscd",
    "intrate",
    "intbasis",
    "ratecd",
    "spread",
    "margin",
    "amt",
    "rolstenor"
})
public class INTBASType4 {

    @XmlElement(name = "INTCOMP")
    protected String intcomp;
    @XmlElement(name = "ROLLOIFROM")
    protected String rolloifrom;
    @XmlElement(name = "RATETYPE")
    protected String ratetype;
    @XmlElement(name = "RATEUSCD")
    protected String rateuscd;
    @XmlElement(name = "INTRATE")
    protected BigDecimal intrate;
    @XmlElement(name = "INTBASIS")
    protected BigInteger intbasis;
    @XmlElement(name = "RATECD")
    protected String ratecd;
    @XmlElement(name = "SPREAD")
    protected BigDecimal spread;
    @XmlElement(name = "MARGIN")
    protected BigDecimal margin;
    @XmlElement(name = "AMT")
    protected BigDecimal amt;
    @XmlElement(name = "ROLSTENOR")
    protected BigDecimal rolstenor;

    /**
     * Gets the value of the intcomp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINTCOMP() {
        return intcomp;
    }

    /**
     * Sets the value of the intcomp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINTCOMP(String value) {
        this.intcomp = value;
    }

    /**
     * Gets the value of the rolloifrom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getROLLOIFROM() {
        return rolloifrom;
    }

    /**
     * Sets the value of the rolloifrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setROLLOIFROM(String value) {
        this.rolloifrom = value;
    }

    /**
     * Gets the value of the ratetype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRATETYPE() {
        return ratetype;
    }

    /**
     * Sets the value of the ratetype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRATETYPE(String value) {
        this.ratetype = value;
    }

    /**
     * Gets the value of the rateuscd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRATEUSCD() {
        return rateuscd;
    }

    /**
     * Sets the value of the rateuscd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRATEUSCD(String value) {
        this.rateuscd = value;
    }

    /**
     * Gets the value of the intrate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getINTRATE() {
        return intrate;
    }

    /**
     * Sets the value of the intrate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setINTRATE(BigDecimal value) {
        this.intrate = value;
    }

    /**
     * Gets the value of the intbasis property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getINTBASIS() {
        return intbasis;
    }

    /**
     * Sets the value of the intbasis property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setINTBASIS(BigInteger value) {
        this.intbasis = value;
    }

    /**
     * Gets the value of the ratecd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRATECD() {
        return ratecd;
    }

    /**
     * Sets the value of the ratecd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRATECD(String value) {
        this.ratecd = value;
    }

    /**
     * Gets the value of the spread property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSPREAD() {
        return spread;
    }

    /**
     * Sets the value of the spread property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSPREAD(BigDecimal value) {
        this.spread = value;
    }

    /**
     * Gets the value of the margin property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMARGIN() {
        return margin;
    }

    /**
     * Sets the value of the margin property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMARGIN(BigDecimal value) {
        this.margin = value;
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

    /**
     * Gets the value of the rolstenor property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getROLSTENOR() {
        return rolstenor;
    }

    /**
     * Sets the value of the rolstenor property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setROLSTENOR(BigDecimal value) {
        this.rolstenor = value;
    }

}
