 package com.union.bof.dao;
 import java.io.Serializable;
 public class CreateStandingInstructionResponse
   implements Serializable
 {
   private String responsecode;
   private String responsemessage;
   private String instrno;
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
   public String getInstrno()
   {
     return this.instrno;
   }
   public void setInstrno(String instrno)
   {
     this.instrno = instrno;
   }
 }