/* 21. Дана json строка (можно сохранить в файл и читать из файла)
[{"фамилия":"Иванов","оценка":"5","предмет":"Математика"},
{"фамилия":"Петрова","оценка":"4","предмет":"Информатика"},
{"фамилия":"Краснов","оценка":"5","предмет":"Физика"}]
Написать метод(ы), который распарсит json и, используя StringBuilder, создаст строки вида: Студент [фамилия] получил [оценка] по предмету [предмет].
Пример вывода:
Студент Иванов получил 5 по предмету Математика.
Студент Петрова получил 4 по предмету Информатика.
Студент Краснов получил 5 по предмету Физика. */

package task021_MapText;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

public class program {
    public static void main(String[] args) {
        ArrayList<HashMap<String, String>> arr = GetDict();
        PrintStrings(arr);
    }

    static ArrayList<HashMap<String, String>> GetDict() {
        ArrayList<HashMap<String, String>> arr = new ArrayList<>();
        HashMap<String, String> dict = new HashMap<String, String>();
        try {
            String pathProject = System.getProperty("user.dir");
            String pathFile = pathProject.concat("/task021_MapText/data.json");
            File f = new File(pathFile);
            FileReader fr = new FileReader(f);
            BufferedReader reader = new BufferedReader(fr);
            String line = "";

            try {
                line = reader.readLine();
                while (line != null) {
                    line = line.trim().replaceAll(",", "");
                    int point = line.indexOf(":");
                    if (point != -1) {
                        String key = line.substring(1, point - 1);
                        String val = line.substring(point + 3, line.length() - 1);
                        dict.put(key, val);
                    }
                    if (line.equals("}")) {
                        arr.add(dict);
                        dict = new HashMap<String, String>();
                    }
                    line = reader.readLine();
                }
                reader.close();
            } catch (IOException e) {
                System.out.println("Строки нет");
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }

        return arr;
    }

    static void PrintStrings(ArrayList<HashMap<String, String>> arr) {
        for (HashMap<String, String> el : arr) {
            System.out.println("Студент " + el.get("Фамилия") + " получил " + el.get("оценка") + " по предмету "
                    + el.get("предмет"));
        }
    }
}
