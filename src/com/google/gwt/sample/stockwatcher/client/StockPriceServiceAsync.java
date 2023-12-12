package com.google.gwt.sample.stockwatcher.client;

import com.google.gwt.user.client.rpc.AsyncCallback;

public interface StockPriceServiceAsync {

  void getPrices(String[] symbols, CustomClass1 cc1, AsyncCallback<StockPrice[]> callback);

  void getPricesEx(String[] symbols, CustomClass1 cc1, AsyncCallback<StockPrice[]> callback);

}
