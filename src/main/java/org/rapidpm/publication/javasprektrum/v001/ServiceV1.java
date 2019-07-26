package org.rapidpm.publication.javasprektrum.v001;

import org.rapidpm.publication.javasprektrum.api.ServiceAPI;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ServiceV1
    implements ServiceAPI {

  @Override
  public String toUpperCase(String input) {
    return input.toUpperCase();
  }

  private final int    HUNDRET_MEGABYTE = 1_024 * 1_024 * 100;
  private       byte[] wastedMemory;

  @Override
  public String wasteMemory() {
    if (wastedMemory == null) {
      wastedMemory = new byte[HUNDRET_MEGABYTE];
    }
    return "Done..";
  }

  private final SimpleDateFormat formatter = new SimpleDateFormat("YYYY-'W'ww-u");

  @Override
  public String formatDate(Date date) {
    return formatter.format(date);
  }
}
