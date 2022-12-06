package examples.example047_HashMap;

import java.util.HashMap;
import java.util.Map;

public class program {
    public static void main(String[] args) {
        Map<Integer, String> db = new HashMap<>();
        db.putIfAbsent(1, "один");
        db.put(2, "два");
        db.put(null, "null");
        System.out.println(db); // {null=!null, 1=один, 2=два}
        System.out.println(db.get(44)); // null
        db.remove(null);
        System.out.println(db);// {1=один, 2=два}
        System.out.println(db.containsValue("один")); // true
        // System.out.println(db.containsValue("1")); // false
        // System.out.println(db.containsKey("Один")); // false
        System.out.println(db.containsKey(1)); // true
        System.out.println(db.keySet()); // [1, 2]
        System.out.println(db.values()); // [один, два]
    }
}
