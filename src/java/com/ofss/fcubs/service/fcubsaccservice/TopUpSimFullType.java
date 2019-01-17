
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
 * <p>Java class for TopUpSim-Full-Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TopUpSim-Full-Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ACBRN1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACCNO1" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ACCCCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TOPUP_REF_NO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TOPUP_AMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="VALUEDATE" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="MATURITY_AMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="INTRTE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="NARRATIVE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACC_DESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TOPUP_DATE" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="TD_OPEN_DATE" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="TENOR_D" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="MONTHS" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="YEARS_SS" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="MATDT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="ACC_BAL" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="TD_BAL_AMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="MATAMT_AFTER_TOPUP" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="INTRATEC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="EXT_REFERENCE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CUSTOMER_NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CUSTMERNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PR_BALANCE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="INTEREST_RATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="INT_PAID_OUT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TAX_COLLECTED" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="INTEREST_EARNINGS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TAX_DEDUCTIONS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="APY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SIMULATION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MAKER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MAKERSTAMP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CHECKER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CHECKERSTAMP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MODNO" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="TXNSTAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AUTHSTAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Int-Payout" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="INTEREST_AMOUNT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="PRNAMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="DATE" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
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
@XmlType(name = "TopUpSim-Full-Type", propOrder = {
    "acbrn1",
    "accno1",
    "accccy",
    "topuprefno",
    "topupamt",
    "valuedate",
    "maturityamt",
    "intrte",
    "narrative",
    "accdesc",
    "topupdate",
    "tdopendate",
    "tenord",
    "months",
    "yearsss",
    "matdt",
    "accbal",
    "tdbalamt",
    "matamtaftertopup",
    "intratec",
    "extreference",
    "customername",
    "custmerno",
    "prbalance",
    "interestrate",
    "intpaidout",
    "taxcollected",
    "interestearnings",
    "taxdeductions",
    "apy",
    "simulation",
    "maker",
    "makerstamp",
    "checker",
    "checkerstamp",
    "modno",
    "txnstat",
    "authstat",
    "tdtopupPayin",
    "intPayout"
})
public class TopUpSimFullType {

    @XmlElement(name = "ACBRN1")
    protected String acbrn1;
    @XmlElement(name = "ACCNO1", required = true)
    protected String accno1;
    @XmlElement(name = "ACCCCY")
    protected String accccy;
    @XmlElement(name = "TOPUP_REF_NO")
    protected String topuprefno;
    @XmlElement(name = "TOPUP_AMT")
    protected BigDecimal topupamt;
    @XmlElement(name = "VALUEDATE")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar valuedate;
    @XmlElement(name = "MATURITY_AMT")
    protected BigDecimal maturityamt;
    @XmlElement(name = "INTRTE")
    protected BigDecimal intrte;
    @XmlElement(name = "NARRATIVE")
    protected String narrative;
    @XmlElement(name = "ACC_DESC")
    protected String accdesc;
    @XmlElement(name = "TOPUP_DATE")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar topupdate;
    @XmlElement(name = "TD_OPEN_DATE")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar tdopendate;
    @XmlElement(name = "TENOR_D")
    protected BigDecimal tenord;
    @XmlElement(name = "MONTHS")
    protected BigDecimal months;
    @XmlElement(name = "YEARS_SS")
    protected BigDecimal yearsss;
    @XmlElement(name = "MATDT")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar matdt;
    @XmlElement(name = "ACC_BAL")
    protected BigDecimal accbal;
    @XmlElement(name = "TD_BAL_AMT")
    protected BigDecimal tdbalamt;
    @XmlElement(name = "MATAMT_AFTER_TOPUP")
    protected BigDecimal matamtaftertopup;
    @XmlElement(name = "INTRATEC")
    protected BigDecimal intratec;
    @XmlElement(name = "EXT_REFERENCE")
    protected String extreference;
    @XmlElement(name = "CUSTOMER_NAME")
    protected String customername;
    @XmlElement(name = "CUSTMERNO")
    protected String custmerno;
    @XmlElement(name = "PR_BALANCE")
    protected String prbalance;
    @XmlElement(name = "INTEREST_RATE")
    protected String interestrate;
    @XmlElement(name = "INT_PAID_OUT")
    protected String intpaidout;
    @XmlElement(name = "TAX_COLLECTED")
    protected String taxcollected;
    @XmlElement(name = "INTEREST_EARNINGS")
    protected String interestearnings;
    @XmlElement(name = "TAX_DEDUCTIONS")
    protected String taxdeductions;
    @XmlElement(name = "APY")
    protected String apy;
    @XmlElement(name = "SIMULATION")
    protected String simulation;
    @XmlElement(name = "MAKER")
    protected String maker;
    @XmlElement(name = "MAKERSTAMP")
    protected String makerstamp;
    @XmlElement(name = "CHECKER")
    protected String checker;
    @XmlElement(name = "CHECKERSTAMP")
    protected String checkerstamp;
    @XmlElement(name = "MODNO")
    protected BigDecimal modno;
    @XmlElement(name = "TXNSTAT")
    protected String txnstat;
    @XmlElement(name = "AUTHSTAT")
    protected String authstat;
    @XmlElement(name = "Tdtopup-Payin")
    protected List<TopUpSimFullType.TdtopupPayin> tdtopupPayin;
    @XmlElement(name = "Int-Payout")
    protected List<TopUpSimFullType.IntPayout> intPayout;

