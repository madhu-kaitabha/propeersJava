package dateTime;

import  java.time.*;

public class LaunchDateTime {
    public static void main(String[] args) {

        LocalDate lDate = LocalDate.now();
        System.out.println(lDate);

        int dayOfMonth = lDate.getDayOfMonth();
        System.out.println(dayOfMonth);

        int dayOfYear = lDate.getDayOfYear();
        System.out.println(dayOfYear);

        int month = lDate.getMonthValue();
        int year = lDate.getYear();

        System.out.println(dayOfMonth + " / "+month+" / "+year);

        LocalTime time = LocalTime.now();
        System.out.println(time);

        int hour = time.getHour();
        int min = time.getMinute();
        int sec = time.getSecond();
        int nanosec = time.getNano();
        System.out.println(hour+" : "+min+" : "+sec+"."+nanosec);


    }
}
