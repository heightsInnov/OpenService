
package com.ofss.fcubs.service.fcubsldservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LD-FeeAccrual-IO-Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LD-FeeAccrual-IO-Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FCCREF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="XREF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Contract-Accr-Fee" type="{http://fcubs.ofss.com/service/FCUBSLDService}LDContractFeeType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LD-FeeAccrual-IO-Type", propOrder = {
    "fccref",
    "xref",
    "contractAccrFee"
})
public class LDFeeAccrualIOType {

    @XmlElement(name = "FCCREF")
    protected String fccref;
    @XmlElement(name = "XREF")
    protected String xref;
    @XmlElement(name = "Contract-Accr-Fee")
    protected List<LDContractFeeType> contractAccrFee;

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
     * Gets the value of the contractAccrFee property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contractAccrFee property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContractAccrFee().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LDContractFeeType }
     * 
     * 
     */
    public List<LDContractFeeType> getContractAccrFee() {
        if (contractAccrFee == null) {
            contractAccrFee = new ArrayList<LDContractFeeType>();
        }
        return this.contractAccrFee;
    }

}
