
package com.ofss.fcubs.service.fcubsldservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LISTHOLCCYType10 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LISTHOLCCYType10">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CCYDESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LISTHOLCCYType10", propOrder = {
    "ccy",
    "ccydesc"
})
public class LISTHOLCCYType10 {

    @XmlElement(name = "CCY")
    protected String ccy;
    @XmlElement(name = "CCYDESC")
    protected String ccydesc;

    /**
     * Gets the value of the ccy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCCY() {
        return ccy;
    }

    /**
     * Sets the value of the ccy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCCY(String value) {
        this.ccy = value;
    }

    /**
     * Gets the value of the ccydesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCCYDESC() {
        return ccydesc;
    }

    /**
     * Sets the value of the ccydesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCCYDESC(String value) {
        this.ccydesc = value;
    }

}
