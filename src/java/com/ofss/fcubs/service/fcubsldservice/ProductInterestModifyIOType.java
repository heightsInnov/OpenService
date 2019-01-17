
package com.ofss.fcubs.service.fcubsldservice;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProductInterest-Modify-IO-Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductInterest-Modify-IO-Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Interest-Components" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="BASISAMNTTYP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="BASISAMNTCATG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="RATCDUSGE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="RATTYP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="RATCD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="SETTLMNTCCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="STPAPPLICTION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="RESETTENOR" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="BRWLENDIND" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="LVLNO" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="PREPMTMETD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="PROPREQD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="MARGNBASIS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="MARGNAPPLN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="RATECALCTYP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ACQREQD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="CHNGDRGAMNDMNT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="SHWNINCNTRTMAINSCR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="BLKAMTFLG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="DEPORATECD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="DISCACCRAPP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="UNIT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="NOUNIT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="EVNT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="COMPNENT" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="COMPNENTDESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="RUL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="COLTYP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="EVNTDESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="RULEDESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="Interest-Ccy-Preferences" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="CCY" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="DEFRAT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                             &lt;element name="MINRATE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                             &lt;element name="MAXRAT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                             &lt;element name="DFLTSPRD" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                             &lt;element name="MINSPRD" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                             &lt;element name="MAXSPRD" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                             &lt;element name="INTBASIS" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                             &lt;element name="DENOMBASIS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="BAS366" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="NOOFINTPRD" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                             &lt;element name="PRPMTRT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                             &lt;element name="COMP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
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
@XmlType(name = "ProductInterest-Modify-IO-Type", propOrder = {
    "interestComponents"
})
public class ProductInterestModifyIOType {

    @XmlElement(name = "Interest-Components", required = true)
    protected List<ProductInterestModifyIOType.InterestComponents> interestComponents;

