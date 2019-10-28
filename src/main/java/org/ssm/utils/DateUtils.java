package org.ssm.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {
    private static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd");

    public static Date getNowTime(){
        return new Date();
    }

    public static Date castStringToDate(String time) throws ParseException {
        return sdf.parse(time);
    }
}
