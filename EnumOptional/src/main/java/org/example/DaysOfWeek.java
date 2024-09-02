package org.example;

public enum DaysOfWeek {
    MONDAY("Monday",  false),
    TUESDAY("Tuesday",  false),
    WEDNESDAY("Wednesdy",  false),
    THURSDAY("Thursday",  false),
    FRIDAY("Friday", false),
    SATURDAY("saturday",  true),
    SUNDAY("Sunday",  true);


    private final String weekday;
    private final boolean weekend;

    public String getWeekday() {
        return weekday;
    }

    public boolean isWeekend() {
        return weekend;
    }

    DaysOfWeek(String weekday, boolean weekend) {
        this.weekday = weekday;

        this.weekend = weekend;
    }

    public static String weekDays( DaysOfWeek weekday){
        if(weekday.weekend){
            return "weekend";
        }
        return weekday.weekday;


    }



}


