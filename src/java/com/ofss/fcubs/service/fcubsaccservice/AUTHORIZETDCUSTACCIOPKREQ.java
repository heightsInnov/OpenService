
package com.ofss.fcubs.service.fcubsaccservice;

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
 *                   &lt;element name="Cust-Account-IO" type="{http://fcubs.ofss.com/service/FCUBSAccService}TDCustAcc-Authorize-IO-Type"/>
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
@XmlRootElement(name = "AUTHORIZETDCUSTACC_IOPK_REQ")
public class AUTHORIZETDCUSTACCIOPKREQ {

    @XmlElement(name = "FCUBS_HEADER", required = true)
    protected FCUBSHEADERType fcubsheader;
    @XmlElement(name = "FCUBS_BODY", required = true)
    protected AUTHORIZETDCUSTACCIOPKREQ.FCUBSBODY fcubsbody;

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
     *     {@link AUTHORIZETDCUSTACCIOPKREQ.FCUBSBODY }
     *     
     */
    public AUTHORIZETDCUSTACCIOPKREQ.FCUBSBODY getFCUBSBODY() {
        return fcubsbody;
    }

    /**
     * Sets the value of the fcubsbody property.
     * 
     * @param value
     *     allowed object is
     *     {@link AUTHORIZETDCUSTACCIOPKREQ.FCUBSBODY }
     *     
     */
    public void setFCUBSBODY(AUTHORIZETDCUSTACCIOPKREQ.FCUBSBODY value) {
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
     *         &lt;element name="Cust-Account-IO" type="{http://fcubs.ofss.com/service/FCUBSAccService}TDCustAcc-Authorize-IO-Type"/>
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
        "custAccountIO"
    })
    public static class FCUBSBODY {

        @XmlElement(name = "Cust-Account-IO", required = true)
        protected TDCustAccAuthorizeIOType custAccountIO;

        /**
         * Gets the value of the custAccountIO property.
         * 
         * @return
         *     possible object is
         *     {@link TDCustAccAuthorizeIOType }
         *     
         */
        public TDCustAccAuthorizeIOType getCustAccountIO() {
            return custAccountIO;
        }

        /**
         * Sets the value of the custAccountIO property.
         * 
         * @param value
         *     allowed object is
         *     {@link TDCustAccAuthorizeIOType }
         *     
         */
        public void setCustAccountIO(TDCustAccAuthorizeIOType value) {
            this.custAccountIO = value;
        }

    }

}