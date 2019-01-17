 package com.unionbank.processor;
 import java.io.Serializable;
 public class CountryList
   implements Serializable
 {
   private String countryCode;
   private String countryName;
   public CountryList(String countryCode, String countryName)
   {
     this.countryCode = countryCode;
     this.countryName = countryName;
   }
   public CountryList() {}
   public String getCountryCode()
   {
     return this.countryCode;
   }
   public void setCountryCode(String countryCode)
   {
     this.countryCode = countryCode;
   }
   public String getCountryName()
   {
     return this.countryName;
   }
   public void setCountryName(String countryName)
   {
     this.countryName = countryName;
   }
 }