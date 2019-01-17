
package com.ofss.fcubs.service.fcubsldservice;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for LoansandDepositsPayment-Full-Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LoansandDepositsPayment-Full-Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="XREF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FCCREF" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CPTY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="STATUS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OSBAL" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="CCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OLDMATDT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="NEWMATDT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="EFFFROM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PREPMTBASIS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PREPMTEFFFROM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VALDT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="TOTPAID" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="LIMITDT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="DISCRATE" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="TOTPREPAID" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="LIMITAMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="LIQDFACEVAL" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="PREPMTPENRATE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="PREPMTPENAMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="PREPMTADJAMT1" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="PREPMTADJAMT2" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="PAYMNTREM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LCYEQVTTOTPAID" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="LCYEQVTTOTPREPAID" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="LCYEQVTLIMITAMT" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="LCYEQVTLIQDFACEVALUE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="OSBALREP" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="SYNDNO" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="SUBSYSTEMSTAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CURRPMNT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="TOTPAMNT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Payment-Breakup" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="FCCREF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="COMP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="AMTDUE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="AMTPAID" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Schedule-Details" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="FCCREF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="SCOMP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="DUEDT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                   &lt;element name="AMTDUE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="AMTSETTL" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Contract-Event-Log" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="MAKERID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="MAKERSTAMP" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="CHECKERID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="CHECKERSTAMP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="REVR_MAKERID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="REVR_CHECKERID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="REVR_MAKERSTAMP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="REVR_CHECKERSTAMP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="AUTHSTAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="CONTSTAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="REVR_AUTHSTAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="REVR_CONTSTAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Settlement-Addl-Details" type="{http://fcubs.ofss.com/service/FCUBSLDService}SettlementAddlDetailsType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Settlement-Details" type="{http://fcubs.ofss.com/service/FCUBSLDService}SettlementDetailsType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Clearing-Details" type="{http://fcubs.ofss.com/service/FCUBSLDService}SettlementClearingDetails" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Mis-Details" type="{http://fcubs.ofss.com/service/FCUBSLDService}MISDETAILSType" minOccurs="0"/>
 *         &lt;element name="Balance-Trnsfer-Log" type="{http://fcubs.ofss.com/service/FCUBSLDService}MISBALTRANLOGDetails" minOccurs="0"/>
 *         &lt;element name="Mis-Change-Log" type="{http://fcubs.ofss.com/service/FCUBSLDService}MISCHANGELOGDetails" minOccurs="0"/>
 *         &lt;element name="Mis-Amend" type="{http://fcubs.ofss.com/service/FCUBSLDService}MISAMENDDetails" minOccurs="0"/>
 *         &lt;element name="Refinance-Rate" type="{http://fcubs.ofss.com/service/FCUBSLDService}MISRefineRateDetails" minOccurs="0"/>
 *         &lt;element name="Udf-Details" type="{http://fcubs.ofss.com/service/FCUBSLDService}UDFDETAILSType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Charge-Application" type="{http://fcubs.ofss.com/service/FCUBSLDService}CHGSAppType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Charge-Association" type="{http://fcubs.ofss.com/service/FCUBSLDService}ChgAssType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Charge-Liquidation" type="{http://fcubs.ofss.com/service/FCUBSLDService}ChgLiqType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Interest-Main" type="{http://fcubs.ofss.com/service/FCUBSLDService}IntMainType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Taxdetails-Main" type="{http://fcubs.ofss.com/service/FCUBSLDService}TaxMainType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Taxdetails" type="{http://fcubs.ofss.com/service/FCUBSLDService}TaxDetailType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Contract_Schedules" type="{http://fcubs.ofss.com/service/FCUBSLDService}ScheduleType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Contract_Linkages" type="{http://fcubs.ofss.com/service/FCUBSLDService}LinkageType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Relationship-Linkage" type="{http://fcubs.ofss.com/service/FCUBSLDService}LINKEDENTITYType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Brokerage-Master" type="{http://fcubs.ofss.com/service/FCUBSLDService}BrkMasterType" minOccurs="0"/>
 *         &lt;element name="Advice-Details" type="{http://fcubs.ofss.com/service/FCUBSLDService}ADVDETAILSType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Settlement-Split-Master" type="{http://fcubs.ofss.com/service/FCUBSLDService}SplitSettlementFullDetailType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LoansandDepositsPayment-Full-Type", propOrder = {
    "xref",
    "fccref",
    "cpty",
    "status",
    "osbal",
    "ccy",
    "oldmatdt",
    "newmatdt",
    "efffrom",
    "prepmtbasis",
    "prepmtefffrom",
    "valdt",
    "totpaid",
    "limitdt",
    "discrate",
    "totprepaid",
    "limitamt",
    "liqdfaceval",
    "prepmtpenrate",
    "prepmtpenamt",
    "prepmtadjamt1",
    "prepmtadjamt2",
    "paymntrem",
    "lcyeqvttotpaid",
    "lcyeqvttotprepaid",
    "lcyeqvtlimitamt",
    "lcyeqvtliqdfacevalue",
    "osbalrep",
    "syndno",
    "subsystemstat",
    "currpmnt",
    "totpamnt",
    "paymentBreakup",
    "scheduleDetails",
    "contractEventLog",
    "settlementAddlDetails",
    "settlementDetails",
    "clearingDetails",
    "misDetails",
    "balanceTrnsferLog",
    "misChangeLog",
    "misAmend",
    "refinanceRate",
    "udfDetails",
    "chargeApplication",
    "chargeAssociation",
    "chargeLiquidation",
    "interestMain",
    "taxdetailsMain",
    "taxdetails",
    "contractSchedules",
    "contractLinkages",
    "relationshipLinkage",
    "brokerageMaster",
    "adviceDetails",
    "settlementSplitMaster"
})
public class LoansandDepositsPaymentFullType {

