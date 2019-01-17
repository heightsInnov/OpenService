
package com.ofss.fcubs.service.fcubsldservice;

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
 * <p>Java class for Product-Create-IO-Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Product-Create-IO-Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PRDCD" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PRDDESC" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PRDSLG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PRDGRP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PRDSTRTDT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="PRDENDDT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="PRDRMRKS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RTCODEPRFERD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PMNTMTHD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PRDSCHTYP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DFLTCLSTR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACCRFREQ" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACCRSTRTMNTH" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ACCRSTRTDT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="COLCTDRNGAMNDT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MINTNR" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="MAXTNR" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="STDTNR" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="TNRUNIT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RKYCCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RKYVALDAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RKYCNTRCTAMT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RKYMATURTYDT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RKYCPRTY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RKYRATAMT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NRMLRATVAR" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="MAXRATVAR" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="LIQDTNDMODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="APYCALC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PREPMNTPNLTY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RECMPUTESCHDLS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FWDDATNGALLWD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PRTIALPYMNTMLIQ" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TAXAPPLCBL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CRTIFCATEOFDEP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ROLOVRALLWD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DYSFORAPYCALC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ALLWPRTIALREDNONCMNT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VRFY_DRWDNAMT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MAXNOOFLNS" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="LNPRD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ALLWSCHEAMNDAFTRSGEN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SGENREQD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NOTCREQD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DMNDBASIS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AUTOACC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACCCLSS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="USRDEFSCHD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LOANSTMTCYCL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="STMNTDAY" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="LOANSTMTTYP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AUTPROVREQD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PROVCCYTYP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PROVFREQ" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TRSAPPLCBL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TRSRAT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="TRSLNKDTO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TRSMINCCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TRSMINAMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="HOLDYCCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CONSDRBRNHOL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IGNRHOLDYS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CSCDESCHDLS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MVACRSMNTHS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SCHDLEMVMNT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MINAMTCCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MINAMTPREPMNTPNLTY" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="PRTCPNTPRD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PRDDESCLS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CASCDEPRTCPTN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HOLDFLTBASIS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TRNCHETYP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UTLIZTNREVALREQD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="REVALTNFREQ" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="REVALSTRTMNTH" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="REVALSTRTDT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="REVALTNRATCD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="REVALTNRATTYP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Rollover-Details" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="RLOVRICCFFRM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="APLYTAX" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="RLOVRWITHINT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="DEDCTTAXONRLOVR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="AUTOMANRLOVR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="RLOVRMECHNSM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Default-Schedules" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="CMPNT" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="REF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="FREQ" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="FREQUNIT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="STRTDAY" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="STRTMNTH" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="STRTDT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="MORATRMPERDUNIT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="MORATRMPERD" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Liquidation-Order" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="CMPNT" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="LIQORDR" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Grace-Levels" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="LVLNO" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *                   &lt;element name="NOOFUNITS" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="UNIT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Ccy-Days-Details" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="CCY" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="EXCRATFXNGDAYS" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="INTRATFXNGDAYS" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Trs-Components-Details" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="COMPNT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Status-Master-Details" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="STATUS" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="TRANSACTIONCD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="STPACCRUALS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="REVERSEACCRUALS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="COMPLETEACCRUALS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="TRNSFRCAPITLIZDINCM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="AUTOFRWD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="AUTOREVERSE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="DERVTNRUL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="RBKPROVSN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="Status-Advices-Details" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="MESSAGECD" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Product-Status-Gl-Details" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="ACCNTROLE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="UPWARDTRANFERFRMGL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="TRNSFERGL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="DWNWRDTRANSFERFRMGL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="DWNWRDTRANSFERTOGL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Acc-Status-Gl-Details" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="ACCROL" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="ACCHD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
 *         &lt;element name="Tax-Scheme" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="SCHME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="Tax-Details" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="RUL" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="BASISAMNTTAG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="COMPTATIONEVNT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="TYP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Ccy-Tax-Details" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="RULE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="CCY" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="MAXTAXINTPERD" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                                       &lt;element name="PERDUNIT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="MININTTAXAMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
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
 *         &lt;element name="Product-Interest" type="{http://fcubs.ofss.com/service/FCUBSLDService}ProductInterest-Create-IO-Type" minOccurs="0"/>
 *         &lt;element name="Product-Accrual-Fee" type="{http://fcubs.ofss.com/service/FCUBSLDService}ProdAccrualFee-Create-IO-Type" minOccurs="0"/>
 *         &lt;element name="Product-Charges" type="{http://fcubs.ofss.com/service/FCUBSLDService}ProductCharges-Create-IO-Type" minOccurs="0"/>
 *         &lt;element name="Product-Events" type="{http://fcubs.ofss.com/service/FCUBSLDService}ProdEventDtls-Create-IO-Type" minOccurs="0"/>
 *         &lt;element name="Role-To-Head-Mapping" type="{http://fcubs.ofss.com/service/FCUBSLDService}RoleToHeadMapping-Create-IO-Type" minOccurs="0"/>
 *         &lt;element name="Prod-Cust-Restrictions" type="{http://fcubs.ofss.com/service/FCUBSLDService}CustRestriction-Create-IO-Type" minOccurs="0"/>
 *         &lt;element name="Branch-Ccy-Restrictions" type="{http://fcubs.ofss.com/service/FCUBSLDService}BranchRestriction-Create-IO-Type" minOccurs="0"/>
 *         &lt;element name="Product-Fields" type="{http://fcubs.ofss.com/service/FCUBSLDService}ProductUDF-Create-IO-Type" minOccurs="0"/>
 *         &lt;element name="Product-Discount-Accrual" type="{http://fcubs.ofss.com/service/FCUBSLDService}ProdDiscAccr-Create-IO-Type" minOccurs="0"/>
 *         &lt;element name="Product-Mis-Details" type="{http://fcubs.ofss.com/service/FCUBSLDService}ProdMisDetails-Create-IO-Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Product-Create-IO-Type", propOrder = {
    "prdcd",
    "prddesc",
    "prdslg",
    "prdgrp",
    "desc",
    "prdstrtdt",
    "prdenddt",
    "prdrmrks",
    "rtcodeprferd",
    "pmntmthd",
    "prdschtyp",
    "dfltclstr",
    "accrfreq",
    "accrstrtmnth",
    "accrstrtdt",
    "colctdrngamndt",
    "mintnr",
    "maxtnr",
    "stdtnr",
    "tnrunit",
    "rkyccy",
    "rkyvaldat",
    "rkycntrctamt",
    "rkymaturtydt",
    "rkycprty",
    "rkyratamt",
    "nrmlratvar",
    "maxratvar",
    "liqdtndmode",
    "apycalc",
    "prepmntpnlty",
    "recmputeschdls",
    "fwddatngallwd",
    "prtialpymntmliq",
    "taxapplcbl",
    "crtifcateofdep",
    "rolovrallwd",
    "dysforapycalc",
    "allwprtialrednoncmnt",
    "vrfydrwdnamt",
    "maxnooflns",
    "lnprd",
    "allwscheamndaftrsgen",
    "sgenreqd",
    "notcreqd",
    "dmndbasis",
    "autoacc",
    "accclss",
    "usrdefschd",
    "loanstmtcycl",
    "stmntday",
    "loanstmttyp",
    "autprovreqd",
    "provccytyp",
    "provfreq",
    "trsapplcbl",
    "trsrat",
    "trslnkdto",
    "trsminccy",
    "trsminamt",
    "holdyccy",
    "consdrbrnhol",
    "ignrholdys",
    "cscdeschdls",
    "mvacrsmnths",
    "schdlemvmnt",
    "minamtccy",
    "minamtprepmntpnlty",
    "prtcpntprd",
    "prddescls",
    "cascdeprtcptn",
    "holdfltbasis",
    "trnchetyp",
    "utliztnrevalreqd",
    "revaltnfreq",
    "revalstrtmnth",
    "revalstrtdt",
    "revaltnratcd",
    "revaltnrattyp",
    "rolloverDetails",
    "defaultSchedules",
    "liquidationOrder",
    "graceLevels",
    "ccyDaysDetails",
    "trsComponentsDetails",
    "statusMasterDetails",
    "taxScheme",
    "productInterest",
    "productAccrualFee",
    "productCharges",
    "productEvents",
    "roleToHeadMapping",
    "prodCustRestrictions",
    "branchCcyRestrictions",
    "productFields",
    "productDiscountAccrual",
    "productMisDetails"
})
public class ProductCreateIOType {

    @XmlElement(name = "PRDCD", required = true)
    protected String prdcd;
    @XmlElement(name = "PRDDESC", required = true)
    protected String prddesc;
    @XmlElement(name = "PRDSLG")
    protected String prdslg;
    @XmlElement(name = "PRDGRP")
    protected String prdgrp;
    @XmlElement(name = "DESC")
    protected String desc;
    @XmlElement(name = "PRDSTRTDT")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar prdstrtdt;
    @XmlElement(name = "PRDENDDT")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar prdenddt;
    @XmlElement(name = "PRDRMRKS")
    protected String prdrmrks;
    @XmlElement(name = "RTCODEPRFERD")
    protected String rtcodeprferd;
    @XmlElement(name = "PMNTMTHD")
    protected String pmntmthd;
    @XmlElement(name = "PRDSCHTYP")
    protected String prdschtyp;
    @XmlElement(name = "DFLTCLSTR")
    protected String dfltclstr;
    @XmlElement(name = "ACCRFREQ")
    protected String accrfreq;
    @XmlElement(name = "ACCRSTRTMNTH")
    protected BigDecimal accrstrtmnth;
    @XmlElement(name = "ACCRSTRTDT")
    protected BigDecimal accrstrtdt;
    @XmlElement(name = "COLCTDRNGAMNDT")
    protected String colctdrngamndt;
    @XmlElement(name = "MINTNR")
    protected BigDecimal mintnr;
    @XmlElement(name = "MAXTNR")
    protected BigDecimal maxtnr;
    @XmlElement(name = "STDTNR")
    protected BigDecimal stdtnr;
    @XmlElement(name = "TNRUNIT")
    protected String tnrunit;
    @XmlElement(name = "RKYCCY")
    protected String rkyccy;
    @XmlElement(name = "RKYVALDAT")
    protected String rkyvaldat;
    @XmlElement(name = "RKYCNTRCTAMT")
    protected String rkycntrctamt;
    @XmlElement(name = "RKYMATURTYDT")
    protected String rkymaturtydt;
    @XmlElement(name = "RKYCPRTY")
    protected String rkycprty;
    @XmlElement(name = "RKYRATAMT")
    protected String rkyratamt;
    @XmlElement(name = "NRMLRATVAR")
    protected BigDecimal nrmlratvar;
    @XmlElement(name = "MAXRATVAR")
    protected BigDecimal maxratvar;
    @XmlElement(name = "LIQDTNDMODE")
    protected String liqdtndmode;
    @XmlElement(name = "APYCALC")
    protected String apycalc;
    @XmlElement(name = "PREPMNTPNLTY")
    protected String prepmntpnlty;
    @XmlElement(name = "RECMPUTESCHDLS")
    protected String recmputeschdls;
    @XmlElement(name = "FWDDATNGALLWD")
    protected String fwddatngallwd;
    @XmlElement(name = "PRTIALPYMNTMLIQ")
    protected String prtialpymntmliq;
    @XmlElement(name = "TAXAPPLCBL")
    protected String taxapplcbl;
    @XmlElement(name = "CRTIFCATEOFDEP")
    protected String crtifcateofdep;
    @XmlElement(name = "ROLOVRALLWD")
    protected String rolovrallwd;
    @XmlElement(name = "DYSFORAPYCALC")
    protected BigDecimal dysforapycalc;
    @XmlElement(name = "ALLWPRTIALREDNONCMNT")
    protected String allwprtialrednoncmnt;
    @XmlElement(name = "VRFY_DRWDNAMT")
    protected String vrfydrwdnamt;
    @XmlElement(name = "MAXNOOFLNS")
    protected BigDecimal maxnooflns;
    @XmlElement(name = "LNPRD")
    protected String lnprd;
    @XmlElement(name = "ALLWSCHEAMNDAFTRSGEN")
    protected String allwscheamndaftrsgen;
    @XmlElement(name = "SGENREQD")
    protected String sgenreqd;
    @XmlElement(name = "NOTCREQD")
    protected String notcreqd;
    @XmlElement(name = "DMNDBASIS")
    protected String dmndbasis;
    @XmlElement(name = "AUTOACC")
    protected String autoacc;
    @XmlElement(name = "ACCCLSS")
    protected String accclss;
    @XmlElement(name = "USRDEFSCHD")
    protected String usrdefschd;
    @XmlElement(name = "LOANSTMTCYCL")
    protected String loanstmtcycl;
    @XmlElement(name = "STMNTDAY")
    protected BigDecimal stmntday;
    @XmlElement(name = "LOANSTMTTYP")
    protected String loanstmttyp;
    @XmlElement(name = "AUTPROVREQD")
    protected String autprovreqd;
    @XmlElement(name = "PROVCCYTYP")
    protected String provccytyp;
    @XmlElement(name = "PROVFREQ")
    protected String provfreq;
    @XmlElement(name = "TRSAPPLCBL")
    protected String trsapplcbl;
    @XmlElement(name = "TRSRAT")
    protected BigDecimal trsrat;
    @XmlElement(name = "TRSLNKDTO")
    protected String trslnkdto;
    @XmlElement(name = "TRSMINCCY")
    protected String trsminccy;
    @XmlElement(name = "TRSMINAMT")
    protected BigDecimal trsminamt;
    @XmlElement(name = "HOLDYCCY")
    protected String holdyccy;
    @XmlElement(name = "CONSDRBRNHOL")
    protected String consdrbrnhol;
    @XmlElement(name = "IGNRHOLDYS")
    protected String ignrholdys;
    @XmlElement(name = "CSCDESCHDLS")
    protected String cscdeschdls;
    @XmlElement(name = "MVACRSMNTHS")
    protected String mvacrsmnths;
    @XmlElement(name = "SCHDLEMVMNT")
    protected String schdlemvmnt;
    @XmlElement(name = "MINAMTCCY")
    protected String minamtccy;
    @XmlElement(name = "MINAMTPREPMNTPNLTY")
    protected BigDecimal minamtprepmntpnlty;
    @XmlElement(name = "PRTCPNTPRD")
    protected String prtcpntprd;
    @XmlElement(name = "PRDDESCLS")
    protected String prddescls;
    @XmlElement(name = "CASCDEPRTCPTN")
    protected String cascdeprtcptn;
    @XmlElement(name = "HOLDFLTBASIS")
    protected String holdfltbasis;
    @XmlElement(name = "TRNCHETYP")
    protected String trnchetyp;
    @XmlElement(name = "UTLIZTNREVALREQD")
    protected String utliztnrevalreqd;
    @XmlElement(name = "REVALTNFREQ")
    protected String revaltnfreq;
    @XmlElement(name = "REVALSTRTMNTH")
    protected BigDecimal revalstrtmnth;
    @XmlElement(name = "REVALSTRTDT")
    protected BigDecimal revalstrtdt;
    @XmlElement(name = "REVALTNRATCD")
    protected String revaltnratcd;
    @XmlElement(name = "REVALTNRATTYP")
    protected String revaltnrattyp;
    @XmlElement(name = "Rollover-Details")
    protected ProductCreateIOType.RolloverDetails rolloverDetails;
    @XmlElement(name = "Default-Schedules")
    protected List<ProductCreateIOType.DefaultSchedules> defaultSchedules;
    @XmlElement(name = "Liquidation-Order")
    protected List<ProductCreateIOType.LiquidationOrder> liquidationOrder;
    @XmlElement(name = "Grace-Levels")
    protected List<ProductCreateIOType.GraceLevels> graceLevels;
    @XmlElement(name = "Ccy-Days-Details")
    protected List<ProductCreateIOType.CcyDaysDetails> ccyDaysDetails;
    @XmlElement(name = "Trs-Components-Details")
    protected List<ProductCreateIOType.TrsComponentsDetails> trsComponentsDetails;
    @XmlElement(name = "Status-Master-Details")
    protected List<ProductCreateIOType.StatusMasterDetails> statusMasterDetails;
    @XmlElement(name = "Tax-Scheme")
    protected ProductCreateIOType.TaxScheme taxScheme;
    @XmlElement(name = "Product-Interest")
    protected ProductInterestCreateIOType productInterest;
    @XmlElement(name = "Product-Accrual-Fee")
    protected ProdAccrualFeeCreateIOType productAccrualFee;
    @XmlElement(name = "Product-Charges")
    protected ProductChargesCreateIOType productCharges;
    @XmlElement(name = "Product-Events")
    protected ProdEventDtlsCreateIOType productEvents;
    @XmlElement(name = "Role-To-Head-Mapping")
    protected RoleToHeadMappingCreateIOType roleToHeadMapping;
    @XmlElement(name = "Prod-Cust-Restrictions")
    protected CustRestrictionCreateIOType prodCustRestrictions;
    @XmlElement(name = "Branch-Ccy-Restrictions")
    protected BranchRestrictionCreateIOType branchCcyRestrictions;
    @XmlElement(name = "Product-Fields")
    protected ProductUDFCreateIOType productFields;
    @XmlElement(name = "Product-Discount-Accrual")
    protected ProdDiscAccrCreateIOType productDiscountAccrual;
    @XmlElement(name = "Product-Mis-Details")
    protected ProdMisDetailsCreateIOType productMisDetails;

