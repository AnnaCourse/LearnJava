package org.learn.java.classes;

public class Swithes {
    public static String UNKNOW_MONTH = "Unknown month";
    public static String WINTER = "Winter";
    public static String STILL_WINTER = "Still winter";
    public String switchString(String input) {

        String output = "";
        switch (input) {
            case "Jan": {
                System.out.println("Winter");
                output = "Winter";
                break;
            }
            case "Feb" : {
                System.out.println("Still winter");
                output = "Still winter";
                break;
            }
            default: {
                System.out.println("Unknown month");
                output = "Unknown month";
                break;
            }
        }
        return output;
    }

    public String switchString1(String input) {
        String output = "";

        switch (input) {
            default: {
                System.out.println("Unknown month");
                output = "Unknown month";
                break;
            }
            case "Jan": {
                System.out.println("Winter");
                output = "Winter";
                break;
            }
            case "Feb" : {
                System.out.println("Still winter");
                output = "Still winter";
                break;
            }

        }
        return output;
    }

    public String switchString_2(String input) {
        String output = "";

        switch (input) {
            default: {
                System.out.println("Unknown month");
                output = "Unknown month";

            }
            case "Jan": {
                System.out.println("Winter");
                output = "Winter";

            }
            case "Feb" : {
                System.out.println("Still winter");
                output = "Still winter";

            }

        }
        return output;
    }

    public String switchString_3(String input) {

        switch (input) {
            default: {
                System.out.println(UNKNOW_MONTH);
                return UNKNOW_MONTH;
            }
            case "Jan": {
                System.out.println(WINTER);
                return "Winter";
            }
            case "Feb" : {
                System.out.println(STILL_WINTER);
                return STILL_WINTER;
            }
        }
    }

    public String switchString_4(String input) {
        final String caseValue = "Constanta";
        switch (input) {
            default: {
                System.out.println(UNKNOW_MONTH);
                return UNKNOW_MONTH;
            }
            case "Jan": {
                System.out.println(WINTER);
                return "Winter";
            }
            case "Feb" : {
                System.out.println(STILL_WINTER);
                return STILL_WINTER;
            }
            case caseValue: {
                System.out.println("Case value");
                return "asdfasdf";
            }
        }
    }

}
