package com.tymit.rules.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

public class DateUtils {

    static final String DATE_ISO_8601_FORMAT = "yyyy-MM-dd";

    public static Date formatToDate(String stringDate) throws ParseException {
        if (stringDate == null || stringDate.isEmpty()) {
            return null;
        }
        return new SimpleDateFormat(DATE_ISO_8601_FORMAT).parse(stringDate);
    }

    public static LocalDate convertToLocalDateViaInstant(Date dateToConvert) {
        return dateToConvert.toInstant()
                .atZone(ZoneId.systemDefault())
                .toLocalDate();
    }
}
