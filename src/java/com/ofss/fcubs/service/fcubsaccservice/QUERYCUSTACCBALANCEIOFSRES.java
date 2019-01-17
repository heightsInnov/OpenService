
package com.ofss.fcubs.service.fcubsaccservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="FCUBS_HEADER" type="{http://fcubs.ofss.com/service/FCUBSAccService}FCUBS_HEADERType"/>
 *         &lt;element name="FCUBS_BODY">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Acvws-Acdcbird-Cust-Account-IO" type="{http://fcubs.ofss.com/service/FCUBSAccService}CustAccBalance-Query-IO-Type" minOccurs="0"/>
 *                   &lt;element name="Acvws-Acdcbird-Cust-Account-Full" type="{http://fcubs.ofss.com/service/FCUBSAccService}CustAccBalance-Full-Type" minOccurs="0"/>
 *                   &lt;element name="FCUBS_ERROR_RESP" type="{http://fcubs.ofss.com/service/FCUBSAccService}ERRORType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="FCUBS_WARNING_RESP" type="{http://fcubs.ofss.com/service/FCUBSAccService}WARNINGType" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
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
    "fcubsheader",
    "fcubsbody"
})
@XmlRootElement(name = "QUERYCUSTACCBALANCE_IOFS_RES")
public class QUERYCUSTACCBALANCEIOFSRES {

    @XmlElement(name = "FCUBS_HEADER", required = true)
    protected FCUBSHEADERType fcubsheader;
    @XmlElement(name = "FCUBS_BODY", required = true)
    protected QUERYCUSTACCBALANCEIOFSRES.FCUBSBODY fcubsbody;

    /**
     * Gets the value of the fcubsheader property.
     * 
     * @return
     *     possible object is
     *     {@link FCUBSHEADERType }
     *     
     */
    public FCUBSHEADERType getFCUBSHEADER() {
        return fcubsheader;
    }

    /**
     * Sets the value of the fcubsheader property.
     * 
     * @param value
     *     allowed object is
     *     {@link FCUBSHEADERType }
     *     
     */
    public void setFCUBSHEADER(FCUBSHEADERType value) {
        this.fcubsheader = value;
    }

    /**
     * Gets the value of the fcubsbody property.
     * 
     * @return
     *     possible object is
     *     {@link QUERYCUSTACCBALANCEIOFSRES.FCUBSBODY }
     *     
     */
    public QUERYCUSTACCBALANCEIOFSRES.FCUBSBODY getFCUBSBODY() {
        return fcubsbody;
    }

    /**
     * Sets the value of the fcubsbody property.
     * 
     * @param value
     *     allowed object is
     *     {@link QUERYCUSTACCBALANCEIOFSRES.FCUBSBODY }
     *     
     */
    public void setFCUBSBODY(QUERYCUSTACCBALANCEIOFSRES.FCUBSBODY value) {
        this.fcubsbody = value;
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
     *         &lt;element name="Acvws-Acdcbird-Cust-Account-IO" type="{http://fcubs.ofss.com/service/FCUBSAccService}CustAccBalance-Query-IO-Type" minOccurs="0"/>
     *         &lt;element name="Acvws-Acdcbird-Cust-Account-Full" type="{http://fcubs.ofss.com/service/FCUBSAccService}CustAccBalance-Full-Type" minOccurs="0"/>
     *         &lt;element name="FCUBS_ERROR_RESP" type="{http://fcubs.ofss.com/service/FCUBSAccService}ERRORType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="FCUBS_WARNING_RESP" type="{http://fcubs.ofss.com/service/FCUBSAccService}WARNINGType" maxOccurs="unbounded" minOccurs="0"/>
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
        "acvwsAcdcbirdCustAccountIO",
        "acvwsAcdcbirdCustAccountFull",
        "fcubserrorresp",
        "fcubswarningresp"
    })
    public static class FCUBSBODY {

        @XmlElement(name = "Acvws-Acdcbird-Cust-Account-IO")
        protected CustAccBalanceQueryIOType acvwsAcdcbirdCustAccountIO;
        @XmlElement(name = "Acvws-Acdcbird-Cust-Account-Full")
        protected CustAccBalanceFullType acvwsAcdcbirdCustAccountFull;
        @XmlElement(name = "FCUBS_ERROR_RESP")
        protected List<ERRORType> fcubserrorresp;
        @XmlElement(name = "FCUBS_WARNING_RESP")
        protected List<WARNINGType> fcubswarningresp;

        /**
         * Gets the value of the acvwsAcdcbirdCustAccountIO property.
         * 
         * @return
         *     possible object is
         *     {@link CustAccBalanceQueryIOType }
         *     
         */
        public CustAccBalanceQueryIOType getAcvwsAcdcbirdCustAccountIO() {
            return acvwsAcdcbirdCustAccountIO;
        }

        /**
         * Sets the value of the acvwsAcdcbirdCustAccountIO property.
         * 
         * @param value
         *     allowed object is
         *     {@link CustAccBalanceQueryIOType }
         *     
         */
        public void setAcvwsAcdcbirdCustAccountIO(CustAccBalanceQueryIOType value) {
            this.acvwsAcdcbirdCustAccountIO = value;
        }

        /**
         * Gets the value of the acvwsAcdcbirdCustAccountFull property.
         * 
         * @return
         *     possible object is
         *     {@link CustAccBalanceFullType }
         *     
         */
        public CustAccBalanceFullType getAcvwsAcdcbirdCustAccountFull() {
            return acvwsAcdcbirdCustAccountFull;
        }

        /**
         * Sets the value of the acvwsAcdcbirdCustAccountFull property.
         * 
         * @param value
         *     allowed object is
         *     {@link CustAccBalanceFullType }
         *     
         */
        public void setAcvwsAcdcbirdCustAccountFull(CustAccBalanceFullType value) {
            this.acvwsAcdcbirdCustAccountFull = value;
        }

        /**
         * Gets the value of the fcubserrorresp property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the fcubserrorresp property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFCUBSERRORRESP().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ERRORType }
         * 
         * 
         */
        public List<ERRORType> getFCUBSERRORRESP() {
            if (fcubserrorresp == null) {
                fcubserrorresp = new ArrayList<ERRORType>();
            }
            return this.fcubserrorresp;
        }

        /**
         * Gets the value of the fcubswarningresp property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the fcubswarningresp property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFCUBSWARNINGRESP().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link WARNINGType }
         * 
         * 
         */
        public List<WARNINGType> getFCUBSWARNINGRESP() {
            if (fcubswarningresp == null) {
                fcubswarningresp = new ArrayList<WARNINGType>();
            }
            return this.fcubswarningresp;
        }

    }

}
