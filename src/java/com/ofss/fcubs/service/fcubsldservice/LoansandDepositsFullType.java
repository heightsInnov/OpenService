
package com.ofss.fcubs.service.fcubsldservice;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for LoansandDeposits-Full-Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LoansandDeposits-Full-Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FCCREF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="XREF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CONTSTAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UREF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BRN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CPTYCONFSTAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LATEST_VERNO" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="REVCONREF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SRC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ALLOWPREPAY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ANNLOAN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AUTPROVREQD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BAREF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BILLREFNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BOOKDT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="BRK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CLUSID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CLUSSIZE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="CONDERIVSTAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CPTY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LINE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DEALER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DFLT_ACC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DFLT_ACC_BRN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DRSETLAC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DRSETLACBR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EXPCAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="INTPERBAS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="INTREFNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LASTAVLDT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="LCYEQINDLN" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="LNSTMTCYC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MATDT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="MULTICIF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NOTC_DAYS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ORGL_STDT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="PARFCCREF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PAREXTREFNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PRD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RELREF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TDESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RFEXPAMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ROLLOVRCNT" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="ROLLOVRIND" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="STMTDAY" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="SUBSIDYPER" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="TAXSCHEME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UDSTAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="USERINPUTMATDT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="VALDT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="VERNO" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="PAMTMETHOD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OUTBAL" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="PROTYPEDESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PROVAMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="AMTINRPTCCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RPTCCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OSBALRPTCCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IGRHOLDYS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HOLDYCCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CASCADESCHD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VFYFUNDS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LIQBCKVALSCHD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DEDTAXCAP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HOLMTHFLG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MVACRMTH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NOTCREQD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TRKRECALIQ" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TRKRECMLIQ" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VERIFUNDPRIN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VERIFUNDINT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VERIFUND" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PARTPAYMLIQ" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SUBSALLOW" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="USERDEFSCHED" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SGENREQD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DEMANDBASIS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MOVEPAYSCH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MOVEREVSCH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MOVECOMMREDNSCH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MOVEDISSCH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RNDNGREQ" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CCYRNDRULE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CCYDECIMALS" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="CCYRNDUNIT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="RVNCONSBRNHOL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MCONSBRNHOL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CONSBRNHOL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="APLYFACLTYHOLCCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="APLYCONTHOLCCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="APLYLCLHOLCCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CHKRATECDCCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MSCHCCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MSCHAPLYFACLTYHOLCCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MSCHAPLYCONTHOLCCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MSCHAPLYLCLHOLCCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RVNCASCSCHD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RVNMOVEACROSSMNTH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RVNAPLYFACLTYHOLCCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RVNAPLYCONTHOLCCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RVNAPLYLCLHOLCCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RVNCCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RVNIGHOL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MAXRATEREVPRD" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="MSCHINDHOLTREAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RVNINDHOLTREAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MSCHMOVEACROSSMNTH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MSCHIGHOL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LNSTMTTYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MAT_TYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PRCCYTYP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ROLLALLW" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AMORTYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PRINCLIQ" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="STACTL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="REVCOMM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SCHDMOVE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RVNSCHDMOVE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MSCHSCHDMOVE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PRDSCHTYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SUBSYSTEMSTAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PURPOFSYND" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LATINTRAT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Settlement-Addl-Details" type="{http://fcubs.ofss.com/service/FCUBSLDService}SettlementAddlDetailsType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Settlement-Details" type="{http://fcubs.ofss.com/service/FCUBSLDService}SettlementDetailsType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Clearing-Details" type="{http://fcubs.ofss.com/service/FCUBSLDService}SettlementClearingDetails" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Mis-Details" type="{http://fcubs.ofss.com/service/FCUBSLDService}MISDETAILSType" minOccurs="0"/>
 *         &lt;element name="Balance-Trnsfer-Log" type="{http://fcubs.ofss.com/service/FCUBSLDService}MISBALTRANLOGDetails" minOccurs="0"/>
 *         &lt;element name="Mis-Change-Log" type="{http://fcubs.ofss.com/service/FCUBSLDService}MISCHANGELOGDetails" minOccurs="0"/>
 *         &lt;element name="Mis-Amend" type="{http://fcubs.ofss.com/service/FCUBSLDService}MISAMENDDetails" minOccurs="0"/>
 *         &lt;element name="Refinance-Rate" type="{http://fcubs.ofss.com/service/FCUBSLDService}MISRefineRateDetails" minOccurs="0"/>
 *         &lt;element name="Udf-Details" type="{http://fcubs.ofss.com/service/FCUBSLDService}UDFDETAILSType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Charge-Application" type="{http://fcubs.ofss.com/service/FCUBSLDService}CHGSAppType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Charge-Association" type="{http://fcubs.ofss.com/service/FCUBSLDService}ChgAssType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Charge-Liquidation" type="{http://fcubs.ofss.com/service/FCUBSLDService}ChgLiqType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Interest-Main" type="{http://fcubs.ofss.com/service/FCUBSLDService}IntMainType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Taxdetails-Main" type="{http://fcubs.ofss.com/service/FCUBSLDService}TaxMainType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Taxdetails" type="{http://fcubs.ofss.com/service/FCUBSLDService}TaxDetailType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ContractSchedules1" type="{http://fcubs.ofss.com/service/FCUBSLDService}ScheduleType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Contract_Linkages" type="{http://fcubs.ofss.com/service/FCUBSLDService}LinkageType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Relationship-Linkage" type="{http://fcubs.ofss.com/service/FCUBSLDService}LINKEDENTITYType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Brokerage-Master" type="{http://fcubs.ofss.com/service/FCUBSLDService}BrkMasterType" minOccurs="0"/>
 *         &lt;element name="Advice-Details" type="{http://fcubs.ofss.com/service/FCUBSLDService}ADVDETAILSType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Settlement-Split-Master" type="{http://fcubs.ofss.com/service/FCUBSLDService}SplitSettlementFullDetailType" minOccurs="0"/>
 *         &lt;element name="Contract-Schedules" type="{http://fcubs.ofss.com/service/FCUBSLDService}ScheduleType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Change-Log" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="FLDDESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="OLDISVAL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="NWDISVAL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Contract-Event-Log" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="MAKERID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="MAKERSTAMP" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="CHECKERID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="CHECKERSTAMP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="AUTHSTAT" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="CONTSTAT" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="REVR_MAKERID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="REVR_MAKERSTAMP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="REVR_CHECKERID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="REVR_CHECKERSTAMP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="REVR_AUTHSTAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="REVR_CONTSTAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Schedule-Dates" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ESN" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *                   &lt;element name="DTOFCHNG" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                   &lt;element name="EVNTCD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Schedule-Summ" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="DUEDT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                   &lt;element name="SUBAMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="CCYAMTDUE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="DISAMTDUE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="DISAMTSETTL" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="DISADJAMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="Schedule-Details" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="SCOMP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="AMTDUE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                             &lt;element name="CCYAMTDUE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="AMTSET" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                             &lt;element name="ADJAMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                             &lt;element name="Amount-Settle" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="PAIDDT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                                       &lt;element name="CCYSETTL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="LCYEQSET" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                                       &lt;element name="AMTSETTL" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                                       &lt;element name="MAKERDT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
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
 *         &lt;element name="Holiday-Currencies" type="{http://fcubs.ofss.com/service/FCUBSLDService}LISTHOLCCYType14" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Contract-Rollover" type="{http://fcubs.ofss.com/service/FCUBSLDService}ROLLOVERType2" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LoansandDeposits-Full-Type", propOrder = {
    "fccref",
    "xref",
    "contstat",
    "uref",
    "brn",
    "cptyconfstat",
    "latestverno",
    "revconref",
    "src",
    "allowprepay",
    "amt",
    "annloan",
    "autprovreqd",
    "baref",
    "billrefno",
    "bookdt",
    "brk",
    "clusid",
    "clussize",
    "conderivstat",
    "cpty",
    "line",
    "ccy",
    "dealer",
    "dfltacc",
    "dfltaccbrn",
    "drsetlac",
    "drsetlacbr",
    "expcat",
    "intperbas",
    "intrefno",
    "lastavldt",
    "lcyeqindln",
    "lnstmtcyc",
    "matdt",
    "multicif",
    "notcdays",
    "orglstdt",
    "parfccref",
    "parextrefno",
    "prd",
    "relref",
    "tdesc",
    "rfexpamt",
    "rollovrcnt",
    "rollovrind",
    "stmtday",
    "subsidyper",
    "taxscheme",
    "udstat",
    "userinputmatdt",
    "valdt",
    "verno",
    "pamtmethod",
    "outbal",
    "protypedesc",
    "provamt",
    "amtinrptccy",
    "rptccy",
    "osbalrptccy",
    "igrholdys",
    "holdyccy",
    "cascadeschd",
    "vfyfunds",
    "liqbckvalschd",
    "dedtaxcap",
    "holmthflg",
    "mvacrmth",
    "notcreqd",
    "trkrecaliq",
    "trkrecmliq",
    "verifundprin",
    "verifundint",
    "verifund",
    "partpaymliq",
    "subsallow",
    "userdefsched",
    "sgenreqd",
    "demandbasis",
    "movepaysch",
    "moverevsch",
    "movecommrednsch",
    "movedissch",
    "rndngreq",
    "ccyrndrule",
    "ccydecimals",
    "ccyrndunit",
    "rvnconsbrnhol",
    "mconsbrnhol",
    "consbrnhol",
    "aplyfacltyholccy",
    "aplycontholccy",
    "aplylclholccy",
    "chkratecdccy",
    "mschccy",
    "mschaplyfacltyholccy",
    "mschaplycontholccy",
    "mschaplylclholccy",
    "rvncascschd",
    "rvnmoveacrossmnth",
    "rvnaplyfacltyholccy",
    "rvnaplycontholccy",
    "rvnaplylclholccy",
    "rvnccy",
    "rvnighol",
    "maxraterevprd",
    "mschindholtreat",
    "rvnindholtreat",
    "mschmoveacrossmnth",
    "mschighol",
    "lnstmttype",
    "mattype",
    "prccytyp",
    "rollallw",
    "amortype",
    "princliq",
    "stactl",
    "revcomm",
    "schdmove",
    "rvnschdmove",
    "mschschdmove",
    "prdschtype",
    "subsystemstat",
    "purpofsynd",
    "latintrat",
    "settlementAddlDetails",
    "settlementDetails",
    "clearingDetails",
    "misDetails",
    "balanceTrnsferLog",
    "misChangeLog",
    "misAmend",
    "refinanceRate",
    "udfDetails",
    "chargeApplication",
    "chargeAssociation",
    "chargeLiquidation",
    "interestMain",
    "taxdetailsMain",
    "taxdetails",
    "contractSchedules1",
    "contractLinkages",
    "relationshipLinkage",
    "brokerageMaster",
    "adviceDetails",
    "settlementSplitMaster",
    "contractSchedules",
    "changeLog",
    "contractEventLog",
    "scheduleDates",
    "scheduleSumm",
    "holidayCurrencies",
    "contractRollover"
})
public class LoansandDepositsFullType {