    @XmlElement(name = "XREF")
    protected String xref;
    @XmlElement(name = "FCCREF", required = true)
    protected String fccref;
    @XmlElement(name = "CPTY")
    protected String cpty;
    @XmlElement(name = "STATUS")
    protected String status;
    @XmlElement(name = "OSBAL")
    protected BigDecimal osbal;
    @XmlElement(name = "CCY")
    protected String ccy;
    @XmlElement(name = "OLDMATDT")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar oldmatdt;
    @XmlElement(name = "NEWMATDT")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar newmatdt;
    @XmlElement(name = "EFFFROM")
    protected String efffrom;
    @XmlElement(name = "PREPMTBASIS")
    protected String prepmtbasis;
    @XmlElement(name = "PREPMTEFFFROM")
    protected String prepmtefffrom;
    @XmlElement(name = "VALDT")
    //@XmlSchemaType(name = "date")
    protected String valdt;
    @XmlElement(name = "TOTPAID")
    protected BigDecimal totpaid;
    @XmlElement(name = "LIMITDT")
    //@XmlSchemaType(name = "date")
    protected String limitdt;
    @XmlElement(name = "DISCRATE")
    protected BigInteger discrate;
    @XmlElement(name = "TOTPREPAID")
    protected BigDecimal totprepaid;
    @XmlElement(name = "LIMITAMT")
    protected BigDecimal limitamt;
    @XmlElement(name = "LIQDFACEVAL")
    protected BigDecimal liqdfaceval;
    @XmlElement(name = "PREPMTPENRATE")
    protected BigDecimal prepmtpenrate;
    @XmlElement(name = "PREPMTPENAMT")
    protected BigDecimal prepmtpenamt;
    @XmlElement(name = "PREPMTADJAMT1")
    protected BigDecimal prepmtadjamt1;
    @XmlElement(name = "PREPMTADJAMT2")
    protected BigDecimal prepmtadjamt2;
    @XmlElement(name = "PAYMNTREM")
    protected String paymntrem;
    @XmlElement(name = "LCYEQVTTOTPAID")
    protected BigDecimal lcyeqvttotpaid;
    @XmlElement(name = "LCYEQVTTOTPREPAID")
    protected BigDecimal lcyeqvttotprepaid;
    @XmlElement(name = "LCYEQVTLIMITAMT")
    protected BigInteger lcyeqvtlimitamt;
    @XmlElement(name = "LCYEQVTLIQDFACEVALUE")
    protected BigDecimal lcyeqvtliqdfacevalue;
    @XmlElement(name = "OSBALREP")
    protected BigDecimal osbalrep;
    @XmlElement(name = "SYNDNO")
    protected BigDecimal syndno;
    @XmlElement(name = "SUBSYSTEMSTAT")
    protected String subsystemstat;
    @XmlElement(name = "CURRPMNT")
    protected BigDecimal currpmnt;
    @XmlElement(name = "TOTPAMNT")
    protected BigDecimal totpamnt;
    @XmlElement(name = "Payment-Breakup")
    protected List<LoansandDepositsPaymentFullType.PaymentBreakup> paymentBreakup;
    @XmlElement(name = "Schedule-Details")
    protected LoansandDepositsPaymentFullType.ScheduleDetails scheduleDetails;
    @XmlElement(name = "Contract-Event-Log")
    protected LoansandDepositsPaymentFullType.ContractEventLog contractEventLog;
    @XmlElement(name = "Settlement-Addl-Details")
    protected List<SettlementAddlDetailsType> settlementAddlDetails;
    @XmlElement(name = "Settlement-Details")
    protected List<SettlementDetailsType> settlementDetails;
    @XmlElement(name = "Clearing-Details")
    protected List<SettlementClearingDetails> clearingDetails;
    @XmlElement(name = "Mis-Details")
    protected MISDETAILSType misDetails;
    @XmlElement(name = "Balance-Trnsfer-Log")
    protected MISBALTRANLOGDetails balanceTrnsferLog;
    @XmlElement(name = "Mis-Change-Log")
    protected MISCHANGELOGDetails misChangeLog;
    @XmlElement(name = "Mis-Amend")
    protected MISAMENDDetails misAmend;
    @XmlElement(name = "Refinance-Rate")
    protected MISRefineRateDetails refinanceRate;
    @XmlElement(name = "Udf-Details")
    protected List<UDFDETAILSType> udfDetails;
    @XmlElement(name = "Charge-Application")
    protected List<CHGSAppType> chargeApplication;
    @XmlElement(name = "Charge-Association")
    protected List<ChgAssType> chargeAssociation;
    @XmlElement(name = "Charge-Liquidation")
    protected List<ChgLiqType> chargeLiquidation;
    @XmlElement(name = "Interest-Main")
    protected List<IntMainType> interestMain;
    @XmlElement(name = "Taxdetails-Main")
    protected List<TaxMainType> taxdetailsMain;
    @XmlElement(name = "Taxdetails")
    protected List<TaxDetailType> taxdetails;
    @XmlElement(name = "Contract_Schedules")
    protected List<ScheduleType> contractSchedules;
    @XmlElement(name = "Contract_Linkages")
    protected List<LinkageType> contractLinkages;
    @XmlElement(name = "Relationship-Linkage")
    protected List<LINKEDENTITYType> relationshipLinkage;
    @XmlElement(name = "Brokerage-Master")
    protected BrkMasterType brokerageMaster;
    @XmlElement(name = "Advice-Details")
    protected List<ADVDETAILSType> adviceDetails;
    @XmlElement(name = "Settlement-Split-Master")
    protected SplitSettlementFullDetailType settlementSplitMaster;

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
     * Gets the value of the cpty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCPTY() {
        return cpty;
    }

