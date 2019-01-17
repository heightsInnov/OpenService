
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
 * <p>Java class for FeeAccrualFullType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FeeAccrualFullType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FCCREF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PROD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="COUNTPTY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CUSTNAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MATDATE" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="VALDATE" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="USRREF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CUSTREF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CONTCCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PRINCOUTBAL" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="USRSTAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LATESTESN" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="CURRESN" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="SUBSYSTEMSTAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FEEACCRUAL" type="{http://fcubs.ofss.com/service/FCUBSLDService}FeeAccrualType" minOccurs="0"/>
 *         &lt;element name="FEEAUDIT" type="{http://fcubs.ofss.com/service/FCUBSLDService}FeeAccrualAuditType" minOccurs="0"/>
 *         &lt;element name="STLDETAILS_IS_MAIN" type="{http://fcubs.ofss.com/service/FCUBSLDService}SettlementMainType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Advices" type="{http://fcubs.ofss.com/service/FCUBSLDService}ADVDETAILSType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FeeAccrualFullType", propOrder = {
    "fccref",
    "prod",
    "countpty",
    "custname",
    "matdate",
    "valdate",
    "usrref",
    "custref",
    "contccy",
    "princoutbal",
    "usrstat",
    "latestesn",
    "curresn",
    "subsystemstat",
    "feeaccrual",
    "feeaudit",
    "stldetailsismain",
    "advices"
})
public class FeeAccrualFullType {

    @XmlElement(name = "FCCREF")
    protected String fccref;
    @XmlElement(name = "PROD")
    protected String prod;
    @XmlElement(name = "COUNTPTY")
    protected String countpty;
    @XmlElement(name = "CUSTNAME")
    protected String custname;
    @XmlElement(name = "MATDATE")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar matdate;
    @XmlElement(name = "VALDATE")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar valdate;
    @XmlElement(name = "USRREF")
    protected String usrref;
    @XmlElement(name = "CUSTREF")
    protected String custref;
    @XmlElement(name = "CONTCCY")
    protected String contccy;
    @XmlElement(name = "PRINCOUTBAL")
    protected BigDecimal princoutbal;
    @XmlElement(name = "USRSTAT")
    protected String usrstat;
    @XmlElement(name = "LATESTESN")
    protected BigInteger latestesn;
    @XmlElement(name = "CURRESN")
    protected BigInteger curresn;
    @XmlElement(name = "SUBSYSTEMSTAT")
    protected String subsystemstat;
    @XmlElement(name = "FEEACCRUAL")
    protected FeeAccrualType feeaccrual;
    @XmlElement(name = "FEEAUDIT")
    protected FeeAccrualAuditType feeaudit;
    @XmlElement(name = "STLDETAILS_IS_MAIN")
    protected List<SettlementMainType> stldetailsismain;
    @XmlElement(name = "Advices")
    protected ADVDETAILSType advices;

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
     * Gets the value of the prod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPROD() {
        return prod;
    }

    /**
     * Sets the value of the prod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPROD(String value) {
        this.prod = value;
    }

    /**
     * Gets the value of the countpty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCOUNTPTY() {
        return countpty;
    }

    /**
     * Sets the value of the countpty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCOUNTPTY(String value) {
        this.countpty = value;
    }

    /**
     * Gets the value of the custname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCUSTNAME() {
        return custname;
    }

    /**
     * Sets the value of the custname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCUSTNAME(String value) {
        this.custname = value;
    }

    /**
     * Gets the value of the matdate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMATDATE() {
        return matdate;
    }

    /**
     * Sets the value of the matdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMATDATE(XMLGregorianCalendar value) {
        this.matdate = value;
    }

    /**
     * Gets the value of the valdate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getVALDATE() {
        return valdate;
    }

    /**
     * Sets the value of the valdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setVALDATE(XMLGregorianCalendar value) {
        this.valdate = value;
    }

    /**
     * Gets the value of the usrref property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUSRREF() {
        return usrref;
    }

    /**
     * Sets the value of the usrref property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUSRREF(String value) {
        this.usrref = value;
    }

    /**
     * Gets the value of the custref property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCUSTREF() {
        return custref;
    }

    /**
     * Sets the value of the custref property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCUSTREF(String value) {
        this.custref = value;
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
     * Gets the value of the princoutbal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPRINCOUTBAL() {
        return princoutbal;
    }

    /**
     * Sets the value of the princoutbal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPRINCOUTBAL(BigDecimal value) {
        this.princoutbal = value;
    }

    /**
     * Gets the value of the usrstat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUSRSTAT() {
        return usrstat;
    }

    /**
     * Sets the value of the usrstat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUSRSTAT(String value) {
        this.usrstat = value;
    }

    /**
     * Gets the value of the latestesn property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLATESTESN() {
        return latestesn;
    }

    /**
     * Sets the value of the latestesn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLATESTESN(BigInteger value) {
        this.latestesn = value;
    }

    /**
     * Gets the value of the curresn property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCURRESN() {
        return curresn;
    }

    /**
     * Sets the value of the curresn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCURRESN(BigInteger value) {
        this.curresn = value;
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
     * Gets the value of the feeaccrual property.
     * 
     * @return
     *     possible object is
     *     {@link FeeAccrualType }
     *     
     */
    public FeeAccrualType getFEEACCRUAL() {
        return feeaccrual;
    }

    /**
     * Sets the value of the feeaccrual property.
     * 
     * @param value
     *     allowed object is
     *     {@link FeeAccrualType }
     *     
     */
    public void setFEEACCRUAL(FeeAccrualType value) {
        this.feeaccrual = value;
    }

    /**
     * Gets the value of the feeaudit property.
     * 
     * @return
     *     possible object is
     *     {@link FeeAccrualAuditType }
     *     
     */
    public FeeAccrualAuditType getFEEAUDIT() {
        return feeaudit;
    }

    /**
     * Sets the value of the feeaudit property.
     * 
     * @param value
     *     allowed object is
     *     {@link FeeAccrualAuditType }
     *     
     */
    public void setFEEAUDIT(FeeAccrualAuditType value) {
        this.feeaudit = value;
    }

    /**
     * Gets the value of the stldetailsismain property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stldetailsismain property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSTLDETAILSISMAIN().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SettlementMainType }
     * 
     * 
     */
    public List<SettlementMainType> getSTLDETAILSISMAIN() {
        if (stldetailsismain == null) {
            stldetailsismain = new ArrayList<SettlementMainType>();
        }
        return this.stldetailsismain;
    }

    /**
     * Gets the value of the advices property.
     * 
     * @return
     *     possible object is
     *     {@link ADVDETAILSType }
     *     
     */
    public ADVDETAILSType getAdvices() {
        return advices;
    }

    /**
     * Sets the value of the advices property.
     * 
     * @param value
     *     allowed object is
     *     {@link ADVDETAILSType }
     *     
     */
    public void setAdvices(ADVDETAILSType value) {
        this.advices = value;
    }

}
