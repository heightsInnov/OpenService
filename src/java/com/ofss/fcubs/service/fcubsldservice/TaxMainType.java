
package com.ofss.fcubs.service.fcubsldservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TaxMainType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TaxMainType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SCHEME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WAIVER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SCHEMEDESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaxMainType", propOrder = {
    "scheme",
    "waiver",
    "schemedesc"
})
public class TaxMainType {

    @XmlElement(name = "SCHEME")
    protected String scheme;
    @XmlElement(name = "WAIVER")
    protected String waiver;
    @XmlElement(name = "SCHEMEDESC")
    protected String schemedesc;

    /**
     * Gets the value of the scheme property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSCHEME() {
        return scheme;
    }

    /**
     * Sets the value of the scheme property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSCHEME(String value) {
        this.scheme = value;
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
     * Gets the value of the schemedesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSCHEMEDESC() {
        return schemedesc;
    }

    /**
     * Sets the value of the schemedesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSCHEMEDESC(String value) {
        this.schemedesc = value;
    }

}
