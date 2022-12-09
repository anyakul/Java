/* 5 Пусть дан список сотрудников:Иван Иванов ( и остальные, полный текст дз будет на платформе)
Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений. Отсортировать по убыванию популярности. */

package tasks;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class program5 {
    public static void main(String[] args) {
        List<String> arr = Arrays.asList("Иван Иванов", "Иван Иванов", "Иван Сидоров", "Пётр Петров", "Иван Иванов",
                "Иван Иванов",
                "Иван Сидоров", "Пётр Петров", "Пётр Петров", "Пётр Петров");
        List<String> sortList = SortLst(arr);
        TreeMap<Double, String> res = GetRes(sortList);
        for (var el : res.entrySet()) {
            System.out.print(el.getKey().intValue() + ": " + el.getValue() + "\n");
        }
    }

    static TreeMap<Double, String> GetRes(List<String> arr) {
        TreeMap<Double, String> res = new TreeMap<>(Collections.reverseOrder());
        double count = 1.0;
        double d = 0.000001;

        for (int i = 1; i < arr.size(); i++) {
            if (arr.get(i).equals(arr.get(i - 1))) {
                count += 1;
            } else if (!arr.get(i).equals(arr.get(i - 1))) {
                res.put(count + d, arr.get(i - 1));
                d += 0.000001;
                count = 1.0;
            }
            if (i == arr.size() - 1) {
                res.put(count + d, arr.get(i - 1));
            }
        }

        return res;
    }

    static List<String> SortLst(List<String> arr) {
        List<String> sortedLst = arr.stream()
                .sorted(String.CASE_INSENSITIVE_ORDER)
                .collect(Collectors.toList());

        return sortedLst;
    }
}
