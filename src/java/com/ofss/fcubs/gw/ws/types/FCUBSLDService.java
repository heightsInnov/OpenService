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
/*    */ @WebServiceClient(name="FCUBSLDService", targetNamespace="http://types.ws.gw.fcubs.ofss.com", wsdlLocation="http://10.8.1.165:7778/FCUBSLDService/FCUBSLDService?wsdl")
/*    */ public class FCUBSLDService
/*    */   extends Service
/*    */ {
/*    */   private static final URL FCUBSLDSERVICE_WSDL_LOCATION;
/*    */   private static final WebServiceException FCUBSLDSERVICE_EXCEPTION;
/* 27 */   private static final QName FCUBSLDSERVICE_QNAME = new QName("http://types.ws.gw.fcubs.ofss.com", "FCUBSLDService");
/*    */   
/*    */   static {
/* 30 */     URL url = null;
/* 31 */     WebServiceException e = null;
/*    */     try {
/* 33 */       url = new URL("http://10.8.1.165:7778/FCUBSLDService/FCUBSLDService?wsdl");
/*    */     } catch (MalformedURLException ex) {
/* 35 */       e = new WebServiceException(ex);
/*    */     }
/* 37 */     FCUBSLDSERVICE_WSDL_LOCATION = url;
/* 38 */     FCUBSLDSERVICE_EXCEPTION = e;
/*    */   }
/*    */   
/*    */   public FCUBSLDService() {
/* 42 */     super(__getWsdlLocation(), FCUBSLDSERVICE_QNAME);
/*    */   }
/*    */   
/*    */   public FCUBSLDService(URL wsdlLocation, QName serviceName) {
/* 46 */     super(wsdlLocation, serviceName);
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   @WebEndpoint(name="FCUBSLDServiceSEI")
/*    */   public FCUBSLDServiceSEI getFCUBSLDServiceSEI()
/*    */   {
/* 56 */     return (FCUBSLDServiceSEI)super.getPort(new QName("http://types.ws.gw.fcubs.ofss.com", "FCUBSLDServiceSEI"), FCUBSLDServiceSEI.class);
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   @WebEndpoint(name="FCUBSLDServiceSEI")
/*    */   public FCUBSLDServiceSEI getFCUBSLDServiceSEI(WebServiceFeature... features)
/*    */   {
/* 68 */     return (FCUBSLDServiceSEI)super.getPort(new QName("http://types.ws.gw.fcubs.ofss.com", "FCUBSLDServiceSEI"), FCUBSLDServiceSEI.class, features);
/*    */   }
/*    */   
/*    */   private static URL __getWsdlLocation() {
/* 72 */     if (FCUBSLDSERVICE_EXCEPTION != null) {
/* 73 */       throw FCUBSLDSERVICE_EXCEPTION;
/*    */     }
/* 75 */     return FCUBSLDSERVICE_WSDL_LOCATION;
/*    */   }
/*    */ }


/* Location:              C:\ProjectsJava\New folder\AccountFlexServiceFcubs.war!\WEB-INF\classes\com\ofss\fcubs\gw\ws\types\FCUBSLDService.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */