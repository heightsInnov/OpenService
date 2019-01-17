
package com.ofss.fcubs.service.fcubscustomerservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Custmis-Authorize-IO-Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Custmis-Authorize-IO-Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CUSTNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Customermis" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="MISCD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Compositemis" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="MISCD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Custmis-Authorize-IO-Type", propOrder = {
    "custno",
    "customermis",
    "compositemis"
})
public class CustmisAuthorizeIOType {

    @XmlElement(name = "CUSTNO")
    protected String custno;
    @XmlElement(name = "Customermis")
    protected List<CustmisAuthorizeIOType.Customermis> customermis;
    @XmlElement(name = "Compositemis")
    protected List<CustmisAuthorizeIOType.Compositemis> compositemis;

    /**
     * Gets the value of the custno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCUSTNO() {
        return custno;
    }

    /**
     * Sets the value of the custno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCUSTNO(String value) {
        this.custno = value;
    }

    /**
     * Gets the value of the customermis property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the customermis property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustomermis().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustmisAuthorizeIOType.Customermis }
     * 
     * 
     */
    public List<CustmisAuthorizeIOType.Customermis> getCustomermis() {
        if (customermis == null) {
            customermis = new ArrayList<CustmisAuthorizeIOType.Customermis>();
        }
        return this.customermis;
    }

    /**
     * Gets the value of the compositemis property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the compositemis property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCompositemis().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustmisAuthorizeIOType.Compositemis }
     * 
     * 
     */
    public List<CustmisAuthorizeIOType.Compositemis> getCompositemis() {
        if (compositemis == null) {
            compositemis = new ArrayList<CustmisAuthorizeIOType.Compositemis>();
        }
        return this.compositemis;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="MISCD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "miscd"
    })
    public static class Compositemis {

        @XmlElement(name = "MISCD")
        protected String miscd;

        /**
         * Gets the value of the miscd property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMISCD() {
            return miscd;
        }

        /**
         * Sets the value of the miscd property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMISCD(String value) {
            this.miscd = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="MISCD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "miscd"
    })
    public static class Customermis {

        @XmlElement(name = "MISCD")
        protected String miscd;

        /**
         * Gets the value of the miscd property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMISCD() {
            return miscd;
        }

        /**
         * Sets the value of the miscd property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMISCD(String value) {
            this.miscd = value;
        }

    }

}
