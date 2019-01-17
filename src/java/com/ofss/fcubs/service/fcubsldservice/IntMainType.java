
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
 * <p>Java class for IntMainType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IntMainType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="INTCOMP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VALDT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="TXNDT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="INTAMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="CHDAMDMNT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="INTCCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EVNT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ESN" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="PKUPEVSQ" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="INTBASIS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="INTRATE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="INTRATECODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="INTSPREAD" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="AQRDAMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="WAIVER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACREQD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RTTYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MAXRRATE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="MINRATE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="RETENOR" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="BORLENIND" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RTCALCTYP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CUSTMARG" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="UNT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NOUNIT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="RTCDUSE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CONASDISC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DENOBASIS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BASIS366" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NOINTPRD" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="MINSPREAD" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="MAXSPREAD" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="MARGIN" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="INTDESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="INTCMPDESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EFFCTIVERATE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Interest-Details" type="{http://fcubs.ofss.com/service/FCUBSLDService}IntDetailType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IntMainType", propOrder = {
    "intcomp",
    "valdt",
    "txndt",
    "intamt",
    "chdamdmnt",
    "intccy",
    "evnt",
    "esn",
    "pkupevsq",
    "intbasis",
    "intrate",
    "intratecode",
    "intspread",
    "aqrdamt",
    "waiver",
    "acreqd",
    "rttype",
    "maxrrate",
    "minrate",
    "retenor",
    "borlenind",
    "rtcalctyp",
    "custmarg",
    "unt",
    "nounit",
    "rtcduse",
    "conasdisc",
    "denobasis",
    "basis366",
    "nointprd",
    "minspread",
    "maxspread",
    "margin",
    "intdesc",
    "intcmpdesc",
    "effctiverate",
    "interestDetails"
})
public class IntMainType {

    @XmlElement(name = "INTCOMP")
    protected String intcomp;
    @XmlElement(name = "VALDT")
    //@XmlSchemaType(name = "date")
    protected String valdt;
    @XmlElement(name = "TXNDT")
    //@XmlSchemaType(name = "date")
    protected String txndt;
    @XmlElement(name = "INTAMT")
    protected BigDecimal intamt;
    @XmlElement(name = "CHDAMDMNT")
    protected String chdamdmnt;
    @XmlElement(name = "INTCCY")
    protected String intccy;
    @XmlElement(name = "EVNT")
    protected String evnt;
    @XmlElement(name = "ESN")
    protected BigInteger esn;
    @XmlElement(name = "PKUPEVSQ")
    protected BigInteger pkupevsq;
    @XmlElement(name = "INTBASIS")
    protected String intbasis;
    @XmlElement(name = "INTRATE")
    protected BigDecimal intrate;
    @XmlElement(name = "INTRATECODE")
    protected String intratecode;
    @XmlElement(name = "INTSPREAD")
    protected BigDecimal intspread;
    @XmlElement(name = "AQRDAMT")
    protected BigDecimal aqrdamt;
    @XmlElement(name = "WAIVER")
    protected String waiver;
    @XmlElement(name = "ACREQD")
    protected String acreqd;
    @XmlElement(name = "RTTYPE")
    protected String rttype;
    @XmlElement(name = "MAXRRATE")
    protected BigDecimal maxrrate;
    @XmlElement(name = "MINRATE")
    protected BigDecimal minrate;
    @XmlElement(name = "RETENOR")
    protected BigDecimal retenor;
    @XmlElement(name = "BORLENIND")
    protected String borlenind;
    @XmlElement(name = "RTCALCTYP")
    protected String rtcalctyp;
    @XmlElement(name = "CUSTMARG")
    protected BigDecimal custmarg;
    @XmlElement(name = "UNT")
    protected String unt;
    @XmlElement(name = "NOUNIT")
    protected BigDecimal nounit;
    @XmlElement(name = "RTCDUSE")
    protected String rtcduse;
    @XmlElement(name = "CONASDISC")
    protected String conasdisc;
    @XmlElement(name = "DENOBASIS")
    protected String denobasis;
    @XmlElement(name = "BASIS366")
    protected String basis366;
    @XmlElement(name = "NOINTPRD")
    protected BigDecimal nointprd;
    @XmlElement(name = "MINSPREAD")
    protected BigDecimal minspread;
    @XmlElement(name = "MAXSPREAD")
    protected BigDecimal maxspread;
    @XmlElement(name = "MARGIN")
    protected BigDecimal margin;
    @XmlElement(name = "INTDESC")
    protected String intdesc;
    @XmlElement(name = "INTCMPDESC")
    protected String intcmpdesc;
    @XmlElement(name = "EFFCTIVERATE")
    protected BigDecimal effctiverate;
    @XmlElement(name = "Interest-Details")
    protected List<IntDetailType> interestDetails;

