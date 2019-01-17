
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
 *                   &lt;element name="Ictb-Deposit-Instruction-IO" type="{http://fcubs.ofss.com/service/FCUBSAccService}AutoDepIns-Modify-IO-Type"/>
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
@XmlRootElement(name = "MODIFYAUTODEPINS_IOPK_REQ")
public class MODIFYAUTODEPINSIOPKREQ {

    @XmlElement(name = "FCUBS_HEADER", required = true)
    protected FCUBSHEADERType fcubsheader;
    @XmlElement(name = "FCUBS_BODY", required = true)
    protected MODIFYAUTODEPINSIOPKREQ.FCUBSBODY fcubsbody;

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
     *     {@link MODIFYAUTODEPINSIOPKREQ.FCUBSBODY }
     *     
     */
    public MODIFYAUTODEPINSIOPKREQ.FCUBSBODY getFCUBSBODY() {
        return fcubsbody;
    }

    /**
     * Sets the value of the fcubsbody property.
     * 
     * @param value
     *     allowed object is
     *     {@link MODIFYAUTODEPINSIOPKREQ.FCUBSBODY }
     *     
     */
    public void setFCUBSBODY(MODIFYAUTODEPINSIOPKREQ.FCUBSBODY value) {
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
     *         &lt;element name="Ictb-Deposit-Instruction-IO" type="{http://fcubs.ofss.com/service/FCUBSAccService}AutoDepIns-Modify-IO-Type"/>
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
        "ictbDepositInstructionIO"
    })
    public static class FCUBSBODY {

        @XmlElement(name = "Ictb-Deposit-Instruction-IO", required = true)
        protected AutoDepInsModifyIOType ictbDepositInstructionIO;

        /**
         * Gets the value of the ictbDepositInstructionIO property.
         * 
         * @return
         *     possible object is
         *     {@link AutoDepInsModifyIOType }
         *     
         */
        public AutoDepInsModifyIOType getIctbDepositInstructionIO() {
            return ictbDepositInstructionIO;
        }

        /**
         * Sets the value of the ictbDepositInstructionIO property.
         * 
         * @param value
         *     allowed object is
         *     {@link AutoDepInsModifyIOType }
         *     
         */
        public void setIctbDepositInstructionIO(AutoDepInsModifyIOType value) {
            this.ictbDepositInstructionIO = value;
        }

    }

}
