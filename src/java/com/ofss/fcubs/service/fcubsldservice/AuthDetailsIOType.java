
package com.ofss.fcubs.service.fcubsldservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Auth-Details-IOType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Auth-Details-IOType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="XREF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FCCREF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Rekey-Details" type="{http://fcubs.ofss.com/service/FCUBSLDService}RekeyFldsType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Auth-Details-IOType", propOrder = {
    "xref",
    "fccref",
    "rekeyDetails"
})
public class AuthDetailsIOType {

    @XmlElement(name = "XREF")
    protected String xref;
    @XmlElement(name = "FCCREF")
    protected String fccref;
    @XmlElement(name = "Rekey-Details")
    protected RekeyFldsType rekeyDetails;

    /**
     * Gets the value of the xref property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXREF() {
        return xref;
    }

    /**
     * Sets the value of the xref property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXREF(String value) {
        this.xref = value;
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
     * Gets the value of the rekeyDetails property.
     * 
     * @return
     *     possible object is
     *     {@link RekeyFldsType }
     *     
     */
    public RekeyFldsType getRekeyDetails() {
        return rekeyDetails;
    }

    /**
     * Sets the value of the rekeyDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link RekeyFldsType }
     *     
     */
    public void setRekeyDetails(RekeyFldsType value) {
        this.rekeyDetails = value;
    }

}