    @XmlElement(name = "FCCREF")
    protected String fccref;
    @XmlElement(name = "XREF")
    protected String xref;
    @XmlElement(name = "CONTSTAT")
    protected String contstat;
    @XmlElement(name = "UREF")
    protected String uref;
    @XmlElement(name = "BRN")
    protected String brn;
    @XmlElement(name = "CPTYCONFSTAT")
    protected String cptyconfstat;
    @XmlElement(name = "LATEST_VERNO")
    protected BigInteger latestverno;
    @XmlElement(name = "REVCONREF")
    protected String revconref;
    @XmlElement(name = "SRC")
    protected String src;
    @XmlElement(name = "ALLOWPREPAY")
    protected String allowprepay;
    @XmlElement(name = "AMT")
    protected BigDecimal amt;
    @XmlElement(name = "ANNLOAN")
    protected String annloan;
    @XmlElement(name = "AUTPROVREQD")
    protected String autprovreqd;
    @XmlElement(name = "BAREF")
    protected String baref;
    @XmlElement(name = "BILLREFNO")
    protected String billrefno;
    @XmlElement(name = "BOOKDT")
    //@XmlSchemaType(name = "date")
    protected String bookdt;
    @XmlElement(name = "BRK")
    protected String brk;
    @XmlElement(name = "CLUSID")
    protected String clusid;
    @XmlElement(name = "CLUSSIZE")
    protected BigDecimal clussize;
    @XmlElement(name = "CONDERIVSTAT")
    protected String conderivstat;
    @XmlElement(name = "CPTY")
    protected String cpty;
    @XmlElement(name = "LINE")
    protected String line;
    @XmlElement(name = "CCY")
    protected String ccy;
    @XmlElement(name = "DEALER")
    protected String dealer;
    @XmlElement(name = "DFLT_ACC")
    protected String dfltacc;
    @XmlElement(name = "DFLT_ACC_BRN")
    protected String dfltaccbrn;
    @XmlElement(name = "DRSETLAC")
    protected String drsetlac;
    @XmlElement(name = "DRSETLACBR")
    protected String drsetlacbr;
    @XmlElement(name = "EXPCAT")
    protected String expcat;
    @XmlElement(name = "INTPERBAS")
    protected String intperbas;
    @XmlElement(name = "INTREFNO")
    protected String intrefno;
    @XmlElement(name = "LASTAVLDT")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar lastavldt;
    @XmlElement(name = "LCYEQINDLN")
    protected BigDecimal lcyeqindln;
    @XmlElement(name = "LNSTMTCYC")
    protected String lnstmtcyc;
    @XmlElement(name = "MATDT")
    //@XmlSchemaType(name = "date")
    protected String matdt;
    @XmlElement(name = "MULTICIF")
    protected String multicif;
    @XmlElement(name = "NOTC_DAYS")
    protected String notcdays;
    @XmlElement(name = "ORGL_STDT")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar orglstdt;
    @XmlElement(name = "PARFCCREF")
    protected String parfccref;
    @XmlElement(name = "PAREXTREFNO")
    protected String parextrefno;
    @XmlElement(name = "PRD")
    protected String prd;
    @XmlElement(name = "RELREF")
    protected String relref;
    @XmlElement(name = "TDESC")
    protected String tdesc;
    @XmlElement(name = "RFEXPAMT")
    protected BigDecimal rfexpamt;
    @XmlElement(name = "ROLLOVRCNT")
    protected BigInteger rollovrcnt;
    @XmlElement(name = "ROLLOVRIND")
    protected String rollovrind;
    @XmlElement(name = "STMTDAY")
    protected BigInteger stmtday;
    @XmlElement(name = "SUBSIDYPER")
    protected BigDecimal subsidyper;
    @XmlElement(name = "TAXSCHEME")
    protected String taxscheme;
    @XmlElement(name = "UDSTAT")
    protected String udstat;
    @XmlElement(name = "USERINPUTMATDT")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar userinputmatdt;
    @XmlElement(name = "VALDT")
    //@XmlSchemaType(name = "date")
    protected String valdt;
    @XmlElement(name = "VERNO")
    protected BigInteger verno;
    @XmlElement(name = "PAMTMETHOD")
    protected String pamtmethod;
    @XmlElement(name = "OUTBAL")
    protected BigDecimal outbal;
    @XmlElement(name = "PROTYPEDESC")
    protected String protypedesc;
    @XmlElement(name = "PROVAMT")
    protected BigDecimal provamt;
    @XmlElement(name = "AMTINRPTCCY")
    protected String amtinrptccy;
    @XmlElement(name = "RPTCCY")
    protected String rptccy;
    @XmlElement(name = "OSBALRPTCCY")
    protected String osbalrptccy;
    @XmlElement(name = "IGRHOLDYS")
    protected String igrholdys;
    @XmlElement(name = "HOLDYCCY")
    protected String holdyccy;
    @XmlElement(name = "CASCADESCHD")
    protected String cascadeschd;
    @XmlElement(name = "VFYFUNDS")
    protected String vfyfunds;
    @XmlElement(name = "LIQBCKVALSCHD")
    protected String liqbckvalschd;
    @XmlElement(name = "DEDTAXCAP")
    protected String dedtaxcap;
    @XmlElement(name = "HOLMTHFLG")
    protected String holmthflg;
    @XmlElement(name = "MVACRMTH")
    protected String mvacrmth;
    @XmlElement(name = "NOTCREQD")
    protected String notcreqd;
    @XmlElement(name = "TRKRECALIQ")
    protected String trkrecaliq;
    @XmlElement(name = "TRKRECMLIQ")
    protected String trkrecmliq;
    @XmlElement(name = "VERIFUNDPRIN")
    protected String verifundprin;
    @XmlElement(name = "VERIFUNDINT")
    protected String verifundint;
    @XmlElement(name = "VERIFUND")
    protected String verifund;
    @XmlElement(name = "PARTPAYMLIQ")
    protected String partpaymliq;
    @XmlElement(name = "SUBSALLOW")
    protected String subsallow;
    @XmlElement(name = "USERDEFSCHED")
    protected String userdefsched;
    @XmlElement(name = "SGENREQD")
    protected String sgenreqd;
    @XmlElement(name = "DEMANDBASIS")
    protected String demandbasis;
    @XmlElement(name = "MOVEPAYSCH")
    protected String movepaysch;
    @XmlElement(name = "MOVEREVSCH")
    protected String moverevsch;
    @XmlElement(name = "MOVECOMMREDNSCH")
    protected String movecommrednsch;
    @XmlElement(name = "MOVEDISSCH")
    protected String movedissch;
    @XmlElement(name = "RNDNGREQ")
    protected String rndngreq;
    @XmlElement(name = "CCYRNDRULE")
    protected String ccyrndrule;
    @XmlElement(name = "CCYDECIMALS")
    protected BigInteger ccydecimals;
    @XmlElement(name = "CCYRNDUNIT")
    protected BigDecimal ccyrndunit;
    @XmlElement(name = "RVNCONSBRNHOL")
    protected String rvnconsbrnhol;
    @XmlElement(name = "MCONSBRNHOL")
    protected String mconsbrnhol;
    @XmlElement(name = "CONSBRNHOL")
    protected String consbrnhol;
    @XmlElement(name = "APLYFACLTYHOLCCY")
    protected String aplyfacltyholccy;
    @XmlElement(name = "APLYCONTHOLCCY")
    protected String aplycontholccy;
    @XmlElement(name = "APLYLCLHOLCCY")
    protected String aplylclholccy;
    @XmlElement(name = "CHKRATECDCCY")
    protected String chkratecdccy;
    @XmlElement(name = "MSCHCCY")
    protected String mschccy;
    @XmlElement(name = "MSCHAPLYFACLTYHOLCCY")
    protected String mschaplyfacltyholccy;
    @XmlElement(name = "MSCHAPLYCONTHOLCCY")
    protected String mschaplycontholccy;
    @XmlElement(name = "MSCHAPLYLCLHOLCCY")
    protected String mschaplylclholccy;
    @XmlElement(name = "RVNCASCSCHD")
    protected String rvncascschd;
    @XmlElement(name = "RVNMOVEACROSSMNTH")
    protected String rvnmoveacrossmnth;
    @XmlElement(name = "RVNAPLYFACLTYHOLCCY")
    protected String rvnaplyfacltyholccy;
    @XmlElement(name = "RVNAPLYCONTHOLCCY")
    protected String rvnaplycontholccy;
    @XmlElement(name = "RVNAPLYLCLHOLCCY")
    protected String rvnaplylclholccy;
    @XmlElement(name = "RVNCCY")
    protected String rvnccy;
    @XmlElement(name = "RVNIGHOL")
    protected String rvnighol;
    @XmlElement(name = "MAXRATEREVPRD")
    protected BigInteger maxraterevprd;
    @XmlElement(name = "MSCHINDHOLTREAT")
    protected String mschindholtreat;
    @XmlElement(name = "RVNINDHOLTREAT")
    protected String rvnindholtreat;
    @XmlElement(name = "MSCHMOVEACROSSMNTH")
    protected String mschmoveacrossmnth;
    @XmlElement(name = "MSCHIGHOL")
    protected String mschighol;
    @XmlElement(name = "LNSTMTTYPE")
    protected String lnstmttype;
    @XmlElement(name = "MAT_TYPE")
    protected String mattype;
    @XmlElement(name = "PRCCYTYP")
    protected String prccytyp;
    @XmlElement(name = "ROLLALLW")
    protected String rollallw;
    @XmlElement(name = "AMORTYPE")
    protected String amortype;
    @XmlElement(name = "PRINCLIQ")
    protected String princliq;
    @XmlElement(name = "STACTL")
    protected String stactl;
    @XmlElement(name = "REVCOMM")
    protected String revcomm;
    @XmlElement(name = "SCHDMOVE")
    protected String schdmove;
    @XmlElement(name = "RVNSCHDMOVE")
    protected String rvnschdmove;
    @XmlElement(name = "MSCHSCHDMOVE")
    protected String mschschdmove;
    @XmlElement(name = "PRDSCHTYPE")
    protected String prdschtype;
    @XmlElement(name = "SUBSYSTEMSTAT")
    protected String subsystemstat;
    @XmlElement(name = "PURPOFSYND")
    protected String purpofsynd;
    @XmlElement(name = "LATINTRAT")
    protected BigDecimal latintrat;
    @XmlElement(name = "Settlement-Addl-Details")
    protected List<SettlementAddlDetailsType> settlementAddlDetails;
    @XmlElement(name = "Settlement-Details")
    protected List<SettlementDetailsType> settlementDetails;
    @XmlElement(name = "Clearing-Details")
    protected List<SettlementClearingDetails> clearingDetails;
    @XmlElement(name = "Mis-Details")
    protected MISDETAILSType misDetails;
    @XmlElement(name = "Balance-Trnsfer-Log")
    protected MISBALTRANLOGDetails balanceTrnsferLog;
    @XmlElement(name = "Mis-Change-Log")
    protected MISCHANGELOGDetails misChangeLog;
    @XmlElement(name = "Mis-Amend")
    protected MISAMENDDetails misAmend;
    @XmlElement(name = "Refinance-Rate")
    protected MISRefineRateDetails refinanceRate;
    @XmlElement(name = "Udf-Details")
    protected List<UDFDETAILSType> udfDetails;
    @XmlElement(name = "Charge-Application")
    protected List<CHGSAppType> chargeApplication;
    @XmlElement(name = "Charge-Association")
    protected List<ChgAssType> chargeAssociation;
    @XmlElement(name = "Charge-Liquidation")
    protected List<ChgLiqType> chargeLiquidation;
    @XmlElement(name = "Interest-Main")
    protected List<IntMainType> interestMain;
    @XmlElement(name = "Taxdetails-Main")
    protected List<TaxMainType> taxdetailsMain;
    @XmlElement(name = "Taxdetails")
    protected List<TaxDetailType> taxdetails;
    @XmlElement(name = "ContractSchedules1")
    protected List<ScheduleType> contractSchedules1;
    @XmlElement(name = "Contract_Linkages")
    protected List<LinkageType> contractLinkages;
    @XmlElement(name = "Relationship-Linkage")
    protected List<LINKEDENTITYType> relationshipLinkage;
    @XmlElement(name = "Brokerage-Master")
    protected BrkMasterType brokerageMaster;
    @XmlElement(name = "Advice-Details")
    protected List<ADVDETAILSType> adviceDetails;
    @XmlElement(name = "Settlement-Split-Master")
    protected SplitSettlementFullDetailType settlementSplitMaster;
    @XmlElement(name = "Contract-Schedules")
    protected List<ScheduleType> contractSchedules;
    @XmlElement(name = "Change-Log")
    protected List<LoansandDepositsFullType.ChangeLog> changeLog;
    @XmlElement(name = "Contract-Event-Log")
    protected LoansandDepositsFullType.ContractEventLog contractEventLog;
    @XmlElement(name = "Schedule-Dates")
    protected List<LoansandDepositsFullType.ScheduleDates> scheduleDates;
    @XmlElement(name = "Schedule-Summ")
    protected List<LoansandDepositsFullType.ScheduleSumm> scheduleSumm;
    @XmlElement(name = "Holiday-Currencies")
    protected List<LISTHOLCCYType14> holidayCurrencies;
    @XmlElement(name = "Contract-Rollover")
    protected List<ROLLOVERType2> contractRollover;