    /**
     * Sets the value of the cpty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCPTY(String value) {
        this.cpty = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTATUS() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSTATUS(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the osbal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOSBAL() {
        return osbal;
    }

    /**
     * Sets the value of the osbal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOSBAL(BigDecimal value) {
        this.osbal = value;
    }

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
     * Gets the value of the oldmatdt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOLDMATDT() {
        return oldmatdt;
    }

    /**
     * Sets the value of the oldmatdt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOLDMATDT(XMLGregorianCalendar value) {
        this.oldmatdt = value;
    }

    /**
     * Gets the value of the newmatdt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getNEWMATDT() {
        return newmatdt;
    }

    /**
     * Sets the value of the newmatdt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setNEWMATDT(XMLGregorianCalendar value) {
        this.newmatdt = value;
    }

    /**
     * Gets the value of the efffrom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEFFFROM() {
        return efffrom;
    }

    /**
     * Sets the value of the efffrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEFFFROM(String value) {
        this.efffrom = value;
    }

    /**
     * Gets the value of the prepmtbasis property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPREPMTBASIS() {
        return prepmtbasis;
    }

    /**
     * Sets the value of the prepmtbasis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPREPMTBASIS(String value) {
        this.prepmtbasis = value;
    }

    /**
     * Gets the value of the prepmtefffrom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPREPMTEFFFROM() {
        return prepmtefffrom;
    }

    /**
     * Sets the value of the prepmtefffrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPREPMTEFFFROM(String value) {
        this.prepmtefffrom = value;
    }

    /**
     * Gets the value of the valdt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public String getVALDT() {
        return valdt;
    }

    /**
     * Sets the value of the valdt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setVALDT(String value) {
        this.valdt = value;
    }

    /**
     * Gets the value of the totpaid property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTOTPAID() {
        return totpaid;
    }

    /**
     * Sets the value of the totpaid property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTOTPAID(BigDecimal value) {
        this.totpaid = value;
    }

    /**
     * Gets the value of the limitdt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public String getLIMITDT() {
        return limitdt;
    }

    /**
     * Sets the value of the limitdt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLIMITDT(String value) {
        this.limitdt = value;
    }

    /**
     * Gets the value of the discrate property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDISCRATE() {
        return discrate;
    }

    /**
     * Sets the value of the discrate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDISCRATE(BigInteger value) {
        this.discrate = value;
    }

    /**
     * Gets the value of the totprepaid property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTOTPREPAID() {
        return totprepaid;
    }

    /**
     * Sets the value of the totprepaid property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTOTPREPAID(BigDecimal value) {
        this.totprepaid = value;
    }

    /**
     * Gets the value of the limitamt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLIMITAMT() {
        return limitamt;
    }

    /**
     * Sets the value of the limitamt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLIMITAMT(BigDecimal value) {
        this.limitamt = value;
    }

    /**
     * Gets the value of the liqdfaceval property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLIQDFACEVAL() {
        return liqdfaceval;
    }

    /**
     * Sets the value of the liqdfaceval property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLIQDFACEVAL(BigDecimal value) {
        this.liqdfaceval = value;
    }

    /**
     * Gets the value of the prepmtpenrate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPREPMTPENRATE() {
        return prepmtpenrate;
    }

    /**
     * Sets the value of the prepmtpenrate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPREPMTPENRATE(BigDecimal value) {
        this.prepmtpenrate = value;
    }

    /**
     * Gets the value of the prepmtpenamt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPREPMTPENAMT() {
        return prepmtpenamt;
    }

    /**
     * Sets the value of the prepmtpenamt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPREPMTPENAMT(BigDecimal value) {
        this.prepmtpenamt = value;
    }

    /**
     * Gets the value of the prepmtadjamt1 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPREPMTADJAMT1() {
        return prepmtadjamt1;
    }

    /**
     * Sets the value of the prepmtadjamt1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPREPMTADJAMT1(BigDecimal value) {
        this.prepmtadjamt1 = value;
    }

    /**
     * Gets the value of the prepmtadjamt2 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPREPMTADJAMT2() {
        return prepmtadjamt2;
    }

    /**
     * Sets the value of the prepmtadjamt2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPREPMTADJAMT2(BigDecimal value) {
        this.prepmtadjamt2 = value;
    }

    /**
     * Gets the value of the paymntrem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPAYMNTREM() {
        return paymntrem;
    }

    /**
     * Sets the value of the paymntrem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPAYMNTREM(String value) {
        this.paymntrem = value;
    }

    /**
     * Gets the value of the lcyeqvttotpaid property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLCYEQVTTOTPAID() {
        return lcyeqvttotpaid;
    }

    /**
     * Sets the value of the lcyeqvttotpaid property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLCYEQVTTOTPAID(BigDecimal value) {
        this.lcyeqvttotpaid = value;
    }

    /**
     * Gets the value of the lcyeqvttotprepaid property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLCYEQVTTOTPREPAID() {
        return lcyeqvttotprepaid;
    }

    /**
     * Sets the value of the lcyeqvttotprepaid property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLCYEQVTTOTPREPAID(BigDecimal value) {
        this.lcyeqvttotprepaid = value;
    }

    /**
     * Gets the value of the lcyeqvtlimitamt property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLCYEQVTLIMITAMT() {
        return lcyeqvtlimitamt;
    }

    /**
     * Sets the value of the lcyeqvtlimitamt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLCYEQVTLIMITAMT(BigInteger value) {
        this.lcyeqvtlimitamt = value;
    }

    /**
     * Gets the value of the lcyeqvtliqdfacevalue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLCYEQVTLIQDFACEVALUE() {
        return lcyeqvtliqdfacevalue;
    }

    /**
     * Sets the value of the lcyeqvtliqdfacevalue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLCYEQVTLIQDFACEVALUE(BigDecimal value) {
        this.lcyeqvtliqdfacevalue = value;
    }

    /**
     * Gets the value of the osbalrep property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOSBALREP() {
        return osbalrep;
    }

    /**
     * Sets the value of the osbalrep property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOSBALREP(BigDecimal value) {
        this.osbalrep = value;
    }

    /**
     * Gets the value of the syndno property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSYNDNO() {
        return syndno;
    }

    /**
     * Sets the value of the syndno property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSYNDNO(BigDecimal value) {
        this.syndno = value;
    }

    /**
     * Gets the value of the subsystemstat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSUBSYSTEMSTAT() {
        return subsystemstat;
    }

    /**
     * Sets the value of the subsystemstat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSUBSYSTEMSTAT(String value) {
        this.subsystemstat = value;
    }

    /**
     * Gets the value of the currpmnt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCURRPMNT() {
        return currpmnt;
    }

    /**
     * Sets the value of the currpmnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCURRPMNT(BigDecimal value) {
        this.currpmnt = value;
    }

    /**
     * Gets the value of the totpamnt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTOTPAMNT() {
        return totpamnt;
    }

    /**
     * Sets the value of the totpamnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTOTPAMNT(BigDecimal value) {
        this.totpamnt = value;
    }

    /**
     * Gets the value of the paymentBreakup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paymentBreakup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaymentBreakup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LoansandDepositsPaymentFullType.PaymentBreakup }
     * 
     * 
     */
    public List<LoansandDepositsPaymentFullType.PaymentBreakup> getPaymentBreakup() {
        if (paymentBreakup == null) {
            paymentBreakup = new ArrayList<LoansandDepositsPaymentFullType.PaymentBreakup>();
        }
        return this.paymentBreakup;
    }

