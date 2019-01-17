 package com.union.bof.dao;
 import java.io.Serializable;
 public class UpdateBVNRequest
   implements Serializable
 {
   private String custid;
   private String bvnno;
   public String getCustid()
   {
     return this.custid;
   }
   public void setCustid(String custid)
   {
     this.custid = custid;
   }
   public String getBvnno()
   {
     return this.bvnno;
   }
   public void setBvnno(String bvnno)
   {
     this.bvnno = bvnno;
   }
 }