    /**
     * Gets the value of the fccref property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFCCREF() {
        return fccref;
    }

    /**
     * Sets the value of the fccref property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFCCREF(String value) {
        this.fccref = value;
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
     * Gets the value of the contstat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCONTSTAT() {
        return contstat;
    }

    /**
     * Sets the value of the contstat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCONTSTAT(String value) {
        this.contstat = value;
    }

    /**
     * Gets the value of the uref property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUREF() {
        return uref;
    }

    /**
     * Sets the value of the uref property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUREF(String value) {
        this.uref = value;
    }

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
     * Gets the value of the cptyconfstat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCPTYCONFSTAT() {
        return cptyconfstat;
    }

    /**
     * Sets the value of the cptyconfstat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCPTYCONFSTAT(String value) {
        this.cptyconfstat = value;
    }

    /**
     * Gets the value of the latestverno property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLATESTVERNO() {
        return latestverno;
    }

    /**
     * Sets the value of the latestverno property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLATESTVERNO(BigInteger value) {
        this.latestverno = value;
    }

    /**
     * Gets the value of the revconref property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getREVCONREF() {
        return revconref;
    }

    /**
     * Sets the value of the revconref property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setREVCONREF(String value) {
        this.revconref = value;
    }

    /**
     * Gets the value of the src property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSRC() {
        return src;
    }

    /**
     * Sets the value of the src property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSRC(String value) {
        this.src = value;
    }

    /**
     * Gets the value of the allowprepay property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getALLOWPREPAY() {
        return allowprepay;
    }

    /**
     * Sets the value of the allowprepay property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setALLOWPREPAY(String value) {
        this.allowprepay = value;
    }

    /**
     * Gets the value of the amt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAMT() {
        return amt;
    }

    /**
     * Sets the value of the amt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAMT(BigDecimal value) {
        this.amt = value;
    }

    /**
     * Gets the value of the annloan property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getANNLOAN() {
        return annloan;
    }

    /**
     * Sets the value of the annloan property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setANNLOAN(String value) {
        this.annloan = value;
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
     * Gets the value of the baref property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBAREF() {
        return baref;
    }

    /**
     * Sets the value of the baref property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBAREF(String value) {
        this.baref = value;
    }

    /**
     * Gets the value of the billrefno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBILLREFNO() {
        return billrefno;
    }

    /**
     * Sets the value of the billrefno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBILLREFNO(String value) {
        this.billrefno = value;
    }

    /**
     * Gets the value of the bookdt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public String getBOOKDT() {
        return bookdt;
    }

    /**
     * Sets the value of the bookdt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBOOKDT(String value) {
        this.bookdt = value;
    }

    /**
     * Gets the value of the brk property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBRK() {
        return brk;
    }

    /**
     * Sets the value of the brk property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBRK(String value) {
        this.brk = value;
    }

    /**
     * Gets the value of the clusid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCLUSID() {
        return clusid;
    }

    /**
     * Sets the value of the clusid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCLUSID(String value) {
        this.clusid = value;
    }

    /**
     * Gets the value of the clussize property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCLUSSIZE() {
        return clussize;
    }

    /**
     * Sets the value of the clussize property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCLUSSIZE(BigDecimal value) {
        this.clussize = value;
    }

    /**
     * Gets the value of the conderivstat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCONDERIVSTAT() {
        return conderivstat;
    }

    /**
     * Sets the value of the conderivstat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCONDERIVSTAT(String value) {
        this.conderivstat = value;
    }

    /**
     * Gets the value of the cpty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCPTY() {
        return cpty;
    }

    /**
     * Sets the value of the cpty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCPTY(String value) {
        this.cpty = value;
    }

    /**
     * Gets the value of the line property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLINE() {
        return line;
    }

    /**
     * Sets the value of the line property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLINE(String value) {
        this.line = value;
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
     * Gets the value of the dealer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDEALER() {
        return dealer;
    }

    /**
     * Sets the value of the dealer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDEALER(String value) {
        this.dealer = value;
    }

    /**
     * Gets the value of the dfltacc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDFLTACC() {
        return dfltacc;
    }

    /**
     * Sets the value of the dfltacc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDFLTACC(String value) {
        this.dfltacc = value;
    }

    /**
     * Gets the value of the dfltaccbrn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDFLTACCBRN() {
        return dfltaccbrn;
    }

    /**
     * Sets the value of the dfltaccbrn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDFLTACCBRN(String value) {
        this.dfltaccbrn = value;
    }

    /**
     * Gets the value of the drsetlac property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDRSETLAC() {
        return drsetlac;
    }

    /**
     * Sets the value of the drsetlac property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDRSETLAC(String value) {
        this.drsetlac = value;
    }

    /**
     * Gets the value of the drsetlacbr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDRSETLACBR() {
        return drsetlacbr;
    }

    /**
     * Sets the value of the drsetlacbr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDRSETLACBR(String value) {
        this.drsetlacbr = value;
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
     * Gets the value of the intperbas property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINTPERBAS() {
        return intperbas;
    }

    /**
     * Sets the value of the intperbas property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINTPERBAS(String value) {
        this.intperbas = value;
    }

    /**
     * Gets the value of the intrefno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINTREFNO() {
        return intrefno;
    }

    /**
     * Sets the value of the intrefno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINTREFNO(String value) {
        this.intrefno = value;
    }

    /**
     * Gets the value of the lastavldt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLASTAVLDT() {
        return lastavldt;
    }

    /**
     * Sets the value of the lastavldt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLASTAVLDT(XMLGregorianCalendar value) {
        this.lastavldt = value;
    }

    /**
     * Gets the value of the lcyeqindln property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLCYEQINDLN() {
        return lcyeqindln;
    }

    /**
     * Sets the value of the lcyeqindln property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLCYEQINDLN(BigDecimal value) {
        this.lcyeqindln = value;
    }

    /**
     * Gets the value of the lnstmtcyc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLNSTMTCYC() {
        return lnstmtcyc;
    }

    /**
     * Sets the value of the lnstmtcyc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLNSTMTCYC(String value) {
        this.lnstmtcyc = value;
    }

    /**
     * Gets the value of the matdt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public String getMATDT() {
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
    public void setMATDT(String value) {
        this.matdt = value;
    }

    /**
     * Gets the value of the multicif property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMULTICIF() {
        return multicif;
    }

    /**
     * Sets the value of the multicif property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMULTICIF(String value) {
        this.multicif = value;
    }

    /**
     * Gets the value of the notcdays property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNOTCDAYS() {
        return notcdays;
    }

    /**
     * Sets the value of the notcdays property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNOTCDAYS(String value) {
        this.notcdays = value;
    }

    /**
     * Gets the value of the orglstdt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getORGLSTDT() {
        return orglstdt;
    }

    /**
     * Sets the value of the orglstdt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setORGLSTDT(XMLGregorianCalendar value) {
        this.orglstdt = value;
    }

    /**
     * Gets the value of the parfccref property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPARFCCREF() {
        return parfccref;
    }

    /**
     * Sets the value of the parfccref property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPARFCCREF(String value) {
        this.parfccref = value;
    }

    /**
     * Gets the value of the parextrefno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPAREXTREFNO() {
        return parextrefno;
    }

    /**
     * Sets the value of the parextrefno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPAREXTREFNO(String value) {
        this.parextrefno = value;
    }

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
     * Gets the value of the relref property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRELREF() {
        return relref;
    }

    /**
     * Sets the value of the relref property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRELREF(String value) {
        this.relref = value;
    }

    /**
     * Gets the value of the tdesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTDESC() {
        return tdesc;
    }

    /**
     * Sets the value of the tdesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTDESC(String value) {
        this.tdesc = value;
    }

    /**
     * Gets the value of the rfexpamt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRFEXPAMT() {
        return rfexpamt;
    }

    /**
     * Sets the value of the rfexpamt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRFEXPAMT(BigDecimal value) {
        this.rfexpamt = value;
    }

    /**
     * Gets the value of the rollovrcnt property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getROLLOVRCNT() {
        return rollovrcnt;
    }

    /**
     * Sets the value of the rollovrcnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setROLLOVRCNT(BigInteger value) {
        this.rollovrcnt = value;
    }

    /**
     * Gets the value of the rollovrind property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getROLLOVRIND() {
        return rollovrind;
    }

    /**
     * Sets the value of the rollovrind property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setROLLOVRIND(String value) {
        this.rollovrind = value;
    }

    /**
     * Gets the value of the stmtday property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSTMTDAY() {
        return stmtday;
    }

    /**
     * Sets the value of the stmtday property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSTMTDAY(BigInteger value) {
        this.stmtday = value;
    }

    /**
     * Gets the value of the subsidyper property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSUBSIDYPER() {
        return subsidyper;
    }

    /**
     * Sets the value of the subsidyper property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSUBSIDYPER(BigDecimal value) {
        this.subsidyper = value;
    }

    /**
     * Gets the value of the taxscheme property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTAXSCHEME() {
        return taxscheme;
    }

    /**
     * Sets the value of the taxscheme property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTAXSCHEME(String value) {
        this.taxscheme = value;
    }

    /**
     * Gets the value of the udstat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUDSTAT() {
        return udstat;
    }

    /**
     * Sets the value of the udstat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUDSTAT(String value) {
        this.udstat = value;
    }

    /**
     * Gets the value of the userinputmatdt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUSERINPUTMATDT() {
        return userinputmatdt;
    }

    /**
     * Sets the value of the userinputmatdt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUSERINPUTMATDT(XMLGregorianCalendar value) {
        this.userinputmatdt = value;
    }

    /**
     * Gets the value of the valdt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public String getVALDT() {
        return valdt;
    }

    /**
     * Sets the value of the valdt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setVALDT(String value) {
        this.valdt = value;
    }

    /**
     * Gets the value of the verno property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getVERNO() {
        return verno;
    }

    /**
     * Sets the value of the verno property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setVERNO(BigInteger value) {
        this.verno = value;
    }

    /**
     * Gets the value of the pamtmethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPAMTMETHOD() {
        return pamtmethod;
    }

    /**
     * Sets the value of the pamtmethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPAMTMETHOD(String value) {
        this.pamtmethod = value;
    }

    /**
     * Gets the value of the outbal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOUTBAL() {
        return outbal;
    }

    /**
     * Sets the value of the outbal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOUTBAL(BigDecimal value) {
        this.outbal = value;
    }

    /**
     * Gets the value of the protypedesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPROTYPEDESC() {
        return protypedesc;
    }

    /**
     * Sets the value of the protypedesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPROTYPEDESC(String value) {
        this.protypedesc = value;
    }

    /**
     * Gets the value of the provamt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPROVAMT() {
        return provamt;
    }

    /**
     * Sets the value of the provamt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPROVAMT(BigDecimal value) {
        this.provamt = value;
    }

    /**
     * Gets the value of the amtinrptccy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAMTINRPTCCY() {
        return amtinrptccy;
    }

    /**
     * Sets the value of the amtinrptccy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAMTINRPTCCY(String value) {
        this.amtinrptccy = value;
    }

    /**
     * Gets the value of the rptccy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRPTCCY() {
        return rptccy;
    }

    /**
     * Sets the value of the rptccy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRPTCCY(String value) {
        this.rptccy = value;
    }

    /**
     * Gets the value of the osbalrptccy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOSBALRPTCCY() {
        return osbalrptccy;
    }

    /**
     * Sets the value of the osbalrptccy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOSBALRPTCCY(String value) {
        this.osbalrptccy = value;
    }

    /**
     * Gets the value of the igrholdys property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIGRHOLDYS() {
        return igrholdys;
    }

    /**
     * Sets the value of the igrholdys property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIGRHOLDYS(String value) {
        this.igrholdys = value;
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
     * Gets the value of the cascadeschd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCASCADESCHD() {
        return cascadeschd;
    }

    /**
     * Sets the value of the cascadeschd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCASCADESCHD(String value) {
        this.cascadeschd = value;
    }

    /**
     * Gets the value of the vfyfunds property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVFYFUNDS() {
        return vfyfunds;
    }

    /**
     * Sets the value of the vfyfunds property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVFYFUNDS(String value) {
        this.vfyfunds = value;
    }

    /**
     * Gets the value of the liqbckvalschd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLIQBCKVALSCHD() {
        return liqbckvalschd;
    }

    /**
     * Sets the value of the liqbckvalschd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLIQBCKVALSCHD(String value) {
        this.liqbckvalschd = value;
    }

    /**
     * Gets the value of the dedtaxcap property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDEDTAXCAP() {
        return dedtaxcap;
    }

    /**
     * Sets the value of the dedtaxcap property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDEDTAXCAP(String value) {
        this.dedtaxcap = value;
    }

    /**
     * Gets the value of the holmthflg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHOLMTHFLG() {
        return holmthflg;
    }

    /**
     * Sets the value of the holmthflg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHOLMTHFLG(String value) {
        this.holmthflg = value;
    }

    /**
     * Gets the value of the mvacrmth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMVACRMTH() {
        return mvacrmth;
    }

    /**
     * Sets the value of the mvacrmth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMVACRMTH(String value) {
        this.mvacrmth = value;
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
     * Gets the value of the trkrecaliq property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTRKRECALIQ() {
        return trkrecaliq;
    }

    /**
     * Sets the value of the trkrecaliq property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTRKRECALIQ(String value) {
        this.trkrecaliq = value;
    }

    /**
     * Gets the value of the trkrecmliq property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTRKRECMLIQ() {
        return trkrecmliq;
    }

    /**
     * Sets the value of the trkrecmliq property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTRKRECMLIQ(String value) {
        this.trkrecmliq = value;
    }

    /**
     * Gets the value of the verifundprin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVERIFUNDPRIN() {
        return verifundprin;
    }

    /**
     * Sets the value of the verifundprin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVERIFUNDPRIN(String value) {
        this.verifundprin = value;
    }

    /**
     * Gets the value of the verifundint property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVERIFUNDINT() {
        return verifundint;
    }

    /**
     * Sets the value of the verifundint property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVERIFUNDINT(String value) {
        this.verifundint = value;
    }

    /**
     * Gets the value of the verifund property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVERIFUND() {
        return verifund;
    }

    /**
     * Sets the value of the verifund property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVERIFUND(String value) {
        this.verifund = value;
    }

    /**
     * Gets the value of the partpaymliq property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPARTPAYMLIQ() {
        return partpaymliq;
    }

    /**
     * Sets the value of the partpaymliq property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPARTPAYMLIQ(String value) {
        this.partpaymliq = value;
    }

    /**
     * Gets the value of the subsallow property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSUBSALLOW() {
        return subsallow;
    }

    /**
     * Sets the value of the subsallow property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSUBSALLOW(String value) {
        this.subsallow = value;
    }

    /**
     * Gets the value of the userdefsched property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUSERDEFSCHED() {
        return userdefsched;
    }

    /**
     * Sets the value of the userdefsched property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUSERDEFSCHED(String value) {
        this.userdefsched = value;
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
     * Gets the value of the demandbasis property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDEMANDBASIS() {
        return demandbasis;
    }

    /**
     * Sets the value of the demandbasis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDEMANDBASIS(String value) {
        this.demandbasis = value;
    }

    /**
     * Gets the value of the movepaysch property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMOVEPAYSCH() {
        return movepaysch;
    }

    /**
     * Sets the value of the movepaysch property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMOVEPAYSCH(String value) {
        this.movepaysch = value;
    }

    /**
     * Gets the value of the moverevsch property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMOVEREVSCH() {
        return moverevsch;
    }

    /**
     * Sets the value of the moverevsch property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMOVEREVSCH(String value) {
        this.moverevsch = value;
    }

    /**
     * Gets the value of the movecommrednsch property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMOVECOMMREDNSCH() {
        return movecommrednsch;
    }

    /**
     * Sets the value of the movecommrednsch property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMOVECOMMREDNSCH(String value) {
        this.movecommrednsch = value;
    }

    /**
     * Gets the value of the movedissch property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMOVEDISSCH() {
        return movedissch;
    }

    /**
     * Sets the value of the movedissch property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMOVEDISSCH(String value) {
        this.movedissch = value;
    }

    /**
     * Gets the value of the rndngreq property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRNDNGREQ() {
        return rndngreq;
    }

    /**
     * Sets the value of the rndngreq property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRNDNGREQ(String value) {
        this.rndngreq = value;
    }

    /**
     * Gets the value of the ccyrndrule property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCCYRNDRULE() {
        return ccyrndrule;
    }

    /**
     * Sets the value of the ccyrndrule property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCCYRNDRULE(String value) {
        this.ccyrndrule = value;
    }

    /**
     * Gets the value of the ccydecimals property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCCYDECIMALS() {
        return ccydecimals;
    }

    /**
     * Sets the value of the ccydecimals property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCCYDECIMALS(BigInteger value) {
        this.ccydecimals = value;
    }

    /**
     * Gets the value of the ccyrndunit property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCCYRNDUNIT() {
        return ccyrndunit;
    }

    /**
     * Sets the value of the ccyrndunit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCCYRNDUNIT(BigDecimal value) {
        this.ccyrndunit = value;
    }

    /**
     * Gets the value of the rvnconsbrnhol property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRVNCONSBRNHOL() {
        return rvnconsbrnhol;
    }

    /**
     * Sets the value of the rvnconsbrnhol property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRVNCONSBRNHOL(String value) {
        this.rvnconsbrnhol = value;
    }

    /**
     * Gets the value of the mconsbrnhol property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMCONSBRNHOL() {
        return mconsbrnhol;
    }

    /**
     * Sets the value of the mconsbrnhol property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMCONSBRNHOL(String value) {
        this.mconsbrnhol = value;
    }

    /**
     * Gets the value of the consbrnhol property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCONSBRNHOL() {
        return consbrnhol;
    }

    /**
     * Sets the value of the consbrnhol property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCONSBRNHOL(String value) {
        this.consbrnhol = value;
    }

    /**
     * Gets the value of the aplyfacltyholccy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPLYFACLTYHOLCCY() {
        return aplyfacltyholccy;
    }

    /**
     * Sets the value of the aplyfacltyholccy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPLYFACLTYHOLCCY(String value) {
        this.aplyfacltyholccy = value;
    }

    /**
     * Gets the value of the aplycontholccy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPLYCONTHOLCCY() {
        return aplycontholccy;
    }

    /**
     * Sets the value of the aplycontholccy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPLYCONTHOLCCY(String value) {
        this.aplycontholccy = value;
    }

    /**
     * Gets the value of the aplylclholccy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPLYLCLHOLCCY() {
        return aplylclholccy;
    }

    /**
     * Sets the value of the aplylclholccy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPLYLCLHOLCCY(String value) {
        this.aplylclholccy = value;
    }

    /**
     * Gets the value of the chkratecdccy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCHKRATECDCCY() {
        return chkratecdccy;
    }

    /**
     * Sets the value of the chkratecdccy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCHKRATECDCCY(String value) {
        this.chkratecdccy = value;
    }

    /**
     * Gets the value of the mschccy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMSCHCCY() {
        return mschccy;
    }

    /**
     * Sets the value of the mschccy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMSCHCCY(String value) {
        this.mschccy = value;
    }

    /**
     * Gets the value of the mschaplyfacltyholccy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMSCHAPLYFACLTYHOLCCY() {
        return mschaplyfacltyholccy;
    }

    /**
     * Sets the value of the mschaplyfacltyholccy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMSCHAPLYFACLTYHOLCCY(String value) {
        this.mschaplyfacltyholccy = value;
    }

    /**
     * Gets the value of the mschaplycontholccy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMSCHAPLYCONTHOLCCY() {
        return mschaplycontholccy;
    }

    /**
     * Sets the value of the mschaplycontholccy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMSCHAPLYCONTHOLCCY(String value) {
        this.mschaplycontholccy = value;
    }

    /**
     * Gets the value of the mschaplylclholccy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMSCHAPLYLCLHOLCCY() {
        return mschaplylclholccy;
    }

    /**
     * Sets the value of the mschaplylclholccy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMSCHAPLYLCLHOLCCY(String value) {
        this.mschaplylclholccy = value;
    }

    /**
     * Gets the value of the rvncascschd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRVNCASCSCHD() {
        return rvncascschd;
    }

    /**
     * Sets the value of the rvncascschd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRVNCASCSCHD(String value) {
        this.rvncascschd = value;
    }

    /**
     * Gets the value of the rvnmoveacrossmnth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRVNMOVEACROSSMNTH() {
        return rvnmoveacrossmnth;
    }

    /**
     * Sets the value of the rvnmoveacrossmnth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRVNMOVEACROSSMNTH(String value) {
        this.rvnmoveacrossmnth = value;
    }

    /**
     * Gets the value of the rvnaplyfacltyholccy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRVNAPLYFACLTYHOLCCY() {
        return rvnaplyfacltyholccy;
    }

    /**
     * Sets the value of the rvnaplyfacltyholccy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRVNAPLYFACLTYHOLCCY(String value) {
        this.rvnaplyfacltyholccy = value;
    }

    /**
     * Gets the value of the rvnaplycontholccy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRVNAPLYCONTHOLCCY() {
        return rvnaplycontholccy;
    }

    /**
     * Sets the value of the rvnaplycontholccy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRVNAPLYCONTHOLCCY(String value) {
        this.rvnaplycontholccy = value;
    }

    /**
     * Gets the value of the rvnaplylclholccy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRVNAPLYLCLHOLCCY() {
        return rvnaplylclholccy;
    }

    /**
     * Sets the value of the rvnaplylclholccy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRVNAPLYLCLHOLCCY(String value) {
        this.rvnaplylclholccy = value;
    }

    /**
     * Gets the value of the rvnccy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRVNCCY() {
        return rvnccy;
    }

    /**
     * Sets the value of the rvnccy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRVNCCY(String value) {
        this.rvnccy = value;
    }

    /**
     * Gets the value of the rvnighol property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRVNIGHOL() {
        return rvnighol;
    }

    /**
     * Sets the value of the rvnighol property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRVNIGHOL(String value) {
        this.rvnighol = value;
    }

    /**
     * Gets the value of the maxraterevprd property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMAXRATEREVPRD() {
        return maxraterevprd;
    }

    /**
     * Sets the value of the maxraterevprd property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMAXRATEREVPRD(BigInteger value) {
        this.maxraterevprd = value;
    }

    /**
     * Gets the value of the mschindholtreat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMSCHINDHOLTREAT() {
        return mschindholtreat;
    }

    /**
     * Sets the value of the mschindholtreat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMSCHINDHOLTREAT(String value) {
        this.mschindholtreat = value;
    }

    /**
     * Gets the value of the rvnindholtreat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRVNINDHOLTREAT() {
        return rvnindholtreat;
    }

    /**
     * Sets the value of the rvnindholtreat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRVNINDHOLTREAT(String value) {
        this.rvnindholtreat = value;
    }

    /**
     * Gets the value of the mschmoveacrossmnth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMSCHMOVEACROSSMNTH() {
        return mschmoveacrossmnth;
    }

    /**
     * Sets the value of the mschmoveacrossmnth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMSCHMOVEACROSSMNTH(String value) {
        this.mschmoveacrossmnth = value;
    }

    /**
     * Gets the value of the mschighol property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMSCHIGHOL() {
        return mschighol;
    }

    /**
     * Sets the value of the mschighol property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMSCHIGHOL(String value) {
        this.mschighol = value;
    }

    /**
     * Gets the value of the lnstmttype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLNSTMTTYPE() {
        return lnstmttype;
    }

    /**
     * Sets the value of the lnstmttype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLNSTMTTYPE(String value) {
        this.lnstmttype = value;
    }

    /**
     * Gets the value of the mattype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMATTYPE() {
        return mattype;
    }

    /**
     * Sets the value of the mattype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMATTYPE(String value) {
        this.mattype = value;
    }

    /**
     * Gets the value of the prccytyp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRCCYTYP() {
        return prccytyp;
    }

    /**
     * Sets the value of the prccytyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRCCYTYP(String value) {
        this.prccytyp = value;
    }

    /**
     * Gets the value of the rollallw property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getROLLALLW() {
        return rollallw;
    }

    /**
     * Sets the value of the rollallw property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setROLLALLW(String value) {
        this.rollallw = value;
    }

    /**
     * Gets the value of the amortype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAMORTYPE() {
        return amortype;
    }

    /**
     * Sets the value of the amortype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAMORTYPE(String value) {
        this.amortype = value;
    }

    /**
     * Gets the value of the princliq property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRINCLIQ() {
        return princliq;
    }

    /**
     * Sets the value of the princliq property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRINCLIQ(String value) {
        this.princliq = value;
    }

    /**
     * Gets the value of the stactl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTACTL() {
        return stactl;
    }

    /**
     * Sets the value of the stactl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSTACTL(String value) {
        this.stactl = value;
    }

    /**
     * Gets the value of the revcomm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getREVCOMM() {
        return revcomm;
    }

    /**
     * Sets the value of the revcomm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setREVCOMM(String value) {
        this.revcomm = value;
    }

    /**
     * Gets the value of the schdmove property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSCHDMOVE() {
        return schdmove;
    }

    /**
     * Sets the value of the schdmove property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSCHDMOVE(String value) {
        this.schdmove = value;
    }

    /**
     * Gets the value of the rvnschdmove property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRVNSCHDMOVE() {
        return rvnschdmove;
    }

    /**
     * Sets the value of the rvnschdmove property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRVNSCHDMOVE(String value) {
        this.rvnschdmove = value;
    }

    /**
     * Gets the value of the mschschdmove property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMSCHSCHDMOVE() {
        return mschschdmove;
    }

    /**
     * Sets the value of the mschschdmove property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMSCHSCHDMOVE(String value) {
        this.mschschdmove = value;
    }

    /**
     * Gets the value of the prdschtype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRDSCHTYPE() {
        return prdschtype;
    }

    /**
     * Sets the value of the prdschtype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRDSCHTYPE(String value) {
        this.prdschtype = value;
    }

    /**
     * Gets the value of the subsystemstat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSUBSYSTEMSTAT() {
        return subsystemstat;
    }

    /**
     * Sets the value of the subsystemstat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSUBSYSTEMSTAT(String value) {
        this.subsystemstat = value;
    }

    /**
     * Gets the value of the purpofsynd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPURPOFSYND() {
        return purpofsynd;
    }

    /**
     * Sets the value of the purpofsynd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPURPOFSYND(String value) {
        this.purpofsynd = value;
    }

    /**
     * Gets the value of the latintrat property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLATINTRAT() {
        return latintrat;
    }

    /**
     * Sets the value of the latintrat property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLATINTRAT(BigDecimal value) {
        this.latintrat = value;
    }

    /**
     * Gets the value of the settlementAddlDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the settlementAddlDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSettlementAddlDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SettlementAddlDetailsType }
     * 
     * 
     */
    public List<SettlementAddlDetailsType> getSettlementAddlDetails() {
        if (settlementAddlDetails == null) {
            settlementAddlDetails = new ArrayList<SettlementAddlDetailsType>();
        }
        return this.settlementAddlDetails;
    }

