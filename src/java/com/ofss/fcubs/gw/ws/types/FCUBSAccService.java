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
/*    */ @WebServiceClient(name="FCUBSAccService", targetNamespace="http://types.ws.gw.fcubs.ofss.com", wsdlLocation="http://10.8.1.165:7778/FCUBSAccService/FCUBSAccService?wsdl")
/*    */ public class FCUBSAccService
/*    */   extends Service
/*    */ {
/*    */   private static final URL FCUBSACCSERVICE_WSDL_LOCATION;
/*    */   private static final WebServiceException FCUBSACCSERVICE_EXCEPTION;
/* 27 */   private static final QName FCUBSACCSERVICE_QNAME = new QName("http://types.ws.gw.fcubs.ofss.com", "FCUBSAccService");
/*    */   
/*    */   static {
/* 30 */     URL url = null;
/* 31 */     WebServiceException e = null;
/*    */     try {
/* 33 */       url = new URL("http://10.8.1.165:7778/FCUBSAccService/FCUBSAccService?wsdl");
/*    */     } catch (MalformedURLException ex) {
/* 35 */       e = new WebServiceException(ex);
/*    */     }
/* 37 */     FCUBSACCSERVICE_WSDL_LOCATION = url;
/* 38 */     FCUBSACCSERVICE_EXCEPTION = e;
/*    */   }
/*    */   
/*    */   public FCUBSAccService() {
/* 42 */     super(__getWsdlLocation(), FCUBSACCSERVICE_QNAME);
/*    */   }
/*    */   
/*    */   public FCUBSAccService(URL wsdlLocation, QName serviceName) {
/* 46 */     super(wsdlLocation, serviceName);
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   @WebEndpoint(name="FCUBSAccServiceSEI")
/*    */   public FCUBSAccServiceSEI getFCUBSAccServiceSEI()
/*    */   {
/* 56 */     return (FCUBSAccServiceSEI)super.getPort(new QName("http://types.ws.gw.fcubs.ofss.com", "FCUBSAccServiceSEI"), FCUBSAccServiceSEI.class);
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   @WebEndpoint(name="FCUBSAccServiceSEI")
/*    */   public FCUBSAccServiceSEI getFCUBSAccServiceSEI(WebServiceFeature... features)
/*    */   {
/* 68 */     return (FCUBSAccServiceSEI)super.getPort(new QName("http://types.ws.gw.fcubs.ofss.com", "FCUBSAccServiceSEI"), FCUBSAccServiceSEI.class, features);
/*    */   }
/*    */   
/*    */   private static URL __getWsdlLocation() {
/* 72 */     if (FCUBSACCSERVICE_EXCEPTION != null) {
/* 73 */       throw FCUBSACCSERVICE_EXCEPTION;
/*    */     }
/* 75 */     return FCUBSACCSERVICE_WSDL_LOCATION;
/*    */   }
/*    */ }


/* Location:              C:\ProjectsJava\New folder\AccountFlexServiceFcubs.war!\WEB-INF\classes\com\ofss\fcubs\gw\ws\types\FCUBSAccService.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */