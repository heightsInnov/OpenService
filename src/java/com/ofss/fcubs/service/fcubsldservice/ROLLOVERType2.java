
package com.ofss.fcubs.service.fcubsldservice;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ROLLOVERType2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ROLLOVERType2">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ROLLAMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ROLLMATDT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="ROLLNOTDAYS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UPDATEUTIL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LIQDODSCHD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DRAWDOWNNO" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="ROLLBY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ROLLINTST" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ROLLMECH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ROLLMETHD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ROLLTYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ROLLAMTTYP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ROLLMATTYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ROLLICCFFROM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SCHDBASIS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TRESPLAMT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="APPROLLTAX" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NEWCOMPALL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ROLLMATDAYS" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="APPCHG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="REFRATE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Rvrintrates" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="INTCOMP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="DEFFROM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="RATETYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="INTBASIS" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="INTBAS" type="{http://fcubs.ofss.com/service/FCUBSLDService}INTBASType4" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ROLLOVERType2", propOrder = {
    "rollamt",
    "rollmatdt",
    "rollnotdays",
    "updateutil",
    "liqdodschd",
    "drawdownno",
    "rollby",
    "rollintst",
    "rollmech",
    "rollmethd",
    "rolltype",
    "rollamttyp",
    "rollmattype",
    "rolliccffrom",
    "schdbasis",
    "tresplamt",
    "approlltax",
    "newcompall",
    "rollmatdays",
    "appchg",
    "refrate",
    "rvrintrates",
    "intbas"
})
public class ROLLOVERType2 {

    @XmlElement(name = "ROLLAMT")
    protected BigDecimal rollamt;
    @XmlElement(name = "ROLLMATDT")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar rollmatdt;
    @XmlElement(name = "ROLLNOTDAYS")
    protected String rollnotdays;
    @XmlElement(name = "UPDATEUTIL")
    protected String updateutil;
    @XmlElement(name = "LIQDODSCHD")
    protected String liqdodschd;
    @XmlElement(name = "DRAWDOWNNO")
    protected BigInteger drawdownno;
    @XmlElement(name = "ROLLBY")
    protected String rollby;
    @XmlElement(name = "ROLLINTST")
    protected String rollintst;
    @XmlElement(name = "ROLLMECH")
    protected String rollmech;
    @XmlElement(name = "ROLLMETHD")
    protected String rollmethd;
    @XmlElement(name = "ROLLTYPE")
    protected String rolltype;
    @XmlElement(name = "ROLLAMTTYP")
    protected String rollamttyp;
    @XmlElement(name = "ROLLMATTYPE")
    protected String rollmattype;
    @XmlElement(name = "ROLLICCFFROM")
    protected String rolliccffrom;
    @XmlElement(name = "SCHDBASIS")
    protected String schdbasis;
    @XmlElement(name = "TRESPLAMT")
    protected String tresplamt;
    @XmlElement(name = "APPROLLTAX")
    protected String approlltax;
    @XmlElement(name = "NEWCOMPALL")
    protected String newcompall;
    @XmlElement(name = "ROLLMATDAYS")
    protected BigDecimal rollmatdays;
    @XmlElement(name = "APPCHG")
    protected String appchg;
    @XmlElement(name = "REFRATE")
    protected BigDecimal refrate;
    @XmlElement(name = "Rvrintrates")
    protected List<ROLLOVERType2 .Rvrintrates> rvrintrates;
    @XmlElement(name = "INTBAS")
    protected List<INTBASType4> intbas;

