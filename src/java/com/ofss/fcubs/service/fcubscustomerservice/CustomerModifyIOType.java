
package com.ofss.fcubs.service.fcubscustomerservice;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Customer-Modify-IO-Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Customer-Modify-IO-Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PRIVATE_CUSTOMER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CUSTNO" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CTYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ADDRLN1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ADDRLN3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ADDRLN2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ADDRLN4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="COUNTRY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SNAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NLTY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LBRN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CCATEG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FULLNAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CIFCREATIONDT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="ISELCMCUST" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ELCMCUSTNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AR_AP_TRACKING" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EXPCNTRY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UIDNAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UIDVAL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FROZEN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DEAD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WHRUNKN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CRRATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MEDIA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SSN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SWIFTCD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LOC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MAILRSREQD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GRPCD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EXPCAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CUSTCLASSFN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CIFSTAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CIFSTATSNC" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="CHGGRP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CUSTCLGGRP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TAXGROUP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CLSPARTICIPANT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FXNETTCUST" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="XREF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CRMCUST" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ISSUCUST" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TRSRYCUST" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RELPRICING" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MT920" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FLGJOINT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LMCCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HOACNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FXCUSTCLRILIM" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="OVRLIM" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="FX_CLEAN_RISK" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="REVDT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="SECCUSTCLRILIM" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="SECCLRILIM" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="SECCUSTPSRILIM" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="SECPSRILIM" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="FLGUTLTYPRVDR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UTLTYPRVDRID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RISKPRFL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DRCAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AMLREQD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AMLCUSTGRP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CHKDIGITVALREQD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ALGID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FTACCASOF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CUSTUNADV" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CONSTAXCERTRQD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="INDTAXCERTRQD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CLSCCYALLWD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RISKCATEG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FAX" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="JV_LIMIT_TRACKING" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LC_COLLAT_PCT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="CAS_CUST" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LIAB_NODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LIAB_BR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PAST_DUE_FLAG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SHORT_NAME2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="INTRODUCER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WHT_PCT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="UPTYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UDFLBL1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UDFLBL2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UDFLBL3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UDFLBL4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UDFLBL5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RM_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AUTOGENSTMTPLAN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FREQ" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="STMTDAY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PIN_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MAKER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MAKERSTAMP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Custpersonal" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="FSTNAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="MIDNAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="LSTNAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="DOB" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                   &lt;element name="GENDR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="NATIONID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="PPTNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="PPTISSDT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                   &lt;element name="PPTEXPDT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                   &lt;element name="DADD2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="DADD3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="DPIN_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="TELEPHNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="FAXNUMBER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="EMAILID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="BENEFADDR1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ADDRS3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="BENEFADDR2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="DCNTRY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="PCNTRY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="RESSTATUS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="CUSTPREFIX1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="CUSTPREFIX2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="MOBNUM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="CUST_COMM_MODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="LANG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="GUARDIAN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="SBMTAGEPROOF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="MINOR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="KYCSTAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="SSTAFF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="KYC_REFNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="SAME_CORR_ADDR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="DADD1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="SAME_PERM_ADDR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="TITLE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ADDRS4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="DADD4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="PLACEOFBIRTH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="BIRTHCOUNTRY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="TELISDNOPERSONAL" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="MOBISDNO" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="FAXISDNO" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="USRESSTATUS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="PAISSUED" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="PAHOLDERNAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="PAHOLDERNATIONALTY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="PAHOLDERADDR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="PAHOLDERADDRCOUNTRY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="PAHOLDERTELISD" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="PAHOLDERTELNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="VSTUSPREV" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="HOMETELNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="HOMETELISD" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="P_PIN_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="PREF_CNTACT_DATE" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                   &lt;element name="PREF_CNTACT_TIME" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="Custdomestic" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="EDUSTAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="MARITALSTAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="SPNAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="SPEMPSTATUS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="DEPCHILD" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                             &lt;element name="DEPOTH" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                             &lt;element name="ACCOMODATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="MOTHERMAIDN_NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Custprof" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="EMPSTAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="EMPTENURE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                             &lt;element name="RETIREAGE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                             &lt;element name="PREVDESIG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="PREVEMP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="CURRDESIG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="CURREMP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="ADD1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="ADD2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="ADD3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="TEL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="AMTCCY1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="TELEX" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="FAX" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="EMAIL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="SALARY" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                             &lt;element name="OTHER1" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                             &lt;element name="RENT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                             &lt;element name="INSURANCE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                             &lt;element name="LOANPMNT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                             &lt;element name="OTHEXP" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                             &lt;element name="HOUSEVAL" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                             &lt;element name="CRCARD" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                             &lt;element name="CNTY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Custcorp" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="CORPNAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="REGADD1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="REGADD2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="REGADD3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="R_PIN_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="AMTCCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="INCORPDT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                   &lt;element name="CAPITAL" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="NETWORTH" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="CORPDESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="INCORPCNTRY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="REGCNTRY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="SAME_CORR_ADDR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="REGADD4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="JOINTVENTURE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="CADDR1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="CADDR3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="CADDR2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="CADDR4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="CPINCODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="CNTRY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="NATIONALITY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="LANGUAGE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="KYC_DETAILS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="KYCREFNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="CNAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="UIDNAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="UIDVALUE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="TELEPHONE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="FAX" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="EMAILID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="MOBILENUMBER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="CUSTCOMMMODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="NATIONID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="TELISDNOCRP" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="MOBISDNOCRP" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="FAXISDNOCRP" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="PREF_CNTACT_DATE" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                   &lt;element name="PREF_CNTACT_TIME" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="OWNERSHPTYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="Custcorpdir" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="DIRNAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="NADDR1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="NADDR2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="NADDR3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="NADDR4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="ADDRESS1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="ADDRESS2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="ADDRESS3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="COUNTRY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="TEL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="TAXID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="MOBNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="EMAIL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="SNO" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                             &lt;element name="TELISDNOCRPDIR" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                             &lt;element name="MOBISDNOCRPDIR" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                             &lt;element name="ADDRCOUNTRYCRPDIR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="NATIONLTYCRPDIR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="USRESSTATUSCRPDIR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="PCTHOLDING" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                             &lt;element name="HOMETELNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="HOMETELISD" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                             &lt;element name="PPIN_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="PIN_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Issuerdet" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="OVERLMTCCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="OVERLIMIT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                             &lt;element name="Issuerlmts" maxOccurs="unbounded">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="ISSID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="CLTRLTYP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="LMTCCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="LMTAMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Custdoc-Chklist" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="CUSTOMER_NO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="DOCCATEGORY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="DOCUMENTNAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="DOCUMENT_TYPE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="CHECKED" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="DOCREF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="DATEREQ" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                   &lt;element name="EXPECTDDATE" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                   &lt;element name="ACTUALDATE" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                   &lt;element name="EXPDATE" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                   &lt;element name="REMARKSCHKLIST" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Doctype-Remarks" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="CUSTOMER_NO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="REMARK1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="REMARK2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="REMARK3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="REMARK4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="REMARK5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="REMARK6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="REMARK7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="REMARK8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="REMARK9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="REMARK10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Custgrp" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="GRPNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="RELATION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Custshhold" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="SHHOLDID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="SHHOLDPCT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Clsccyrest" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="CCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="DESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Bic" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ACC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="BICCD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Linkedac" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="VRFD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="LINKEDACCNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="LINKEDACCIBAN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="LINKEDACCBIC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="LINKEDACCBLZ" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Jointventure" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="PARTY_ID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="PARTY_RATIO" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="PARTYNAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Custsegment" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="CUSTCCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="CUSTSEGCD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="CUSTSEGSTATUS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="NETWORTH" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="NETWORTHCCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="CUSTOMER_NO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Mfi1" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="MFI_CUST_TYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="POVERTY_STATUS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="LITERACY_OF_CLIENT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="BUSINESS_ACTIVITY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="BLACKLISTED" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="BLACKLIST_COUNT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="PHYSICALLY_CHALLENGED" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="Chklist" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="VERIFIED" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Id-Master" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="CUSTOMER_NO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Id-Det-Main" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="CUSTOMER_NO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="SNO" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="DOCUMENT_TYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="Iddetail" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="CUSTOMER_NO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="SNO" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                             &lt;element name="DOCUMENT_TYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="SERIES" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="DOC_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="DATE_OF_ISSUE" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                             &lt;element name="DATE_OF_EXPIRY" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                             &lt;element name="ISSUING_AUTHORITY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="PLACE_OF_ISSUE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Custmis" type="{http://fcubs.ofss.com/service/FCUBSCustomerService}Custmis-Modify-IO-Type" minOccurs="0"/>
 *         &lt;element name="Jointcustomer" type="{http://fcubs.ofss.com/service/FCUBSCustomerService}Custjoint-Modify-IO-Type" minOccurs="0"/>
 *         &lt;element name="Cust-Acc-Det" type="{http://fcubs.ofss.com/service/FCUBSCustomerService}CustDiaryDetails-Modify-IO-Type" minOccurs="0"/>
 *         &lt;element name="Custaccdet" type="{http://fcubs.ofss.com/service/FCUBSCustomerService}LinkedEntity-Modify-IO-Type" minOccurs="0"/>
 *         &lt;element name="Custacdetail" type="{http://fcubs.ofss.com/service/FCUBSCustomerService}Custtext-Modify-IO-Type" minOccurs="0"/>
 *         &lt;element name="UDFDETAILS" type="{http://fcubs.ofss.com/service/FCUBSCustomerService}UDFDETAILSType2" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Sttms-Debit" type="{http://fcubs.ofss.com/service/FCUBSCustomerService}Stccrdsa-Modify-IO-Type" minOccurs="0"/>
 *         &lt;element name="Extsys-Ws-Master" type="{http://fcubs.ofss.com/service/FCUBSCustomerService}Cscofacm-Modify-IO-Type" minOccurs="0"/>
 *         &lt;element name="Cust-Account" type="{http://fcubs.ofss.com/service/FCUBSCustomerService}Stccuacc-Modify-IO-Type" minOccurs="0"/>
 *         &lt;element name="Nsf-Enq" type="{http://fcubs.ofss.com/service/FCUBSCustomerService}Stcnsck-Modify-IO-Type" minOccurs="0"/>
 *         &lt;element name="Master" type="{http://fcubs.ofss.com/service/FCUBSCustomerService}Cscupdoc-Modify-IO-Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Customer-Modify-IO-Type", propOrder = {
    "privatecustomer",
    "custno",
    "ctype",
    "name",
    "addrln1",
    "addrln3",
    "addrln2",
    "addrln4",
    "country",
    "sname",
    "nlty",
    "lbrn",
    "ccateg",
    "fullname",
    "cifcreationdt",
    "iselcmcust",
    "elcmcustno",
    "araptracking",
    "expcntry",
    "uidname",
    "uidval",
    "frozen",
    "dead",
    "whrunkn",
    "crrate",
    "media",
    "ssn",
    "swiftcd",
    "loc",
    "mailrsreqd",
    "grpcd",
    "expcat",
    "custclassfn",
    "cifstat",
    "cifstatsnc",
    "chggrp",
    "custclggrp",
    "taxgroup",
    "clsparticipant",
    "fxnettcust",
    "xref",
    "crmcust",
    "issucust",
    "trsrycust",
    "relpricing",
    "mt920",
    "flgjoint",
    "lmccy",
    "hoacno",
    "fxcustclrilim",
    "ovrlim",
    "fxcleanrisk",
    "revdt",
    "seccustclrilim",
    "secclrilim",
    "seccustpsrilim",
    "secpsrilim",
    "flgutltyprvdr",
    "utltyprvdrid",
    "riskprfl",
    "drcat",
    "amlreqd",
    "amlcustgrp",
    "chkdigitvalreqd",
    "algid",
    "ftaccasof",
    "custunadv",
    "constaxcertrqd",
    "indtaxcertrqd",
    "clsccyallwd",
    "riskcateg",
    "fax",
    "jvlimittracking",
    "lccollatpct",
    "cascust",
    "liabnode",
    "liabbr",
    "pastdueflag",
    "shortname2",
    "introducer",
    "whtpct",
    "uptype",
    "udflbl1",
    "udflbl2",
    "udflbl3",
    "udflbl4",
    "udflbl5",
    "rmid",
    "autogenstmtplan",
    "freq",
    "stmtday",
    "pincode",
    "maker",
    "makerstamp",
    "custpersonal",
    "custcorp",
    "custdocChklist",
    "doctypeRemarks",
    "custgrp",
    "custshhold",
    "clsccyrest",
    "bic",
    "linkedac",
    "jointventure",
    "custsegment",
    "mfi1",
    "idMaster",
    "idDetMain",
    "custmis",
    "jointcustomer",
    "custAccDet",
    "custaccdet",
    "custacdetail",
    "udfdetails",
    "sttmsDebit",
    "extsysWsMaster",
    "custAccount",
    "nsfEnq",
    "master"
})
public class CustomerModifyIOType {

    @XmlElement(name = "PRIVATE_CUSTOMER")
    protected String privatecustomer;
    @XmlElement(name = "CUSTNO", required = true)
    protected String custno;
    @XmlElement(name = "CTYPE")
    protected String ctype;
    @XmlElement(name = "NAME")
    protected String name;
    @XmlElement(name = "ADDRLN1")
    protected String addrln1;
    @XmlElement(name = "ADDRLN3")
    protected String addrln3;
    @XmlElement(name = "ADDRLN2")
    protected String addrln2;
    @XmlElement(name = "ADDRLN4")
    protected String addrln4;
    @XmlElement(name = "COUNTRY")
    protected String country;
    @XmlElement(name = "SNAME")
    protected String sname;
    @XmlElement(name = "NLTY")
    protected String nlty;
    @XmlElement(name = "LBRN")
    protected String lbrn;
    @XmlElement(name = "CCATEG")
    protected String ccateg;
    @XmlElement(name = "FULLNAME")
    protected String fullname;
    @XmlElement(name = "CIFCREATIONDT")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar cifcreationdt;
    @XmlElement(name = "ISELCMCUST")
    protected String iselcmcust;
    @XmlElement(name = "ELCMCUSTNO")
    protected String elcmcustno;
    @XmlElement(name = "AR_AP_TRACKING")
    protected String araptracking;
    @XmlElement(name = "EXPCNTRY")
    protected String expcntry;
    @XmlElement(name = "UIDNAME")
    protected String uidname;
    @XmlElement(name = "UIDVAL")
    protected String uidval;
    @XmlElement(name = "FROZEN")
    protected String frozen;
    @XmlElement(name = "DEAD")
    protected String dead;
    @XmlElement(name = "WHRUNKN")
    protected String whrunkn;
    @XmlElement(name = "CRRATE")
    protected String crrate;
    @XmlElement(name = "MEDIA")
    protected String media;
    @XmlElement(name = "SSN")
    protected String ssn;
    @XmlElement(name = "SWIFTCD")
    protected String swiftcd;
    @XmlElement(name = "LOC")
    protected String loc;
    @XmlElement(name = "MAILRSREQD")
    protected String mailrsreqd;
    @XmlElement(name = "GRPCD")
    protected String grpcd;
    @XmlElement(name = "EXPCAT")
    protected String expcat;
    @XmlElement(name = "CUSTCLASSFN")
    protected String custclassfn;
    @XmlElement(name = "CIFSTAT")
    protected String cifstat;
    @XmlElement(name = "CIFSTATSNC")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar cifstatsnc;
    @XmlElement(name = "CHGGRP")
    protected String chggrp;
    @XmlElement(name = "CUSTCLGGRP")
    protected String custclggrp;
    @XmlElement(name = "TAXGROUP")
    protected String taxgroup;
    @XmlElement(name = "CLSPARTICIPANT")
    protected String clsparticipant;
    @XmlElement(name = "FXNETTCUST")
    protected String fxnettcust;
    @XmlElement(name = "XREF")
    protected String xref;
    @XmlElement(name = "CRMCUST")
    protected String crmcust;
    @XmlElement(name = "ISSUCUST")
    protected String issucust;
    @XmlElement(name = "TRSRYCUST")
    protected String trsrycust;
    @XmlElement(name = "RELPRICING")
    protected String relpricing;
    @XmlElement(name = "MT920")
    protected String mt920;
    @XmlElement(name = "FLGJOINT")
    protected String flgjoint;
    @XmlElement(name = "LMCCY")
    protected String lmccy;
    @XmlElement(name = "HOACNO")
    protected String hoacno;
    @XmlElement(name = "FXCUSTCLRILIM")
    protected BigDecimal fxcustclrilim;
    @XmlElement(name = "OVRLIM")
    protected BigDecimal ovrlim;
    @XmlElement(name = "FX_CLEAN_RISK")
    protected BigDecimal fxcleanrisk;
    @XmlElement(name = "REVDT")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar revdt;
    @XmlElement(name = "SECCUSTCLRILIM")
    protected BigDecimal seccustclrilim;
    @XmlElement(name = "SECCLRILIM")
    protected BigDecimal secclrilim;
    @XmlElement(name = "SECCUSTPSRILIM")
    protected BigDecimal seccustpsrilim;
    @XmlElement(name = "SECPSRILIM")
    protected BigDecimal secpsrilim;
    @XmlElement(name = "FLGUTLTYPRVDR")
    protected String flgutltyprvdr;
    @XmlElement(name = "UTLTYPRVDRID")
    protected String utltyprvdrid;
    @XmlElement(name = "RISKPRFL")
    protected String riskprfl;
    @XmlElement(name = "DRCAT")
    protected String drcat;
    @XmlElement(name = "AMLREQD")
    protected String amlreqd;
    @XmlElement(name = "AMLCUSTGRP")
    protected String amlcustgrp;
    @XmlElement(name = "CHKDIGITVALREQD")
    protected String chkdigitvalreqd;
    @XmlElement(name = "ALGID")
    protected String algid;
    @XmlElement(name = "FTACCASOF")
    protected String ftaccasof;
    @XmlElement(name = "CUSTUNADV")
    protected String custunadv;
    @XmlElement(name = "CONSTAXCERTRQD")
    protected String constaxcertrqd;
    @XmlElement(name = "INDTAXCERTRQD")
    protected String indtaxcertrqd;
    @XmlElement(name = "CLSCCYALLWD")
    protected String clsccyallwd;
    @XmlElement(name = "RISKCATEG")
    protected String riskcateg;
    @XmlElement(name = "FAX")
    protected String fax;
    @XmlElement(name = "JV_LIMIT_TRACKING")
    protected String jvlimittracking;
    @XmlElement(name = "LC_COLLAT_PCT")
    protected BigDecimal lccollatpct;
    @XmlElement(name = "CAS_CUST")
    protected String cascust;
    @XmlElement(name = "LIAB_NODE")
    protected String liabnode;
    @XmlElement(name = "LIAB_BR")
    protected String liabbr;
    @XmlElement(name = "PAST_DUE_FLAG")
    protected String pastdueflag;
    @XmlElement(name = "SHORT_NAME2")
    protected String shortname2;
    @XmlElement(name = "INTRODUCER")
    protected String introducer;
    @XmlElement(name = "WHT_PCT")
    protected BigDecimal whtpct;
    @XmlElement(name = "UPTYPE")
    protected String uptype;
    @XmlElement(name = "UDFLBL1")
    protected String udflbl1;
    @XmlElement(name = "UDFLBL2")
    protected String udflbl2;
    @XmlElement(name = "UDFLBL3")
    protected String udflbl3;
    @XmlElement(name = "UDFLBL4")
    protected String udflbl4;
    @XmlElement(name = "UDFLBL5")
    protected String udflbl5;
    @XmlElement(name = "RM_ID")
    protected String rmid;
    @XmlElement(name = "AUTOGENSTMTPLAN")
    protected String autogenstmtplan;
    @XmlElement(name = "FREQ")
    protected String freq;
    @XmlElement(name = "STMTDAY")
    protected String stmtday;
    @XmlElement(name = "PIN_CODE")
    protected String pincode;
    @XmlElement(name = "MAKER")
    protected String maker;
    @XmlElement(name = "MAKERSTAMP")
    protected String makerstamp;
    @XmlElement(name = "Custpersonal")
    protected CustomerModifyIOType.Custpersonal custpersonal;
    @XmlElement(name = "Custcorp")
    protected CustomerModifyIOType.Custcorp custcorp;
    @XmlElement(name = "Custdoc-Chklist")
    protected List<CustomerModifyIOType.CustdocChklist> custdocChklist;
    @XmlElement(name = "Doctype-Remarks")
    protected CustomerModifyIOType.DoctypeRemarks doctypeRemarks;
    @XmlElement(name = "Custgrp", required = true)
    protected List<CustomerModifyIOType.Custgrp> custgrp;
    @XmlElement(name = "Custshhold", required = true)
    protected List<CustomerModifyIOType.Custshhold> custshhold;
    @XmlElement(name = "Clsccyrest", required = true)
    protected List<CustomerModifyIOType.Clsccyrest> clsccyrest;
    @XmlElement(name = "Bic", required = true)
    protected List<CustomerModifyIOType.Bic> bic;
    @XmlElement(name = "Linkedac")
    protected List<CustomerModifyIOType.Linkedac> linkedac;
    @XmlElement(name = "Jointventure")
    protected List<CustomerModifyIOType.Jointventure> jointventure;
    @XmlElement(name = "Custsegment")
    protected CustomerModifyIOType.Custsegment custsegment;
    @XmlElement(name = "Mfi1")
    protected CustomerModifyIOType.Mfi1 mfi1;
    @XmlElement(name = "Id-Master")
    protected CustomerModifyIOType.IdMaster idMaster;
    @XmlElement(name = "Id-Det-Main")
    protected List<CustomerModifyIOType.IdDetMain> idDetMain;
    @XmlElement(name = "Custmis")
    protected CustmisModifyIOType custmis;
    @XmlElement(name = "Jointcustomer")
    protected CustjointModifyIOType jointcustomer;
    @XmlElement(name = "Cust-Acc-Det")
    protected CustDiaryDetailsModifyIOType custAccDet;
    @XmlElement(name = "Custaccdet")
    protected LinkedEntityModifyIOType custaccdet;
    @XmlElement(name = "Custacdetail")
    protected CusttextModifyIOType custacdetail;
    @XmlElement(name = "UDFDETAILS")
    protected List<UDFDETAILSType2> udfdetails;
    @XmlElement(name = "Sttms-Debit")
    protected StccrdsaModifyIOType sttmsDebit;
    @XmlElement(name = "Extsys-Ws-Master")
    protected CscofacmModifyIOType extsysWsMaster;
    @XmlElement(name = "Cust-Account")
    protected StccuaccModifyIOType custAccount;
    @XmlElement(name = "Nsf-Enq")
    protected StcnsckModifyIOType nsfEnq;
    @XmlElement(name = "Master")
    protected CscupdocModifyIOType master;

    /**
     * Gets the value of the privatecustomer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRIVATECUSTOMER() {
        return privatecustomer;
    }

    /**
     * Sets the value of the privatecustomer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRIVATECUSTOMER(String value) {
        this.privatecustomer = value;
    }

    /**
     * Gets the value of the custno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCUSTNO() {
        return custno;
    }

    /**
     * Sets the value of the custno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCUSTNO(String value) {
        this.custno = value;
    }

    /**
     * Gets the value of the ctype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCTYPE() {
        return ctype;
    }

    /**
     * Sets the value of the ctype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCTYPE(String value) {
        this.ctype = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNAME() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNAME(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the addrln1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getADDRLN1() {
        return addrln1;
    }

    /**
     * Sets the value of the addrln1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setADDRLN1(String value) {
        this.addrln1 = value;
    }

    /**
     * Gets the value of the addrln3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getADDRLN3() {
        return addrln3;
    }

    /**
     * Sets the value of the addrln3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setADDRLN3(String value) {
        this.addrln3 = value;
    }

    /**
     * Gets the value of the addrln2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getADDRLN2() {
        return addrln2;
    }

    /**
     * Sets the value of the addrln2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setADDRLN2(String value) {
        this.addrln2 = value;
    }

    /**
     * Gets the value of the addrln4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getADDRLN4() {
        return addrln4;
    }

    /**
     * Sets the value of the addrln4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setADDRLN4(String value) {
        this.addrln4 = value;
    }

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCOUNTRY() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCOUNTRY(String value) {
        this.country = value;
    }

    /**
     * Gets the value of the sname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSNAME() {
        return sname;
    }

    /**
     * Sets the value of the sname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSNAME(String value) {
        this.sname = value;
    }

    /**
     * Gets the value of the nlty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNLTY() {
        return nlty;
    }

    /**
     * Sets the value of the nlty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNLTY(String value) {
        this.nlty = value;
    }

    /**
     * Gets the value of the lbrn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLBRN() {
        return lbrn;
    }

    /**
     * Sets the value of the lbrn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLBRN(String value) {
        this.lbrn = value;
    }

    /**
     * Gets the value of the ccateg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCCATEG() {
        return ccateg;
    }

    /**
     * Sets the value of the ccateg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCCATEG(String value) {
        this.ccateg = value;
    }

    /**
     * Gets the value of the fullname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFULLNAME() {
        return fullname;
    }

    /**
     * Sets the value of the fullname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFULLNAME(String value) {
        this.fullname = value;
    }

    /**
     * Gets the value of the cifcreationdt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCIFCREATIONDT() {
        return cifcreationdt;
    }

    /**
     * Sets the value of the cifcreationdt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCIFCREATIONDT(XMLGregorianCalendar value) {
        this.cifcreationdt = value;
    }

    /**
     * Gets the value of the iselcmcust property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getISELCMCUST() {
        return iselcmcust;
    }

    /**
     * Sets the value of the iselcmcust property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setISELCMCUST(String value) {
        this.iselcmcust = value;
    }

    /**
     * Gets the value of the elcmcustno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getELCMCUSTNO() {
        return elcmcustno;
    }

    /**
     * Sets the value of the elcmcustno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setELCMCUSTNO(String value) {
        this.elcmcustno = value;
    }

    /**
     * Gets the value of the araptracking property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getARAPTRACKING() {
        return araptracking;
    }

    /**
     * Sets the value of the araptracking property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setARAPTRACKING(String value) {
        this.araptracking = value;
    }

    /**
     * Gets the value of the expcntry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXPCNTRY() {
        return expcntry;
    }

    /**
     * Sets the value of the expcntry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXPCNTRY(String value) {
        this.expcntry = value;
    }

    /**
     * Gets the value of the uidname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUIDNAME() {
        return uidname;
    }

    /**
     * Sets the value of the uidname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUIDNAME(String value) {
        this.uidname = value;
    }

    /**
     * Gets the value of the uidval property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUIDVAL() {
        return uidval;
    }

    /**
     * Sets the value of the uidval property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUIDVAL(String value) {
        this.uidval = value;
    }

    /**
     * Gets the value of the frozen property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFROZEN() {
        return frozen;
    }

    /**
     * Sets the value of the frozen property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFROZEN(String value) {
        this.frozen = value;
    }

    /**
     * Gets the value of the dead property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDEAD() {
        return dead;
    }

    /**
     * Sets the value of the dead property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDEAD(String value) {
        this.dead = value;
    }

    /**
     * Gets the value of the whrunkn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWHRUNKN() {
        return whrunkn;
    }

    /**
     * Sets the value of the whrunkn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWHRUNKN(String value) {
        this.whrunkn = value;
    }

    /**
     * Gets the value of the crrate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCRRATE() {
        return crrate;
    }

    /**
     * Sets the value of the crrate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCRRATE(String value) {
        this.crrate = value;
    }

    /**
     * Gets the value of the media property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMEDIA() {
        return media;
    }

    /**
     * Sets the value of the media property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMEDIA(String value) {
        this.media = value;
    }

    /**
     * Gets the value of the ssn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSSN() {
        return ssn;
    }

    /**
     * Sets the value of the ssn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSSN(String value) {
        this.ssn = value;
    }

    /**
     * Gets the value of the swiftcd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSWIFTCD() {
        return swiftcd;
    }

    /**
     * Sets the value of the swiftcd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSWIFTCD(String value) {
        this.swiftcd = value;
    }

    /**
     * Gets the value of the loc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLOC() {
        return loc;
    }

    /**
     * Sets the value of the loc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLOC(String value) {
        this.loc = value;
    }

    /**
     * Gets the value of the mailrsreqd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMAILRSREQD() {
        return mailrsreqd;
    }

    /**
     * Sets the value of the mailrsreqd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMAILRSREQD(String value) {
        this.mailrsreqd = value;
    }

    /**
     * Gets the value of the grpcd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGRPCD() {
        return grpcd;
    }

    /**
     * Sets the value of the grpcd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGRPCD(String value) {
        this.grpcd = value;
    }

    /**
     * Gets the value of the expcat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXPCAT() {
        return expcat;
    }

    /**
     * Sets the value of the expcat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXPCAT(String value) {
        this.expcat = value;
    }

    /**
     * Gets the value of the custclassfn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCUSTCLASSFN() {
        return custclassfn;
    }

    /**
     * Sets the value of the custclassfn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCUSTCLASSFN(String value) {
        this.custclassfn = value;
    }

    /**
     * Gets the value of the cifstat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCIFSTAT() {
        return cifstat;
    }

    /**
     * Sets the value of the cifstat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCIFSTAT(String value) {
        this.cifstat = value;
    }

    /**
     * Gets the value of the cifstatsnc property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCIFSTATSNC() {
        return cifstatsnc;
    }

    /**
     * Sets the value of the cifstatsnc property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCIFSTATSNC(XMLGregorianCalendar value) {
        this.cifstatsnc = value;
    }

    /**
     * Gets the value of the chggrp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCHGGRP() {
        return chggrp;
    }

    /**
     * Sets the value of the chggrp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCHGGRP(String value) {
        this.chggrp = value;
    }

    /**
     * Gets the value of the custclggrp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCUSTCLGGRP() {
        return custclggrp;
    }

    /**
     * Sets the value of the custclggrp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCUSTCLGGRP(String value) {
        this.custclggrp = value;
    }

    /**
     * Gets the value of the taxgroup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTAXGROUP() {
        return taxgroup;
    }

    /**
     * Sets the value of the taxgroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTAXGROUP(String value) {
        this.taxgroup = value;
    }

    /**
     * Gets the value of the clsparticipant property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCLSPARTICIPANT() {
        return clsparticipant;
    }

    /**
     * Sets the value of the clsparticipant property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCLSPARTICIPANT(String value) {
        this.clsparticipant = value;
    }

    /**
     * Gets the value of the fxnettcust property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFXNETTCUST() {
        return fxnettcust;
    }

    /**
     * Sets the value of the fxnettcust property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFXNETTCUST(String value) {
        this.fxnettcust = value;
    }

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
     * Gets the value of the crmcust property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCRMCUST() {
        return crmcust;
    }

    /**
     * Sets the value of the crmcust property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCRMCUST(String value) {
        this.crmcust = value;
    }

    /**
     * Gets the value of the issucust property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getISSUCUST() {
        return issucust;
    }

    /**
     * Sets the value of the issucust property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setISSUCUST(String value) {
        this.issucust = value;
    }

    /**
     * Gets the value of the trsrycust property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTRSRYCUST() {
        return trsrycust;
    }

    /**
     * Sets the value of the trsrycust property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTRSRYCUST(String value) {
        this.trsrycust = value;
    }

    /**
     * Gets the value of the relpricing property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRELPRICING() {
        return relpricing;
    }

    /**
     * Sets the value of the relpricing property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRELPRICING(String value) {
        this.relpricing = value;
    }

    /**
     * Gets the value of the mt920 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMT920() {
        return mt920;
    }

    /**
     * Sets the value of the mt920 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMT920(String value) {
        this.mt920 = value;
    }

    /**
     * Gets the value of the flgjoint property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFLGJOINT() {
        return flgjoint;
    }

    /**
     * Sets the value of the flgjoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFLGJOINT(String value) {
        this.flgjoint = value;
    }

    /**
     * Gets the value of the lmccy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLMCCY() {
        return lmccy;
    }

    /**
     * Sets the value of the lmccy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLMCCY(String value) {
        this.lmccy = value;
    }

    /**
     * Gets the value of the hoacno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHOACNO() {
        return hoacno;
    }

    /**
     * Sets the value of the hoacno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHOACNO(String value) {
        this.hoacno = value;
    }

    /**
     * Gets the value of the fxcustclrilim property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFXCUSTCLRILIM() {
        return fxcustclrilim;
    }

    /**
     * Sets the value of the fxcustclrilim property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFXCUSTCLRILIM(BigDecimal value) {
        this.fxcustclrilim = value;
    }

    /**
     * Gets the value of the ovrlim property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOVRLIM() {
        return ovrlim;
    }

    /**
     * Sets the value of the ovrlim property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOVRLIM(BigDecimal value) {
        this.ovrlim = value;
    }

    /**
     * Gets the value of the fxcleanrisk property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFXCLEANRISK() {
        return fxcleanrisk;
    }

    /**
     * Sets the value of the fxcleanrisk property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFXCLEANRISK(BigDecimal value) {
        this.fxcleanrisk = value;
    }

    /**
     * Gets the value of the revdt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getREVDT() {
        return revdt;
    }

    /**
     * Sets the value of the revdt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setREVDT(XMLGregorianCalendar value) {
        this.revdt = value;
    }

    /**
     * Gets the value of the seccustclrilim property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSECCUSTCLRILIM() {
        return seccustclrilim;
    }

    /**
     * Sets the value of the seccustclrilim property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSECCUSTCLRILIM(BigDecimal value) {
        this.seccustclrilim = value;
    }

    /**
     * Gets the value of the secclrilim property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSECCLRILIM() {
        return secclrilim;
    }

    /**
     * Sets the value of the secclrilim property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSECCLRILIM(BigDecimal value) {
        this.secclrilim = value;
    }

    /**
     * Gets the value of the seccustpsrilim property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSECCUSTPSRILIM() {
        return seccustpsrilim;
    }

    /**
     * Sets the value of the seccustpsrilim property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSECCUSTPSRILIM(BigDecimal value) {
        this.seccustpsrilim = value;
    }

    /**
     * Gets the value of the secpsrilim property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSECPSRILIM() {
        return secpsrilim;
    }

    /**
     * Sets the value of the secpsrilim property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSECPSRILIM(BigDecimal value) {
        this.secpsrilim = value;
    }

    /**
     * Gets the value of the flgutltyprvdr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFLGUTLTYPRVDR() {
        return flgutltyprvdr;
    }

    /**
     * Sets the value of the flgutltyprvdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFLGUTLTYPRVDR(String value) {
        this.flgutltyprvdr = value;
    }

    /**
     * Gets the value of the utltyprvdrid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUTLTYPRVDRID() {
        return utltyprvdrid;
    }

    /**
     * Sets the value of the utltyprvdrid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUTLTYPRVDRID(String value) {
        this.utltyprvdrid = value;
    }

    /**
     * Gets the value of the riskprfl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRISKPRFL() {
        return riskprfl;
    }

    /**
     * Sets the value of the riskprfl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRISKPRFL(String value) {
        this.riskprfl = value;
    }

    /**
     * Gets the value of the drcat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDRCAT() {
        return drcat;
    }

    /**
     * Sets the value of the drcat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDRCAT(String value) {
        this.drcat = value;
    }

    /**
     * Gets the value of the amlreqd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAMLREQD() {
        return amlreqd;
    }

    /**
     * Sets the value of the amlreqd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAMLREQD(String value) {
        this.amlreqd = value;
    }

    /**
     * Gets the value of the amlcustgrp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAMLCUSTGRP() {
        return amlcustgrp;
    }

    /**
     * Sets the value of the amlcustgrp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAMLCUSTGRP(String value) {
        this.amlcustgrp = value;
    }

    /**
     * Gets the value of the chkdigitvalreqd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCHKDIGITVALREQD() {
        return chkdigitvalreqd;
    }

    /**
     * Sets the value of the chkdigitvalreqd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCHKDIGITVALREQD(String value) {
        this.chkdigitvalreqd = value;
    }

    /**
     * Gets the value of the algid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getALGID() {
        return algid;
    }

    /**
     * Sets the value of the algid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setALGID(String value) {
        this.algid = value;
    }

    /**
     * Gets the value of the ftaccasof property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFTACCASOF() {
        return ftaccasof;
    }

    /**
     * Sets the value of the ftaccasof property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFTACCASOF(String value) {
        this.ftaccasof = value;
    }

    /**
     * Gets the value of the custunadv property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCUSTUNADV() {
        return custunadv;
    }

    /**
     * Sets the value of the custunadv property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCUSTUNADV(String value) {
        this.custunadv = value;
    }

    /**
     * Gets the value of the constaxcertrqd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCONSTAXCERTRQD() {
        return constaxcertrqd;
    }

    /**
     * Sets the value of the constaxcertrqd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCONSTAXCERTRQD(String value) {
        this.constaxcertrqd = value;
    }

    /**
     * Gets the value of the indtaxcertrqd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINDTAXCERTRQD() {
        return indtaxcertrqd;
    }

    /**
     * Sets the value of the indtaxcertrqd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINDTAXCERTRQD(String value) {
        this.indtaxcertrqd = value;
    }

    /**
     * Gets the value of the clsccyallwd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCLSCCYALLWD() {
        return clsccyallwd;
    }

    /**
     * Sets the value of the clsccyallwd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCLSCCYALLWD(String value) {
        this.clsccyallwd = value;
    }

    /**
     * Gets the value of the riskcateg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRISKCATEG() {
        return riskcateg;
    }

    /**
     * Sets the value of the riskcateg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRISKCATEG(String value) {
        this.riskcateg = value;
    }

    /**
     * Gets the value of the fax property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFAX() {
        return fax;
    }

    /**
     * Sets the value of the fax property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFAX(String value) {
        this.fax = value;
    }

    /**
     * Gets the value of the jvlimittracking property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJVLIMITTRACKING() {
        return jvlimittracking;
    }

    /**
     * Sets the value of the jvlimittracking property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJVLIMITTRACKING(String value) {
        this.jvlimittracking = value;
    }

    /**
     * Gets the value of the lccollatpct property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLCCOLLATPCT() {
        return lccollatpct;
    }

    /**
     * Sets the value of the lccollatpct property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLCCOLLATPCT(BigDecimal value) {
        this.lccollatpct = value;
    }

    /**
     * Gets the value of the cascust property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCASCUST() {
        return cascust;
    }

    /**
     * Sets the value of the cascust property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCASCUST(String value) {
        this.cascust = value;
    }

    /**
     * Gets the value of the liabnode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLIABNODE() {
        return liabnode;
    }

    /**
     * Sets the value of the liabnode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLIABNODE(String value) {
        this.liabnode = value;
    }

    /**
     * Gets the value of the liabbr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLIABBR() {
        return liabbr;
    }

    /**
     * Sets the value of the liabbr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLIABBR(String value) {
        this.liabbr = value;
    }

    /**
     * Gets the value of the pastdueflag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPASTDUEFLAG() {
        return pastdueflag;
    }

    /**
     * Sets the value of the pastdueflag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPASTDUEFLAG(String value) {
        this.pastdueflag = value;
    }

    /**
     * Gets the value of the shortname2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSHORTNAME2() {
        return shortname2;
    }

    /**
     * Sets the value of the shortname2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSHORTNAME2(String value) {
        this.shortname2 = value;
    }

    /**
     * Gets the value of the introducer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINTRODUCER() {
        return introducer;
    }

    /**
     * Sets the value of the introducer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINTRODUCER(String value) {
        this.introducer = value;
    }

    /**
     * Gets the value of the whtpct property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getWHTPCT() {
        return whtpct;
    }

    /**
     * Sets the value of the whtpct property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setWHTPCT(BigDecimal value) {
        this.whtpct = value;
    }

    /**
     * Gets the value of the uptype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUPTYPE() {
        return uptype;
    }

    /**
     * Sets the value of the uptype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUPTYPE(String value) {
        this.uptype = value;
    }

    /**
     * Gets the value of the udflbl1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUDFLBL1() {
        return udflbl1;
    }

    /**
     * Sets the value of the udflbl1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUDFLBL1(String value) {
        this.udflbl1 = value;
    }

    /**
     * Gets the value of the udflbl2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUDFLBL2() {
        return udflbl2;
    }

    /**
     * Sets the value of the udflbl2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUDFLBL2(String value) {
        this.udflbl2 = value;
    }

    /**
     * Gets the value of the udflbl3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUDFLBL3() {
        return udflbl3;
    }

    /**
     * Sets the value of the udflbl3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUDFLBL3(String value) {
        this.udflbl3 = value;
    }

    /**
     * Gets the value of the udflbl4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUDFLBL4() {
        return udflbl4;
    }

    /**
     * Sets the value of the udflbl4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUDFLBL4(String value) {
        this.udflbl4 = value;
    }

    /**
     * Gets the value of the udflbl5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUDFLBL5() {
        return udflbl5;
    }

    /**
     * Sets the value of the udflbl5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUDFLBL5(String value) {
        this.udflbl5 = value;
    }

    /**
     * Gets the value of the rmid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRMID() {
        return rmid;
    }

    /**
     * Sets the value of the rmid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRMID(String value) {
        this.rmid = value;
    }

    /**
     * Gets the value of the autogenstmtplan property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAUTOGENSTMTPLAN() {
        return autogenstmtplan;
    }

    /**
     * Sets the value of the autogenstmtplan property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAUTOGENSTMTPLAN(String value) {
        this.autogenstmtplan = value;
    }

    /**
     * Gets the value of the freq property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFREQ() {
        return freq;
    }

    /**
     * Sets the value of the freq property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFREQ(String value) {
        this.freq = value;
    }

    /**
     * Gets the value of the stmtday property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTMTDAY() {
        return stmtday;
    }

    /**
     * Sets the value of the stmtday property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSTMTDAY(String value) {
        this.stmtday = value;
    }

    /**
     * Gets the value of the pincode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPINCODE() {
        return pincode;
    }

    /**
     * Sets the value of the pincode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPINCODE(String value) {
        this.pincode = value;
    }

    /**
     * Gets the value of the maker property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMAKER() {
        return maker;
    }

    /**
     * Sets the value of the maker property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMAKER(String value) {
        this.maker = value;
    }

    /**
     * Gets the value of the makerstamp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMAKERSTAMP() {
        return makerstamp;
    }

    /**
     * Sets the value of the makerstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMAKERSTAMP(String value) {
        this.makerstamp = value;
    }

    /**
     * Gets the value of the custpersonal property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerModifyIOType.Custpersonal }
     *     
     */
    public CustomerModifyIOType.Custpersonal getCustpersonal() {
        return custpersonal;
    }

    /**
     * Sets the value of the custpersonal property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerModifyIOType.Custpersonal }
     *     
     */
    public void setCustpersonal(CustomerModifyIOType.Custpersonal value) {
        this.custpersonal = value;
    }

    /**
     * Gets the value of the custcorp property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerModifyIOType.Custcorp }
     *     
     */
    public CustomerModifyIOType.Custcorp getCustcorp() {
        return custcorp;
    }

    /**
     * Sets the value of the custcorp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerModifyIOType.Custcorp }
     *     
     */
    public void setCustcorp(CustomerModifyIOType.Custcorp value) {
        this.custcorp = value;
    }

    /**
     * Gets the value of the custdocChklist property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the custdocChklist property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustdocChklist().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomerModifyIOType.CustdocChklist }
     * 
     * 
     */
    public List<CustomerModifyIOType.CustdocChklist> getCustdocChklist() {
        if (custdocChklist == null) {
            custdocChklist = new ArrayList<CustomerModifyIOType.CustdocChklist>();
        }
        return this.custdocChklist;
    }

    /**
     * Gets the value of the doctypeRemarks property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerModifyIOType.DoctypeRemarks }
     *     
     */
    public CustomerModifyIOType.DoctypeRemarks getDoctypeRemarks() {
        return doctypeRemarks;
    }

    /**
     * Sets the value of the doctypeRemarks property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerModifyIOType.DoctypeRemarks }
     *     
     */
    public void setDoctypeRemarks(CustomerModifyIOType.DoctypeRemarks value) {
        this.doctypeRemarks = value;
    }

    /**
     * Gets the value of the custgrp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the custgrp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustgrp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomerModifyIOType.Custgrp }
     * 
     * 
     */
    public List<CustomerModifyIOType.Custgrp> getCustgrp() {
        if (custgrp == null) {
            custgrp = new ArrayList<CustomerModifyIOType.Custgrp>();
        }
        return this.custgrp;
    }

    /**
     * Gets the value of the custshhold property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the custshhold property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustshhold().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomerModifyIOType.Custshhold }
     * 
     * 
     */
    public List<CustomerModifyIOType.Custshhold> getCustshhold() {
        if (custshhold == null) {
            custshhold = new ArrayList<CustomerModifyIOType.Custshhold>();
        }
        return this.custshhold;
    }

    /**
     * Gets the value of the clsccyrest property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the clsccyrest property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClsccyrest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomerModifyIOType.Clsccyrest }
     * 
     * 
     */
    public List<CustomerModifyIOType.Clsccyrest> getClsccyrest() {
        if (clsccyrest == null) {
            clsccyrest = new ArrayList<CustomerModifyIOType.Clsccyrest>();
        }
        return this.clsccyrest;
    }

    /**
     * Gets the value of the bic property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bic property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBic().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomerModifyIOType.Bic }
     * 
     * 
     */
    public List<CustomerModifyIOType.Bic> getBic() {
        if (bic == null) {
            bic = new ArrayList<CustomerModifyIOType.Bic>();
        }
        return this.bic;
    }

    /**
     * Gets the value of the linkedac property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the linkedac property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLinkedac().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomerModifyIOType.Linkedac }
     * 
     * 
     */
    public List<CustomerModifyIOType.Linkedac> getLinkedac() {
        if (linkedac == null) {
            linkedac = new ArrayList<CustomerModifyIOType.Linkedac>();
        }
        return this.linkedac;
    }

    /**
     * Gets the value of the jointventure property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the jointventure property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getJointventure().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomerModifyIOType.Jointventure }
     * 
     * 
     */
    public List<CustomerModifyIOType.Jointventure> getJointventure() {
        if (jointventure == null) {
            jointventure = new ArrayList<CustomerModifyIOType.Jointventure>();
        }
        return this.jointventure;
    }

    /**
     * Gets the value of the custsegment property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerModifyIOType.Custsegment }
     *     
     */
    public CustomerModifyIOType.Custsegment getCustsegment() {
        return custsegment;
    }

    /**
     * Sets the value of the custsegment property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerModifyIOType.Custsegment }
     *     
     */
    public void setCustsegment(CustomerModifyIOType.Custsegment value) {
        this.custsegment = value;
    }

    /**
     * Gets the value of the mfi1 property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerModifyIOType.Mfi1 }
     *     
     */
    public CustomerModifyIOType.Mfi1 getMfi1() {
        return mfi1;
    }

    /**
     * Sets the value of the mfi1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerModifyIOType.Mfi1 }
     *     
     */
    public void setMfi1(CustomerModifyIOType.Mfi1 value) {
        this.mfi1 = value;
    }

    /**
     * Gets the value of the idMaster property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerModifyIOType.IdMaster }
     *     
     */
    public CustomerModifyIOType.IdMaster getIdMaster() {
        return idMaster;
    }

    /**
     * Sets the value of the idMaster property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerModifyIOType.IdMaster }
     *     
     */
    public void setIdMaster(CustomerModifyIOType.IdMaster value) {
        this.idMaster = value;
    }

    /**
     * Gets the value of the idDetMain property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the idDetMain property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIdDetMain().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomerModifyIOType.IdDetMain }
     * 
     * 
     */
    public List<CustomerModifyIOType.IdDetMain> getIdDetMain() {
        if (idDetMain == null) {
            idDetMain = new ArrayList<CustomerModifyIOType.IdDetMain>();
        }
        return this.idDetMain;
    }

    /**
     * Gets the value of the custmis property.
     * 
     * @return
     *     possible object is
     *     {@link CustmisModifyIOType }
     *     
     */
    public CustmisModifyIOType getCustmis() {
        return custmis;
    }

    /**
     * Sets the value of the custmis property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustmisModifyIOType }
     *     
     */
    public void setCustmis(CustmisModifyIOType value) {
        this.custmis = value;
    }

    /**
     * Gets the value of the jointcustomer property.
     * 
     * @return
     *     possible object is
     *     {@link CustjointModifyIOType }
     *     
     */
    public CustjointModifyIOType getJointcustomer() {
        return jointcustomer;
    }

    /**
     * Sets the value of the jointcustomer property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustjointModifyIOType }
     *     
     */
    public void setJointcustomer(CustjointModifyIOType value) {
        this.jointcustomer = value;
    }

    /**
     * Gets the value of the custAccDet property.
     * 
     * @return
     *     possible object is
     *     {@link CustDiaryDetailsModifyIOType }
     *     
     */
    public CustDiaryDetailsModifyIOType getCustAccDet() {
        return custAccDet;
    }

    /**
     * Sets the value of the custAccDet property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustDiaryDetailsModifyIOType }
     *     
     */
    public void setCustAccDet(CustDiaryDetailsModifyIOType value) {
        this.custAccDet = value;
    }

    /**
     * Gets the value of the custaccdet property.
     * 
     * @return
     *     possible object is
     *     {@link LinkedEntityModifyIOType }
     *     
     */
    public LinkedEntityModifyIOType getCustaccdet() {
        return custaccdet;
    }

    /**
     * Sets the value of the custaccdet property.
     * 
     * @param value
     *     allowed object is
     *     {@link LinkedEntityModifyIOType }
     *     
     */
    public void setCustaccdet(LinkedEntityModifyIOType value) {
        this.custaccdet = value;
    }

    /**
     * Gets the value of the custacdetail property.
     * 
     * @return
     *     possible object is
     *     {@link CusttextModifyIOType }
     *     
     */
    public CusttextModifyIOType getCustacdetail() {
        return custacdetail;
    }

    /**
     * Sets the value of the custacdetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link CusttextModifyIOType }
     *     
     */
    public void setCustacdetail(CusttextModifyIOType value) {
        this.custacdetail = value;
    }

    /**
     * Gets the value of the udfdetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the udfdetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUDFDETAILS().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UDFDETAILSType2 }
     * 
     * 
     */
    public List<UDFDETAILSType2> getUDFDETAILS() {
        if (udfdetails == null) {
            udfdetails = new ArrayList<UDFDETAILSType2>();
        }
        return this.udfdetails;
    }

    /**
     * Gets the value of the sttmsDebit property.
     * 
     * @return
     *     possible object is
     *     {@link StccrdsaModifyIOType }
     *     
     */
    public StccrdsaModifyIOType getSttmsDebit() {
        return sttmsDebit;
    }

    /**
     * Sets the value of the sttmsDebit property.
     * 
     * @param value
     *     allowed object is
     *     {@link StccrdsaModifyIOType }
     *     
     */
    public void setSttmsDebit(StccrdsaModifyIOType value) {
        this.sttmsDebit = value;
    }

    /**
     * Gets the value of the extsysWsMaster property.
     * 
     * @return
     *     possible object is
     *     {@link CscofacmModifyIOType }
     *     
     */
    public CscofacmModifyIOType getExtsysWsMaster() {
        return extsysWsMaster;
    }

    /**
     * Sets the value of the extsysWsMaster property.
     * 
     * @param value
     *     allowed object is
     *     {@link CscofacmModifyIOType }
     *     
     */
    public void setExtsysWsMaster(CscofacmModifyIOType value) {
        this.extsysWsMaster = value;
    }

    /**
     * Gets the value of the custAccount property.
     * 
     * @return
     *     possible object is
     *     {@link StccuaccModifyIOType }
     *     
     */
    public StccuaccModifyIOType getCustAccount() {
        return custAccount;
    }

    /**
     * Sets the value of the custAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link StccuaccModifyIOType }
     *     
     */
    public void setCustAccount(StccuaccModifyIOType value) {
        this.custAccount = value;
    }

    /**
     * Gets the value of the nsfEnq property.
     * 
     * @return
     *     possible object is
     *     {@link StcnsckModifyIOType }
     *     
     */
    public StcnsckModifyIOType getNsfEnq() {
        return nsfEnq;
    }

    /**
     * Sets the value of the nsfEnq property.
     * 
     * @param value
     *     allowed object is
     *     {@link StcnsckModifyIOType }
     *     
     */
    public void setNsfEnq(StcnsckModifyIOType value) {
        this.nsfEnq = value;
    }

    /**
     * Gets the value of the master property.
     * 
     * @return
     *     possible object is
     *     {@link CscupdocModifyIOType }
     *     
     */
    public CscupdocModifyIOType getMaster() {
        return master;
    }

    /**
     * Sets the value of the master property.
     * 
     * @param value
     *     allowed object is
     *     {@link CscupdocModifyIOType }
     *     
     */
    public void setMaster(CscupdocModifyIOType value) {
        this.master = value;
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
     *         &lt;element name="ACC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="BICCD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "acc",
        "biccd"
    })
    public static class Bic {

        @XmlElement(name = "ACC")
        protected String acc;
        @XmlElement(name = "BICCD")
        protected String biccd;

        /**
         * Gets the value of the acc property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getACC() {
            return acc;
        }

        /**
         * Sets the value of the acc property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setACC(String value) {
            this.acc = value;
        }

        /**
         * Gets the value of the biccd property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBICCD() {
            return biccd;
        }

        /**
         * Sets the value of the biccd property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBICCD(String value) {
            this.biccd = value;
        }

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
     *         &lt;element name="CCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="DESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "ccy",
        "desc"
    })
    public static class Clsccyrest {

        @XmlElement(name = "CCY")
        protected String ccy;
        @XmlElement(name = "DESC")
        protected String desc;

        /**
         * Gets the value of the ccy property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCCY() {
            return ccy;
        }

        /**
         * Sets the value of the ccy property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCCY(String value) {
            this.ccy = value;
        }

        /**
         * Gets the value of the desc property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDESC() {
            return desc;
        }

        /**
         * Sets the value of the desc property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDESC(String value) {
            this.desc = value;
        }

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
     *         &lt;element name="CORPNAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="REGADD1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="REGADD2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="REGADD3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="R_PIN_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="AMTCCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="INCORPDT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *         &lt;element name="CAPITAL" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="NETWORTH" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="CORPDESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="INCORPCNTRY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="REGCNTRY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="SAME_CORR_ADDR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="REGADD4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="JOINTVENTURE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="CADDR1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="CADDR3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="CADDR2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="CADDR4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="CPINCODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="CNTRY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="NATIONALITY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="LANGUAGE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="KYC_DETAILS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="KYCREFNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="CNAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="UIDNAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="UIDVALUE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="TELEPHONE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="FAX" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="EMAILID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="MOBILENUMBER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="CUSTCOMMMODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="NATIONID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="TELISDNOCRP" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="MOBISDNOCRP" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="FAXISDNOCRP" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="PREF_CNTACT_DATE" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *         &lt;element name="PREF_CNTACT_TIME" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="OWNERSHPTYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="Custcorpdir" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="DIRNAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="NADDR1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="NADDR2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="NADDR3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="NADDR4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="ADDRESS1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="ADDRESS2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="ADDRESS3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="COUNTRY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="TEL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="TAXID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="MOBNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="EMAIL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="SNO" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                   &lt;element name="TELISDNOCRPDIR" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                   &lt;element name="MOBISDNOCRPDIR" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                   &lt;element name="ADDRCOUNTRYCRPDIR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="NATIONLTYCRPDIR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="USRESSTATUSCRPDIR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="PCTHOLDING" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                   &lt;element name="HOMETELNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="HOMETELISD" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                   &lt;element name="PPIN_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="PIN_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Issuerdet" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="OVERLMTCCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="OVERLIMIT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                   &lt;element name="Issuerlmts" maxOccurs="unbounded">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="ISSID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="CLTRLTYP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="LMTCCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="LMTAMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
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
        "corpname",
        "regadd1",
        "regadd2",
        "regadd3",
        "rpincode",
        "amtccy",
        "incorpdt",
        "capital",
        "networth",
        "corpdesc",
        "incorpcntry",
        "regcntry",
        "samecorraddr",
        "regadd4",
        "jointventure",
        "caddr1",
        "caddr3",
        "caddr2",
        "caddr4",
        "cpincode",
        "cntry",
        "nationality",
        "language",
        "kycdetails",
        "kycrefno",
        "cname",
        "uidname",
        "uidvalue",
        "telephone",
        "fax",
        "emailid",
        "mobilenumber",
        "custcommmode",
        "nationid",
        "telisdnocrp",
        "mobisdnocrp",
        "faxisdnocrp",
        "prefcntactdate",
        "prefcntacttime",
        "ownershptype",
        "custcorpdir",
        "issuerdet"
    })
    public static class Custcorp {

        @XmlElement(name = "CORPNAME")
        protected String corpname;
        @XmlElement(name = "REGADD1")
        protected String regadd1;
        @XmlElement(name = "REGADD2")
        protected String regadd2;
        @XmlElement(name = "REGADD3")
        protected String regadd3;
        @XmlElement(name = "R_PIN_CODE")
        protected String rpincode;
        @XmlElement(name = "AMTCCY")
        protected String amtccy;
        @XmlElement(name = "INCORPDT")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar incorpdt;
        @XmlElement(name = "CAPITAL")
        protected BigDecimal capital;
        @XmlElement(name = "NETWORTH")
        protected BigDecimal networth;
        @XmlElement(name = "CORPDESC")
        protected String corpdesc;
        @XmlElement(name = "INCORPCNTRY")
        protected String incorpcntry;
        @XmlElement(name = "REGCNTRY")
        protected String regcntry;
        @XmlElement(name = "SAME_CORR_ADDR")
        protected String samecorraddr;
        @XmlElement(name = "REGADD4")
        protected String regadd4;
        @XmlElement(name = "JOINTVENTURE")
        protected String jointventure;
        @XmlElement(name = "CADDR1")
        protected String caddr1;
        @XmlElement(name = "CADDR3")
        protected String caddr3;
        @XmlElement(name = "CADDR2")
        protected String caddr2;
        @XmlElement(name = "CADDR4")
        protected String caddr4;
        @XmlElement(name = "CPINCODE")
        protected String cpincode;
        @XmlElement(name = "CNTRY")
        protected String cntry;
        @XmlElement(name = "NATIONALITY")
        protected String nationality;
        @XmlElement(name = "LANGUAGE")
        protected String language;
        @XmlElement(name = "KYC_DETAILS")
        protected String kycdetails;
        @XmlElement(name = "KYCREFNO")
        protected String kycrefno;
        @XmlElement(name = "CNAME")
        protected String cname;
        @XmlElement(name = "UIDNAME")
        protected String uidname;
        @XmlElement(name = "UIDVALUE")
        protected String uidvalue;
        @XmlElement(name = "TELEPHONE")
        protected String telephone;
        @XmlElement(name = "FAX")
        protected String fax;
        @XmlElement(name = "EMAILID")
        protected String emailid;
        @XmlElement(name = "MOBILENUMBER")
        protected String mobilenumber;
        @XmlElement(name = "CUSTCOMMMODE")
        protected String custcommmode;
        @XmlElement(name = "NATIONID")
        protected String nationid;
        @XmlElement(name = "TELISDNOCRP")
        protected BigDecimal telisdnocrp;
        @XmlElement(name = "MOBISDNOCRP")
        protected BigDecimal mobisdnocrp;
        @XmlElement(name = "FAXISDNOCRP")
        protected BigDecimal faxisdnocrp;
        @XmlElement(name = "PREF_CNTACT_DATE")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar prefcntactdate;
        @XmlElement(name = "PREF_CNTACT_TIME")
        protected BigDecimal prefcntacttime;
        @XmlElement(name = "OWNERSHPTYPE")
        protected String ownershptype;
        @XmlElement(name = "Custcorpdir", required = true)
        protected List<CustomerModifyIOType.Custcorp.Custcorpdir> custcorpdir;
        @XmlElement(name = "Issuerdet")
        protected CustomerModifyIOType.Custcorp.Issuerdet issuerdet;

        /**
         * Gets the value of the corpname property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCORPNAME() {
            return corpname;
        }

        /**
         * Sets the value of the corpname property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCORPNAME(String value) {
            this.corpname = value;
        }

        /**
         * Gets the value of the regadd1 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getREGADD1() {
            return regadd1;
        }

        /**
         * Sets the value of the regadd1 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setREGADD1(String value) {
            this.regadd1 = value;
        }

        /**
         * Gets the value of the regadd2 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getREGADD2() {
            return regadd2;
        }

        /**
         * Sets the value of the regadd2 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setREGADD2(String value) {
            this.regadd2 = value;
        }

        /**
         * Gets the value of the regadd3 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getREGADD3() {
            return regadd3;
        }

        /**
         * Sets the value of the regadd3 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setREGADD3(String value) {
            this.regadd3 = value;
        }

        /**
         * Gets the value of the rpincode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRPINCODE() {
            return rpincode;
        }

        /**
         * Sets the value of the rpincode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRPINCODE(String value) {
            this.rpincode = value;
        }

        /**
         * Gets the value of the amtccy property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAMTCCY() {
            return amtccy;
        }

        /**
         * Sets the value of the amtccy property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAMTCCY(String value) {
            this.amtccy = value;
        }

        /**
         * Gets the value of the incorpdt property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getINCORPDT() {
            return incorpdt;
        }

        /**
         * Sets the value of the incorpdt property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setINCORPDT(XMLGregorianCalendar value) {
            this.incorpdt = value;
        }

        /**
         * Gets the value of the capital property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getCAPITAL() {
            return capital;
        }

        /**
         * Sets the value of the capital property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setCAPITAL(BigDecimal value) {
            this.capital = value;
        }

        /**
         * Gets the value of the networth property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getNETWORTH() {
            return networth;
        }

        /**
         * Sets the value of the networth property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setNETWORTH(BigDecimal value) {
            this.networth = value;
        }

        /**
         * Gets the value of the corpdesc property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCORPDESC() {
            return corpdesc;
        }

        /**
         * Sets the value of the corpdesc property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCORPDESC(String value) {
            this.corpdesc = value;
        }

        /**
         * Gets the value of the incorpcntry property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getINCORPCNTRY() {
            return incorpcntry;
        }

        /**
         * Sets the value of the incorpcntry property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setINCORPCNTRY(String value) {
            this.incorpcntry = value;
        }

        /**
         * Gets the value of the regcntry property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getREGCNTRY() {
            return regcntry;
        }

        /**
         * Sets the value of the regcntry property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setREGCNTRY(String value) {
            this.regcntry = value;
        }

        /**
         * Gets the value of the samecorraddr property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSAMECORRADDR() {
            return samecorraddr;
        }

        /**
         * Sets the value of the samecorraddr property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSAMECORRADDR(String value) {
            this.samecorraddr = value;
        }

        /**
         * Gets the value of the regadd4 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getREGADD4() {
            return regadd4;
        }

        /**
         * Sets the value of the regadd4 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setREGADD4(String value) {
            this.regadd4 = value;
        }

        /**
         * Gets the value of the jointventure property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getJOINTVENTURE() {
            return jointventure;
        }

        /**
         * Sets the value of the jointventure property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setJOINTVENTURE(String value) {
            this.jointventure = value;
        }

        /**
         * Gets the value of the caddr1 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCADDR1() {
            return caddr1;
        }

        /**
         * Sets the value of the caddr1 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCADDR1(String value) {
            this.caddr1 = value;
        }

        /**
         * Gets the value of the caddr3 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCADDR3() {
            return caddr3;
        }

        /**
         * Sets the value of the caddr3 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCADDR3(String value) {
            this.caddr3 = value;
        }

        /**
         * Gets the value of the caddr2 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCADDR2() {
            return caddr2;
        }

        /**
         * Sets the value of the caddr2 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCADDR2(String value) {
            this.caddr2 = value;
        }

        /**
         * Gets the value of the caddr4 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCADDR4() {
            return caddr4;
        }

        /**
         * Sets the value of the caddr4 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCADDR4(String value) {
            this.caddr4 = value;
        }

        /**
         * Gets the value of the cpincode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCPINCODE() {
            return cpincode;
        }

        /**
         * Sets the value of the cpincode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCPINCODE(String value) {
            this.cpincode = value;
        }

        /**
         * Gets the value of the cntry property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCNTRY() {
            return cntry;
        }

        /**
         * Sets the value of the cntry property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCNTRY(String value) {
            this.cntry = value;
        }

        /**
         * Gets the value of the nationality property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNATIONALITY() {
            return nationality;
        }

        /**
         * Sets the value of the nationality property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNATIONALITY(String value) {
            this.nationality = value;
        }

        /**
         * Gets the value of the language property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLANGUAGE() {
            return language;
        }

        /**
         * Sets the value of the language property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLANGUAGE(String value) {
            this.language = value;
        }

        /**
         * Gets the value of the kycdetails property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getKYCDETAILS() {
            return kycdetails;
        }

        /**
         * Sets the value of the kycdetails property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setKYCDETAILS(String value) {
            this.kycdetails = value;
        }

        /**
         * Gets the value of the kycrefno property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getKYCREFNO() {
            return kycrefno;
        }

        /**
         * Sets the value of the kycrefno property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setKYCREFNO(String value) {
            this.kycrefno = value;
        }

        /**
         * Gets the value of the cname property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCNAME() {
            return cname;
        }

        /**
         * Sets the value of the cname property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCNAME(String value) {
            this.cname = value;
        }

        /**
         * Gets the value of the uidname property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUIDNAME() {
            return uidname;
        }

        /**
         * Sets the value of the uidname property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUIDNAME(String value) {
            this.uidname = value;
        }

        /**
         * Gets the value of the uidvalue property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUIDVALUE() {
            return uidvalue;
        }

        /**
         * Sets the value of the uidvalue property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUIDVALUE(String value) {
            this.uidvalue = value;
        }

        /**
         * Gets the value of the telephone property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTELEPHONE() {
            return telephone;
        }

        /**
         * Sets the value of the telephone property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTELEPHONE(String value) {
            this.telephone = value;
        }

        /**
         * Gets the value of the fax property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFAX() {
            return fax;
        }

        /**
         * Sets the value of the fax property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFAX(String value) {
            this.fax = value;
        }

        /**
         * Gets the value of the emailid property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEMAILID() {
            return emailid;
        }

        /**
         * Sets the value of the emailid property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEMAILID(String value) {
            this.emailid = value;
        }

        /**
         * Gets the value of the mobilenumber property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMOBILENUMBER() {
            return mobilenumber;
        }

        /**
         * Sets the value of the mobilenumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMOBILENUMBER(String value) {
            this.mobilenumber = value;
        }

        /**
         * Gets the value of the custcommmode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCUSTCOMMMODE() {
            return custcommmode;
        }

        /**
         * Sets the value of the custcommmode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCUSTCOMMMODE(String value) {
            this.custcommmode = value;
        }

        /**
         * Gets the value of the nationid property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNATIONID() {
            return nationid;
        }

        /**
         * Sets the value of the nationid property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNATIONID(String value) {
            this.nationid = value;
        }

        /**
         * Gets the value of the telisdnocrp property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getTELISDNOCRP() {
            return telisdnocrp;
        }

        /**
         * Sets the value of the telisdnocrp property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setTELISDNOCRP(BigDecimal value) {
            this.telisdnocrp = value;
        }

        /**
         * Gets the value of the mobisdnocrp property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getMOBISDNOCRP() {
            return mobisdnocrp;
        }

        /**
         * Sets the value of the mobisdnocrp property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setMOBISDNOCRP(BigDecimal value) {
            this.mobisdnocrp = value;
        }

        /**
         * Gets the value of the faxisdnocrp property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getFAXISDNOCRP() {
            return faxisdnocrp;
        }

        /**
         * Sets the value of the faxisdnocrp property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setFAXISDNOCRP(BigDecimal value) {
            this.faxisdnocrp = value;
        }

        /**
         * Gets the value of the prefcntactdate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getPREFCNTACTDATE() {
            return prefcntactdate;
        }

        /**
         * Sets the value of the prefcntactdate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setPREFCNTACTDATE(XMLGregorianCalendar value) {
            this.prefcntactdate = value;
        }

        /**
         * Gets the value of the prefcntacttime property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getPREFCNTACTTIME() {
            return prefcntacttime;
        }

        /**
         * Sets the value of the prefcntacttime property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setPREFCNTACTTIME(BigDecimal value) {
            this.prefcntacttime = value;
        }

        /**
         * Gets the value of the ownershptype property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOWNERSHPTYPE() {
            return ownershptype;
        }

        /**
         * Sets the value of the ownershptype property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOWNERSHPTYPE(String value) {
            this.ownershptype = value;
        }

        /**
         * Gets the value of the custcorpdir property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the custcorpdir property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCustcorpdir().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CustomerModifyIOType.Custcorp.Custcorpdir }
         * 
         * 
         */
        public List<CustomerModifyIOType.Custcorp.Custcorpdir> getCustcorpdir() {
            if (custcorpdir == null) {
                custcorpdir = new ArrayList<CustomerModifyIOType.Custcorp.Custcorpdir>();
            }
            return this.custcorpdir;
        }

        /**
         * Gets the value of the issuerdet property.
         * 
         * @return
         *     possible object is
         *     {@link CustomerModifyIOType.Custcorp.Issuerdet }
         *     
         */
        public CustomerModifyIOType.Custcorp.Issuerdet getIssuerdet() {
            return issuerdet;
        }

        /**
         * Sets the value of the issuerdet property.
         * 
         * @param value
         *     allowed object is
         *     {@link CustomerModifyIOType.Custcorp.Issuerdet }
         *     
         */
        public void setIssuerdet(CustomerModifyIOType.Custcorp.Issuerdet value) {
            this.issuerdet = value;
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
         *         &lt;element name="DIRNAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="NADDR1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="NADDR2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="NADDR3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="NADDR4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="ADDRESS1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="ADDRESS2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="ADDRESS3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="COUNTRY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="TEL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="TAXID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="MOBNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="EMAIL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="SNO" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *         &lt;element name="TELISDNOCRPDIR" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *         &lt;element name="MOBISDNOCRPDIR" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *         &lt;element name="ADDRCOUNTRYCRPDIR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="NATIONLTYCRPDIR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="USRESSTATUSCRPDIR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="PCTHOLDING" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *         &lt;element name="HOMETELNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="HOMETELISD" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *         &lt;element name="PPIN_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="PIN_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "dirname",
            "naddr1",
            "naddr2",
            "naddr3",
            "naddr4",
            "address1",
            "address2",
            "address3",
            "country",
            "tel",
            "taxid",
            "mobno",
            "email",
            "sno",
            "telisdnocrpdir",
            "mobisdnocrpdir",
            "addrcountrycrpdir",
            "nationltycrpdir",
            "usresstatuscrpdir",
            "pctholding",
            "hometelno",
            "hometelisd",
            "ppincode",
            "pincode"
        })
        public static class Custcorpdir {

            @XmlElement(name = "DIRNAME")
            protected String dirname;
            @XmlElement(name = "NADDR1")
            protected String naddr1;
            @XmlElement(name = "NADDR2")
            protected String naddr2;
            @XmlElement(name = "NADDR3")
            protected String naddr3;
            @XmlElement(name = "NADDR4")
            protected String naddr4;
            @XmlElement(name = "ADDRESS1")
            protected String address1;
            @XmlElement(name = "ADDRESS2")
            protected String address2;
            @XmlElement(name = "ADDRESS3")
            protected String address3;
            @XmlElement(name = "COUNTRY")
            protected String country;
            @XmlElement(name = "TEL")
            protected String tel;
            @XmlElement(name = "TAXID")
            protected String taxid;
            @XmlElement(name = "MOBNO")
            protected String mobno;
            @XmlElement(name = "EMAIL")
            protected String email;
            @XmlElement(name = "SNO")
            protected BigDecimal sno;
            @XmlElement(name = "TELISDNOCRPDIR")
            protected BigDecimal telisdnocrpdir;
            @XmlElement(name = "MOBISDNOCRPDIR")
            protected BigDecimal mobisdnocrpdir;
            @XmlElement(name = "ADDRCOUNTRYCRPDIR")
            protected String addrcountrycrpdir;
            @XmlElement(name = "NATIONLTYCRPDIR")
            protected String nationltycrpdir;
            @XmlElement(name = "USRESSTATUSCRPDIR")
            protected String usresstatuscrpdir;
            @XmlElement(name = "PCTHOLDING")
            protected BigDecimal pctholding;
            @XmlElement(name = "HOMETELNO")
            protected String hometelno;
            @XmlElement(name = "HOMETELISD")
            protected BigDecimal hometelisd;
            @XmlElement(name = "PPIN_CODE")
            protected String ppincode;
            @XmlElement(name = "PIN_CODE")
            protected String pincode;

            /**
             * Gets the value of the dirname property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDIRNAME() {
                return dirname;
            }

            /**
             * Sets the value of the dirname property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDIRNAME(String value) {
                this.dirname = value;
            }

            /**
             * Gets the value of the naddr1 property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNADDR1() {
                return naddr1;
            }

            /**
             * Sets the value of the naddr1 property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNADDR1(String value) {
                this.naddr1 = value;
            }

            /**
             * Gets the value of the naddr2 property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNADDR2() {
                return naddr2;
            }

            /**
             * Sets the value of the naddr2 property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNADDR2(String value) {
                this.naddr2 = value;
            }

            /**
             * Gets the value of the naddr3 property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNADDR3() {
                return naddr3;
            }

            /**
             * Sets the value of the naddr3 property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNADDR3(String value) {
                this.naddr3 = value;
            }

            /**
             * Gets the value of the naddr4 property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNADDR4() {
                return naddr4;
            }

            /**
             * Sets the value of the naddr4 property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNADDR4(String value) {
                this.naddr4 = value;
            }

            /**
             * Gets the value of the address1 property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getADDRESS1() {
                return address1;
            }

            /**
             * Sets the value of the address1 property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setADDRESS1(String value) {
                this.address1 = value;
            }

            /**
             * Gets the value of the address2 property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getADDRESS2() {
                return address2;
            }

            /**
             * Sets the value of the address2 property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setADDRESS2(String value) {
                this.address2 = value;
            }

            /**
             * Gets the value of the address3 property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getADDRESS3() {
                return address3;
            }

            /**
             * Sets the value of the address3 property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setADDRESS3(String value) {
                this.address3 = value;
            }

            /**
             * Gets the value of the country property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCOUNTRY() {
                return country;
            }

            /**
             * Sets the value of the country property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCOUNTRY(String value) {
                this.country = value;
            }

            /**
             * Gets the value of the tel property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTEL() {
                return tel;
            }

            /**
             * Sets the value of the tel property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTEL(String value) {
                this.tel = value;
            }

            /**
             * Gets the value of the taxid property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTAXID() {
                return taxid;
            }

            /**
             * Sets the value of the taxid property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTAXID(String value) {
                this.taxid = value;
            }

            /**
             * Gets the value of the mobno property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMOBNO() {
                return mobno;
            }

            /**
             * Sets the value of the mobno property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMOBNO(String value) {
                this.mobno = value;
            }

            /**
             * Gets the value of the email property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getEMAIL() {
                return email;
            }

            /**
             * Sets the value of the email property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setEMAIL(String value) {
                this.email = value;
            }

            /**
             * Gets the value of the sno property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getSNO() {
                return sno;
            }

            /**
             * Sets the value of the sno property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setSNO(BigDecimal value) {
                this.sno = value;
            }

            /**
             * Gets the value of the telisdnocrpdir property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getTELISDNOCRPDIR() {
                return telisdnocrpdir;
            }

            /**
             * Sets the value of the telisdnocrpdir property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setTELISDNOCRPDIR(BigDecimal value) {
                this.telisdnocrpdir = value;
            }

            /**
             * Gets the value of the mobisdnocrpdir property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getMOBISDNOCRPDIR() {
                return mobisdnocrpdir;
            }

            /**
             * Sets the value of the mobisdnocrpdir property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setMOBISDNOCRPDIR(BigDecimal value) {
                this.mobisdnocrpdir = value;
            }

            /**
             * Gets the value of the addrcountrycrpdir property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getADDRCOUNTRYCRPDIR() {
                return addrcountrycrpdir;
            }

            /**
             * Sets the value of the addrcountrycrpdir property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setADDRCOUNTRYCRPDIR(String value) {
                this.addrcountrycrpdir = value;
            }

            /**
             * Gets the value of the nationltycrpdir property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNATIONLTYCRPDIR() {
                return nationltycrpdir;
            }

            /**
             * Sets the value of the nationltycrpdir property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNATIONLTYCRPDIR(String value) {
                this.nationltycrpdir = value;
            }

            /**
             * Gets the value of the usresstatuscrpdir property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getUSRESSTATUSCRPDIR() {
                return usresstatuscrpdir;
            }

            /**
             * Sets the value of the usresstatuscrpdir property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setUSRESSTATUSCRPDIR(String value) {
                this.usresstatuscrpdir = value;
            }

            /**
             * Gets the value of the pctholding property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getPCTHOLDING() {
                return pctholding;
            }

            /**
             * Sets the value of the pctholding property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setPCTHOLDING(BigDecimal value) {
                this.pctholding = value;
            }

            /**
             * Gets the value of the hometelno property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getHOMETELNO() {
                return hometelno;
            }

            /**
             * Sets the value of the hometelno property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setHOMETELNO(String value) {
                this.hometelno = value;
            }

            /**
             * Gets the value of the hometelisd property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getHOMETELISD() {
                return hometelisd;
            }

            /**
             * Sets the value of the hometelisd property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setHOMETELISD(BigDecimal value) {
                this.hometelisd = value;
            }

            /**
             * Gets the value of the ppincode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPPINCODE() {
                return ppincode;
            }

            /**
             * Sets the value of the ppincode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPPINCODE(String value) {
                this.ppincode = value;
            }

            /**
             * Gets the value of the pincode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPINCODE() {
                return pincode;
            }

            /**
             * Sets the value of the pincode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPINCODE(String value) {
                this.pincode = value;
            }

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
         *         &lt;element name="OVERLMTCCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="OVERLIMIT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *         &lt;element name="Issuerlmts" maxOccurs="unbounded">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="ISSID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="CLTRLTYP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="LMTCCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="LMTAMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
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
            "overlmtccy",
            "overlimit",
            "issuerlmts"
        })
        public static class Issuerdet {

            @XmlElement(name = "OVERLMTCCY")
            protected String overlmtccy;
            @XmlElement(name = "OVERLIMIT")
            protected BigDecimal overlimit;
            @XmlElement(name = "Issuerlmts", required = true)
            protected List<CustomerModifyIOType.Custcorp.Issuerdet.Issuerlmts> issuerlmts;

            /**
             * Gets the value of the overlmtccy property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getOVERLMTCCY() {
                return overlmtccy;
            }

            /**
             * Sets the value of the overlmtccy property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setOVERLMTCCY(String value) {
                this.overlmtccy = value;
            }

            /**
             * Gets the value of the overlimit property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getOVERLIMIT() {
                return overlimit;
            }

            /**
             * Sets the value of the overlimit property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setOVERLIMIT(BigDecimal value) {
                this.overlimit = value;
            }

            /**
             * Gets the value of the issuerlmts property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the issuerlmts property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getIssuerlmts().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link CustomerModifyIOType.Custcorp.Issuerdet.Issuerlmts }
             * 
             * 
             */
            public List<CustomerModifyIOType.Custcorp.Issuerdet.Issuerlmts> getIssuerlmts() {
                if (issuerlmts == null) {
                    issuerlmts = new ArrayList<CustomerModifyIOType.Custcorp.Issuerdet.Issuerlmts>();
                }
                return this.issuerlmts;
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
             *         &lt;element name="ISSID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="CLTRLTYP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="LMTCCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="LMTAMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
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
                "issid",
                "cltrltyp",
                "lmtccy",
                "lmtamt"
            })
            public static class Issuerlmts {

                @XmlElement(name = "ISSID")
                protected String issid;
                @XmlElement(name = "CLTRLTYP")
                protected String cltrltyp;
                @XmlElement(name = "LMTCCY")
                protected String lmtccy;
                @XmlElement(name = "LMTAMT")
                protected BigDecimal lmtamt;

                /**
                 * Gets the value of the issid property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getISSID() {
                    return issid;
                }

                /**
                 * Sets the value of the issid property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setISSID(String value) {
                    this.issid = value;
                }

                /**
                 * Gets the value of the cltrltyp property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCLTRLTYP() {
                    return cltrltyp;
                }

                /**
                 * Sets the value of the cltrltyp property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCLTRLTYP(String value) {
                    this.cltrltyp = value;
                }

                /**
                 * Gets the value of the lmtccy property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getLMTCCY() {
                    return lmtccy;
                }

                /**
                 * Sets the value of the lmtccy property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setLMTCCY(String value) {
                    this.lmtccy = value;
                }

                /**
                 * Gets the value of the lmtamt property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getLMTAMT() {
                    return lmtamt;
                }

                /**
                 * Sets the value of the lmtamt property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setLMTAMT(BigDecimal value) {
                    this.lmtamt = value;
                }

            }

        }

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
     *         &lt;element name="CUSTOMER_NO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="DOCCATEGORY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="DOCUMENTNAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="DOCUMENT_TYPE" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="CHECKED" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="DOCREF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="DATEREQ" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *         &lt;element name="EXPECTDDATE" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *         &lt;element name="ACTUALDATE" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *         &lt;element name="EXPDATE" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *         &lt;element name="REMARKSCHKLIST" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "customerno",
        "doccategory",
        "documentname",
        "documenttype",
        "checked",
        "docref",
        "datereq",
        "expectddate",
        "actualdate",
        "expdate",
        "remarkschklist"
    })
    public static class CustdocChklist {

        @XmlElement(name = "CUSTOMER_NO")
        protected String customerno;
        @XmlElement(name = "DOCCATEGORY")
        protected String doccategory;
        @XmlElement(name = "DOCUMENTNAME")
        protected String documentname;
        @XmlElement(name = "DOCUMENT_TYPE", required = true)
        protected String documenttype;
        @XmlElement(name = "CHECKED")
        protected String checked;
        @XmlElement(name = "DOCREF")
        protected String docref;
        @XmlElement(name = "DATEREQ")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar datereq;
        @XmlElement(name = "EXPECTDDATE")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar expectddate;
        @XmlElement(name = "ACTUALDATE")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar actualdate;
        @XmlElement(name = "EXPDATE")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar expdate;
        @XmlElement(name = "REMARKSCHKLIST")
        protected String remarkschklist;

        /**
         * Gets the value of the customerno property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCUSTOMERNO() {
            return customerno;
        }

        /**
         * Sets the value of the customerno property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCUSTOMERNO(String value) {
            this.customerno = value;
        }

        /**
         * Gets the value of the doccategory property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDOCCATEGORY() {
            return doccategory;
        }

        /**
         * Sets the value of the doccategory property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDOCCATEGORY(String value) {
            this.doccategory = value;
        }

        /**
         * Gets the value of the documentname property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDOCUMENTNAME() {
            return documentname;
        }

        /**
         * Sets the value of the documentname property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDOCUMENTNAME(String value) {
            this.documentname = value;
        }

        /**
         * Gets the value of the documenttype property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDOCUMENTTYPE() {
            return documenttype;
        }

        /**
         * Sets the value of the documenttype property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDOCUMENTTYPE(String value) {
            this.documenttype = value;
        }

        /**
         * Gets the value of the checked property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCHECKED() {
            return checked;
        }

        /**
         * Sets the value of the checked property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCHECKED(String value) {
            this.checked = value;
        }

        /**
         * Gets the value of the docref property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDOCREF() {
            return docref;
        }

        /**
         * Sets the value of the docref property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDOCREF(String value) {
            this.docref = value;
        }

        /**
         * Gets the value of the datereq property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getDATEREQ() {
            return datereq;
        }

        /**
         * Sets the value of the datereq property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setDATEREQ(XMLGregorianCalendar value) {
            this.datereq = value;
        }

        /**
         * Gets the value of the expectddate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getEXPECTDDATE() {
            return expectddate;
        }

        /**
         * Sets the value of the expectddate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setEXPECTDDATE(XMLGregorianCalendar value) {
            this.expectddate = value;
        }

        /**
         * Gets the value of the actualdate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getACTUALDATE() {
            return actualdate;
        }

        /**
         * Sets the value of the actualdate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setACTUALDATE(XMLGregorianCalendar value) {
            this.actualdate = value;
        }

        /**
         * Gets the value of the expdate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getEXPDATE() {
            return expdate;
        }

        /**
         * Sets the value of the expdate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setEXPDATE(XMLGregorianCalendar value) {
            this.expdate = value;
        }

        /**
         * Gets the value of the remarkschklist property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getREMARKSCHKLIST() {
            return remarkschklist;
        }

        /**
         * Sets the value of the remarkschklist property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setREMARKSCHKLIST(String value) {
            this.remarkschklist = value;
        }

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
     *         &lt;element name="GRPNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="RELATION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "grpno",
        "relation"
    })
    public static class Custgrp {

        @XmlElement(name = "GRPNO")
        protected String grpno;
        @XmlElement(name = "RELATION")
        protected String relation;

        /**
         * Gets the value of the grpno property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getGRPNO() {
            return grpno;
        }

        /**
         * Sets the value of the grpno property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setGRPNO(String value) {
            this.grpno = value;
        }

        /**
         * Gets the value of the relation property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRELATION() {
            return relation;
        }

        /**
         * Sets the value of the relation property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRELATION(String value) {
            this.relation = value;
        }

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
     *         &lt;element name="FSTNAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="MIDNAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="LSTNAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="DOB" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *         &lt;element name="GENDR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="NATIONID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="PPTNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="PPTISSDT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *         &lt;element name="PPTEXPDT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *         &lt;element name="DADD2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="DADD3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="DPIN_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="TELEPHNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="FAXNUMBER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="EMAILID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="BENEFADDR1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ADDRS3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="BENEFADDR2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="DCNTRY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="PCNTRY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="RESSTATUS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="CUSTPREFIX1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="CUSTPREFIX2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="MOBNUM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="CUST_COMM_MODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="LANG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="GUARDIAN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="SBMTAGEPROOF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="MINOR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="KYCSTAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="SSTAFF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="KYC_REFNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="SAME_CORR_ADDR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="DADD1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="SAME_PERM_ADDR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="TITLE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ADDRS4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="DADD4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="PLACEOFBIRTH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="BIRTHCOUNTRY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="TELISDNOPERSONAL" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="MOBISDNO" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="FAXISDNO" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="USRESSTATUS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="PAISSUED" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="PAHOLDERNAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="PAHOLDERNATIONALTY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="PAHOLDERADDR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="PAHOLDERADDRCOUNTRY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="PAHOLDERTELISD" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="PAHOLDERTELNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="VSTUSPREV" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="HOMETELNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="HOMETELISD" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="P_PIN_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="PREF_CNTACT_DATE" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *         &lt;element name="PREF_CNTACT_TIME" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="Custdomestic" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="EDUSTAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="MARITALSTAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="SPNAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="SPEMPSTATUS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="DEPCHILD" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                   &lt;element name="DEPOTH" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                   &lt;element name="ACCOMODATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="MOTHERMAIDN_NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Custprof" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="EMPSTAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="EMPTENURE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                   &lt;element name="RETIREAGE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                   &lt;element name="PREVDESIG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="PREVEMP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="CURRDESIG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="CURREMP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="ADD1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="ADD2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="ADD3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="TEL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="AMTCCY1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="TELEX" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="FAX" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="EMAIL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="SALARY" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                   &lt;element name="OTHER1" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                   &lt;element name="RENT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                   &lt;element name="INSURANCE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                   &lt;element name="LOANPMNT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                   &lt;element name="OTHEXP" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                   &lt;element name="HOUSEVAL" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                   &lt;element name="CRCARD" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                   &lt;element name="CNTY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "fstname",
        "midname",
        "lstname",
        "dob",
        "gendr",
        "nationid",
        "pptno",
        "pptissdt",
        "pptexpdt",
        "dadd2",
        "dadd3",
        "dpincode",
        "telephno",
        "faxnumber",
        "emailid",
        "benefaddr1",
        "addrs3",
        "benefaddr2",
        "dcntry",
        "pcntry",
        "resstatus",
        "custprefix1",
        "custprefix2",
        "mobnum",
        "custcommmode",
        "lang",
        "guardian",
        "sbmtageproof",
        "minor",
        "kycstat",
        "sstaff",
        "kycrefno",
        "samecorraddr",
        "dadd1",
        "samepermaddr",
        "title",
        "addrs4",
        "dadd4",
        "placeofbirth",
        "birthcountry",
        "telisdnopersonal",
        "mobisdno",
        "faxisdno",
        "usresstatus",
        "paissued",
        "paholdername",
        "paholdernationalty",
        "paholderaddr",
        "paholderaddrcountry",
        "paholdertelisd",
        "paholdertelno",
        "vstusprev",
        "hometelno",
        "hometelisd",
        "ppincode",
        "prefcntactdate",
        "prefcntacttime",
        "custdomestic",
        "custprof"
    })
    public static class Custpersonal {

        @XmlElement(name = "FSTNAME")
        protected String fstname;
        @XmlElement(name = "MIDNAME")
        protected String midname;
        @XmlElement(name = "LSTNAME")
        protected String lstname;
        @XmlElement(name = "DOB")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar dob;
        @XmlElement(name = "GENDR")
        protected String gendr;
        @XmlElement(name = "NATIONID")
        protected String nationid;
        @XmlElement(name = "PPTNO")
        protected String pptno;
        @XmlElement(name = "PPTISSDT")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar pptissdt;
        @XmlElement(name = "PPTEXPDT")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar pptexpdt;
        @XmlElement(name = "DADD2")
        protected String dadd2;
        @XmlElement(name = "DADD3")
        protected String dadd3;
        @XmlElement(name = "DPIN_CODE")
        protected String dpincode;
        @XmlElement(name = "TELEPHNO")
        protected String telephno;
        @XmlElement(name = "FAXNUMBER")
        protected String faxnumber;
        @XmlElement(name = "EMAILID")
        protected String emailid;
        @XmlElement(name = "BENEFADDR1")
        protected String benefaddr1;
        @XmlElement(name = "ADDRS3")
        protected String addrs3;
        @XmlElement(name = "BENEFADDR2")
        protected String benefaddr2;
        @XmlElement(name = "DCNTRY")
        protected String dcntry;
        @XmlElement(name = "PCNTRY")
        protected String pcntry;
        @XmlElement(name = "RESSTATUS")
        protected String resstatus;
        @XmlElement(name = "CUSTPREFIX1")
        protected String custprefix1;
        @XmlElement(name = "CUSTPREFIX2")
        protected String custprefix2;
        @XmlElement(name = "MOBNUM")
        protected String mobnum;
        @XmlElement(name = "CUST_COMM_MODE")
        protected String custcommmode;
        @XmlElement(name = "LANG")
        protected String lang;
        @XmlElement(name = "GUARDIAN")
        protected String guardian;
        @XmlElement(name = "SBMTAGEPROOF")
        protected String sbmtageproof;
        @XmlElement(name = "MINOR")
        protected String minor;
        @XmlElement(name = "KYCSTAT")
        protected String kycstat;
        @XmlElement(name = "SSTAFF")
        protected String sstaff;
        @XmlElement(name = "KYC_REFNO")
        protected String kycrefno;
        @XmlElement(name = "SAME_CORR_ADDR")
        protected String samecorraddr;
        @XmlElement(name = "DADD1")
        protected String dadd1;
        @XmlElement(name = "SAME_PERM_ADDR")
        protected String samepermaddr;
        @XmlElement(name = "TITLE")
        protected String title;
        @XmlElement(name = "ADDRS4")
        protected String addrs4;
        @XmlElement(name = "DADD4")
        protected String dadd4;
        @XmlElement(name = "PLACEOFBIRTH")
        protected String placeofbirth;
        @XmlElement(name = "BIRTHCOUNTRY")
        protected String birthcountry;
        @XmlElement(name = "TELISDNOPERSONAL")
        protected BigDecimal telisdnopersonal;
        @XmlElement(name = "MOBISDNO")
        protected BigDecimal mobisdno;
        @XmlElement(name = "FAXISDNO")
        protected BigDecimal faxisdno;
        @XmlElement(name = "USRESSTATUS")
        protected String usresstatus;
        @XmlElement(name = "PAISSUED")
        protected String paissued;
        @XmlElement(name = "PAHOLDERNAME")
        protected String paholdername;
        @XmlElement(name = "PAHOLDERNATIONALTY")
        protected String paholdernationalty;
        @XmlElement(name = "PAHOLDERADDR")
        protected String paholderaddr;
        @XmlElement(name = "PAHOLDERADDRCOUNTRY")
        protected String paholderaddrcountry;
        @XmlElement(name = "PAHOLDERTELISD")
        protected BigDecimal paholdertelisd;
        @XmlElement(name = "PAHOLDERTELNO")
        protected String paholdertelno;
        @XmlElement(name = "VSTUSPREV")
        protected String vstusprev;
        @XmlElement(name = "HOMETELNO")
        protected String hometelno;
        @XmlElement(name = "HOMETELISD")
        protected BigDecimal hometelisd;
        @XmlElement(name = "P_PIN_CODE")
        protected String ppincode;
        @XmlElement(name = "PREF_CNTACT_DATE")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar prefcntactdate;
        @XmlElement(name = "PREF_CNTACT_TIME")
        protected BigDecimal prefcntacttime;
        @XmlElement(name = "Custdomestic")
        protected CustomerModifyIOType.Custpersonal.Custdomestic custdomestic;
        @XmlElement(name = "Custprof")
        protected CustomerModifyIOType.Custpersonal.Custprof custprof;

        /**
         * Gets the value of the fstname property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFSTNAME() {
            return fstname;
        }

        /**
         * Sets the value of the fstname property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFSTNAME(String value) {
            this.fstname = value;
        }

        /**
         * Gets the value of the midname property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMIDNAME() {
            return midname;
        }

        /**
         * Sets the value of the midname property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMIDNAME(String value) {
            this.midname = value;
        }

        /**
         * Gets the value of the lstname property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLSTNAME() {
            return lstname;
        }

        /**
         * Sets the value of the lstname property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLSTNAME(String value) {
            this.lstname = value;
        }

        /**
         * Gets the value of the dob property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getDOB() {
            return dob;
        }

        /**
         * Sets the value of the dob property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setDOB(XMLGregorianCalendar value) {
            this.dob = value;
        }

        /**
         * Gets the value of the gendr property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getGENDR() {
            return gendr;
        }

        /**
         * Sets the value of the gendr property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setGENDR(String value) {
            this.gendr = value;
        }

        /**
         * Gets the value of the nationid property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNATIONID() {
            return nationid;
        }

        /**
         * Sets the value of the nationid property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNATIONID(String value) {
            this.nationid = value;
        }

        /**
         * Gets the value of the pptno property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPPTNO() {
            return pptno;
        }

        /**
         * Sets the value of the pptno property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPPTNO(String value) {
            this.pptno = value;
        }

        /**
         * Gets the value of the pptissdt property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getPPTISSDT() {
            return pptissdt;
        }

        /**
         * Sets the value of the pptissdt property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setPPTISSDT(XMLGregorianCalendar value) {
            this.pptissdt = value;
        }

        /**
         * Gets the value of the pptexpdt property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getPPTEXPDT() {
            return pptexpdt;
        }

        /**
         * Sets the value of the pptexpdt property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setPPTEXPDT(XMLGregorianCalendar value) {
            this.pptexpdt = value;
        }

        /**
         * Gets the value of the dadd2 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDADD2() {
            return dadd2;
        }

        /**
         * Sets the value of the dadd2 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDADD2(String value) {
            this.dadd2 = value;
        }

        /**
         * Gets the value of the dadd3 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDADD3() {
            return dadd3;
        }

        /**
         * Sets the value of the dadd3 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDADD3(String value) {
            this.dadd3 = value;
        }

        /**
         * Gets the value of the dpincode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDPINCODE() {
            return dpincode;
        }

        /**
         * Sets the value of the dpincode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDPINCODE(String value) {
            this.dpincode = value;
        }

        /**
         * Gets the value of the telephno property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTELEPHNO() {
            return telephno;
        }

        /**
         * Sets the value of the telephno property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTELEPHNO(String value) {
            this.telephno = value;
        }

        /**
         * Gets the value of the faxnumber property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFAXNUMBER() {
            return faxnumber;
        }

        /**
         * Sets the value of the faxnumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFAXNUMBER(String value) {
            this.faxnumber = value;
        }

        /**
         * Gets the value of the emailid property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEMAILID() {
            return emailid;
        }

        /**
         * Sets the value of the emailid property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEMAILID(String value) {
            this.emailid = value;
        }

        /**
         * Gets the value of the benefaddr1 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBENEFADDR1() {
            return benefaddr1;
        }

        /**
         * Sets the value of the benefaddr1 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBENEFADDR1(String value) {
            this.benefaddr1 = value;
        }

        /**
         * Gets the value of the addrs3 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getADDRS3() {
            return addrs3;
        }

        /**
         * Sets the value of the addrs3 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setADDRS3(String value) {
            this.addrs3 = value;
        }

        /**
         * Gets the value of the benefaddr2 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBENEFADDR2() {
            return benefaddr2;
        }

        /**
         * Sets the value of the benefaddr2 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBENEFADDR2(String value) {
            this.benefaddr2 = value;
        }

        /**
         * Gets the value of the dcntry property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDCNTRY() {
            return dcntry;
        }

        /**
         * Sets the value of the dcntry property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDCNTRY(String value) {
            this.dcntry = value;
        }

        /**
         * Gets the value of the pcntry property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPCNTRY() {
            return pcntry;
        }

        /**
         * Sets the value of the pcntry property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPCNTRY(String value) {
            this.pcntry = value;
        }

        /**
         * Gets the value of the resstatus property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRESSTATUS() {
            return resstatus;
        }

        /**
         * Sets the value of the resstatus property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRESSTATUS(String value) {
            this.resstatus = value;
        }

        /**
         * Gets the value of the custprefix1 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCUSTPREFIX1() {
            return custprefix1;
        }

        /**
         * Sets the value of the custprefix1 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCUSTPREFIX1(String value) {
            this.custprefix1 = value;
        }

        /**
         * Gets the value of the custprefix2 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCUSTPREFIX2() {
            return custprefix2;
        }

        /**
         * Sets the value of the custprefix2 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCUSTPREFIX2(String value) {
            this.custprefix2 = value;
        }

        /**
         * Gets the value of the mobnum property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMOBNUM() {
            return mobnum;
        }

        /**
         * Sets the value of the mobnum property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMOBNUM(String value) {
            this.mobnum = value;
        }

        /**
         * Gets the value of the custcommmode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCUSTCOMMMODE() {
            return custcommmode;
        }

        /**
         * Sets the value of the custcommmode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCUSTCOMMMODE(String value) {
            this.custcommmode = value;
        }

        /**
         * Gets the value of the lang property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLANG() {
            return lang;
        }

        /**
         * Sets the value of the lang property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLANG(String value) {
            this.lang = value;
        }

        /**
         * Gets the value of the guardian property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getGUARDIAN() {
            return guardian;
        }

        /**
         * Sets the value of the guardian property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setGUARDIAN(String value) {
            this.guardian = value;
        }

        /**
         * Gets the value of the sbmtageproof property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSBMTAGEPROOF() {
            return sbmtageproof;
        }

        /**
         * Sets the value of the sbmtageproof property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSBMTAGEPROOF(String value) {
            this.sbmtageproof = value;
        }

        /**
         * Gets the value of the minor property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMINOR() {
            return minor;
        }

        /**
         * Sets the value of the minor property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMINOR(String value) {
            this.minor = value;
        }

        /**
         * Gets the value of the kycstat property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getKYCSTAT() {
            return kycstat;
        }

        /**
         * Sets the value of the kycstat property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setKYCSTAT(String value) {
            this.kycstat = value;
        }

        /**
         * Gets the value of the sstaff property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSSTAFF() {
            return sstaff;
        }

        /**
         * Sets the value of the sstaff property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSSTAFF(String value) {
            this.sstaff = value;
        }

        /**
         * Gets the value of the kycrefno property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getKYCREFNO() {
            return kycrefno;
        }

        /**
         * Sets the value of the kycrefno property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setKYCREFNO(String value) {
            this.kycrefno = value;
        }

        /**
         * Gets the value of the samecorraddr property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSAMECORRADDR() {
            return samecorraddr;
        }

        /**
         * Sets the value of the samecorraddr property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSAMECORRADDR(String value) {
            this.samecorraddr = value;
        }

        /**
         * Gets the value of the dadd1 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDADD1() {
            return dadd1;
        }

        /**
         * Sets the value of the dadd1 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDADD1(String value) {
            this.dadd1 = value;
        }

        /**
         * Gets the value of the samepermaddr property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSAMEPERMADDR() {
            return samepermaddr;
        }

        /**
         * Sets the value of the samepermaddr property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSAMEPERMADDR(String value) {
            this.samepermaddr = value;
        }

        /**
         * Gets the value of the title property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTITLE() {
            return title;
        }

        /**
         * Sets the value of the title property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTITLE(String value) {
            this.title = value;
        }

        /**
         * Gets the value of the addrs4 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getADDRS4() {
            return addrs4;
        }

        /**
         * Sets the value of the addrs4 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setADDRS4(String value) {
            this.addrs4 = value;
        }

        /**
         * Gets the value of the dadd4 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDADD4() {
            return dadd4;
        }

        /**
         * Sets the value of the dadd4 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDADD4(String value) {
            this.dadd4 = value;
        }

        /**
         * Gets the value of the placeofbirth property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPLACEOFBIRTH() {
            return placeofbirth;
        }

        /**
         * Sets the value of the placeofbirth property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPLACEOFBIRTH(String value) {
            this.placeofbirth = value;
        }

        /**
         * Gets the value of the birthcountry property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBIRTHCOUNTRY() {
            return birthcountry;
        }

        /**
         * Sets the value of the birthcountry property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBIRTHCOUNTRY(String value) {
            this.birthcountry = value;
        }

        /**
         * Gets the value of the telisdnopersonal property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getTELISDNOPERSONAL() {
            return telisdnopersonal;
        }

        /**
         * Sets the value of the telisdnopersonal property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setTELISDNOPERSONAL(BigDecimal value) {
            this.telisdnopersonal = value;
        }

        /**
         * Gets the value of the mobisdno property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getMOBISDNO() {
            return mobisdno;
        }

        /**
         * Sets the value of the mobisdno property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setMOBISDNO(BigDecimal value) {
            this.mobisdno = value;
        }

        /**
         * Gets the value of the faxisdno property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getFAXISDNO() {
            return faxisdno;
        }

        /**
         * Sets the value of the faxisdno property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setFAXISDNO(BigDecimal value) {
            this.faxisdno = value;
        }

        /**
         * Gets the value of the usresstatus property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUSRESSTATUS() {
            return usresstatus;
        }

        /**
         * Sets the value of the usresstatus property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUSRESSTATUS(String value) {
            this.usresstatus = value;
        }

        /**
         * Gets the value of the paissued property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPAISSUED() {
            return paissued;
        }

        /**
         * Sets the value of the paissued property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPAISSUED(String value) {
            this.paissued = value;
        }

        /**
         * Gets the value of the paholdername property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPAHOLDERNAME() {
            return paholdername;
        }

        /**
         * Sets the value of the paholdername property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPAHOLDERNAME(String value) {
            this.paholdername = value;
        }

        /**
         * Gets the value of the paholdernationalty property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPAHOLDERNATIONALTY() {
            return paholdernationalty;
        }

        /**
         * Sets the value of the paholdernationalty property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPAHOLDERNATIONALTY(String value) {
            this.paholdernationalty = value;
        }

        /**
         * Gets the value of the paholderaddr property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPAHOLDERADDR() {
            return paholderaddr;
        }

        /**
         * Sets the value of the paholderaddr property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPAHOLDERADDR(String value) {
            this.paholderaddr = value;
        }

        /**
         * Gets the value of the paholderaddrcountry property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPAHOLDERADDRCOUNTRY() {
            return paholderaddrcountry;
        }

        /**
         * Sets the value of the paholderaddrcountry property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPAHOLDERADDRCOUNTRY(String value) {
            this.paholderaddrcountry = value;
        }

        /**
         * Gets the value of the paholdertelisd property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getPAHOLDERTELISD() {
            return paholdertelisd;
        }

        /**
         * Sets the value of the paholdertelisd property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setPAHOLDERTELISD(BigDecimal value) {
            this.paholdertelisd = value;
        }

        /**
         * Gets the value of the paholdertelno property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPAHOLDERTELNO() {
            return paholdertelno;
        }

        /**
         * Sets the value of the paholdertelno property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPAHOLDERTELNO(String value) {
            this.paholdertelno = value;
        }

        /**
         * Gets the value of the vstusprev property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVSTUSPREV() {
            return vstusprev;
        }

        /**
         * Sets the value of the vstusprev property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVSTUSPREV(String value) {
            this.vstusprev = value;
        }

        /**
         * Gets the value of the hometelno property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getHOMETELNO() {
            return hometelno;
        }

        /**
         * Sets the value of the hometelno property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setHOMETELNO(String value) {
            this.hometelno = value;
        }

        /**
         * Gets the value of the hometelisd property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getHOMETELISD() {
            return hometelisd;
        }

        /**
         * Sets the value of the hometelisd property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setHOMETELISD(BigDecimal value) {
            this.hometelisd = value;
        }

        /**
         * Gets the value of the ppincode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPPINCODE() {
            return ppincode;
        }

        /**
         * Sets the value of the ppincode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPPINCODE(String value) {
            this.ppincode = value;
        }

        /**
         * Gets the value of the prefcntactdate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getPREFCNTACTDATE() {
            return prefcntactdate;
        }

        /**
         * Sets the value of the prefcntactdate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setPREFCNTACTDATE(XMLGregorianCalendar value) {
            this.prefcntactdate = value;
        }

        /**
         * Gets the value of the prefcntacttime property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getPREFCNTACTTIME() {
            return prefcntacttime;
        }

        /**
         * Sets the value of the prefcntacttime property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setPREFCNTACTTIME(BigDecimal value) {
            this.prefcntacttime = value;
        }

        /**
         * Gets the value of the custdomestic property.
         * 
         * @return
         *     possible object is
         *     {@link CustomerModifyIOType.Custpersonal.Custdomestic }
         *     
         */
        public CustomerModifyIOType.Custpersonal.Custdomestic getCustdomestic() {
            return custdomestic;
        }

        /**
         * Sets the value of the custdomestic property.
         * 
         * @param value
         *     allowed object is
         *     {@link CustomerModifyIOType.Custpersonal.Custdomestic }
         *     
         */
        public void setCustdomestic(CustomerModifyIOType.Custpersonal.Custdomestic value) {
            this.custdomestic = value;
        }

        /**
         * Gets the value of the custprof property.
         * 
         * @return
         *     possible object is
         *     {@link CustomerModifyIOType.Custpersonal.Custprof }
         *     
         */
        public CustomerModifyIOType.Custpersonal.Custprof getCustprof() {
            return custprof;
        }

        /**
         * Sets the value of the custprof property.
         * 
         * @param value
         *     allowed object is
         *     {@link CustomerModifyIOType.Custpersonal.Custprof }
         *     
         */
        public void setCustprof(CustomerModifyIOType.Custpersonal.Custprof value) {
            this.custprof = value;
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
         *         &lt;element name="EDUSTAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="MARITALSTAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="SPNAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="SPEMPSTATUS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="DEPCHILD" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *         &lt;element name="DEPOTH" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *         &lt;element name="ACCOMODATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="MOTHERMAIDN_NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "edustat",
            "maritalstat",
            "spname",
            "spempstatus",
            "depchild",
            "depoth",
            "accomodate",
            "mothermaidnname"
        })
        public static class Custdomestic {

            @XmlElement(name = "EDUSTAT")
            protected String edustat;
            @XmlElement(name = "MARITALSTAT")
            protected String maritalstat;
            @XmlElement(name = "SPNAME")
            protected String spname;
            @XmlElement(name = "SPEMPSTATUS")
            protected String spempstatus;
            @XmlElement(name = "DEPCHILD")
            protected BigDecimal depchild;
            @XmlElement(name = "DEPOTH")
            protected BigDecimal depoth;
            @XmlElement(name = "ACCOMODATE")
            protected String accomodate;
            @XmlElement(name = "MOTHERMAIDN_NAME")
            protected String mothermaidnname;

            /**
             * Gets the value of the edustat property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getEDUSTAT() {
                return edustat;
            }

            /**
             * Sets the value of the edustat property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setEDUSTAT(String value) {
                this.edustat = value;
            }

            /**
             * Gets the value of the maritalstat property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMARITALSTAT() {
                return maritalstat;
            }

            /**
             * Sets the value of the maritalstat property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMARITALSTAT(String value) {
                this.maritalstat = value;
            }

            /**
             * Gets the value of the spname property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSPNAME() {
                return spname;
            }

            /**
             * Sets the value of the spname property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSPNAME(String value) {
                this.spname = value;
            }

            /**
             * Gets the value of the spempstatus property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSPEMPSTATUS() {
                return spempstatus;
            }

            /**
             * Sets the value of the spempstatus property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSPEMPSTATUS(String value) {
                this.spempstatus = value;
            }

            /**
             * Gets the value of the depchild property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getDEPCHILD() {
                return depchild;
            }

            /**
             * Sets the value of the depchild property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setDEPCHILD(BigDecimal value) {
                this.depchild = value;
            }

            /**
             * Gets the value of the depoth property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getDEPOTH() {
                return depoth;
            }

            /**
             * Sets the value of the depoth property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setDEPOTH(BigDecimal value) {
                this.depoth = value;
            }

            /**
             * Gets the value of the accomodate property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getACCOMODATE() {
                return accomodate;
            }

            /**
             * Sets the value of the accomodate property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setACCOMODATE(String value) {
                this.accomodate = value;
            }

            /**
             * Gets the value of the mothermaidnname property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMOTHERMAIDNNAME() {
                return mothermaidnname;
            }

            /**
             * Sets the value of the mothermaidnname property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMOTHERMAIDNNAME(String value) {
                this.mothermaidnname = value;
            }

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
         *         &lt;element name="EMPSTAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="EMPTENURE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *         &lt;element name="RETIREAGE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *         &lt;element name="PREVDESIG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="PREVEMP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="CURRDESIG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="CURREMP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="ADD1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="ADD2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="ADD3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="TEL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="AMTCCY1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="TELEX" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="FAX" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="EMAIL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="SALARY" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *         &lt;element name="OTHER1" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *         &lt;element name="RENT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *         &lt;element name="INSURANCE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *         &lt;element name="LOANPMNT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *         &lt;element name="OTHEXP" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *         &lt;element name="HOUSEVAL" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *         &lt;element name="CRCARD" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *         &lt;element name="CNTY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "empstat",
            "emptenure",
            "retireage",
            "prevdesig",
            "prevemp",
            "currdesig",
            "curremp",
            "add1",
            "add2",
            "add3",
            "tel",
            "amtccy1",
            "telex",
            "fax",
            "email",
            "salary",
            "other1",
            "rent",
            "insurance",
            "loanpmnt",
            "othexp",
            "houseval",
            "crcard",
            "cnty"
        })
        public static class Custprof {

            @XmlElement(name = "EMPSTAT")
            protected String empstat;
            @XmlElement(name = "EMPTENURE")
            protected BigDecimal emptenure;
            @XmlElement(name = "RETIREAGE")
            protected BigDecimal retireage;
            @XmlElement(name = "PREVDESIG")
            protected String prevdesig;
            @XmlElement(name = "PREVEMP")
            protected String prevemp;
            @XmlElement(name = "CURRDESIG")
            protected String currdesig;
            @XmlElement(name = "CURREMP")
            protected String curremp;
            @XmlElement(name = "ADD1")
            protected String add1;
            @XmlElement(name = "ADD2")
            protected String add2;
            @XmlElement(name = "ADD3")
            protected String add3;
            @XmlElement(name = "TEL")
            protected String tel;
            @XmlElement(name = "AMTCCY1")
            protected String amtccy1;
            @XmlElement(name = "TELEX")
            protected String telex;
            @XmlElement(name = "FAX")
            protected String fax;
            @XmlElement(name = "EMAIL")
            protected String email;
            @XmlElement(name = "SALARY")
            protected BigDecimal salary;
            @XmlElement(name = "OTHER1")
            protected BigDecimal other1;
            @XmlElement(name = "RENT")
            protected BigDecimal rent;
            @XmlElement(name = "INSURANCE")
            protected BigDecimal insurance;
            @XmlElement(name = "LOANPMNT")
            protected BigDecimal loanpmnt;
            @XmlElement(name = "OTHEXP")
            protected BigDecimal othexp;
            @XmlElement(name = "HOUSEVAL")
            protected BigDecimal houseval;
            @XmlElement(name = "CRCARD")
            protected BigDecimal crcard;
            @XmlElement(name = "CNTY")
            protected String cnty;

            /**
             * Gets the value of the empstat property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getEMPSTAT() {
                return empstat;
            }

            /**
             * Sets the value of the empstat property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setEMPSTAT(String value) {
                this.empstat = value;
            }

            /**
             * Gets the value of the emptenure property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getEMPTENURE() {
                return emptenure;
            }

            /**
             * Sets the value of the emptenure property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setEMPTENURE(BigDecimal value) {
                this.emptenure = value;
            }

            /**
             * Gets the value of the retireage property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getRETIREAGE() {
                return retireage;
            }

            /**
             * Sets the value of the retireage property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setRETIREAGE(BigDecimal value) {
                this.retireage = value;
            }

            /**
             * Gets the value of the prevdesig property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPREVDESIG() {
                return prevdesig;
            }

            /**
             * Sets the value of the prevdesig property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPREVDESIG(String value) {
                this.prevdesig = value;
            }

            /**
             * Gets the value of the prevemp property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPREVEMP() {
                return prevemp;
            }

            /**
             * Sets the value of the prevemp property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPREVEMP(String value) {
                this.prevemp = value;
            }

            /**
             * Gets the value of the currdesig property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCURRDESIG() {
                return currdesig;
            }

            /**
             * Sets the value of the currdesig property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCURRDESIG(String value) {
                this.currdesig = value;
            }

            /**
             * Gets the value of the curremp property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCURREMP() {
                return curremp;
            }

            /**
             * Sets the value of the curremp property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCURREMP(String value) {
                this.curremp = value;
            }

            /**
             * Gets the value of the add1 property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getADD1() {
                return add1;
            }

            /**
             * Sets the value of the add1 property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setADD1(String value) {
                this.add1 = value;
            }

            /**
             * Gets the value of the add2 property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getADD2() {
                return add2;
            }

            /**
             * Sets the value of the add2 property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setADD2(String value) {
                this.add2 = value;
            }

            /**
             * Gets the value of the add3 property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getADD3() {
                return add3;
            }

            /**
             * Sets the value of the add3 property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setADD3(String value) {
                this.add3 = value;
            }

            /**
             * Gets the value of the tel property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTEL() {
                return tel;
            }

            /**
             * Sets the value of the tel property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTEL(String value) {
                this.tel = value;
            }

            /**
             * Gets the value of the amtccy1 property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAMTCCY1() {
                return amtccy1;
            }

            /**
             * Sets the value of the amtccy1 property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAMTCCY1(String value) {
                this.amtccy1 = value;
            }

            /**
             * Gets the value of the telex property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTELEX() {
                return telex;
            }

            /**
             * Sets the value of the telex property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTELEX(String value) {
                this.telex = value;
            }

            /**
             * Gets the value of the fax property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFAX() {
                return fax;
            }

            /**
             * Sets the value of the fax property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFAX(String value) {
                this.fax = value;
            }

            /**
             * Gets the value of the email property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getEMAIL() {
                return email;
            }

            /**
             * Sets the value of the email property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setEMAIL(String value) {
                this.email = value;
            }

            /**
             * Gets the value of the salary property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getSALARY() {
                return salary;
            }

            /**
             * Sets the value of the salary property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setSALARY(BigDecimal value) {
                this.salary = value;
            }

            /**
             * Gets the value of the other1 property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getOTHER1() {
                return other1;
            }

            /**
             * Sets the value of the other1 property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setOTHER1(BigDecimal value) {
                this.other1 = value;
            }

            /**
             * Gets the value of the rent property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getRENT() {
                return rent;
            }

            /**
             * Sets the value of the rent property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setRENT(BigDecimal value) {
                this.rent = value;
            }

            /**
             * Gets the value of the insurance property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getINSURANCE() {
                return insurance;
            }

            /**
             * Sets the value of the insurance property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setINSURANCE(BigDecimal value) {
                this.insurance = value;
            }

            /**
             * Gets the value of the loanpmnt property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getLOANPMNT() {
                return loanpmnt;
            }

            /**
             * Sets the value of the loanpmnt property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setLOANPMNT(BigDecimal value) {
                this.loanpmnt = value;
            }

            /**
             * Gets the value of the othexp property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getOTHEXP() {
                return othexp;
            }

            /**
             * Sets the value of the othexp property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setOTHEXP(BigDecimal value) {
                this.othexp = value;
            }

            /**
             * Gets the value of the houseval property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getHOUSEVAL() {
                return houseval;
            }

            /**
             * Sets the value of the houseval property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setHOUSEVAL(BigDecimal value) {
                this.houseval = value;
            }

            /**
             * Gets the value of the crcard property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getCRCARD() {
                return crcard;
            }

            /**
             * Sets the value of the crcard property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setCRCARD(BigDecimal value) {
                this.crcard = value;
            }

            /**
             * Gets the value of the cnty property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCNTY() {
                return cnty;
            }

            /**
             * Sets the value of the cnty property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCNTY(String value) {
                this.cnty = value;
            }

        }

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
     *         &lt;element name="CUSTCCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="CUSTSEGCD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="CUSTSEGSTATUS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="NETWORTH" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="NETWORTHCCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="CUSTOMER_NO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "custccy",
        "custsegcd",
        "custsegstatus",
        "networth",
        "networthccy",
        "customerno"
    })
    public static class Custsegment {

        @XmlElement(name = "CUSTCCY")
        protected String custccy;
        @XmlElement(name = "CUSTSEGCD")
        protected String custsegcd;
        @XmlElement(name = "CUSTSEGSTATUS")
        protected String custsegstatus;
        @XmlElement(name = "NETWORTH")
        protected BigDecimal networth;
        @XmlElement(name = "NETWORTHCCY")
        protected String networthccy;
        @XmlElement(name = "CUSTOMER_NO")
        protected String customerno;

        /**
         * Gets the value of the custccy property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCUSTCCY() {
            return custccy;
        }

        /**
         * Sets the value of the custccy property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCUSTCCY(String value) {
            this.custccy = value;
        }

        /**
         * Gets the value of the custsegcd property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCUSTSEGCD() {
            return custsegcd;
        }

        /**
         * Sets the value of the custsegcd property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCUSTSEGCD(String value) {
            this.custsegcd = value;
        }

        /**
         * Gets the value of the custsegstatus property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCUSTSEGSTATUS() {
            return custsegstatus;
        }

        /**
         * Sets the value of the custsegstatus property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCUSTSEGSTATUS(String value) {
            this.custsegstatus = value;
        }

        /**
         * Gets the value of the networth property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getNETWORTH() {
            return networth;
        }

        /**
         * Sets the value of the networth property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setNETWORTH(BigDecimal value) {
            this.networth = value;
        }

        /**
         * Gets the value of the networthccy property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNETWORTHCCY() {
            return networthccy;
        }

        /**
         * Sets the value of the networthccy property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNETWORTHCCY(String value) {
            this.networthccy = value;
        }

        /**
         * Gets the value of the customerno property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCUSTOMERNO() {
            return customerno;
        }

        /**
         * Sets the value of the customerno property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCUSTOMERNO(String value) {
            this.customerno = value;
        }

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
     *         &lt;element name="SHHOLDID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="SHHOLDPCT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
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
        "shholdid",
        "shholdpct"
    })
    public static class Custshhold {

        @XmlElement(name = "SHHOLDID")
        protected String shholdid;
        @XmlElement(name = "SHHOLDPCT")
        protected BigDecimal shholdpct;

        /**
         * Gets the value of the shholdid property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSHHOLDID() {
            return shholdid;
        }

        /**
         * Sets the value of the shholdid property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSHHOLDID(String value) {
            this.shholdid = value;
        }

        /**
         * Gets the value of the shholdpct property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getSHHOLDPCT() {
            return shholdpct;
        }

        /**
         * Sets the value of the shholdpct property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setSHHOLDPCT(BigDecimal value) {
            this.shholdpct = value;
        }

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
     *         &lt;element name="CUSTOMER_NO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="REMARK1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="REMARK2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="REMARK3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="REMARK4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="REMARK5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="REMARK6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="REMARK7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="REMARK8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="REMARK9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="REMARK10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "customerno",
        "remark1",
        "remark2",
        "remark3",
        "remark4",
        "remark5",
        "remark6",
        "remark7",
        "remark8",
        "remark9",
        "remark10"
    })
    public static class DoctypeRemarks {

        @XmlElement(name = "CUSTOMER_NO")
        protected String customerno;
        @XmlElement(name = "REMARK1")
        protected String remark1;
        @XmlElement(name = "REMARK2")
        protected String remark2;
        @XmlElement(name = "REMARK3")
        protected String remark3;
        @XmlElement(name = "REMARK4")
        protected String remark4;
        @XmlElement(name = "REMARK5")
        protected String remark5;
        @XmlElement(name = "REMARK6")
        protected String remark6;
        @XmlElement(name = "REMARK7")
        protected String remark7;
        @XmlElement(name = "REMARK8")
        protected String remark8;
        @XmlElement(name = "REMARK9")
        protected String remark9;
        @XmlElement(name = "REMARK10")
        protected String remark10;

        /**
         * Gets the value of the customerno property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCUSTOMERNO() {
            return customerno;
        }

        /**
         * Sets the value of the customerno property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCUSTOMERNO(String value) {
            this.customerno = value;
        }

        /**
         * Gets the value of the remark1 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getREMARK1() {
            return remark1;
        }

        /**
         * Sets the value of the remark1 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setREMARK1(String value) {
            this.remark1 = value;
        }

        /**
         * Gets the value of the remark2 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getREMARK2() {
            return remark2;
        }

        /**
         * Sets the value of the remark2 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setREMARK2(String value) {
            this.remark2 = value;
        }

        /**
         * Gets the value of the remark3 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getREMARK3() {
            return remark3;
        }

        /**
         * Sets the value of the remark3 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setREMARK3(String value) {
            this.remark3 = value;
        }

        /**
         * Gets the value of the remark4 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getREMARK4() {
            return remark4;
        }

        /**
         * Sets the value of the remark4 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setREMARK4(String value) {
            this.remark4 = value;
        }

        /**
         * Gets the value of the remark5 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getREMARK5() {
            return remark5;
        }

        /**
         * Sets the value of the remark5 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setREMARK5(String value) {
            this.remark5 = value;
        }

        /**
         * Gets the value of the remark6 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getREMARK6() {
            return remark6;
        }

        /**
         * Sets the value of the remark6 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setREMARK6(String value) {
            this.remark6 = value;
        }

        /**
         * Gets the value of the remark7 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getREMARK7() {
            return remark7;
        }

        /**
         * Sets the value of the remark7 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setREMARK7(String value) {
            this.remark7 = value;
        }

        /**
         * Gets the value of the remark8 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getREMARK8() {
            return remark8;
        }

        /**
         * Sets the value of the remark8 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setREMARK8(String value) {
            this.remark8 = value;
        }

        /**
         * Gets the value of the remark9 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getREMARK9() {
            return remark9;
        }

        /**
         * Sets the value of the remark9 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setREMARK9(String value) {
            this.remark9 = value;
        }

        /**
         * Gets the value of the remark10 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getREMARK10() {
            return remark10;
        }

        /**
         * Sets the value of the remark10 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setREMARK10(String value) {
            this.remark10 = value;
        }

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
     *         &lt;element name="CUSTOMER_NO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="SNO" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="DOCUMENT_TYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="Iddetail" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="CUSTOMER_NO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="SNO" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                   &lt;element name="DOCUMENT_TYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="SERIES" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="DOC_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="DATE_OF_ISSUE" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *                   &lt;element name="DATE_OF_EXPIRY" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *                   &lt;element name="ISSUING_AUTHORITY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="PLACE_OF_ISSUE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "customerno",
        "sno",
        "documenttype",
        "iddetail"
    })
    public static class IdDetMain {

        @XmlElement(name = "CUSTOMER_NO")
        protected String customerno;
        @XmlElement(name = "SNO")
        protected BigDecimal sno;
        @XmlElement(name = "DOCUMENT_TYPE")
        protected String documenttype;
        @XmlElement(name = "Iddetail")
        protected CustomerModifyIOType.IdDetMain.Iddetail iddetail;

        /**
         * Gets the value of the customerno property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCUSTOMERNO() {
            return customerno;
        }

        /**
         * Sets the value of the customerno property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCUSTOMERNO(String value) {
            this.customerno = value;
        }

        /**
         * Gets the value of the sno property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getSNO() {
            return sno;
        }

        /**
         * Sets the value of the sno property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setSNO(BigDecimal value) {
            this.sno = value;
        }

        /**
         * Gets the value of the documenttype property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDOCUMENTTYPE() {
            return documenttype;
        }

        /**
         * Sets the value of the documenttype property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDOCUMENTTYPE(String value) {
            this.documenttype = value;
        }

        /**
         * Gets the value of the iddetail property.
         * 
         * @return
         *     possible object is
         *     {@link CustomerModifyIOType.IdDetMain.Iddetail }
         *     
         */
        public CustomerModifyIOType.IdDetMain.Iddetail getIddetail() {
            return iddetail;
        }

        /**
         * Sets the value of the iddetail property.
         * 
         * @param value
         *     allowed object is
         *     {@link CustomerModifyIOType.IdDetMain.Iddetail }
         *     
         */
        public void setIddetail(CustomerModifyIOType.IdDetMain.Iddetail value) {
            this.iddetail = value;
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
         *         &lt;element name="CUSTOMER_NO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="SNO" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *         &lt;element name="DOCUMENT_TYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="SERIES" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="DOC_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="DATE_OF_ISSUE" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
         *         &lt;element name="DATE_OF_EXPIRY" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
         *         &lt;element name="ISSUING_AUTHORITY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="PLACE_OF_ISSUE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "customerno",
            "sno",
            "documenttype",
            "series",
            "docid",
            "dateofissue",
            "dateofexpiry",
            "issuingauthority",
            "placeofissue",
            "name"
        })
        public static class Iddetail {

            @XmlElement(name = "CUSTOMER_NO")
            protected String customerno;
            @XmlElement(name = "SNO")
            protected BigDecimal sno;
            @XmlElement(name = "DOCUMENT_TYPE")
            protected String documenttype;
            @XmlElement(name = "SERIES")
            protected String series;
            @XmlElement(name = "DOC_ID")
            protected String docid;
            @XmlElement(name = "DATE_OF_ISSUE")
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar dateofissue;
            @XmlElement(name = "DATE_OF_EXPIRY")
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar dateofexpiry;
            @XmlElement(name = "ISSUING_AUTHORITY")
            protected String issuingauthority;
            @XmlElement(name = "PLACE_OF_ISSUE")
            protected String placeofissue;
            @XmlElement(name = "NAME")
            protected String name;

            /**
             * Gets the value of the customerno property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCUSTOMERNO() {
                return customerno;
            }

            /**
             * Sets the value of the customerno property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCUSTOMERNO(String value) {
                this.customerno = value;
            }

            /**
             * Gets the value of the sno property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getSNO() {
                return sno;
            }

            /**
             * Sets the value of the sno property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setSNO(BigDecimal value) {
                this.sno = value;
            }

            /**
             * Gets the value of the documenttype property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDOCUMENTTYPE() {
                return documenttype;
            }

            /**
             * Sets the value of the documenttype property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDOCUMENTTYPE(String value) {
                this.documenttype = value;
            }

            /**
             * Gets the value of the series property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSERIES() {
                return series;
            }

            /**
             * Sets the value of the series property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSERIES(String value) {
                this.series = value;
            }

            /**
             * Gets the value of the docid property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDOCID() {
                return docid;
            }

            /**
             * Sets the value of the docid property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDOCID(String value) {
                this.docid = value;
            }

            /**
             * Gets the value of the dateofissue property.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getDATEOFISSUE() {
                return dateofissue;
            }

            /**
             * Sets the value of the dateofissue property.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setDATEOFISSUE(XMLGregorianCalendar value) {
                this.dateofissue = value;
            }

            /**
             * Gets the value of the dateofexpiry property.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getDATEOFEXPIRY() {
                return dateofexpiry;
            }

            /**
             * Sets the value of the dateofexpiry property.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setDATEOFEXPIRY(XMLGregorianCalendar value) {
                this.dateofexpiry = value;
            }

            /**
             * Gets the value of the issuingauthority property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getISSUINGAUTHORITY() {
                return issuingauthority;
            }

            /**
             * Sets the value of the issuingauthority property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setISSUINGAUTHORITY(String value) {
                this.issuingauthority = value;
            }

            /**
             * Gets the value of the placeofissue property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPLACEOFISSUE() {
                return placeofissue;
            }

            /**
             * Sets the value of the placeofissue property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPLACEOFISSUE(String value) {
                this.placeofissue = value;
            }

            /**
             * Gets the value of the name property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNAME() {
                return name;
            }

            /**
             * Sets the value of the name property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNAME(String value) {
                this.name = value;
            }

        }

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
     *         &lt;element name="CUSTOMER_NO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "customerno"
    })
    public static class IdMaster {

        @XmlElement(name = "CUSTOMER_NO")
        protected String customerno;

        /**
         * Gets the value of the customerno property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCUSTOMERNO() {
            return customerno;
        }

        /**
         * Sets the value of the customerno property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCUSTOMERNO(String value) {
            this.customerno = value;
        }

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
     *         &lt;element name="PARTY_ID" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="PARTY_RATIO" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="PARTYNAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "partyid",
        "partyratio",
        "partyname"
    })
    public static class Jointventure {

        @XmlElement(name = "PARTY_ID", required = true)
        protected String partyid;
        @XmlElement(name = "PARTY_RATIO")
        protected BigDecimal partyratio;
        @XmlElement(name = "PARTYNAME")
        protected String partyname;

        /**
         * Gets the value of the partyid property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPARTYID() {
            return partyid;
        }

        /**
         * Sets the value of the partyid property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPARTYID(String value) {
            this.partyid = value;
        }

        /**
         * Gets the value of the partyratio property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getPARTYRATIO() {
            return partyratio;
        }

        /**
         * Sets the value of the partyratio property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setPARTYRATIO(BigDecimal value) {
            this.partyratio = value;
        }

        /**
         * Gets the value of the partyname property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPARTYNAME() {
            return partyname;
        }

        /**
         * Sets the value of the partyname property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPARTYNAME(String value) {
            this.partyname = value;
        }

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
     *         &lt;element name="VRFD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="LINKEDACCNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="LINKEDACCIBAN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="LINKEDACCBIC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="LINKEDACCBLZ" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "vrfd",
        "linkedaccno",
        "linkedacciban",
        "linkedaccbic",
        "linkedaccblz"
    })
    public static class Linkedac {

        @XmlElement(name = "VRFD")
        protected String vrfd;
        @XmlElement(name = "LINKEDACCNO")
        protected String linkedaccno;
        @XmlElement(name = "LINKEDACCIBAN")
        protected String linkedacciban;
        @XmlElement(name = "LINKEDACCBIC")
        protected String linkedaccbic;
        @XmlElement(name = "LINKEDACCBLZ")
        protected String linkedaccblz;

        /**
         * Gets the value of the vrfd property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVRFD() {
            return vrfd;
        }

        /**
         * Sets the value of the vrfd property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVRFD(String value) {
            this.vrfd = value;
        }

        /**
         * Gets the value of the linkedaccno property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLINKEDACCNO() {
            return linkedaccno;
        }

        /**
         * Sets the value of the linkedaccno property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLINKEDACCNO(String value) {
            this.linkedaccno = value;
        }

        /**
         * Gets the value of the linkedacciban property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLINKEDACCIBAN() {
            return linkedacciban;
        }

        /**
         * Sets the value of the linkedacciban property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLINKEDACCIBAN(String value) {
            this.linkedacciban = value;
        }

        /**
         * Gets the value of the linkedaccbic property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLINKEDACCBIC() {
            return linkedaccbic;
        }

        /**
         * Sets the value of the linkedaccbic property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLINKEDACCBIC(String value) {
            this.linkedaccbic = value;
        }

        /**
         * Gets the value of the linkedaccblz property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLINKEDACCBLZ() {
            return linkedaccblz;
        }

        /**
         * Sets the value of the linkedaccblz property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLINKEDACCBLZ(String value) {
            this.linkedaccblz = value;
        }

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
     *         &lt;element name="MFI_CUST_TYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="POVERTY_STATUS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="LITERACY_OF_CLIENT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="BUSINESS_ACTIVITY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="BLACKLISTED" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="BLACKLIST_COUNT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="PHYSICALLY_CHALLENGED" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="Chklist" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="VERIFIED" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "mficusttype",
        "povertystatus",
        "literacyofclient",
        "businessactivity",
        "blacklisted",
        "blacklistcount",
        "physicallychallenged",
        "chklist"
    })
    public static class Mfi1 {

        @XmlElement(name = "MFI_CUST_TYPE")
        protected String mficusttype;
        @XmlElement(name = "POVERTY_STATUS")
        protected String povertystatus;
        @XmlElement(name = "LITERACY_OF_CLIENT")
        protected String literacyofclient;
        @XmlElement(name = "BUSINESS_ACTIVITY")
        protected String businessactivity;
        @XmlElement(name = "BLACKLISTED")
        protected String blacklisted;
        @XmlElement(name = "BLACKLIST_COUNT")
        protected String blacklistcount;
        @XmlElement(name = "PHYSICALLY_CHALLENGED")
        protected String physicallychallenged;
        @XmlElement(name = "Chklist")
        protected List<CustomerModifyIOType.Mfi1 .Chklist> chklist;

        /**
         * Gets the value of the mficusttype property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMFICUSTTYPE() {
            return mficusttype;
        }

        /**
         * Sets the value of the mficusttype property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMFICUSTTYPE(String value) {
            this.mficusttype = value;
        }

        /**
         * Gets the value of the povertystatus property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPOVERTYSTATUS() {
            return povertystatus;
        }

        /**
         * Sets the value of the povertystatus property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPOVERTYSTATUS(String value) {
            this.povertystatus = value;
        }

        /**
         * Gets the value of the literacyofclient property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLITERACYOFCLIENT() {
            return literacyofclient;
        }

        /**
         * Sets the value of the literacyofclient property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLITERACYOFCLIENT(String value) {
            this.literacyofclient = value;
        }

        /**
         * Gets the value of the businessactivity property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBUSINESSACTIVITY() {
            return businessactivity;
        }

        /**
         * Sets the value of the businessactivity property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBUSINESSACTIVITY(String value) {
            this.businessactivity = value;
        }

        /**
         * Gets the value of the blacklisted property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBLACKLISTED() {
            return blacklisted;
        }

        /**
         * Sets the value of the blacklisted property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBLACKLISTED(String value) {
            this.blacklisted = value;
        }

        /**
         * Gets the value of the blacklistcount property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBLACKLISTCOUNT() {
            return blacklistcount;
        }

        /**
         * Sets the value of the blacklistcount property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBLACKLISTCOUNT(String value) {
            this.blacklistcount = value;
        }

        /**
         * Gets the value of the physicallychallenged property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPHYSICALLYCHALLENGED() {
            return physicallychallenged;
        }

        /**
         * Sets the value of the physicallychallenged property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPHYSICALLYCHALLENGED(String value) {
            this.physicallychallenged = value;
        }

        /**
         * Gets the value of the chklist property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the chklist property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getChklist().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CustomerModifyIOType.Mfi1 .Chklist }
         * 
         * 
         */
        public List<CustomerModifyIOType.Mfi1 .Chklist> getChklist() {
            if (chklist == null) {
                chklist = new ArrayList<CustomerModifyIOType.Mfi1 .Chklist>();
            }
            return this.chklist;
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
         *         &lt;element name="VERIFIED" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "verified"
        })
        public static class Chklist {

            @XmlElement(name = "VERIFIED")
            protected String verified;

            /**
             * Gets the value of the verified property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getVERIFIED() {
                return verified;
            }

            /**
             * Sets the value of the verified property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setVERIFIED(String value) {
                this.verified = value;
            }

        }

    }

}
