
package com.ofss.fcubs.service.fcubsldservice;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for LDContractFeeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LDContractFeeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FCCREF" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="COMPCCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FEEAMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="REFAMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="VALDT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="CALCSTDT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="CALCENDDT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="FEETYP" type="{http://fcubs.ofss.com/service/FCUBSLDService}FeeType2" minOccurs="0"/>
 *         &lt;element name="ACCREQD" type="{http://fcubs.ofss.com/service/FCUBSLDService}YesNoType16" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LDContractFeeType", propOrder = {
    "fccref",
    "compccy",
    "feeamt",
    "refamt",
    "valdt",
    "calcstdt",
    "calcenddt",
    "feetyp",
    "accreqd"
})
public class LDContractFeeType {

    @XmlElement(name = "FCCREF", required = true)
    protected String fccref;
    @XmlElement(name = "COMPCCY")
    protected String compccy;
    @XmlElement(name = "FEEAMT")
    protected BigDecimal feeamt;
    @XmlElement(name = "REFAMT")
    protected BigDecimal refamt;
    @XmlElement(name = "VALDT")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar valdt;
    @XmlElement(name = "CALCSTDT")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar calcstdt;
    @XmlElement(name = "CALCENDDT")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar calcenddt;
    @XmlElement(name = "FEETYP")
    @XmlSchemaType(name = "string")
    protected FeeType2 feetyp;
    @XmlElement(name = "ACCREQD")
    @XmlSchemaType(name = "string")
    protected YesNoType16 accreqd;

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
     *     {@link FeeType2 }
     *     
     */
    public FeeType2 getFEETYP() {
        return feetyp;
    }

    /**
     * Sets the value of the feetyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link FeeType2 }
     *     
     */
    public void setFEETYP(FeeType2 value) {
        this.feetyp = value;
    }

    /**
     * Gets the value of the accreqd property.
     * 
     * @return
     *     possible object is
     *     {@link YesNoType16 }
     *     
     */
    public YesNoType16 getACCREQD() {
        return accreqd;
    }

    /**
     * Sets the value of the accreqd property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNoType16 }
     *     
     */
    public void setACCREQD(YesNoType16 value) {
        this.accreqd = value;
    }

}
