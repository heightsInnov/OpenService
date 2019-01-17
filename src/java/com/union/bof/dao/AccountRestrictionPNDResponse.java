 package com.union.bof.dao;
 import java.io.Serializable;
 public class AccountRestrictionPNDResponse
   implements Serializable
 {
   private String responsecode;
   private String responsemessage;
   public String getResponsecode()
   {
     return this.responsecode;
   }
   public void setResponsecode(String responsecode)
   {
     this.responsecode = responsecode;
   }
   public String getResponsemessage()
   {
     return this.responsemessage;
   }
   public void setResponsemessage(String responsemessage)
   {
     this.responsemessage = responsemessage;
   }
 }