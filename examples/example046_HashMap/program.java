package examples.example046_HashMap;

import java.util.HashMap;
import java.util.Map;

public class program {
    public static void main(String[] args) {
        Map<Integer, String> db = new HashMap<>();
        db.put(1, "один");
        System.out.println(db);
        db.put(2, "два");
        System.out.println(db);
        db.put(3, "три");
        System.out.println(db);
        db.put(31, "три один");
        System.out.println(db);
        db.put(13, "один три");
        System.out.println(db);
        db.put(null, "!null");
        System.out.println(db);
        db.put(null, null);
        System.out.println(db);
    }
}
