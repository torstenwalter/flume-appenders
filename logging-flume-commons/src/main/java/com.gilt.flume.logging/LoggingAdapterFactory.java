package com.gilt.flume.logging;

public interface LoggingAdapterFactory {
  LoggingAdapter create(Class clazz);
}
