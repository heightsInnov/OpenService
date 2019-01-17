
package com.ofss.fcubs.service.fcubsldservice;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LDtbs_contract_Event_Log_PKType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LDtbs_contract_Event_Log_PKType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="XREF" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="FCCREF" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="BILLCCY" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="BILLAMT" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LDtbs_contract_Event_Log_PKType", propOrder = {
    "xref",
    "fccref",
    "billccy",
    "billamt"
})
public class LDtbsContractEventLogPKType {

    @XmlElement(name = "XREF", required = true)
    protected String xref;
    @XmlElement(name = "FCCREF", required = true)
    protected String fccref;
    @XmlElement(name = "BILLCCY", required = true)
    protected String billccy;
    @XmlElement(name = "BILLAMT", required = true)
    protected BigDecimal billamt;

    /**
     * Gets the value of the xref property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXREF() {
        return xref;
    }

    /**
     * Sets the value of the xref property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXREF(String value) {
        this.xref = value;
    }

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
     * Gets the value of the billccy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBILLCCY() {
        return billccy;
    }

    /**
     * Sets the value of the billccy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBILLCCY(String value) {
        this.billccy = value;
    }

    /**
     * Gets the value of the billamt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBILLAMT() {
        return billamt;
    }

    /**
     * Sets the value of the billamt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBILLAMT(BigDecimal value) {
        this.billamt = value;
    }

}
