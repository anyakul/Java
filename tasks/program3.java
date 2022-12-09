/* 3. Взять набор строк, например, Мороз и солнце день чудесный Еще ты дремлешь друг прелестный Пора красавица проснись.
Написать метод, который отсортирует эти строки по длине с помощью TreeMap. Строки с одинаковой длиной не должны “потеряться”. */

package tasks;

import java.util.Arrays;
import java.util.TreeMap;

public class program3 {
    public static void main(String[] args) {
        String str = "Мороз и солнце день чудес, Еще ты дремлешь друг прелестный, Пора красавица проснись.";
        String[] strArr = str.split(",");
        System.out.println(Arrays.toString(strArr));
        TreeMap<Double, String> res = GetRes(strArr);
        System.out.println(res);
    }

    static TreeMap<Double, String> GetRes(String[] arr) {
        TreeMap<Double, String> res = new TreeMap<>();
        double p = 0.1;

        for (String item : arr) {
            if (res.containsKey((double) item.length())) {
                res.put(item.length() + p, item);
                p += 0.1;
            } else {
                res.put((double) item.length(), item);
            }
        }

        return res;
    }
}
