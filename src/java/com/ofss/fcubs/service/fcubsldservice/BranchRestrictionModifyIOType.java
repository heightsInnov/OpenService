
package com.ofss.fcubs.service.fcubsldservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BranchRestriction-Modify-IO-Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BranchRestriction-Modify-IO-Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CCYLST" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BRNLST" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CLASCD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Branch-List" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="BRNDISALOW" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Ccy-List" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="BGTDLCCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="SOLDCCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "BranchRestriction-Modify-IO-Type", propOrder = {
    "ccylst",
    "brnlst",
    "clascd",
    "branchList",
    "ccyList"
})
public class BranchRestrictionModifyIOType {

    @XmlElement(name = "CCYLST")
    protected String ccylst;
    @XmlElement(name = "BRNLST")
    protected String brnlst;
    @XmlElement(name = "CLASCD")
    protected String clascd;
    @XmlElement(name = "Branch-List")
    protected List<BranchRestrictionModifyIOType.BranchList> branchList;
    @XmlElement(name = "Ccy-List")
    protected List<BranchRestrictionModifyIOType.CcyList> ccyList;

    /**
     * Gets the value of the ccylst property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCCYLST() {
        return ccylst;
    }

    /**
     * Sets the value of the ccylst property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCCYLST(String value) {
        this.ccylst = value;
    }

    /**
     * Gets the value of the brnlst property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBRNLST() {
        return brnlst;
    }

    /**
     * Sets the value of the brnlst property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBRNLST(String value) {
        this.brnlst = value;
    }

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
     * Gets the value of the branchList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the branchList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBranchList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BranchRestrictionModifyIOType.BranchList }
     * 
     * 
     */
    public List<BranchRestrictionModifyIOType.BranchList> getBranchList() {
        if (branchList == null) {
            branchList = new ArrayList<BranchRestrictionModifyIOType.BranchList>();
        }
        return this.branchList;
    }

    /**
     * Gets the value of the ccyList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ccyList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCcyList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BranchRestrictionModifyIOType.CcyList }
     * 
     * 
     */
    public List<BranchRestrictionModifyIOType.CcyList> getCcyList() {
        if (ccyList == null) {
            ccyList = new ArrayList<BranchRestrictionModifyIOType.CcyList>();
        }
        return this.ccyList;
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
     *         &lt;element name="BRNDISALOW" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "brndisalow"
    })
    public static class BranchList {

        @XmlElement(name = "BRNDISALOW")
        protected String brndisalow;

        /**
         * Gets the value of the brndisalow property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBRNDISALOW() {
            return brndisalow;
        }

        /**
         * Sets the value of the brndisalow property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBRNDISALOW(String value) {
            this.brndisalow = value;
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
     *         &lt;element name="BGTDLCCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="SOLDCCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "bgtdlccy",
        "soldccy"
    })
    public static class CcyList {

        @XmlElement(name = "BGTDLCCY")
        protected String bgtdlccy;
        @XmlElement(name = "SOLDCCY")
        protected String soldccy;

        /**
         * Gets the value of the bgtdlccy property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBGTDLCCY() {
            return bgtdlccy;
        }

        /**
         * Sets the value of the bgtdlccy property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBGTDLCCY(String value) {
            this.bgtdlccy = value;
        }

        /**
         * Gets the value of the soldccy property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSOLDCCY() {
            return soldccy;
        }

        /**
         * Sets the value of the soldccy property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSOLDCCY(String value) {
            this.soldccy = value;
        }

    }

}