    /**
     * Gets the value of the prdcd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRDCD() {
        return prdcd;
    }

    /**
     * Sets the value of the prdcd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRDCD(String value) {
        this.prdcd = value;
    }

    /**
     * Gets the value of the prddesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRDDESC() {
        return prddesc;
    }

    /**
     * Sets the value of the prddesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRDDESC(String value) {
        this.prddesc = value;
    }

    /**
     * Gets the value of the prdslg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRDSLG() {
        return prdslg;
    }

    /**
     * Sets the value of the prdslg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRDSLG(String value) {
        this.prdslg = value;
    }

    /**
     * Gets the value of the prdgrp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRDGRP() {
        return prdgrp;
    }

    /**
     * Sets the value of the prdgrp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRDGRP(String value) {
        this.prdgrp = value;
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

    /**
     * Gets the value of the prdstrtdt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPRDSTRTDT() {
        return prdstrtdt;
    }

    /**
     * Sets the value of the prdstrtdt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPRDSTRTDT(XMLGregorianCalendar value) {
        this.prdstrtdt = value;
    }

    /**
     * Gets the value of the prdenddt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPRDENDDT() {
        return prdenddt;
    }

    /**
     * Sets the value of the prdenddt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPRDENDDT(XMLGregorianCalendar value) {
        this.prdenddt = value;
    }

    /**
     * Gets the value of the prdrmrks property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRDRMRKS() {
        return prdrmrks;
    }

    /**
     * Sets the value of the prdrmrks property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRDRMRKS(String value) {
        this.prdrmrks = value;
    }

    /**
     * Gets the value of the rtcodeprferd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRTCODEPRFERD() {
        return rtcodeprferd;
    }

    /**
     * Sets the value of the rtcodeprferd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRTCODEPRFERD(String value) {
        this.rtcodeprferd = value;
    }

    /**
     * Gets the value of the pmntmthd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPMNTMTHD() {
        return pmntmthd;
    }

    /**
     * Sets the value of the pmntmthd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPMNTMTHD(String value) {
        this.pmntmthd = value;
    }

    /**
     * Gets the value of the prdschtyp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRDSCHTYP() {
        return prdschtyp;
    }

    /**
     * Sets the value of the prdschtyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRDSCHTYP(String value) {
        this.prdschtyp = value;
    }

    /**
     * Gets the value of the dfltclstr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDFLTCLSTR() {
        return dfltclstr;
    }

    /**
     * Sets the value of the dfltclstr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDFLTCLSTR(String value) {
        this.dfltclstr = value;
    }

    /**
     * Gets the value of the accrfreq property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACCRFREQ() {
        return accrfreq;
    }

    /**
     * Sets the value of the accrfreq property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACCRFREQ(String value) {
        this.accrfreq = value;
    }

    /**
     * Gets the value of the accrstrtmnth property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getACCRSTRTMNTH() {
        return accrstrtmnth;
    }

    /**
     * Sets the value of the accrstrtmnth property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setACCRSTRTMNTH(BigDecimal value) {
        this.accrstrtmnth = value;
    }

    /**
     * Gets the value of the accrstrtdt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getACCRSTRTDT() {
        return accrstrtdt;
    }

    /**
     * Sets the value of the accrstrtdt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setACCRSTRTDT(BigDecimal value) {
        this.accrstrtdt = value;
    }

    /**
     * Gets the value of the colctdrngamndt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCOLCTDRNGAMNDT() {
        return colctdrngamndt;
    }

    /**
     * Sets the value of the colctdrngamndt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCOLCTDRNGAMNDT(String value) {
        this.colctdrngamndt = value;
    }

    /**
     * Gets the value of the mintnr property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMINTNR() {
        return mintnr;
    }

    /**
     * Sets the value of the mintnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMINTNR(BigDecimal value) {
        this.mintnr = value;
    }

    /**
     * Gets the value of the maxtnr property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMAXTNR() {
        return maxtnr;
    }

    /**
     * Sets the value of the maxtnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMAXTNR(BigDecimal value) {
        this.maxtnr = value;
    }

    /**
     * Gets the value of the stdtnr property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSTDTNR() {
        return stdtnr;
    }

    /**
     * Sets the value of the stdtnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSTDTNR(BigDecimal value) {
        this.stdtnr = value;
    }

    /**
     * Gets the value of the tnrunit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTNRUNIT() {
        return tnrunit;
    }

    /**
     * Sets the value of the tnrunit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTNRUNIT(String value) {
        this.tnrunit = value;
    }

    /**
     * Gets the value of the rkyccy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRKYCCY() {
        return rkyccy;
    }

    /**
     * Sets the value of the rkyccy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRKYCCY(String value) {
        this.rkyccy = value;
    }

    /**
     * Gets the value of the rkyvaldat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRKYVALDAT() {
        return rkyvaldat;
    }

    /**
     * Sets the value of the rkyvaldat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRKYVALDAT(String value) {
        this.rkyvaldat = value;
    }

    /**
     * Gets the value of the rkycntrctamt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRKYCNTRCTAMT() {
        return rkycntrctamt;
    }

    /**
     * Sets the value of the rkycntrctamt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRKYCNTRCTAMT(String value) {
        this.rkycntrctamt = value;
    }

    /**
     * Gets the value of the rkymaturtydt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRKYMATURTYDT() {
        return rkymaturtydt;
    }

    /**
     * Sets the value of the rkymaturtydt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRKYMATURTYDT(String value) {
        this.rkymaturtydt = value;
    }

    /**
     * Gets the value of the rkycprty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRKYCPRTY() {
        return rkycprty;
    }

    /**
     * Sets the value of the rkycprty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRKYCPRTY(String value) {
        this.rkycprty = value;
    }

    /**
     * Gets the value of the rkyratamt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRKYRATAMT() {
        return rkyratamt;
    }

    /**
     * Sets the value of the rkyratamt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRKYRATAMT(String value) {
        this.rkyratamt = value;
    }

    /**
     * Gets the value of the nrmlratvar property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNRMLRATVAR() {
        return nrmlratvar;
    }

    /**
     * Sets the value of the nrmlratvar property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNRMLRATVAR(BigDecimal value) {
        this.nrmlratvar = value;
    }

    /**
     * Gets the value of the maxratvar property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMAXRATVAR() {
        return maxratvar;
    }

    /**
     * Sets the value of the maxratvar property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMAXRATVAR(BigDecimal value) {
        this.maxratvar = value;
    }

    /**
     * Gets the value of the liqdtndmode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLIQDTNDMODE() {
        return liqdtndmode;
    }

    /**
     * Sets the value of the liqdtndmode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLIQDTNDMODE(String value) {
        this.liqdtndmode = value;
    }

    /**
     * Gets the value of the apycalc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPYCALC() {
        return apycalc;
    }

    /**
     * Sets the value of the apycalc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPYCALC(String value) {
        this.apycalc = value;
    }

    /**
     * Gets the value of the prepmntpnlty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPREPMNTPNLTY() {
        return prepmntpnlty;
    }

    /**
     * Sets the value of the prepmntpnlty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPREPMNTPNLTY(String value) {
        this.prepmntpnlty = value;
    }

    /**
     * Gets the value of the recmputeschdls property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRECMPUTESCHDLS() {
        return recmputeschdls;
    }

    /**
     * Sets the value of the recmputeschdls property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRECMPUTESCHDLS(String value) {
        this.recmputeschdls = value;
    }

    /**
     * Gets the value of the fwddatngallwd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFWDDATNGALLWD() {
        return fwddatngallwd;
    }

    /**
     * Sets the value of the fwddatngallwd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFWDDATNGALLWD(String value) {
        this.fwddatngallwd = value;
    }

    /**
     * Gets the value of the prtialpymntmliq property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRTIALPYMNTMLIQ() {
        return prtialpymntmliq;
    }

    /**
     * Sets the value of the prtialpymntmliq property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRTIALPYMNTMLIQ(String value) {
        this.prtialpymntmliq = value;
    }

    /**
     * Gets the value of the taxapplcbl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTAXAPPLCBL() {
        return taxapplcbl;
    }

    /**
     * Sets the value of the taxapplcbl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTAXAPPLCBL(String value) {
        this.taxapplcbl = value;
    }

    /**
     * Gets the value of the crtifcateofdep property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCRTIFCATEOFDEP() {
        return crtifcateofdep;
    }

    /**
     * Sets the value of the crtifcateofdep property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCRTIFCATEOFDEP(String value) {
        this.crtifcateofdep = value;
    }

    /**
     * Gets the value of the rolovrallwd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getROLOVRALLWD() {
        return rolovrallwd;
    }

    /**
     * Sets the value of the rolovrallwd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setROLOVRALLWD(String value) {
        this.rolovrallwd = value;
    }

    /**
     * Gets the value of the dysforapycalc property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDYSFORAPYCALC() {
        return dysforapycalc;
    }

    /**
     * Sets the value of the dysforapycalc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDYSFORAPYCALC(BigDecimal value) {
        this.dysforapycalc = value;
    }

    /**
     * Gets the value of the allwprtialrednoncmnt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getALLWPRTIALREDNONCMNT() {
        return allwprtialrednoncmnt;
    }

    /**
     * Sets the value of the allwprtialrednoncmnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setALLWPRTIALREDNONCMNT(String value) {
        this.allwprtialrednoncmnt = value;
    }

    /**
     * Gets the value of the vrfydrwdnamt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVRFYDRWDNAMT() {
        return vrfydrwdnamt;
    }

    /**
     * Sets the value of the vrfydrwdnamt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVRFYDRWDNAMT(String value) {
        this.vrfydrwdnamt = value;
    }

    /**
     * Gets the value of the maxnooflns property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMAXNOOFLNS() {
        return maxnooflns;
    }

    /**
     * Sets the value of the maxnooflns property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMAXNOOFLNS(BigDecimal value) {
        this.maxnooflns = value;
    }

    /**
     * Gets the value of the lnprd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLNPRD() {
        return lnprd;
    }

    /**
     * Sets the value of the lnprd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLNPRD(String value) {
        this.lnprd = value;
    }

    /**
     * Gets the value of the allwscheamndaftrsgen property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getALLWSCHEAMNDAFTRSGEN() {
        return allwscheamndaftrsgen;
    }

    /**
     * Sets the value of the allwscheamndaftrsgen property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setALLWSCHEAMNDAFTRSGEN(String value) {
        this.allwscheamndaftrsgen = value;
    }

    /**
     * Gets the value of the sgenreqd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSGENREQD() {
        return sgenreqd;
    }

    /**
     * Sets the value of the sgenreqd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSGENREQD(String value) {
        this.sgenreqd = value;
    }

    /**
     * Gets the value of the notcreqd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNOTCREQD() {
        return notcreqd;
    }

    /**
     * Sets the value of the notcreqd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNOTCREQD(String value) {
        this.notcreqd = value;
    }

    /**
     * Gets the value of the dmndbasis property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDMNDBASIS() {
        return dmndbasis;
    }

    /**
     * Sets the value of the dmndbasis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDMNDBASIS(String value) {
        this.dmndbasis = value;
    }

    /**
     * Gets the value of the autoacc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAUTOACC() {
        return autoacc;
    }

    /**
     * Sets the value of the autoacc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAUTOACC(String value) {
        this.autoacc = value;
    }

    /**
     * Gets the value of the accclss property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACCCLSS() {
        return accclss;
    }

    /**
     * Sets the value of the accclss property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACCCLSS(String value) {
        this.accclss = value;
    }

    /**
     * Gets the value of the usrdefschd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUSRDEFSCHD() {
        return usrdefschd;
    }

    /**
     * Sets the value of the usrdefschd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUSRDEFSCHD(String value) {
        this.usrdefschd = value;
    }

    /**
     * Gets the value of the loanstmtcycl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLOANSTMTCYCL() {
        return loanstmtcycl;
    }

    /**
     * Sets the value of the loanstmtcycl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLOANSTMTCYCL(String value) {
        this.loanstmtcycl = value;
    }

    /**
     * Gets the value of the stmntday property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSTMNTDAY() {
        return stmntday;
    }

    /**
     * Sets the value of the stmntday property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSTMNTDAY(BigDecimal value) {
        this.stmntday = value;
    }

    /**
     * Gets the value of the loanstmttyp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLOANSTMTTYP() {
        return loanstmttyp;
    }

    /**
     * Sets the value of the loanstmttyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLOANSTMTTYP(String value) {
        this.loanstmttyp = value;
    }

    /**
     * Gets the value of the autprovreqd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAUTPROVREQD() {
        return autprovreqd;
    }

    /**
     * Sets the value of the autprovreqd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAUTPROVREQD(String value) {
        this.autprovreqd = value;
    }

    /**
     * Gets the value of the provccytyp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPROVCCYTYP() {
        return provccytyp;
    }

    /**
     * Sets the value of the provccytyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPROVCCYTYP(String value) {
        this.provccytyp = value;
    }

    /**
     * Gets the value of the provfreq property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPROVFREQ() {
        return provfreq;
    }

    /**
     * Sets the value of the provfreq property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPROVFREQ(String value) {
        this.provfreq = value;
    }

    /**
     * Gets the value of the trsapplcbl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTRSAPPLCBL() {
        return trsapplcbl;
    }

    /**
     * Sets the value of the trsapplcbl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTRSAPPLCBL(String value) {
        this.trsapplcbl = value;
    }

    /**
     * Gets the value of the trsrat property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTRSRAT() {
        return trsrat;
    }

    /**
     * Sets the value of the trsrat property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTRSRAT(BigDecimal value) {
        this.trsrat = value;
    }

    /**
     * Gets the value of the trslnkdto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTRSLNKDTO() {
        return trslnkdto;
    }

    /**
     * Sets the value of the trslnkdto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTRSLNKDTO(String value) {
        this.trslnkdto = value;
    }

    /**
     * Gets the value of the trsminccy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTRSMINCCY() {
        return trsminccy;
    }

    /**
     * Sets the value of the trsminccy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTRSMINCCY(String value) {
        this.trsminccy = value;
    }

    /**
     * Gets the value of the trsminamt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTRSMINAMT() {
        return trsminamt;
    }

    /**
     * Sets the value of the trsminamt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTRSMINAMT(BigDecimal value) {
        this.trsminamt = value;
    }

    /**
     * Gets the value of the holdyccy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHOLDYCCY() {
        return holdyccy;
    }

    /**
     * Sets the value of the holdyccy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHOLDYCCY(String value) {
        this.holdyccy = value;
    }

    /**
     * Gets the value of the consdrbrnhol property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCONSDRBRNHOL() {
        return consdrbrnhol;
    }

    /**
     * Sets the value of the consdrbrnhol property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCONSDRBRNHOL(String value) {
        this.consdrbrnhol = value;
    }

    /**
     * Gets the value of the ignrholdys property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIGNRHOLDYS() {
        return ignrholdys;
    }

    /**
     * Sets the value of the ignrholdys property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIGNRHOLDYS(String value) {
        this.ignrholdys = value;
    }

    /**
     * Gets the value of the cscdeschdls property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCSCDESCHDLS() {
        return cscdeschdls;
    }

    /**
     * Sets the value of the cscdeschdls property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCSCDESCHDLS(String value) {
        this.cscdeschdls = value;
    }

    /**
     * Gets the value of the mvacrsmnths property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMVACRSMNTHS() {
        return mvacrsmnths;
    }

    /**
     * Sets the value of the mvacrsmnths property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMVACRSMNTHS(String value) {
        this.mvacrsmnths = value;
    }

    /**
     * Gets the value of the schdlemvmnt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSCHDLEMVMNT() {
        return schdlemvmnt;
    }

    /**
     * Sets the value of the schdlemvmnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSCHDLEMVMNT(String value) {
        this.schdlemvmnt = value;
    }

    /**
     * Gets the value of the minamtccy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMINAMTCCY() {
        return minamtccy;
    }

    /**
     * Sets the value of the minamtccy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMINAMTCCY(String value) {
        this.minamtccy = value;
    }

    /**
     * Gets the value of the minamtprepmntpnlty property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMINAMTPREPMNTPNLTY() {
        return minamtprepmntpnlty;
    }

    /**
     * Sets the value of the minamtprepmntpnlty property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMINAMTPREPMNTPNLTY(BigDecimal value) {
        this.minamtprepmntpnlty = value;
    }

    /**
     * Gets the value of the prtcpntprd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRTCPNTPRD() {
        return prtcpntprd;
    }

    /**
     * Sets the value of the prtcpntprd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRTCPNTPRD(String value) {
        this.prtcpntprd = value;
    }

    /**
     * Gets the value of the prddescls property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRDDESCLS() {
        return prddescls;
    }

    /**
     * Sets the value of the prddescls property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRDDESCLS(String value) {
        this.prddescls = value;
    }

    /**
     * Gets the value of the cascdeprtcptn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCASCDEPRTCPTN() {
        return cascdeprtcptn;
    }

    /**
     * Sets the value of the cascdeprtcptn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCASCDEPRTCPTN(String value) {
        this.cascdeprtcptn = value;
    }

    /**
     * Gets the value of the holdfltbasis property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHOLDFLTBASIS() {
        return holdfltbasis;
    }

    /**
     * Sets the value of the holdfltbasis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHOLDFLTBASIS(String value) {
        this.holdfltbasis = value;
    }

    /**
     * Gets the value of the trnchetyp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTRNCHETYP() {
        return trnchetyp;
    }

    /**
     * Sets the value of the trnchetyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTRNCHETYP(String value) {
        this.trnchetyp = value;
    }

    /**
     * Gets the value of the utliztnrevalreqd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUTLIZTNREVALREQD() {
        return utliztnrevalreqd;
    }

    /**
     * Sets the value of the utliztnrevalreqd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUTLIZTNREVALREQD(String value) {
        this.utliztnrevalreqd = value;
    }

    /**
     * Gets the value of the revaltnfreq property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getREVALTNFREQ() {
        return revaltnfreq;
    }

    /**
     * Sets the value of the revaltnfreq property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setREVALTNFREQ(String value) {
        this.revaltnfreq = value;
    }

    /**
     * Gets the value of the revalstrtmnth property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getREVALSTRTMNTH() {
        return revalstrtmnth;
    }

    /**
     * Sets the value of the revalstrtmnth property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setREVALSTRTMNTH(BigDecimal value) {
        this.revalstrtmnth = value;
    }

    /**
     * Gets the value of the revalstrtdt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getREVALSTRTDT() {
        return revalstrtdt;
    }

    /**
     * Sets the value of the revalstrtdt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setREVALSTRTDT(BigDecimal value) {
        this.revalstrtdt = value;
    }

    /**
     * Gets the value of the revaltnratcd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getREVALTNRATCD() {
        return revaltnratcd;
    }

    /**
     * Sets the value of the revaltnratcd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setREVALTNRATCD(String value) {
        this.revaltnratcd = value;
    }

    /**
     * Gets the value of the revaltnrattyp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getREVALTNRATTYP() {
        return revaltnrattyp;
    }

    /**
     * Sets the value of the revaltnrattyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setREVALTNRATTYP(String value) {
        this.revaltnrattyp = value;
    }

    /**
     * Gets the value of the rolloverDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ProductCreateIOType.RolloverDetails }
     *     
     */
    public ProductCreateIOType.RolloverDetails getRolloverDetails() {
        return rolloverDetails;
    }