    /**
     * Gets the value of the interestComponents property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the interestComponents property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInterestComponents().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductInterestModifyIOType.InterestComponents }
     * 
     * 
     */
    public List<ProductInterestModifyIOType.InterestComponents> getInterestComponents() {
        if (interestComponents == null) {
            interestComponents = new ArrayList<ProductInterestModifyIOType.InterestComponents>();
        }
        return this.interestComponents;
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
     *         &lt;element name="BASISAMNTTYP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="BASISAMNTCATG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="RATCDUSGE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="RATTYP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="RATCD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="SETTLMNTCCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="STPAPPLICTION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="RESETTENOR" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="BRWLENDIND" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="LVLNO" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="PREPMTMETD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="PROPREQD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="MARGNBASIS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="MARGNAPPLN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="RATECALCTYP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ACQREQD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="CHNGDRGAMNDMNT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="SHWNINCNTRTMAINSCR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="BLKAMTFLG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="DEPORATECD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="DISCACCRAPP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="UNIT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="NOUNIT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="EVNT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="COMPNENT" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="COMPNENTDESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="RUL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="COLTYP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="EVNTDESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="RULEDESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="Interest-Ccy-Preferences" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="CCY" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="DEFRAT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                   &lt;element name="MINRATE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                   &lt;element name="MAXRAT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                   &lt;element name="DFLTSPRD" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                   &lt;element name="MINSPRD" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                   &lt;element name="MAXSPRD" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                   &lt;element name="INTBASIS" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                   &lt;element name="DENOMBASIS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="BAS366" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="NOOFINTPRD" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                   &lt;element name="PRPMTRT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                   &lt;element name="COMP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    @XmlType(name = "", propOrder = {
        "basisamnttyp",
        "basisamntcatg",
        "ratcdusge",
        "rattyp",
        "ratcd",
        "settlmntccy",
        "stpappliction",
        "resettenor",
        "brwlendind",
        "lvlno",
        "prepmtmetd",
        "propreqd",
        "margnbasis",
        "margnappln",
        "ratecalctyp",
        "acqreqd",
        "chngdrgamndmnt",
        "shwnincntrtmainscr",
        "blkamtflg",
        "deporatecd",
        "discaccrapp",
        "unit",
        "nounit",
        "evnt",
        "compnent",
        "compnentdesc",
        "rul",
        "coltyp",
        "evntdesc",
        "ruledesc",
        "interestCcyPreferences"
    })
    public static class InterestComponents {

        @XmlElement(name = "BASISAMNTTYP")
        protected String basisamnttyp;
        @XmlElement(name = "BASISAMNTCATG")
        protected String basisamntcatg;
        @XmlElement(name = "RATCDUSGE")
        protected String ratcdusge;
        @XmlElement(name = "RATTYP")
        protected String rattyp;
        @XmlElement(name = "RATCD")
        protected String ratcd;
        @XmlElement(name = "SETTLMNTCCY")
        protected String settlmntccy;
        @XmlElement(name = "STPAPPLICTION")
        protected String stpappliction;
        @XmlElement(name = "RESETTENOR")
        protected BigDecimal resettenor;
        @XmlElement(name = "BRWLENDIND")
        protected String brwlendind;
        @XmlElement(name = "LVLNO")
        protected BigDecimal lvlno;
        @XmlElement(name = "PREPMTMETD")
        protected String prepmtmetd;
        @XmlElement(name = "PROPREQD")
        protected String propreqd;
        @XmlElement(name = "MARGNBASIS")
        protected String margnbasis;
        @XmlElement(name = "MARGNAPPLN")
        protected String margnappln;
        @XmlElement(name = "RATECALCTYP")
        protected String ratecalctyp;
        @XmlElement(name = "ACQREQD")
        protected String acqreqd;
        @XmlElement(name = "CHNGDRGAMNDMNT")
        protected String chngdrgamndmnt;
        @XmlElement(name = "SHWNINCNTRTMAINSCR")
        protected String shwnincntrtmainscr;
        @XmlElement(name = "BLKAMTFLG")
        protected String blkamtflg;
        @XmlElement(name = "DEPORATECD")
        protected String deporatecd;
        @XmlElement(name = "DISCACCRAPP")
        protected String discaccrapp;
        @XmlElement(name = "UNIT")
        protected String unit;
        @XmlElement(name = "NOUNIT")
        protected BigDecimal nounit;
        @XmlElement(name = "EVNT")
        protected String evnt;
        @XmlElement(name = "COMPNENT", required = true)
        protected String compnent;
        @XmlElement(name = "COMPNENTDESC")
        protected String compnentdesc;
        @XmlElement(name = "RUL")
        protected String rul;
        @XmlElement(name = "COLTYP")
        protected String coltyp;
        @XmlElement(name = "EVNTDESC")
        protected String evntdesc;
        @XmlElement(name = "RULEDESC")
        protected String ruledesc;
        @XmlElement(name = "Interest-Ccy-Preferences", required = true)
        protected List<ProductInterestModifyIOType.InterestComponents.InterestCcyPreferences> interestCcyPreferences;

        /**
         * Gets the value of the basisamnttyp property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBASISAMNTTYP() {
            return basisamnttyp;
        }

        /**
         * Sets the value of the basisamnttyp property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBASISAMNTTYP(String value) {
            this.basisamnttyp = value;
        }

        /**
         * Gets the value of the basisamntcatg property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBASISAMNTCATG() {
            return basisamntcatg;
        }

        /**
         * Sets the value of the basisamntcatg property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBASISAMNTCATG(String value) {
            this.basisamntcatg = value;
        }

        /**
         * Gets the value of the ratcdusge property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRATCDUSGE() {
            return ratcdusge;
        }

        /**
         * Sets the value of the ratcdusge property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRATCDUSGE(String value) {
            this.ratcdusge = value;
        }

        /**
         * Gets the value of the rattyp property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRATTYP() {
            return rattyp;
        }

        /**
         * Sets the value of the rattyp property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRATTYP(String value) {
            this.rattyp = value;
        }

        /**
         * Gets the value of the ratcd property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRATCD() {
            return ratcd;
        }

        /**
         * Sets the value of the ratcd property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRATCD(String value) {
            this.ratcd = value;
        }

        /**
         * Gets the value of the settlmntccy property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSETTLMNTCCY() {
            return settlmntccy;
        }

        /**
         * Sets the value of the settlmntccy property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSETTLMNTCCY(String value) {
            this.settlmntccy = value;
        }

        /**
         * Gets the value of the stpappliction property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSTPAPPLICTION() {
            return stpappliction;
        }

        /**
         * Sets the value of the stpappliction property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSTPAPPLICTION(String value) {
            this.stpappliction = value;
        }

        /**
         * Gets the value of the resettenor property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getRESETTENOR() {
            return resettenor;
        }

        /**
         * Sets the value of the resettenor property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setRESETTENOR(BigDecimal value) {
            this.resettenor = value;
        }

        /**
         * Gets the value of the brwlendind property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBRWLENDIND() {
            return brwlendind;
        }

        /**
         * Sets the value of the brwlendind property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBRWLENDIND(String value) {
            this.brwlendind = value;
        }

        /**
         * Gets the value of the lvlno property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getLVLNO() {
            return lvlno;
        }

        /**
         * Sets the value of the lvlno property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setLVLNO(BigDecimal value) {
            this.lvlno = value;
        }

        /**
         * Gets the value of the prepmtmetd property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPREPMTMETD() {
            return prepmtmetd;
        }

        /**
         * Sets the value of the prepmtmetd property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPREPMTMETD(String value) {
            this.prepmtmetd = value;
        }

        /**
         * Gets the value of the propreqd property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPROPREQD() {
            return propreqd;
        }

        /**
         * Sets the value of the propreqd property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPROPREQD(String value) {
            this.propreqd = value;
        }

        /**
         * Gets the value of the margnbasis property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMARGNBASIS() {
            return margnbasis;
        }

        /**
         * Sets the value of the margnbasis property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMARGNBASIS(String value) {
            this.margnbasis = value;
        }

        /**
         * Gets the value of the margnappln property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMARGNAPPLN() {
            return margnappln;
        }

        /**
         * Sets the value of the margnappln property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMARGNAPPLN(String value) {
            this.margnappln = value;
        }

        /**
         * Gets the value of the ratecalctyp property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRATECALCTYP() {
            return ratecalctyp;
        }

        /**
         * Sets the value of the ratecalctyp property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRATECALCTYP(String value) {
            this.ratecalctyp = value;
        }

        /**
         * Gets the value of the acqreqd property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getACQREQD() {
            return acqreqd;
        }

        /**
         * Sets the value of the acqreqd property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setACQREQD(String value) {
            this.acqreqd = value;
        }

        /**
         * Gets the value of the chngdrgamndmnt property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCHNGDRGAMNDMNT() {
            return chngdrgamndmnt;
        }

        /**
         * Sets the value of the chngdrgamndmnt property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCHNGDRGAMNDMNT(String value) {
            this.chngdrgamndmnt = value;
        }

        /**
         * Gets the value of the shwnincntrtmainscr property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSHWNINCNTRTMAINSCR() {
            return shwnincntrtmainscr;
        }

        /**
         * Sets the value of the shwnincntrtmainscr property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSHWNINCNTRTMAINSCR(String value) {
            this.shwnincntrtmainscr = value;
        }

        /**
         * Gets the value of the blkamtflg property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBLKAMTFLG() {
            return blkamtflg;
        }

        /**
         * Sets the value of the blkamtflg property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBLKAMTFLG(String value) {
            this.blkamtflg = value;
        }

        /**
         * Gets the value of the deporatecd property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDEPORATECD() {
            return deporatecd;
        }

        /**
         * Sets the value of the deporatecd property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDEPORATECD(String value) {
            this.deporatecd = value;
        }

        /**
         * Gets the value of the discaccrapp property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDISCACCRAPP() {
            return discaccrapp;
        }

        /**
         * Sets the value of the discaccrapp property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDISCACCRAPP(String value) {
            this.discaccrapp = value;
        }

        /**
         * Gets the value of the unit property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUNIT() {
            return unit;
        }

        /**
         * Sets the value of the unit property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUNIT(String value) {
            this.unit = value;
        }

        /**
         * Gets the value of the nounit property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getNOUNIT() {
            return nounit;
        }

        /**
         * Sets the value of the nounit property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setNOUNIT(BigDecimal value) {
            this.nounit = value;
        }

        /**
         * Gets the value of the evnt property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEVNT() {
            return evnt;
        }

        /**
         * Sets the value of the evnt property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEVNT(String value) {
            this.evnt = value;
        }

        /**
         * Gets the value of the compnent property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCOMPNENT() {
            return compnent;
        }

        /**
         * Sets the value of the compnent property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCOMPNENT(String value) {
            this.compnent = value;
        }

        /**
         * Gets the value of the compnentdesc property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCOMPNENTDESC() {
            return compnentdesc;
        }

        /**
         * Sets the value of the compnentdesc property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCOMPNENTDESC(String value) {
            this.compnentdesc = value;
        }

        /**
         * Gets the value of the rul property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRUL() {
            return rul;
        }

        /**
         * Sets the value of the rul property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRUL(String value) {
            this.rul = value;
        }

        /**
         * Gets the value of the coltyp property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCOLTYP() {
            return coltyp;
        }

        /**
         * Sets the value of the coltyp property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCOLTYP(String value) {
            this.coltyp = value;
        }

        /**
         * Gets the value of the evntdesc property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEVNTDESC() {
            return evntdesc;
        }

        /**
         * Sets the value of the evntdesc property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEVNTDESC(String value) {
            this.evntdesc = value;
        }

        /**
         * Gets the value of the ruledesc property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRULEDESC() {
            return ruledesc;
        }

        /**
         * Sets the value of the ruledesc property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRULEDESC(String value) {
            this.ruledesc = value;
        }

        /**
         * Gets the value of the interestCcyPreferences property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the interestCcyPreferences property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getInterestCcyPreferences().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ProductInterestModifyIOType.InterestComponents.InterestCcyPreferences }
         * 
         * 
         */
        public List<ProductInterestModifyIOType.InterestComponents.InterestCcyPreferences> getInterestCcyPreferences() {
            if (interestCcyPreferences == null) {
                interestCcyPreferences = new ArrayList<ProductInterestModifyIOType.InterestComponents.InterestCcyPreferences>();
            }
            return this.interestCcyPreferences;
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
         *         &lt;element name="CCY" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="DEFRAT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *         &lt;element name="MINRATE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *         &lt;element name="MAXRAT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *         &lt;element name="DFLTSPRD" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *         &lt;element name="MINSPRD" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *         &lt;element name="MAXSPRD" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *         &lt;element name="INTBASIS" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *         &lt;element name="DENOMBASIS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="BAS366" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="NOOFINTPRD" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *         &lt;element name="PRPMTRT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *         &lt;element name="COMP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "ccy",
            "defrat",
            "minrate",
            "maxrat",
            "dfltsprd",
            "minsprd",
            "maxsprd",
            "intbasis",
            "denombasis",
            "bas366",
            "noofintprd",
            "prpmtrt",
            "comp"
        })
        public static class InterestCcyPreferences {

            @XmlElement(name = "CCY", required = true)
            protected String ccy;
            @XmlElement(name = "DEFRAT")
            protected BigDecimal defrat;
            @XmlElement(name = "MINRATE")
            protected BigDecimal minrate;
            @XmlElement(name = "MAXRAT")
            protected BigDecimal maxrat;
            @XmlElement(name = "DFLTSPRD")
            protected BigDecimal dfltsprd;
            @XmlElement(name = "MINSPRD")
            protected BigDecimal minsprd;
            @XmlElement(name = "MAXSPRD")
            protected BigDecimal maxsprd;
            @XmlElement(name = "INTBASIS")
            protected BigDecimal intbasis;
            @XmlElement(name = "DENOMBASIS")
            protected String denombasis;
            @XmlElement(name = "BAS366")
            protected String bas366;
            @XmlElement(name = "NOOFINTPRD")
            protected BigDecimal noofintprd;
            @XmlElement(name = "PRPMTRT")
            protected BigDecimal prpmtrt;
            @XmlElement(name = "COMP")
            protected String comp;

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
             * Gets the value of the defrat property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getDEFRAT() {
                return defrat;
            }

            /**
             * Sets the value of the defrat property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setDEFRAT(BigDecimal value) {
                this.defrat = value;
            }

            /**
             * Gets the value of the minrate property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getMINRATE() {
                return minrate;
            }

            /**
             * Sets the value of the minrate property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setMINRATE(BigDecimal value) {
                this.minrate = value;
            }

            /**
             * Gets the value of the maxrat property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getMAXRAT() {
                return maxrat;
            }

            /**
             * Sets the value of the maxrat property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setMAXRAT(BigDecimal value) {
                this.maxrat = value;
            }

            /**
             * Gets the value of the dfltsprd property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getDFLTSPRD() {
                return dfltsprd;
            }

            /**
             * Sets the value of the dfltsprd property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setDFLTSPRD(BigDecimal value) {
                this.dfltsprd = value;
            }

            /**
             * Gets the value of the minsprd property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getMINSPRD() {
                return minsprd;
            }

            /**
             * Sets the value of the minsprd property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setMINSPRD(BigDecimal value) {
                this.minsprd = value;
            }

            /**
             * Gets the value of the maxsprd property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getMAXSPRD() {
                return maxsprd;
            }

            /**
             * Sets the value of the maxsprd property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setMAXSPRD(BigDecimal value) {
                this.maxsprd = value;
            }

            /**
             * Gets the value of the intbasis property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getINTBASIS() {
                return intbasis;
            }

            /**
             * Sets the value of the intbasis property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setINTBASIS(BigDecimal value) {
                this.intbasis = value;
            }

            /**
             * Gets the value of the denombasis property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDENOMBASIS() {
                return denombasis;
            }

            /**
             * Sets the value of the denombasis property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDENOMBASIS(String value) {
                this.denombasis = value;
            }

            /**
             * Gets the value of the bas366 property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBAS366() {
                return bas366;
            }

            /**
             * Sets the value of the bas366 property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBAS366(String value) {
                this.bas366 = value;
            }

            /**
             * Gets the value of the noofintprd property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getNOOFINTPRD() {
                return noofintprd;
            }

            /**
             * Sets the value of the noofintprd property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setNOOFINTPRD(BigDecimal value) {
                this.noofintprd = value;
            }

            /**
             * Gets the value of the prpmtrt property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getPRPMTRT() {
                return prpmtrt;
            }

            /**
             * Sets the value of the prpmtrt property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setPRPMTRT(BigDecimal value) {
                this.prpmtrt = value;
            }

            /**
             * Gets the value of the comp property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCOMP() {
                return comp;
            }

            /**
             * Sets the value of the comp property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCOMP(String value) {
                this.comp = value;
            }

        }

    }

}
