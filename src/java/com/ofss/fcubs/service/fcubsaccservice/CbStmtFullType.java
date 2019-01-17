
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
 * <p>Java class for CbStmt-Full-Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CbStmt-Full-Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="STMT_ID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CUSNO" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ALL_ACCOUNTS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BD_VD_BAL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="STMT_FORMAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FREQUENCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="STMT_DAY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="APPLY_CHARGE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CHARGE_ACC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CHARGE_ACC_BRN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CHARGE_CCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PREV_STMT_DATE" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="NO_PREV_STMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="CUST_DESC1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MAKER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MAKERSTAMP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CHECKER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CHECKERSTAMP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MODNO" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="TXNSTAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AUTHSTAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Casa" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ACCOUNT_NO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="BRN_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="AC_DESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Td" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ACCOUNT_NO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="BRN_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="AC_DESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Loan" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ACCOUNT_NO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="BRN_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "CbStmt-Full-Type", propOrder = {
    "stmtid",
    "cusno",
    "allaccounts",
    "bdvdbal",
    "stmtformat",
    "frequency",
    "stmtday",
    "applycharge",
    "chargeacc",
    "chargeaccbrn",
    "chargeccy",
    "prevstmtdate",
    "noprevstmt",
    "custdesc1",
    "maker",
    "makerstamp",
    "checker",
    "checkerstamp",
    "modno",
    "txnstat",
    "authstat",
    "casa",
    "td",
    "loan"
})
public class CbStmtFullType {

    @XmlElement(name = "STMT_ID", required = true)
    protected String stmtid;
    @XmlElement(name = "CUSNO", required = true)
    protected String cusno;
    @XmlElement(name = "ALL_ACCOUNTS")
    protected String allaccounts;
    @XmlElement(name = "BD_VD_BAL")
    protected String bdvdbal;
    @XmlElement(name = "STMT_FORMAT")
    protected String stmtformat;
    @XmlElement(name = "FREQUENCY")
    protected String frequency;
    @XmlElement(name = "STMT_DAY")
    protected String stmtday;
    @XmlElement(name = "APPLY_CHARGE")
    protected String applycharge;
    @XmlElement(name = "CHARGE_ACC")
    protected String chargeacc;
    @XmlElement(name = "CHARGE_ACC_BRN")
    protected String chargeaccbrn;
    @XmlElement(name = "CHARGE_CCY")
    protected String chargeccy;
    @XmlElement(name = "PREV_STMT_DATE")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar prevstmtdate;
    @XmlElement(name = "NO_PREV_STMT")
    protected BigDecimal noprevstmt;
    @XmlElement(name = "CUST_DESC1")
    protected String custdesc1;
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
    @XmlElement(name = "Casa")
    protected List<CbStmtFullType.Casa> casa;
    @XmlElement(name = "Td")
    protected List<CbStmtFullType.Td> td;
    @XmlElement(name = "Loan")
    protected List<CbStmtFullType.Loan> loan;

    /**
     * Gets the value of the stmtid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTMTID() {
        return stmtid;
    }

    /**
     * Sets the value of the stmtid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSTMTID(String value) {
        this.stmtid = value;
    }

    /**
     * Gets the value of the cusno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCUSNO() {
        return cusno;
    }

    /**
     * Sets the value of the cusno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCUSNO(String value) {
        this.cusno = value;
    }

    /**
     * Gets the value of the allaccounts property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getALLACCOUNTS() {
        return allaccounts;
    }

    /**
     * Sets the value of the allaccounts property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setALLACCOUNTS(String value) {
        this.allaccounts = value;
    }

    /**
     * Gets the value of the bdvdbal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBDVDBAL() {
        return bdvdbal;
    }

    /**
     * Sets the value of the bdvdbal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBDVDBAL(String value) {
        this.bdvdbal = value;
    }

    /**
     * Gets the value of the stmtformat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTMTFORMAT() {
        return stmtformat;
    }

    /**
     * Sets the value of the stmtformat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSTMTFORMAT(String value) {
        this.stmtformat = value;
    }

    /**
     * Gets the value of the frequency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFREQUENCY() {
        return frequency;
    }

    /**
     * Sets the value of the frequency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFREQUENCY(String value) {
        this.frequency = value;
    }

    /**
     * Gets the value of the stmtday property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTMTDAY() {
        return stmtday;
    }

    /**
     * Sets the value of the stmtday property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSTMTDAY(String value) {
        this.stmtday = value;
    }

    /**
     * Gets the value of the applycharge property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPPLYCHARGE() {
        return applycharge;
    }

    /**
     * Sets the value of the applycharge property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPPLYCHARGE(String value) {
        this.applycharge = value;
    }

    /**
     * Gets the value of the chargeacc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCHARGEACC() {
        return chargeacc;
    }

    /**
     * Sets the value of the chargeacc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCHARGEACC(String value) {
        this.chargeacc = value;
    }

    /**
     * Gets the value of the chargeaccbrn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCHARGEACCBRN() {
        return chargeaccbrn;
    }

    /**
     * Sets the value of the chargeaccbrn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCHARGEACCBRN(String value) {
        this.chargeaccbrn = value;
    }

    /**
     * Gets the value of the chargeccy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCHARGECCY() {
        return chargeccy;
    }

    /**
     * Sets the value of the chargeccy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCHARGECCY(String value) {
        this.chargeccy = value;
    }

    /**
     * Gets the value of the prevstmtdate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPREVSTMTDATE() {
        return prevstmtdate;
    }

    /**
     * Sets the value of the prevstmtdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPREVSTMTDATE(XMLGregorianCalendar value) {
        this.prevstmtdate = value;
    }

    /**
     * Gets the value of the noprevstmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNOPREVSTMT() {
        return noprevstmt;
    }

    /**
     * Sets the value of the noprevstmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNOPREVSTMT(BigDecimal value) {
        this.noprevstmt = value;
    }

    /**
     * Gets the value of the custdesc1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCUSTDESC1() {
        return custdesc1;
    }

    /**
     * Sets the value of the custdesc1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCUSTDESC1(String value) {
        this.custdesc1 = value;
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
     * Gets the value of the casa property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the casa property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCasa().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CbStmtFullType.Casa }
     * 
     * 
     */
    public List<CbStmtFullType.Casa> getCasa() {
        if (casa == null) {
            casa = new ArrayList<CbStmtFullType.Casa>();
        }
        return this.casa;
    }