    /**
     * Sets the value of the rolloverDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductCreateIOType.RolloverDetails }
     *     
     */
    public void setRolloverDetails(ProductCreateIOType.RolloverDetails value) {
        this.rolloverDetails = value;
    }

    /**
     * Gets the value of the defaultSchedules property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the defaultSchedules property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDefaultSchedules().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductCreateIOType.DefaultSchedules }
     * 
     * 
     */
    public List<ProductCreateIOType.DefaultSchedules> getDefaultSchedules() {
        if (defaultSchedules == null) {
            defaultSchedules = new ArrayList<ProductCreateIOType.DefaultSchedules>();
        }
        return this.defaultSchedules;
    }

    /**
     * Gets the value of the liquidationOrder property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the liquidationOrder property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLiquidationOrder().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductCreateIOType.LiquidationOrder }
     * 
     * 
     */
    public List<ProductCreateIOType.LiquidationOrder> getLiquidationOrder() {
        if (liquidationOrder == null) {
            liquidationOrder = new ArrayList<ProductCreateIOType.LiquidationOrder>();
        }
        return this.liquidationOrder;
    }

    /**
     * Gets the value of the graceLevels property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the graceLevels property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGraceLevels().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductCreateIOType.GraceLevels }
     * 
     * 
     */
    public List<ProductCreateIOType.GraceLevels> getGraceLevels() {
        if (graceLevels == null) {
            graceLevels = new ArrayList<ProductCreateIOType.GraceLevels>();
        }
        return this.graceLevels;
    }

