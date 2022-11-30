/* 19. Дана строка sql-запроса "select * from students where ". Сформируйте часть WHERE этого запроса, используя StringBuilder. Данные для фильтрации приведены ниже в виде json строки.
Если значение null, то параметр не должен попадать в запрос.
Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"} 
Результат "select * from students where “name” = “Ivanov” and “country”=”Russia” … */

package task019_SqlRequest;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.StringJoiner;

public class program {
    public static void main(String[] args) {
        Map<String, String> dict = GetDict();
        System.out.println(GetSqlRequest(dict));
    }

    static Map<String, String> GetDict() {
        HashMap<String, String> dict = new HashMap<String, String>();
        try {
            String pathProject = System.getProperty("user.dir");
            String pathFile = pathProject.concat("/task019_SqlRequest/data.json");
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
                    line = reader.readLine();
                }
                reader.close();
            } catch (IOException e) {
                System.out.println("Строки нет");
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }

        return dict;
    }

    static StringBuilder GetSqlRequest(Map<String, String> dict) {
        StringBuilder res = new StringBuilder();

        StringJoiner res_joiner = new StringJoiner(" and ");
        String str = "select * from students where ";
        res.append(str);

        for (String key : dict.keySet()) {
            if (!dict.get(key).equals("null")) {
                str = key + " = " + dict.get(key);
                res_joiner.add(str);
            }
        }
        res.append(res_joiner);

        return res;
    }
}
