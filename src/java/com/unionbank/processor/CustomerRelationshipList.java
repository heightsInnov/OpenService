 package com.unionbank.processor;
 import java.io.Serializable;
 public class CustomerRelationshipList
   implements Serializable
 {
   private String cod_acct_no;
   private String customerid;
   private String relationship;
   private String branchcode;
   private String productcode;
   public CustomerRelationshipList(String cod_acct_no, String customerid, String relationship, String branchcode, String productcode)
   {
     this.cod_acct_no = cod_acct_no;
     this.customerid = customerid;
     this.relationship = relationship;
     this.branchcode = branchcode;
     this.productcode = productcode;
   }
   public CustomerRelationshipList() {}
   public String getCod_acct_no()
   {
     return this.cod_acct_no;
   }
   public void setCod_acct_no(String cod_acct_no)
   {
     this.cod_acct_no = cod_acct_no;
   }
   public String getCustomerid()
   {
     return this.customerid;
   }
   public void setCustomerid(String customerid)
   {
     this.customerid = customerid;
   }
   public String getRelationship()
   {
     return this.relationship;
   }
   public void setRelationship(String relationship)
   {
     this.relationship = relationship;
   }
   public String getBranchcode()
   {
     return this.branchcode;
   }
   public void setBranchcode(String branchcode)
   {
     this.branchcode = branchcode;
   }
   public String getProductcode()
   {
     return this.productcode;
   }
   public void setProductcode(String productcode)
   {
     this.productcode = productcode;
   }
 }