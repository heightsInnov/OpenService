
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
 * <p>Java class for LoansandDeposits-IO-Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LoansandDeposits-IO-Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="XREF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FCCREF" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="BRN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PRD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CPTY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CPTYCONFSTAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="CCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ORGL_STDT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="TRNDT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="VALDT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="MAT_TYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NOTC_DAYS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DFLT_ACC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DFLT_ACC_BRN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LINE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DEALER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BRK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BRKCONFSTAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TDESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AMORTYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AUTPROVREQD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CASCADESCHD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DEDTAXCAP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DFLTSETTCCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DRSETLAC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DRSETLACBR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DRSETLCCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EXPCAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HOLMTH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HOLMTHFLG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IGHOL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LIQBVSCH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LIQODSCH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LNSTMTCYC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LNSTMTTYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MVACRMTH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NEWCOMP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PARPYMTMLIQ" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PRINLIQN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RFEXPAMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ROLLALLW" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ROLLMETH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ROLLMECH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MATDT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="SCHDDEFNBAS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SCHDMVMT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="STMTDAY" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="STATCONT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TRCKRECVALIQ" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TRCKRECVMLIQ" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UPDUTLROLL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UDSTAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VRFYFUND" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VRFYFUNDINT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VRFYFUNDPLTY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VRFYFUNDPRIN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="INTPERBAS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PRCCYTYP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UREF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PCREF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
 *         &lt;element name="Contract_Schedules" type="{http://fcubs.ofss.com/service/FCUBSLDService}ScheduleType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Contract_Linkages" type="{http://fcubs.ofss.com/service/FCUBSLDService}LinkageType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Relationship-Linkage" type="{http://fcubs.ofss.com/service/FCUBSLDService}LINKEDENTITYType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Holiday-Currencies" type="{http://fcubs.ofss.com/service/FCUBSLDService}LISTHOLCCYType10" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Brokerage-Master" type="{http://fcubs.ofss.com/service/FCUBSLDService}BrkMasterType" minOccurs="0"/>
 *         &lt;element name="Advice-Details" type="{http://fcubs.ofss.com/service/FCUBSLDService}ADVDETAILSType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Settlement-Split-Master" type="{http://fcubs.ofss.com/service/FCUBSLDService}SplitSettlementFullDetailType" minOccurs="0"/>
 *         &lt;element name="Contract-Rollover" type="{http://fcubs.ofss.com/service/FCUBSLDService}ROLLOVERType12" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LoansandDeposits-IO-Type", propOrder = {
    "xref",
    "fccref",
    "brn",
    "prd",
    "cpty",
    "cptyconfstat",
    "amt",
    "ccy",
    "orglstdt",
    "trndt",
    "valdt",
    "mattype",
    "notcdays",
    "dfltacc",
    "dfltaccbrn",
    "line",
    "dealer",
    "brk",
    "brkconfstat",
    "tdesc",
    "amortype",
    "autprovreqd",
    "cascadeschd",
    "dedtaxcap",
    "dfltsettccy",
    "drsetlac",
    "drsetlacbr",
    "drsetlccy",
    "expcat",
    "holmth",
    "holmthflg",
    "ighol",
    "liqbvsch",
    "liqodsch",
    "lnstmtcyc",
    "lnstmttype",
    "mvacrmth",
    "newcomp",
    "parpymtmliq",
    "prinliqn",
    "rfexpamt",
    "rollallw",
    "rollmeth",
    "rollmech",
    "matdt",
    "schddefnbas",
    "schdmvmt",
    "stmtday",
    "statcont",
    "trckrecvaliq",
    "trckrecvmliq",
    "updutlroll",
    "udstat",
    "vrfyfund",
    "vrfyfundint",
    "vrfyfundplty",
    "vrfyfundprin",
    "intperbas",
    "prccytyp",
    "uref",
    "pcref",
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
    "contractSchedules",
    "contractLinkages",
    "relationshipLinkage",
    "holidayCurrencies",
    "brokerageMaster",
    "adviceDetails",
    "settlementSplitMaster",
    "contractRollover"
})
public class LoansandDepositsIOType {

