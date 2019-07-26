package org.rapidpm.publication.javasprektrum.v004.strategy;

import org.rapidpm.publication.javasprektrum.v004.factory.ServiceFactory;

public class PerRequestServiceStrategy<T> implements ServiceStrategy<T> {
  @Override
  public synchronized T realSubject(ServiceFactory<T> factory) {
    return factory.createInstance();
  }
}