    /**
     * Gets the value of the scheduleDetails property.
     * 
     * @return
     *     possible object is
     *     {@link LoansandDepositsPaymentFullType.ScheduleDetails }
     *     
     */
    public LoansandDepositsPaymentFullType.ScheduleDetails getScheduleDetails() {
        return scheduleDetails;
    }

    /**
     * Sets the value of the scheduleDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoansandDepositsPaymentFullType.ScheduleDetails }
     *     
     */
    public void setScheduleDetails(LoansandDepositsPaymentFullType.ScheduleDetails value) {
        this.scheduleDetails = value;
    }

    /**
     * Gets the value of the contractEventLog property.
     * 
     * @return
     *     possible object is
     *     {@link LoansandDepositsPaymentFullType.ContractEventLog }
     *     
     */
    public LoansandDepositsPaymentFullType.ContractEventLog getContractEventLog() {
        return contractEventLog;
    }

    /**
     * Sets the value of the contractEventLog property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoansandDepositsPaymentFullType.ContractEventLog }
     *     
     */
    public void setContractEventLog(LoansandDepositsPaymentFullType.ContractEventLog value) {
        this.contractEventLog = value;
    }

    /**
     * Gets the value of the settlementAddlDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the settlementAddlDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSettlementAddlDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SettlementAddlDetailsType }
     * 
     * 
     */
    public List<SettlementAddlDetailsType> getSettlementAddlDetails() {
        if (settlementAddlDetails == null) {
            settlementAddlDetails = new ArrayList<SettlementAddlDetailsType>();
        }
        return this.settlementAddlDetails;
    }