    /**
     * Gets the value of the ccyDaysDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ccyDaysDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCcyDaysDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductCreateIOType.CcyDaysDetails }
     * 
     * 
     */
    public List<ProductCreateIOType.CcyDaysDetails> getCcyDaysDetails() {
        if (ccyDaysDetails == null) {
            ccyDaysDetails = new ArrayList<ProductCreateIOType.CcyDaysDetails>();
        }
        return this.ccyDaysDetails;
    }

    /**
     * Gets the value of the trsComponentsDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the trsComponentsDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTrsComponentsDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductCreateIOType.TrsComponentsDetails }
     * 
     * 
     */
    public List<ProductCreateIOType.TrsComponentsDetails> getTrsComponentsDetails() {
        if (trsComponentsDetails == null) {
            trsComponentsDetails = new ArrayList<ProductCreateIOType.TrsComponentsDetails>();
        }
        return this.trsComponentsDetails;
    }

    /**
     * Gets the value of the statusMasterDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the statusMasterDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStatusMasterDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductCreateIOType.StatusMasterDetails }
     * 
     * 
     */
    public List<ProductCreateIOType.StatusMasterDetails> getStatusMasterDetails() {
        if (statusMasterDetails == null) {
            statusMasterDetails = new ArrayList<ProductCreateIOType.StatusMasterDetails>();
        }
        return this.statusMasterDetails;
    }

    /**
     * Gets the value of the taxScheme property.
     * 
     * @return
     *     possible object is
     *     {@link ProductCreateIOType.TaxScheme }
     *     
     */
    public ProductCreateIOType.TaxScheme getTaxScheme() {
        return taxScheme;
    }

    /**
     * Sets the value of the taxScheme property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductCreateIOType.TaxScheme }
     *     
     */
    public void setTaxScheme(ProductCreateIOType.TaxScheme value) {
        this.taxScheme = value;
    }

    /**
     * Gets the value of the productInterest property.
     * 
     * @return
     *     possible object is
     *     {@link ProductInterestCreateIOType }
     *     
     */
    public ProductInterestCreateIOType getProductInterest() {
        return productInterest;
    }

    /**
     * Sets the value of the productInterest property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductInterestCreateIOType }
     *     
     */
    public void setProductInterest(ProductInterestCreateIOType value) {
        this.productInterest = value;
    }

    /**
     * Gets the value of the productAccrualFee property.
     * 
     * @return
     *     possible object is
     *     {@link ProdAccrualFeeCreateIOType }
     *     
     */
    public ProdAccrualFeeCreateIOType getProductAccrualFee() {
        return productAccrualFee;
    }

    /**
     * Sets the value of the productAccrualFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProdAccrualFeeCreateIOType }
     *     
     */
    public void setProductAccrualFee(ProdAccrualFeeCreateIOType value) {
        this.productAccrualFee = value;
    }

    /**
     * Gets the value of the productCharges property.
     * 
     * @return
     *     possible object is
     *     {@link ProductChargesCreateIOType }
     *     
     */
    public ProductChargesCreateIOType getProductCharges() {
        return productCharges;
    }

    /**
     * Sets the value of the productCharges property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductChargesCreateIOType }
     *     
     */
    public void setProductCharges(ProductChargesCreateIOType value) {
        this.productCharges = value;
    }

    /**
     * Gets the value of the productEvents property.
     * 
     * @return
     *     possible object is
     *     {@link ProdEventDtlsCreateIOType }
     *     
     */
    public ProdEventDtlsCreateIOType getProductEvents() {
        return productEvents;
    }

    /**
     * Sets the value of the productEvents property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProdEventDtlsCreateIOType }
     *     
     */
    public void setProductEvents(ProdEventDtlsCreateIOType value) {
        this.productEvents = value;
    }

    /**
     * Gets the value of the roleToHeadMapping property.
     * 
     * @return
     *     possible object is
     *     {@link RoleToHeadMappingCreateIOType }
     *     
     */
    public RoleToHeadMappingCreateIOType getRoleToHeadMapping() {
        return roleToHeadMapping;
    }

    /**
     * Sets the value of the roleToHeadMapping property.
     * 
     * @param value
     *     allowed object is
     *     {@link RoleToHeadMappingCreateIOType }
     *     
     */
    public void setRoleToHeadMapping(RoleToHeadMappingCreateIOType value) {
        this.roleToHeadMapping = value;
    }

    /**
     * Gets the value of the prodCustRestrictions property.
     * 
     * @return
     *     possible object is
     *     {@link CustRestrictionCreateIOType }
     *     
     */
    public CustRestrictionCreateIOType getProdCustRestrictions() {
        return prodCustRestrictions;
    }

    /**
     * Sets the value of the prodCustRestrictions property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustRestrictionCreateIOType }
     *     
     */
    public void setProdCustRestrictions(CustRestrictionCreateIOType value) {
        this.prodCustRestrictions = value;
    }

