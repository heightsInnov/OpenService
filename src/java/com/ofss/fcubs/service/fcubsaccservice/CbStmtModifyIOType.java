
package com.ofss.fcubs.service.fcubsaccservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CbStmt-Modify-IO-Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CbStmt-Modify-IO-Type">
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
 *         &lt;element name="MAKER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MAKERSTAMP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Casa" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="STMT_IDCASA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="CUST_NOCASA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ACCOUNT_NO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="BRN_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="AC_DESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Td" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="STMT_IDTD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="CUST_NOTD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ACCOUNT_NO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="BRN_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="AC_DESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Loan" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="STMT_IDLOAN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="CUST_NOLOAN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "CbStmt-Modify-IO-Type", propOrder = {
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
    "maker",
    "makerstamp",
    "casa",
    "td",
    "loan"
})
public class CbStmtModifyIOType {

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
    @XmlElement(name = "MAKER")
    protected String maker;
    @XmlElement(name = "MAKERSTAMP")
    protected String makerstamp;
    @XmlElement(name = "Casa", required = true)
    protected List<CbStmtModifyIOType.Casa> casa;
    @XmlElement(name = "Td", required = true)
    protected List<CbStmtModifyIOType.Td> td;
    @XmlElement(name = "Loan", required = true)
    protected List<CbStmtModifyIOType.Loan> loan;

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
     * {@link CbStmtModifyIOType.Casa }
     * 
     * 
     */
    public List<CbStmtModifyIOType.Casa> getCasa() {
        if (casa == null) {
            casa = new ArrayList<CbStmtModifyIOType.Casa>();
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
     * {@link CbStmtModifyIOType.Td }
     * 
     * 
     */
    public List<CbStmtModifyIOType.Td> getTd() {
        if (td == null) {
            td = new ArrayList<CbStmtModifyIOType.Td>();
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
     * {@link CbStmtModifyIOType.Loan }
     * 
     * 
     */
    public List<CbStmtModifyIOType.Loan> getLoan() {
        if (loan == null) {
            loan = new ArrayList<CbStmtModifyIOType.Loan>();
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
     *         &lt;element name="STMT_IDCASA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="CUST_NOCASA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "stmtidcasa",
        "custnocasa",
        "accountno",
        "brncode",
        "acdesc"
    })
    public static class Casa {

        @XmlElement(name = "STMT_IDCASA")
        protected String stmtidcasa;
        @XmlElement(name = "CUST_NOCASA")
        protected String custnocasa;
        @XmlElement(name = "ACCOUNT_NO")
        protected String accountno;
        @XmlElement(name = "BRN_CODE")
        protected String brncode;
        @XmlElement(name = "AC_DESC")
        protected String acdesc;

        /**
         * Gets the value of the stmtidcasa property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSTMTIDCASA() {
            return stmtidcasa;
        }

        /**
         * Sets the value of the stmtidcasa property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSTMTIDCASA(String value) {
            this.stmtidcasa = value;
        }

        /**
         * Gets the value of the custnocasa property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCUSTNOCASA() {
            return custnocasa;
        }

        /**
         * Sets the value of the custnocasa property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCUSTNOCASA(String value) {
            this.custnocasa = value;
        }

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
     *         &lt;element name="STMT_IDLOAN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="CUST_NOLOAN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "stmtidloan",
        "custnoloan",
        "accountno",
        "brncode"
    })
    public static class Loan {

        @XmlElement(name = "STMT_IDLOAN")
        protected String stmtidloan;
        @XmlElement(name = "CUST_NOLOAN")
        protected String custnoloan;
        @XmlElement(name = "ACCOUNT_NO")
        protected String accountno;
        @XmlElement(name = "BRN_CODE")
        protected String brncode;

        /**
         * Gets the value of the stmtidloan property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSTMTIDLOAN() {
            return stmtidloan;
        }

        /**
         * Sets the value of the stmtidloan property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSTMTIDLOAN(String value) {
            this.stmtidloan = value;
        }

        /**
         * Gets the value of the custnoloan property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCUSTNOLOAN() {
            return custnoloan;
        }

        /**
         * Sets the value of the custnoloan property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCUSTNOLOAN(String value) {
            this.custnoloan = value;
        }

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
     *         &lt;element name="STMT_IDTD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="CUST_NOTD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "stmtidtd",
        "custnotd",
        "accountno",
        "brncode",
        "acdesc"
    })
    public static class Td {

        @XmlElement(name = "STMT_IDTD")
        protected String stmtidtd;
        @XmlElement(name = "CUST_NOTD")
        protected String custnotd;
        @XmlElement(name = "ACCOUNT_NO")
        protected String accountno;
        @XmlElement(name = "BRN_CODE")
        protected String brncode;
        @XmlElement(name = "AC_DESC")
        protected String acdesc;

        /**
         * Gets the value of the stmtidtd property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSTMTIDTD() {
            return stmtidtd;
        }

        /**
         * Sets the value of the stmtidtd property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSTMTIDTD(String value) {
            this.stmtidtd = value;
        }

        /**
         * Gets the value of the custnotd property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCUSTNOTD() {
            return custnotd;
        }

        /**
         * Sets the value of the custnotd property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCUSTNOTD(String value) {
            this.custnotd = value;
        }

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
