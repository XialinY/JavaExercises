//package at.technikum.TestingGround;
//
//public class CalendarTesting {
//    public static void main(String[] args) {
//        int year = 2023;
//        int month = 11;
//        int day = 6;
//        int dayOfWeek = 6;
//        int firstDayofMonth = 3;
//        int highlight = 1;
//        int daysInMonth = 30;
//        System.out.println(" " + year);
//        String week = " Mon Tue Wed Thu Fri Sat Sun";
//        System.out.printf("%s\n", week);
//        int k = 1; //index for day counting
//        String placeHolder = "    ";
//        int dayOfWeekCounter = 3; /*y2dm(year, month, 1)*/
//
//        for (int i = 0; i < 6; i++) {
//            if (i == 0) {
//                //to ensure day 1 of month is aligned with correct day of week
//                if (firstDayofMonth == 0) {
//                    for (int j = 0; j < 6 /* y2md(year, month, 1)*/; j++) {
//                        //to add extra space at the start for formatting (highlight on a value on Monday)
//                        System.out.print(placeHolder);
//                    }
//                } else {
//                    for (int j = 0; j < firstDayofMonth - 1 /* y2md(year, month, 1)*/; j++) {
//                        //to add extra space at the start for formatting (highlight on a value on Monday)
//                        System.out.print(placeHolder);
//                    }
//                }
//
//                for (; k <= daysInMonth; k++) {
//                    if (highlight == 1 && k == day) {
//                        System.out.printf("<%2d>", k);
//                    } else {
//                        System.out.printf(" %2d ", k);
//                    }
//                    dayOfWeekCounter = (dayOfWeekCounter + 1) % 7;
//
//                    if (dayOfWeekCounter == 1) {
//                        System.out.println();
//                    }
//                }
//
//            }
//        }
//    }
//}