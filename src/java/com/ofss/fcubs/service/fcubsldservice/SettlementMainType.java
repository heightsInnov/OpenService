
package com.ofss.fcubs.service.fcubsldservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SettlementMainType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SettlementMainType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ACC_INST1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACC_INST2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACC_INST3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACC_INST4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACC_INST5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACC_INST6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AGRID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AMTTAG" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="BNKPRIO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BNFINSTCVR1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BNFINSTCVR2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BNFINSTCVR3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BNFINSTCVR4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BNFINSTCVR5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BNFINSTCVR6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BENEF_INST1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BENEF_INST2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BENEF_INST3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BENEF_INST4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BENEF_INST5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BENEF_INST6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CHGDET" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CLGNTW" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CVRBY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="COVER_REQ" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="XPTACC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="XPTBIC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="XPTCLGNTW" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="XPTNAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IBANACCNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="INST_NO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="INST_TYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="INT_REIM_INST1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="INT_REIM_INST2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="INT_REIM_INST3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="INT_REIM_INST4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="INT_REIM_INST5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="INT_REIM_INST6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="INTMEDRY1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="INTMEDRY2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="INTMEDRY3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="INTMEDRY4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="INTMEDRY5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="INTMEDRY6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ORDER_CUST1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ORDER_CUST2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ORDER_CUST3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ORDER_CUST4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ORDER_CUST5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ORDER_CUST6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ORDER_INST1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ORDER_INST2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ORDER_INST3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ORDER_INST4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ORDER_INST5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ORDER_INST6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OUR_CORRESP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PMNT_BY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PMNT_DETAILS1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PMNT_DETAILS2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PMNT_DETAILS3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PMNT_DETAILS4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="POSTACCNG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RCVR_CORRESP1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RCVR_CORRESP2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RCVR_CORRESP3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RCVR_CORRESP4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RCVR_CORRESP5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RCVR_CORRESP6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RECEIVER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RTGSNW" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RTGSPMNT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SNDR_INFO1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SNDR_INFO2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SNDR_INFO3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SNDR_INFO4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SNDR_INFO5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SNDR_INFO6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TRNFRTYP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ULT_BENEF1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ULT_BENEF2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ULT_BENEF3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ULT_BENEF4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ULT_BENEF5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ULT_BENEF6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AMTTAGDESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DISEXTBKCD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PAYBNK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PAYBRN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WAVEINSTCHARG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BNKOPRCD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ENV_CONT1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ENV_CONT2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ENV_CONT3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ENV_CONT4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ENV_CONT5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SettlementMainType", propOrder = {
    "accinst1",
    "accinst2",
    "accinst3",
    "accinst4",
    "accinst5",
    "accinst6",
    "agrid",
    "amttag",
    "bnkprio",
    "bnfinstcvr1",
    "bnfinstcvr2",
    "bnfinstcvr3",
    "bnfinstcvr4",
    "bnfinstcvr5",
    "bnfinstcvr6",
    "benefinst1",
    "benefinst2",
    "benefinst3",
    "benefinst4",
    "benefinst5",
    "benefinst6",
    "chgdet",
    "clgntw",
    "cvrby",
    "coverreq",
    "xptacc",
    "xptbic",
    "xptclgntw",
    "xptname",
    "ibanaccno",
    "instno",
    "insttype",
    "intreiminst1",
    "intreiminst2",
    "intreiminst3",
    "intreiminst4",
    "intreiminst5",
    "intreiminst6",
    "intmedry1",
    "intmedry2",
    "intmedry3",
    "intmedry4",
    "intmedry5",
    "intmedry6",
    "ordercust1",
    "ordercust2",
    "ordercust3",
    "ordercust4",
    "ordercust5",
    "ordercust6",
    "orderinst1",
    "orderinst2",
    "orderinst3",
    "orderinst4",
    "orderinst5",
    "orderinst6",
    "ourcorresp",
    "pmntby",
    "pmntdetails1",
    "pmntdetails2",
    "pmntdetails3",
    "pmntdetails4",
    "postaccng",
    "rcvrcorresp1",
    "rcvrcorresp2",
    "rcvrcorresp3",
    "rcvrcorresp4",
    "rcvrcorresp5",
    "rcvrcorresp6",
    "receiver",
    "rtgsnw",
    "rtgspmnt",
    "sndrinfo1",
    "sndrinfo2",
    "sndrinfo3",
    "sndrinfo4",
    "sndrinfo5",
    "sndrinfo6",
    "trnfrtyp",
    "ultbenef1",
    "ultbenef2",
    "ultbenef3",
    "ultbenef4",
    "ultbenef5",
    "ultbenef6",
    "amttagdesc",
    "disextbkcd",
    "paybnk",
    "paybrn",
    "waveinstcharg",
    "bnkoprcd",
    "envcont1",
    "envcont2",
    "envcont3",
    "envcont4",
    "envcont5"
})
public class SettlementMainType {

