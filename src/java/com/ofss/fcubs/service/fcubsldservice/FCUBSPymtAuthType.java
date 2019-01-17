
package com.ofss.fcubs.service.fcubsldservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FCUBSPymtAuthType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FCUBSPymtAuthType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Paymentauth-Details" type="{http://fcubs.ofss.com/service/FCUBSLDService}ContractDescriptionType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FCUBSPymtAuthType", propOrder = {
    "paymentauthDetails"
})
public class FCUBSPymtAuthType {

    @XmlElement(name = "Paymentauth-Details", required = true)
    protected ContractDescriptionType paymentauthDetails;

    /**
     * Gets the value of the paymentauthDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ContractDescriptionType }
     *     
     */
    public ContractDescriptionType getPaymentauthDetails() {
        return paymentauthDetails;
    }

    /**
     * Sets the value of the paymentauthDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContractDescriptionType }
     *     
     */
    public void setPaymentauthDetails(ContractDescriptionType value) {
        this.paymentauthDetails = value;
    }

}
