package com.company.poo;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class CalendarEx {
    public static void main(String[] args){
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Date d = Date.from(Instant.parse("2021-01-19T18:51:09Z"));

        System.out.println(d);

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(d);
        calendar.add(Calendar.HOUR_OF_DAY, 4);

        d = calendar.getTime(); //Update Date;
        System.out.println(d);

        int minutes = calendar.get(Calendar.MINUTE);
        int month = calendar.get(Calendar.MONTH)+1; //For MONTH January is equal to Zero;
        System.out.println(minutes);
        System.out.println(month);


    }
}