    /**
     * Gets the value of the settlementDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the settlementDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSettlementDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SettlementDetailsType }
     * 
     * 
     */
    public List<SettlementDetailsType> getSettlementDetails() {
        if (settlementDetails == null) {
            settlementDetails = new ArrayList<SettlementDetailsType>();
        }
        return this.settlementDetails;
    }

    /**
     * Gets the value of the clearingDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the clearingDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClearingDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SettlementClearingDetails }
     * 
     * 
     */
    public List<SettlementClearingDetails> getClearingDetails() {
        if (clearingDetails == null) {
            clearingDetails = new ArrayList<SettlementClearingDetails>();
        }
        return this.clearingDetails;
    }

    /**
     * Gets the value of the misDetails property.
     * 
     * @return
     *     possible object is
     *     {@link MISDETAILSType }
     *     
     */
    public MISDETAILSType getMisDetails() {
        return misDetails;
    }

    /**
     * Sets the value of the misDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link MISDETAILSType }
     *     
     */
    public void setMisDetails(MISDETAILSType value) {
        this.misDetails = value;
    }

    /**
     * Gets the value of the balanceTrnsferLog property.
     * 
     * @return
     *     possible object is
     *     {@link MISBALTRANLOGDetails }
     *     
     */
    public MISBALTRANLOGDetails getBalanceTrnsferLog() {
        return balanceTrnsferLog;
    }

