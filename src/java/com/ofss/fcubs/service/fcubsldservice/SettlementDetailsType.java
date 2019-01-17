
package com.ofss.fcubs.service.fcubsldservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SettlementDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SettlementDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AMTTAG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TRNTPCD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BNKOPRCD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="REGREP1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="REGREP2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="REGREP3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ENV_CONT1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ENV_CONT2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ENV_CONT3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ENV_CONT4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ENV_CONT5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TIMEIND1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TIMEIND2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TIMEIND3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="INSTRCDLT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="INSTRCDLT1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="INSTRCDLT2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="INSTRCDLT3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="INSTRCDLT4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="INSTRCDLT5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="INSTRCDTXT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="INSTRCDTXT1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="INSTRCDTXT2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="INSTRCDTXT3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="INSTRCDTXT4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="INSTRCDTXT5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SettlementDetailsType", propOrder = {
    "amttag",
    "trntpcd",
    "bnkoprcd",
    "regrep1",
    "regrep2",
    "regrep3",
    "envcont1",
    "envcont2",
    "envcont3",
    "envcont4",
    "envcont5",
    "timeind1",
    "timeind2",
    "timeind3",
    "instrcdlt",
    "instrcdlt1",
    "instrcdlt2",
    "instrcdlt3",
    "instrcdlt4",
    "instrcdlt5",
    "instrcdtxt",
    "instrcdtxt1",
    "instrcdtxt2",
    "instrcdtxt3",
    "instrcdtxt4",
    "instrcdtxt5"
})
public class SettlementDetailsType {

    @XmlElement(name = "AMTTAG")
    protected String amttag;
    @XmlElement(name = "TRNTPCD")
    protected String trntpcd;
    @XmlElement(name = "BNKOPRCD")
    protected String bnkoprcd;
    @XmlElement(name = "REGREP1")
    protected String regrep1;
    @XmlElement(name = "REGREP2")
    protected String regrep2;
    @XmlElement(name = "REGREP3")
    protected String regrep3;
    @XmlElement(name = "ENV_CONT1")
    protected String envcont1;
    @XmlElement(name = "ENV_CONT2")
    protected String envcont2;
    @XmlElement(name = "ENV_CONT3")
    protected String envcont3;
    @XmlElement(name = "ENV_CONT4")
    protected String envcont4;
    @XmlElement(name = "ENV_CONT5")
    protected String envcont5;
    @XmlElement(name = "TIMEIND1")
    protected String timeind1;
    @XmlElement(name = "TIMEIND2")
    protected String timeind2;
    @XmlElement(name = "TIMEIND3")
    protected String timeind3;
    @XmlElement(name = "INSTRCDLT")
    protected String instrcdlt;
    @XmlElement(name = "INSTRCDLT1")
    protected String instrcdlt1;
    @XmlElement(name = "INSTRCDLT2")
    protected String instrcdlt2;
    @XmlElement(name = "INSTRCDLT3")
    protected String instrcdlt3;
    @XmlElement(name = "INSTRCDLT4")
    protected String instrcdlt4;
    @XmlElement(name = "INSTRCDLT5")
    protected String instrcdlt5;
    @XmlElement(name = "INSTRCDTXT")
    protected String instrcdtxt;
    @XmlElement(name = "INSTRCDTXT1")
    protected String instrcdtxt1;
    @XmlElement(name = "INSTRCDTXT2")
    protected String instrcdtxt2;
    @XmlElement(name = "INSTRCDTXT3")
    protected String instrcdtxt3;
    @XmlElement(name = "INSTRCDTXT4")
    protected String instrcdtxt4;
    @XmlElement(name = "INSTRCDTXT5")
    protected String instrcdtxt5;

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
     * Gets the value of the trntpcd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTRNTPCD() {
        return trntpcd;
    }

