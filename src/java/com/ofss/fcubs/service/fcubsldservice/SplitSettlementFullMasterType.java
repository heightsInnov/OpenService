
package com.ofss.fcubs.service.fcubsldservice;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SplitSettlementFullMasterType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SplitSettlementFullMasterType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AMTTAG" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CCY" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="AMT" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="Settlement-Split-Details" type="{http://fcubs.ofss.com/service/FCUBSLDService}SplitSettlementFullDetailType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SplitSettlementFullMasterType", propOrder = {
    "amttag",
    "ccy",
    "amt",
    "settlementSplitDetails"
})
public class SplitSettlementFullMasterType {

    @XmlElement(name = "AMTTAG", required = true)
    protected String amttag;
    @XmlElement(name = "CCY", required = true)
    protected String ccy;
    @XmlElement(name = "AMT", required = true)
    protected BigDecimal amt;
    @XmlElement(name = "Settlement-Split-Details")
    protected SplitSettlementFullDetailType settlementSplitDetails;

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
     * Gets the value of the ccy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCCY() {
        return ccy;
    }

    /**
     * Sets the value of the ccy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCCY(String value) {
        this.ccy = value;
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
     * Gets the value of the settlementSplitDetails property.
     * 
     * @return
     *     possible object is
     *     {@link SplitSettlementFullDetailType }
     *     
     */
    public SplitSettlementFullDetailType getSettlementSplitDetails() {
        return settlementSplitDetails;
    }

    /**
     * Sets the value of the settlementSplitDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link SplitSettlementFullDetailType }
     *     
     */
    public void setSettlementSplitDetails(SplitSettlementFullDetailType value) {
        this.settlementSplitDetails = value;
    }

}