    /**
     * Gets the value of the settlementDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the settlementDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSettlementDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SettlementDetailsType }
     * 
     * 
     */
    public List<SettlementDetailsType> getSettlementDetails() {
        if (settlementDetails == null) {
            settlementDetails = new ArrayList<SettlementDetailsType>();
        }
        return this.settlementDetails;
    }

    /**
     * Gets the value of the clearingDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the clearingDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClearingDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SettlementClearingDetails }
     * 
     * 
     */
    public List<SettlementClearingDetails> getClearingDetails() {
        if (clearingDetails == null) {
            clearingDetails = new ArrayList<SettlementClearingDetails>();
        }
        return this.clearingDetails;
    }

    /**
     * Gets the value of the misDetails property.
     * 
     * @return
     *     possible object is
     *     {@link MISDETAILSType }
     *     
     */
    public MISDETAILSType getMisDetails() {
        return misDetails;
    }

    /**
     * Sets the value of the misDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link MISDETAILSType }
     *     
     */
    public void setMisDetails(MISDETAILSType value) {
        this.misDetails = value;
    }

    /**
     * Gets the value of the balanceTrnsferLog property.
     * 
     * @return
     *     possible object is
     *     {@link MISBALTRANLOGDetails }
     *     
     */
    public MISBALTRANLOGDetails getBalanceTrnsferLog() {
        return balanceTrnsferLog;
    }

