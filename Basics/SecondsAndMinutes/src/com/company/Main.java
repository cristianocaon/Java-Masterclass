package com.company;

public class Main {

    private static final String INVALID_VALUE_MESSAGE = "Invalid value.";

    public static void main(String[] args) {
        System.out.println(getDurationString(121, 30));
        System.out.println(getDurationString(3800));
    }

    public static String getDurationString(int minutes, int seconds) {
        if ((minutes < 0) || (seconds < 0 || seconds > 59)) {
            return INVALID_VALUE_MESSAGE;
        }

        int hours = minutes / 60;
        minutes = minutes % 60;

//        String hoursString = hours + "h ";
//
//        if (hours < 10) {
//            hoursString = "0" + hoursString;
//        }
//
//        String minutesString = minutes + "m ";
//
//        if (minutes < 10) {
//            minutesString = "0" + minutesString;
//        }
//
//        String secondsString = seconds + "s.";
//
//        if (seconds < 10) {
//            secondsString = "0" + secondsString;
//        }

        String hoursString = isLessThanTen(hours, "h");
        String minutesString = isLessThanTen(minutes, "m");
        String secondsString = isLessThanTen(seconds, "s");

        return hoursString + minutesString + secondsString;

    }

    public static String getDurationString(int seconds) {
        if (seconds < 0) {
            return INVALID_VALUE_MESSAGE;
        }

        int minutes = seconds / 60;
        seconds = seconds % 60;

        return getDurationString(minutes, seconds);
    }

    public static String isLessThanTen(int val, String type) {
        if (val < 10) {
            switch (type) {
                case "h":
                case "m":
                case "s":
                    return "0" + val + type;
            }
        }

        return val + type;
    }
}

