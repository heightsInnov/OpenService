
package com.ofss.fcubs.service.fcubsldservice;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ChgLiqType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChgLiqType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ESN" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="CHGCOMP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CHGCCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CHGAMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="LQDSTS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChgLiqType", propOrder = {
    "esn",
    "chgcomp",
    "chgccy",
    "chgamt",
    "lqdsts"
})
public class ChgLiqType {

    @XmlElement(name = "ESN", required = true)
    protected BigInteger esn;
    @XmlElement(name = "CHGCOMP")
    protected String chgcomp;
    @XmlElement(name = "CHGCCY")
    protected String chgccy;
    @XmlElement(name = "CHGAMT")
    protected BigDecimal chgamt;
    @XmlElement(name = "LQDSTS")
    protected String lqdsts;

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
     * Gets the value of the lqdsts property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLQDSTS() {
        return lqdsts;
    }

    /**
     * Sets the value of the lqdsts property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLQDSTS(String value) {
        this.lqdsts = value;
    }

}
