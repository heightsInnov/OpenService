
package com.ofss.fcubs.service.fcubsldservice;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BrkDetailType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BrkDetailType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BOOKCCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BKMTHD" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="BOOKAMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="LIQSTAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LREFNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BrkDetailType", propOrder = {
    "bookccy",
    "bkmthd",
    "bookamt",
    "liqstat",
    "lrefno"
})
public class BrkDetailType {

    @XmlElement(name = "BOOKCCY")
    protected String bookccy;
    @XmlElement(name = "BKMTHD")
    protected BigInteger bkmthd;
    @XmlElement(name = "BOOKAMT")
    protected BigDecimal bookamt;
    @XmlElement(name = "LIQSTAT")
    protected String liqstat;
    @XmlElement(name = "LREFNO")
    protected String lrefno;

    /**
     * Gets the value of the bookccy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBOOKCCY() {
        return bookccy;
    }

    /**
     * Sets the value of the bookccy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBOOKCCY(String value) {
        this.bookccy = value;
    }

    /**
     * Gets the value of the bkmthd property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBKMTHD() {
        return bkmthd;
    }

    /**
     * Sets the value of the bkmthd property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBKMTHD(BigInteger value) {
        this.bkmthd = value;
    }

    /**
     * Gets the value of the bookamt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBOOKAMT() {
        return bookamt;
    }

    /**
     * Sets the value of the bookamt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBOOKAMT(BigDecimal value) {
        this.bookamt = value;
    }

    /**
     * Gets the value of the liqstat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLIQSTAT() {
        return liqstat;
    }

    /**
     * Sets the value of the liqstat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLIQSTAT(String value) {
        this.liqstat = value;
    }

    /**
     * Gets the value of the lrefno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLREFNO() {
        return lrefno;
    }

    /**
     * Sets the value of the lrefno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLREFNO(String value) {
        this.lrefno = value;
    }

}