    /**
     * Gets the value of the intcomp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINTCOMP() {
        return intcomp;
    }

    /**
     * Sets the value of the intcomp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINTCOMP(String value) {
        this.intcomp = value;
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
     * Gets the value of the txndt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public String getTXNDT() {
        return txndt;
    }

    /**
     * Sets the value of the txndt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTXNDT(String value) {
        this.txndt = value;
    }

    /**
     * Gets the value of the intamt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getINTAMT() {
        return intamt;
    }

    /**
     * Sets the value of the intamt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setINTAMT(BigDecimal value) {
        this.intamt = value;
    }

    /**
     * Gets the value of the chdamdmnt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCHDAMDMNT() {
        return chdamdmnt;
    }

    /**
     * Sets the value of the chdamdmnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCHDAMDMNT(String value) {
        this.chdamdmnt = value;
    }

    /**
     * Gets the value of the intccy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINTCCY() {
        return intccy;
    }

    /**
     * Sets the value of the intccy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINTCCY(String value) {
        this.intccy = value;
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
     * Gets the value of the esn property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getESN() {
        return esn;
    }

    /**
     * Sets the value of the esn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setESN(BigInteger value) {
        this.esn = value;
    }

    /**
     * Gets the value of the pkupevsq property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPKUPEVSQ() {
        return pkupevsq;
    }

    /**
     * Sets the value of the pkupevsq property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPKUPEVSQ(BigInteger value) {
        this.pkupevsq = value;
    }

    /**
     * Gets the value of the intbasis property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINTBASIS() {
        return intbasis;
    }

    /**
     * Sets the value of the intbasis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINTBASIS(String value) {
        this.intbasis = value;
    }

    /**
     * Gets the value of the intrate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getINTRATE() {
        return intrate;
    }

    /**
     * Sets the value of the intrate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setINTRATE(BigDecimal value) {
        this.intrate = value;
    }

    /**
     * Gets the value of the intratecode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINTRATECODE() {
        return intratecode;
    }

    /**
     * Sets the value of the intratecode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINTRATECODE(String value) {
        this.intratecode = value;
    }

    /**
     * Gets the value of the intspread property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getINTSPREAD() {
        return intspread;
    }

    /**
     * Sets the value of the intspread property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setINTSPREAD(BigDecimal value) {
        this.intspread = value;
    }

    /**
     * Gets the value of the aqrdamt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAQRDAMT() {
        return aqrdamt;
    }

    /**
     * Sets the value of the aqrdamt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAQRDAMT(BigDecimal value) {
        this.aqrdamt = value;
    }

    /**
     * Gets the value of the waiver property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWAIVER() {
        return waiver;
    }

    /**
     * Sets the value of the waiver property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWAIVER(String value) {
        this.waiver = value;
    }

    /**
     * Gets the value of the acreqd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACREQD() {
        return acreqd;
    }

    /**
     * Sets the value of the acreqd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACREQD(String value) {
        this.acreqd = value;
    }

    /**
     * Gets the value of the rttype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRTTYPE() {
        return rttype;
    }

    /**
     * Sets the value of the rttype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRTTYPE(String value) {
        this.rttype = value;
    }

    /**
     * Gets the value of the maxrrate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMAXRRATE() {
        return maxrrate;
    }

    /**
     * Sets the value of the maxrrate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMAXRRATE(BigDecimal value) {
        this.maxrrate = value;
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
     * Gets the value of the retenor property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRETENOR() {
        return retenor;
    }

    /**
     * Sets the value of the retenor property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRETENOR(BigDecimal value) {
        this.retenor = value;
    }

    /**
     * Gets the value of the borlenind property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBORLENIND() {
        return borlenind;
    }

    /**
     * Sets the value of the borlenind property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBORLENIND(String value) {
        this.borlenind = value;
    }

    /**
     * Gets the value of the rtcalctyp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRTCALCTYP() {
        return rtcalctyp;
    }

    /**
     * Sets the value of the rtcalctyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRTCALCTYP(String value) {
        this.rtcalctyp = value;
    }

    /**
     * Gets the value of the custmarg property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCUSTMARG() {
        return custmarg;
    }

    /**
     * Sets the value of the custmarg property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCUSTMARG(BigDecimal value) {
        this.custmarg = value;
    }

    /**
     * Gets the value of the unt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUNT() {
        return unt;
    }

    /**
     * Sets the value of the unt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUNT(String value) {
        this.unt = value;
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
     * Gets the value of the rtcduse property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRTCDUSE() {
        return rtcduse;
    }

    /**
     * Sets the value of the rtcduse property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRTCDUSE(String value) {
        this.rtcduse = value;
    }

    /**
     * Gets the value of the conasdisc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCONASDISC() {
        return conasdisc;
    }

    /**
     * Sets the value of the conasdisc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCONASDISC(String value) {
        this.conasdisc = value;
    }

    /**
     * Gets the value of the denobasis property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDENOBASIS() {
        return denobasis;
    }

    /**
     * Sets the value of the denobasis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDENOBASIS(String value) {
        this.denobasis = value;
    }

    /**
     * Gets the value of the basis366 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBASIS366() {
        return basis366;
    }

    /**
     * Sets the value of the basis366 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBASIS366(String value) {
        this.basis366 = value;
    }

    /**
     * Gets the value of the nointprd property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNOINTPRD() {
        return nointprd;
    }

    /**
     * Sets the value of the nointprd property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNOINTPRD(BigDecimal value) {
        this.nointprd = value;
    }

    /**
     * Gets the value of the minspread property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMINSPREAD() {
        return minspread;
    }

    /**
     * Sets the value of the minspread property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMINSPREAD(BigDecimal value) {
        this.minspread = value;
    }

    /**
     * Gets the value of the maxspread property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMAXSPREAD() {
        return maxspread;
    }

    /**
     * Sets the value of the maxspread property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMAXSPREAD(BigDecimal value) {
        this.maxspread = value;
    }

    /**
     * Gets the value of the margin property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMARGIN() {
        return margin;
    }

    /**
     * Sets the value of the margin property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMARGIN(BigDecimal value) {
        this.margin = value;
    }

    /**
     * Gets the value of the intdesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINTDESC() {
        return intdesc;
    }

    /**
     * Sets the value of the intdesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINTDESC(String value) {
        this.intdesc = value;
    }

    /**
     * Gets the value of the intcmpdesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINTCMPDESC() {
        return intcmpdesc;
    }

    /**
     * Sets the value of the intcmpdesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINTCMPDESC(String value) {
        this.intcmpdesc = value;
    }

    /**
     * Gets the value of the effctiverate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEFFCTIVERATE() {
        return effctiverate;
    }

    /**
     * Sets the value of the effctiverate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setEFFCTIVERATE(BigDecimal value) {
        this.effctiverate = value;
    }

    /**
     * Gets the value of the interestDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the interestDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInterestDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IntDetailType }
     * 
     * 
     */
    public List<IntDetailType> getInterestDetails() {
        if (interestDetails == null) {
            interestDetails = new ArrayList<IntDetailType>();
        }
        return this.interestDetails;
    }

}
