
package com.ofss.fcubs.service.fcubsldservice;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for FeeAccrualType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FeeAccrualType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="COMP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FEEAMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="REFAMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="VALDT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="ACCBRN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BASAMT" type="{http://fcubs.ofss.com/service/FCUBSLDService}BasAmtType" minOccurs="0"/>
 *         &lt;element name="CALCSTDT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="CALCENDDT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="FEETYP" type="{http://fcubs.ofss.com/service/FCUBSLDService}FeeType" minOccurs="0"/>
 *         &lt;element name="CONSDISCNT" type="{http://fcubs.ofss.com/service/FCUBSLDService}YesNoType" minOccurs="0"/>
 *         &lt;element name="ACCREQD" type="{http://fcubs.ofss.com/service/FCUBSLDService}YesNoType" minOccurs="0"/>
 *         &lt;element name="FEECCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="REFCCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="COMPCCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="COMPESN" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="AMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="AMTCCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FeeAccrualType", propOrder = {
    "comp",
    "feeamt",
    "refamt",
    "valdt",
    "accbrn",
    "acc",
    "basamt",
    "calcstdt",
    "calcenddt",
    "feetyp",
    "consdiscnt",
    "accreqd",
    "feeccy",
    "refccy",
    "compccy",
    "compesn",
    "amt",
    "amtccy"
})
public class FeeAccrualType {

    @XmlElement(name = "COMP")
    protected String comp;
    @XmlElement(name = "FEEAMT")
    protected BigDecimal feeamt;
    @XmlElement(name = "REFAMT")
    protected BigDecimal refamt;
    @XmlElement(name = "VALDT")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar valdt;
    @XmlElement(name = "ACCBRN")
    protected String accbrn;
    @XmlElement(name = "ACC")
    protected String acc;
    @XmlElement(name = "BASAMT")
    @XmlSchemaType(name = "string")
    protected BasAmtType basamt;
    @XmlElement(name = "CALCSTDT")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar calcstdt;
    @XmlElement(name = "CALCENDDT")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar calcenddt;
    @XmlElement(name = "FEETYP")
    @XmlSchemaType(name = "string")
    protected FeeType feetyp;
    @XmlElement(name = "CONSDISCNT")
    @XmlSchemaType(name = "string")
    protected YesNoType consdiscnt;
    @XmlElement(name = "ACCREQD")
    @XmlSchemaType(name = "string")
    protected YesNoType accreqd;
    @XmlElement(name = "FEECCY")
    protected String feeccy;
    @XmlElement(name = "REFCCY")
    protected String refccy;
    @XmlElement(name = "COMPCCY")
    protected String compccy;
    @XmlElement(name = "COMPESN")
    protected BigInteger compesn;
    @XmlElement(name = "AMT")
    protected BigDecimal amt;
    @XmlElement(name = "AMTCCY")
    protected String amtccy;

    /**
     * Gets the value of the comp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCOMP() {
        return comp;
    }

    /**
     * Sets the value of the comp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCOMP(String value) {
        this.comp = value;
    }

    /**
     * Gets the value of the feeamt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFEEAMT() {
        return feeamt;
    }

    /**
     * Sets the value of the feeamt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFEEAMT(BigDecimal value) {
        this.feeamt = value;
    }

    /**
     * Gets the value of the refamt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getREFAMT() {
        return refamt;
    }

    /**
     * Sets the value of the refamt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setREFAMT(BigDecimal value) {
        this.refamt = value;
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
     * Gets the value of the accbrn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACCBRN() {
        return accbrn;
    }

    /**
     * Sets the value of the accbrn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACCBRN(String value) {
        this.accbrn = value;
    }

    /**
     * Gets the value of the acc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACC() {
        return acc;
    }

    /**
     * Sets the value of the acc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACC(String value) {
        this.acc = value;
    }

    /**
     * Gets the value of the basamt property.
     * 
     * @return
     *     possible object is
     *     {@link BasAmtType }
     *     
     */
    public BasAmtType getBASAMT() {
        return basamt;
    }

    /**
     * Sets the value of the basamt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BasAmtType }
     *     
     */
    public void setBASAMT(BasAmtType value) {
        this.basamt = value;
    }

    /**
     * Gets the value of the calcstdt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCALCSTDT() {
        return calcstdt;
    }

    /**
     * Sets the value of the calcstdt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCALCSTDT(XMLGregorianCalendar value) {
        this.calcstdt = value;
    }

    /**
     * Gets the value of the calcenddt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCALCENDDT() {
        return calcenddt;
    }

    /**
     * Sets the value of the calcenddt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCALCENDDT(XMLGregorianCalendar value) {
        this.calcenddt = value;
    }

    /**
     * Gets the value of the feetyp property.
     * 
     * @return
     *     possible object is
     *     {@link FeeType }
     *     
     */
    public FeeType getFEETYP() {
        return feetyp;
    }

    /**
     * Sets the value of the feetyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link FeeType }
     *     
     */
    public void setFEETYP(FeeType value) {
        this.feetyp = value;
    }

    /**
     * Gets the value of the consdiscnt property.
     * 
     * @return
     *     possible object is
     *     {@link YesNoType }
     *     
     */
    public YesNoType getCONSDISCNT() {
        return consdiscnt;
    }

    /**
     * Sets the value of the consdiscnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNoType }
     *     
     */
    public void setCONSDISCNT(YesNoType value) {
        this.consdiscnt = value;
    }

    /**
     * Gets the value of the accreqd property.
     * 
     * @return
     *     possible object is
     *     {@link YesNoType }
     *     
     */
    public YesNoType getACCREQD() {
        return accreqd;
    }

    /**
     * Sets the value of the accreqd property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNoType }
     *     
     */
    public void setACCREQD(YesNoType value) {
        this.accreqd = value;
    }

    /**
     * Gets the value of the feeccy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFEECCY() {
        return feeccy;
    }

    /**
     * Sets the value of the feeccy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFEECCY(String value) {
        this.feeccy = value;
    }

    /**
     * Gets the value of the refccy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getREFCCY() {
        return refccy;
    }

    /**
     * Sets the value of the refccy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setREFCCY(String value) {
        this.refccy = value;
    }

    /**
     * Gets the value of the compccy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCOMPCCY() {
        return compccy;
    }

    /**
     * Sets the value of the compccy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCOMPCCY(String value) {
        this.compccy = value;
    }

    /**
     * Gets the value of the compesn property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCOMPESN() {
        return compesn;
    }

    /**
     * Sets the value of the compesn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCOMPESN(BigInteger value) {
        this.compesn = value;
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
     * Gets the value of the amtccy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAMTCCY() {
        return amtccy;
    }

    /**
     * Sets the value of the amtccy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAMTCCY(String value) {
        this.amtccy = value;
    }

}
