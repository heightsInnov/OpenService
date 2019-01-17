
package com.ofss.fcubs.service.fcubsldservice;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SettlementAddlDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SettlementAddlDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ACCBRN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACC_CCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AMTTAG" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CUSTSPRD" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ERIAMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ERICCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="XRATE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="GENMSG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NETACRSMOD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PAYRCV" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RATECDDEFRD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SPRDDFN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TAG_CCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DRCRIND" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Settlement-Addl-Main" type="{http://fcubs.ofss.com/service/FCUBSLDService}SettlementMainType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SettlementAddlDetailsType", propOrder = {
    "accbrn",
    "accccy",
    "acc",
    "amttag",
    "custsprd",
    "eriamt",
    "ericcy",
    "xrate",
    "genmsg",
    "netacrsmod",
    "payrcv",
    "ratecddefrd",
    "sprddfn",
    "tagccy",
    "drcrind",
    "settlementAddlMain"
})
public class SettlementAddlDetailsType {

    @XmlElement(name = "ACCBRN")
    protected String accbrn;
    @XmlElement(name = "ACC_CCY")
    protected String accccy;
    @XmlElement(name = "ACC")
    protected String acc;
    @XmlElement(name = "AMTTAG", required = true)
    protected String amttag;
    @XmlElement(name = "CUSTSPRD")
    protected BigDecimal custsprd;
    @XmlElement(name = "ERIAMT")
    protected BigDecimal eriamt;
    @XmlElement(name = "ERICCY")
    protected String ericcy;
    @XmlElement(name = "XRATE")
    protected BigDecimal xrate;
    @XmlElement(name = "GENMSG")
    protected String genmsg;
    @XmlElement(name = "NETACRSMOD")
    protected String netacrsmod;
    @XmlElement(name = "PAYRCV")
    protected String payrcv;
    @XmlElement(name = "RATECDDEFRD")
    protected String ratecddefrd;
    @XmlElement(name = "SPRDDFN")
    protected String sprddfn;
    @XmlElement(name = "TAG_CCY")
    protected String tagccy;
    @XmlElement(name = "DRCRIND")
    protected String drcrind;
    @XmlElement(name = "Settlement-Addl-Main")
    protected List<SettlementMainType> settlementAddlMain;

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
     * Gets the value of the accccy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACCCCY() {
        return accccy;
    }

    /**
     * Sets the value of the accccy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACCCCY(String value) {
        this.accccy = value;
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
     * Gets the value of the amttag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAMTTAG() {
        return amttag;
    }

    /**
     * Sets the value of the amttag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAMTTAG(String value) {
        this.amttag = value;
    }

    /**
     * Gets the value of the custsprd property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCUSTSPRD() {
        return custsprd;
    }

    /**
     * Sets the value of the custsprd property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCUSTSPRD(BigDecimal value) {
        this.custsprd = value;
    }

    /**
     * Gets the value of the eriamt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getERIAMT() {
        return eriamt;
    }

    /**
     * Sets the value of the eriamt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setERIAMT(BigDecimal value) {
        this.eriamt = value;
    }

    /**
     * Gets the value of the ericcy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getERICCY() {
        return ericcy;
    }

    /**
     * Sets the value of the ericcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setERICCY(String value) {
        this.ericcy = value;
    }

    /**
     * Gets the value of the xrate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getXRATE() {
        return xrate;
    }

    /**
     * Sets the value of the xrate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setXRATE(BigDecimal value) {
        this.xrate = value;
    }

    /**
     * Gets the value of the genmsg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGENMSG() {
        return genmsg;
    }

    /**
     * Sets the value of the genmsg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGENMSG(String value) {
        this.genmsg = value;
    }

    /**
     * Gets the value of the netacrsmod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNETACRSMOD() {
        return netacrsmod;
    }

    /**
     * Sets the value of the netacrsmod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNETACRSMOD(String value) {
        this.netacrsmod = value;
    }

    /**
     * Gets the value of the payrcv property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPAYRCV() {
        return payrcv;
    }

    /**
     * Sets the value of the payrcv property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPAYRCV(String value) {
        this.payrcv = value;
    }

    /**
     * Gets the value of the ratecddefrd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRATECDDEFRD() {
        return ratecddefrd;
    }

    /**
     * Sets the value of the ratecddefrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRATECDDEFRD(String value) {
        this.ratecddefrd = value;
    }

    /**
     * Gets the value of the sprddfn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSPRDDFN() {
        return sprddfn;
    }

    /**
     * Sets the value of the sprddfn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSPRDDFN(String value) {
        this.sprddfn = value;
    }

    /**
     * Gets the value of the tagccy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTAGCCY() {
        return tagccy;
    }

    /**
     * Sets the value of the tagccy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTAGCCY(String value) {
        this.tagccy = value;
    }

    /**
     * Gets the value of the drcrind property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDRCRIND() {
        return drcrind;
    }

    /**
     * Sets the value of the drcrind property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDRCRIND(String value) {
        this.drcrind = value;
    }

    /**
     * Gets the value of the settlementAddlMain property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the settlementAddlMain property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSettlementAddlMain().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SettlementMainType }
     * 
     * 
     */
    public List<SettlementMainType> getSettlementAddlMain() {
        if (settlementAddlMain == null) {
            settlementAddlMain = new ArrayList<SettlementMainType>();
        }
        return this.settlementAddlMain;
    }

}