    /**
     * Gets the value of the acbrn1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACBRN1() {
        return acbrn1;
    }

    /**
     * Sets the value of the acbrn1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACBRN1(String value) {
        this.acbrn1 = value;
    }

    /**
     * Gets the value of the accno1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACCNO1() {
        return accno1;
    }

    /**
     * Sets the value of the accno1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACCNO1(String value) {
        this.accno1 = value;
    }

    /**
     * Gets the value of the accccy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACCCCY() {
        return accccy;
    }

    /**
     * Sets the value of the accccy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACCCCY(String value) {
        this.accccy = value;
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
     * Gets the value of the intrte property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getINTRTE() {
        return intrte;
    }

    /**
     * Sets the value of the intrte property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setINTRTE(BigDecimal value) {
        this.intrte = value;
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
     * Gets the value of the accdesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACCDESC() {
        return accdesc;
    }

    /**
     * Sets the value of the accdesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACCDESC(String value) {
        this.accdesc = value;
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
     * Gets the value of the tenord property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTENORD() {
        return tenord;
    }

    /**
     * Sets the value of the tenord property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTENORD(BigDecimal value) {
        this.tenord = value;
    }

    /**
     * Gets the value of the months property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMONTHS() {
        return months;
    }

    /**
     * Sets the value of the months property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMONTHS(BigDecimal value) {
        this.months = value;
    }

    /**
     * Gets the value of the yearsss property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getYEARSSS() {
        return yearsss;
    }

    /**
     * Sets the value of the yearsss property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setYEARSSS(BigDecimal value) {
        this.yearsss = value;
    }

    /**
     * Gets the value of the matdt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMATDT() {
        return matdt;
    }

    /**
     * Sets the value of the matdt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMATDT(XMLGregorianCalendar value) {
        this.matdt = value;
    }

    /**
     * Gets the value of the accbal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getACCBAL() {
        return accbal;
    }

    /**
     * Sets the value of the accbal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setACCBAL(BigDecimal value) {
        this.accbal = value;
    }

    /**
     * Gets the value of the tdbalamt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTDBALAMT() {
        return tdbalamt;
    }

    /**
     * Sets the value of the tdbalamt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTDBALAMT(BigDecimal value) {
        this.tdbalamt = value;
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
     * Gets the value of the intratec property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getINTRATEC() {
        return intratec;
    }

    /**
     * Sets the value of the intratec property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setINTRATEC(BigDecimal value) {
        this.intratec = value;
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
     * Gets the value of the customername property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCUSTOMERNAME() {
        return customername;
    }

    /**
     * Sets the value of the customername property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCUSTOMERNAME(String value) {
        this.customername = value;
    }

    /**
     * Gets the value of the custmerno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCUSTMERNO() {
        return custmerno;
    }

    /**
     * Sets the value of the custmerno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCUSTMERNO(String value) {
        this.custmerno = value;
    }

    /**
     * Gets the value of the prbalance property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRBALANCE() {
        return prbalance;
    }

    /**
     * Sets the value of the prbalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRBALANCE(String value) {
        this.prbalance = value;
    }

    /**
     * Gets the value of the interestrate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINTERESTRATE() {
        return interestrate;
    }

    /**
     * Sets the value of the interestrate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINTERESTRATE(String value) {
        this.interestrate = value;
    }

    /**
     * Gets the value of the intpaidout property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINTPAIDOUT() {
        return intpaidout;
    }

    /**
     * Sets the value of the intpaidout property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINTPAIDOUT(String value) {
        this.intpaidout = value;
    }

    /**
     * Gets the value of the taxcollected property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTAXCOLLECTED() {
        return taxcollected;
    }

    /**
     * Sets the value of the taxcollected property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTAXCOLLECTED(String value) {
        this.taxcollected = value;
    }

    /**
     * Gets the value of the interestearnings property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINTERESTEARNINGS() {
        return interestearnings;
    }

    /**
     * Sets the value of the interestearnings property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINTERESTEARNINGS(String value) {
        this.interestearnings = value;
    }

    /**
     * Gets the value of the taxdeductions property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTAXDEDUCTIONS() {
        return taxdeductions;
    }

    /**
     * Sets the value of the taxdeductions property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTAXDEDUCTIONS(String value) {
        this.taxdeductions = value;
    }

    /**
     * Gets the value of the apy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPY() {
        return apy;
    }

    /**
     * Sets the value of the apy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPY(String value) {
        this.apy = value;
    }

    /**
     * Gets the value of the simulation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSIMULATION() {
        return simulation;
    }

    /**
     * Sets the value of the simulation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSIMULATION(String value) {
        this.simulation = value;
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
     * Gets the value of the checker property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCHECKER() {
        return checker;
    }

    /**
     * Sets the value of the checker property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCHECKER(String value) {
        this.checker = value;
    }

    /**
     * Gets the value of the checkerstamp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCHECKERSTAMP() {
        return checkerstamp;
    }

    /**
     * Sets the value of the checkerstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCHECKERSTAMP(String value) {
        this.checkerstamp = value;
    }

    /**
     * Gets the value of the modno property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMODNO() {
        return modno;
    }

    /**
     * Sets the value of the modno property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMODNO(BigDecimal value) {
        this.modno = value;
    }

    /**
     * Gets the value of the txnstat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTXNSTAT() {
        return txnstat;
    }

    /**
     * Sets the value of the txnstat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTXNSTAT(String value) {
        this.txnstat = value;
    }

    /**
     * Gets the value of the authstat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAUTHSTAT() {
        return authstat;
    }

    /**
     * Sets the value of the authstat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAUTHSTAT(String value) {
        this.authstat = value;
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
     * {@link TopUpSimFullType.TdtopupPayin }
     * 
     * 
     */
    public List<TopUpSimFullType.TdtopupPayin> getTdtopupPayin() {
        if (tdtopupPayin == null) {
            tdtopupPayin = new ArrayList<TopUpSimFullType.TdtopupPayin>();
        }
        return this.tdtopupPayin;
    }

