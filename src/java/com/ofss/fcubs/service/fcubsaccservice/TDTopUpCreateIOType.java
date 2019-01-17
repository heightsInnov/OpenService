
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
 * <p>Java class for TDTopUp-Create-IO-Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TDTopUp-Create-IO-Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ACCOUNT_BRANCH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AC_NO" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TOPUP_REF_NO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TOPUP_AMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="VALUEDATE" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="NARRATIVE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TOPUP_DATE" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="EXT_REFERENCE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Tdtopup-Payin" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="FUND_OPT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="AMNT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="OFFSET_ACCOUNT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="PECENT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
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
@XmlType(name = "TDTopUp-Create-IO-Type", propOrder = {
    "accountbranch",
    "acno",
    "topuprefno",
    "topupamt",
    "valuedate",
    "narrative",
    "topupdate",
    "extreference",
    "tdtopupPayin"
})
public class TDTopUpCreateIOType {

    @XmlElement(name = "ACCOUNT_BRANCH")
    protected String accountbranch;
    @XmlElement(name = "AC_NO", required = true)
    protected String acno;
    @XmlElement(name = "TOPUP_REF_NO")
    protected String topuprefno;
    @XmlElement(name = "TOPUP_AMT")
    protected BigDecimal topupamt;
    @XmlElement(name = "VALUEDATE")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar valuedate;
    @XmlElement(name = "NARRATIVE")
    protected String narrative;
    @XmlElement(name = "TOPUP_DATE")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar topupdate;
    @XmlElement(name = "EXT_REFERENCE")
    protected String extreference;
    @XmlElement(name = "Tdtopup-Payin")
    protected List<TDTopUpCreateIOType.TdtopupPayin> tdtopupPayin;

    /**
     * Gets the value of the accountbranch property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACCOUNTBRANCH() {
        return accountbranch;
    }

    /**
     * Sets the value of the accountbranch property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACCOUNTBRANCH(String value) {
        this.accountbranch = value;
    }

    /**
     * Gets the value of the acno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACNO() {
        return acno;
    }

    /**
     * Sets the value of the acno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACNO(String value) {
        this.acno = value;
    }

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
     * {@link TDTopUpCreateIOType.TdtopupPayin }
     * 
     * 
     */
    public List<TDTopUpCreateIOType.TdtopupPayin> getTdtopupPayin() {
        if (tdtopupPayin == null) {
            tdtopupPayin = new ArrayList<TDTopUpCreateIOType.TdtopupPayin>();
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
     *         &lt;element name="OFFSET_ACCOUNT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="PECENT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
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
        "offsetaccount",
        "pecent"
    })
    public static class TdtopupPayin {

        @XmlElement(name = "FUND_OPT")
        protected String fundopt;
        @XmlElement(name = "AMNT")
        protected BigDecimal amnt;
        @XmlElement(name = "OFFSET_ACCOUNT")
        protected String offsetaccount;
        @XmlElement(name = "PECENT")
        protected BigDecimal pecent;

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

    }

}
