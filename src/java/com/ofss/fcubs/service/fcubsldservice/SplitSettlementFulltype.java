
package com.ofss.fcubs.service.fcubsldservice;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SplitSettlementFulltype complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SplitSettlementFulltype">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AMTTAG" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CCY" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="AMT" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="SPLITSTTLMENTFULLDTLS" type="{http://fcubs.ofss.com/service/FCUBSLDService}SplitSettlementFullDetailType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SplitSettlementFulltype", propOrder = {
    "amttag",
    "ccy",
    "amt",
    "splitsttlmentfulldtls"
})
public class SplitSettlementFulltype {

    @XmlElement(name = "AMTTAG", required = true)
    protected String amttag;
    @XmlElement(name = "CCY", required = true)
    protected String ccy;
    @XmlElement(name = "AMT", required = true)
    protected BigDecimal amt;
    @XmlElement(name = "SPLITSTTLMENTFULLDTLS", required = true)
    protected List<SplitSettlementFullDetailType> splitsttlmentfulldtls;

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
     * Gets the value of the splitsttlmentfulldtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the splitsttlmentfulldtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSPLITSTTLMENTFULLDTLS().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SplitSettlementFullDetailType }
     * 
     * 
     */
    public List<SplitSettlementFullDetailType> getSPLITSTTLMENTFULLDTLS() {
        if (splitsttlmentfulldtls == null) {
            splitsttlmentfulldtls = new ArrayList<SplitSettlementFullDetailType>();
        }
        return this.splitsttlmentfulldtls;
    }

}