    /**
     * Gets the value of the intPayout property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the intPayout property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIntPayout().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TopUpSimFullType.IntPayout }
     * 
     * 
     */
    public List<TopUpSimFullType.IntPayout> getIntPayout() {
        if (intPayout == null) {
            intPayout = new ArrayList<TopUpSimFullType.IntPayout>();
        }
        return this.intPayout;
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
     *         &lt;element name="INTEREST_AMOUNT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="PRNAMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="DATE" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
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
        "interestamount",
        "prnamt",
        "date"
    })
    public static class IntPayout {

        @XmlElement(name = "INTEREST_AMOUNT")
        protected BigDecimal interestamount;
        @XmlElement(name = "PRNAMT")
        protected BigDecimal prnamt;
        @XmlElement(name = "DATE")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar date;

        /**
         * Gets the value of the interestamount property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getINTERESTAMOUNT() {
            return interestamount;
        }

        /**
         * Sets the value of the interestamount property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setINTERESTAMOUNT(BigDecimal value) {
            this.interestamount = value;
        }

        /**
         * Gets the value of the prnamt property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getPRNAMT() {
            return prnamt;
        }

        /**
         * Sets the value of the prnamt property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setPRNAMT(BigDecimal value) {
            this.prnamt = value;
        }

        /**
         * Gets the value of the date property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getDATE() {
            return date;
        }

        /**
         * Sets the value of the date property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setDATE(XMLGregorianCalendar value) {
            this.date = value;
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
     *         &lt;element name="FUND_OPT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="AMNT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="OFFSET_BRN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "offsetbrn",
        "offsetaccount",
        "pecent"
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

    }

}