    @XmlElement(name = "ACC_INST1")
    protected String accinst1;
    @XmlElement(name = "ACC_INST2")
    protected String accinst2;
    @XmlElement(name = "ACC_INST3")
    protected String accinst3;
    @XmlElement(name = "ACC_INST4")
    protected String accinst4;
    @XmlElement(name = "ACC_INST5")
    protected String accinst5;
    @XmlElement(name = "ACC_INST6")
    protected String accinst6;
    @XmlElement(name = "AGRID")
    protected String agrid;
    @XmlElement(name = "AMTTAG", required = true)
    protected String amttag;
    @XmlElement(name = "BNKPRIO")
    protected String bnkprio;
    @XmlElement(name = "BNFINSTCVR1")
    protected String bnfinstcvr1;
    @XmlElement(name = "BNFINSTCVR2")
    protected String bnfinstcvr2;
    @XmlElement(name = "BNFINSTCVR3")
    protected String bnfinstcvr3;
    @XmlElement(name = "BNFINSTCVR4")
    protected String bnfinstcvr4;
    @XmlElement(name = "BNFINSTCVR5")
    protected String bnfinstcvr5;
    @XmlElement(name = "BNFINSTCVR6")
    protected String bnfinstcvr6;
    @XmlElement(name = "BENEF_INST1")
    protected String benefinst1;
    @XmlElement(name = "BENEF_INST2")
    protected String benefinst2;
    @XmlElement(name = "BENEF_INST3")
    protected String benefinst3;
    @XmlElement(name = "BENEF_INST4")
    protected String benefinst4;
    @XmlElement(name = "BENEF_INST5")
    protected String benefinst5;
    @XmlElement(name = "BENEF_INST6")
    protected String benefinst6;
    @XmlElement(name = "CHGDET")
    protected String chgdet;
    @XmlElement(name = "CLGNTW")
    protected String clgntw;
    @XmlElement(name = "CVRBY")
    protected String cvrby;
    @XmlElement(name = "COVER_REQ")
    protected String coverreq;
    @XmlElement(name = "XPTACC")
    protected String xptacc;
    @XmlElement(name = "XPTBIC")
    protected String xptbic;
    @XmlElement(name = "XPTCLGNTW")
    protected String xptclgntw;
    @XmlElement(name = "XPTNAME")
    protected String xptname;
    @XmlElement(name = "IBANACCNO")
    protected String ibanaccno;
    @XmlElement(name = "INST_NO")
    protected String instno;
    @XmlElement(name = "INST_TYPE")
    protected String insttype;
    @XmlElement(name = "INT_REIM_INST1")
    protected String intreiminst1;
    @XmlElement(name = "INT_REIM_INST2")
    protected String intreiminst2;
    @XmlElement(name = "INT_REIM_INST3")
    protected String intreiminst3;
    @XmlElement(name = "INT_REIM_INST4")
    protected String intreiminst4;
    @XmlElement(name = "INT_REIM_INST5")
    protected String intreiminst5;
    @XmlElement(name = "INT_REIM_INST6")
    protected String intreiminst6;
    @XmlElement(name = "INTMEDRY1")
    protected String intmedry1;
    @XmlElement(name = "INTMEDRY2")
    protected String intmedry2;
    @XmlElement(name = "INTMEDRY3")
    protected String intmedry3;
    @XmlElement(name = "INTMEDRY4")
    protected String intmedry4;
    @XmlElement(name = "INTMEDRY5")
    protected String intmedry5;
    @XmlElement(name = "INTMEDRY6")
    protected String intmedry6;
    @XmlElement(name = "ORDER_CUST1")
    protected String ordercust1;
    @XmlElement(name = "ORDER_CUST2")
    protected String ordercust2;
    @XmlElement(name = "ORDER_CUST3")
    protected String ordercust3;
    @XmlElement(name = "ORDER_CUST4")
    protected String ordercust4;
    @XmlElement(name = "ORDER_CUST5")
    protected String ordercust5;
    @XmlElement(name = "ORDER_CUST6")
    protected String ordercust6;
    @XmlElement(name = "ORDER_INST1")
    protected String orderinst1;
    @XmlElement(name = "ORDER_INST2")
    protected String orderinst2;
    @XmlElement(name = "ORDER_INST3")
    protected String orderinst3;
    @XmlElement(name = "ORDER_INST4")
    protected String orderinst4;
    @XmlElement(name = "ORDER_INST5")
    protected String orderinst5;
    @XmlElement(name = "ORDER_INST6")
    protected String orderinst6;
    @XmlElement(name = "OUR_CORRESP")
    protected String ourcorresp;
    @XmlElement(name = "PMNT_BY")
    protected String pmntby;
    @XmlElement(name = "PMNT_DETAILS1")
    protected String pmntdetails1;
    @XmlElement(name = "PMNT_DETAILS2")
    protected String pmntdetails2;
    @XmlElement(name = "PMNT_DETAILS3")
    protected String pmntdetails3;
    @XmlElement(name = "PMNT_DETAILS4")
    protected String pmntdetails4;
    @XmlElement(name = "POSTACCNG")
    protected String postaccng;
    @XmlElement(name = "RCVR_CORRESP1")
    protected String rcvrcorresp1;
    @XmlElement(name = "RCVR_CORRESP2")
    protected String rcvrcorresp2;
    @XmlElement(name = "RCVR_CORRESP3")
    protected String rcvrcorresp3;
    @XmlElement(name = "RCVR_CORRESP4")
    protected String rcvrcorresp4;
    @XmlElement(name = "RCVR_CORRESP5")
    protected String rcvrcorresp5;
    @XmlElement(name = "RCVR_CORRESP6")
    protected String rcvrcorresp6;
    @XmlElement(name = "RECEIVER")
    protected String receiver;
    @XmlElement(name = "RTGSNW")
    protected String rtgsnw;
    @XmlElement(name = "RTGSPMNT")
    protected String rtgspmnt;
    @XmlElement(name = "SNDR_INFO1")
    protected String sndrinfo1;
    @XmlElement(name = "SNDR_INFO2")
    protected String sndrinfo2;
    @XmlElement(name = "SNDR_INFO3")
    protected String sndrinfo3;
    @XmlElement(name = "SNDR_INFO4")
    protected String sndrinfo4;
    @XmlElement(name = "SNDR_INFO5")
    protected String sndrinfo5;
    @XmlElement(name = "SNDR_INFO6")
    protected String sndrinfo6;
    @XmlElement(name = "TRNFRTYP")
    protected String trnfrtyp;
    @XmlElement(name = "ULT_BENEF1")
    protected String ultbenef1;
    @XmlElement(name = "ULT_BENEF2")
    protected String ultbenef2;
    @XmlElement(name = "ULT_BENEF3")
    protected String ultbenef3;
    @XmlElement(name = "ULT_BENEF4")
    protected String ultbenef4;
    @XmlElement(name = "ULT_BENEF5")
    protected String ultbenef5;
    @XmlElement(name = "ULT_BENEF6")
    protected String ultbenef6;
    @XmlElement(name = "AMTTAGDESC")
    protected String amttagdesc;
    @XmlElement(name = "DISEXTBKCD")
    protected String disextbkcd;
    @XmlElement(name = "PAYBNK")
    protected String paybnk;
    @XmlElement(name = "PAYBRN")
    protected String paybrn;
    @XmlElement(name = "WAVEINSTCHARG")
    protected String waveinstcharg;
    @XmlElement(name = "BNKOPRCD")
    protected String bnkoprcd;
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

