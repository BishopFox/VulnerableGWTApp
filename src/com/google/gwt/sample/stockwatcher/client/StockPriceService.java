package com.google.gwt.sample.stockwatcher.client;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;


@RemoteServiceRelativePath("stockPrices")
public interface StockPriceService extends RemoteService {

  StockPrice[] getPrices(String[] symbols, CustomClass1 cc1) throws DelistedException;
  
  StockPrice[] getPricesEx(String[] symbols, CustomClass1 cc1) throws DelistedException;
}
