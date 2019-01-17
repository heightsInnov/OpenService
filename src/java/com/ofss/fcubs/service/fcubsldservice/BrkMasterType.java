
package com.ofss.fcubs.service.fcubsldservice;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BrkMasterType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BrkMasterType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FCCREF" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ESN" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="BROKER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BRKAMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="BRKCCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RULE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DSCACR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BRKNAM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RULEDESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Brokerage-Details" type="{http://fcubs.ofss.com/service/FCUBSLDService}BrkDetailType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BrkMasterType", propOrder = {
    "fccref",
    "esn",
    "broker",
    "brkamt",
    "brkccy",
    "rule",
    "dscacr",
    "brknam",
    "ruledesc",
    "brokerageDetails"
})
public class BrkMasterType {

    @XmlElement(name = "FCCREF", required = true)
    protected String fccref;
    @XmlElement(name = "ESN")
    protected BigInteger esn;
    @XmlElement(name = "BROKER")
    protected String broker;
    @XmlElement(name = "BRKAMT")
    protected BigDecimal brkamt;
    @XmlElement(name = "BRKCCY")
    protected String brkccy;
    @XmlElement(name = "RULE")
    protected String rule;
    @XmlElement(name = "DSCACR")
    protected String dscacr;
    @XmlElement(name = "BRKNAM")
    protected String brknam;
    @XmlElement(name = "RULEDESC")
    protected String ruledesc;
    @XmlElement(name = "Brokerage-Details")
    protected BrkDetailType brokerageDetails;

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
     * Gets the value of the broker property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBROKER() {
        return broker;
    }

    /**
     * Sets the value of the broker property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBROKER(String value) {
        this.broker = value;
    }

    /**
     * Gets the value of the brkamt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBRKAMT() {
        return brkamt;
    }

    /**
     * Sets the value of the brkamt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBRKAMT(BigDecimal value) {
        this.brkamt = value;
    }

    /**
     * Gets the value of the brkccy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBRKCCY() {
        return brkccy;
    }

    /**
     * Sets the value of the brkccy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBRKCCY(String value) {
        this.brkccy = value;
    }

    /**
     * Gets the value of the rule property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRULE() {
        return rule;
    }

    /**
     * Sets the value of the rule property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRULE(String value) {
        this.rule = value;
    }

    /**
     * Gets the value of the dscacr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDSCACR() {
        return dscacr;
    }

    /**
     * Sets the value of the dscacr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDSCACR(String value) {
        this.dscacr = value;
    }

    /**
     * Gets the value of the brknam property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBRKNAM() {
        return brknam;
    }

    /**
     * Sets the value of the brknam property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBRKNAM(String value) {
        this.brknam = value;
    }

    /**
     * Gets the value of the ruledesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRULEDESC() {
        return ruledesc;
    }

    /**
     * Sets the value of the ruledesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRULEDESC(String value) {
        this.ruledesc = value;
    }

    /**
     * Gets the value of the brokerageDetails property.
     * 
     * @return
     *     possible object is
     *     {@link BrkDetailType }
     *     
     */
    public BrkDetailType getBrokerageDetails() {
        return brokerageDetails;
    }

    /**
     * Sets the value of the brokerageDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link BrkDetailType }
     *     
     */
    public void setBrokerageDetails(BrkDetailType value) {
        this.brokerageDetails = value;
    }

}
