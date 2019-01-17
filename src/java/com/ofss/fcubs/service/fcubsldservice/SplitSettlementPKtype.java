
package com.ofss.fcubs.service.fcubsldservice;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SplitSettlementPKtype complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SplitSettlementPKtype">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AMT" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="BRN" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ACCCY" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ACC" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="EXRATE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SplitSettlementPKtype", propOrder = {
    "amt",
    "brn",
    "acccy",
    "acc",
    "exrate"
})
public class SplitSettlementPKtype {

    @XmlElement(name = "AMT", required = true)
    protected BigDecimal amt;
    @XmlElement(name = "BRN", required = true)
    protected String brn;
    @XmlElement(name = "ACCCY", required = true)
    protected String acccy;
    @XmlElement(name = "ACC", required = true)
    protected String acc;
    @XmlElement(name = "EXRATE")
    protected BigDecimal exrate;

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
     * Gets the value of the brn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBRN() {
        return brn;
    }

    /**
     * Sets the value of the brn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBRN(String value) {
        this.brn = value;
    }

    /**
     * Gets the value of the acccy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACCCY() {
        return acccy;
    }

    /**
     * Sets the value of the acccy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACCCY(String value) {
        this.acccy = value;
    }

    /**
     * Gets the value of the acc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACC() {
        return acc;
    }

    /**
     * Sets the value of the acc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACC(String value) {
        this.acc = value;
    }

    /**
     * Gets the value of the exrate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEXRATE() {
        return exrate;
    }

    /**
     * Sets the value of the exrate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setEXRATE(BigDecimal value) {
        this.exrate = value;
    }

}
