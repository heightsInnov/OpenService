
package com.ofss.fcubs.service.fcubsldservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BrnPrmDtls-Create-IO-Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BrnPrmDtls-Create-IO-Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BRNCD" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PROCTILL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACCRLVL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TAXCOMPBASIS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SGENMANLIQ" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="APYCALC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BTN_UDF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="USRREFINMSGS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UDFDETAILS" type="{http://fcubs.ofss.com/service/FCUBSLDService}UDFDETAILSType2" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BrnPrmDtls-Create-IO-Type", propOrder = {
    "brncd",
    "proctill",
    "accrlvl",
    "taxcompbasis",
    "sgenmanliq",
    "apycalc",
    "btnudf",
    "usrrefinmsgs",
    "udfdetails"
})
public class BrnPrmDtlsCreateIOType {

    @XmlElement(name = "BRNCD", required = true)
    protected String brncd;
    @XmlElement(name = "PROCTILL")
    protected String proctill;
    @XmlElement(name = "ACCRLVL")
    protected String accrlvl;
    @XmlElement(name = "TAXCOMPBASIS")
    protected String taxcompbasis;
    @XmlElement(name = "SGENMANLIQ")
    protected String sgenmanliq;
    @XmlElement(name = "APYCALC")
    protected String apycalc;
    @XmlElement(name = "BTN_UDF")
    protected String btnudf;
    @XmlElement(name = "USRREFINMSGS")
    protected String usrrefinmsgs;
    @XmlElement(name = "UDFDETAILS")
    protected List<UDFDETAILSType2> udfdetails;

    /**
     * Gets the value of the brncd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBRNCD() {
        return brncd;
    }

    /**
     * Sets the value of the brncd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBRNCD(String value) {
        this.brncd = value;
    }

    /**
     * Gets the value of the proctill property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPROCTILL() {
        return proctill;
    }

    /**
     * Sets the value of the proctill property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPROCTILL(String value) {
        this.proctill = value;
    }

    /**
     * Gets the value of the accrlvl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACCRLVL() {
        return accrlvl;
    }

    /**
     * Sets the value of the accrlvl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACCRLVL(String value) {
        this.accrlvl = value;
    }

    /**
     * Gets the value of the taxcompbasis property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTAXCOMPBASIS() {
        return taxcompbasis;
    }

    /**
     * Sets the value of the taxcompbasis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTAXCOMPBASIS(String value) {
        this.taxcompbasis = value;
    }

    /**
     * Gets the value of the sgenmanliq property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSGENMANLIQ() {
        return sgenmanliq;
    }

    /**
     * Sets the value of the sgenmanliq property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSGENMANLIQ(String value) {
        this.sgenmanliq = value;
    }

    /**
     * Gets the value of the apycalc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPYCALC() {
        return apycalc;
    }

    /**
     * Sets the value of the apycalc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPYCALC(String value) {
        this.apycalc = value;
    }

    /**
     * Gets the value of the btnudf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBTNUDF() {
        return btnudf;
    }

    /**
     * Sets the value of the btnudf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBTNUDF(String value) {
        this.btnudf = value;
    }

    /**
     * Gets the value of the usrrefinmsgs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUSRREFINMSGS() {
        return usrrefinmsgs;
    }

    /**
     * Sets the value of the usrrefinmsgs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUSRREFINMSGS(String value) {
        this.usrrefinmsgs = value;
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
