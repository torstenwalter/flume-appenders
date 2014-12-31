package com.gilt.flume.logging;

public class StringUtils {

  /* Avoid construction */
  private StringUtils() {}

  public static boolean isEmpty(String str) {
    return str == null || str.length() == 0;
  }

  public static boolean isNotEmpty(String str) {
    return str != null && str.length() > 0;
  }
}
