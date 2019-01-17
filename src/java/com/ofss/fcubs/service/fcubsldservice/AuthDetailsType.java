
package com.ofss.fcubs.service.fcubsldservice;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Auth-Details-Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Auth-Details-Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="XREF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FCCREF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ESN" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="EVENTCD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EVENTDT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="INPUTBY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Rekey-Details" type="{http://fcubs.ofss.com/service/FCUBSLDService}RekeyFldsType" minOccurs="0"/>
 *         &lt;element name="Contract-Ovd" type="{http://fcubs.ofss.com/service/FCUBSLDService}OVD-Type" minOccurs="0"/>
 *         &lt;element name="Contract-Change-Log" type="{http://fcubs.ofss.com/service/FCUBSLDService}ChangeLog-Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Auth-Details-Type", propOrder = {
    "xref",
    "fccref",
    "esn",
    "eventcd",
    "eventdt",
    "inputby",
    "rekeyDetails",
    "contractOvd",
    "contractChangeLog"
})
public class AuthDetailsType {

    @XmlElement(name = "XREF")
    protected String xref;
    @XmlElement(name = "FCCREF")
    protected String fccref;
    @XmlElement(name = "ESN")
    protected BigDecimal esn;
    @XmlElement(name = "EVENTCD")
    protected String eventcd;
    @XmlElement(name = "EVENTDT")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar eventdt;
    @XmlElement(name = "INPUTBY")
    protected String inputby;
    @XmlElement(name = "Rekey-Details")
    protected RekeyFldsType rekeyDetails;
    @XmlElement(name = "Contract-Ovd")
    protected OVDType contractOvd;
    @XmlElement(name = "Contract-Change-Log")
    protected ChangeLogType contractChangeLog;

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
     * Gets the value of the esn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getESN() {
        return esn;
    }

    /**
     * Sets the value of the esn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setESN(BigDecimal value) {
        this.esn = value;
    }

    /**
     * Gets the value of the eventcd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEVENTCD() {
        return eventcd;
    }

    /**
     * Sets the value of the eventcd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEVENTCD(String value) {
        this.eventcd = value;
    }

    /**
     * Gets the value of the eventdt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEVENTDT() {
        return eventdt;
    }

    /**
     * Sets the value of the eventdt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEVENTDT(XMLGregorianCalendar value) {
        this.eventdt = value;
    }

    /**
     * Gets the value of the inputby property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINPUTBY() {
        return inputby;
    }

    /**
     * Sets the value of the inputby property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINPUTBY(String value) {
        this.inputby = value;
    }

    /**
     * Gets the value of the rekeyDetails property.
     * 
     * @return
     *     possible object is
     *     {@link RekeyFldsType }
     *     
     */
    public RekeyFldsType getRekeyDetails() {
        return rekeyDetails;
    }

    /**
     * Sets the value of the rekeyDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link RekeyFldsType }
     *     
     */
    public void setRekeyDetails(RekeyFldsType value) {
        this.rekeyDetails = value;
    }

    /**
     * Gets the value of the contractOvd property.
     * 
     * @return
     *     possible object is
     *     {@link OVDType }
     *     
     */
    public OVDType getContractOvd() {
        return contractOvd;
    }

    /**
     * Sets the value of the contractOvd property.
     * 
     * @param value
     *     allowed object is
     *     {@link OVDType }
     *     
     */
    public void setContractOvd(OVDType value) {
        this.contractOvd = value;
    }

    /**
     * Gets the value of the contractChangeLog property.
     * 
     * @return
     *     possible object is
     *     {@link ChangeLogType }
     *     
     */
    public ChangeLogType getContractChangeLog() {
        return contractChangeLog;
    }

    /**
     * Sets the value of the contractChangeLog property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChangeLogType }
     *     
     */
    public void setContractChangeLog(ChangeLogType value) {
        this.contractChangeLog = value;
    }

}
