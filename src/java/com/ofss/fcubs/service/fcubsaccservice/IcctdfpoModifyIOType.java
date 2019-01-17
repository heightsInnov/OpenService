
package com.ofss.fcubs.service.fcubsaccservice;

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
 * <p>Java class for Icctdfpo-Modify-IO-Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Icctdfpo-Modify-IO-Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BRN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CHILDTDBRN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CHILDTDACC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CHILDTDCCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TDAMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Tddetailsfpo" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="CCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="DFTFROM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="CUSTNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ACCLS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="REFNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="TDAMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="TDSTAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ACOPENDATE" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                   &lt;element name="PACCL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="Childintdetails" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="CHGBOOKACCBRN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="CHGBOOKACC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="CHGSTARTDT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                             &lt;element name="CALCACC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="BOOKACC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="HASIS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="INTSTARTDT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                             &lt;element name="BOOKACCBRN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="DRCRADV" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="ACCLS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="CUSTNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Childintprodmap" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="INTPROD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="WAIVEPROD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="GENUDECHNGADV" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="PRODMAPSTAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="UDECCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="ILPRD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="DISPTYP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="CONTVARROLL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="Childinteffdtmap" maxOccurs="unbounded" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="PRD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                 &lt;element name="UDEEFFDT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                                                 &lt;element name="EFFDTMAPSTAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                 &lt;element name="Childintsde" maxOccurs="unbounded" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="PRD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                           &lt;element name="UDEEFFDT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                                                           &lt;element name="UDEID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                           &lt;element name="UDEVALUE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                                                           &lt;element name="RATECODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                           &lt;element name="TDRATECODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                           &lt;element name="UDEVARIANCE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                                                         &lt;/sequence>
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
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
 *                   &lt;element name="Childinttddetails" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="AUTOROLL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="PMNTCCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="RDAMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                             &lt;element name="PMNTDT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                             &lt;element name="CLONMAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="MOVINTUNCLM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="MOVPRIUNCLM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="MATDT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                             &lt;element name="LIQDACC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="ROLLTYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="ROLLAMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                             &lt;element name="LIQDBRN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="NEXTMATDT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                             &lt;element name="RDACC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="MOVETOUNCLM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="FUNDONOVD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="REFREDAY" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                             &lt;element name="REFREMTH" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                             &lt;element name="REFREYEAR" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                             &lt;element name="PAYACC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="PAYBRN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="AUTOPAY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="INTSTDT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                             &lt;element name="DEPTENOR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="COMPTDAMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                             &lt;element name="INTRATE_CUMAMT_ROLL_REQD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="ROLLTENORPREF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="DEPTENORDAY" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                             &lt;element name="DEPTENORMONTH" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                             &lt;element name="DEPTENORYEAR" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                             &lt;element name="ROLLTENORDAYS" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                             &lt;element name="ROLLTENORMONTHS" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                             &lt;element name="ROLLTENORYEARS" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                             &lt;element name="DEPTENORPREF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Childtdpayoutdetails" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="CCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="PAYOUTTYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="BANKCODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="OFFBRN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="OFFACC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="OFFCCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="PERCENTAGE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                                       &lt;element name="REDMAMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                                       &lt;element name="BENFNAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="BENFADD1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="BENFADD2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="OTHERDETS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="NARRATIVE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="XRATE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                                       &lt;element name="REFNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="SEQNO" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="Bcpayoutspo" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="BCSPOSTAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="CCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="REFNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="SCODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="MICRNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="TRNDT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                                       &lt;element name="BANKCODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="CHQAMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                                       &lt;element name="CHQCCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="CHQDATE" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                                       &lt;element name="CHQPERCENT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                                       &lt;element name="XRATE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                                       &lt;element name="PAYBRN_F" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="BENFNAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="BENFADD1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="BENFADD2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="OTHERDETS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="NARRATIVE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="COUNTRYCODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="Pcpayoutspo" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="PCSPOSTAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="CCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="PCBANKCODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="PCOFFSETBRN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="PCOFFSETACC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="PCOFFSETCCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="PCPERCENTAGE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                                       &lt;element name="BENFNAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="BENFADD1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="OTHERDETS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="NARRATIVE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="XRATE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                                       &lt;element name="REFNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
 *         &lt;element name="Bcpayout" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="BANKCODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="CHQ_AMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="CHQ_CCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="CHQ_DATE" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                   &lt;element name="CHQ_PERCENT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="BENFNAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="BENFADD1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="OTHERDETS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="NARRATIVE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="XRATE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="REF_NO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="BCSTAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="PAYBRN_F" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Pcpayout" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="CCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="PCOFFSET_BRN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="PCOFFSET_CCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="PCPERCENTAGE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="BENFNAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="BENFADD1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="OTHERDETS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="NARRATIVE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="XRATE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="CUSTBANKCODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="CUSTACCNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="PCCLGBRN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="TXNCCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="TXNAMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="REFNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="PCBANKCODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="PCOFFSET_ACC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "Icctdfpo-Modify-IO-Type", propOrder = {
    "brn",
    "acc",
    "ccy",
    "childtdbrn",
    "childtdacc",
    "childtdccy",
    "tdamt",
    "tddetailsfpo",
    "bcpayout",
    "pcpayout"
})
public class IcctdfpoModifyIOType {

    @XmlElement(name = "BRN")
    protected String brn;
    @XmlElement(name = "ACC")
    protected String acc;
    @XmlElement(name = "CCY")
    protected String ccy;
    @XmlElement(name = "CHILDTDBRN")
    protected String childtdbrn;
    @XmlElement(name = "CHILDTDACC")
    protected String childtdacc;
    @XmlElement(name = "CHILDTDCCY")
    protected String childtdccy;
    @XmlElement(name = "TDAMT")
    protected BigDecimal tdamt;
    @XmlElement(name = "Tddetailsfpo")
    protected IcctdfpoModifyIOType.Tddetailsfpo tddetailsfpo;
    @XmlElement(name = "Bcpayout")
    protected IcctdfpoModifyIOType.Bcpayout bcpayout;
    @XmlElement(name = "Pcpayout")
    protected IcctdfpoModifyIOType.Pcpayout pcpayout;

    /**
     * Gets the value of the brn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBRN() {
        return brn;
    }

    /**
     * Sets the value of the brn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBRN(String value) {
        this.brn = value;
    }

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
     * Gets the value of the childtdbrn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCHILDTDBRN() {
        return childtdbrn;
    }

    /**
     * Sets the value of the childtdbrn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCHILDTDBRN(String value) {
        this.childtdbrn = value;
    }

    /**
     * Gets the value of the childtdacc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCHILDTDACC() {
        return childtdacc;
    }

    /**
     * Sets the value of the childtdacc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCHILDTDACC(String value) {
        this.childtdacc = value;
    }

    /**
     * Gets the value of the childtdccy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCHILDTDCCY() {
        return childtdccy;
    }

    /**
     * Sets the value of the childtdccy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCHILDTDCCY(String value) {
        this.childtdccy = value;
    }

    /**
     * Gets the value of the tdamt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTDAMT() {
        return tdamt;
    }

    /**
     * Sets the value of the tdamt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTDAMT(BigDecimal value) {
        this.tdamt = value;
    }

    /**
     * Gets the value of the tddetailsfpo property.
     * 
     * @return
     *     possible object is
     *     {@link IcctdfpoModifyIOType.Tddetailsfpo }
     *     
     */
    public IcctdfpoModifyIOType.Tddetailsfpo getTddetailsfpo() {
        return tddetailsfpo;
    }

    /**
     * Sets the value of the tddetailsfpo property.
     * 
     * @param value
     *     allowed object is
     *     {@link IcctdfpoModifyIOType.Tddetailsfpo }
     *     
     */
    public void setTddetailsfpo(IcctdfpoModifyIOType.Tddetailsfpo value) {
        this.tddetailsfpo = value;
    }

    /**
     * Gets the value of the bcpayout property.
     * 
     * @return
     *     possible object is
     *     {@link IcctdfpoModifyIOType.Bcpayout }
     *     
     */
    public IcctdfpoModifyIOType.Bcpayout getBcpayout() {
        return bcpayout;
    }

    /**
     * Sets the value of the bcpayout property.
     * 
     * @param value
     *     allowed object is
     *     {@link IcctdfpoModifyIOType.Bcpayout }
     *     
     */
    public void setBcpayout(IcctdfpoModifyIOType.Bcpayout value) {
        this.bcpayout = value;
    }

    /**
     * Gets the value of the pcpayout property.
     * 
     * @return
     *     possible object is
     *     {@link IcctdfpoModifyIOType.Pcpayout }
     *     
     */
    public IcctdfpoModifyIOType.Pcpayout getPcpayout() {
        return pcpayout;
    }

