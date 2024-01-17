package at.technikum.Einheit4;

import java.util.Scanner;

public class Calendars {
private static Scanner sc = new Scanner(System.in);
private static final int SET_DATE = 0;
private static final int IS_LEAP = 1;
private static final int DAYS_IN_MONTH = 2;
private static final int CHECK_DATE = 3;
private static final int YMD_2_W = 7;
private static final int DAY_NUMBER = 8;
private static final int WEEK_NUMBER = 9;
//private static final int COMPARE = 10;

//private static final int DAY_NAME = 13;
//private static final int PRINT_DAY = 14;
//private static final int DAY_SHORT_NAME = 15;
//private static final int PRINT_DAY_SHORT = 16;
//private static final int PRINT_MONTH = 17;
//private static final int PRINT_MONTH_SHORT = 18;
//private static final int PRINT_DATE = 19;
private static final int PRINT_STATISTICS = 20;
private static final int PRINT_CALENDAR_HIGHLIGHT = 21;
private static final int PRINT_CALENDAR = 22;

private static final int EXIT = 666;

    public static void main(String[] args) {

        sc = new Scanner(System.in);
        int day = 12, month = 2, year = 1975;
        while (true) {

            int op;
            System.out.printf("current date: %02d.%02d.%04d\n", day, month, year);

            System.out.printf("enter option: ");

            op = sc.nextInt();

            switch (op) {
                case SET_DATE:
                    System.out.printf("day: ");

                    day = sc.nextInt();
                    System.out.printf("month: ");

                    month = sc.nextInt();
                    System.out.printf("year: ");

                    year = sc.nextInt();
                    break;
                /*------------------------- BASICS ----------------------*/

                case IS_LEAP:
                    System.out.printf("\nisLeap(year): %b\n", isLeap(year));
                    break;


                case DAYS_IN_MONTH:
                    System.out.printf("\ndaysInMonth(year, month): %d\n", daysInMonth(year, month));
                    break;


                case CHECK_DATE:
                    System.out.printf("\ncheckDate1(year): %b\n", checkDate(year));
                    System.out.printf("checkDate2(year, month): %b\n", checkDate(year, month));
                    System.out.printf("checkDate3(year, month, day): %b\n", checkDate(year, month, day));
                    break;

                /*------------------------- CALCULATIONS ----------------------*/

                case YMD_2_W: {
                    System.out.printf("\nymd2w(year, month, day): %d\n", ymd2w(year, month, day));
                    break;

                }

                case DAY_NUMBER:
                    System.out.printf("\ndayNumber(year, month, day): %d\n", dayNumber(year, month, day));
                    break;


                case WEEK_NUMBER:
                    System.out.printf("\nweekNumber(year, month, day): %d\n", weekNumber(year, month, day));
                    break;

                /*------------------------- OUTPUT ----------------------*/


                case PRINT_STATISTICS:
                    System.out.printf("\nprintStatistics: ");
                    printStatistics(year, month, day);

                    break;

                 /*------------------------- APPLICATIONS ----------------------*/

                case PRINT_CALENDAR_HIGHLIGHT:
                    System.out.printf("\nprintCalendar(year, month, day, 1): \n");
                    printCalendar(year, month, day, true);

                    break;

                case PRINT_CALENDAR:
                    System.out.printf("\nprintCalendar(year, month, day, 0): \n");
                    printCalendar(year, month, day, false);

                    break;

                case EXIT:
                    System.out.printf("closing.\n");
                    sc.close();
                    return;

                default:;

            }
            System.out.printf("\n");
        }
    }
    //Basics
    public static boolean isLeap(int year){
        return (year % 4 == 0);
    }

    public static int daysInMonth(int year, int month){
        return switch (month) {
            case 1 -> 31;
            case 2 -> isLeap(year) ? 29 : 28;
            case 3 -> 31;
            case 4 -> 30;
            case 5 -> 31;
            case 6 -> 30;
            case 7 -> 31;
            case 8 -> 31;
            case 9 -> 30;
            case 10 -> 31;
            case 11 -> 30;
            case 12 -> 31;
            default -> -1;
        };
    }

    public static boolean checkDate(int year){

        return year >= 1582 && year <= 2199;

//        if (year < 1582 || year > 2199) {
//            return false;
//        }
//        return true;
    }

    public static boolean checkDate(int year, int month) {

        //return year >= 1582 && year <= 2199 && (year != 1582 || month >= 10) && month <= 12 && month >= 1;

        if (year >= 1582 && year <= 2199) {
            if (year == 1582 && month == 10) {
                return true;
            } else if (year == 2199 && month ==12) {
                return true;
            }
            return true;
        } else return false;
    }

    public static boolean checkDate(int year, int month, int day) {

//       return (year >= 1582 && year <= 2199 && (year != 1582 || month > 10 || day >= 16)
//                && month <= 12 && month >= 1 && (year != 2199 || month != 12 || day <= 31));

        if (year >= 1582 && year <= 2199) {

            if (year == 1582 && month == 10 && day >= 16) {
                return true;
            }
            else if (year == 2199 && month == 12 && day <= 31) {
                return true;
            }

            return true;

        } else return false;
    }

    //Calculations
    //calculation for day number - for weekday name
    public static int ymd2w(int year, int month, int day) {
        if (checkDate(year, month, day)) {
            if (month < 3) {
                month += 12;
                year -= 1;
            }
            int y = year % 100; //last 2 digits of year
            int c = year / 100; //first 2 digits of year

            double formulaDay = day + (2.6 * (month - 2) - 0.2) + y + (y / 4) + (c / 4) - 2 * c;


            return ((int) formulaDay % 7);
        } else return - 1;
    }