    /**
     * Sets the value of the balanceTrnsferLog property.
     * 
     * @param value
     *     allowed object is
     *     {@link MISBALTRANLOGDetails }
     *     
     */
    public void setBalanceTrnsferLog(MISBALTRANLOGDetails value) {
        this.balanceTrnsferLog = value;
    }

    /**
     * Gets the value of the misChangeLog property.
     * 
     * @return
     *     possible object is
     *     {@link MISCHANGELOGDetails }
     *     
     */
    public MISCHANGELOGDetails getMisChangeLog() {
        return misChangeLog;
    }

    /**
     * Sets the value of the misChangeLog property.
     * 
     * @param value
     *     allowed object is
     *     {@link MISCHANGELOGDetails }
     *     
     */
    public void setMisChangeLog(MISCHANGELOGDetails value) {
        this.misChangeLog = value;
    }

    /**
     * Gets the value of the misAmend property.
     * 
     * @return
     *     possible object is
     *     {@link MISAMENDDetails }
     *     
     */
    public MISAMENDDetails getMisAmend() {
        return misAmend;
    }

    /**
     * Sets the value of the misAmend property.
     * 
     * @param value
     *     allowed object is
     *     {@link MISAMENDDetails }
     *     
     */
    public void setMisAmend(MISAMENDDetails value) {
        this.misAmend = value;
    }

