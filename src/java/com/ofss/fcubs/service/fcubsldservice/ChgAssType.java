
package com.ofss.fcubs.service.fcubsldservice;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ChgAssType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChgAssType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CHGCOMP" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CRNESN" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="RULE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WAIVER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DISACR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACCREQ" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CHGDESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChgAssType", propOrder = {
    "chgcomp",
    "crnesn",
    "rule",
    "waiver",
    "disacr",
    "accreq",
    "chgdesc"
})
public class ChgAssType {

    @XmlElement(name = "CHGCOMP", required = true)
    protected String chgcomp;
    @XmlElement(name = "CRNESN")
    protected BigInteger crnesn;
    @XmlElement(name = "RULE")
    protected String rule;
    @XmlElement(name = "WAIVER")
    protected String waiver;
    @XmlElement(name = "DISACR")
    protected String disacr;
    @XmlElement(name = "ACCREQ")
    protected String accreq;
    @XmlElement(name = "CHGDESC")
    protected String chgdesc;

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
     * Gets the value of the rule property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRULE() {
        return rule;
    }

    /**
     * Sets the value of the rule property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRULE(String value) {
        this.rule = value;
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
     * Gets the value of the accreq property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACCREQ() {
        return accreq;
    }

    /**
     * Sets the value of the accreq property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACCREQ(String value) {
        this.accreq = value;
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

}
