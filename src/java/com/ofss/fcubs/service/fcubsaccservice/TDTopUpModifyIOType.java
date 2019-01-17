
package com.ofss.fcubs.service.fcubsaccservice;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for TDTopUp-Modify-IO-Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TDTopUp-Modify-IO-Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TOPUP_REF_NO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TOPUP_AMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="VALUEDATE" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="MATURITY_AMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="INTEREST_RATE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="NARRATIVE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TOPUP_DATE" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="TD_OPEN_DATE" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="TDAMT_BEFORE_TOPUP" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="TDAMT_AFTER_TOPUP" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="MATAMT_AFTER_TOPUP" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="INT_RATE_OPTION" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="EXT_REFERENCE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MAKER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MAKERSTAMP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Tdtopup-Payin" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="FUND_OPT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="AMNT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="OFFSET_BRN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="OFFSET_ACCOUNT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="PECENT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="SEQNO" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
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
@XmlType(name = "TDTopUp-Modify-IO-Type", propOrder = {
    "topuprefno",
    "topupamt",
    "valuedate",
    "maturityamt",
    "interestrate",
    "narrative",
    "topupdate",
    "tdopendate",
    "tdamtbeforetopup",
    "tdamtaftertopup",
    "matamtaftertopup",
    "intrateoption",
    "extreference",
    "maker",
    "makerstamp",
    "tdtopupPayin"
})
public class TDTopUpModifyIOType {

    @XmlElement(name = "TOPUP_REF_NO")
    protected String topuprefno;
    @XmlElement(name = "TOPUP_AMT")
    protected BigDecimal topupamt;
    @XmlElement(name = "VALUEDATE")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar valuedate;
    @XmlElement(name = "MATURITY_AMT")
    protected BigDecimal maturityamt;
    @XmlElement(name = "INTEREST_RATE")
    protected BigDecimal interestrate;
    @XmlElement(name = "NARRATIVE")
    protected String narrative;
    @XmlElement(name = "TOPUP_DATE")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar topupdate;
    @XmlElement(name = "TD_OPEN_DATE")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar tdopendate;
    @XmlElement(name = "TDAMT_BEFORE_TOPUP")
    protected BigDecimal tdamtbeforetopup;
    @XmlElement(name = "TDAMT_AFTER_TOPUP")
    protected BigDecimal tdamtaftertopup;
    @XmlElement(name = "MATAMT_AFTER_TOPUP")
    protected BigDecimal matamtaftertopup;
    @XmlElement(name = "INT_RATE_OPTION")
    protected BigDecimal intrateoption;
    @XmlElement(name = "EXT_REFERENCE")
    protected String extreference;
    @XmlElement(name = "MAKER")
    protected String maker;
    @XmlElement(name = "MAKERSTAMP")
    protected String makerstamp;
    @XmlElement(name = "Tdtopup-Payin")
    protected List<TDTopUpModifyIOType.TdtopupPayin> tdtopupPayin;