    /**
     * Gets the value of the branchCcyRestrictions property.
     * 
     * @return
     *     possible object is
     *     {@link BranchRestrictionCreateIOType }
     *     
     */
    public BranchRestrictionCreateIOType getBranchCcyRestrictions() {
        return branchCcyRestrictions;
    }

    /**
     * Sets the value of the branchCcyRestrictions property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchRestrictionCreateIOType }
     *     
     */
    public void setBranchCcyRestrictions(BranchRestrictionCreateIOType value) {
        this.branchCcyRestrictions = value;
    }

    /**
     * Gets the value of the productFields property.
     * 
     * @return
     *     possible object is
     *     {@link ProductUDFCreateIOType }
     *     
     */
    public ProductUDFCreateIOType getProductFields() {
        return productFields;
    }

    /**
     * Sets the value of the productFields property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductUDFCreateIOType }
     *     
     */
    public void setProductFields(ProductUDFCreateIOType value) {
        this.productFields = value;
    }

    /**
     * Gets the value of the productDiscountAccrual property.
     * 
     * @return
     *     possible object is
     *     {@link ProdDiscAccrCreateIOType }
     *     
     */
    public ProdDiscAccrCreateIOType getProductDiscountAccrual() {
        return productDiscountAccrual;
    }

    /**
     * Sets the value of the productDiscountAccrual property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProdDiscAccrCreateIOType }
     *     
     */
    public void setProductDiscountAccrual(ProdDiscAccrCreateIOType value) {
        this.productDiscountAccrual = value;
    }

    /**
     * Gets the value of the productMisDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ProdMisDetailsCreateIOType }
     *     
     */
    public ProdMisDetailsCreateIOType getProductMisDetails() {
        return productMisDetails;
    }

