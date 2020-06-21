package me.whiteship.java8to11;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class App {

    public static void main(String[] args) throws InterruptedException {
        Calendar keesunBirthDay = new GregorianCalendar(1982, Calendar.JULY, 15);
        System.out.println(keesunBirthDay.getTime());
        keesunBirthDay.add(Calendar.DAY_OF_YEAR, 1);
        System.out.println(keesunBirthDay.getTime());
    }




}