    public static int dayNumber(int year, int month, int day) {
        int dayCount = 0;
        if (checkDate(year, month, day)) {
            if (month > 0) dayCount += day;
            if (month > 1) dayCount += daysInMonth(year, 1);
            if (month > 2) dayCount += daysInMonth(year, 2);
            if (month > 3) dayCount += daysInMonth(year, 3);
            if (month > 4) dayCount += daysInMonth(year, 4);
            if (month > 5) dayCount += daysInMonth(year, 5);
            if (month > 6) dayCount += daysInMonth(year, 6);
            if (month > 7) dayCount += daysInMonth(year, 7);
            if (month > 8) dayCount += daysInMonth(year, 8);
            if (month > 9) dayCount += daysInMonth(year, 9);
            if (month > 10) dayCount += daysInMonth(year, 10);
            if (month > 11) dayCount += daysInMonth(year, 11);

            return dayCount;
        }

        return - 1;
    }

    public static int weekNumber(int year, int month, int day) {
        int weekNumber = 0;
        if (checkDate(year, month, day)) {
            if (dayNumber(year,month,day) <= 7) return 1;

            weekNumber = (dayNumber(year, month, day)/7) + (dayNumber(year, month, day)%7 == 0 ? 0 : 1);

            return weekNumber;
        }
        return - 1;
    }

    //Output
    public static void printDayName(int day) {

        if (day == 0) System.out.print("Sunday");
        else if (day == 1) System.out.print("Monday");
        else if (day == 2) System.out.print("Tuesday");
        else if (day == 3) System.out.print("Wednesday");
        else if (day == 4) System.out.print("Thursday");
        else if (day == 5) System.out.print("Friday");
        else if (day == 6) System.out.print("Saturday");
        else System.out.printf("invalid day(<%d>)", day);

    }

    public static void printMonthName(int month) {

        if (month == 1) System.out.print("January");
        else if (month == 2) System.out.print("February");
        else if (month == 3) System.out.print("March");
        else if (month == 4) System.out.print("April");
        else if (month == 5) System.out.print("May");
        else if (month == 6) System.out.print("June");
        else if (month == 7) System.out.print("July");
        else if (month == 8) System.out.print("August");
        else if (month == 9) System.out.print("September");
        else if (month == 10) System.out.print("October");
        else if (month == 11) System.out.print("November");
        else if (month == 12) System.out.print("December");
        else System.out.printf("invalid month(<%d>)", month);

    }

    public static void printNumberEnding(int n) {

        if (n%10 == 1 && n != 11) System.out.print("st");
        if (n%10 == 2 && n != 12) System.out.print("nd");
        if (n%10 == 3 && n != 13) System.out.print("rd");
        if (n == 11 || n == 12 || n == 13) System.out.print("th");
        else System.out.print("th");
    }

    public static void printDate(int year, int month, int day) {
        if (checkDate(year, month, day)) {
            printDayName(ymd2w(year,month,day));
            System.out.print(", ");
            printMonthName(month);
            System.out.printf(" %d", day);
            printNumberEnding(day);
            System.out.print(" " + year + "\n");
        } else {
            System.out.printf("invalid date (%d", day);
            printMonthName(month);
            System.out.printf(".%d)\n", year);
        }
    }

    public static void printStatistics(int year, int month, int day) {

        if (!(checkDate(year, month, day))) System.out.print("invalid date!");

        System.out.print("statistics for:\n");
        //date in format: Weekday, Month Day Year
        printDate(year, month, day);
        //is (not) leap year
        if (isLeap(year)) {
            System.out.print(year + " is a leap year\n");
        } else System.out.print(year + " is not a leap year\n");
        //month of year has xxx number of days
        printMonthName(month);
        System.out.print(" " + year + " has " + daysInMonth(year, month) + " days.\n");
        //it is day number xxx of year
        System.out.print("it is day " + dayNumber(year, month, day) + " of " + year + "\n");
        //it is week number xx of year
        System.out.print("it is in week " + weekNumber(year, month, day));
    }

    //Application
    public static void printCalendar(int year, int month, int day, boolean highlight) {
        printMonthName(month);
        System.out.println(" " + year);
        String week = " Mon Tue Wed Thu Fri Sat Sun";
        System.out.printf("%s\n", week);
        int k = 1; //index for day counting
        String placeHolder = "    ";
        int dayOfWeekCounter = ymd2w(year, month, 1);

        for (int i = 0; i < 6; i++) {
            if (i == 0) {
                //to ensure day 1 of month is aligned with correct day of week
                if (ymd2w(year, month, 1) == 0) {
                    for (int j = 0; j < 6; j++) {
                        //to add extra space at the start for formatting (highlight on a value on Monday)
                        System.out.print(placeHolder);
                    }
                } else {
                    for (int j = 0; j < ymd2w(year, month, 1) - 1; j++) {
                        //to add extra space at the start for formatting (highlight on a value on Monday)
                        System.out.print(placeHolder);
                    }
                }

                for (; k <= daysInMonth(year, month); k++) {
                    if (highlight && k == day) {
                        System.out.printf("<%2d>", k);
                    } else {
                        System.out.printf(" %2d ", k);
                    }

                    dayOfWeekCounter = (dayOfWeekCounter + 1) % 7;

                    if (dayOfWeekCounter == 1) {
                        System.out.println();
                    }
                }
            }
        }
    }
}
