
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
 * <p>Java class for AutoDepIns-Full-Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AutoDepIns-Full-Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BRANCH_CODE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="AC_NO" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ACLASS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DEPACCCLS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACC_CCY_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AMOUNT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="CUSTOMER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DEPCCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SEQ_NO" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="SWPTOACC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="XREF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MINREQBL" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="SWEEP_MULTIPLE_OF" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="RETRY_TILL_DATE" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="START_DATE" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="SWPTOACBRN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TENOR" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="SCODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DEPTENYEARS" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="MONTHS" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="DAYS" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="MAKER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MAKERSTAMP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CHECKER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CHECKERSTAMP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MODNO" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="TXNSTAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AUTHSTAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UDFDETAILS" type="{http://fcubs.ofss.com/service/FCUBSAccService}UDFDETAILSType2" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AutoDepIns-Full-Type", propOrder = {
    "branchcode",
    "acno",
    "aclass",
    "depacccls",
    "accccycode",
    "amount",
    "customer",
    "depccy",
    "seqno",
    "swptoacc",
    "xref",
    "minreqbl",
    "sweepmultipleof",
    "retrytilldate",
    "startdate",
    "swptoacbrn",
    "tenor",
    "scode",
    "deptenyears",
    "months",
    "days",
    "maker",
    "makerstamp",
    "checker",
    "checkerstamp",
    "modno",
    "txnstat",
    "authstat",
    "udfdetails"
})
public class AutoDepInsFullType {

    @XmlElement(name = "BRANCH_CODE", required = true)
    protected String branchcode;
    @XmlElement(name = "AC_NO", required = true)
    protected String acno;
    @XmlElement(name = "ACLASS")
    protected String aclass;
    @XmlElement(name = "DEPACCCLS")
    protected String depacccls;
    @XmlElement(name = "ACC_CCY_CODE")
    protected String accccycode;
    @XmlElement(name = "AMOUNT")
    protected BigDecimal amount;
    @XmlElement(name = "CUSTOMER")
    protected String customer;
    @XmlElement(name = "DEPCCY")
    protected String depccy;
    @XmlElement(name = "SEQ_NO", required = true)
    protected BigDecimal seqno;
    @XmlElement(name = "SWPTOACC")
    protected String swptoacc;
    @XmlElement(name = "XREF")
    protected String xref;
    @XmlElement(name = "MINREQBL")
    protected BigDecimal minreqbl;
    @XmlElement(name = "SWEEP_MULTIPLE_OF")
    protected BigDecimal sweepmultipleof;
    @XmlElement(name = "RETRY_TILL_DATE")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar retrytilldate;
    @XmlElement(name = "START_DATE")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar startdate;
    @XmlElement(name = "SWPTOACBRN")
    protected String swptoacbrn;
    @XmlElement(name = "TENOR")
    protected BigDecimal tenor;
    @XmlElement(name = "SCODE")
    protected String scode;
    @XmlElement(name = "DEPTENYEARS")
    protected BigDecimal deptenyears;
    @XmlElement(name = "MONTHS")
    protected BigDecimal months;
    @XmlElement(name = "DAYS")
    protected BigDecimal days;
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
    @XmlElement(name = "UDFDETAILS")
    protected List<UDFDETAILSType2> udfdetails;

    /**
     * Gets the value of the branchcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBRANCHCODE() {
        return branchcode;
    }

    /**
     * Sets the value of the branchcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBRANCHCODE(String value) {
        this.branchcode = value;
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
     * Gets the value of the aclass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACLASS() {
        return aclass;
    }

    /**
     * Sets the value of the aclass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACLASS(String value) {
        this.aclass = value;
    }

    /**
     * Gets the value of the depacccls property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDEPACCCLS() {
        return depacccls;
    }

    /**
     * Sets the value of the depacccls property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDEPACCCLS(String value) {
        this.depacccls = value;
    }

    /**
     * Gets the value of the accccycode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACCCCYCODE() {
        return accccycode;
    }

    /**
     * Sets the value of the accccycode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACCCCYCODE(String value) {
        this.accccycode = value;
    }

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAMOUNT() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAMOUNT(BigDecimal value) {
        this.amount = value;
    }

    /**
     * Gets the value of the customer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCUSTOMER() {
        return customer;
    }

    /**
     * Sets the value of the customer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCUSTOMER(String value) {
        this.customer = value;
    }

    /**
     * Gets the value of the depccy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDEPCCY() {
        return depccy;
    }

    /**
     * Sets the value of the depccy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDEPCCY(String value) {
        this.depccy = value;
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

    /**
     * Gets the value of the swptoacc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSWPTOACC() {
        return swptoacc;
    }

    /**
     * Sets the value of the swptoacc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSWPTOACC(String value) {
        this.swptoacc = value;
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
     * Gets the value of the minreqbl property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMINREQBL() {
        return minreqbl;
    }

    /**
     * Sets the value of the minreqbl property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMINREQBL(BigDecimal value) {
        this.minreqbl = value;
    }

    /**
     * Gets the value of the sweepmultipleof property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSWEEPMULTIPLEOF() {
        return sweepmultipleof;
    }

    /**
     * Sets the value of the sweepmultipleof property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSWEEPMULTIPLEOF(BigDecimal value) {
        this.sweepmultipleof = value;
    }

    /**
     * Gets the value of the retrytilldate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRETRYTILLDATE() {
        return retrytilldate;
    }

    /**
     * Sets the value of the retrytilldate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRETRYTILLDATE(XMLGregorianCalendar value) {
        this.retrytilldate = value;
    }

    /**
     * Gets the value of the startdate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSTARTDATE() {
        return startdate;
    }

    /**
     * Sets the value of the startdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSTARTDATE(XMLGregorianCalendar value) {
        this.startdate = value;
    }

    /**
     * Gets the value of the swptoacbrn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSWPTOACBRN() {
        return swptoacbrn;
    }

    /**
     * Sets the value of the swptoacbrn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSWPTOACBRN(String value) {
        this.swptoacbrn = value;
    }

    /**
     * Gets the value of the tenor property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTENOR() {
        return tenor;
    }

    /**
     * Sets the value of the tenor property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTENOR(BigDecimal value) {
        this.tenor = value;
    }

    /**
     * Gets the value of the scode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSCODE() {
        return scode;
    }

    /**
     * Sets the value of the scode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSCODE(String value) {
        this.scode = value;
    }

    /**
     * Gets the value of the deptenyears property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDEPTENYEARS() {
        return deptenyears;
    }

    /**
     * Sets the value of the deptenyears property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDEPTENYEARS(BigDecimal value) {
        this.deptenyears = value;
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
     * Gets the value of the days property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDAYS() {
        return days;
    }

    /**
     * Sets the value of the days property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDAYS(BigDecimal value) {
        this.days = value;
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
     * Gets the value of the udfdetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the udfdetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUDFDETAILS().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UDFDETAILSType2 }
     * 
     * 
     */
    public List<UDFDETAILSType2> getUDFDETAILS() {
        if (udfdetails == null) {
            udfdetails = new ArrayList<UDFDETAILSType2>();
        }
        return this.udfdetails;
    }

}
