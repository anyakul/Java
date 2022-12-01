/*1. В консоли запросить имя пользователя. В зависимости от текущего времени, вывести приветствие вида
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
        String greeting = GetGreeting();
        System.out.println(greeting + ", " + name + "!");
        iScanner.close();
    }

    public static String GetGreeting() {
        LocalTime timeNow = LocalTime.now();
        String greeting = "";

        if (timeNow.isAfter(LocalTime.of(5, 00, 00)) && timeNow.isBefore(LocalTime.of(11, 59, 59))) {
            greeting = "Доброе утро";
        } else if (timeNow.isAfter(LocalTime.of(12, 00, 00)) && timeNow.isBefore(LocalTime.of(17, 59, 59))) {
            greeting = "Добрый день";
        } else if (timeNow.isAfter(LocalTime.of(18, 00, 00)) && timeNow.isBefore(LocalTime.of(22, 59, 59))) {
            greeting = "Добрый вечер";
        } else if (timeNow.isAfter(LocalTime.of(23, 00, 00)) && timeNow.isBefore(LocalTime.of(4, 59, 59))) {
            greeting = "Доброй ночи";
        }

        return greeting;
    }
}
