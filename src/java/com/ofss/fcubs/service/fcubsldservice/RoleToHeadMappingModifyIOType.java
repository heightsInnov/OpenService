
package com.ofss.fcubs.service.fcubsldservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RoleToHeadMapping-Modify-IO-Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RoleToHeadMapping-Modify-IO-Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CLASCD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Mapping-Details" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ACCTRL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ACCTHD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="STAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "RoleToHeadMapping-Modify-IO-Type", propOrder = {
    "clascd",
    "mappingDetails"
})
public class RoleToHeadMappingModifyIOType {

    @XmlElement(name = "CLASCD")
    protected String clascd;
    @XmlElement(name = "Mapping-Details")
    protected List<RoleToHeadMappingModifyIOType.MappingDetails> mappingDetails;

    /**
     * Gets the value of the clascd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCLASCD() {
        return clascd;
    }

    /**
     * Sets the value of the clascd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCLASCD(String value) {
        this.clascd = value;
    }

    /**
     * Gets the value of the mappingDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mappingDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMappingDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RoleToHeadMappingModifyIOType.MappingDetails }
     * 
     * 
     */
    public List<RoleToHeadMappingModifyIOType.MappingDetails> getMappingDetails() {
        if (mappingDetails == null) {
            mappingDetails = new ArrayList<RoleToHeadMappingModifyIOType.MappingDetails>();
        }
        return this.mappingDetails;
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
     *         &lt;element name="ACCTRL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ACCTHD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="STAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "acctrl",
        "accthd",
        "stat"
    })
    public static class MappingDetails {

        @XmlElement(name = "ACCTRL")
        protected String acctrl;
        @XmlElement(name = "ACCTHD")
        protected String accthd;
        @XmlElement(name = "STAT")
        protected String stat;

        /**
         * Gets the value of the acctrl property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getACCTRL() {
            return acctrl;
        }

        /**
         * Sets the value of the acctrl property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setACCTRL(String value) {
            this.acctrl = value;
        }

        /**
         * Gets the value of the accthd property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getACCTHD() {
            return accthd;
        }

        /**
         * Sets the value of the accthd property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setACCTHD(String value) {
            this.accthd = value;
        }

        /**
         * Gets the value of the stat property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSTAT() {
            return stat;
        }

        /**
         * Sets the value of the stat property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSTAT(String value) {
            this.stat = value;
        }

    }

}
