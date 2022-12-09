/* 35. Создать структуру для хранения Номеров паспортов и Фамилий сотрудников организации.
123456 Иванов
321456 Васильев
234561 Петрова
234432 Иванов
654321 Петрова
345678 Иванов
Вывести данные по сотрудникам с фамилией Иванов. */

package task035_Employeers;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class program {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        Map<Integer, String> lst = GetEmployeers(iScanner);
        System.out.println(lst);
        FindEmployeers(iScanner, lst);
        iScanner.close();
    }

    static Map<Integer, String> GetEmployeers(Scanner iScanner) {
        Map<Integer, String> lst = new HashMap<>();
        System.out.println("Паспорт и фамилия сотрудника: ");
        String str = iScanner.nextLine();

        while (!str.equals("finish")) {
            String[] strArr = str.split(" ");
            lst.put(Integer.parseInt(strArr[0]), strArr[1]);
            System.out.println("Паспорт и фамилия сотрудника: ");
            str = iScanner.nextLine();
        }

        return lst;
    }

    static void FindEmployeers(Scanner iScanner, Map<Integer, String> lst) {
        System.out.println("Какого сотрудника надо найти: ");
        String str = iScanner.nextLine();

        for (var el : lst.entrySet()) {
            if (el.getValue().equals(str)) {
                System.out.print(el.getKey() + " : " + el.getValue() + "\n");
            }
        }
    }
}