    /**
     * Gets the value of the refinanceRate property.
     * 
     * @return
     *     possible object is
     *     {@link MISRefineRateDetails }
     *     
     */
    public MISRefineRateDetails getRefinanceRate() {
        return refinanceRate;
    }

    /**
     * Sets the value of the refinanceRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link MISRefineRateDetails }
     *     
     */
    public void setRefinanceRate(MISRefineRateDetails value) {
        this.refinanceRate = value;
    }

    /**
     * Gets the value of the udfDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the udfDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUdfDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UDFDETAILSType }
     * 
     * 
     */
    public List<UDFDETAILSType> getUdfDetails() {
        if (udfDetails == null) {
            udfDetails = new ArrayList<UDFDETAILSType>();
        }
        return this.udfDetails;
    }

    /**
     * Gets the value of the chargeApplication property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the chargeApplication property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChargeApplication().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CHGSAppType }
     * 
     * 
     */
    public List<CHGSAppType> getChargeApplication() {
        if (chargeApplication == null) {
            chargeApplication = new ArrayList<CHGSAppType>();
        }
        return this.chargeApplication;
    }

    /**
     * Gets the value of the chargeAssociation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the chargeAssociation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChargeAssociation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ChgAssType }
     * 
     * 
     */
    public List<ChgAssType> getChargeAssociation() {
        if (chargeAssociation == null) {
            chargeAssociation = new ArrayList<ChgAssType>();
        }
        return this.chargeAssociation;
    }

    /**
     * Gets the value of the chargeLiquidation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the chargeLiquidation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChargeLiquidation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ChgLiqType }
     * 
     * 
     */
    public List<ChgLiqType> getChargeLiquidation() {
        if (chargeLiquidation == null) {
            chargeLiquidation = new ArrayList<ChgLiqType>();
        }
        return this.chargeLiquidation;
    }

    /**
     * Gets the value of the interestMain property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the interestMain property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInterestMain().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IntMainType }
     * 
     * 
     */
    public List<IntMainType> getInterestMain() {
        if (interestMain == null) {
            interestMain = new ArrayList<IntMainType>();
        }
        return this.interestMain;
    }

    /**
     * Gets the value of the taxdetailsMain property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the taxdetailsMain property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTaxdetailsMain().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TaxMainType }
     * 
     * 
     */
    public List<TaxMainType> getTaxdetailsMain() {
        if (taxdetailsMain == null) {
            taxdetailsMain = new ArrayList<TaxMainType>();
        }
        return this.taxdetailsMain;
    }

    /**
     * Gets the value of the taxdetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the taxdetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTaxdetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TaxDetailType }
     * 
     * 
     */
    public List<TaxDetailType> getTaxdetails() {
        if (taxdetails == null) {
            taxdetails = new ArrayList<TaxDetailType>();
        }
        return this.taxdetails;
    }

    /**
     * Gets the value of the contractSchedules1 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contractSchedules1 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContractSchedules1().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ScheduleType }
     * 
     * 
     */
    public List<ScheduleType> getContractSchedules1() {
        if (contractSchedules1 == null) {
            contractSchedules1 = new ArrayList<ScheduleType>();
        }
        return this.contractSchedules1;
    }

    /**
     * Gets the value of the contractLinkages property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contractLinkages property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContractLinkages().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LinkageType }
     * 
     * 
     */
    public List<LinkageType> getContractLinkages() {
        if (contractLinkages == null) {
            contractLinkages = new ArrayList<LinkageType>();
        }
        return this.contractLinkages;
    }

