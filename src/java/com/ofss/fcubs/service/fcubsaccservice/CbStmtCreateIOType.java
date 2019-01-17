
package com.ofss.fcubs.service.fcubsaccservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CbStmt-Create-IO-Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CbStmt-Create-IO-Type">
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
 *         &lt;element name="CUST_DESC1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Casa" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ACCOUNT_NO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "CbStmt-Create-IO-Type", propOrder = {
    "stmtid",
    "cusno",
    "allaccounts",
    "bdvdbal",
    "stmtformat",
    "frequency",
    "stmtday",
    "applycharge",
    "chargeacc",
    "custdesc1",
    "casa",
    "td",
    "loan"
})
public class CbStmtCreateIOType {

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
    @XmlElement(name = "CUST_DESC1")
    protected String custdesc1;
    @XmlElement(name = "Casa")
    protected List<CbStmtCreateIOType.Casa> casa;
    @XmlElement(name = "Td")
    protected List<CbStmtCreateIOType.Td> td;
    @XmlElement(name = "Loan")
    protected List<CbStmtCreateIOType.Loan> loan;

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
     * {@link CbStmtCreateIOType.Casa }
     * 
     * 
     */
    public List<CbStmtCreateIOType.Casa> getCasa() {
        if (casa == null) {
            casa = new ArrayList<CbStmtCreateIOType.Casa>();
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
     * {@link CbStmtCreateIOType.Td }
     * 
     * 
     */
    public List<CbStmtCreateIOType.Td> getTd() {
        if (td == null) {
            td = new ArrayList<CbStmtCreateIOType.Td>();
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
     * {@link CbStmtCreateIOType.Loan }
     * 
     * 
     */
    public List<CbStmtCreateIOType.Loan> getLoan() {
        if (loan == null) {
            loan = new ArrayList<CbStmtCreateIOType.Loan>();
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
        "accountno"
    })
    public static class Casa {

        @XmlElement(name = "ACCOUNT_NO")
        protected String accountno;

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
        "accountno"
    })
    public static class Loan {

        @XmlElement(name = "ACCOUNT_NO")
        protected String accountno;

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
        "accountno"
    })
    public static class Td {

        @XmlElement(name = "ACCOUNT_NO")
        protected String accountno;

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

    }

}
