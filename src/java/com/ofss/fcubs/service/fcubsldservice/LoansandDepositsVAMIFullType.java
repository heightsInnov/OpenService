
package com.ofss.fcubs.service.fcubsldservice;

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
 * <p>Java class for LoansandDepositsVAMIFull-Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LoansandDepositsVAMIFull-Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FCCREF" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="XREF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CPTY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EVNT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EVNTDT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="MAKERID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ORIG" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="CALCDT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AMTDT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="MATDT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="MDATE" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="DAMNT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="CONTCCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VALDT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="PRD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PROTYPEDESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LATVERNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Settlement-Addl-Details" type="{http://fcubs.ofss.com/service/FCUBSLDService}SettlementAddlDetailsType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Settlement-Details" type="{http://fcubs.ofss.com/service/FCUBSLDService}SettlementDetailsType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Clearing-Details" type="{http://fcubs.ofss.com/service/FCUBSLDService}SettlementClearingDetails" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Mis-Details" type="{http://fcubs.ofss.com/service/FCUBSLDService}MISDETAILSType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Balance-Trnsfer-Log" type="{http://fcubs.ofss.com/service/FCUBSLDService}MISBALTRANLOGDetails" minOccurs="0"/>
 *         &lt;element name="Mis-Change-Log" type="{http://fcubs.ofss.com/service/FCUBSLDService}MISCHANGELOGDetails" minOccurs="0"/>
 *         &lt;element name="Mis-Amend" type="{http://fcubs.ofss.com/service/FCUBSLDService}MISAMENDDetails" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Refinance-Rate" type="{http://fcubs.ofss.com/service/FCUBSLDService}MISRefineRateDetails" minOccurs="0"/>
 *         &lt;element name="Udf-Details" type="{http://fcubs.ofss.com/service/FCUBSLDService}UDFDETAILSType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Charge-Application" type="{http://fcubs.ofss.com/service/FCUBSLDService}CHGSAppType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Charge-Association" type="{http://fcubs.ofss.com/service/FCUBSLDService}ChgAssType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Charge-Liquidation" type="{http://fcubs.ofss.com/service/FCUBSLDService}ChgLiqType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Interest-Main" type="{http://fcubs.ofss.com/service/FCUBSLDService}IntMainType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Taxdetails-Main" type="{http://fcubs.ofss.com/service/FCUBSLDService}TaxMainType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Taxdetails" type="{http://fcubs.ofss.com/service/FCUBSLDService}TaxDetailType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Contract-Schedules" type="{http://fcubs.ofss.com/service/FCUBSLDService}ScheduleType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Contract-Linkages" type="{http://fcubs.ofss.com/service/FCUBSLDService}LinkageType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Relationship-Linkage" type="{http://fcubs.ofss.com/service/FCUBSLDService}LINKEDENTITYType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Brokerage-Master" type="{http://fcubs.ofss.com/service/FCUBSLDService}BrkMasterType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Advice-Details" type="{http://fcubs.ofss.com/service/FCUBSLDService}ADVDETAILSType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Settlement-Split-Master" type="{http://fcubs.ofss.com/service/FCUBSLDService}SplitSettlementFullDetailType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Amountdue" type="{http://fcubs.ofss.com/service/FCUBSLDService}LoansandDepositsAmountDue-Type" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Change-Log" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="FCCREF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="FLDDESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="OLDDISPVAL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="NEWDISPVAL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Overrides" type="{http://fcubs.ofss.com/service/FCUBSLDService}OVERRIDEType4" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Contract-Event-Log" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="MAKERID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="MAKERSTAMP" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="CHECKERID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="CHECKERSTAMP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="AUTHSTAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="CONTSTAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "LoansandDepositsVAMIFull-Type", propOrder = {
    "fccref",
    "xref",
    "cpty",
    "name",
    "evnt",
    "evntdt",
    "makerid",
    "amt",
    "orig",
    "calcdt",
    "amtdt",
    "matdt",
    "mdate",
    "damnt",
    "contccy",
    "valdt",
    "prd",
    "protypedesc",
    "latverno",
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
    "settlementSplitMaster",
    "amountdue",
    "changeLog",
    "overrides",
    "contractEventLog"
})
public class LoansandDepositsVAMIFullType {

    @XmlElement(name = "FCCREF", required = true)
    protected String fccref;
    @XmlElement(name = "XREF")
    protected String xref;
    @XmlElement(name = "CPTY")
    protected String cpty;
    @XmlElement(name = "NAME")
    protected String name;
    @XmlElement(name = "EVNT")
    protected String evnt;
    @XmlElement(name = "EVNTDT")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar evntdt;
    @XmlElement(name = "MAKERID")
    protected String makerid;
    @XmlElement(name = "AMT")
    protected BigDecimal amt;
    @XmlElement(name = "ORIG")
    protected BigDecimal orig;
    @XmlElement(name = "CALCDT")
    protected String calcdt;
    @XmlElement(name = "AMTDT")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar amtdt;
    @XmlElement(name = "MATDT")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar matdt;
    @XmlElement(name = "MDATE")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar mdate;
    @XmlElement(name = "DAMNT")
    protected BigDecimal damnt;
    @XmlElement(name = "CONTCCY")
    protected String contccy;
    @XmlElement(name = "VALDT")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar valdt;
    @XmlElement(name = "PRD")
    protected String prd;
    @XmlElement(name = "PROTYPEDESC")
    protected String protypedesc;
    @XmlElement(name = "LATVERNO")
    protected String latverno;
    @XmlElement(name = "Settlement-Addl-Details")
    protected List<SettlementAddlDetailsType> settlementAddlDetails;
    @XmlElement(name = "Settlement-Details")
    protected List<SettlementDetailsType> settlementDetails;
    @XmlElement(name = "Clearing-Details")
    protected List<SettlementClearingDetails> clearingDetails;
    @XmlElement(name = "Mis-Details")
    protected List<MISDETAILSType> misDetails;
    @XmlElement(name = "Balance-Trnsfer-Log")
    protected MISBALTRANLOGDetails balanceTrnsferLog;
    @XmlElement(name = "Mis-Change-Log")
    protected MISCHANGELOGDetails misChangeLog;
    @XmlElement(name = "Mis-Amend")
    protected List<MISAMENDDetails> misAmend;
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
    @XmlElement(name = "Contract-Schedules")
    protected List<ScheduleType> contractSchedules;
    @XmlElement(name = "Contract-Linkages")
    protected List<LinkageType> contractLinkages;
    @XmlElement(name = "Relationship-Linkage")
    protected List<LINKEDENTITYType> relationshipLinkage;
    @XmlElement(name = "Brokerage-Master")
    protected List<BrkMasterType> brokerageMaster;
    @XmlElement(name = "Advice-Details")
    protected List<ADVDETAILSType> adviceDetails;
    @XmlElement(name = "Settlement-Split-Master")
    protected List<SplitSettlementFullDetailType> settlementSplitMaster;
    @XmlElement(name = "Amountdue")
    protected List<LoansandDepositsAmountDueType> amountdue;
    @XmlElement(name = "Change-Log")
    protected List<LoansandDepositsVAMIFullType.ChangeLog> changeLog;
    @XmlElement(name = "Overrides")
    protected List<OVERRIDEType4> overrides;
    @XmlElement(name = "Contract-Event-Log")
    protected LoansandDepositsVAMIFullType.ContractEventLog contractEventLog;

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
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNAME() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNAME(String value) {
        this.name = value;
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
     * Gets the value of the evntdt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEVNTDT() {
        return evntdt;
    }

    /**
     * Sets the value of the evntdt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEVNTDT(XMLGregorianCalendar value) {
        this.evntdt = value;
    }

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
     * Gets the value of the amt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAMT() {
        return amt;
    }

    /**
     * Sets the value of the amt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAMT(BigDecimal value) {
        this.amt = value;
    }

    /**
     * Gets the value of the orig property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getORIG() {
        return orig;
    }

    /**
     * Sets the value of the orig property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setORIG(BigDecimal value) {
        this.orig = value;
    }

    /**
     * Gets the value of the calcdt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCALCDT() {
        return calcdt;
    }

    /**
     * Sets the value of the calcdt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCALCDT(String value) {
        this.calcdt = value;
    }

    /**
     * Gets the value of the amtdt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAMTDT() {
        return amtdt;
    }

    /**
     * Sets the value of the amtdt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAMTDT(XMLGregorianCalendar value) {
        this.amtdt = value;
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
     * Gets the value of the mdate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMDATE() {
        return mdate;
    }

    /**
     * Sets the value of the mdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMDATE(XMLGregorianCalendar value) {
        this.mdate = value;
    }

    /**
     * Gets the value of the damnt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDAMNT() {
        return damnt;
    }

    /**
     * Sets the value of the damnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDAMNT(BigDecimal value) {
        this.damnt = value;
    }

    /**
     * Gets the value of the contccy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCONTCCY() {
        return contccy;
    }

    /**
     * Sets the value of the contccy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCONTCCY(String value) {
        this.contccy = value;
    }

    /**
     * Gets the value of the valdt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getVALDT() {
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
    public void setVALDT(XMLGregorianCalendar value) {
        this.valdt = value;
    }

    /**
     * Gets the value of the prd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRD() {
        return prd;
    }

    /**
     * Sets the value of the prd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRD(String value) {
        this.prd = value;
    }

    /**
     * Gets the value of the protypedesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPROTYPEDESC() {
        return protypedesc;
    }

    /**
     * Sets the value of the protypedesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPROTYPEDESC(String value) {
        this.protypedesc = value;
    }

    /**
     * Gets the value of the latverno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLATVERNO() {
        return latverno;
    }

    /**
     * Sets the value of the latverno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLATVERNO(String value) {
        this.latverno = value;
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
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the misDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMisDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MISDETAILSType }
     * 
     * 
     */
    public List<MISDETAILSType> getMisDetails() {
        if (misDetails == null) {
            misDetails = new ArrayList<MISDETAILSType>();
        }
        return this.misDetails;
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
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the misAmend property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMisAmend().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MISAMENDDetails }
     * 
     * 
     */
    public List<MISAMENDDetails> getMisAmend() {
        if (misAmend == null) {
            misAmend = new ArrayList<MISAMENDDetails>();
        }
        return this.misAmend;
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
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the brokerageMaster property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBrokerageMaster().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BrkMasterType }
     * 
     * 
     */
    public List<BrkMasterType> getBrokerageMaster() {
        if (brokerageMaster == null) {
            brokerageMaster = new ArrayList<BrkMasterType>();
        }
        return this.brokerageMaster;
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
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the settlementSplitMaster property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSettlementSplitMaster().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SplitSettlementFullDetailType }
     * 
     * 
     */
    public List<SplitSettlementFullDetailType> getSettlementSplitMaster() {
        if (settlementSplitMaster == null) {
            settlementSplitMaster = new ArrayList<SplitSettlementFullDetailType>();
        }
        return this.settlementSplitMaster;
    }

    /**
     * Gets the value of the amountdue property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the amountdue property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAmountdue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LoansandDepositsAmountDueType }
     * 
     * 
     */
    public List<LoansandDepositsAmountDueType> getAmountdue() {
        if (amountdue == null) {
            amountdue = new ArrayList<LoansandDepositsAmountDueType>();
        }
        return this.amountdue;
    }

    /**
     * Gets the value of the changeLog property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the changeLog property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChangeLog().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LoansandDepositsVAMIFullType.ChangeLog }
     * 
     * 
     */
    public List<LoansandDepositsVAMIFullType.ChangeLog> getChangeLog() {
        if (changeLog == null) {
            changeLog = new ArrayList<LoansandDepositsVAMIFullType.ChangeLog>();
        }
        return this.changeLog;
    }

    /**
     * Gets the value of the overrides property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the overrides property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOverrides().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OVERRIDEType4 }
     * 
     * 
     */
    public List<OVERRIDEType4> getOverrides() {
        if (overrides == null) {
            overrides = new ArrayList<OVERRIDEType4>();
        }
        return this.overrides;
    }

    /**
     * Gets the value of the contractEventLog property.
     * 
     * @return
     *     possible object is
     *     {@link LoansandDepositsVAMIFullType.ContractEventLog }
     *     
     */
    public LoansandDepositsVAMIFullType.ContractEventLog getContractEventLog() {
        return contractEventLog;
    }

    /**
     * Sets the value of the contractEventLog property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoansandDepositsVAMIFullType.ContractEventLog }
     *     
     */
    public void setContractEventLog(LoansandDepositsVAMIFullType.ContractEventLog value) {
        this.contractEventLog = value;
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
     *         &lt;element name="FLDDESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="OLDDISPVAL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="NEWDISPVAL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "flddesc",
        "olddispval",
        "newdispval"
    })
    public static class ChangeLog {

        @XmlElement(name = "FCCREF")
        protected String fccref;
        @XmlElement(name = "FLDDESC")
        protected String flddesc;
        @XmlElement(name = "OLDDISPVAL")
        protected String olddispval;
        @XmlElement(name = "NEWDISPVAL")
        protected String newdispval;

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
         * Gets the value of the flddesc property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFLDDESC() {
            return flddesc;
        }

        /**
         * Sets the value of the flddesc property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFLDDESC(String value) {
            this.flddesc = value;
        }

        /**
         * Gets the value of the olddispval property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOLDDISPVAL() {
            return olddispval;
        }

        /**
         * Sets the value of the olddispval property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOLDDISPVAL(String value) {
            this.olddispval = value;
        }

        /**
         * Gets the value of the newdispval property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNEWDISPVAL() {
            return newdispval;
        }

        /**
         * Sets the value of the newdispval property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNEWDISPVAL(String value) {
            this.newdispval = value;
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
     *         &lt;element name="MAKERID" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="MAKERSTAMP" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="CHECKERID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="CHECKERSTAMP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="AUTHSTAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="CONTSTAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "authstat",
        "contstat"
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
        @XmlElement(name = "AUTHSTAT")
        protected String authstat;
        @XmlElement(name = "CONTSTAT")
        protected String contstat;

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

    }

}