    /**
     * Gets the value of the relationshipLinkage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the relationshipLinkage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRelationshipLinkage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LINKEDENTITYType }
     * 
     * 
     */
    public List<LINKEDENTITYType> getRelationshipLinkage() {
        if (relationshipLinkage == null) {
            relationshipLinkage = new ArrayList<LINKEDENTITYType>();
        }
        return this.relationshipLinkage;
    }

    /**
     * Gets the value of the brokerageMaster property.
     * 
     * @return
     *     possible object is
     *     {@link BrkMasterType }
     *     
     */
    public BrkMasterType getBrokerageMaster() {
        return brokerageMaster;
    }

    /**
     * Sets the value of the brokerageMaster property.
     * 
     * @param value
     *     allowed object is
     *     {@link BrkMasterType }
     *     
     */
    public void setBrokerageMaster(BrkMasterType value) {
        this.brokerageMaster = value;
    }

    /**
     * Gets the value of the adviceDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the adviceDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdviceDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ADVDETAILSType }
     * 
     * 
     */
    public List<ADVDETAILSType> getAdviceDetails() {
        if (adviceDetails == null) {
            adviceDetails = new ArrayList<ADVDETAILSType>();
        }
        return this.adviceDetails;
    }

    /**
     * Gets the value of the settlementSplitMaster property.
     * 
     * @return
     *     possible object is
     *     {@link SplitSettlementFullDetailType }
     *     
     */
    public SplitSettlementFullDetailType getSettlementSplitMaster() {
        return settlementSplitMaster;
    }

    /**
     * Sets the value of the settlementSplitMaster property.
     * 
     * @param value
     *     allowed object is
     *     {@link SplitSettlementFullDetailType }
     *     
     */
    public void setSettlementSplitMaster(SplitSettlementFullDetailType value) {
        this.settlementSplitMaster = value;
    }

    /**
     * Gets the value of the contractSchedules property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contractSchedules property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContractSchedules().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ScheduleType }
     * 
     * 
     */
    public List<ScheduleType> getContractSchedules() {
        if (contractSchedules == null) {
            contractSchedules = new ArrayList<ScheduleType>();
        }
        return this.contractSchedules;
    }

    /**
     * Gets the value of the changeLog property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the changeLog property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChangeLog().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LoansandDepositsFullType.ChangeLog }
     * 
     * 
     */
    public List<LoansandDepositsFullType.ChangeLog> getChangeLog() {
        if (changeLog == null) {
            changeLog = new ArrayList<LoansandDepositsFullType.ChangeLog>();
        }
        return this.changeLog;
    }

    /**
     * Gets the value of the contractEventLog property.
     * 
     * @return
     *     possible object is
     *     {@link LoansandDepositsFullType.ContractEventLog }
     *     
     */
    public LoansandDepositsFullType.ContractEventLog getContractEventLog() {
        return contractEventLog;
    }

    /**
     * Sets the value of the contractEventLog property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoansandDepositsFullType.ContractEventLog }
     *     
     */
    public void setContractEventLog(LoansandDepositsFullType.ContractEventLog value) {
        this.contractEventLog = value;
    }

    /**
     * Gets the value of the scheduleDates property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the scheduleDates property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getScheduleDates().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LoansandDepositsFullType.ScheduleDates }
     * 
     * 
     */
    public List<LoansandDepositsFullType.ScheduleDates> getScheduleDates() {
        if (scheduleDates == null) {
            scheduleDates = new ArrayList<LoansandDepositsFullType.ScheduleDates>();
        }
        return this.scheduleDates;
    }

    /**
     * Gets the value of the scheduleSumm property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the scheduleSumm property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getScheduleSumm().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LoansandDepositsFullType.ScheduleSumm }
     * 
     * 
     */
    public List<LoansandDepositsFullType.ScheduleSumm> getScheduleSumm() {
        if (scheduleSumm == null) {
            scheduleSumm = new ArrayList<LoansandDepositsFullType.ScheduleSumm>();
        }
        return this.scheduleSumm;
    }

    /**
     * Gets the value of the holidayCurrencies property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the holidayCurrencies property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHolidayCurrencies().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LISTHOLCCYType14 }
     * 
     * 
     */
    public List<LISTHOLCCYType14> getHolidayCurrencies() {
        if (holidayCurrencies == null) {
            holidayCurrencies = new ArrayList<LISTHOLCCYType14>();
        }
        return this.holidayCurrencies;
    }

