/*
4. Напишите метод, который находит самую длинную строку общего префикса среди массива строк.
Если общего префикса нет, вернуть пустую строку "".
Input: ["flower","flow","flight"]
Output: "fl"
String names = …
String[] words = names .split(“ “)
*/

package task004_GetLongString;

public class program {
    public static void main(String[] args) {
        String[] arr = new String[] { "flower", "flow", "flight" };
        String commonPrefix = GetPrefix(arr);
        System.out.println(commonPrefix);
    }

    static String GetPrefix(String arr[]) {
        String prefix = arr[0];

        for (var str : arr) {
            while (str.indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty())
                    return "";
            }
        }

        return prefix;
    }
}