    /**
     * Gets the value of the accinst1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACCINST1() {
        return accinst1;
    }

    /**
     * Sets the value of the accinst1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACCINST1(String value) {
        this.accinst1 = value;
    }

    /**
     * Gets the value of the accinst2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACCINST2() {
        return accinst2;
    }

    /**
     * Sets the value of the accinst2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACCINST2(String value) {
        this.accinst2 = value;
    }

    /**
     * Gets the value of the accinst3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACCINST3() {
        return accinst3;
    }

    /**
     * Sets the value of the accinst3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACCINST3(String value) {
        this.accinst3 = value;
    }

    /**
     * Gets the value of the accinst4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACCINST4() {
        return accinst4;
    }

    /**
     * Sets the value of the accinst4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACCINST4(String value) {
        this.accinst4 = value;
    }

    /**
     * Gets the value of the accinst5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACCINST5() {
        return accinst5;
    }

    /**
     * Sets the value of the accinst5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACCINST5(String value) {
        this.accinst5 = value;
    }

    /**
     * Gets the value of the accinst6 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACCINST6() {
        return accinst6;
    }

    /**
     * Sets the value of the accinst6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACCINST6(String value) {
        this.accinst6 = value;
    }

    /**
     * Gets the value of the agrid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAGRID() {
        return agrid;
    }

    /**
     * Sets the value of the agrid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAGRID(String value) {
        this.agrid = value;
    }

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
     * Gets the value of the bnkprio property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBNKPRIO() {
        return bnkprio;
    }

    /**
     * Sets the value of the bnkprio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBNKPRIO(String value) {
        this.bnkprio = value;
    }

    /**
     * Gets the value of the bnfinstcvr1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBNFINSTCVR1() {
        return bnfinstcvr1;
    }

    /**
     * Sets the value of the bnfinstcvr1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBNFINSTCVR1(String value) {
        this.bnfinstcvr1 = value;
    }

    /**
     * Gets the value of the bnfinstcvr2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBNFINSTCVR2() {
        return bnfinstcvr2;
    }

    /**
     * Sets the value of the bnfinstcvr2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBNFINSTCVR2(String value) {
        this.bnfinstcvr2 = value;
    }

    /**
     * Gets the value of the bnfinstcvr3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBNFINSTCVR3() {
        return bnfinstcvr3;
    }

    /**
     * Sets the value of the bnfinstcvr3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBNFINSTCVR3(String value) {
        this.bnfinstcvr3 = value;
    }

    /**
     * Gets the value of the bnfinstcvr4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBNFINSTCVR4() {
        return bnfinstcvr4;
    }

    /**
     * Sets the value of the bnfinstcvr4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBNFINSTCVR4(String value) {
        this.bnfinstcvr4 = value;
    }

    /**
     * Gets the value of the bnfinstcvr5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBNFINSTCVR5() {
        return bnfinstcvr5;
    }

    /**
     * Sets the value of the bnfinstcvr5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBNFINSTCVR5(String value) {
        this.bnfinstcvr5 = value;
    }

    /**
     * Gets the value of the bnfinstcvr6 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBNFINSTCVR6() {
        return bnfinstcvr6;
    }

    /**
     * Sets the value of the bnfinstcvr6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBNFINSTCVR6(String value) {
        this.bnfinstcvr6 = value;
    }

    /**
     * Gets the value of the benefinst1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBENEFINST1() {
        return benefinst1;
    }

    /**
     * Sets the value of the benefinst1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBENEFINST1(String value) {
        this.benefinst1 = value;
    }

    /**
     * Gets the value of the benefinst2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBENEFINST2() {
        return benefinst2;
    }

    /**
     * Sets the value of the benefinst2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBENEFINST2(String value) {
        this.benefinst2 = value;
    }

    /**
     * Gets the value of the benefinst3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBENEFINST3() {
        return benefinst3;
    }

    /**
     * Sets the value of the benefinst3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBENEFINST3(String value) {
        this.benefinst3 = value;
    }

    /**
     * Gets the value of the benefinst4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBENEFINST4() {
        return benefinst4;
    }

    /**
     * Sets the value of the benefinst4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBENEFINST4(String value) {
        this.benefinst4 = value;
    }

    /**
     * Gets the value of the benefinst5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBENEFINST5() {
        return benefinst5;
    }

    /**
     * Sets the value of the benefinst5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBENEFINST5(String value) {
        this.benefinst5 = value;
    }

    /**
     * Gets the value of the benefinst6 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBENEFINST6() {
        return benefinst6;
    }

    /**
     * Sets the value of the benefinst6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBENEFINST6(String value) {
        this.benefinst6 = value;
    }

    /**
     * Gets the value of the chgdet property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCHGDET() {
        return chgdet;
    }

    /**
     * Sets the value of the chgdet property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCHGDET(String value) {
        this.chgdet = value;
    }

    /**
     * Gets the value of the clgntw property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCLGNTW() {
        return clgntw;
    }

    /**
     * Sets the value of the clgntw property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCLGNTW(String value) {
        this.clgntw = value;
    }

    /**
     * Gets the value of the cvrby property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCVRBY() {
        return cvrby;
    }

    /**
     * Sets the value of the cvrby property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCVRBY(String value) {
        this.cvrby = value;
    }

    /**
     * Gets the value of the coverreq property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCOVERREQ() {
        return coverreq;
    }

    /**
     * Sets the value of the coverreq property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCOVERREQ(String value) {
        this.coverreq = value;
    }

    /**
     * Gets the value of the xptacc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXPTACC() {
        return xptacc;
    }

    /**
     * Sets the value of the xptacc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXPTACC(String value) {
        this.xptacc = value;
    }

    /**
     * Gets the value of the xptbic property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXPTBIC() {
        return xptbic;
    }

    /**
     * Sets the value of the xptbic property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXPTBIC(String value) {
        this.xptbic = value;
    }

    /**
     * Gets the value of the xptclgntw property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXPTCLGNTW() {
        return xptclgntw;
    }

    /**
     * Sets the value of the xptclgntw property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXPTCLGNTW(String value) {
        this.xptclgntw = value;
    }

    /**
     * Gets the value of the xptname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXPTNAME() {
        return xptname;
    }

    /**
     * Sets the value of the xptname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXPTNAME(String value) {
        this.xptname = value;
    }

    /**
     * Gets the value of the ibanaccno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIBANACCNO() {
        return ibanaccno;
    }

    /**
     * Sets the value of the ibanaccno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIBANACCNO(String value) {
        this.ibanaccno = value;
    }

    /**
     * Gets the value of the instno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINSTNO() {
        return instno;
    }

    /**
     * Sets the value of the instno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINSTNO(String value) {
        this.instno = value;
    }

    /**
     * Gets the value of the insttype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINSTTYPE() {
        return insttype;
    }

    /**
     * Sets the value of the insttype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINSTTYPE(String value) {
        this.insttype = value;
    }

    /**
     * Gets the value of the intreiminst1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINTREIMINST1() {
        return intreiminst1;
    }

    /**
     * Sets the value of the intreiminst1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINTREIMINST1(String value) {
        this.intreiminst1 = value;
    }

    /**
     * Gets the value of the intreiminst2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINTREIMINST2() {
        return intreiminst2;
    }

    /**
     * Sets the value of the intreiminst2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINTREIMINST2(String value) {
        this.intreiminst2 = value;
    }

    /**
     * Gets the value of the intreiminst3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINTREIMINST3() {
        return intreiminst3;
    }

    /**
     * Sets the value of the intreiminst3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINTREIMINST3(String value) {
        this.intreiminst3 = value;
    }

    /**
     * Gets the value of the intreiminst4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINTREIMINST4() {
        return intreiminst4;
    }

    /**
     * Sets the value of the intreiminst4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINTREIMINST4(String value) {
        this.intreiminst4 = value;
    }

    /**
     * Gets the value of the intreiminst5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINTREIMINST5() {
        return intreiminst5;
    }

    /**
     * Sets the value of the intreiminst5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINTREIMINST5(String value) {
        this.intreiminst5 = value;
    }

    /**
     * Gets the value of the intreiminst6 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINTREIMINST6() {
        return intreiminst6;
    }

    /**
     * Sets the value of the intreiminst6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINTREIMINST6(String value) {
        this.intreiminst6 = value;
    }

    /**
     * Gets the value of the intmedry1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINTMEDRY1() {
        return intmedry1;
    }

    /**
     * Sets the value of the intmedry1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINTMEDRY1(String value) {
        this.intmedry1 = value;
    }

    /**
     * Gets the value of the intmedry2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINTMEDRY2() {
        return intmedry2;
    }

    /**
     * Sets the value of the intmedry2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINTMEDRY2(String value) {
        this.intmedry2 = value;
    }

    /**
     * Gets the value of the intmedry3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINTMEDRY3() {
        return intmedry3;
    }

    /**
     * Sets the value of the intmedry3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINTMEDRY3(String value) {
        this.intmedry3 = value;
    }

    /**
     * Gets the value of the intmedry4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINTMEDRY4() {
        return intmedry4;
    }

    /**
     * Sets the value of the intmedry4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINTMEDRY4(String value) {
        this.intmedry4 = value;
    }

    /**
     * Gets the value of the intmedry5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINTMEDRY5() {
        return intmedry5;
    }

    /**
     * Sets the value of the intmedry5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINTMEDRY5(String value) {
        this.intmedry5 = value;
    }

    /**
     * Gets the value of the intmedry6 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINTMEDRY6() {
        return intmedry6;
    }

    /**
     * Sets the value of the intmedry6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINTMEDRY6(String value) {
        this.intmedry6 = value;
    }

    /**
     * Gets the value of the ordercust1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getORDERCUST1() {
        return ordercust1;
    }

    /**
     * Sets the value of the ordercust1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setORDERCUST1(String value) {
        this.ordercust1 = value;
    }

    /**
     * Gets the value of the ordercust2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getORDERCUST2() {
        return ordercust2;
    }

    /**
     * Sets the value of the ordercust2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setORDERCUST2(String value) {
        this.ordercust2 = value;
    }

    /**
     * Gets the value of the ordercust3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getORDERCUST3() {
        return ordercust3;
    }

    /**
     * Sets the value of the ordercust3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setORDERCUST3(String value) {
        this.ordercust3 = value;
    }

    /**
     * Gets the value of the ordercust4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getORDERCUST4() {
        return ordercust4;
    }

    /**
     * Sets the value of the ordercust4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setORDERCUST4(String value) {
        this.ordercust4 = value;
    }

    /**
     * Gets the value of the ordercust5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getORDERCUST5() {
        return ordercust5;
    }

    /**
     * Sets the value of the ordercust5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setORDERCUST5(String value) {
        this.ordercust5 = value;
    }

    /**
     * Gets the value of the ordercust6 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getORDERCUST6() {
        return ordercust6;
    }

    /**
     * Sets the value of the ordercust6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setORDERCUST6(String value) {
        this.ordercust6 = value;
    }

    /**
     * Gets the value of the orderinst1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getORDERINST1() {
        return orderinst1;
    }

    /**
     * Sets the value of the orderinst1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setORDERINST1(String value) {
        this.orderinst1 = value;
    }

    /**
     * Gets the value of the orderinst2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getORDERINST2() {
        return orderinst2;
    }

    /**
     * Sets the value of the orderinst2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setORDERINST2(String value) {
        this.orderinst2 = value;
    }

    /**
     * Gets the value of the orderinst3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getORDERINST3() {
        return orderinst3;
    }

    /**
     * Sets the value of the orderinst3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setORDERINST3(String value) {
        this.orderinst3 = value;
    }

    /**
     * Gets the value of the orderinst4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getORDERINST4() {
        return orderinst4;
    }

    /**
     * Sets the value of the orderinst4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setORDERINST4(String value) {
        this.orderinst4 = value;
    }

    /**
     * Gets the value of the orderinst5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getORDERINST5() {
        return orderinst5;
    }

    /**
     * Sets the value of the orderinst5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setORDERINST5(String value) {
        this.orderinst5 = value;
    }

    /**
     * Gets the value of the orderinst6 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getORDERINST6() {
        return orderinst6;
    }

    /**
     * Sets the value of the orderinst6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setORDERINST6(String value) {
        this.orderinst6 = value;
    }

    /**
     * Gets the value of the ourcorresp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOURCORRESP() {
        return ourcorresp;
    }

    /**
     * Sets the value of the ourcorresp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOURCORRESP(String value) {
        this.ourcorresp = value;
    }

    /**
     * Gets the value of the pmntby property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPMNTBY() {
        return pmntby;
    }

    /**
     * Sets the value of the pmntby property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPMNTBY(String value) {
        this.pmntby = value;
    }

    /**
     * Gets the value of the pmntdetails1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPMNTDETAILS1() {
        return pmntdetails1;
    }

    /**
     * Sets the value of the pmntdetails1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPMNTDETAILS1(String value) {
        this.pmntdetails1 = value;
    }

    /**
     * Gets the value of the pmntdetails2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPMNTDETAILS2() {
        return pmntdetails2;
    }

    /**
     * Sets the value of the pmntdetails2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPMNTDETAILS2(String value) {
        this.pmntdetails2 = value;
    }

    /**
     * Gets the value of the pmntdetails3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPMNTDETAILS3() {
        return pmntdetails3;
    }

    /**
     * Sets the value of the pmntdetails3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPMNTDETAILS3(String value) {
        this.pmntdetails3 = value;
    }

    /**
     * Gets the value of the pmntdetails4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPMNTDETAILS4() {
        return pmntdetails4;
    }

    /**
     * Sets the value of the pmntdetails4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPMNTDETAILS4(String value) {
        this.pmntdetails4 = value;
    }

    /**
     * Gets the value of the postaccng property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPOSTACCNG() {
        return postaccng;
    }

    /**
     * Sets the value of the postaccng property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPOSTACCNG(String value) {
        this.postaccng = value;
    }

    /**
     * Gets the value of the rcvrcorresp1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRCVRCORRESP1() {
        return rcvrcorresp1;
    }

    /**
     * Sets the value of the rcvrcorresp1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRCVRCORRESP1(String value) {
        this.rcvrcorresp1 = value;
    }

    /**
     * Gets the value of the rcvrcorresp2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRCVRCORRESP2() {
        return rcvrcorresp2;
    }

    /**
     * Sets the value of the rcvrcorresp2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRCVRCORRESP2(String value) {
        this.rcvrcorresp2 = value;
    }

    /**
     * Gets the value of the rcvrcorresp3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRCVRCORRESP3() {
        return rcvrcorresp3;
    }

    /**
     * Sets the value of the rcvrcorresp3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRCVRCORRESP3(String value) {
        this.rcvrcorresp3 = value;
    }

    /**
     * Gets the value of the rcvrcorresp4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRCVRCORRESP4() {
        return rcvrcorresp4;
    }

    /**
     * Sets the value of the rcvrcorresp4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRCVRCORRESP4(String value) {
        this.rcvrcorresp4 = value;
    }

    /**
     * Gets the value of the rcvrcorresp5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRCVRCORRESP5() {
        return rcvrcorresp5;
    }

    /**
     * Sets the value of the rcvrcorresp5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRCVRCORRESP5(String value) {
        this.rcvrcorresp5 = value;
    }

    /**
     * Gets the value of the rcvrcorresp6 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRCVRCORRESP6() {
        return rcvrcorresp6;
    }

    /**
     * Sets the value of the rcvrcorresp6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRCVRCORRESP6(String value) {
        this.rcvrcorresp6 = value;
    }

    /**
     * Gets the value of the receiver property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRECEIVER() {
        return receiver;
    }

    /**
     * Sets the value of the receiver property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRECEIVER(String value) {
        this.receiver = value;
    }

    /**
     * Gets the value of the rtgsnw property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRTGSNW() {
        return rtgsnw;
    }

    /**
     * Sets the value of the rtgsnw property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRTGSNW(String value) {
        this.rtgsnw = value;
    }

    /**
     * Gets the value of the rtgspmnt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRTGSPMNT() {
        return rtgspmnt;
    }

    /**
     * Sets the value of the rtgspmnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRTGSPMNT(String value) {
        this.rtgspmnt = value;
    }

    /**
     * Gets the value of the sndrinfo1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSNDRINFO1() {
        return sndrinfo1;
    }

    /**
     * Sets the value of the sndrinfo1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSNDRINFO1(String value) {
        this.sndrinfo1 = value;
    }

    /**
     * Gets the value of the sndrinfo2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSNDRINFO2() {
        return sndrinfo2;
    }

    /**
     * Sets the value of the sndrinfo2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSNDRINFO2(String value) {
        this.sndrinfo2 = value;
    }

    /**
     * Gets the value of the sndrinfo3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSNDRINFO3() {
        return sndrinfo3;
    }

    /**
     * Sets the value of the sndrinfo3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSNDRINFO3(String value) {
        this.sndrinfo3 = value;
    }

    /**
     * Gets the value of the sndrinfo4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSNDRINFO4() {
        return sndrinfo4;
    }

    /**
     * Sets the value of the sndrinfo4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSNDRINFO4(String value) {
        this.sndrinfo4 = value;
    }

    /**
     * Gets the value of the sndrinfo5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSNDRINFO5() {
        return sndrinfo5;
    }

    /**
     * Sets the value of the sndrinfo5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSNDRINFO5(String value) {
        this.sndrinfo5 = value;
    }

    /**
     * Gets the value of the sndrinfo6 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSNDRINFO6() {
        return sndrinfo6;
    }

    /**
     * Sets the value of the sndrinfo6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSNDRINFO6(String value) {
        this.sndrinfo6 = value;
    }

    /**
     * Gets the value of the trnfrtyp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTRNFRTYP() {
        return trnfrtyp;
    }

    /**
     * Sets the value of the trnfrtyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTRNFRTYP(String value) {
        this.trnfrtyp = value;
    }

    /**
     * Gets the value of the ultbenef1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getULTBENEF1() {
        return ultbenef1;
    }

    /**
     * Sets the value of the ultbenef1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setULTBENEF1(String value) {
        this.ultbenef1 = value;
    }

    /**
     * Gets the value of the ultbenef2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getULTBENEF2() {
        return ultbenef2;
    }

    /**
     * Sets the value of the ultbenef2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setULTBENEF2(String value) {
        this.ultbenef2 = value;
    }

    /**
     * Gets the value of the ultbenef3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getULTBENEF3() {
        return ultbenef3;
    }

    /**
     * Sets the value of the ultbenef3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setULTBENEF3(String value) {
        this.ultbenef3 = value;
    }

    /**
     * Gets the value of the ultbenef4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getULTBENEF4() {
        return ultbenef4;
    }

    /**
     * Sets the value of the ultbenef4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setULTBENEF4(String value) {
        this.ultbenef4 = value;
    }

    /**
     * Gets the value of the ultbenef5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getULTBENEF5() {
        return ultbenef5;
    }

    /**
     * Sets the value of the ultbenef5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setULTBENEF5(String value) {
        this.ultbenef5 = value;
    }

    /**
     * Gets the value of the ultbenef6 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getULTBENEF6() {
        return ultbenef6;
    }

    /**
     * Sets the value of the ultbenef6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setULTBENEF6(String value) {
        this.ultbenef6 = value;
    }

    /**
     * Gets the value of the amttagdesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAMTTAGDESC() {
        return amttagdesc;
    }

    /**
     * Sets the value of the amttagdesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAMTTAGDESC(String value) {
        this.amttagdesc = value;
    }

    /**
     * Gets the value of the disextbkcd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDISEXTBKCD() {
        return disextbkcd;
    }

    /**
     * Sets the value of the disextbkcd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDISEXTBKCD(String value) {
        this.disextbkcd = value;
    }

    /**
     * Gets the value of the paybnk property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPAYBNK() {
        return paybnk;
    }

    /**
     * Sets the value of the paybnk property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPAYBNK(String value) {
        this.paybnk = value;
    }

    /**
     * Gets the value of the paybrn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPAYBRN() {
        return paybrn;
    }

    /**
     * Sets the value of the paybrn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPAYBRN(String value) {
        this.paybrn = value;
    }

    /**
     * Gets the value of the waveinstcharg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWAVEINSTCHARG() {
        return waveinstcharg;
    }

    /**
     * Sets the value of the waveinstcharg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWAVEINSTCHARG(String value) {
        this.waveinstcharg = value;
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

}
