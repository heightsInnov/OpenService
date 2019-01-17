/*    */ package com.ofss.fcubs.gw.ws.types;
/*    */ 
/*    */ import java.net.MalformedURLException;
/*    */ import java.net.URL;
/*    */ import javax.xml.namespace.QName;
/*    */ import javax.xml.ws.Service;
/*    */ import javax.xml.ws.WebEndpoint;
/*    */ import javax.xml.ws.WebServiceClient;
/*    */ import javax.xml.ws.WebServiceException;
/*    */ import javax.xml.ws.WebServiceFeature;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @WebServiceClient(name="FCUBSCustomerService", targetNamespace="http://types.ws.gw.fcubs.ofss.com", wsdlLocation="http://10.8.1.165:7778/FCUBSCustomerService/FCUBSCustomerService?wsdl")
/*    */ public class FCUBSCustomerService
/*    */   extends Service
/*    */ {
/*    */   private static final URL FCUBSCUSTOMERSERVICE_WSDL_LOCATION;
/*    */   private static final WebServiceException FCUBSCUSTOMERSERVICE_EXCEPTION;
/* 27 */   private static final QName FCUBSCUSTOMERSERVICE_QNAME = new QName("http://types.ws.gw.fcubs.ofss.com", "FCUBSCustomerService");
/*    */   
/*    */   static {
/* 30 */     URL url = null;
/* 31 */     WebServiceException e = null;
/*    */     try {
/* 33 */       url = new URL("http://10.8.1.165:7778/FCUBSCustomerService/FCUBSCustomerService?wsdl");
/*    */     } catch (MalformedURLException ex) {
/* 35 */       e = new WebServiceException(ex);
/*    */     }
/* 37 */     FCUBSCUSTOMERSERVICE_WSDL_LOCATION = url;
/* 38 */     FCUBSCUSTOMERSERVICE_EXCEPTION = e;
/*    */   }
/*    */   
/*    */   public FCUBSCustomerService() {
/* 42 */     super(__getWsdlLocation(), FCUBSCUSTOMERSERVICE_QNAME);
/*    */   }
/*    */   
/*    */   public FCUBSCustomerService(URL wsdlLocation, QName serviceName) {
/* 46 */     super(wsdlLocation, serviceName);
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   @WebEndpoint(name="FCUBSCustomerServiceSEI")
/*    */   public FCUBSCustomerServiceSEI getFCUBSCustomerServiceSEI()
/*    */   {
/* 56 */     return (FCUBSCustomerServiceSEI)super.getPort(new QName("http://types.ws.gw.fcubs.ofss.com", "FCUBSCustomerServiceSEI"), FCUBSCustomerServiceSEI.class);
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   @WebEndpoint(name="FCUBSCustomerServiceSEI")
/*    */   public FCUBSCustomerServiceSEI getFCUBSCustomerServiceSEI(WebServiceFeature... features)
/*    */   {
/* 68 */     return (FCUBSCustomerServiceSEI)super.getPort(new QName("http://types.ws.gw.fcubs.ofss.com", "FCUBSCustomerServiceSEI"), FCUBSCustomerServiceSEI.class, features);
/*    */   }
/*    */   
/*    */   private static URL __getWsdlLocation() {
/* 72 */     if (FCUBSCUSTOMERSERVICE_EXCEPTION != null) {
/* 73 */       throw FCUBSCUSTOMERSERVICE_EXCEPTION;
/*    */     }
/* 75 */     return FCUBSCUSTOMERSERVICE_WSDL_LOCATION;
/*    */   }
/*    */ }


/* Location:              C:\ProjectsJava\New folder\AccountFlexServiceFcubs.war!\WEB-INF\classes\com\ofss\fcubs\gw\ws\types\FCUBSCustomerService.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */