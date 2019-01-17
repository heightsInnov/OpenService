
package com.ofss.fcubs.service.fcubsldservice;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CHGSAppType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CHGSAppType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CHGCOMP" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CRNESN" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="TGCCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TGAMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="CHGCCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CHGAMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="WAIVER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LIQINTR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DISACR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CHGSAppType", propOrder = {
    "chgcomp",
    "crnesn",
    "tgccy",
    "tgamt",
    "chgccy",
    "chgamt",
    "waiver",
    "liqintr",
    "disacr"
})
public class CHGSAppType {

    @XmlElement(name = "CHGCOMP", required = true)
    protected String chgcomp;
    @XmlElement(name = "CRNESN", required = true)
    protected BigInteger crnesn;
    @XmlElement(name = "TGCCY")
    protected String tgccy;
    @XmlElement(name = "TGAMT")
    protected BigDecimal tgamt;
    @XmlElement(name = "CHGCCY")
    protected String chgccy;
    @XmlElement(name = "CHGAMT")
    protected BigDecimal chgamt;
    @XmlElement(name = "WAIVER")
    protected String waiver;
    @XmlElement(name = "LIQINTR")
    protected String liqintr;
    @XmlElement(name = "DISACR")
    protected String disacr;

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
     * Gets the value of the crnesn property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCRNESN() {
        return crnesn;
    }

    /**
     * Sets the value of the crnesn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCRNESN(BigInteger value) {
        this.crnesn = value;
    }

    /**
     * Gets the value of the tgccy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTGCCY() {
        return tgccy;
    }

    /**
     * Sets the value of the tgccy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTGCCY(String value) {
        this.tgccy = value;
    }

    /**
     * Gets the value of the tgamt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTGAMT() {
        return tgamt;
    }

    /**
     * Sets the value of the tgamt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTGAMT(BigDecimal value) {
        this.tgamt = value;
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

    /**
     * Gets the value of the liqintr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLIQINTR() {
        return liqintr;
    }

    /**
     * Sets the value of the liqintr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLIQINTR(String value) {
        this.liqintr = value;
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

}
