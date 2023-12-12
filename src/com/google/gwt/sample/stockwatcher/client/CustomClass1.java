package com.google.gwt.sample.stockwatcher.client;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import java.io.Serializable;
import com.google.gwt.user.client.rpc.IsSerializable;

import java.sql.Date;

@Entity
public class CustomClass1 implements Serializable, IsSerializable {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String str1;
  private String str2;
  private CustomClass2 cc2;
  //private ServerURL serverURL;
  private java.sql.Date d;
  

  public CustomClass1() {
  	cc2 = new CustomClass2();
  	//serverURL = new ServerURL();
  }

  public CustomClass1(String str1, String str2, CustomClass2 cc2a) {
    this.str1 = str1;
    this.str2 = str2;
    cc2 = cc2a;
    try
    {
	    d = new java.sql.Date(1,1,1981);
    }
    catch (Exception ex)
    {
    
    }
    //serverURL = new ServerURL(str1);
  }

  public String getStr1() {
    return this.str1;
  }

  public String getStr2() {
    return this.str2;
  }
  
  public void setStr1(String v) {
    this.str1 = v;
  }

  public void setStr2(String v) {
    this.str2 = v;
  }
}
