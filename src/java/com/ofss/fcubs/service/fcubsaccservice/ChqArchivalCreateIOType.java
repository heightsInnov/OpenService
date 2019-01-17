
package com.ofss.fcubs.service.fcubsaccservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ChqArchival-Create-IO-Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChqArchival-Create-IO-Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ALL_ACCOUNTS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="END_CHECK_NO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="START_CHECK_NO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PRESENTED_BEFORE_DT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="ISSUED_BEFORE_DT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="BRANCH" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ARCHIVAL_REF_NO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Catb-Archival-Master-Acc" maxOccurs="unbounded" minOccurs="0">
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
@XmlType(name = "ChqArchival-Create-IO-Type", propOrder = {
    "allaccounts",
    "endcheckno",
    "startcheckno",
    "presentedbeforedt",
    "issuedbeforedt",
    "branch",
    "archivalrefno",
    "catbArchivalMasterAcc"
})
public class ChqArchivalCreateIOType {

    @XmlElement(name = "ALL_ACCOUNTS")
    protected String allaccounts;
    @XmlElement(name = "END_CHECK_NO")
    protected String endcheckno;
    @XmlElement(name = "START_CHECK_NO")
    protected String startcheckno;
    @XmlElement(name = "PRESENTED_BEFORE_DT")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar presentedbeforedt;
    @XmlElement(name = "ISSUED_BEFORE_DT")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar issuedbeforedt;
    @XmlElement(name = "BRANCH", required = true)
    protected String branch;
    @XmlElement(name = "ARCHIVAL_REF_NO")
    protected String archivalrefno;
    @XmlElement(name = "Catb-Archival-Master-Acc")
    protected List<ChqArchivalCreateIOType.CatbArchivalMasterAcc> catbArchivalMasterAcc;

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
     * Gets the value of the endcheckno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getENDCHECKNO() {
        return endcheckno;
    }

    /**
     * Sets the value of the endcheckno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setENDCHECKNO(String value) {
        this.endcheckno = value;
    }

    /**
     * Gets the value of the startcheckno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTARTCHECKNO() {
        return startcheckno;
    }

    /**
     * Sets the value of the startcheckno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSTARTCHECKNO(String value) {
        this.startcheckno = value;
    }

    /**
     * Gets the value of the presentedbeforedt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPRESENTEDBEFOREDT() {
        return presentedbeforedt;
    }

    /**
     * Sets the value of the presentedbeforedt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPRESENTEDBEFOREDT(XMLGregorianCalendar value) {
        this.presentedbeforedt = value;
    }

    /**
     * Gets the value of the issuedbeforedt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getISSUEDBEFOREDT() {
        return issuedbeforedt;
    }

    /**
     * Sets the value of the issuedbeforedt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setISSUEDBEFOREDT(XMLGregorianCalendar value) {
        this.issuedbeforedt = value;
    }

    /**
     * Gets the value of the branch property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBRANCH() {
        return branch;
    }

    /**
     * Sets the value of the branch property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBRANCH(String value) {
        this.branch = value;
    }

    /**
     * Gets the value of the archivalrefno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getARCHIVALREFNO() {
        return archivalrefno;
    }

    /**
     * Sets the value of the archivalrefno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setARCHIVALREFNO(String value) {
        this.archivalrefno = value;
    }

    /**
     * Gets the value of the catbArchivalMasterAcc property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the catbArchivalMasterAcc property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCatbArchivalMasterAcc().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ChqArchivalCreateIOType.CatbArchivalMasterAcc }
     * 
     * 
     */
    public List<ChqArchivalCreateIOType.CatbArchivalMasterAcc> getCatbArchivalMasterAcc() {
        if (catbArchivalMasterAcc == null) {
            catbArchivalMasterAcc = new ArrayList<ChqArchivalCreateIOType.CatbArchivalMasterAcc>();
        }
        return this.catbArchivalMasterAcc;
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
    public static class CatbArchivalMasterAcc {

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
