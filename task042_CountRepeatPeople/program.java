/* 42 Пусть дан список сотрудников:Иван Иванов ( и остальные, полный текст дз будет на платформе)
Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений. Отсортировать по убыванию популярности. */

package task042_CountRepeatPeople;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class program {
    public static void main(String[] args) {
        String[] arr = new String[] { "Пётр Петров", "Иван Иванов", "Иван Иванов", "Иван Сидоров", "Пётр Петров",
                "Иван Иванов", "Иван Иванов", "Иван Сидоров", "Пётр Петров" };
        HashMap<String, Integer> lst = GetRes(arr);
        List<Map.Entry<String, Integer>> res = SortLst(lst);

        for (var el : res) {
            System.out.print(el.getKey() + ": " + el.getValue() + "\n");
        }
    }

    static HashMap<String, Integer> GetRes(String[] arr) {
        HashMap<String, Integer> res = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            if (res.containsKey(arr[i])) {
                res.put(arr[i], res.get(arr[i]) + 1);
            } else {
                res.put(arr[i], 1);
            }
        }

        return res;
    }

    static List<Map.Entry<String, Integer>> SortLst(HashMap<String, Integer> lst) {
        List<Map.Entry<String, Integer>> list = lst.entrySet().stream()
                .sorted((e2, e1) -> e1.getValue().compareTo(e2.getValue()))
                .collect(Collectors.toList());

        return list;
    }
}
