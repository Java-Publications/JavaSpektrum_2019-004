package org.rapidpm.publication.javasprektrum.v001;

import org.rapidpm.publication.javasprektrum.api.ServiceAPI;

import java.util.Date;

public class ServiceAPIMinimalProxy implements ServiceAPI {

  private ServiceAPI delegator = new ServiceV1();

  @Override
  public String toUpperCase(String input) {
    return delegator.toUpperCase(input);
  }

  @Override
  public String wasteMemory() {
    return delegator.wasteMemory();
  }

  @Override
  public String formatDate(Date date) {
    return delegator.formatDate(date);
  }
}
