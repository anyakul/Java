package task046_Laptops;

import java.lang.reflect.Field;
import java.util.HashMap;

public class Laptop {

    public Object obj;
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
        System.out.println(company + " " + system + " " + color + " " + price + " " + ram);
    }

    public void PrintSortKeys() {
        System.out.println(this.company + " | " + this.price);
    }

    public void PrintFilterKeys(Integer key) {
        if (key == 1) {
            System.out.println(this.company + " | " + this.company);
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

    public boolean CheckLaptop(Integer key, String val) {
        if (key == 1 && val.equals(this.company)) {
            return true;
        } else if (key == 2 && val.equals(this.system)) {
            return true;
        } else if (key == 3 && val.equals(this.color)) {
            return true;
        } else if (key == 4 && Integer.parseInt(val) == this.price) {
            return true;
        } else if (key == 5 && Integer.parseInt(val) == this.ram) {
            return true;
        }

        return false;
    }

    static HashMap<Integer, String> GetFilterKeys() {
        HashMap<Integer, String> filterKeys = new HashMap<>();
        int i = 0;

        for (Field field : Laptop.class.getDeclaredFields()) {
            if (field.getName() != "id") {
                filterKeys.put(i, field.getName());
                i++;
            }
        }

        return filterKeys;
    }
}
