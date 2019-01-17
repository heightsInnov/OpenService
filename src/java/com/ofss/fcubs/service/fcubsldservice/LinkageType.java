
package com.ofss.fcubs.service.fcubsldservice;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LinkageType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LinkageType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LINK_REF" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="LINK_TYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LINK_CCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LINK_AMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="XRATE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="AVLAMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="CONV_LINK_AMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="LOAN_CCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LINKBRANCH" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="LINKVALID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LINK_SRNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AMTBLKNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LINKEFFDT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CONVPAIDAMT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LinkageType", propOrder = {
    "linkref",
    "linktype",
    "linkccy",
    "linkamt",
    "xrate",
    "avlamt",
    "convlinkamt",
    "loanccy",
    "linkbranch",
    "linkvalid",
    "linksrno",
    "amtblkno",
    "linkeffdt",
    "convpaidamt"
})
public class LinkageType {

    @XmlElement(name = "LINK_REF", required = true)
    protected String linkref;
    @XmlElement(name = "LINK_TYPE")
    protected String linktype;
    @XmlElement(name = "LINK_CCY")
    protected String linkccy;
    @XmlElement(name = "LINK_AMT")
    protected BigDecimal linkamt;
    @XmlElement(name = "XRATE")
    protected BigDecimal xrate;
    @XmlElement(name = "AVLAMT")
    protected BigDecimal avlamt;
    @XmlElement(name = "CONV_LINK_AMT")
    protected BigDecimal convlinkamt;
    @XmlElement(name = "LOAN_CCY")
    protected String loanccy;
    @XmlElement(name = "LINKBRANCH", required = true)
    protected String linkbranch;
    @XmlElement(name = "LINKVALID")
    protected String linkvalid;
    @XmlElement(name = "LINK_SRNO")
    protected String linksrno;
    @XmlElement(name = "AMTBLKNO")
    protected String amtblkno;
    @XmlElement(name = "LINKEFFDT")
    protected String linkeffdt;
    @XmlElement(name = "CONVPAIDAMT")
    protected String convpaidamt;

    /**
     * Gets the value of the linkref property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLINKREF() {
        return linkref;
    }

    /**
     * Sets the value of the linkref property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLINKREF(String value) {
        this.linkref = value;
    }

    /**
     * Gets the value of the linktype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLINKTYPE() {
        return linktype;
    }

    /**
     * Sets the value of the linktype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLINKTYPE(String value) {
        this.linktype = value;
    }

    /**
     * Gets the value of the linkccy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLINKCCY() {
        return linkccy;
    }

    /**
     * Sets the value of the linkccy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLINKCCY(String value) {
        this.linkccy = value;
    }

    /**
     * Gets the value of the linkamt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLINKAMT() {
        return linkamt;
    }

    /**
     * Sets the value of the linkamt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLINKAMT(BigDecimal value) {
        this.linkamt = value;
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
     * Gets the value of the avlamt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAVLAMT() {
        return avlamt;
    }

    /**
     * Sets the value of the avlamt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAVLAMT(BigDecimal value) {
        this.avlamt = value;
    }

    /**
     * Gets the value of the convlinkamt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCONVLINKAMT() {
        return convlinkamt;
    }

    /**
     * Sets the value of the convlinkamt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCONVLINKAMT(BigDecimal value) {
        this.convlinkamt = value;
    }

    /**
     * Gets the value of the loanccy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLOANCCY() {
        return loanccy;
    }

    /**
     * Sets the value of the loanccy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLOANCCY(String value) {
        this.loanccy = value;
    }

    /**
     * Gets the value of the linkbranch property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLINKBRANCH() {
        return linkbranch;
    }

    /**
     * Sets the value of the linkbranch property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLINKBRANCH(String value) {
        this.linkbranch = value;
    }

    /**
     * Gets the value of the linkvalid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLINKVALID() {
        return linkvalid;
    }

    /**
     * Sets the value of the linkvalid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLINKVALID(String value) {
        this.linkvalid = value;
    }

    /**
     * Gets the value of the linksrno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLINKSRNO() {
        return linksrno;
    }

    /**
     * Sets the value of the linksrno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLINKSRNO(String value) {
        this.linksrno = value;
    }

    /**
     * Gets the value of the amtblkno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAMTBLKNO() {
        return amtblkno;
    }

    /**
     * Sets the value of the amtblkno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAMTBLKNO(String value) {
        this.amtblkno = value;
    }

    /**
     * Gets the value of the linkeffdt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLINKEFFDT() {
        return linkeffdt;
    }

    /**
     * Sets the value of the linkeffdt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLINKEFFDT(String value) {
        this.linkeffdt = value;
    }

    /**
     * Gets the value of the convpaidamt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCONVPAIDAMT() {
        return convpaidamt;
    }

    /**
     * Sets the value of the convpaidamt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCONVPAIDAMT(String value) {
        this.convpaidamt = value;
    }

}
