package com.google.gwt.sample.stockwatcher.client;
import java.io.Serializable;

public class StockPrice implements Serializable {

  private String symbol;
  private double price;
  private double change;
  public CustomClass1 cc1;

  public StockPrice() {
  }

  public StockPrice(String symbol, double price, double change) {
    this.symbol = symbol;
    this.price = price;
    this.change = change;
    CustomClass2 cc2 = new CustomClass2();
    this.cc1 = new CustomClass1("a", "b", cc2);
    this.cc1.setStr1("string1 value: 12345");
    this.cc1.setStr2("string2 value: 98765");
  }

  public String getSymbol() {
    return this.symbol;
  }

  public double getPrice() {
    return this.price;
  }

  public double getChange() {
    return this.change;
  }

  public double getChangePercent() {
    return 100.0 * this.change / this.price;
  }

  public void setSymbol(String symbol) {
    this.symbol = symbol;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public void setChange(double change) {
    this.change = change;
  }
}
