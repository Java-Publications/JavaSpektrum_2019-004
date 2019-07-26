package org.rapidpm.publication.javasprektrum.v002;

import org.rapidpm.publication.javasprektrum.api.ServiceAPI;
import org.rapidpm.publication.javasprektrum.v001.ServiceV1;

import java.util.Date;

public class ServiceAPIVirtualProxy implements ServiceAPI {
  private ServiceAPI delegator;

  @Override
  public String toUpperCase(String input) {
    if(delegator == null) delegator = new ServiceV1();
    return delegator.toUpperCase(input);
  }

  @Override
  public String wasteMemory() {
    if(delegator == null) delegator = new ServiceV1();
    return delegator.wasteMemory();
  }

  @Override
  public String formatDate(Date date) {
    if(delegator == null) delegator = new ServiceV1();
    return delegator.formatDate(date);
  }
}
