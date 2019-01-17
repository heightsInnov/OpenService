
package com.ofss.fcubs.service.fcubsldservice;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CHGSReqType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CHGSReqType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CHGCOMP" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="WAIVER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CHGAMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="CHGCCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "CHGSReqType", propOrder = {
    "chgcomp",
    "waiver",
    "chgamt",
    "chgccy",
    "disacr"
})
public class CHGSReqType {

    @XmlElement(name = "CHGCOMP", required = true)
    protected String chgcomp;
    @XmlElement(name = "WAIVER")
    protected String waiver;
    @XmlElement(name = "CHGAMT")
    protected BigDecimal chgamt;
    @XmlElement(name = "CHGCCY")
    protected String chgccy;
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
