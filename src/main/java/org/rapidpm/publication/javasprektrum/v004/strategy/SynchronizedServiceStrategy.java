package org.rapidpm.publication.javasprektrum.v004.strategy;

import org.rapidpm.publication.javasprektrum.v004.factory.ServiceFactory;

public class SynchronizedServiceStrategy<T> implements ServiceStrategy<T> {

  private T delegator;

  @Override
  public synchronized T realSubject(ServiceFactory<T> factory) {
    if(delegator == null) delegator = factory.createInstance();
    return delegator;
  }
}
