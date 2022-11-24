/*1. В консоли запросить имя пользователя. В зависимости от
текущего времени, вывести приветствие вида
"Доброе утро, <Имя>!", если время от 05:00 до 11:59
"Добрый день, <Имя>!", если время от 12:00 до 17:59;
"Добрый вечер, <Имя>!", если время от 18:00 до 22:59;
"Доброй ночи, <Имя>!", если время от 23:00 до 4:59
*/

package task001_ShowHelloNameTime;

import java.time.LocalTime;
import java.util.Scanner;

public class program {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("name: ");
        String name = iScanner.nextLine();
        String dayTime = checkTime();
        String greeting = getGreeting(dayTime);
        System.out.println(greeting + ", " + name + "!");
        iScanner.close();
    }

    public static String checkTime() {
        LocalTime timeMorningStart = LocalTime.parse("05:00:00");
        LocalTime timeMorningEnd = LocalTime.parse("11:59:59");
        LocalTime timeDayStart = LocalTime.parse("12:00:00");
        LocalTime timeDayEnd = LocalTime.parse("17:59:59");
        LocalTime timeEveningStart = LocalTime.parse("18:00:00");
        LocalTime timeEveningEnd = LocalTime.parse("22:59:59");
        LocalTime timeNightStart = LocalTime.parse("23:00:00");
        LocalTime timeNightEnd = LocalTime.parse("04:59:59");
        LocalTime timeNow = LocalTime.now();
        String dayTime = "";

        if (timeNow.isAfter(timeMorningStart) && timeNow.isBefore(timeMorningEnd)) {
            dayTime = "morning";
        } else if (timeNow.isAfter(timeDayStart) && timeNow.isBefore(timeDayEnd)) {
            dayTime = "day";
        } else if (timeNow.isAfter(timeEveningStart) && timeNow.isBefore(timeEveningEnd)) {
            dayTime = "evening";
        } else if (timeNow.isAfter(timeNightStart) && timeNow.isBefore(timeNightEnd)) {
            dayTime = "night";
        }

        return dayTime;
    }

    static String getGreeting(String dayTime) {
        String res = "";
        switch (dayTime) {
            case "morning":
                res = "Доброе утро";
                break;
            case "day":
                res = "Добрый день";
                break;
            case "evening":
                res = "Добрый вечер";
                break;
            case "night":
                res = "Доброй ночи";
                break;
        }

        return res;
    }
}
