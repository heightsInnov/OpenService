
package com.ofss.fcubs.service.fcubsaccservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ChqArchival-Delete-IO-Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChqArchival-Delete-IO-Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ARCHIVAL_REF_NO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChqArchival-Delete-IO-Type", propOrder = {
    "archivalrefno"
})
public class ChqArchivalDeleteIOType {

    @XmlElement(name = "ARCHIVAL_REF_NO")
    protected String archivalrefno;

    /**
     * Gets the value of the archivalrefno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getARCHIVALREFNO() {
        return archivalrefno;
    }

    /**
     * Sets the value of the archivalrefno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setARCHIVALREFNO(String value) {
        this.archivalrefno = value;
    }

}
