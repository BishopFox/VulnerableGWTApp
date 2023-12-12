package com.google.gwt.sample.stockwatcher.client;

import java.io.Serializable;

import com.google.gwt.user.client.rpc.IsSerializable;

public class CustomClass2 implements Serializable, IsSerializable {

  private String str1;
  private String str2;

  public CustomClass2() {
  }

  public CustomClass2(String str1, String str2) {
    this.str1 = str1;
    this.str2 = str2;
  }

  public String getStr1() {
    return this.str1;
  }

  public String getStr2() {
    return this.str2;
  }
}
