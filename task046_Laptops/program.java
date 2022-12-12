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
        Integer SortKey = GetSortKey(filterKeys);
        List<Laptop> sortLaptop = sortLaptops(SortKey, allLaptops);

        for (Laptop laptop : sortLaptop) {
            laptop.PrintSortKeys();
        }

        /*
         * String filterStr = GetFilterKey(filterKeys);
         * String[] str = filterStr.split(" ");
         * Integer filterKey = Integer.parseInt(str[0]);
         * String filterValue = str[1];
         * 
         * System.out.println("Ноутбуки подходящие под условия: ");
         * for (Laptop laptop : allLaptops) {
         * if (laptop.CheckLaptop(filterKey, filterValue)) {
         * laptop.PrintInfo();
         * }
         * }
         */
    }

    static Integer GetSortKey(HashMap<Integer, String> filterKeys) {
        Scanner iScanner = new Scanner(System.in);
        System.out.println(
                "Выберите один из параметров фильтрации и значение фильтра если надо отфильтровать: 1 - цена, 2 - имя ");
        int sortKey = iScanner.nextInt();
        iScanner.close();

        return sortKey;
    }

    static String GetFilterKey(HashMap<Integer, String> filterKeys) {
        Scanner iScanner = new Scanner(System.in);
        String str = "Выберите один из параметров фильтрации и знаение: ";
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

    static List<Laptop> sortLaptops(Integer sortKey, HashSet<Laptop> allLaptops) {
        List<Laptop> sortLaptop = new ArrayList<>();
        if (sortKey == 1) {
            sortLaptop = allLaptops.stream()
                    .sorted(Comparator.comparing(Laptop::getPrice))
                    .collect(Collectors.toList());
        } else if (sortKey == 2) {
            sortLaptop = allLaptops.stream()
                    .sorted(Comparator.comparing(Laptop::getCompany))
                    .collect(Collectors.toList());
        }

        return sortLaptop;
    }
}
