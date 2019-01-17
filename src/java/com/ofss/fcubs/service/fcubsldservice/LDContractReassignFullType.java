
package com.ofss.fcubs.service.fcubsldservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LDContract-Reassign-Full-Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LDContract-Reassign-Full-Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PRD" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="FCCREF" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CURRENTUSER" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="NEWUSER" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LDContract-Reassign-Full-Type", propOrder = {
    "prd",
    "fccref",
    "currentuser",
    "newuser"
})
public class LDContractReassignFullType {

    @XmlElement(name = "PRD", required = true)
    protected String prd;
    @XmlElement(name = "FCCREF", required = true)
    protected String fccref;
    @XmlElement(name = "CURRENTUSER", required = true)
    protected String currentuser;
    @XmlElement(name = "NEWUSER", required = true)
    protected String newuser;

    /**
     * Gets the value of the prd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRD() {
        return prd;
    }

    /**
     * Sets the value of the prd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRD(String value) {
        this.prd = value;
    }

    /**
     * Gets the value of the fccref property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFCCREF() {
        return fccref;
    }

    /**
     * Sets the value of the fccref property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFCCREF(String value) {
        this.fccref = value;
    }

    /**
     * Gets the value of the currentuser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCURRENTUSER() {
        return currentuser;
    }

    /**
     * Sets the value of the currentuser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCURRENTUSER(String value) {
        this.currentuser = value;
    }

    /**
     * Gets the value of the newuser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNEWUSER() {
        return newuser;
    }

    /**
     * Sets the value of the newuser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNEWUSER(String value) {
        this.newuser = value;
    }

}
