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

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class program {
    public static void main(String[] args) {
        Laptop laptop1 = new Laptop(1, "samsung", "windows", "blue", 20000, 16);
        Laptop laptop2 = new Laptop(2, "samsung", "windows", "white", 20000, 16);
        Laptop laptop3 = new Laptop(3, "apple", "macos", "white", 40000, 8);
        Laptop laptop4 = new Laptop(4, "Honor", "windows", "gray", 10000, 16);

        HashSet<Laptop> allLaptops = new HashSet<>(Arrays.asList(laptop1, laptop2, laptop3, laptop4));

        HashMap<Integer, String> filterKeys = Laptop.GetFilterKeys();
        String filterKeyStr = GetFilterKey(filterKeys);
        String filterValue = "";
        Integer filterKey = 0;

        if (filterKeyStr.indexOf(" ") != -1) {
            String[] str = filterKeyStr.split(" ");
            filterKey = Integer.parseInt(str[0]);
            filterValue = str[1];
        } else {
            filterKey = Integer.parseInt(filterKeyStr);
        }

        sortLaptops(filterKey, allLaptops);

        System.out.println(" ");

        if (!filterValue.isEmpty()) {
            System.out.println("Ноутбуки подходящие под условия: ");
            for (Laptop laptop : allLaptops) {
                if (laptop.CheckLaptop(filterKey, filterValue)) {
                    laptop.PrintInfo();
                }
            }
        }
    }

    static String GetFilterKey(HashMap<Integer, String> filterKeys) {
        Scanner iScanner = new Scanner(System.in);
        String str = "Выберите один из параметров фильтрации и значение фильтра если надо отфильтровать: ";
        int i = 0;

        for (var el : filterKeys.entrySet()) {
            str += el.getKey() + " - " + filterKeys.get(i) + ", ";
            i++;
        }

        System.out.println(str);
        String filterKey = iScanner.nextLine();
        iScanner.close();

        return filterKey;
    }

    static void sortLaptops(Integer filterKey, HashSet<Laptop> allLaptops) {
        if (filterKey == 4) {
            List<Laptop> sortedLaptops = allLaptops.stream()
                    .sorted(Comparator.comparing(Laptop::getPrice))
                    .collect(Collectors.toList());
            for (Laptop laptop : sortedLaptops) {
                laptop.PrintFilterKeys(filterKey);
            }
        } else if (filterKey == 5) {
            List<Laptop> sortedLaptops = allLaptops.stream()
                    .sorted(Comparator.comparing(Laptop::getRam))
                    .collect(Collectors.toList());
            for (Laptop laptop : sortedLaptops) {
                laptop.PrintFilterKeys(filterKey);
            }
        } else {
            for (Laptop laptop : allLaptops) {
                laptop.PrintFilterKeys(filterKey);
            }
        }
    }
}