    /**
     * Sets the value of the productMisDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProdMisDetailsCreateIOType }
     *     
     */
    public void setProductMisDetails(ProdMisDetailsCreateIOType value) {
        this.productMisDetails = value;
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
     *         &lt;element name="CCY" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="EXCRATFXNGDAYS" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="INTRATFXNGDAYS" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
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
        "excratfxngdays",
        "intratfxngdays"
    })
    public static class CcyDaysDetails {

        @XmlElement(name = "CCY", required = true)
        protected String ccy;
        @XmlElement(name = "EXCRATFXNGDAYS")
        protected BigDecimal excratfxngdays;
        @XmlElement(name = "INTRATFXNGDAYS")
        protected BigDecimal intratfxngdays;

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
         * Gets the value of the excratfxngdays property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getEXCRATFXNGDAYS() {
            return excratfxngdays;
        }

        /**
         * Sets the value of the excratfxngdays property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setEXCRATFXNGDAYS(BigDecimal value) {
            this.excratfxngdays = value;
        }

        /**
         * Gets the value of the intratfxngdays property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getINTRATFXNGDAYS() {
            return intratfxngdays;
        }

        /**
         * Sets the value of the intratfxngdays property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setINTRATFXNGDAYS(BigDecimal value) {
            this.intratfxngdays = value;
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
     *         &lt;element name="CMPNT" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="REF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="FREQ" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="FREQUNIT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="STRTDAY" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="STRTMNTH" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="STRTDT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="MORATRMPERDUNIT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="MORATRMPERD" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
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
        "cmpnt",
        "ref",
        "freq",
        "frequnit",
        "strtday",
        "strtmnth",
        "strtdt",
        "moratrmperdunit",
        "moratrmperd"
    })
    public static class DefaultSchedules {

        @XmlElement(name = "CMPNT", required = true)
        protected String cmpnt;
        @XmlElement(name = "REF")
        protected String ref;
        @XmlElement(name = "FREQ")
        protected String freq;
        @XmlElement(name = "FREQUNIT")
        protected BigDecimal frequnit;
        @XmlElement(name = "STRTDAY")
        protected BigDecimal strtday;
        @XmlElement(name = "STRTMNTH")
        protected BigDecimal strtmnth;
        @XmlElement(name = "STRTDT")
        protected BigDecimal strtdt;
        @XmlElement(name = "MORATRMPERDUNIT")
        protected String moratrmperdunit;
        @XmlElement(name = "MORATRMPERD")
        protected BigDecimal moratrmperd;

        /**
         * Gets the value of the cmpnt property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCMPNT() {
            return cmpnt;
        }

        /**
         * Sets the value of the cmpnt property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCMPNT(String value) {
            this.cmpnt = value;
        }

        /**
         * Gets the value of the ref property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getREF() {
            return ref;
        }

        /**
         * Sets the value of the ref property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setREF(String value) {
            this.ref = value;
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
         * Gets the value of the frequnit property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getFREQUNIT() {
            return frequnit;
        }

        /**
         * Sets the value of the frequnit property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setFREQUNIT(BigDecimal value) {
            this.frequnit = value;
        }

        /**
         * Gets the value of the strtday property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getSTRTDAY() {
            return strtday;
        }

        /**
         * Sets the value of the strtday property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setSTRTDAY(BigDecimal value) {
            this.strtday = value;
        }

        /**
         * Gets the value of the strtmnth property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getSTRTMNTH() {
            return strtmnth;
        }

        /**
         * Sets the value of the strtmnth property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setSTRTMNTH(BigDecimal value) {
            this.strtmnth = value;
        }

        /**
         * Gets the value of the strtdt property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getSTRTDT() {
            return strtdt;
        }

        /**
         * Sets the value of the strtdt property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setSTRTDT(BigDecimal value) {
            this.strtdt = value;
        }

        /**
         * Gets the value of the moratrmperdunit property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMORATRMPERDUNIT() {
            return moratrmperdunit;
        }

        /**
         * Sets the value of the moratrmperdunit property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMORATRMPERDUNIT(String value) {
            this.moratrmperdunit = value;
        }

        /**
         * Gets the value of the moratrmperd property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getMORATRMPERD() {
            return moratrmperd;
        }

        /**
         * Sets the value of the moratrmperd property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setMORATRMPERD(BigDecimal value) {
            this.moratrmperd = value;
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
     *         &lt;element name="LVLNO" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
     *         &lt;element name="NOOFUNITS" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="UNIT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "lvlno",
        "noofunits",
        "unit"
    })
    public static class GraceLevels {

        @XmlElement(name = "LVLNO", required = true)
        protected BigDecimal lvlno;
        @XmlElement(name = "NOOFUNITS")
        protected BigDecimal noofunits;
        @XmlElement(name = "UNIT")
        protected String unit;

        /**
         * Gets the value of the lvlno property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getLVLNO() {
            return lvlno;
        }

        /**
         * Sets the value of the lvlno property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setLVLNO(BigDecimal value) {
            this.lvlno = value;
        }

        /**
         * Gets the value of the noofunits property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getNOOFUNITS() {
            return noofunits;
        }

        /**
         * Sets the value of the noofunits property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setNOOFUNITS(BigDecimal value) {
            this.noofunits = value;
        }

        /**
         * Gets the value of the unit property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUNIT() {
            return unit;
        }

        /**
         * Sets the value of the unit property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUNIT(String value) {
            this.unit = value;
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
     *         &lt;element name="CMPNT" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="LIQORDR" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
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
        "cmpnt",
        "liqordr"
    })
    public static class LiquidationOrder {

        @XmlElement(name = "CMPNT", required = true)
        protected String cmpnt;
        @XmlElement(name = "LIQORDR")
        protected BigDecimal liqordr;

        /**
         * Gets the value of the cmpnt property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCMPNT() {
            return cmpnt;
        }

        /**
         * Sets the value of the cmpnt property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCMPNT(String value) {
            this.cmpnt = value;
        }

        /**
         * Gets the value of the liqordr property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getLIQORDR() {
            return liqordr;
        }

        /**
         * Sets the value of the liqordr property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setLIQORDR(BigDecimal value) {
            this.liqordr = value;
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
     *         &lt;element name="RLOVRICCFFRM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="APLYTAX" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="RLOVRWITHINT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="DEDCTTAXONRLOVR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="AUTOMANRLOVR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="RLOVRMECHNSM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "rlovriccffrm",
        "aplytax",
        "rlovrwithint",
        "dedcttaxonrlovr",
        "automanrlovr",
        "rlovrmechnsm"
    })
    public static class RolloverDetails {

        @XmlElement(name = "RLOVRICCFFRM")
        protected String rlovriccffrm;
        @XmlElement(name = "APLYTAX")
        protected String aplytax;
        @XmlElement(name = "RLOVRWITHINT")
        protected String rlovrwithint;
        @XmlElement(name = "DEDCTTAXONRLOVR")
        protected String dedcttaxonrlovr;
        @XmlElement(name = "AUTOMANRLOVR")
        protected String automanrlovr;
        @XmlElement(name = "RLOVRMECHNSM")
        protected String rlovrmechnsm;

        /**
         * Gets the value of the rlovriccffrm property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRLOVRICCFFRM() {
            return rlovriccffrm;
        }

        /**
         * Sets the value of the rlovriccffrm property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRLOVRICCFFRM(String value) {
            this.rlovriccffrm = value;
        }

        /**
         * Gets the value of the aplytax property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAPLYTAX() {
            return aplytax;
        }

        /**
         * Sets the value of the aplytax property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAPLYTAX(String value) {
            this.aplytax = value;
        }

        /**
         * Gets the value of the rlovrwithint property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRLOVRWITHINT() {
            return rlovrwithint;
        }

        /**
         * Sets the value of the rlovrwithint property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRLOVRWITHINT(String value) {
            this.rlovrwithint = value;
        }

        /**
         * Gets the value of the dedcttaxonrlovr property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDEDCTTAXONRLOVR() {
            return dedcttaxonrlovr;
        }

        /**
         * Sets the value of the dedcttaxonrlovr property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDEDCTTAXONRLOVR(String value) {
            this.dedcttaxonrlovr = value;
        }

        /**
         * Gets the value of the automanrlovr property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAUTOMANRLOVR() {
            return automanrlovr;
        }

        /**
         * Sets the value of the automanrlovr property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAUTOMANRLOVR(String value) {
            this.automanrlovr = value;
        }

        /**
         * Gets the value of the rlovrmechnsm property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRLOVRMECHNSM() {
            return rlovrmechnsm;
        }

        /**
         * Sets the value of the rlovrmechnsm property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRLOVRMECHNSM(String value) {
            this.rlovrmechnsm = value;
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
     *         &lt;element name="STATUS" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="TRANSACTIONCD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="STPACCRUALS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="REVERSEACCRUALS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="COMPLETEACCRUALS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="TRNSFRCAPITLIZDINCM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="AUTOFRWD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="AUTOREVERSE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="DERVTNRUL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="RBKPROVSN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="Status-Advices-Details" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="MESSAGECD" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Product-Status-Gl-Details" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="ACCNTROLE" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="UPWARDTRANFERFRMGL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="TRNSFERGL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="DWNWRDTRANSFERFRMGL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="DWNWRDTRANSFERTOGL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Acc-Status-Gl-Details" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="ACCROL" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="ACCHD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "status",
        "transactioncd",
        "stpaccruals",
        "reverseaccruals",
        "completeaccruals",
        "trnsfrcapitlizdincm",
        "autofrwd",
        "autoreverse",
        "dervtnrul",
        "rbkprovsn",
        "statusAdvicesDetails",
        "productStatusGlDetails",
        "accStatusGlDetails"
    })
    public static class StatusMasterDetails {

        @XmlElement(name = "STATUS", required = true)
        protected String status;
        @XmlElement(name = "TRANSACTIONCD")
        protected String transactioncd;
        @XmlElement(name = "STPACCRUALS")
        protected String stpaccruals;
        @XmlElement(name = "REVERSEACCRUALS")
        protected String reverseaccruals;
        @XmlElement(name = "COMPLETEACCRUALS")
        protected String completeaccruals;
        @XmlElement(name = "TRNSFRCAPITLIZDINCM")
        protected String trnsfrcapitlizdincm;
        @XmlElement(name = "AUTOFRWD")
        protected String autofrwd;
        @XmlElement(name = "AUTOREVERSE")
        protected String autoreverse;
        @XmlElement(name = "DERVTNRUL")
        protected String dervtnrul;
        @XmlElement(name = "RBKPROVSN")
        protected String rbkprovsn;
        @XmlElement(name = "Status-Advices-Details")
        protected List<ProductCreateIOType.StatusMasterDetails.StatusAdvicesDetails> statusAdvicesDetails;
        @XmlElement(name = "Product-Status-Gl-Details")
        protected List<ProductCreateIOType.StatusMasterDetails.ProductStatusGlDetails> productStatusGlDetails;
        @XmlElement(name = "Acc-Status-Gl-Details")
        protected List<ProductCreateIOType.StatusMasterDetails.AccStatusGlDetails> accStatusGlDetails;

        /**
         * Gets the value of the status property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSTATUS() {
            return status;
        }

        /**
         * Sets the value of the status property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSTATUS(String value) {
            this.status = value;
        }

        /**
         * Gets the value of the transactioncd property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTRANSACTIONCD() {
            return transactioncd;
        }

        /**
         * Sets the value of the transactioncd property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTRANSACTIONCD(String value) {
            this.transactioncd = value;
        }

        /**
         * Gets the value of the stpaccruals property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSTPACCRUALS() {
            return stpaccruals;
        }

        /**
         * Sets the value of the stpaccruals property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSTPACCRUALS(String value) {
            this.stpaccruals = value;
        }

        /**
         * Gets the value of the reverseaccruals property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getREVERSEACCRUALS() {
            return reverseaccruals;
        }

        /**
         * Sets the value of the reverseaccruals property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setREVERSEACCRUALS(String value) {
            this.reverseaccruals = value;
        }

        /**
         * Gets the value of the completeaccruals property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCOMPLETEACCRUALS() {
            return completeaccruals;
        }

        /**
         * Sets the value of the completeaccruals property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCOMPLETEACCRUALS(String value) {
            this.completeaccruals = value;
        }

        /**
         * Gets the value of the trnsfrcapitlizdincm property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTRNSFRCAPITLIZDINCM() {
            return trnsfrcapitlizdincm;
        }

        /**
         * Sets the value of the trnsfrcapitlizdincm property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTRNSFRCAPITLIZDINCM(String value) {
            this.trnsfrcapitlizdincm = value;
        }

        /**
         * Gets the value of the autofrwd property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAUTOFRWD() {
            return autofrwd;
        }

        /**
         * Sets the value of the autofrwd property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAUTOFRWD(String value) {
            this.autofrwd = value;
        }

        /**
         * Gets the value of the autoreverse property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAUTOREVERSE() {
            return autoreverse;
        }

        /**
         * Sets the value of the autoreverse property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAUTOREVERSE(String value) {
            this.autoreverse = value;
        }

        /**
         * Gets the value of the dervtnrul property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDERVTNRUL() {
            return dervtnrul;
        }

        /**
         * Sets the value of the dervtnrul property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDERVTNRUL(String value) {
            this.dervtnrul = value;
        }

        /**
         * Gets the value of the rbkprovsn property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRBKPROVSN() {
            return rbkprovsn;
        }

        /**
         * Sets the value of the rbkprovsn property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRBKPROVSN(String value) {
            this.rbkprovsn = value;
        }

        /**
         * Gets the value of the statusAdvicesDetails property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the statusAdvicesDetails property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getStatusAdvicesDetails().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ProductCreateIOType.StatusMasterDetails.StatusAdvicesDetails }
         * 
         * 
         */
        public List<ProductCreateIOType.StatusMasterDetails.StatusAdvicesDetails> getStatusAdvicesDetails() {
            if (statusAdvicesDetails == null) {
                statusAdvicesDetails = new ArrayList<ProductCreateIOType.StatusMasterDetails.StatusAdvicesDetails>();
            }
            return this.statusAdvicesDetails;
        }

        /**
         * Gets the value of the productStatusGlDetails property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the productStatusGlDetails property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getProductStatusGlDetails().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ProductCreateIOType.StatusMasterDetails.ProductStatusGlDetails }
         * 
         * 
         */
        public List<ProductCreateIOType.StatusMasterDetails.ProductStatusGlDetails> getProductStatusGlDetails() {
            if (productStatusGlDetails == null) {
                productStatusGlDetails = new ArrayList<ProductCreateIOType.StatusMasterDetails.ProductStatusGlDetails>();
            }
            return this.productStatusGlDetails;
        }

        /**
         * Gets the value of the accStatusGlDetails property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the accStatusGlDetails property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAccStatusGlDetails().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ProductCreateIOType.StatusMasterDetails.AccStatusGlDetails }
         * 
         * 
         */
        public List<ProductCreateIOType.StatusMasterDetails.AccStatusGlDetails> getAccStatusGlDetails() {
            if (accStatusGlDetails == null) {
                accStatusGlDetails = new ArrayList<ProductCreateIOType.StatusMasterDetails.AccStatusGlDetails>();
            }
            return this.accStatusGlDetails;
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
         *         &lt;element name="ACCROL" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="ACCHD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "accrol",
            "acchd"
        })
        public static class AccStatusGlDetails {

            @XmlElement(name = "ACCROL", required = true)
            protected String accrol;
            @XmlElement(name = "ACCHD")
            protected String acchd;

            /**
             * Gets the value of the accrol property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getACCROL() {
                return accrol;
            }

            /**
             * Sets the value of the accrol property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setACCROL(String value) {
                this.accrol = value;
            }

            /**
             * Gets the value of the acchd property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getACCHD() {
                return acchd;
            }

            /**
             * Sets the value of the acchd property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setACCHD(String value) {
                this.acchd = value;
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
         *         &lt;element name="ACCNTROLE" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="UPWARDTRANFERFRMGL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="TRNSFERGL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="DWNWRDTRANSFERFRMGL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="DWNWRDTRANSFERTOGL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "accntrole",
            "upwardtranferfrmgl",
            "trnsfergl",
            "dwnwrdtransferfrmgl",
            "dwnwrdtransfertogl"
        })
        public static class ProductStatusGlDetails {

            @XmlElement(name = "ACCNTROLE", required = true)
            protected String accntrole;
            @XmlElement(name = "UPWARDTRANFERFRMGL")
            protected String upwardtranferfrmgl;
            @XmlElement(name = "TRNSFERGL")
            protected String trnsfergl;
            @XmlElement(name = "DWNWRDTRANSFERFRMGL")
            protected String dwnwrdtransferfrmgl;
            @XmlElement(name = "DWNWRDTRANSFERTOGL")
            protected String dwnwrdtransfertogl;

            /**
             * Gets the value of the accntrole property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getACCNTROLE() {
                return accntrole;
            }

            /**
             * Sets the value of the accntrole property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setACCNTROLE(String value) {
                this.accntrole = value;
            }

            /**
             * Gets the value of the upwardtranferfrmgl property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getUPWARDTRANFERFRMGL() {
                return upwardtranferfrmgl;
            }

            /**
             * Sets the value of the upwardtranferfrmgl property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setUPWARDTRANFERFRMGL(String value) {
                this.upwardtranferfrmgl = value;
            }

            /**
             * Gets the value of the trnsfergl property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTRNSFERGL() {
                return trnsfergl;
            }

            /**
             * Sets the value of the trnsfergl property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTRNSFERGL(String value) {
                this.trnsfergl = value;
            }

            /**
             * Gets the value of the dwnwrdtransferfrmgl property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDWNWRDTRANSFERFRMGL() {
                return dwnwrdtransferfrmgl;
            }

            /**
             * Sets the value of the dwnwrdtransferfrmgl property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDWNWRDTRANSFERFRMGL(String value) {
                this.dwnwrdtransferfrmgl = value;
            }

            /**
             * Gets the value of the dwnwrdtransfertogl property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDWNWRDTRANSFERTOGL() {
                return dwnwrdtransfertogl;
            }

            /**
             * Sets the value of the dwnwrdtransfertogl property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDWNWRDTRANSFERTOGL(String value) {
                this.dwnwrdtransfertogl = value;
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
         *         &lt;element name="MESSAGECD" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
            "messagecd"
        })
        public static class StatusAdvicesDetails {

            @XmlElement(name = "MESSAGECD", required = true)
            protected String messagecd;

            /**
             * Gets the value of the messagecd property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMESSAGECD() {
                return messagecd;
            }

            /**
             * Sets the value of the messagecd property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMESSAGECD(String value) {
                this.messagecd = value;
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
     *         &lt;element name="SCHME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="Tax-Details" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="RUL" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="BASISAMNTTAG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="COMPTATIONEVNT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="TYP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Ccy-Tax-Details" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="RULE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="CCY" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="MAXTAXINTPERD" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                             &lt;element name="PERDUNIT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="MININTTAXAMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
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
        "schme",
        "taxDetails"
    })
    public static class TaxScheme {

        @XmlElement(name = "SCHME")
        protected String schme;
        @XmlElement(name = "Tax-Details")
        protected List<ProductCreateIOType.TaxScheme.TaxDetails> taxDetails;

        /**
         * Gets the value of the schme property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSCHME() {
            return schme;
        }

        /**
         * Sets the value of the schme property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSCHME(String value) {
            this.schme = value;
        }

        /**
         * Gets the value of the taxDetails property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the taxDetails property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTaxDetails().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ProductCreateIOType.TaxScheme.TaxDetails }
         * 
         * 
         */
        public List<ProductCreateIOType.TaxScheme.TaxDetails> getTaxDetails() {
            if (taxDetails == null) {
                taxDetails = new ArrayList<ProductCreateIOType.TaxScheme.TaxDetails>();
            }
            return this.taxDetails;
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
         *         &lt;element name="RUL" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="BASISAMNTTAG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="COMPTATIONEVNT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="TYP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Ccy-Tax-Details" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="RULE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="CCY" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="MAXTAXINTPERD" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *                   &lt;element name="PERDUNIT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="MININTTAXAMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
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
            "rul",
            "basisamnttag",
            "comptationevnt",
            "typ",
            "ccyTaxDetails"
        })
        public static class TaxDetails {

            @XmlElement(name = "RUL", required = true)
            protected String rul;
            @XmlElement(name = "BASISAMNTTAG")
            protected String basisamnttag;
            @XmlElement(name = "COMPTATIONEVNT")
            protected String comptationevnt;
            @XmlElement(name = "TYP")
            protected String typ;
            @XmlElement(name = "Ccy-Tax-Details")
            protected List<ProductCreateIOType.TaxScheme.TaxDetails.CcyTaxDetails> ccyTaxDetails;

            /**
             * Gets the value of the rul property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRUL() {
                return rul;
            }

            /**
             * Sets the value of the rul property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRUL(String value) {
                this.rul = value;
            }

            /**
             * Gets the value of the basisamnttag property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBASISAMNTTAG() {
                return basisamnttag;
            }

            /**
             * Sets the value of the basisamnttag property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBASISAMNTTAG(String value) {
                this.basisamnttag = value;
            }

            /**
             * Gets the value of the comptationevnt property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCOMPTATIONEVNT() {
                return comptationevnt;
            }

            /**
             * Sets the value of the comptationevnt property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCOMPTATIONEVNT(String value) {
                this.comptationevnt = value;
            }

            /**
             * Gets the value of the typ property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTYP() {
                return typ;
            }

            /**
             * Sets the value of the typ property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTYP(String value) {
                this.typ = value;
            }

            /**
             * Gets the value of the ccyTaxDetails property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the ccyTaxDetails property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getCcyTaxDetails().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link ProductCreateIOType.TaxScheme.TaxDetails.CcyTaxDetails }
             * 
             * 
             */
            public List<ProductCreateIOType.TaxScheme.TaxDetails.CcyTaxDetails> getCcyTaxDetails() {
                if (ccyTaxDetails == null) {
                    ccyTaxDetails = new ArrayList<ProductCreateIOType.TaxScheme.TaxDetails.CcyTaxDetails>();
                }
                return this.ccyTaxDetails;
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
             *         &lt;element name="RULE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="CCY" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="MAXTAXINTPERD" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
             *         &lt;element name="PERDUNIT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="MININTTAXAMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
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
                "rule",
                "ccy",
                "maxtaxintperd",
                "perdunit",
                "mininttaxamt"
            })
            public static class CcyTaxDetails {

                @XmlElement(name = "RULE")
                protected String rule;
                @XmlElement(name = "CCY", required = true)
                protected String ccy;
                @XmlElement(name = "MAXTAXINTPERD")
                protected BigDecimal maxtaxintperd;
                @XmlElement(name = "PERDUNIT")
                protected String perdunit;
                @XmlElement(name = "MININTTAXAMT")
                protected BigDecimal mininttaxamt;

                /**
                 * Gets the value of the rule property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getRULE() {
                    return rule;
                }

                /**
                 * Sets the value of the rule property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setRULE(String value) {
                    this.rule = value;
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
                 * Gets the value of the maxtaxintperd property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getMAXTAXINTPERD() {
                    return maxtaxintperd;
                }

                /**
                 * Sets the value of the maxtaxintperd property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setMAXTAXINTPERD(BigDecimal value) {
                    this.maxtaxintperd = value;
                }

                /**
                 * Gets the value of the perdunit property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getPERDUNIT() {
                    return perdunit;
                }

                /**
                 * Sets the value of the perdunit property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setPERDUNIT(String value) {
                    this.perdunit = value;
                }

                /**
                 * Gets the value of the mininttaxamt property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getMININTTAXAMT() {
                    return mininttaxamt;
                }

                /**
                 * Sets the value of the mininttaxamt property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setMININTTAXAMT(BigDecimal value) {
                    this.mininttaxamt = value;
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
     *         &lt;element name="COMPNT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "compnt"
    })
    public static class TrsComponentsDetails {

        @XmlElement(name = "COMPNT")
        protected String compnt;

        /**
         * Gets the value of the compnt property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCOMPNT() {
            return compnt;
        }

        /**
         * Sets the value of the compnt property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCOMPNT(String value) {
            this.compnt = value;
        }

    }

}
