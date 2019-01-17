
package com.ofss.fcubs.service.fcubsldservice;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProdEventDtls-Modify-IO-Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProdEventDtls-Modify-IO-Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CLASCD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Event-Details" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="EVNTCD" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Accounting-Entries" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="ACCRLCD" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="AMTTAG" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="DRCRINDICTR" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="TRNCD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="NETINDICTR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="MISHD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="REVALPRGL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="REVALLSGL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="REVALRTCD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="REVALTXNCD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="HOLTREAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="REVALREQD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Advices" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="MSGTYP" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="SUPRS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="PRIOR" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                             &lt;element name="CHGREQD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "ProdEventDtls-Modify-IO-Type", propOrder = {
    "clascd",
    "eventDetails"
})
public class ProdEventDtlsModifyIOType {

    @XmlElement(name = "CLASCD")
    protected String clascd;
    @XmlElement(name = "Event-Details", required = true)
    protected List<ProdEventDtlsModifyIOType.EventDetails> eventDetails;

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
     * Gets the value of the eventDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the eventDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEventDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProdEventDtlsModifyIOType.EventDetails }
     * 
     * 
     */
    public List<ProdEventDtlsModifyIOType.EventDetails> getEventDetails() {
        if (eventDetails == null) {
            eventDetails = new ArrayList<ProdEventDtlsModifyIOType.EventDetails>();
        }
        return this.eventDetails;
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
     *         &lt;element name="EVNTCD" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="Accounting-Entries" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="ACCRLCD" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="AMTTAG" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="DRCRINDICTR" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="TRNCD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="NETINDICTR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="MISHD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="REVALPRGL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="REVALLSGL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="REVALRTCD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="REVALTXNCD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="HOLTREAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="REVALREQD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Advices" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="MSGTYP" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="SUPRS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="PRIOR" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                   &lt;element name="CHGREQD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "evntcd",
        "accountingEntries",
        "advices"
    })
    public static class EventDetails {

        @XmlElement(name = "EVNTCD", required = true)
        protected String evntcd;
        @XmlElement(name = "Accounting-Entries", required = true)
        protected List<ProdEventDtlsModifyIOType.EventDetails.AccountingEntries> accountingEntries;
        @XmlElement(name = "Advices", required = true)
        protected List<ProdEventDtlsModifyIOType.EventDetails.Advices> advices;

        /**
         * Gets the value of the evntcd property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEVNTCD() {
            return evntcd;
        }

        /**
         * Sets the value of the evntcd property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEVNTCD(String value) {
            this.evntcd = value;
        }

        /**
         * Gets the value of the accountingEntries property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the accountingEntries property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAccountingEntries().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ProdEventDtlsModifyIOType.EventDetails.AccountingEntries }
         * 
         * 
         */
        public List<ProdEventDtlsModifyIOType.EventDetails.AccountingEntries> getAccountingEntries() {
            if (accountingEntries == null) {
                accountingEntries = new ArrayList<ProdEventDtlsModifyIOType.EventDetails.AccountingEntries>();
            }
            return this.accountingEntries;
        }

        /**
         * Gets the value of the advices property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the advices property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAdvices().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ProdEventDtlsModifyIOType.EventDetails.Advices }
         * 
         * 
         */
        public List<ProdEventDtlsModifyIOType.EventDetails.Advices> getAdvices() {
            if (advices == null) {
                advices = new ArrayList<ProdEventDtlsModifyIOType.EventDetails.Advices>();
            }
            return this.advices;
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
         *         &lt;element name="ACCRLCD" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="AMTTAG" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="DRCRINDICTR" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="TRNCD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="NETINDICTR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="MISHD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="REVALPRGL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="REVALLSGL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="REVALRTCD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="REVALTXNCD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="HOLTREAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="REVALREQD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "accrlcd",
            "amttag",
            "drcrindictr",
            "trncd",
            "netindictr",
            "mishd",
            "revalprgl",
            "revallsgl",
            "revalrtcd",
            "revaltxncd",
            "holtreat",
            "revalreqd"
        })
        public static class AccountingEntries {

            @XmlElement(name = "ACCRLCD", required = true)
            protected String accrlcd;
            @XmlElement(name = "AMTTAG", required = true)
            protected String amttag;
            @XmlElement(name = "DRCRINDICTR", required = true)
            protected String drcrindictr;
            @XmlElement(name = "TRNCD")
            protected String trncd;
            @XmlElement(name = "NETINDICTR")
            protected String netindictr;
            @XmlElement(name = "MISHD")
            protected String mishd;
            @XmlElement(name = "REVALPRGL")
            protected String revalprgl;
            @XmlElement(name = "REVALLSGL")
            protected String revallsgl;
            @XmlElement(name = "REVALRTCD")
            protected String revalrtcd;
            @XmlElement(name = "REVALTXNCD")
            protected String revaltxncd;
            @XmlElement(name = "HOLTREAT")
            protected String holtreat;
            @XmlElement(name = "REVALREQD")
            protected String revalreqd;

            /**
             * Gets the value of the accrlcd property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getACCRLCD() {
                return accrlcd;
            }

            /**
             * Sets the value of the accrlcd property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setACCRLCD(String value) {
                this.accrlcd = value;
            }

            /**
             * Gets the value of the amttag property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAMTTAG() {
                return amttag;
            }

            /**
             * Sets the value of the amttag property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAMTTAG(String value) {
                this.amttag = value;
            }

            /**
             * Gets the value of the drcrindictr property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDRCRINDICTR() {
                return drcrindictr;
            }

            /**
             * Sets the value of the drcrindictr property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDRCRINDICTR(String value) {
                this.drcrindictr = value;
            }

            /**
             * Gets the value of the trncd property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTRNCD() {
                return trncd;
            }

            /**
             * Sets the value of the trncd property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTRNCD(String value) {
                this.trncd = value;
            }

            /**
             * Gets the value of the netindictr property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNETINDICTR() {
                return netindictr;
            }

            /**
             * Sets the value of the netindictr property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNETINDICTR(String value) {
                this.netindictr = value;
            }

            /**
             * Gets the value of the mishd property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMISHD() {
                return mishd;
            }

            /**
             * Sets the value of the mishd property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMISHD(String value) {
                this.mishd = value;
            }

            /**
             * Gets the value of the revalprgl property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getREVALPRGL() {
                return revalprgl;
            }

            /**
             * Sets the value of the revalprgl property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setREVALPRGL(String value) {
                this.revalprgl = value;
            }

            /**
             * Gets the value of the revallsgl property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getREVALLSGL() {
                return revallsgl;
            }

            /**
             * Sets the value of the revallsgl property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setREVALLSGL(String value) {
                this.revallsgl = value;
            }

            /**
             * Gets the value of the revalrtcd property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getREVALRTCD() {
                return revalrtcd;
            }

            /**
             * Sets the value of the revalrtcd property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setREVALRTCD(String value) {
                this.revalrtcd = value;
            }

            /**
             * Gets the value of the revaltxncd property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getREVALTXNCD() {
                return revaltxncd;
            }

            /**
             * Sets the value of the revaltxncd property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setREVALTXNCD(String value) {
                this.revaltxncd = value;
            }

            /**
             * Gets the value of the holtreat property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getHOLTREAT() {
                return holtreat;
            }

            /**
             * Sets the value of the holtreat property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setHOLTREAT(String value) {
                this.holtreat = value;
            }

            /**
             * Gets the value of the revalreqd property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getREVALREQD() {
                return revalreqd;
            }

            /**
             * Sets the value of the revalreqd property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setREVALREQD(String value) {
                this.revalreqd = value;
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
         *         &lt;element name="MSGTYP" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="SUPRS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="PRIOR" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *         &lt;element name="CHGREQD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "msgtyp",
            "suprs",
            "prior",
            "chgreqd"
        })
        public static class Advices {

            @XmlElement(name = "MSGTYP", required = true)
            protected String msgtyp;
            @XmlElement(name = "SUPRS")
            protected String suprs;
            @XmlElement(name = "PRIOR")
            protected BigDecimal prior;
            @XmlElement(name = "CHGREQD")
            protected String chgreqd;

            /**
             * Gets the value of the msgtyp property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMSGTYP() {
                return msgtyp;
            }

            /**
             * Sets the value of the msgtyp property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMSGTYP(String value) {
                this.msgtyp = value;
            }

            /**
             * Gets the value of the suprs property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSUPRS() {
                return suprs;
            }

            /**
             * Sets the value of the suprs property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSUPRS(String value) {
                this.suprs = value;
            }

            /**
             * Gets the value of the prior property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getPRIOR() {
                return prior;
            }

            /**
             * Sets the value of the prior property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setPRIOR(BigDecimal value) {
                this.prior = value;
            }

            /**
             * Gets the value of the chgreqd property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCHGREQD() {
                return chgreqd;
            }

            /**
             * Sets the value of the chgreqd property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCHGREQD(String value) {
                this.chgreqd = value;
            }

        }

    }

}