    /**
     * Gets the value of the td property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the td property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTd().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CbStmtFullType.Td }
     * 
     * 
     */
    public List<CbStmtFullType.Td> getTd() {
        if (td == null) {
            td = new ArrayList<CbStmtFullType.Td>();
        }
        return this.td;
    }

    /**
     * Gets the value of the loan property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the loan property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLoan().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CbStmtFullType.Loan }
     * 
     * 
     */
    public List<CbStmtFullType.Loan> getLoan() {
        if (loan == null) {
            loan = new ArrayList<CbStmtFullType.Loan>();
        }
        return this.loan;
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
     *         &lt;element name="ACCOUNT_NO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="BRN_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="AC_DESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "accountno",
        "brncode",
        "acdesc"
    })
    public static class Casa {

        @XmlElement(name = "ACCOUNT_NO")
        protected String accountno;
        @XmlElement(name = "BRN_CODE")
        protected String brncode;
        @XmlElement(name = "AC_DESC")
        protected String acdesc;

        /**
         * Gets the value of the accountno property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getACCOUNTNO() {
            return accountno;
        }

        /**
         * Sets the value of the accountno property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setACCOUNTNO(String value) {
            this.accountno = value;
        }

        /**
         * Gets the value of the brncode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBRNCODE() {
            return brncode;
        }

        /**
         * Sets the value of the brncode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBRNCODE(String value) {
            this.brncode = value;
        }

        /**
         * Gets the value of the acdesc property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getACDESC() {
            return acdesc;
        }

        /**
         * Sets the value of the acdesc property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setACDESC(String value) {
            this.acdesc = value;
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
     *         &lt;element name="ACCOUNT_NO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="BRN_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "accountno",
        "brncode"
    })
    public static class Loan {

        @XmlElement(name = "ACCOUNT_NO")
        protected String accountno;
        @XmlElement(name = "BRN_CODE")
        protected String brncode;

        /**
         * Gets the value of the accountno property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getACCOUNTNO() {
            return accountno;
        }

        /**
         * Sets the value of the accountno property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setACCOUNTNO(String value) {
            this.accountno = value;
        }

        /**
         * Gets the value of the brncode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBRNCODE() {
            return brncode;
        }

        /**
         * Sets the value of the brncode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBRNCODE(String value) {
            this.brncode = value;
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
     *         &lt;element name="ACCOUNT_NO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="BRN_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="AC_DESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "accountno",
        "brncode",
        "acdesc"
    })
    public static class Td {

        @XmlElement(name = "ACCOUNT_NO")
        protected String accountno;
        @XmlElement(name = "BRN_CODE")
        protected String brncode;
        @XmlElement(name = "AC_DESC")
        protected String acdesc;

        /**
         * Gets the value of the accountno property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getACCOUNTNO() {
            return accountno;
        }

        /**
         * Sets the value of the accountno property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setACCOUNTNO(String value) {
            this.accountno = value;
        }

        /**
         * Gets the value of the brncode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBRNCODE() {
            return brncode;
        }

        /**
         * Sets the value of the brncode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBRNCODE(String value) {
            this.brncode = value;
        }

        /**
         * Gets the value of the acdesc property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getACDESC() {
            return acdesc;
        }

        /**
         * Sets the value of the acdesc property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setACDESC(String value) {
            this.acdesc = value;
        }

    }

}