    /**
     * Gets the value of the topuprefno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTOPUPREFNO() {
        return topuprefno;
    }

    /**
     * Sets the value of the topuprefno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTOPUPREFNO(String value) {
        this.topuprefno = value;
    }

    /**
     * Gets the value of the topupamt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTOPUPAMT() {
        return topupamt;
    }

    /**
     * Sets the value of the topupamt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTOPUPAMT(BigDecimal value) {
        this.topupamt = value;
    }

    /**
     * Gets the value of the valuedate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getVALUEDATE() {
        return valuedate;
    }

    /**
     * Sets the value of the valuedate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setVALUEDATE(XMLGregorianCalendar value) {
        this.valuedate = value;
    }

    /**
     * Gets the value of the maturityamt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMATURITYAMT() {
        return maturityamt;
    }

    /**
     * Sets the value of the maturityamt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMATURITYAMT(BigDecimal value) {
        this.maturityamt = value;
    }

    /**
     * Gets the value of the interestrate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getINTERESTRATE() {
        return interestrate;
    }

    /**
     * Sets the value of the interestrate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setINTERESTRATE(BigDecimal value) {
        this.interestrate = value;
    }

    /**
     * Gets the value of the narrative property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNARRATIVE() {
        return narrative;
    }

    /**
     * Sets the value of the narrative property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNARRATIVE(String value) {
        this.narrative = value;
    }

    /**
     * Gets the value of the topupdate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTOPUPDATE() {
        return topupdate;
    }

    /**
     * Sets the value of the topupdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTOPUPDATE(XMLGregorianCalendar value) {
        this.topupdate = value;
    }

    /**
     * Gets the value of the tdopendate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTDOPENDATE() {
        return tdopendate;
    }

    /**
     * Sets the value of the tdopendate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTDOPENDATE(XMLGregorianCalendar value) {
        this.tdopendate = value;
    }

    /**
     * Gets the value of the tdamtbeforetopup property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTDAMTBEFORETOPUP() {
        return tdamtbeforetopup;
    }

    /**
     * Sets the value of the tdamtbeforetopup property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTDAMTBEFORETOPUP(BigDecimal value) {
        this.tdamtbeforetopup = value;
    }

    /**
     * Gets the value of the tdamtaftertopup property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTDAMTAFTERTOPUP() {
        return tdamtaftertopup;
    }

    /**
     * Sets the value of the tdamtaftertopup property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTDAMTAFTERTOPUP(BigDecimal value) {
        this.tdamtaftertopup = value;
    }

    /**
     * Gets the value of the matamtaftertopup property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMATAMTAFTERTOPUP() {
        return matamtaftertopup;
    }

    /**
     * Sets the value of the matamtaftertopup property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMATAMTAFTERTOPUP(BigDecimal value) {
        this.matamtaftertopup = value;
    }

    /**
     * Gets the value of the intrateoption property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getINTRATEOPTION() {
        return intrateoption;
    }

    /**
     * Sets the value of the intrateoption property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setINTRATEOPTION(BigDecimal value) {
        this.intrateoption = value;
    }

    /**
     * Gets the value of the extreference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXTREFERENCE() {
        return extreference;
    }

    /**
     * Sets the value of the extreference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXTREFERENCE(String value) {
        this.extreference = value;
    }

    /**
     * Gets the value of the maker property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMAKER() {
        return maker;
    }

    /**
     * Sets the value of the maker property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMAKER(String value) {
        this.maker = value;
    }

    /**
     * Gets the value of the makerstamp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMAKERSTAMP() {
        return makerstamp;
    }

    /**
     * Sets the value of the makerstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMAKERSTAMP(String value) {
        this.makerstamp = value;
    }

    /**
     * Gets the value of the tdtopupPayin property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tdtopupPayin property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTdtopupPayin().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TDTopUpModifyIOType.TdtopupPayin }
     * 
     * 
     */
    public List<TDTopUpModifyIOType.TdtopupPayin> getTdtopupPayin() {
        if (tdtopupPayin == null) {
            tdtopupPayin = new ArrayList<TDTopUpModifyIOType.TdtopupPayin>();
        }
        return this.tdtopupPayin;
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
     *         &lt;element name="FUND_OPT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="AMNT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="OFFSET_BRN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="OFFSET_ACCOUNT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="PECENT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="SEQNO" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
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
        "fundopt",
        "amnt",
        "offsetbrn",
        "offsetaccount",
        "pecent",
        "seqno"
    })
    public static class TdtopupPayin {

        @XmlElement(name = "FUND_OPT")
        protected String fundopt;
        @XmlElement(name = "AMNT")
        protected BigDecimal amnt;
        @XmlElement(name = "OFFSET_BRN")
        protected String offsetbrn;
        @XmlElement(name = "OFFSET_ACCOUNT")
        protected String offsetaccount;
        @XmlElement(name = "PECENT")
        protected BigDecimal pecent;
        @XmlElement(name = "SEQNO")
        protected BigDecimal seqno;

        /**
         * Gets the value of the fundopt property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFUNDOPT() {
            return fundopt;
        }

        /**
         * Sets the value of the fundopt property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFUNDOPT(String value) {
            this.fundopt = value;
        }

        /**
         * Gets the value of the amnt property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getAMNT() {
            return amnt;
        }

        /**
         * Sets the value of the amnt property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setAMNT(BigDecimal value) {
            this.amnt = value;
        }

        /**
         * Gets the value of the offsetbrn property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOFFSETBRN() {
            return offsetbrn;
        }

        /**
         * Sets the value of the offsetbrn property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOFFSETBRN(String value) {
            this.offsetbrn = value;
        }

        /**
         * Gets the value of the offsetaccount property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOFFSETACCOUNT() {
            return offsetaccount;
        }

        /**
         * Sets the value of the offsetaccount property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOFFSETACCOUNT(String value) {
            this.offsetaccount = value;
        }

        /**
         * Gets the value of the pecent property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getPECENT() {
            return pecent;
        }

        /**
         * Sets the value of the pecent property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setPECENT(BigDecimal value) {
            this.pecent = value;
        }

        /**
         * Gets the value of the seqno property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getSEQNO() {
            return seqno;
        }

        /**
         * Sets the value of the seqno property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setSEQNO(BigDecimal value) {
            this.seqno = value;
        }

    }

}
