 package com.union.bof.dao;
 import java.io.Serializable;
 public class FundsTransferOutwardRequest
   implements Serializable
 {
   private String reference_no;
   private String transaction_amount;
   private String transaction_date;
   private String currency;
   private String ordering_customer;
   private String ordering_customer_acct;
   private String ordering_customer_address_line1;
   private String ordering_customr_address_line2;
   private String beneficiary_acct;
   private String beneficiary_name;
   private String payment_details;
   private String value_date;
   private String running_no;
   private String beneficiary_bank;
   private String charges_details;
   private String receiver_Bic;
   private String intermediary_bank;
   private String p_field_59;
   private String p_fed_wire_ind;
   private String p_fed_wire_data;
   public String getReference_no()
   {
     return this.reference_no;
   }
   public void setReference_no(String reference_no)
   {
     this.reference_no = reference_no;
   }
   public String getTransaction_amount()
   {
     return this.transaction_amount;
   }
   public void setTransaction_amount(String transaction_amount)
   {
     this.transaction_amount = transaction_amount;
   }
   public String getTransaction_date()
   {
     return this.transaction_date;
   }
   public void setTransaction_date(String transaction_date)
   {
     this.transaction_date = transaction_date;
   }
   public String getCurrency()
   {
     return this.currency;
   }
   public void setCurrency(String currency)
   {
     this.currency = currency;
   }
   public String getOrdering_customer()
   {
     return this.ordering_customer;
   }
   public void setOrdering_customer(String ordering_customer)
   {
     this.ordering_customer = ordering_customer;
   }
   public String getOrdering_customer_address_line1()
   {
     return this.ordering_customer_address_line1;
   }
   public void setOrdering_customer_address_line1(String ordering_customer_address_line1)
   {
     this.ordering_customer_address_line1 = ordering_customer_address_line1;
   }
   public String getOrdering_customr_address_line2()
   {
     return this.ordering_customr_address_line2;
   }
   public void setOrdering_customr_address_line2(String ordering_customr_address_line2)
   {
     this.ordering_customr_address_line2 = ordering_customr_address_line2;
   }
   public String getBeneficiary_acct()
   {
     return this.beneficiary_acct;
   }
   public void setBeneficiary_acct(String beneficiary_acct)
   {
     this.beneficiary_acct = beneficiary_acct;
   }
   public String getBeneficiary_name()
   {
     return this.beneficiary_name;
   }
   public void setBeneficiary_name(String beneficiary_name)
   {
     this.beneficiary_name = beneficiary_name;
   }
   public String getPayment_details()
   {
     return this.payment_details;
   }
   public void setPayment_details(String payment_details)
   {
     this.payment_details = payment_details;
   }
   public String getValue_date()
   {
     return this.value_date;
   }
   public void setValue_date(String value_date)
   {
     this.value_date = value_date;
   }
   public String getRunning_no()
   {
     return this.running_no;
   }
   public void setRunning_no(String running_no)
   {
     this.running_no = running_no;
   }
   public String getBeneficiary_bank()
   {
     return this.beneficiary_bank;
   }
   public void setBeneficiary_bank(String beneficiary_bank)
   {
     this.beneficiary_bank = beneficiary_bank;
   }
   public String getCharges_details()
   {
     return this.charges_details;
   }
   public void setCharges_details(String charges_details)
   {
     this.charges_details = charges_details;
   }
   public String getReceiver_Bic()
   {
     return this.receiver_Bic;
   }
   public void setReceiver_Bic(String receiver_Bic)
   {
     this.receiver_Bic = receiver_Bic;
   }
   public String getOrdering_customer_acct()
   {
     return this.ordering_customer_acct;
   }
   public void setOrdering_customer_acct(String ordering_customer_acct)
   {
     this.ordering_customer_acct = ordering_customer_acct;
   }
   public String getIntermediary_bank()
   {
     return this.intermediary_bank;
   }
   public void setIntermediary_bank(String intermediary_bank)
   {
     this.intermediary_bank = intermediary_bank;
   }
   public String getP_field_59()
   {
     return this.p_field_59;
   }
   public void setP_field_59(String p_field_59)
   {
     this.p_field_59 = p_field_59;
   }
   public String getP_fed_wire_ind()
   {
     return this.p_fed_wire_ind;
   }
   public void setP_fed_wire_ind(String p_fed_wire_ind)
   {
     this.p_fed_wire_ind = p_fed_wire_ind;
   }
   public String getP_fed_wire_data()
   {
     return this.p_fed_wire_data;
   }
   public void setP_fed_wire_data(String p_fed_wire_data)
   {
     this.p_fed_wire_data = p_fed_wire_data;
   }
 }