    /**
     * Sets the value of the balanceTrnsferLog property.
     * 
     * @param value
     *     allowed object is
     *     {@link MISBALTRANLOGDetails }
     *     
     */
    public void setBalanceTrnsferLog(MISBALTRANLOGDetails value) {
        this.balanceTrnsferLog = value;
    }

    /**
     * Gets the value of the misChangeLog property.
     * 
     * @return
     *     possible object is
     *     {@link MISCHANGELOGDetails }
     *     
     */
    public MISCHANGELOGDetails getMisChangeLog() {
        return misChangeLog;
    }

    /**
     * Sets the value of the misChangeLog property.
     * 
     * @param value
     *     allowed object is
     *     {@link MISCHANGELOGDetails }
     *     
     */
    public void setMisChangeLog(MISCHANGELOGDetails value) {
        this.misChangeLog = value;
    }

    /**
     * Gets the value of the misAmend property.
     * 
     * @return
     *     possible object is
     *     {@link MISAMENDDetails }
     *     
     */
    public MISAMENDDetails getMisAmend() {
        return misAmend;
    }

    /**
     * Sets the value of the misAmend property.
     * 
     * @param value
     *     allowed object is
     *     {@link MISAMENDDetails }
     *     
     */
    public void setMisAmend(MISAMENDDetails value) {
        this.misAmend = value;
    }

    /**
     * Gets the value of the refinanceRate property.
     * 
     * @return
     *     possible object is
     *     {@link MISRefineRateDetails }
     *     
     */
    public MISRefineRateDetails getRefinanceRate() {
        return refinanceRate;
    }

    /**
     * Sets the value of the refinanceRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link MISRefineRateDetails }
     *     
     */
    public void setRefinanceRate(MISRefineRateDetails value) {
        this.refinanceRate = value;
    }

    /**
     * Gets the value of the udfDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the udfDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUdfDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UDFDETAILSType }
     * 
     * 
     */
    public List<UDFDETAILSType> getUdfDetails() {
        if (udfDetails == null) {
            udfDetails = new ArrayList<UDFDETAILSType>();
        }
        return this.udfDetails;
    }

    /**
     * Gets the value of the chargeApplication property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the chargeApplication property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChargeApplication().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CHGSAppType }
     * 
     * 
     */
    public List<CHGSAppType> getChargeApplication() {
        if (chargeApplication == null) {
            chargeApplication = new ArrayList<CHGSAppType>();
        }
        return this.chargeApplication;
    }

    /**
     * Gets the value of the chargeAssociation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the chargeAssociation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChargeAssociation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ChgAssType }
     * 
     * 
     */
    public List<ChgAssType> getChargeAssociation() {
        if (chargeAssociation == null) {
            chargeAssociation = new ArrayList<ChgAssType>();
        }
        return this.chargeAssociation;
    }

    /**
     * Gets the value of the chargeLiquidation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the chargeLiquidation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChargeLiquidation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ChgLiqType }
     * 
     * 
     */
    public List<ChgLiqType> getChargeLiquidation() {
        if (chargeLiquidation == null) {
            chargeLiquidation = new ArrayList<ChgLiqType>();
        }
        return this.chargeLiquidation;
    }

    /**
     * Gets the value of the interestMain property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the interestMain property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInterestMain().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IntMainType }
     * 
     * 
     */
    public List<IntMainType> getInterestMain() {
        if (interestMain == null) {
            interestMain = new ArrayList<IntMainType>();
        }
        return this.interestMain;
    }

    /**
     * Gets the value of the taxdetailsMain property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the taxdetailsMain property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTaxdetailsMain().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TaxMainType }
     * 
     * 
     */
    public List<TaxMainType> getTaxdetailsMain() {
        if (taxdetailsMain == null) {
            taxdetailsMain = new ArrayList<TaxMainType>();
        }
        return this.taxdetailsMain;
    }

    /**
     * Gets the value of the taxdetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the taxdetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTaxdetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TaxDetailType }
     * 
     * 
     */
    public List<TaxDetailType> getTaxdetails() {
        if (taxdetails == null) {
            taxdetails = new ArrayList<TaxDetailType>();
        }
        return this.taxdetails;
    }

    /**
     * Gets the value of the contractSchedules property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contractSchedules property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContractSchedules().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ScheduleType }
     * 
     * 
     */
    public List<ScheduleType> getContractSchedules() {
        if (contractSchedules == null) {
            contractSchedules = new ArrayList<ScheduleType>();
        }
        return this.contractSchedules;
    }

