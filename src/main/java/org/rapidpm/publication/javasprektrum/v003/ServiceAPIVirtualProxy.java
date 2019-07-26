package org.rapidpm.publication.javasprektrum.v003;

import org.rapidpm.publication.javasprektrum.api.ServiceAPI;
import org.rapidpm.publication.javasprektrum.v001.ServiceV1;

import java.util.Date;

public class ServiceAPIVirtualProxy implements ServiceAPI {
  private final ServiceFactory<ServiceAPI> factory = ServiceV1::new;
  private final ServiceStrategy<ServiceAPI> strategy = new ServiceStrategy<ServiceAPI>() {
    private ServiceAPI delegator;
    @Override
    public ServiceAPI realSubject(ServiceFactory<ServiceAPI> factory) {
      if(delegator == null) delegator = factory.createInstance();
      return delegator;
    }
  };

  @Override
  public String toUpperCase(String input) {
    return strategy.realSubject(factory).toUpperCase(input);
  }

  @Override
  public String wasteMemory() {
    return strategy.realSubject(factory).wasteMemory();
  }

  @Override
  public String formatDate(Date date) {
    return strategy.realSubject(factory).formatDate(date);
  }
}
