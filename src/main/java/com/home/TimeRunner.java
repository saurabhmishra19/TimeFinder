package com.home;

import com.luckycatlabs.sunrisesunset.SunriseSunsetCalculator;
import com.luckycatlabs.sunrisesunset.dto.Location;

import java.util.Calendar;

public class TimeRunner {

    public static void main(String [ ] args){
        // room lat and long once my phone enters that area
        Location location = new Location("17.5142532", "78.3723277");
        SunriseSunsetCalculator calculator = new SunriseSunsetCalculator(location, "Asia/Calcutta");

        String officialSunrise = calculator.getOfficialSunriseForDate(Calendar.getInstance());
        Calendar officialSunset = calculator.getOfficialSunsetCalendarForDate(Calendar.getInstance());

        System.out.println(""+officialSunrise+" "+officialSunset.getTime());
    }


}
