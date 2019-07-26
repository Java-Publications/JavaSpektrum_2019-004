package org.rapidpm.publication.javasprektrum.v001;

import org.junit.jupiter.api.Test;
import org.rapidpm.publication.javasprektrum.api.ServiceAPI;

import java.text.SimpleDateFormat;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class ServiceV1Test {

  @Test
  void toUpperCase_001() {
    final ServiceAPI service = new ServiceV1();
    final String     upperCase = service.toUpperCase("LowerCase");
    assertEquals("LOWERCASE", upperCase);
  }

  @Test
  void toUpperCase_002() {
    final ServiceAPI service = new ServiceV1();
    assertThrows(NullPointerException.class,
                            ()-> service.toUpperCase(null),
                            "Shit happened as expected");
  }

  @Test
  void wasteMemory_001() {
    final ServiceAPI service = new ServiceV1();
    assertEquals("Done..", service.wasteMemory());
  }

  @Test
  void formatDate_001() {
    final ServiceAPI service = new ServiceV1();
    final SimpleDateFormat formatter     = new SimpleDateFormat("YYYY-'W'ww-u");
    final Date             now           = new Date();
    final String           formattedDate = service.formatDate(now);
    assertEquals(formatter.format(now), formattedDate);
  }
}