    /**
     * Sets the value of the trntpcd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTRNTPCD(String value) {
        this.trntpcd = value;
    }

    /**
     * Gets the value of the bnkoprcd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBNKOPRCD() {
        return bnkoprcd;
    }

    /**
     * Sets the value of the bnkoprcd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBNKOPRCD(String value) {
        this.bnkoprcd = value;
    }

    /**
     * Gets the value of the regrep1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getREGREP1() {
        return regrep1;
    }

    /**
     * Sets the value of the regrep1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setREGREP1(String value) {
        this.regrep1 = value;
    }

    /**
     * Gets the value of the regrep2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getREGREP2() {
        return regrep2;
    }

    /**
     * Sets the value of the regrep2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setREGREP2(String value) {
        this.regrep2 = value;
    }

    /**
     * Gets the value of the regrep3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getREGREP3() {
        return regrep3;
    }

    /**
     * Sets the value of the regrep3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setREGREP3(String value) {
        this.regrep3 = value;
    }

    /**
     * Gets the value of the envcont1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getENVCONT1() {
        return envcont1;
    }

    /**
     * Sets the value of the envcont1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setENVCONT1(String value) {
        this.envcont1 = value;
    }

    /**
     * Gets the value of the envcont2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getENVCONT2() {
        return envcont2;
    }

    /**
     * Sets the value of the envcont2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setENVCONT2(String value) {
        this.envcont2 = value;
    }

    /**
     * Gets the value of the envcont3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getENVCONT3() {
        return envcont3;
    }

    /**
     * Sets the value of the envcont3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setENVCONT3(String value) {
        this.envcont3 = value;
    }

    /**
     * Gets the value of the envcont4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getENVCONT4() {
        return envcont4;
    }

    /**
     * Sets the value of the envcont4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setENVCONT4(String value) {
        this.envcont4 = value;
    }

    /**
     * Gets the value of the envcont5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getENVCONT5() {
        return envcont5;
    }

    /**
     * Sets the value of the envcont5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setENVCONT5(String value) {
        this.envcont5 = value;
    }

    /**
     * Gets the value of the timeind1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTIMEIND1() {
        return timeind1;
    }

    /**
     * Sets the value of the timeind1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTIMEIND1(String value) {
        this.timeind1 = value;
    }

    /**
     * Gets the value of the timeind2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTIMEIND2() {
        return timeind2;
    }

    /**
     * Sets the value of the timeind2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTIMEIND2(String value) {
        this.timeind2 = value;
    }

    /**
     * Gets the value of the timeind3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTIMEIND3() {
        return timeind3;
    }

    /**
     * Sets the value of the timeind3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTIMEIND3(String value) {
        this.timeind3 = value;
    }

    /**
     * Gets the value of the instrcdlt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINSTRCDLT() {
        return instrcdlt;
    }

    /**
     * Sets the value of the instrcdlt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINSTRCDLT(String value) {
        this.instrcdlt = value;
    }

    /**
     * Gets the value of the instrcdlt1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINSTRCDLT1() {
        return instrcdlt1;
    }

    /**
     * Sets the value of the instrcdlt1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINSTRCDLT1(String value) {
        this.instrcdlt1 = value;
    }

    /**
     * Gets the value of the instrcdlt2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINSTRCDLT2() {
        return instrcdlt2;
    }

    /**
     * Sets the value of the instrcdlt2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINSTRCDLT2(String value) {
        this.instrcdlt2 = value;
    }

    /**
     * Gets the value of the instrcdlt3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINSTRCDLT3() {
        return instrcdlt3;
    }

    /**
     * Sets the value of the instrcdlt3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINSTRCDLT3(String value) {
        this.instrcdlt3 = value;
    }

    /**
     * Gets the value of the instrcdlt4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINSTRCDLT4() {
        return instrcdlt4;
    }

    /**
     * Sets the value of the instrcdlt4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINSTRCDLT4(String value) {
        this.instrcdlt4 = value;
    }

    /**
     * Gets the value of the instrcdlt5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINSTRCDLT5() {
        return instrcdlt5;
    }

    /**
     * Sets the value of the instrcdlt5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINSTRCDLT5(String value) {
        this.instrcdlt5 = value;
    }

    /**
     * Gets the value of the instrcdtxt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINSTRCDTXT() {
        return instrcdtxt;
    }

    /**
     * Sets the value of the instrcdtxt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINSTRCDTXT(String value) {
        this.instrcdtxt = value;
    }

    /**
     * Gets the value of the instrcdtxt1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINSTRCDTXT1() {
        return instrcdtxt1;
    }

    /**
     * Sets the value of the instrcdtxt1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINSTRCDTXT1(String value) {
        this.instrcdtxt1 = value;
    }

    /**
     * Gets the value of the instrcdtxt2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINSTRCDTXT2() {
        return instrcdtxt2;
    }

    /**
     * Sets the value of the instrcdtxt2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINSTRCDTXT2(String value) {
        this.instrcdtxt2 = value;
    }

    /**
     * Gets the value of the instrcdtxt3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINSTRCDTXT3() {
        return instrcdtxt3;
    }

    /**
     * Sets the value of the instrcdtxt3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINSTRCDTXT3(String value) {
        this.instrcdtxt3 = value;
    }

    /**
     * Gets the value of the instrcdtxt4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINSTRCDTXT4() {
        return instrcdtxt4;
    }

    /**
     * Sets the value of the instrcdtxt4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINSTRCDTXT4(String value) {
        this.instrcdtxt4 = value;
    }

    /**
     * Gets the value of the instrcdtxt5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINSTRCDTXT5() {
        return instrcdtxt5;
    }

    /**
     * Sets the value of the instrcdtxt5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINSTRCDTXT5(String value) {
        this.instrcdtxt5 = value;
    }

}