    /**
     * Sets the value of the pcpayout property.
     * 
     * @param value
     *     allowed object is
     *     {@link IcctdfpoModifyIOType.Pcpayout }
     *     
     */
    public void setPcpayout(IcctdfpoModifyIOType.Pcpayout value) {
        this.pcpayout = value;
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
     *         &lt;element name="BANKCODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="CHQ_AMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="CHQ_CCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="CHQ_DATE" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *         &lt;element name="CHQ_PERCENT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="BENFNAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="BENFADD1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="OTHERDETS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="NARRATIVE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="XRATE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="REF_NO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="BCSTAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="PAYBRN_F" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "bankcode",
        "chqamt",
        "chqccy",
        "chqdate",
        "chqpercent",
        "benfname",
        "benfadd1",
        "otherdets",
        "narrative",
        "xrate",
        "refno",
        "bcstat",
        "paybrnf"
    })
    public static class Bcpayout {

        @XmlElement(name = "BANKCODE")
        protected String bankcode;
        @XmlElement(name = "CHQ_AMT")
        protected BigDecimal chqamt;
        @XmlElement(name = "CHQ_CCY")
        protected String chqccy;
        @XmlElement(name = "CHQ_DATE")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar chqdate;
        @XmlElement(name = "CHQ_PERCENT")
        protected BigDecimal chqpercent;
        @XmlElement(name = "BENFNAME")
        protected String benfname;
        @XmlElement(name = "BENFADD1")
        protected String benfadd1;
        @XmlElement(name = "OTHERDETS")
        protected String otherdets;
        @XmlElement(name = "NARRATIVE")
        protected String narrative;
        @XmlElement(name = "XRATE")
        protected BigDecimal xrate;
        @XmlElement(name = "REF_NO")
        protected String refno;
        @XmlElement(name = "BCSTAT")
        protected String bcstat;
        @XmlElement(name = "PAYBRN_F")
        protected String paybrnf;

        /**
         * Gets the value of the bankcode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBANKCODE() {
            return bankcode;
        }

        /**
         * Sets the value of the bankcode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBANKCODE(String value) {
            this.bankcode = value;
        }

        /**
         * Gets the value of the chqamt property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getCHQAMT() {
            return chqamt;
        }

        /**
         * Sets the value of the chqamt property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setCHQAMT(BigDecimal value) {
            this.chqamt = value;
        }

        /**
         * Gets the value of the chqccy property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCHQCCY() {
            return chqccy;
        }

        /**
         * Sets the value of the chqccy property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCHQCCY(String value) {
            this.chqccy = value;
        }

        /**
         * Gets the value of the chqdate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getCHQDATE() {
            return chqdate;
        }

        /**
         * Sets the value of the chqdate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setCHQDATE(XMLGregorianCalendar value) {
            this.chqdate = value;
        }

        /**
         * Gets the value of the chqpercent property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getCHQPERCENT() {
            return chqpercent;
        }

        /**
         * Sets the value of the chqpercent property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setCHQPERCENT(BigDecimal value) {
            this.chqpercent = value;
        }

        /**
         * Gets the value of the benfname property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBENFNAME() {
            return benfname;
        }

        /**
         * Sets the value of the benfname property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBENFNAME(String value) {
            this.benfname = value;
        }

        /**
         * Gets the value of the benfadd1 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBENFADD1() {
            return benfadd1;
        }

        /**
         * Sets the value of the benfadd1 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBENFADD1(String value) {
            this.benfadd1 = value;
        }

        /**
         * Gets the value of the otherdets property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOTHERDETS() {
            return otherdets;
        }

        /**
         * Sets the value of the otherdets property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOTHERDETS(String value) {
            this.otherdets = value;
        }

        /**
         * Gets the value of the narrative property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNARRATIVE() {
            return narrative;
        }

        /**
         * Sets the value of the narrative property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNARRATIVE(String value) {
            this.narrative = value;
        }

        /**
         * Gets the value of the xrate property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getXRATE() {
            return xrate;
        }

        /**
         * Sets the value of the xrate property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setXRATE(BigDecimal value) {
            this.xrate = value;
        }

        /**
         * Gets the value of the refno property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getREFNO() {
            return refno;
        }

        /**
         * Sets the value of the refno property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setREFNO(String value) {
            this.refno = value;
        }

        /**
         * Gets the value of the bcstat property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBCSTAT() {
            return bcstat;
        }

        /**
         * Sets the value of the bcstat property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBCSTAT(String value) {
            this.bcstat = value;
        }

        /**
         * Gets the value of the paybrnf property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPAYBRNF() {
            return paybrnf;
        }

        /**
         * Sets the value of the paybrnf property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPAYBRNF(String value) {
            this.paybrnf = value;
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
     *         &lt;element name="PCOFFSET_BRN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="PCOFFSET_CCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="PCPERCENTAGE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="BENFNAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="BENFADD1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="OTHERDETS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="NARRATIVE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="XRATE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="CUSTBANKCODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="CUSTACCNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="PCCLGBRN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="TXNCCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="TXNAMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="REFNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="PCBANKCODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="PCOFFSET_ACC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "pcoffsetbrn",
        "pcoffsetccy",
        "pcpercentage",
        "benfname",
        "benfadd1",
        "otherdets",
        "narrative",
        "xrate",
        "custbankcode",
        "custaccno",
        "pcclgbrn",
        "txnccy",
        "txnamt",
        "refno",
        "pcbankcode",
        "pcoffsetacc"
    })
    public static class Pcpayout {

        @XmlElement(name = "CCY")
        protected String ccy;
        @XmlElement(name = "PCOFFSET_BRN")
        protected String pcoffsetbrn;
        @XmlElement(name = "PCOFFSET_CCY")
        protected String pcoffsetccy;
        @XmlElement(name = "PCPERCENTAGE")
        protected BigDecimal pcpercentage;
        @XmlElement(name = "BENFNAME")
        protected String benfname;
        @XmlElement(name = "BENFADD1")
        protected String benfadd1;
        @XmlElement(name = "OTHERDETS")
        protected String otherdets;
        @XmlElement(name = "NARRATIVE")
        protected String narrative;
        @XmlElement(name = "XRATE")
        protected BigDecimal xrate;
        @XmlElement(name = "CUSTBANKCODE")
        protected String custbankcode;
        @XmlElement(name = "CUSTACCNO")
        protected String custaccno;
        @XmlElement(name = "PCCLGBRN")
        protected String pcclgbrn;
        @XmlElement(name = "TXNCCY")
        protected String txnccy;
        @XmlElement(name = "TXNAMT")
        protected BigDecimal txnamt;
        @XmlElement(name = "REFNO")
        protected String refno;
        @XmlElement(name = "PCBANKCODE")
        protected String pcbankcode;
        @XmlElement(name = "PCOFFSET_ACC")
        protected String pcoffsetacc;

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
         * Gets the value of the pcoffsetbrn property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPCOFFSETBRN() {
            return pcoffsetbrn;
        }

        /**
         * Sets the value of the pcoffsetbrn property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPCOFFSETBRN(String value) {
            this.pcoffsetbrn = value;
        }

        /**
         * Gets the value of the pcoffsetccy property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPCOFFSETCCY() {
            return pcoffsetccy;
        }

        /**
         * Sets the value of the pcoffsetccy property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPCOFFSETCCY(String value) {
            this.pcoffsetccy = value;
        }

        /**
         * Gets the value of the pcpercentage property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getPCPERCENTAGE() {
            return pcpercentage;
        }

        /**
         * Sets the value of the pcpercentage property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setPCPERCENTAGE(BigDecimal value) {
            this.pcpercentage = value;
        }

        /**
         * Gets the value of the benfname property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBENFNAME() {
            return benfname;
        }

        /**
         * Sets the value of the benfname property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBENFNAME(String value) {
            this.benfname = value;
        }

        /**
         * Gets the value of the benfadd1 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBENFADD1() {
            return benfadd1;
        }

        /**
         * Sets the value of the benfadd1 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBENFADD1(String value) {
            this.benfadd1 = value;
        }

        /**
         * Gets the value of the otherdets property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOTHERDETS() {
            return otherdets;
        }

        /**
         * Sets the value of the otherdets property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOTHERDETS(String value) {
            this.otherdets = value;
        }

        /**
         * Gets the value of the narrative property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNARRATIVE() {
            return narrative;
        }

        /**
         * Sets the value of the narrative property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNARRATIVE(String value) {
            this.narrative = value;
        }

        /**
         * Gets the value of the xrate property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getXRATE() {
            return xrate;
        }

        /**
         * Sets the value of the xrate property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setXRATE(BigDecimal value) {
            this.xrate = value;
        }

        /**
         * Gets the value of the custbankcode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCUSTBANKCODE() {
            return custbankcode;
        }

        /**
         * Sets the value of the custbankcode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCUSTBANKCODE(String value) {
            this.custbankcode = value;
        }

        /**
         * Gets the value of the custaccno property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCUSTACCNO() {
            return custaccno;
        }

        /**
         * Sets the value of the custaccno property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCUSTACCNO(String value) {
            this.custaccno = value;
        }

        /**
         * Gets the value of the pcclgbrn property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPCCLGBRN() {
            return pcclgbrn;
        }

        /**
         * Sets the value of the pcclgbrn property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPCCLGBRN(String value) {
            this.pcclgbrn = value;
        }

        /**
         * Gets the value of the txnccy property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTXNCCY() {
            return txnccy;
        }

        /**
         * Sets the value of the txnccy property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTXNCCY(String value) {
            this.txnccy = value;
        }

        /**
         * Gets the value of the txnamt property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getTXNAMT() {
            return txnamt;
        }

        /**
         * Sets the value of the txnamt property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setTXNAMT(BigDecimal value) {
            this.txnamt = value;
        }

        /**
         * Gets the value of the refno property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getREFNO() {
            return refno;
        }

        /**
         * Sets the value of the refno property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setREFNO(String value) {
            this.refno = value;
        }

        /**
         * Gets the value of the pcbankcode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPCBANKCODE() {
            return pcbankcode;
        }

        /**
         * Sets the value of the pcbankcode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPCBANKCODE(String value) {
            this.pcbankcode = value;
        }

        /**
         * Gets the value of the pcoffsetacc property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPCOFFSETACC() {
            return pcoffsetacc;
        }

        /**
         * Sets the value of the pcoffsetacc property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPCOFFSETACC(String value) {
            this.pcoffsetacc = value;
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
     *         &lt;element name="DFTFROM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="CUSTNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ACCLS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="REFNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="TDAMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="TDSTAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ACOPENDATE" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *         &lt;element name="PACCL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="Childintdetails" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="CHGBOOKACCBRN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="CHGBOOKACC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="CHGSTARTDT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *                   &lt;element name="CALCACC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="BOOKACC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="HASIS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="INTSTARTDT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *                   &lt;element name="BOOKACCBRN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="DRCRADV" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="ACCLS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="CUSTNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Childintprodmap" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="INTPROD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="WAIVEPROD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="GENUDECHNGADV" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="PRODMAPSTAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="UDECCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="ILPRD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="DISPTYP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="CONTVARROLL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="Childinteffdtmap" maxOccurs="unbounded" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="PRD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                       &lt;element name="UDEEFFDT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *                                       &lt;element name="EFFDTMAPSTAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                       &lt;element name="Childintsde" maxOccurs="unbounded" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="PRD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                                 &lt;element name="UDEEFFDT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *                                                 &lt;element name="UDEID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                                 &lt;element name="UDEVALUE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                                                 &lt;element name="RATECODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                                 &lt;element name="TDRATECODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                                 &lt;element name="UDEVARIANCE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                                               &lt;/sequence>
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
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
     *         &lt;element name="Childinttddetails" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="AUTOROLL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="PMNTCCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="RDAMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                   &lt;element name="PMNTDT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *                   &lt;element name="CLONMAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="MOVINTUNCLM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="MOVPRIUNCLM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="MATDT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *                   &lt;element name="LIQDACC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="ROLLTYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="ROLLAMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                   &lt;element name="LIQDBRN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="NEXTMATDT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *                   &lt;element name="RDACC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="MOVETOUNCLM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="FUNDONOVD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="REFREDAY" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                   &lt;element name="REFREMTH" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                   &lt;element name="REFREYEAR" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                   &lt;element name="PAYACC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="PAYBRN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="AUTOPAY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="INTSTDT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *                   &lt;element name="DEPTENOR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="COMPTDAMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                   &lt;element name="INTRATE_CUMAMT_ROLL_REQD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="ROLLTENORPREF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="DEPTENORDAY" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                   &lt;element name="DEPTENORMONTH" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                   &lt;element name="DEPTENORYEAR" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                   &lt;element name="ROLLTENORDAYS" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                   &lt;element name="ROLLTENORMONTHS" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                   &lt;element name="ROLLTENORYEARS" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                   &lt;element name="DEPTENORPREF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Childtdpayoutdetails" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="CCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="PAYOUTTYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="BANKCODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="OFFBRN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="OFFACC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="OFFCCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="PERCENTAGE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                             &lt;element name="REDMAMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                             &lt;element name="BENFNAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="BENFADD1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="BENFADD2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="OTHERDETS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="NARRATIVE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="XRATE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                             &lt;element name="REFNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="SEQNO" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="Bcpayoutspo" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="BCSPOSTAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="CCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="REFNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="SCODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="MICRNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="TRNDT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *                             &lt;element name="BANKCODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="CHQAMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                             &lt;element name="CHQCCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="CHQDATE" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *                             &lt;element name="CHQPERCENT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                             &lt;element name="XRATE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                             &lt;element name="PAYBRN_F" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="BENFNAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="BENFADD1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="BENFADD2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="OTHERDETS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="NARRATIVE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="COUNTRYCODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="Pcpayoutspo" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="PCSPOSTAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="CCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="PCBANKCODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="PCOFFSETBRN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="PCOFFSETACC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="PCOFFSETCCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="PCPERCENTAGE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                             &lt;element name="BENFNAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="BENFADD1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="OTHERDETS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="NARRATIVE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="XRATE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                             &lt;element name="REFNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "ccy",
        "dftfrom",
        "custno",
        "accls",
        "refno",
        "tdamt",
        "tdstat",
        "acopendate",
        "paccl",
        "childintdetails",
        "childinttddetails"
    })
    public static class Tddetailsfpo {

        @XmlElement(name = "CCY")
        protected String ccy;
        @XmlElement(name = "DFTFROM")
        protected String dftfrom;
        @XmlElement(name = "CUSTNO")
        protected String custno;
        @XmlElement(name = "ACCLS")
        protected String accls;
        @XmlElement(name = "REFNO")
        protected String refno;
        @XmlElement(name = "TDAMT")
        protected BigDecimal tdamt;
        @XmlElement(name = "TDSTAT")
        protected String tdstat;
        @XmlElement(name = "ACOPENDATE")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar acopendate;
        @XmlElement(name = "PACCL")
        protected String paccl;
        @XmlElement(name = "Childintdetails")
        protected IcctdfpoModifyIOType.Tddetailsfpo.Childintdetails childintdetails;
        @XmlElement(name = "Childinttddetails")
        protected IcctdfpoModifyIOType.Tddetailsfpo.Childinttddetails childinttddetails;

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
         * Gets the value of the dftfrom property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDFTFROM() {
            return dftfrom;
        }

        /**
         * Sets the value of the dftfrom property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDFTFROM(String value) {
            this.dftfrom = value;
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
         * Gets the value of the accls property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getACCLS() {
            return accls;
        }

        /**
         * Sets the value of the accls property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setACCLS(String value) {
            this.accls = value;
        }

        /**
         * Gets the value of the refno property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getREFNO() {
            return refno;
        }

        /**
         * Sets the value of the refno property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setREFNO(String value) {
            this.refno = value;
        }

        /**
         * Gets the value of the tdamt property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getTDAMT() {
            return tdamt;
        }

        /**
         * Sets the value of the tdamt property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setTDAMT(BigDecimal value) {
            this.tdamt = value;
        }

        /**
         * Gets the value of the tdstat property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTDSTAT() {
            return tdstat;
        }

        /**
         * Sets the value of the tdstat property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTDSTAT(String value) {
            this.tdstat = value;
        }

        /**
         * Gets the value of the acopendate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getACOPENDATE() {
            return acopendate;
        }

        /**
         * Sets the value of the acopendate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setACOPENDATE(XMLGregorianCalendar value) {
            this.acopendate = value;
        }

        /**
         * Gets the value of the paccl property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPACCL() {
            return paccl;
        }

        /**
         * Sets the value of the paccl property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPACCL(String value) {
            this.paccl = value;
        }

        /**
         * Gets the value of the childintdetails property.
         * 
         * @return
         *     possible object is
         *     {@link IcctdfpoModifyIOType.Tddetailsfpo.Childintdetails }
         *     
         */
        public IcctdfpoModifyIOType.Tddetailsfpo.Childintdetails getChildintdetails() {
            return childintdetails;
        }

        /**
         * Sets the value of the childintdetails property.
         * 
         * @param value
         *     allowed object is
         *     {@link IcctdfpoModifyIOType.Tddetailsfpo.Childintdetails }
         *     
         */
        public void setChildintdetails(IcctdfpoModifyIOType.Tddetailsfpo.Childintdetails value) {
            this.childintdetails = value;
        }

        /**
         * Gets the value of the childinttddetails property.
         * 
         * @return
         *     possible object is
         *     {@link IcctdfpoModifyIOType.Tddetailsfpo.Childinttddetails }
         *     
         */
        public IcctdfpoModifyIOType.Tddetailsfpo.Childinttddetails getChildinttddetails() {
            return childinttddetails;
        }

        /**
         * Sets the value of the childinttddetails property.
         * 
         * @param value
         *     allowed object is
         *     {@link IcctdfpoModifyIOType.Tddetailsfpo.Childinttddetails }
         *     
         */
        public void setChildinttddetails(IcctdfpoModifyIOType.Tddetailsfpo.Childinttddetails value) {
            this.childinttddetails = value;
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
         *         &lt;element name="CHGBOOKACCBRN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="CHGBOOKACC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="CHGSTARTDT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
         *         &lt;element name="CALCACC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="BOOKACC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="HASIS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="INTSTARTDT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
         *         &lt;element name="BOOKACCBRN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="DRCRADV" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="ACCLS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="CUSTNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Childintprodmap" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="INTPROD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="WAIVEPROD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="GENUDECHNGADV" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="PRODMAPSTAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="UDECCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="ILPRD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="DISPTYP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="CONTVARROLL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="Childinteffdtmap" maxOccurs="unbounded" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="PRD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                             &lt;element name="UDEEFFDT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
         *                             &lt;element name="EFFDTMAPSTAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                             &lt;element name="Childintsde" maxOccurs="unbounded" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="PRD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                                       &lt;element name="UDEEFFDT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
         *                                       &lt;element name="UDEID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                                       &lt;element name="UDEVALUE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *                                       &lt;element name="RATECODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                                       &lt;element name="TDRATECODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                                       &lt;element name="UDEVARIANCE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
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
            "chgbookaccbrn",
            "chgbookacc",
            "chgstartdt",
            "calcacc",
            "bookacc",
            "hasis",
            "intstartdt",
            "bookaccbrn",
            "drcradv",
            "accls",
            "custno",
            "childintprodmap"
        })
        public static class Childintdetails {

            @XmlElement(name = "CHGBOOKACCBRN")
            protected String chgbookaccbrn;
            @XmlElement(name = "CHGBOOKACC")
            protected String chgbookacc;
            @XmlElement(name = "CHGSTARTDT")
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar chgstartdt;
            @XmlElement(name = "CALCACC")
            protected String calcacc;
            @XmlElement(name = "BOOKACC")
            protected String bookacc;
            @XmlElement(name = "HASIS")
            protected String hasis;
            @XmlElement(name = "INTSTARTDT")
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar intstartdt;
            @XmlElement(name = "BOOKACCBRN")
            protected String bookaccbrn;
            @XmlElement(name = "DRCRADV")
            protected String drcradv;
            @XmlElement(name = "ACCLS")
            protected String accls;
            @XmlElement(name = "CUSTNO")
            protected String custno;
            @XmlElement(name = "Childintprodmap")
            protected List<IcctdfpoModifyIOType.Tddetailsfpo.Childintdetails.Childintprodmap> childintprodmap;

            /**
             * Gets the value of the chgbookaccbrn property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCHGBOOKACCBRN() {
                return chgbookaccbrn;
            }

            /**
             * Sets the value of the chgbookaccbrn property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCHGBOOKACCBRN(String value) {
                this.chgbookaccbrn = value;
            }

            /**
             * Gets the value of the chgbookacc property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCHGBOOKACC() {
                return chgbookacc;
            }

            /**
             * Sets the value of the chgbookacc property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCHGBOOKACC(String value) {
                this.chgbookacc = value;
            }

            /**
             * Gets the value of the chgstartdt property.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getCHGSTARTDT() {
                return chgstartdt;
            }

            /**
             * Sets the value of the chgstartdt property.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setCHGSTARTDT(XMLGregorianCalendar value) {
                this.chgstartdt = value;
            }

            /**
             * Gets the value of the calcacc property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCALCACC() {
                return calcacc;
            }

            /**
             * Sets the value of the calcacc property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCALCACC(String value) {
                this.calcacc = value;
            }

            /**
             * Gets the value of the bookacc property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBOOKACC() {
                return bookacc;
            }

            /**
             * Sets the value of the bookacc property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBOOKACC(String value) {
                this.bookacc = value;
            }

            /**
             * Gets the value of the hasis property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getHASIS() {
                return hasis;
            }

            /**
             * Sets the value of the hasis property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setHASIS(String value) {
                this.hasis = value;
            }

            /**
             * Gets the value of the intstartdt property.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getINTSTARTDT() {
                return intstartdt;
            }

            /**
             * Sets the value of the intstartdt property.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setINTSTARTDT(XMLGregorianCalendar value) {
                this.intstartdt = value;
            }

            /**
             * Gets the value of the bookaccbrn property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBOOKACCBRN() {
                return bookaccbrn;
            }

            /**
             * Sets the value of the bookaccbrn property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBOOKACCBRN(String value) {
                this.bookaccbrn = value;
            }

            /**
             * Gets the value of the drcradv property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDRCRADV() {
                return drcradv;
            }

            /**
             * Sets the value of the drcradv property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDRCRADV(String value) {
                this.drcradv = value;
            }

            /**
             * Gets the value of the accls property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getACCLS() {
                return accls;
            }

            /**
             * Sets the value of the accls property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setACCLS(String value) {
                this.accls = value;
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
             * Gets the value of the childintprodmap property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the childintprodmap property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getChildintprodmap().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link IcctdfpoModifyIOType.Tddetailsfpo.Childintdetails.Childintprodmap }
             * 
             * 
             */
            public List<IcctdfpoModifyIOType.Tddetailsfpo.Childintdetails.Childintprodmap> getChildintprodmap() {
                if (childintprodmap == null) {
                    childintprodmap = new ArrayList<IcctdfpoModifyIOType.Tddetailsfpo.Childintdetails.Childintprodmap>();
                }
                return this.childintprodmap;
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
             *         &lt;element name="INTPROD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="WAIVEPROD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="GENUDECHNGADV" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="PRODMAPSTAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="UDECCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="ILPRD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="DISPTYP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="CONTVARROLL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="Childinteffdtmap" maxOccurs="unbounded" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="PRD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                   &lt;element name="UDEEFFDT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
             *                   &lt;element name="EFFDTMAPSTAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                   &lt;element name="Childintsde" maxOccurs="unbounded" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="PRD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                             &lt;element name="UDEEFFDT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
             *                             &lt;element name="UDEID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                             &lt;element name="UDEVALUE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
             *                             &lt;element name="RATECODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                             &lt;element name="TDRATECODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                             &lt;element name="UDEVARIANCE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
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
                "intprod",
                "waiveprod",
                "genudechngadv",
                "prodmapstat",
                "udeccy",
                "ilprd",
                "disptyp",
                "contvarroll",
                "childinteffdtmap"
            })
            public static class Childintprodmap {

                @XmlElement(name = "INTPROD")
                protected String intprod;
                @XmlElement(name = "WAIVEPROD")
                protected String waiveprod;
                @XmlElement(name = "GENUDECHNGADV")
                protected String genudechngadv;
                @XmlElement(name = "PRODMAPSTAT")
                protected String prodmapstat;
                @XmlElement(name = "UDECCY")
                protected String udeccy;
                @XmlElement(name = "ILPRD")
                protected String ilprd;
                @XmlElement(name = "DISPTYP")
                protected String disptyp;
                @XmlElement(name = "CONTVARROLL")
                protected String contvarroll;
                @XmlElement(name = "Childinteffdtmap")
                protected List<IcctdfpoModifyIOType.Tddetailsfpo.Childintdetails.Childintprodmap.Childinteffdtmap> childinteffdtmap;

                /**
                 * Gets the value of the intprod property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getINTPROD() {
                    return intprod;
                }

                /**
                 * Sets the value of the intprod property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setINTPROD(String value) {
                    this.intprod = value;
                }

                /**
                 * Gets the value of the waiveprod property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getWAIVEPROD() {
                    return waiveprod;
                }

                /**
                 * Sets the value of the waiveprod property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setWAIVEPROD(String value) {
                    this.waiveprod = value;
                }

                /**
                 * Gets the value of the genudechngadv property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getGENUDECHNGADV() {
                    return genudechngadv;
                }

                /**
                 * Sets the value of the genudechngadv property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setGENUDECHNGADV(String value) {
                    this.genudechngadv = value;
                }

                /**
                 * Gets the value of the prodmapstat property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getPRODMAPSTAT() {
                    return prodmapstat;
                }

                /**
                 * Sets the value of the prodmapstat property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setPRODMAPSTAT(String value) {
                    this.prodmapstat = value;
                }

                /**
                 * Gets the value of the udeccy property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getUDECCY() {
                    return udeccy;
                }

                /**
                 * Sets the value of the udeccy property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setUDECCY(String value) {
                    this.udeccy = value;
                }

                /**
                 * Gets the value of the ilprd property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getILPRD() {
                    return ilprd;
                }

                /**
                 * Sets the value of the ilprd property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setILPRD(String value) {
                    this.ilprd = value;
                }

                /**
                 * Gets the value of the disptyp property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDISPTYP() {
                    return disptyp;
                }

                /**
                 * Sets the value of the disptyp property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDISPTYP(String value) {
                    this.disptyp = value;
                }

                /**
                 * Gets the value of the contvarroll property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCONTVARROLL() {
                    return contvarroll;
                }

                /**
                 * Sets the value of the contvarroll property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCONTVARROLL(String value) {
                    this.contvarroll = value;
                }

                /**
                 * Gets the value of the childinteffdtmap property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the childinteffdtmap property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getChildinteffdtmap().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link IcctdfpoModifyIOType.Tddetailsfpo.Childintdetails.Childintprodmap.Childinteffdtmap }
                 * 
                 * 
                 */
                public List<IcctdfpoModifyIOType.Tddetailsfpo.Childintdetails.Childintprodmap.Childinteffdtmap> getChildinteffdtmap() {
                    if (childinteffdtmap == null) {
                        childinteffdtmap = new ArrayList<IcctdfpoModifyIOType.Tddetailsfpo.Childintdetails.Childintprodmap.Childinteffdtmap>();
                    }
                    return this.childinteffdtmap;
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
                 *         &lt;element name="PRD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *         &lt;element name="UDEEFFDT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
                 *         &lt;element name="EFFDTMAPSTAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *         &lt;element name="Childintsde" maxOccurs="unbounded" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="PRD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *                   &lt;element name="UDEEFFDT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
                 *                   &lt;element name="UDEID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *                   &lt;element name="UDEVALUE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
                 *                   &lt;element name="RATECODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *                   &lt;element name="TDRATECODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *                   &lt;element name="UDEVARIANCE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
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
                    "prd",
                    "udeeffdt",
                    "effdtmapstat",
                    "childintsde"
                })
                public static class Childinteffdtmap {

                    @XmlElement(name = "PRD")
                    protected String prd;
                    @XmlElement(name = "UDEEFFDT")
                    @XmlSchemaType(name = "date")
                    protected XMLGregorianCalendar udeeffdt;
                    @XmlElement(name = "EFFDTMAPSTAT")
                    protected String effdtmapstat;
                    @XmlElement(name = "Childintsde")
                    protected List<IcctdfpoModifyIOType.Tddetailsfpo.Childintdetails.Childintprodmap.Childinteffdtmap.Childintsde> childintsde;

                    /**
                     * Gets the value of the prd property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getPRD() {
                        return prd;
                    }

                    /**
                     * Sets the value of the prd property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setPRD(String value) {
                        this.prd = value;
                    }

                    /**
                     * Gets the value of the udeeffdt property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link XMLGregorianCalendar }
                     *     
                     */
                    public XMLGregorianCalendar getUDEEFFDT() {
                        return udeeffdt;
                    }

                    /**
                     * Sets the value of the udeeffdt property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link XMLGregorianCalendar }
                     *     
                     */
                    public void setUDEEFFDT(XMLGregorianCalendar value) {
                        this.udeeffdt = value;
                    }

                    /**
                     * Gets the value of the effdtmapstat property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getEFFDTMAPSTAT() {
                        return effdtmapstat;
                    }

                    /**
                     * Sets the value of the effdtmapstat property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setEFFDTMAPSTAT(String value) {
                        this.effdtmapstat = value;
                    }

                    /**
                     * Gets the value of the childintsde property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the childintsde property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getChildintsde().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link IcctdfpoModifyIOType.Tddetailsfpo.Childintdetails.Childintprodmap.Childinteffdtmap.Childintsde }
                     * 
                     * 
                     */
                    public List<IcctdfpoModifyIOType.Tddetailsfpo.Childintdetails.Childintprodmap.Childinteffdtmap.Childintsde> getChildintsde() {
                        if (childintsde == null) {
                            childintsde = new ArrayList<IcctdfpoModifyIOType.Tddetailsfpo.Childintdetails.Childintprodmap.Childinteffdtmap.Childintsde>();
                        }
                        return this.childintsde;
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
                     *         &lt;element name="PRD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                     *         &lt;element name="UDEEFFDT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
                     *         &lt;element name="UDEID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                     *         &lt;element name="UDEVALUE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
                     *         &lt;element name="RATECODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                     *         &lt;element name="TDRATECODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                     *         &lt;element name="UDEVARIANCE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
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
                        "prd",
                        "udeeffdt",
                        "udeid",
                        "udevalue",
                        "ratecode",
                        "tdratecode",
                        "udevariance"
                    })
                    public static class Childintsde {

                        @XmlElement(name = "PRD")
                        protected String prd;
                        @XmlElement(name = "UDEEFFDT")
                        @XmlSchemaType(name = "date")
                        protected XMLGregorianCalendar udeeffdt;
                        @XmlElement(name = "UDEID")
                        protected String udeid;
                        @XmlElement(name = "UDEVALUE")
                        protected BigDecimal udevalue;
                        @XmlElement(name = "RATECODE")
                        protected String ratecode;
                        @XmlElement(name = "TDRATECODE")
                        protected String tdratecode;
                        @XmlElement(name = "UDEVARIANCE")
                        protected BigDecimal udevariance;

                        /**
                         * Gets the value of the prd property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getPRD() {
                            return prd;
                        }

                        /**
                         * Sets the value of the prd property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setPRD(String value) {
                            this.prd = value;
                        }

                        /**
                         * Gets the value of the udeeffdt property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link XMLGregorianCalendar }
                         *     
                         */
                        public XMLGregorianCalendar getUDEEFFDT() {
                            return udeeffdt;
                        }

                        /**
                         * Sets the value of the udeeffdt property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link XMLGregorianCalendar }
                         *     
                         */
                        public void setUDEEFFDT(XMLGregorianCalendar value) {
                            this.udeeffdt = value;
                        }

                        /**
                         * Gets the value of the udeid property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getUDEID() {
                            return udeid;
                        }

                        /**
                         * Sets the value of the udeid property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setUDEID(String value) {
                            this.udeid = value;
                        }

                        /**
                         * Gets the value of the udevalue property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link BigDecimal }
                         *     
                         */
                        public BigDecimal getUDEVALUE() {
                            return udevalue;
                        }

                        /**
                         * Sets the value of the udevalue property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link BigDecimal }
                         *     
                         */
                        public void setUDEVALUE(BigDecimal value) {
                            this.udevalue = value;
                        }

                        /**
                         * Gets the value of the ratecode property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getRATECODE() {
                            return ratecode;
                        }

                        /**
                         * Sets the value of the ratecode property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setRATECODE(String value) {
                            this.ratecode = value;
                        }

                        /**
                         * Gets the value of the tdratecode property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getTDRATECODE() {
                            return tdratecode;
                        }

                        /**
                         * Sets the value of the tdratecode property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setTDRATECODE(String value) {
                            this.tdratecode = value;
                        }

                        /**
                         * Gets the value of the udevariance property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link BigDecimal }
                         *     
                         */
                        public BigDecimal getUDEVARIANCE() {
                            return udevariance;
                        }

                        /**
                         * Sets the value of the udevariance property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link BigDecimal }
                         *     
                         */
                        public void setUDEVARIANCE(BigDecimal value) {
                            this.udevariance = value;
                        }

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
         *         &lt;element name="AUTOROLL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="PMNTCCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="RDAMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *         &lt;element name="PMNTDT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
         *         &lt;element name="CLONMAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="MOVINTUNCLM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="MOVPRIUNCLM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="MATDT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
         *         &lt;element name="LIQDACC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="ROLLTYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="ROLLAMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *         &lt;element name="LIQDBRN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="NEXTMATDT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
         *         &lt;element name="RDACC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="MOVETOUNCLM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="FUNDONOVD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="REFREDAY" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *         &lt;element name="REFREMTH" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *         &lt;element name="REFREYEAR" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *         &lt;element name="PAYACC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="PAYBRN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="AUTOPAY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="INTSTDT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
         *         &lt;element name="DEPTENOR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="COMPTDAMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *         &lt;element name="INTRATE_CUMAMT_ROLL_REQD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="ROLLTENORPREF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="DEPTENORDAY" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *         &lt;element name="DEPTENORMONTH" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *         &lt;element name="DEPTENORYEAR" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *         &lt;element name="ROLLTENORDAYS" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *         &lt;element name="ROLLTENORMONTHS" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *         &lt;element name="ROLLTENORYEARS" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *         &lt;element name="DEPTENORPREF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Childtdpayoutdetails" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="CCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="PAYOUTTYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="BANKCODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="OFFBRN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="OFFACC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="OFFCCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="PERCENTAGE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *                   &lt;element name="REDMAMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *                   &lt;element name="BENFNAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="BENFADD1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="BENFADD2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="OTHERDETS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="NARRATIVE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="XRATE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *                   &lt;element name="REFNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="SEQNO" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="Bcpayoutspo" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="BCSPOSTAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="CCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="REFNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="SCODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="MICRNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="TRNDT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
         *                   &lt;element name="BANKCODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="CHQAMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *                   &lt;element name="CHQCCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="CHQDATE" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
         *                   &lt;element name="CHQPERCENT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *                   &lt;element name="XRATE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *                   &lt;element name="PAYBRN_F" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="BENFNAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="BENFADD1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="BENFADD2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="OTHERDETS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="NARRATIVE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="COUNTRYCODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="Pcpayoutspo" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="PCSPOSTAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="CCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="PCBANKCODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="PCOFFSETBRN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="PCOFFSETACC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="PCOFFSETCCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="PCPERCENTAGE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *                   &lt;element name="BENFNAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="BENFADD1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="OTHERDETS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="NARRATIVE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="XRATE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *                   &lt;element name="REFNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "autoroll",
            "pmntccy",
            "rdamt",
            "pmntdt",
            "clonmat",
            "movintunclm",
            "movpriunclm",
            "matdt",
            "liqdacc",
            "rolltype",
            "rollamt",
            "liqdbrn",
            "nextmatdt",
            "rdacc",
            "movetounclm",
            "fundonovd",
            "refreday",
            "refremth",
            "refreyear",
            "payacc",
            "paybrn",
            "autopay",
            "intstdt",
            "deptenor",
            "comptdamt",
            "intratecumamtrollreqd",
            "rolltenorpref",
            "deptenorday",
            "deptenormonth",
            "deptenoryear",
            "rolltenordays",
            "rolltenormonths",
            "rolltenoryears",
            "deptenorpref",
            "childtdpayoutdetails",
            "bcpayoutspo",
            "pcpayoutspo"
        })
        public static class Childinttddetails {

            @XmlElement(name = "AUTOROLL")
            protected String autoroll;
            @XmlElement(name = "PMNTCCY")
            protected String pmntccy;
            @XmlElement(name = "RDAMT")
            protected BigDecimal rdamt;
            @XmlElement(name = "PMNTDT")
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar pmntdt;
            @XmlElement(name = "CLONMAT")
            protected String clonmat;
            @XmlElement(name = "MOVINTUNCLM")
            protected String movintunclm;
            @XmlElement(name = "MOVPRIUNCLM")
            protected String movpriunclm;
            @XmlElement(name = "MATDT")
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar matdt;
            @XmlElement(name = "LIQDACC")
            protected String liqdacc;
            @XmlElement(name = "ROLLTYPE")
            protected String rolltype;
            @XmlElement(name = "ROLLAMT")
            protected BigDecimal rollamt;
            @XmlElement(name = "LIQDBRN")
            protected String liqdbrn;
            @XmlElement(name = "NEXTMATDT")
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar nextmatdt;
            @XmlElement(name = "RDACC")
            protected String rdacc;
            @XmlElement(name = "MOVETOUNCLM")
            protected String movetounclm;
            @XmlElement(name = "FUNDONOVD")
            protected String fundonovd;
            @XmlElement(name = "REFREDAY")
            protected BigDecimal refreday;
            @XmlElement(name = "REFREMTH")
            protected BigDecimal refremth;
            @XmlElement(name = "REFREYEAR")
            protected BigDecimal refreyear;
            @XmlElement(name = "PAYACC")
            protected String payacc;
            @XmlElement(name = "PAYBRN")
            protected String paybrn;
            @XmlElement(name = "AUTOPAY")
            protected String autopay;
            @XmlElement(name = "INTSTDT")
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar intstdt;
            @XmlElement(name = "DEPTENOR")
            protected String deptenor;
            @XmlElement(name = "COMPTDAMT")
            protected BigDecimal comptdamt;
            @XmlElement(name = "INTRATE_CUMAMT_ROLL_REQD")
            protected String intratecumamtrollreqd;
            @XmlElement(name = "ROLLTENORPREF")
            protected String rolltenorpref;
            @XmlElement(name = "DEPTENORDAY")
            protected BigDecimal deptenorday;
            @XmlElement(name = "DEPTENORMONTH")
            protected BigDecimal deptenormonth;
            @XmlElement(name = "DEPTENORYEAR")
            protected BigDecimal deptenoryear;
            @XmlElement(name = "ROLLTENORDAYS")
            protected BigDecimal rolltenordays;
            @XmlElement(name = "ROLLTENORMONTHS")
            protected BigDecimal rolltenormonths;
            @XmlElement(name = "ROLLTENORYEARS")
            protected BigDecimal rolltenoryears;
            @XmlElement(name = "DEPTENORPREF")
            protected String deptenorpref;
            @XmlElement(name = "Childtdpayoutdetails")
            protected List<IcctdfpoModifyIOType.Tddetailsfpo.Childinttddetails.Childtdpayoutdetails> childtdpayoutdetails;
            @XmlElement(name = "Bcpayoutspo")
            protected IcctdfpoModifyIOType.Tddetailsfpo.Childinttddetails.Bcpayoutspo bcpayoutspo;
            @XmlElement(name = "Pcpayoutspo")
            protected IcctdfpoModifyIOType.Tddetailsfpo.Childinttddetails.Pcpayoutspo pcpayoutspo;

            /**
             * Gets the value of the autoroll property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAUTOROLL() {
                return autoroll;
            }

            /**
             * Sets the value of the autoroll property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAUTOROLL(String value) {
                this.autoroll = value;
            }

            /**
             * Gets the value of the pmntccy property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPMNTCCY() {
                return pmntccy;
            }

            /**
             * Sets the value of the pmntccy property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPMNTCCY(String value) {
                this.pmntccy = value;
            }

            /**
             * Gets the value of the rdamt property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getRDAMT() {
                return rdamt;
            }

            /**
             * Sets the value of the rdamt property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setRDAMT(BigDecimal value) {
                this.rdamt = value;
            }

            /**
             * Gets the value of the pmntdt property.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getPMNTDT() {
                return pmntdt;
            }

            /**
             * Sets the value of the pmntdt property.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setPMNTDT(XMLGregorianCalendar value) {
                this.pmntdt = value;
            }

            /**
             * Gets the value of the clonmat property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCLONMAT() {
                return clonmat;
            }

            /**
             * Sets the value of the clonmat property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCLONMAT(String value) {
                this.clonmat = value;
            }

            /**
             * Gets the value of the movintunclm property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMOVINTUNCLM() {
                return movintunclm;
            }

            /**
             * Sets the value of the movintunclm property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMOVINTUNCLM(String value) {
                this.movintunclm = value;
            }

            /**
             * Gets the value of the movpriunclm property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMOVPRIUNCLM() {
                return movpriunclm;
            }

            /**
             * Sets the value of the movpriunclm property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMOVPRIUNCLM(String value) {
                this.movpriunclm = value;
            }

            /**
             * Gets the value of the matdt property.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getMATDT() {
                return matdt;
            }

            /**
             * Sets the value of the matdt property.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setMATDT(XMLGregorianCalendar value) {
                this.matdt = value;
            }

            /**
             * Gets the value of the liqdacc property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLIQDACC() {
                return liqdacc;
            }

            /**
             * Sets the value of the liqdacc property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLIQDACC(String value) {
                this.liqdacc = value;
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
             * Gets the value of the liqdbrn property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLIQDBRN() {
                return liqdbrn;
            }

            /**
             * Sets the value of the liqdbrn property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLIQDBRN(String value) {
                this.liqdbrn = value;
            }

            /**
             * Gets the value of the nextmatdt property.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getNEXTMATDT() {
                return nextmatdt;
            }

            /**
             * Sets the value of the nextmatdt property.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setNEXTMATDT(XMLGregorianCalendar value) {
                this.nextmatdt = value;
            }

            /**
             * Gets the value of the rdacc property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRDACC() {
                return rdacc;
            }

            /**
             * Sets the value of the rdacc property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRDACC(String value) {
                this.rdacc = value;
            }

            /**
             * Gets the value of the movetounclm property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMOVETOUNCLM() {
                return movetounclm;
            }

            /**
             * Sets the value of the movetounclm property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMOVETOUNCLM(String value) {
                this.movetounclm = value;
            }

            /**
             * Gets the value of the fundonovd property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFUNDONOVD() {
                return fundonovd;
            }

            /**
             * Sets the value of the fundonovd property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFUNDONOVD(String value) {
                this.fundonovd = value;
            }

            /**
             * Gets the value of the refreday property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getREFREDAY() {
                return refreday;
            }

            /**
             * Sets the value of the refreday property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setREFREDAY(BigDecimal value) {
                this.refreday = value;
            }

            /**
             * Gets the value of the refremth property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getREFREMTH() {
                return refremth;
            }

            /**
             * Sets the value of the refremth property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setREFREMTH(BigDecimal value) {
                this.refremth = value;
            }

            /**
             * Gets the value of the refreyear property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getREFREYEAR() {
                return refreyear;
            }

            /**
             * Sets the value of the refreyear property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setREFREYEAR(BigDecimal value) {
                this.refreyear = value;
            }

            /**
             * Gets the value of the payacc property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPAYACC() {
                return payacc;
            }

            /**
             * Sets the value of the payacc property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPAYACC(String value) {
                this.payacc = value;
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
             * Gets the value of the autopay property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAUTOPAY() {
                return autopay;
            }

            /**
             * Sets the value of the autopay property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAUTOPAY(String value) {
                this.autopay = value;
            }

            /**
             * Gets the value of the intstdt property.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getINTSTDT() {
                return intstdt;
            }

            /**
             * Sets the value of the intstdt property.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setINTSTDT(XMLGregorianCalendar value) {
                this.intstdt = value;
            }

            /**
             * Gets the value of the deptenor property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDEPTENOR() {
                return deptenor;
            }

            /**
             * Sets the value of the deptenor property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDEPTENOR(String value) {
                this.deptenor = value;
            }

            /**
             * Gets the value of the comptdamt property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getCOMPTDAMT() {
                return comptdamt;
            }

            /**
             * Sets the value of the comptdamt property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setCOMPTDAMT(BigDecimal value) {
                this.comptdamt = value;
            }

            /**
             * Gets the value of the intratecumamtrollreqd property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getINTRATECUMAMTROLLREQD() {
                return intratecumamtrollreqd;
            }

            /**
             * Sets the value of the intratecumamtrollreqd property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setINTRATECUMAMTROLLREQD(String value) {
                this.intratecumamtrollreqd = value;
            }

            /**
             * Gets the value of the rolltenorpref property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getROLLTENORPREF() {
                return rolltenorpref;
            }

            /**
             * Sets the value of the rolltenorpref property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setROLLTENORPREF(String value) {
                this.rolltenorpref = value;
            }

            /**
             * Gets the value of the deptenorday property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getDEPTENORDAY() {
                return deptenorday;
            }

            /**
             * Sets the value of the deptenorday property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setDEPTENORDAY(BigDecimal value) {
                this.deptenorday = value;
            }

            /**
             * Gets the value of the deptenormonth property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getDEPTENORMONTH() {
                return deptenormonth;
            }

            /**
             * Sets the value of the deptenormonth property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setDEPTENORMONTH(BigDecimal value) {
                this.deptenormonth = value;
            }

            /**
             * Gets the value of the deptenoryear property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getDEPTENORYEAR() {
                return deptenoryear;
            }

            /**
             * Sets the value of the deptenoryear property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setDEPTENORYEAR(BigDecimal value) {
                this.deptenoryear = value;
            }

            /**
             * Gets the value of the rolltenordays property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getROLLTENORDAYS() {
                return rolltenordays;
            }

            /**
             * Sets the value of the rolltenordays property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setROLLTENORDAYS(BigDecimal value) {
                this.rolltenordays = value;
            }

            /**
             * Gets the value of the rolltenormonths property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getROLLTENORMONTHS() {
                return rolltenormonths;
            }

            /**
             * Sets the value of the rolltenormonths property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setROLLTENORMONTHS(BigDecimal value) {
                this.rolltenormonths = value;
            }

            /**
             * Gets the value of the rolltenoryears property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getROLLTENORYEARS() {
                return rolltenoryears;
            }

            /**
             * Sets the value of the rolltenoryears property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setROLLTENORYEARS(BigDecimal value) {
                this.rolltenoryears = value;
            }

            /**
             * Gets the value of the deptenorpref property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDEPTENORPREF() {
                return deptenorpref;
            }

            /**
             * Sets the value of the deptenorpref property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDEPTENORPREF(String value) {
                this.deptenorpref = value;
            }

            /**
             * Gets the value of the childtdpayoutdetails property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the childtdpayoutdetails property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getChildtdpayoutdetails().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link IcctdfpoModifyIOType.Tddetailsfpo.Childinttddetails.Childtdpayoutdetails }
             * 
             * 
             */
            public List<IcctdfpoModifyIOType.Tddetailsfpo.Childinttddetails.Childtdpayoutdetails> getChildtdpayoutdetails() {
                if (childtdpayoutdetails == null) {
                    childtdpayoutdetails = new ArrayList<IcctdfpoModifyIOType.Tddetailsfpo.Childinttddetails.Childtdpayoutdetails>();
                }
                return this.childtdpayoutdetails;
            }

            /**
             * Gets the value of the bcpayoutspo property.
             * 
             * @return
             *     possible object is
             *     {@link IcctdfpoModifyIOType.Tddetailsfpo.Childinttddetails.Bcpayoutspo }
             *     
             */
            public IcctdfpoModifyIOType.Tddetailsfpo.Childinttddetails.Bcpayoutspo getBcpayoutspo() {
                return bcpayoutspo;
            }

            /**
             * Sets the value of the bcpayoutspo property.
             * 
             * @param value
             *     allowed object is
             *     {@link IcctdfpoModifyIOType.Tddetailsfpo.Childinttddetails.Bcpayoutspo }
             *     
             */
            public void setBcpayoutspo(IcctdfpoModifyIOType.Tddetailsfpo.Childinttddetails.Bcpayoutspo value) {
                this.bcpayoutspo = value;
            }

            /**
             * Gets the value of the pcpayoutspo property.
             * 
             * @return
             *     possible object is
             *     {@link IcctdfpoModifyIOType.Tddetailsfpo.Childinttddetails.Pcpayoutspo }
             *     
             */
            public IcctdfpoModifyIOType.Tddetailsfpo.Childinttddetails.Pcpayoutspo getPcpayoutspo() {
                return pcpayoutspo;
            }

            /**
             * Sets the value of the pcpayoutspo property.
             * 
             * @param value
             *     allowed object is
             *     {@link IcctdfpoModifyIOType.Tddetailsfpo.Childinttddetails.Pcpayoutspo }
             *     
             */
            public void setPcpayoutspo(IcctdfpoModifyIOType.Tddetailsfpo.Childinttddetails.Pcpayoutspo value) {
                this.pcpayoutspo = value;
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
             *         &lt;element name="BCSPOSTAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="CCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="REFNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="SCODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="MICRNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="TRNDT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
             *         &lt;element name="BANKCODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="CHQAMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
             *         &lt;element name="CHQCCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="CHQDATE" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
             *         &lt;element name="CHQPERCENT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
             *         &lt;element name="XRATE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
             *         &lt;element name="PAYBRN_F" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="BENFNAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="BENFADD1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="BENFADD2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="OTHERDETS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="NARRATIVE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="COUNTRYCODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
                "bcspostat",
                "ccy",
                "refno",
                "scode",
                "micrno",
                "trndt",
                "bankcode",
                "chqamt",
                "chqccy",
                "chqdate",
                "chqpercent",
                "xrate",
                "paybrnf",
                "benfname",
                "benfadd1",
                "benfadd2",
                "otherdets",
                "narrative",
                "countrycode"
            })
            public static class Bcpayoutspo {

                @XmlElement(name = "BCSPOSTAT")
                protected String bcspostat;
                @XmlElement(name = "CCY")
                protected String ccy;
                @XmlElement(name = "REFNO")
                protected String refno;
                @XmlElement(name = "SCODE")
                protected String scode;
                @XmlElement(name = "MICRNO")
                protected String micrno;
                @XmlElement(name = "TRNDT")
                @XmlSchemaType(name = "date")
                protected XMLGregorianCalendar trndt;
                @XmlElement(name = "BANKCODE")
                protected String bankcode;
                @XmlElement(name = "CHQAMT")
                protected BigDecimal chqamt;
                @XmlElement(name = "CHQCCY")
                protected String chqccy;
                @XmlElement(name = "CHQDATE")
                @XmlSchemaType(name = "date")
                protected XMLGregorianCalendar chqdate;
                @XmlElement(name = "CHQPERCENT")
                protected BigDecimal chqpercent;
                @XmlElement(name = "XRATE")
                protected BigDecimal xrate;
                @XmlElement(name = "PAYBRN_F")
                protected String paybrnf;
                @XmlElement(name = "BENFNAME")
                protected String benfname;
                @XmlElement(name = "BENFADD1")
                protected String benfadd1;
                @XmlElement(name = "BENFADD2")
                protected String benfadd2;
                @XmlElement(name = "OTHERDETS")
                protected String otherdets;
                @XmlElement(name = "NARRATIVE")
                protected String narrative;
                @XmlElement(name = "COUNTRYCODE")
                protected String countrycode;

                /**
                 * Gets the value of the bcspostat property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getBCSPOSTAT() {
                    return bcspostat;
                }

                /**
                 * Sets the value of the bcspostat property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setBCSPOSTAT(String value) {
                    this.bcspostat = value;
                }

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
                 * Gets the value of the refno property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getREFNO() {
                    return refno;
                }

                /**
                 * Sets the value of the refno property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setREFNO(String value) {
                    this.refno = value;
                }

                /**
                 * Gets the value of the scode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSCODE() {
                    return scode;
                }

                /**
                 * Sets the value of the scode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSCODE(String value) {
                    this.scode = value;
                }

                /**
                 * Gets the value of the micrno property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getMICRNO() {
                    return micrno;
                }

                /**
                 * Sets the value of the micrno property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setMICRNO(String value) {
                    this.micrno = value;
                }

                /**
                 * Gets the value of the trndt property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public XMLGregorianCalendar getTRNDT() {
                    return trndt;
                }

                /**
                 * Sets the value of the trndt property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public void setTRNDT(XMLGregorianCalendar value) {
                    this.trndt = value;
                }

                /**
                 * Gets the value of the bankcode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getBANKCODE() {
                    return bankcode;
                }

                /**
                 * Sets the value of the bankcode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setBANKCODE(String value) {
                    this.bankcode = value;
                }

                /**
                 * Gets the value of the chqamt property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getCHQAMT() {
                    return chqamt;
                }

                /**
                 * Sets the value of the chqamt property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setCHQAMT(BigDecimal value) {
                    this.chqamt = value;
                }

                /**
                 * Gets the value of the chqccy property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCHQCCY() {
                    return chqccy;
                }

                /**
                 * Sets the value of the chqccy property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCHQCCY(String value) {
                    this.chqccy = value;
                }

                /**
                 * Gets the value of the chqdate property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public XMLGregorianCalendar getCHQDATE() {
                    return chqdate;
                }

                /**
                 * Sets the value of the chqdate property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public void setCHQDATE(XMLGregorianCalendar value) {
                    this.chqdate = value;
                }

                /**
                 * Gets the value of the chqpercent property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getCHQPERCENT() {
                    return chqpercent;
                }

                /**
                 * Sets the value of the chqpercent property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setCHQPERCENT(BigDecimal value) {
                    this.chqpercent = value;
                }

                /**
                 * Gets the value of the xrate property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getXRATE() {
                    return xrate;
                }

                /**
                 * Sets the value of the xrate property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setXRATE(BigDecimal value) {
                    this.xrate = value;
                }

                /**
                 * Gets the value of the paybrnf property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getPAYBRNF() {
                    return paybrnf;
                }

                /**
                 * Sets the value of the paybrnf property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setPAYBRNF(String value) {
                    this.paybrnf = value;
                }

                /**
                 * Gets the value of the benfname property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getBENFNAME() {
                    return benfname;
                }

                /**
                 * Sets the value of the benfname property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setBENFNAME(String value) {
                    this.benfname = value;
                }

                /**
                 * Gets the value of the benfadd1 property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getBENFADD1() {
                    return benfadd1;
                }

                /**
                 * Sets the value of the benfadd1 property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setBENFADD1(String value) {
                    this.benfadd1 = value;
                }

                /**
                 * Gets the value of the benfadd2 property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getBENFADD2() {
                    return benfadd2;
                }

                /**
                 * Sets the value of the benfadd2 property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setBENFADD2(String value) {
                    this.benfadd2 = value;
                }

                /**
                 * Gets the value of the otherdets property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getOTHERDETS() {
                    return otherdets;
                }

                /**
                 * Sets the value of the otherdets property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setOTHERDETS(String value) {
                    this.otherdets = value;
                }

                /**
                 * Gets the value of the narrative property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNARRATIVE() {
                    return narrative;
                }

                /**
                 * Sets the value of the narrative property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNARRATIVE(String value) {
                    this.narrative = value;
                }

                /**
                 * Gets the value of the countrycode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCOUNTRYCODE() {
                    return countrycode;
                }

                /**
                 * Sets the value of the countrycode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCOUNTRYCODE(String value) {
                    this.countrycode = value;
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
             *         &lt;element name="PAYOUTTYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="BANKCODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="OFFBRN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="OFFACC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="OFFCCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="PERCENTAGE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
             *         &lt;element name="REDMAMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
             *         &lt;element name="BENFNAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="BENFADD1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="BENFADD2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="OTHERDETS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="NARRATIVE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="XRATE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
             *         &lt;element name="REFNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="SEQNO" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
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
                "payouttype",
                "bankcode",
                "offbrn",
                "offacc",
                "offccy",
                "percentage",
                "redmamt",
                "benfname",
                "benfadd1",
                "benfadd2",
                "otherdets",
                "narrative",
                "xrate",
                "refno",
                "seqno"
            })
            public static class Childtdpayoutdetails {

                @XmlElement(name = "CCY")
                protected String ccy;
                @XmlElement(name = "PAYOUTTYPE")
                protected String payouttype;
                @XmlElement(name = "BANKCODE")
                protected String bankcode;
                @XmlElement(name = "OFFBRN")
                protected String offbrn;
                @XmlElement(name = "OFFACC")
                protected String offacc;
                @XmlElement(name = "OFFCCY")
                protected String offccy;
                @XmlElement(name = "PERCENTAGE")
                protected BigDecimal percentage;
                @XmlElement(name = "REDMAMT")
                protected BigDecimal redmamt;
                @XmlElement(name = "BENFNAME")
                protected String benfname;
                @XmlElement(name = "BENFADD1")
                protected String benfadd1;
                @XmlElement(name = "BENFADD2")
                protected String benfadd2;
                @XmlElement(name = "OTHERDETS")
                protected String otherdets;
                @XmlElement(name = "NARRATIVE")
                protected String narrative;
                @XmlElement(name = "XRATE")
                protected BigDecimal xrate;
                @XmlElement(name = "REFNO")
                protected String refno;
                @XmlElement(name = "SEQNO")
                protected BigDecimal seqno;

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
                 * Gets the value of the payouttype property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getPAYOUTTYPE() {
                    return payouttype;
                }

                /**
                 * Sets the value of the payouttype property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setPAYOUTTYPE(String value) {
                    this.payouttype = value;
                }

                /**
                 * Gets the value of the bankcode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getBANKCODE() {
                    return bankcode;
                }

                /**
                 * Sets the value of the bankcode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setBANKCODE(String value) {
                    this.bankcode = value;
                }

                /**
                 * Gets the value of the offbrn property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getOFFBRN() {
                    return offbrn;
                }

                /**
                 * Sets the value of the offbrn property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setOFFBRN(String value) {
                    this.offbrn = value;
                }

                /**
                 * Gets the value of the offacc property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getOFFACC() {
                    return offacc;
                }

                /**
                 * Sets the value of the offacc property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setOFFACC(String value) {
                    this.offacc = value;
                }

                /**
                 * Gets the value of the offccy property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getOFFCCY() {
                    return offccy;
                }

                /**
                 * Sets the value of the offccy property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setOFFCCY(String value) {
                    this.offccy = value;
                }

                /**
                 * Gets the value of the percentage property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getPERCENTAGE() {
                    return percentage;
                }

                /**
                 * Sets the value of the percentage property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setPERCENTAGE(BigDecimal value) {
                    this.percentage = value;
                }

                /**
                 * Gets the value of the redmamt property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getREDMAMT() {
                    return redmamt;
                }

                /**
                 * Sets the value of the redmamt property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setREDMAMT(BigDecimal value) {
                    this.redmamt = value;
                }

                /**
                 * Gets the value of the benfname property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getBENFNAME() {
                    return benfname;
                }

                /**
                 * Sets the value of the benfname property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setBENFNAME(String value) {
                    this.benfname = value;
                }

                /**
                 * Gets the value of the benfadd1 property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getBENFADD1() {
                    return benfadd1;
                }

                /**
                 * Sets the value of the benfadd1 property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setBENFADD1(String value) {
                    this.benfadd1 = value;
                }

                /**
                 * Gets the value of the benfadd2 property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getBENFADD2() {
                    return benfadd2;
                }

                /**
                 * Sets the value of the benfadd2 property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setBENFADD2(String value) {
                    this.benfadd2 = value;
                }

                /**
                 * Gets the value of the otherdets property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getOTHERDETS() {
                    return otherdets;
                }

                /**
                 * Sets the value of the otherdets property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setOTHERDETS(String value) {
                    this.otherdets = value;
                }

                /**
                 * Gets the value of the narrative property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNARRATIVE() {
                    return narrative;
                }

                /**
                 * Sets the value of the narrative property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNARRATIVE(String value) {
                    this.narrative = value;
                }

                /**
                 * Gets the value of the xrate property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getXRATE() {
                    return xrate;
                }

                /**
                 * Sets the value of the xrate property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setXRATE(BigDecimal value) {
                    this.xrate = value;
                }

                /**
                 * Gets the value of the refno property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getREFNO() {
                    return refno;
                }

                /**
                 * Sets the value of the refno property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setREFNO(String value) {
                    this.refno = value;
                }

                /**
                 * Gets the value of the seqno property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getSEQNO() {
                    return seqno;
                }

                /**
                 * Sets the value of the seqno property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setSEQNO(BigDecimal value) {
                    this.seqno = value;
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
             *         &lt;element name="PCSPOSTAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="CCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="PCBANKCODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="PCOFFSETBRN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="PCOFFSETACC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="PCOFFSETCCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="PCPERCENTAGE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
             *         &lt;element name="BENFNAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="BENFADD1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="OTHERDETS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="NARRATIVE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="XRATE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
             *         &lt;element name="REFNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
                "pcspostat",
                "ccy",
                "pcbankcode",
                "pcoffsetbrn",
                "pcoffsetacc",
                "pcoffsetccy",
                "pcpercentage",
                "benfname",
                "benfadd1",
                "otherdets",
                "narrative",
                "xrate",
                "refno"
            })
            public static class Pcpayoutspo {

                @XmlElement(name = "PCSPOSTAT")
                protected String pcspostat;
                @XmlElement(name = "CCY")
                protected String ccy;
                @XmlElement(name = "PCBANKCODE")
                protected String pcbankcode;
                @XmlElement(name = "PCOFFSETBRN")
                protected String pcoffsetbrn;
                @XmlElement(name = "PCOFFSETACC")
                protected String pcoffsetacc;
                @XmlElement(name = "PCOFFSETCCY")
                protected String pcoffsetccy;
                @XmlElement(name = "PCPERCENTAGE")
                protected BigDecimal pcpercentage;
                @XmlElement(name = "BENFNAME")
                protected String benfname;
                @XmlElement(name = "BENFADD1")
                protected String benfadd1;
                @XmlElement(name = "OTHERDETS")
                protected String otherdets;
                @XmlElement(name = "NARRATIVE")
                protected String narrative;
                @XmlElement(name = "XRATE")
                protected BigDecimal xrate;
                @XmlElement(name = "REFNO")
                protected String refno;

                /**
                 * Gets the value of the pcspostat property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getPCSPOSTAT() {
                    return pcspostat;
                }

                /**
                 * Sets the value of the pcspostat property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setPCSPOSTAT(String value) {
                    this.pcspostat = value;
                }

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
                 * Gets the value of the pcbankcode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getPCBANKCODE() {
                    return pcbankcode;
                }

                /**
                 * Sets the value of the pcbankcode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setPCBANKCODE(String value) {
                    this.pcbankcode = value;
                }

                /**
                 * Gets the value of the pcoffsetbrn property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getPCOFFSETBRN() {
                    return pcoffsetbrn;
                }

                /**
                 * Sets the value of the pcoffsetbrn property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setPCOFFSETBRN(String value) {
                    this.pcoffsetbrn = value;
                }

                /**
                 * Gets the value of the pcoffsetacc property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getPCOFFSETACC() {
                    return pcoffsetacc;
                }

                /**
                 * Sets the value of the pcoffsetacc property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setPCOFFSETACC(String value) {
                    this.pcoffsetacc = value;
                }

                /**
                 * Gets the value of the pcoffsetccy property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getPCOFFSETCCY() {
                    return pcoffsetccy;
                }

                /**
                 * Sets the value of the pcoffsetccy property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setPCOFFSETCCY(String value) {
                    this.pcoffsetccy = value;
                }

                /**
                 * Gets the value of the pcpercentage property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getPCPERCENTAGE() {
                    return pcpercentage;
                }

                /**
                 * Sets the value of the pcpercentage property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setPCPERCENTAGE(BigDecimal value) {
                    this.pcpercentage = value;
                }

                /**
                 * Gets the value of the benfname property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getBENFNAME() {
                    return benfname;
                }

                /**
                 * Sets the value of the benfname property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setBENFNAME(String value) {
                    this.benfname = value;
                }

                /**
                 * Gets the value of the benfadd1 property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getBENFADD1() {
                    return benfadd1;
                }

                /**
                 * Sets the value of the benfadd1 property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setBENFADD1(String value) {
                    this.benfadd1 = value;
                }

                /**
                 * Gets the value of the otherdets property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getOTHERDETS() {
                    return otherdets;
                }

                /**
                 * Sets the value of the otherdets property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setOTHERDETS(String value) {
                    this.otherdets = value;
                }

                /**
                 * Gets the value of the narrative property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNARRATIVE() {
                    return narrative;
                }

                /**
                 * Sets the value of the narrative property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNARRATIVE(String value) {
                    this.narrative = value;
                }

                /**
                 * Gets the value of the xrate property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getXRATE() {
                    return xrate;
                }

                /**
                 * Sets the value of the xrate property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setXRATE(BigDecimal value) {
                    this.xrate = value;
                }

                /**
                 * Gets the value of the refno property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getREFNO() {
                    return refno;
                }

                /**
                 * Sets the value of the refno property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setREFNO(String value) {
                    this.refno = value;
                }

            }

        }

    }

}
