package org.rapidpm.publication.javasprektrum.v004;

import org.rapidpm.publication.javasprektrum.api.ServiceAPI;
import org.rapidpm.publication.javasprektrum.v001.ServiceV1;
import org.rapidpm.publication.javasprektrum.v004.factory.ServiceFactory;
import org.rapidpm.publication.javasprektrum.v004.strategy.PerRequestServiceStrategy;
import org.rapidpm.publication.javasprektrum.v004.strategy.ServiceStrategy;
import org.rapidpm.publication.javasprektrum.v004.strategy.SynchronizedServiceStrategy;

import java.util.Date;

public class ServiceAPIProxy
    implements ServiceAPI {

  private final ServiceFactory<ServiceAPI> factory = ServiceV1::new;

  private final ServiceStrategy<ServiceAPI> synchronizedStrategy = new SynchronizedServiceStrategy<>();
  private final ServiceStrategy<ServiceAPI> perRequestStrategy   = new PerRequestServiceStrategy<>();

  @Override
  public String toUpperCase(String input) {
    final String value = (input == null)
                          ? ""
                          : input;
    return synchronizedStrategy.realSubject(factory)
                               .toUpperCase(value);
  }

  @Override
  public String wasteMemory() {
    return synchronizedStrategy.realSubject(factory)
                               .wasteMemory();
  }

  @Override
  public String formatDate(Date date) {
    return perRequestStrategy.realSubject(factory).formatDate(date);
  }
}
