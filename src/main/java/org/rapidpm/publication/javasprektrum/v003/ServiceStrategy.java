package org.rapidpm.publication.javasprektrum.v003;

public interface ServiceStrategy<T> {
  T realSubject(ServiceFactory<T> factory);
}
