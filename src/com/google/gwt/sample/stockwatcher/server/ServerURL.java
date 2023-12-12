package com.google.gwt.sample.stockwatcher.server;

import java.io.Serializable;

public class ServerURL implements Serializable {

  private String url;
  
  public ServerURL()
  {
    url = "";
  }
  
  public ServerURL(String u)
  {
    url = u;
  }
}
