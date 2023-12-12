package com.google.gwt.sample.stockwatcher.server;

import com.google.gwt.sample.stockwatcher.client.StockPrice;
import com.google.gwt.sample.stockwatcher.client.StockPriceService;
import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import java.util.Random;
import com.google.gwt.sample.stockwatcher.client.DelistedException;
import com.google.gwt.sample.stockwatcher.client.CustomClass1;

public class StockPriceServiceImpl extends RemoteServiceServlet implements StockPriceService {

  private static final double MAX_PRICE = 100.0; // $100.00
  private static final double MAX_PRICE_CHANGE = 0.02; // +/- 2%

  public StockPrice[] getPrices(String[] symbols, CustomClass1 cc1) throws DelistedException {
	  Random rnd = new Random();

	  StockPrice[] prices = new StockPrice[symbols.length];

	  for (int i=0; i<symbols.length; i++) {
	    if (symbols[i].equals("ERR")) {
	      throw new DelistedException("ERR");
	    }

	    double price = rnd.nextDouble() * MAX_PRICE;
	    double change = price * MAX_PRICE_CHANGE * (rnd.nextDouble() * 2f - 1f);

	    prices[i] = new StockPrice(symbols[i], price, change);
	  }

	  return prices;
  }
  
    public StockPrice[] getPricesEx(String[] symbols, CustomClass1 cc1) throws DelistedException {    	  
    	  // no net change to object, but this reference should cause the GWT-RPC method to deserialize the object
	  cc1.setStr1("getPricesEx");

	  return getPrices(symbols, cc1);
  }
}
