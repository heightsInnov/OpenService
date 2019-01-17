
package com.ofss.fcubs.service.fcubsldservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TaxDetailType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TaxDetailType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TAXRULE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BASAMTTAG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="COMPEVT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WAIVER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Taxrule-Detail" type="{http://fcubs.ofss.com/service/FCUBSLDService}TaxRuleDetailType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaxDetailType", propOrder = {
    "taxrule",
    "basamttag",
    "compevt",
    "waiver",
    "taxruleDetail"
})
public class TaxDetailType {

    @XmlElement(name = "TAXRULE")
    protected String taxrule;
    @XmlElement(name = "BASAMTTAG")
    protected String basamttag;
    @XmlElement(name = "COMPEVT")
    protected String compevt;
    @XmlElement(name = "WAIVER")
    protected String waiver;
    @XmlElement(name = "Taxrule-Detail")
    protected List<TaxRuleDetailType> taxruleDetail;

    /**
     * Gets the value of the taxrule property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTAXRULE() {
        return taxrule;
    }

    /**
     * Sets the value of the taxrule property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTAXRULE(String value) {
        this.taxrule = value;
    }

    /**
     * Gets the value of the basamttag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBASAMTTAG() {
        return basamttag;
    }

    /**
     * Sets the value of the basamttag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBASAMTTAG(String value) {
        this.basamttag = value;
    }

    /**
     * Gets the value of the compevt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCOMPEVT() {
        return compevt;
    }

    /**
     * Sets the value of the compevt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCOMPEVT(String value) {
        this.compevt = value;
    }

    /**
     * Gets the value of the waiver property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWAIVER() {
        return waiver;
    }

    /**
     * Sets the value of the waiver property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWAIVER(String value) {
        this.waiver = value;
    }

    /**
     * Gets the value of the taxruleDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the taxruleDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTaxruleDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TaxRuleDetailType }
     * 
     * 
     */
    public List<TaxRuleDetailType> getTaxruleDetail() {
        if (taxruleDetail == null) {
            taxruleDetail = new ArrayList<TaxRuleDetailType>();
        }
        return this.taxruleDetail;
    }

}
