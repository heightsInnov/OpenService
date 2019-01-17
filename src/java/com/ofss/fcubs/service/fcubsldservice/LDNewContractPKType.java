
package com.ofss.fcubs.service.fcubsldservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LD-NewContract-PK-Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LD-NewContract-PK-Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="XrefType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FccrefType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LD-NewContract-PK-Type", propOrder = {
    "xrefType",
    "fccrefType"
})
public class LDNewContractPKType {

    @XmlElement(name = "XrefType")
    protected String xrefType;
    @XmlElement(name = "FccrefType")
    protected String fccrefType;

    /**
     * Gets the value of the xrefType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXrefType() {
        return xrefType;
    }

    /**
     * Sets the value of the xrefType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXrefType(String value) {
        this.xrefType = value;
    }

    /**
     * Gets the value of the fccrefType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFccrefType() {
        return fccrefType;
    }

    /**
     * Sets the value of the fccrefType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFccrefType(String value) {
        this.fccrefType = value;
    }

}
