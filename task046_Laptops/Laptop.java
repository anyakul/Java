package task046_Laptops;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.StringJoiner;

public class Laptop {
    Integer id;
    String company;
    String system;
    String color;
    Integer price;
    Integer ram;

    Laptop(Integer i, String cm, String s, String c, Integer p, Integer r) {
        id = i;
        company = cm;
        system = s;
        color = c;
        price = p;
        ram = r;
    }

    public Integer getPrice() {
        return price;
    }

    public String getCompany() {
        return company;
    }

    public void PrintInfo() {
        System.out.println(company + " | " + system + " | " + color + " | " + price + " | " + ram + "ГБ");
    }

    public void PrintFilterKeys(Integer key) {
        if (key == 1) {
            System.out.println(this.company);
        } else if (key == 2) {
            System.out.println(this.company + " | " + this.system);
        } else if (key == 3) {
            System.out.println(this.company + " | " + this.color);
        } else if (key == 4) {
            System.out.println(this.company + " | " + this.price);
        } else if (key == 5) {
            System.out.println(this.company + " | " + this.ram);
        }
    }

    static HashMap<Integer, String> GetFilterKeys() {
        HashMap<Integer, String> filterKeys = new HashMap<>();
        int i = 0;

        for (Field field : Laptop.class.getDeclaredFields()) {
            if (!field.getName().equals("id")) {
                filterKeys.put(i, field.getName());
                i++;
            }
        }

        return filterKeys;
    }

    static StringJoiner GetFieldString() {
        HashMap<Integer, String> filterKeys = GetFilterKeys();
        int i = 0;
        StringJoiner fieldJoiner = new StringJoiner(", ");

        for (var el : filterKeys.entrySet()) {
            fieldJoiner.add(el.getKey() + " - " + filterKeys.get(i));
            i++;
        }

        return fieldJoiner;
    }
}
