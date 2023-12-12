package com.google.gwt.sample.stockwatcher.client;

import com.google.gwt.user.client.rpc.AsyncCallback;

public interface CheckCustomClassServiceAsync {

  void checkCustomClass1(CustomClass1 cc1, AsyncCallback<CustomClass1> callback);

}