    /**
     * Gets the value of the contractLinkages property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contractLinkages property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContractLinkages().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LinkageType }
     * 
     * 
     */
    public List<LinkageType> getContractLinkages() {
        if (contractLinkages == null) {
            contractLinkages = new ArrayList<LinkageType>();
        }
        return this.contractLinkages;
    }

    /**
     * Gets the value of the relationshipLinkage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the relationshipLinkage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRelationshipLinkage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LINKEDENTITYType }
     * 
     * 
     */
    public List<LINKEDENTITYType> getRelationshipLinkage() {
        if (relationshipLinkage == null) {
            relationshipLinkage = new ArrayList<LINKEDENTITYType>();
        }
        return this.relationshipLinkage;
    }

    /**
     * Gets the value of the brokerageMaster property.
     * 
     * @return
     *     possible object is
     *     {@link BrkMasterType }
     *     
     */
    public BrkMasterType getBrokerageMaster() {
        return brokerageMaster;
    }

    /**
     * Sets the value of the brokerageMaster property.
     * 
     * @param value
     *     allowed object is
     *     {@link BrkMasterType }
     *     
     */
    public void setBrokerageMaster(BrkMasterType value) {
        this.brokerageMaster = value;
    }

    /**
     * Gets the value of the adviceDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the adviceDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdviceDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ADVDETAILSType }
     * 
     * 
     */
    public List<ADVDETAILSType> getAdviceDetails() {
        if (adviceDetails == null) {
            adviceDetails = new ArrayList<ADVDETAILSType>();
        }
        return this.adviceDetails;
    }

    /**
     * Gets the value of the settlementSplitMaster property.
     * 
     * @return
     *     possible object is
     *     {@link SplitSettlementFullDetailType }
     *     
     */
    public SplitSettlementFullDetailType getSettlementSplitMaster() {
        return settlementSplitMaster;
    }

