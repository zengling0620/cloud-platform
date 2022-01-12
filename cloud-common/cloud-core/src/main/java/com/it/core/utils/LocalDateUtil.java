package com.it.core.utils;

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

/**
 * @desc: ${类描叙}
 * @author: 90003995
 * @date: 2022-01-11 10:22
 */
public class LocalDateUtil {

    public static Date localDateToDate(LocalDate date) {
        ZoneId zoneId = ZoneId.systemDefault();
        Instant instant = date.atStartOfDay().atZone(zoneId).toInstant();
        return Date.from(instant);
    }
}