    /**
     * Gets the value of the contractRollover property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contractRollover property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContractRollover().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ROLLOVERType2 }
     * 
     * 
     */
    public List<ROLLOVERType2> getContractRollover() {
        if (contractRollover == null) {
            contractRollover = new ArrayList<ROLLOVERType2>();
        }
        return this.contractRollover;
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
     *         &lt;element name="FLDDESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="OLDISVAL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="NWDISVAL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "flddesc",
        "oldisval",
        "nwdisval"
    })
    public static class ChangeLog {

        @XmlElement(name = "FLDDESC")
        protected String flddesc;
        @XmlElement(name = "OLDISVAL")
        protected String oldisval;
        @XmlElement(name = "NWDISVAL")
        protected String nwdisval;

        /**
         * Gets the value of the flddesc property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFLDDESC() {
            return flddesc;
        }

        /**
         * Sets the value of the flddesc property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFLDDESC(String value) {
            this.flddesc = value;
        }

        /**
         * Gets the value of the oldisval property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOLDISVAL() {
            return oldisval;
        }

        /**
         * Sets the value of the oldisval property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOLDISVAL(String value) {
            this.oldisval = value;
        }

        /**
         * Gets the value of the nwdisval property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNWDISVAL() {
            return nwdisval;
        }

        /**
         * Sets the value of the nwdisval property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNWDISVAL(String value) {
            this.nwdisval = value;
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
     *         &lt;element name="MAKERID" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="MAKERSTAMP" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="CHECKERID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="CHECKERSTAMP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="AUTHSTAT" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="CONTSTAT" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="REVR_MAKERID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="REVR_MAKERSTAMP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="REVR_CHECKERID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="REVR_CHECKERSTAMP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="REVR_AUTHSTAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="REVR_CONTSTAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "makerid",
        "makerstamp",
        "checkerid",
        "checkerstamp",
        "authstat",
        "contstat",
        "revrmakerid",
        "revrmakerstamp",
        "revrcheckerid",
        "revrcheckerstamp",
        "revrauthstat",
        "revrcontstat"
    })
    public static class ContractEventLog {

        @XmlElement(name = "MAKERID", required = true)
        protected String makerid;
        @XmlElement(name = "MAKERSTAMP", required = true)
        protected String makerstamp;
        @XmlElement(name = "CHECKERID")
        protected String checkerid;
        @XmlElement(name = "CHECKERSTAMP")
        protected String checkerstamp;
        @XmlElement(name = "AUTHSTAT", required = true)
        protected String authstat;
        @XmlElement(name = "CONTSTAT", required = true)
        protected String contstat;
        @XmlElement(name = "REVR_MAKERID")
        protected String revrmakerid;
        @XmlElement(name = "REVR_MAKERSTAMP")
        protected String revrmakerstamp;
        @XmlElement(name = "REVR_CHECKERID")
        protected String revrcheckerid;
        @XmlElement(name = "REVR_CHECKERSTAMP")
        protected String revrcheckerstamp;
        @XmlElement(name = "REVR_AUTHSTAT")
        protected String revrauthstat;
        @XmlElement(name = "REVR_CONTSTAT")
        protected String revrcontstat;

        /**
         * Gets the value of the makerid property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMAKERID() {
            return makerid;
        }

        /**
         * Sets the value of the makerid property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMAKERID(String value) {
            this.makerid = value;
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
         * Gets the value of the checkerid property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCHECKERID() {
            return checkerid;
        }

        /**
         * Sets the value of the checkerid property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCHECKERID(String value) {
            this.checkerid = value;
        }

        /**
         * Gets the value of the checkerstamp property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCHECKERSTAMP() {
            return checkerstamp;
        }

        /**
         * Sets the value of the checkerstamp property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCHECKERSTAMP(String value) {
            this.checkerstamp = value;
        }

        /**
         * Gets the value of the authstat property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAUTHSTAT() {
            return authstat;
        }

        /**
         * Sets the value of the authstat property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAUTHSTAT(String value) {
            this.authstat = value;
        }

        /**
         * Gets the value of the contstat property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCONTSTAT() {
            return contstat;
        }

        /**
         * Sets the value of the contstat property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCONTSTAT(String value) {
            this.contstat = value;
        }

        /**
         * Gets the value of the revrmakerid property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getREVRMAKERID() {
            return revrmakerid;
        }

        /**
         * Sets the value of the revrmakerid property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setREVRMAKERID(String value) {
            this.revrmakerid = value;
        }

        /**
         * Gets the value of the revrmakerstamp property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getREVRMAKERSTAMP() {
            return revrmakerstamp;
        }

        /**
         * Sets the value of the revrmakerstamp property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setREVRMAKERSTAMP(String value) {
            this.revrmakerstamp = value;
        }

        /**
         * Gets the value of the revrcheckerid property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getREVRCHECKERID() {
            return revrcheckerid;
        }

        /**
         * Sets the value of the revrcheckerid property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setREVRCHECKERID(String value) {
            this.revrcheckerid = value;
        }

        /**
         * Gets the value of the revrcheckerstamp property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getREVRCHECKERSTAMP() {
            return revrcheckerstamp;
        }

        /**
         * Sets the value of the revrcheckerstamp property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setREVRCHECKERSTAMP(String value) {
            this.revrcheckerstamp = value;
        }

        /**
         * Gets the value of the revrauthstat property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getREVRAUTHSTAT() {
            return revrauthstat;
        }

        /**
         * Sets the value of the revrauthstat property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setREVRAUTHSTAT(String value) {
            this.revrauthstat = value;
        }

        /**
         * Gets the value of the revrcontstat property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getREVRCONTSTAT() {
            return revrcontstat;
        }

        /**
         * Sets the value of the revrcontstat property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setREVRCONTSTAT(String value) {
            this.revrcontstat = value;
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
     *         &lt;element name="ESN" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
     *         &lt;element name="DTOFCHNG" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *         &lt;element name="EVNTCD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "esn",
        "dtofchng",
        "evntcd"
    })
    public static class ScheduleDates {

        @XmlElement(name = "ESN")
        protected BigInteger esn;
        @XmlElement(name = "DTOFCHNG")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar dtofchng;
        @XmlElement(name = "EVNTCD")
        protected String evntcd;

        /**
         * Gets the value of the esn property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getESN() {
            return esn;
        }

        /**
         * Sets the value of the esn property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setESN(BigInteger value) {
            this.esn = value;
        }

        /**
         * Gets the value of the dtofchng property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getDTOFCHNG() {
            return dtofchng;
        }

        /**
         * Sets the value of the dtofchng property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setDTOFCHNG(XMLGregorianCalendar value) {
            this.dtofchng = value;
        }

        /**
         * Gets the value of the evntcd property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEVNTCD() {
            return evntcd;
        }

        /**
         * Sets the value of the evntcd property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEVNTCD(String value) {
            this.evntcd = value;
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
     *         &lt;element name="DUEDT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *         &lt;element name="SUBAMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="CCYAMTDUE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="DISAMTDUE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="DISAMTSETTL" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="DISADJAMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="Schedule-Details" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="SCOMP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="AMTDUE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                   &lt;element name="CCYAMTDUE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="AMTSET" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                   &lt;element name="ADJAMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                   &lt;element name="Amount-Settle" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="PAIDDT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *                             &lt;element name="CCYSETTL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="LCYEQSET" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                             &lt;element name="AMTSETTL" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                             &lt;element name="MAKERDT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
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
        "duedt",
        "subamt",
        "ccyamtdue",
        "disamtdue",
        "disamtsettl",
        "disadjamt",
        "scheduleDetails"
    })
    public static class ScheduleSumm {

        @XmlElement(name = "DUEDT")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar duedt;
        @XmlElement(name = "SUBAMT")
        protected BigDecimal subamt;
        @XmlElement(name = "CCYAMTDUE")
        protected String ccyamtdue;
        @XmlElement(name = "DISAMTDUE")
        protected BigDecimal disamtdue;
        @XmlElement(name = "DISAMTSETTL")
        protected BigDecimal disamtsettl;
        @XmlElement(name = "DISADJAMT")
        protected BigDecimal disadjamt;
        @XmlElement(name = "Schedule-Details")
        protected List<LoansandDepositsFullType.ScheduleSumm.ScheduleDetails> scheduleDetails;

        /**
         * Gets the value of the duedt property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getDUEDT() {
            return duedt;
        }

        /**
         * Sets the value of the duedt property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setDUEDT(XMLGregorianCalendar value) {
            this.duedt = value;
        }

        /**
         * Gets the value of the subamt property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getSUBAMT() {
            return subamt;
        }

        /**
         * Sets the value of the subamt property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setSUBAMT(BigDecimal value) {
            this.subamt = value;
        }

        /**
         * Gets the value of the ccyamtdue property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCCYAMTDUE() {
            return ccyamtdue;
        }

        /**
         * Sets the value of the ccyamtdue property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCCYAMTDUE(String value) {
            this.ccyamtdue = value;
        }

        /**
         * Gets the value of the disamtdue property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getDISAMTDUE() {
            return disamtdue;
        }

        /**
         * Sets the value of the disamtdue property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setDISAMTDUE(BigDecimal value) {
            this.disamtdue = value;
        }

        /**
         * Gets the value of the disamtsettl property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getDISAMTSETTL() {
            return disamtsettl;
        }

        /**
         * Sets the value of the disamtsettl property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setDISAMTSETTL(BigDecimal value) {
            this.disamtsettl = value;
        }

        /**
         * Gets the value of the disadjamt property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getDISADJAMT() {
            return disadjamt;
        }

        /**
         * Sets the value of the disadjamt property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setDISADJAMT(BigDecimal value) {
            this.disadjamt = value;
        }

        /**
         * Gets the value of the scheduleDetails property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the scheduleDetails property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getScheduleDetails().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link LoansandDepositsFullType.ScheduleSumm.ScheduleDetails }
         * 
         * 
         */
        public List<LoansandDepositsFullType.ScheduleSumm.ScheduleDetails> getScheduleDetails() {
            if (scheduleDetails == null) {
                scheduleDetails = new ArrayList<LoansandDepositsFullType.ScheduleSumm.ScheduleDetails>();
            }
            return this.scheduleDetails;
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
         *         &lt;element name="SCOMP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="AMTDUE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *         &lt;element name="CCYAMTDUE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="AMTSET" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *         &lt;element name="ADJAMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *         &lt;element name="Amount-Settle" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="PAIDDT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
         *                   &lt;element name="CCYSETTL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="LCYEQSET" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *                   &lt;element name="AMTSETTL" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *                   &lt;element name="MAKERDT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
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
            "scomp",
            "amtdue",
            "ccyamtdue",
            "amtset",
            "adjamt",
            "amountSettle"
        })
        public static class ScheduleDetails {

            @XmlElement(name = "SCOMP")
            protected String scomp;
            @XmlElement(name = "AMTDUE")
            protected BigDecimal amtdue;
            @XmlElement(name = "CCYAMTDUE")
            protected String ccyamtdue;
            @XmlElement(name = "AMTSET")
            protected BigDecimal amtset;
            @XmlElement(name = "ADJAMT")
            protected BigDecimal adjamt;
            @XmlElement(name = "Amount-Settle")
            protected List<LoansandDepositsFullType.ScheduleSumm.ScheduleDetails.AmountSettle> amountSettle;

            /**
             * Gets the value of the scomp property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSCOMP() {
                return scomp;
            }

            /**
             * Sets the value of the scomp property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSCOMP(String value) {
                this.scomp = value;
            }

            /**
             * Gets the value of the amtdue property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getAMTDUE() {
                return amtdue;
            }

            /**
             * Sets the value of the amtdue property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setAMTDUE(BigDecimal value) {
                this.amtdue = value;
            }

            /**
             * Gets the value of the ccyamtdue property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCCYAMTDUE() {
                return ccyamtdue;
            }

            /**
             * Sets the value of the ccyamtdue property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCCYAMTDUE(String value) {
                this.ccyamtdue = value;
            }

            /**
             * Gets the value of the amtset property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getAMTSET() {
                return amtset;
            }

            /**
             * Sets the value of the amtset property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setAMTSET(BigDecimal value) {
                this.amtset = value;
            }

            /**
             * Gets the value of the adjamt property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getADJAMT() {
                return adjamt;
            }

            /**
             * Sets the value of the adjamt property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setADJAMT(BigDecimal value) {
                this.adjamt = value;
            }

            /**
             * Gets the value of the amountSettle property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the amountSettle property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getAmountSettle().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link LoansandDepositsFullType.ScheduleSumm.ScheduleDetails.AmountSettle }
             * 
             * 
             */
            public List<LoansandDepositsFullType.ScheduleSumm.ScheduleDetails.AmountSettle> getAmountSettle() {
                if (amountSettle == null) {
                    amountSettle = new ArrayList<LoansandDepositsFullType.ScheduleSumm.ScheduleDetails.AmountSettle>();
                }
                return this.amountSettle;
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
             *         &lt;element name="PAIDDT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
             *         &lt;element name="CCYSETTL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="LCYEQSET" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
             *         &lt;element name="AMTSETTL" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
             *         &lt;element name="MAKERDT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
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
                "paiddt",
                "ccysettl",
                "lcyeqset",
                "amtsettl",
                "makerdt"
            })
            public static class AmountSettle {

                @XmlElement(name = "PAIDDT")
                @XmlSchemaType(name = "date")
                protected XMLGregorianCalendar paiddt;
                @XmlElement(name = "CCYSETTL")
                protected String ccysettl;
                @XmlElement(name = "LCYEQSET")
                protected BigDecimal lcyeqset;
                @XmlElement(name = "AMTSETTL")
                protected BigDecimal amtsettl;
                @XmlElement(name = "MAKERDT")
                @XmlSchemaType(name = "date")
                protected XMLGregorianCalendar makerdt;

                /**
                 * Gets the value of the paiddt property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public XMLGregorianCalendar getPAIDDT() {
                    return paiddt;
                }

                /**
                 * Sets the value of the paiddt property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public void setPAIDDT(XMLGregorianCalendar value) {
                    this.paiddt = value;
                }

                /**
                 * Gets the value of the ccysettl property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCCYSETTL() {
                    return ccysettl;
                }

                /**
                 * Sets the value of the ccysettl property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCCYSETTL(String value) {
                    this.ccysettl = value;
                }

                /**
                 * Gets the value of the lcyeqset property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getLCYEQSET() {
                    return lcyeqset;
                }

                /**
                 * Sets the value of the lcyeqset property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setLCYEQSET(BigDecimal value) {
                    this.lcyeqset = value;
                }

                /**
                 * Gets the value of the amtsettl property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getAMTSETTL() {
                    return amtsettl;
                }

                /**
                 * Sets the value of the amtsettl property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setAMTSETTL(BigDecimal value) {
                    this.amtsettl = value;
                }

                /**
                 * Gets the value of the makerdt property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public XMLGregorianCalendar getMAKERDT() {
                    return makerdt;
                }

                /**
                 * Sets the value of the makerdt property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public void setMAKERDT(XMLGregorianCalendar value) {
                    this.makerdt = value;
                }

            }

        }

    }

}