    @XmlElement(name = "XREF")
    protected String xref;
    @XmlElement(name = "FCCREF", required = true)
    protected String fccref;
    @XmlElement(name = "BRN")
    protected String brn;
    @XmlElement(name = "PRD")
    protected String prd;
    @XmlElement(name = "CPTY")
    protected String cpty;
    @XmlElement(name = "CPTYCONFSTAT")
    protected String cptyconfstat;
    @XmlElement(name = "AMT")
    protected BigDecimal amt;
    @XmlElement(name = "CCY")
    protected String ccy;
    @XmlElement(name = "ORGL_STDT")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar orglstdt;
    @XmlElement(name = "TRNDT")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar trndt;
    @XmlElement(name = "VALDT")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar valdt;
    @XmlElement(name = "MAT_TYPE")
    protected String mattype;
    @XmlElement(name = "NOTC_DAYS")
    protected String notcdays;
    @XmlElement(name = "DFLT_ACC")
    protected String dfltacc;
    @XmlElement(name = "DFLT_ACC_BRN")
    protected String dfltaccbrn;
    @XmlElement(name = "LINE")
    protected String line;
    @XmlElement(name = "DEALER")
    protected String dealer;
    @XmlElement(name = "BRK")
    protected String brk;
    @XmlElement(name = "BRKCONFSTAT")
    protected String brkconfstat;
    @XmlElement(name = "TDESC")
    protected String tdesc;
    @XmlElement(name = "AMORTYPE")
    protected String amortype;
    @XmlElement(name = "AUTPROVREQD")
    protected String autprovreqd;
    @XmlElement(name = "CASCADESCHD")
    protected String cascadeschd;
    @XmlElement(name = "DEDTAXCAP")
    protected String dedtaxcap;
    @XmlElement(name = "DFLTSETTCCY")
    protected String dfltsettccy;
    @XmlElement(name = "DRSETLAC")
    protected String drsetlac;
    @XmlElement(name = "DRSETLACBR")
    protected String drsetlacbr;
    @XmlElement(name = "DRSETLCCY")
    protected String drsetlccy;
    @XmlElement(name = "EXPCAT")
    protected String expcat;
    @XmlElement(name = "HOLMTH")
    protected String holmth;
    @XmlElement(name = "HOLMTHFLG")
    protected String holmthflg;
    @XmlElement(name = "IGHOL")
    protected String ighol;
    @XmlElement(name = "LIQBVSCH")
    protected String liqbvsch;
    @XmlElement(name = "LIQODSCH")
    protected String liqodsch;
    @XmlElement(name = "LNSTMTCYC")
    protected String lnstmtcyc;
    @XmlElement(name = "LNSTMTTYPE")
    protected String lnstmttype;
    @XmlElement(name = "MVACRMTH")
    protected String mvacrmth;
    @XmlElement(name = "NEWCOMP")
    protected String newcomp;
    @XmlElement(name = "PARPYMTMLIQ")
    protected String parpymtmliq;
    @XmlElement(name = "PRINLIQN")
    protected String prinliqn;
    @XmlElement(name = "RFEXPAMT")
    protected BigDecimal rfexpamt;
    @XmlElement(name = "ROLLALLW")
    protected String rollallw;
    @XmlElement(name = "ROLLMETH")
    protected String rollmeth;
    @XmlElement(name = "ROLLMECH")
    protected String rollmech;
    @XmlElement(name = "MATDT")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar matdt;
    @XmlElement(name = "SCHDDEFNBAS")
    protected String schddefnbas;
    @XmlElement(name = "SCHDMVMT")
    protected String schdmvmt;
    @XmlElement(name = "STMTDAY")
    protected BigInteger stmtday;
    @XmlElement(name = "STATCONT")
    protected String statcont;
    @XmlElement(name = "TRCKRECVALIQ")
    protected String trckrecvaliq;
    @XmlElement(name = "TRCKRECVMLIQ")
    protected String trckrecvmliq;
    @XmlElement(name = "UPDUTLROLL")
    protected String updutlroll;
    @XmlElement(name = "UDSTAT")
    protected String udstat;
    @XmlElement(name = "VRFYFUND")
    protected String vrfyfund;
    @XmlElement(name = "VRFYFUNDINT")
    protected String vrfyfundint;
    @XmlElement(name = "VRFYFUNDPLTY")
    protected String vrfyfundplty;
    @XmlElement(name = "VRFYFUNDPRIN")
    protected String vrfyfundprin;
    @XmlElement(name = "INTPERBAS")
    protected String intperbas;
    @XmlElement(name = "PRCCYTYP")
    protected String prccytyp;
    @XmlElement(name = "UREF")
    protected String uref;
    @XmlElement(name = "PCREF")
    protected String pcref;
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
    @XmlElement(name = "Contract_Schedules")
    protected List<ScheduleType> contractSchedules;
    @XmlElement(name = "Contract_Linkages")
    protected List<LinkageType> contractLinkages;
    @XmlElement(name = "Relationship-Linkage")
    protected List<LINKEDENTITYType> relationshipLinkage;
    @XmlElement(name = "Holiday-Currencies")
    protected List<LISTHOLCCYType10> holidayCurrencies;
    @XmlElement(name = "Brokerage-Master")
    protected BrkMasterType brokerageMaster;
    @XmlElement(name = "Advice-Details")
    protected List<ADVDETAILSType> adviceDetails;
    @XmlElement(name = "Settlement-Split-Master")
    protected SplitSettlementFullDetailType settlementSplitMaster;
    @XmlElement(name = "Contract-Rollover")
    protected List<ROLLOVERType12> contractRollover;

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
     * Gets the value of the brn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBRN() {
        return brn;
    }

