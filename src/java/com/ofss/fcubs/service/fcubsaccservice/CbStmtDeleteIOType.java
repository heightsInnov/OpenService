
package com.ofss.fcubs.service.fcubsaccservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CbStmt-Delete-IO-Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CbStmt-Delete-IO-Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="STMT_ID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CUSNO" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CbStmt-Delete-IO-Type", propOrder = {
    "stmtid",
    "cusno"
})
public class CbStmtDeleteIOType {

    @XmlElement(name = "STMT_ID", required = true)
    protected String stmtid;
    @XmlElement(name = "CUSNO", required = true)
    protected String cusno;

    /**
     * Gets the value of the stmtid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTMTID() {
        return stmtid;
    }

    /**
     * Sets the value of the stmtid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSTMTID(String value) {
        this.stmtid = value;
    }

    /**
     * Gets the value of the cusno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCUSNO() {
        return cusno;
    }

    /**
     * Sets the value of the cusno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCUSNO(String value) {
        this.cusno = value;
    }

}
