
package com.ofss.fcubs.service.fcubsldservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BrnPrmDtls-Query-IO-Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BrnPrmDtls-Query-IO-Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BRNCD" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BrnPrmDtls-Query-IO-Type", propOrder = {
    "brncd"
})
public class BrnPrmDtlsQueryIOType {

    @XmlElement(name = "BRNCD", required = true)
    protected String brncd;

    /**
     * Gets the value of the brncd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBRNCD() {
        return brncd;
    }

    /**
     * Sets the value of the brncd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBRNCD(String value) {
        this.brncd = value;
    }

}
