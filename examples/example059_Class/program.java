package examples.example059_Class;

import java.util.Arrays;
import java.util.HashSet;

public class program {
    public static void main(String[] args) {
        Worker w1 = new Worker();
        w1.firstName = "Имя_1";
        w1.lastName = "Фамилия_1";
        w1.salary = 100;
        w1.id = 1000;

        Worker w2 = new Worker();
        w2.firstName = "Имя_1";
        w2.lastName = "Фамилия_1";
        w2.salary = 100;
        w2.id = 1000;

        Worker w3 = new Worker();
        w3.firstName = "Имя_3";
        w3.lastName = "Фамилия_3";
        w3.salary = 300;
        w3.id = 3000;

        System.out.println(w1 == w2); // false
        System.out.println(w1.equals(w2)); // true

        System.out.println(w1 == w3); // false
        System.out.println(w1.equals(w3)); // false

        var workers = new HashSet<Worker>(Arrays.asList(w1, w2, w3)); // [id:1000 fn:Имя_1 ln:Фамилия_1 s:100, id:3000
                                                                      // fn:Имя_3 ln:Фамилия_3 s:300]
        System.out.println(workers.contains(w3)); // true
        System.out.println(workers); // true

        System.out.println(w1.toString()); // examples.example058_Class.Worker@4617c264
        System.out.println(w2); // examples.example058_Class.Worker@36baf30c
        System.out.println(w3); // examples.example058_Class.Worker@7a81197d
    }
}
