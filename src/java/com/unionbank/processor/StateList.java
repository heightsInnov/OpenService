 package com.unionbank.processor;
 import java.io.Serializable;
 public class StateList
   implements Serializable
 {
   private String stateCode;
   private String stateName;
   public StateList(String stateCode, String stateName)
   {
     this.stateCode = stateCode;
     this.stateName = stateName;
   }
   public StateList() {}
   public String getStateCode()
   {
     return this.stateCode;
   }
   public void setStateCode(String stateCode)
   {
     this.stateCode = stateCode;
   }
   public String getStateName()
   {
     return this.stateName;
   }
   public void setStateName(String stateName)
   {
     this.stateName = stateName;
   }
 }