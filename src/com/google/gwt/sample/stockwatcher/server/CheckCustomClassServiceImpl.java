package com.google.gwt.sample.stockwatcher.server;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import com.google.gwt.sample.stockwatcher.client.CheckCustomClassService;
import com.google.gwt.sample.stockwatcher.client.CustomClass1;

public class CheckCustomClassServiceImpl extends RemoteServiceServlet implements CheckCustomClassService {

  public CustomClass1 checkCustomClass1(CustomClass1 cc1)
  {
    return cc1;
  }
}
