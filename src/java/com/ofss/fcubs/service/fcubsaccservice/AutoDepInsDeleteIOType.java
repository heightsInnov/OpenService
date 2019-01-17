
package com.ofss.fcubs.service.fcubsaccservice;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AutoDepIns-Delete-IO-Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AutoDepIns-Delete-IO-Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BRANCH_CODE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="AC_NO" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SEQ_NO" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AutoDepIns-Delete-IO-Type", propOrder = {
    "branchcode",
    "acno",
    "seqno"
})
public class AutoDepInsDeleteIOType {

    @XmlElement(name = "BRANCH_CODE", required = true)
    protected String branchcode;
    @XmlElement(name = "AC_NO", required = true)
    protected String acno;
    @XmlElement(name = "SEQ_NO", required = true)
    protected BigDecimal seqno;

    /**
     * Gets the value of the branchcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBRANCHCODE() {
        return branchcode;
    }

    /**
     * Sets the value of the branchcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBRANCHCODE(String value) {
        this.branchcode = value;
    }

    /**
     * Gets the value of the acno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACNO() {
        return acno;
    }

    /**
     * Sets the value of the acno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACNO(String value) {
        this.acno = value;
    }

    /**
     * Gets the value of the seqno property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSEQNO() {
        return seqno;
    }

    /**
     * Sets the value of the seqno property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSEQNO(BigDecimal value) {
        this.seqno = value;
    }

}