    /**
     * Sets the value of the settlementSplitMaster property.
     * 
     * @param value
     *     allowed object is
     *     {@link SplitSettlementFullDetailType }
     *     
     */
    public void setSettlementSplitMaster(SplitSettlementFullDetailType value) {
        this.settlementSplitMaster = value;
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
     *         &lt;element name="MAKERID" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="MAKERSTAMP" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="CHECKERID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="CHECKERSTAMP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="REVR_MAKERID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="REVR_CHECKERID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="REVR_MAKERSTAMP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="REVR_CHECKERSTAMP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="AUTHSTAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="CONTSTAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="REVR_AUTHSTAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="REVR_CONTSTAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "makerid",
        "makerstamp",
        "checkerid",
        "checkerstamp",
        "revrmakerid",
        "revrcheckerid",
        "revrmakerstamp",
        "revrcheckerstamp",
        "authstat",
        "contstat",
        "revrauthstat",
        "revrcontstat"
    })
    public static class ContractEventLog {

        @XmlElement(name = "MAKERID", required = true)
        protected String makerid;
        @XmlElement(name = "MAKERSTAMP", required = true)
        protected String makerstamp;
        @XmlElement(name = "CHECKERID")
        protected String checkerid;
        @XmlElement(name = "CHECKERSTAMP")
        protected String checkerstamp;
        @XmlElement(name = "REVR_MAKERID")
        protected String revrmakerid;
        @XmlElement(name = "REVR_CHECKERID")
        protected String revrcheckerid;
        @XmlElement(name = "REVR_MAKERSTAMP")
        protected String revrmakerstamp;
        @XmlElement(name = "REVR_CHECKERSTAMP")
        protected String revrcheckerstamp;
        @XmlElement(name = "AUTHSTAT")
        protected String authstat;
        @XmlElement(name = "CONTSTAT")
        protected String contstat;
        @XmlElement(name = "REVR_AUTHSTAT")
        protected String revrauthstat;
        @XmlElement(name = "REVR_CONTSTAT")
        protected String revrcontstat;

        /**
         * Gets the value of the makerid property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMAKERID() {
            return makerid;
        }

        /**
         * Sets the value of the makerid property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMAKERID(String value) {
            this.makerid = value;
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
         * Gets the value of the checkerid property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCHECKERID() {
            return checkerid;
        }

        /**
         * Sets the value of the checkerid property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCHECKERID(String value) {
            this.checkerid = value;
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
         * Gets the value of the revrmakerid property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getREVRMAKERID() {
            return revrmakerid;
        }

        /**
         * Sets the value of the revrmakerid property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setREVRMAKERID(String value) {
            this.revrmakerid = value;
        }

        /**
         * Gets the value of the revrcheckerid property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getREVRCHECKERID() {
            return revrcheckerid;
        }

        /**
         * Sets the value of the revrcheckerid property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setREVRCHECKERID(String value) {
            this.revrcheckerid = value;
        }

        /**
         * Gets the value of the revrmakerstamp property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getREVRMAKERSTAMP() {
            return revrmakerstamp;
        }

        /**
         * Sets the value of the revrmakerstamp property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setREVRMAKERSTAMP(String value) {
            this.revrmakerstamp = value;
        }

        /**
         * Gets the value of the revrcheckerstamp property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getREVRCHECKERSTAMP() {
            return revrcheckerstamp;
        }

        /**
         * Sets the value of the revrcheckerstamp property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setREVRCHECKERSTAMP(String value) {
            this.revrcheckerstamp = value;
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
         * Gets the value of the contstat property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCONTSTAT() {
            return contstat;
        }

        /**
         * Sets the value of the contstat property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCONTSTAT(String value) {
            this.contstat = value;
        }

        /**
         * Gets the value of the revrauthstat property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getREVRAUTHSTAT() {
            return revrauthstat;
        }

        /**
         * Sets the value of the revrauthstat property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setREVRAUTHSTAT(String value) {
            this.revrauthstat = value;
        }

        /**
         * Gets the value of the revrcontstat property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getREVRCONTSTAT() {
            return revrcontstat;
        }

        /**
         * Sets the value of the revrcontstat property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setREVRCONTSTAT(String value) {
            this.revrcontstat = value;
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
     *         &lt;element name="FCCREF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="COMP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="AMTDUE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="AMTPAID" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
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
        "fccref",
        "comp",
        "amtdue",
        "amtpaid"
    })
    public static class PaymentBreakup {

        @XmlElement(name = "FCCREF")
        protected String fccref;
        @XmlElement(name = "COMP")
        protected String comp;
        @XmlElement(name = "AMTDUE")
        protected BigDecimal amtdue;
        @XmlElement(name = "AMTPAID")
        protected BigDecimal amtpaid;

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

        /**
         * Gets the value of the amtdue property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getAMTDUE() {
            return amtdue;
        }

        /**
         * Sets the value of the amtdue property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setAMTDUE(BigDecimal value) {
            this.amtdue = value;
        }

        /**
         * Gets the value of the amtpaid property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getAMTPAID() {
            return amtpaid;
        }

        /**
         * Sets the value of the amtpaid property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setAMTPAID(BigDecimal value) {
            this.amtpaid = value;
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
     *         &lt;element name="FCCREF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="SCOMP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="DUEDT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *         &lt;element name="AMTDUE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="AMTSETTL" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
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
        "fccref",
        "scomp",
        "duedt",
        "amtdue",
        "amtsettl"
    })
    public static class ScheduleDetails {

        @XmlElement(name = "FCCREF")
        protected String fccref;
        @XmlElement(name = "SCOMP")
        protected String scomp;
        @XmlElement(name = "DUEDT")
        //@XmlSchemaType(name = "date")
        protected String duedt;
        @XmlElement(name = "AMTDUE")
        protected BigDecimal amtdue;
        @XmlElement(name = "AMTSETTL")
        protected BigDecimal amtsettl;

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
         * Gets the value of the scomp property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSCOMP() {
            return scomp;
        }

        /**
         * Sets the value of the scomp property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSCOMP(String value) {
            this.scomp = value;
        }

        /**
         * Gets the value of the duedt property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public String getDUEDT() {
            return duedt;
        }

        /**
         * Sets the value of the duedt property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setDUEDT(String value) {
            this.duedt = value;
        }

        /**
         * Gets the value of the amtdue property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getAMTDUE() {
            return amtdue;
        }

        /**
         * Sets the value of the amtdue property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setAMTDUE(BigDecimal value) {
            this.amtdue = value;
        }

        /**
         * Gets the value of the amtsettl property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getAMTSETTL() {
            return amtsettl;
        }

        /**
         * Sets the value of the amtsettl property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setAMTSETTL(BigDecimal value) {
            this.amtsettl = value;
        }

    }

}