    /**
     * Sets the value of the brn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBRN(String value) {
        this.brn = value;
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
     * Gets the value of the cptyconfstat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCPTYCONFSTAT() {
        return cptyconfstat;
    }

    /**
     * Sets the value of the cptyconfstat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCPTYCONFSTAT(String value) {
        this.cptyconfstat = value;
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
     * Gets the value of the orglstdt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getORGLSTDT() {
        return orglstdt;
    }

    /**
     * Sets the value of the orglstdt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setORGLSTDT(XMLGregorianCalendar value) {
        this.orglstdt = value;
    }

    /**
     * Gets the value of the trndt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTRNDT() {
        return trndt;
    }

    /**
     * Sets the value of the trndt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTRNDT(XMLGregorianCalendar value) {
        this.trndt = value;
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
     * Gets the value of the mattype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMATTYPE() {
        return mattype;
    }

    /**
     * Sets the value of the mattype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMATTYPE(String value) {
        this.mattype = value;
    }

    /**
     * Gets the value of the notcdays property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNOTCDAYS() {
        return notcdays;
    }

    /**
     * Sets the value of the notcdays property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNOTCDAYS(String value) {
        this.notcdays = value;
    }

    /**
     * Gets the value of the dfltacc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDFLTACC() {
        return dfltacc;
    }

    /**
     * Sets the value of the dfltacc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDFLTACC(String value) {
        this.dfltacc = value;
    }

    /**
     * Gets the value of the dfltaccbrn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDFLTACCBRN() {
        return dfltaccbrn;
    }

    /**
     * Sets the value of the dfltaccbrn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDFLTACCBRN(String value) {
        this.dfltaccbrn = value;
    }

    /**
     * Gets the value of the line property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLINE() {
        return line;
    }

    /**
     * Sets the value of the line property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLINE(String value) {
        this.line = value;
    }

    /**
     * Gets the value of the dealer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDEALER() {
        return dealer;
    }

    /**
     * Sets the value of the dealer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDEALER(String value) {
        this.dealer = value;
    }

    /**
     * Gets the value of the brk property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBRK() {
        return brk;
    }

    /**
     * Sets the value of the brk property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBRK(String value) {
        this.brk = value;
    }

    /**
     * Gets the value of the brkconfstat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBRKCONFSTAT() {
        return brkconfstat;
    }

    /**
     * Sets the value of the brkconfstat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBRKCONFSTAT(String value) {
        this.brkconfstat = value;
    }

    /**
     * Gets the value of the tdesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTDESC() {
        return tdesc;
    }

    /**
     * Sets the value of the tdesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTDESC(String value) {
        this.tdesc = value;
    }

    /**
     * Gets the value of the amortype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAMORTYPE() {
        return amortype;
    }

    /**
     * Sets the value of the amortype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAMORTYPE(String value) {
        this.amortype = value;
    }

    /**
     * Gets the value of the autprovreqd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAUTPROVREQD() {
        return autprovreqd;
    }

    /**
     * Sets the value of the autprovreqd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAUTPROVREQD(String value) {
        this.autprovreqd = value;
    }

    /**
     * Gets the value of the cascadeschd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCASCADESCHD() {
        return cascadeschd;
    }

    /**
     * Sets the value of the cascadeschd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCASCADESCHD(String value) {
        this.cascadeschd = value;
    }

    /**
     * Gets the value of the dedtaxcap property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDEDTAXCAP() {
        return dedtaxcap;
    }

    /**
     * Sets the value of the dedtaxcap property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDEDTAXCAP(String value) {
        this.dedtaxcap = value;
    }

    /**
     * Gets the value of the dfltsettccy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDFLTSETTCCY() {
        return dfltsettccy;
    }

    /**
     * Sets the value of the dfltsettccy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDFLTSETTCCY(String value) {
        this.dfltsettccy = value;
    }

    /**
     * Gets the value of the drsetlac property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDRSETLAC() {
        return drsetlac;
    }

    /**
     * Sets the value of the drsetlac property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDRSETLAC(String value) {
        this.drsetlac = value;
    }

    /**
     * Gets the value of the drsetlacbr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDRSETLACBR() {
        return drsetlacbr;
    }

    /**
     * Sets the value of the drsetlacbr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDRSETLACBR(String value) {
        this.drsetlacbr = value;
    }

    /**
     * Gets the value of the drsetlccy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDRSETLCCY() {
        return drsetlccy;
    }

    /**
     * Sets the value of the drsetlccy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDRSETLCCY(String value) {
        this.drsetlccy = value;
    }

    /**
     * Gets the value of the expcat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXPCAT() {
        return expcat;
    }

    /**
     * Sets the value of the expcat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXPCAT(String value) {
        this.expcat = value;
    }

    /**
     * Gets the value of the holmth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHOLMTH() {
        return holmth;
    }

    /**
     * Sets the value of the holmth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHOLMTH(String value) {
        this.holmth = value;
    }

    /**
     * Gets the value of the holmthflg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHOLMTHFLG() {
        return holmthflg;
    }

    /**
     * Sets the value of the holmthflg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHOLMTHFLG(String value) {
        this.holmthflg = value;
    }

    /**
     * Gets the value of the ighol property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIGHOL() {
        return ighol;
    }

    /**
     * Sets the value of the ighol property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIGHOL(String value) {
        this.ighol = value;
    }

    /**
     * Gets the value of the liqbvsch property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLIQBVSCH() {
        return liqbvsch;
    }

    /**
     * Sets the value of the liqbvsch property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLIQBVSCH(String value) {
        this.liqbvsch = value;
    }

    /**
     * Gets the value of the liqodsch property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLIQODSCH() {
        return liqodsch;
    }

    /**
     * Sets the value of the liqodsch property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLIQODSCH(String value) {
        this.liqodsch = value;
    }

    /**
     * Gets the value of the lnstmtcyc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLNSTMTCYC() {
        return lnstmtcyc;
    }

    /**
     * Sets the value of the lnstmtcyc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLNSTMTCYC(String value) {
        this.lnstmtcyc = value;
    }

    /**
     * Gets the value of the lnstmttype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLNSTMTTYPE() {
        return lnstmttype;
    }

    /**
     * Sets the value of the lnstmttype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLNSTMTTYPE(String value) {
        this.lnstmttype = value;
    }

    /**
     * Gets the value of the mvacrmth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMVACRMTH() {
        return mvacrmth;
    }

    /**
     * Sets the value of the mvacrmth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMVACRMTH(String value) {
        this.mvacrmth = value;
    }

    /**
     * Gets the value of the newcomp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNEWCOMP() {
        return newcomp;
    }

    /**
     * Sets the value of the newcomp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNEWCOMP(String value) {
        this.newcomp = value;
    }

    /**
     * Gets the value of the parpymtmliq property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPARPYMTMLIQ() {
        return parpymtmliq;
    }

    /**
     * Sets the value of the parpymtmliq property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPARPYMTMLIQ(String value) {
        this.parpymtmliq = value;
    }

    /**
     * Gets the value of the prinliqn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRINLIQN() {
        return prinliqn;
    }

    /**
     * Sets the value of the prinliqn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRINLIQN(String value) {
        this.prinliqn = value;
    }

    /**
     * Gets the value of the rfexpamt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRFEXPAMT() {
        return rfexpamt;
    }

    /**
     * Sets the value of the rfexpamt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRFEXPAMT(BigDecimal value) {
        this.rfexpamt = value;
    }

    /**
     * Gets the value of the rollallw property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getROLLALLW() {
        return rollallw;
    }

    /**
     * Sets the value of the rollallw property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setROLLALLW(String value) {
        this.rollallw = value;
    }

    /**
     * Gets the value of the rollmeth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getROLLMETH() {
        return rollmeth;
    }

    /**
     * Sets the value of the rollmeth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setROLLMETH(String value) {
        this.rollmeth = value;
    }

    /**
     * Gets the value of the rollmech property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getROLLMECH() {
        return rollmech;
    }

    /**
     * Sets the value of the rollmech property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setROLLMECH(String value) {
        this.rollmech = value;
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
     * Gets the value of the schddefnbas property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSCHDDEFNBAS() {
        return schddefnbas;
    }

    /**
     * Sets the value of the schddefnbas property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSCHDDEFNBAS(String value) {
        this.schddefnbas = value;
    }

    /**
     * Gets the value of the schdmvmt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSCHDMVMT() {
        return schdmvmt;
    }

    /**
     * Sets the value of the schdmvmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSCHDMVMT(String value) {
        this.schdmvmt = value;
    }

    /**
     * Gets the value of the stmtday property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSTMTDAY() {
        return stmtday;
    }

    /**
     * Sets the value of the stmtday property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSTMTDAY(BigInteger value) {
        this.stmtday = value;
    }

    /**
     * Gets the value of the statcont property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTATCONT() {
        return statcont;
    }

    /**
     * Sets the value of the statcont property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSTATCONT(String value) {
        this.statcont = value;
    }

    /**
     * Gets the value of the trckrecvaliq property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTRCKRECVALIQ() {
        return trckrecvaliq;
    }

    /**
     * Sets the value of the trckrecvaliq property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTRCKRECVALIQ(String value) {
        this.trckrecvaliq = value;
    }

    /**
     * Gets the value of the trckrecvmliq property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTRCKRECVMLIQ() {
        return trckrecvmliq;
    }

    /**
     * Sets the value of the trckrecvmliq property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTRCKRECVMLIQ(String value) {
        this.trckrecvmliq = value;
    }

    /**
     * Gets the value of the updutlroll property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUPDUTLROLL() {
        return updutlroll;
    }

    /**
     * Sets the value of the updutlroll property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUPDUTLROLL(String value) {
        this.updutlroll = value;
    }

    /**
     * Gets the value of the udstat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUDSTAT() {
        return udstat;
    }

    /**
     * Sets the value of the udstat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUDSTAT(String value) {
        this.udstat = value;
    }

    /**
     * Gets the value of the vrfyfund property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVRFYFUND() {
        return vrfyfund;
    }

    /**
     * Sets the value of the vrfyfund property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVRFYFUND(String value) {
        this.vrfyfund = value;
    }

    /**
     * Gets the value of the vrfyfundint property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVRFYFUNDINT() {
        return vrfyfundint;
    }

    /**
     * Sets the value of the vrfyfundint property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVRFYFUNDINT(String value) {
        this.vrfyfundint = value;
    }

    /**
     * Gets the value of the vrfyfundplty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVRFYFUNDPLTY() {
        return vrfyfundplty;
    }

    /**
     * Sets the value of the vrfyfundplty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVRFYFUNDPLTY(String value) {
        this.vrfyfundplty = value;
    }

    /**
     * Gets the value of the vrfyfundprin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVRFYFUNDPRIN() {
        return vrfyfundprin;
    }

    /**
     * Sets the value of the vrfyfundprin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVRFYFUNDPRIN(String value) {
        this.vrfyfundprin = value;
    }

    /**
     * Gets the value of the intperbas property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINTPERBAS() {
        return intperbas;
    }

    /**
     * Sets the value of the intperbas property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINTPERBAS(String value) {
        this.intperbas = value;
    }

    /**
     * Gets the value of the prccytyp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRCCYTYP() {
        return prccytyp;
    }

    /**
     * Sets the value of the prccytyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRCCYTYP(String value) {
        this.prccytyp = value;
    }

    /**
     * Gets the value of the uref property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUREF() {
        return uref;
    }

    /**
     * Sets the value of the uref property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUREF(String value) {
        this.uref = value;
    }

    /**
     * Gets the value of the pcref property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPCREF() {
        return pcref;
    }

    /**
     * Sets the value of the pcref property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPCREF(String value) {
        this.pcref = value;
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
     * Gets the value of the holidayCurrencies property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the holidayCurrencies property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHolidayCurrencies().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LISTHOLCCYType10 }
     * 
     * 
     */
    public List<LISTHOLCCYType10> getHolidayCurrencies() {
        if (holidayCurrencies == null) {
            holidayCurrencies = new ArrayList<LISTHOLCCYType10>();
        }
        return this.holidayCurrencies;
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
     * Gets the value of the contractRollover property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contractRollover property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContractRollover().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ROLLOVERType12 }
     * 
     * 
     */
    public List<ROLLOVERType12> getContractRollover() {
        if (contractRollover == null) {
            contractRollover = new ArrayList<ROLLOVERType12>();
        }
        return this.contractRollover;
    }

}
