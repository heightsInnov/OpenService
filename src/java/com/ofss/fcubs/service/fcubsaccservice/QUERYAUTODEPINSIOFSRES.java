
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
 *                   &lt;element name="Ictb-Deposit-Instruction-IO" type="{http://fcubs.ofss.com/service/FCUBSAccService}AutoDepIns-Query-IO-Type" minOccurs="0"/>
 *                   &lt;element name="Ictb-Deposit-Instruction-Full" type="{http://fcubs.ofss.com/service/FCUBSAccService}AutoDepIns-Full-Type" minOccurs="0"/>
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
@XmlRootElement(name = "QUERYAUTODEPINS_IOFS_RES")
public class QUERYAUTODEPINSIOFSRES {

    @XmlElement(name = "FCUBS_HEADER", required = true)
    protected FCUBSHEADERType fcubsheader;
    @XmlElement(name = "FCUBS_BODY", required = true)
    protected QUERYAUTODEPINSIOFSRES.FCUBSBODY fcubsbody;

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
     *     {@link QUERYAUTODEPINSIOFSRES.FCUBSBODY }
     *     
     */
    public QUERYAUTODEPINSIOFSRES.FCUBSBODY getFCUBSBODY() {
        return fcubsbody;
    }

    /**
     * Sets the value of the fcubsbody property.
     * 
     * @param value
     *     allowed object is
     *     {@link QUERYAUTODEPINSIOFSRES.FCUBSBODY }
     *     
     */
    public void setFCUBSBODY(QUERYAUTODEPINSIOFSRES.FCUBSBODY value) {
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
     *         &lt;element name="Ictb-Deposit-Instruction-IO" type="{http://fcubs.ofss.com/service/FCUBSAccService}AutoDepIns-Query-IO-Type" minOccurs="0"/>
     *         &lt;element name="Ictb-Deposit-Instruction-Full" type="{http://fcubs.ofss.com/service/FCUBSAccService}AutoDepIns-Full-Type" minOccurs="0"/>
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
        "ictbDepositInstructionIO",
        "ictbDepositInstructionFull",
        "fcubserrorresp",
        "fcubswarningresp"
    })
    public static class FCUBSBODY {

        @XmlElement(name = "Ictb-Deposit-Instruction-IO")
        protected AutoDepInsQueryIOType ictbDepositInstructionIO;
        @XmlElement(name = "Ictb-Deposit-Instruction-Full")
        protected AutoDepInsFullType ictbDepositInstructionFull;
        @XmlElement(name = "FCUBS_ERROR_RESP")
        protected List<ERRORType> fcubserrorresp;
        @XmlElement(name = "FCUBS_WARNING_RESP")
        protected List<WARNINGType> fcubswarningresp;

        /**
         * Gets the value of the ictbDepositInstructionIO property.
         * 
         * @return
         *     possible object is
         *     {@link AutoDepInsQueryIOType }
         *     
         */
        public AutoDepInsQueryIOType getIctbDepositInstructionIO() {
            return ictbDepositInstructionIO;
        }

        /**
         * Sets the value of the ictbDepositInstructionIO property.
         * 
         * @param value
         *     allowed object is
         *     {@link AutoDepInsQueryIOType }
         *     
         */
        public void setIctbDepositInstructionIO(AutoDepInsQueryIOType value) {
            this.ictbDepositInstructionIO = value;
        }

        /**
         * Gets the value of the ictbDepositInstructionFull property.
         * 
         * @return
         *     possible object is
         *     {@link AutoDepInsFullType }
         *     
         */
        public AutoDepInsFullType getIctbDepositInstructionFull() {
            return ictbDepositInstructionFull;
        }

        /**
         * Sets the value of the ictbDepositInstructionFull property.
         * 
         * @param value
         *     allowed object is
         *     {@link AutoDepInsFullType }
         *     
         */
        public void setIctbDepositInstructionFull(AutoDepInsFullType value) {
            this.ictbDepositInstructionFull = value;
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
