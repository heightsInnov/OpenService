
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
 * <p>Java class for LDValueDatedDetails-IO-Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LDValueDatedDetails-IO-Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="XREF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FCCREF" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="EVNT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EVNTDT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="MAKERID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="MATDT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="VALDT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
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
 *         &lt;element name="Contract-Schedules" type="{http://fcubs.ofss.com/service/FCUBSLDService}ScheduleType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Contract-Linkages" type="{http://fcubs.ofss.com/service/FCUBSLDService}LinkageType" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "LDValueDatedDetails-IO-Type", propOrder = {
    "xref",
    "fccref",
    "evnt",
    "evntdt",
    "makerid",
    "amt",
    "matdt",
    "valdt",
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
    "brokerageMaster",
    "adviceDetails",
    "settlementSplitMaster"
})
public class LDValueDatedDetailsIOType {

    @XmlElement(name = "XREF")
    protected String xref;
    @XmlElement(name = "FCCREF", required = true)
    protected String fccref;
    @XmlElement(name = "EVNT")
    protected String evnt;
    @XmlElement(name = "EVNTDT")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar evntdt;
    @XmlElement(name = "MAKERID")
    protected String makerid;
    @XmlElement(name = "AMT")
    protected BigDecimal amt;
    @XmlElement(name = "MATDT")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar matdt;
    @XmlElement(name = "VALDT")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar valdt;
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
    @XmlElement(name = "Contract-Schedules")
    protected List<ScheduleType> contractSchedules;
    @XmlElement(name = "Contract-Linkages")
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

}
