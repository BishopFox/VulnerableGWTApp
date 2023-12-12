package com.google.gwt.sample.stockwatcher.client;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;


@RemoteServiceRelativePath("checkCustomClass1")
public interface CheckCustomClassService extends RemoteService {

  CustomClass1 checkCustomClass1(CustomClass1 cc1);
}
