/* 46. Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
Создать множество ноутбуков.
Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет ноутбуки, отвечающие фильтру. Критерии фильтрации можно хранить в Map. Например:
“Введите цифру, соответствующую необходимому критерию:
1 - ОЗУ
2 - Объем ЖД
3 - Операционная система
4 - Цвет …
Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям. */

package task046_Laptops;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.StringJoiner;
import java.util.stream.Collectors;

public class program {
    public static Scanner iScanner = new Scanner(System.in);

    public static void main(String[] args) {
        Laptop laptop1 = new Laptop(1, "samsung", "windows", "blue", 20000, 16);
        Laptop laptop2 = new Laptop(2, "samsung", "windows", "white", 20000, 16);
        Laptop laptop3 = new Laptop(3, "apple", "macos", "white", 40000, 8);
        Laptop laptop4 = new Laptop(4, "honor", "windows", "gray", 10000, 16);

        HashSet<Laptop> allLaptops = new HashSet<>(Arrays.asList(laptop1, laptop2, laptop3, laptop4));
        int option = 0;
        StringJoiner fieldJoiner = Laptop.GetFieldString();

        System.out.println(
                "Выберите функцию программы: 1 - вывод нужных полей, 2 - сортировка");
        if (iScanner.hasNextInt()) {
            option = iScanner.nextInt();
        }

        if (option == 1) {
            int printKey = GetPrintKey(fieldJoiner);

            for (Laptop laptop : allLaptops) {
                laptop.PrintFilterKeys(printKey);
            }
        } else if (option == 2) {
            int sortKey = GetSortKey();
            List<Laptop> sortedLaptops = sortLaptops(sortKey, allLaptops);

            for (Laptop laptop : sortedLaptops) {
                laptop.PrintInfo();
            }
        } else {
            System.out.println("Неизвестная команда");
        }

        iScanner.close();
    }

    static Integer GetPrintKey(StringJoiner fieldJoiner) {
        int printKey = 1;
        System.out.println("Выберите какое поле вывести: " + fieldJoiner + ": ");
        if (iScanner.hasNextInt()) {
            printKey = iScanner.nextInt();
        }

        return printKey;
    }

    static Integer GetSortKey() {
        int sortKey = 1;
        System.out.println(
                "Выберите один из параметров сортировки: 1 - цена, 2 - имя ");
        if (iScanner.hasNextInt()) {
            sortKey = iScanner.nextInt();
        }

        return sortKey;
    }

    static List<Laptop> sortLaptops(Integer sortKey, HashSet<Laptop> allLaptops) {
        List<Laptop> sortLaptop = new ArrayList<>();
        if (sortKey == 1) {
            sortLaptop = allLaptops.stream()
                    .sorted(Comparator.comparing(Laptop::getPrice).reversed())
                    .collect(Collectors.toList());
        } else if (sortKey == 2) {
            sortLaptop = allLaptops.stream()
                    .sorted(Comparator.comparing(Laptop::getCompany))
                    .collect(Collectors.toList());
        }

        return sortLaptop;
    }
}
