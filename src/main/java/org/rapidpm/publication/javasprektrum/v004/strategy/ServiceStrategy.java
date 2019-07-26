package org.rapidpm.publication.javasprektrum.v004.strategy;

import org.rapidpm.publication.javasprektrum.v004.factory.ServiceFactory;

public interface ServiceStrategy<T> {
  T realSubject(ServiceFactory<T> factory);
}