    /**
     * Gets the value of the rollamt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getROLLAMT() {
        return rollamt;
    }

    /**
     * Sets the value of the rollamt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setROLLAMT(BigDecimal value) {
        this.rollamt = value;
    }

    /**
     * Gets the value of the rollmatdt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getROLLMATDT() {
        return rollmatdt;
    }

    /**
     * Sets the value of the rollmatdt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setROLLMATDT(XMLGregorianCalendar value) {
        this.rollmatdt = value;
    }

    /**
     * Gets the value of the rollnotdays property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getROLLNOTDAYS() {
        return rollnotdays;
    }

    /**
     * Sets the value of the rollnotdays property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setROLLNOTDAYS(String value) {
        this.rollnotdays = value;
    }

    /**
     * Gets the value of the updateutil property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUPDATEUTIL() {
        return updateutil;
    }

    /**
     * Sets the value of the updateutil property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUPDATEUTIL(String value) {
        this.updateutil = value;
    }

    /**
     * Gets the value of the liqdodschd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLIQDODSCHD() {
        return liqdodschd;
    }

    /**
     * Sets the value of the liqdodschd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLIQDODSCHD(String value) {
        this.liqdodschd = value;
    }

    /**
     * Gets the value of the drawdownno property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDRAWDOWNNO() {
        return drawdownno;
    }

    /**
     * Sets the value of the drawdownno property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDRAWDOWNNO(BigInteger value) {
        this.drawdownno = value;
    }

    /**
     * Gets the value of the rollby property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getROLLBY() {
        return rollby;
    }

    /**
     * Sets the value of the rollby property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setROLLBY(String value) {
        this.rollby = value;
    }

    /**
     * Gets the value of the rollintst property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getROLLINTST() {
        return rollintst;
    }

    /**
     * Sets the value of the rollintst property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setROLLINTST(String value) {
        this.rollintst = value;
    }

    /**
     * Gets the value of the rollmech property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getROLLMECH() {
        return rollmech;
    }

    /**
     * Sets the value of the rollmech property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setROLLMECH(String value) {
        this.rollmech = value;
    }

    /**
     * Gets the value of the rollmethd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getROLLMETHD() {
        return rollmethd;
    }

    /**
     * Sets the value of the rollmethd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setROLLMETHD(String value) {
        this.rollmethd = value;
    }

    /**
     * Gets the value of the rolltype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getROLLTYPE() {
        return rolltype;
    }

    /**
     * Sets the value of the rolltype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setROLLTYPE(String value) {
        this.rolltype = value;
    }

    /**
     * Gets the value of the rollamttyp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getROLLAMTTYP() {
        return rollamttyp;
    }

    /**
     * Sets the value of the rollamttyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setROLLAMTTYP(String value) {
        this.rollamttyp = value;
    }

    /**
     * Gets the value of the rollmattype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getROLLMATTYPE() {
        return rollmattype;
    }

    /**
     * Sets the value of the rollmattype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setROLLMATTYPE(String value) {
        this.rollmattype = value;
    }

    /**
     * Gets the value of the rolliccffrom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getROLLICCFFROM() {
        return rolliccffrom;
    }

    /**
     * Sets the value of the rolliccffrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setROLLICCFFROM(String value) {
        this.rolliccffrom = value;
    }

    /**
     * Gets the value of the schdbasis property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSCHDBASIS() {
        return schdbasis;
    }

    /**
     * Sets the value of the schdbasis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSCHDBASIS(String value) {
        this.schdbasis = value;
    }

    /**
     * Gets the value of the tresplamt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTRESPLAMT() {
        return tresplamt;
    }

    /**
     * Sets the value of the tresplamt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTRESPLAMT(String value) {
        this.tresplamt = value;
    }

    /**
     * Gets the value of the approlltax property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPPROLLTAX() {
        return approlltax;
    }

    /**
     * Sets the value of the approlltax property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPPROLLTAX(String value) {
        this.approlltax = value;
    }

    /**
     * Gets the value of the newcompall property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNEWCOMPALL() {
        return newcompall;
    }

    /**
     * Sets the value of the newcompall property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNEWCOMPALL(String value) {
        this.newcompall = value;
    }

    /**
     * Gets the value of the rollmatdays property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getROLLMATDAYS() {
        return rollmatdays;
    }

    /**
     * Sets the value of the rollmatdays property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setROLLMATDAYS(BigDecimal value) {
        this.rollmatdays = value;
    }

    /**
     * Gets the value of the appchg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPPCHG() {
        return appchg;
    }

    /**
     * Sets the value of the appchg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPPCHG(String value) {
        this.appchg = value;
    }

    /**
     * Gets the value of the refrate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getREFRATE() {
        return refrate;
    }

    /**
     * Sets the value of the refrate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setREFRATE(BigDecimal value) {
        this.refrate = value;
    }

    /**
     * Gets the value of the rvrintrates property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rvrintrates property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRvrintrates().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ROLLOVERType2 .Rvrintrates }
     * 
     * 
     */
    public List<ROLLOVERType2 .Rvrintrates> getRvrintrates() {
        if (rvrintrates == null) {
            rvrintrates = new ArrayList<ROLLOVERType2 .Rvrintrates>();
        }
        return this.rvrintrates;
    }

    /**
     * Gets the value of the intbas property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the intbas property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getINTBAS().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link INTBASType4 }
     * 
     * 
     */
    public List<INTBASType4> getINTBAS() {
        if (intbas == null) {
            intbas = new ArrayList<INTBASType4>();
        }
        return this.intbas;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="INTCOMP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="DEFFROM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="RATETYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="INTBASIS" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "intcomp",
        "deffrom",
        "ratetype",
        "intbasis"
    })
    public static class Rvrintrates {

        @XmlElement(name = "INTCOMP")
        protected String intcomp;
        @XmlElement(name = "DEFFROM")
        protected String deffrom;
        @XmlElement(name = "RATETYPE")
        protected String ratetype;
        @XmlElement(name = "INTBASIS")
        protected BigInteger intbasis;

        /**
         * Gets the value of the intcomp property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getINTCOMP() {
            return intcomp;
        }

        /**
         * Sets the value of the intcomp property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setINTCOMP(String value) {
            this.intcomp = value;
        }

        /**
         * Gets the value of the deffrom property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDEFFROM() {
            return deffrom;
        }

        /**
         * Sets the value of the deffrom property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDEFFROM(String value) {
            this.deffrom = value;
        }

        /**
         * Gets the value of the ratetype property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRATETYPE() {
            return ratetype;
        }

        /**
         * Sets the value of the ratetype property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRATETYPE(String value) {
            this.ratetype = value;
        }

        /**
         * Gets the value of the intbasis property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getINTBASIS() {
            return intbasis;
        }

        /**
         * Sets the value of the intbasis property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setINTBASIS(BigInteger value) {
            this.intbasis = value;
        }

    }

}
