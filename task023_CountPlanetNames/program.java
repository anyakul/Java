/* 23. Заполнить список названиями планет Солнечной системы в произвольном порядке с повторениями. 
Вывести название каждой планеты и количество его повторений в списке.
Пройти по списку из предыдущего задания и удалить повторяющиеся элементы. */

package task023_CountPlanetNames;

import java.util.ArrayList;
import java.util.Random;

public class program {
    public static void main(String[] args) {
        String[] fullPlanets = new String[] { "Меркурий", "Венера", "Земля", "Марс", "Юпитер", "Сатурн", "Уран",
                "Нептун", "Плутон" };
        ArrayList<String> randomPlanets = GetRandomPlanets(fullPlanets);
        System.out.println(randomPlanets);
        CountNames(fullPlanets, randomPlanets);
        ArrayList<String> uniquePlanets = GetUniquePlanets(randomPlanets);
        System.out.println(uniquePlanets);
    }

    static ArrayList<String> GetRandomPlanets(String[] fullPlanets) {
        ArrayList<String> randomPlanets = new ArrayList<>();
        Random rand = new Random();

        for (int i = 0; i < 15; i++) {
            randomPlanets.add(fullPlanets[rand.nextInt(fullPlanets.length)]);
        }

        return randomPlanets;
    }

    static void CountNames(String[] fullPlanets, ArrayList<String> randomPlanets) {
        for (int i = 0; i < fullPlanets.length; i++) {
            int count = 0;
            String onePlanet = fullPlanets[i];

            for (int k = 0; k < randomPlanets.size(); k++) {
                if (onePlanet.equals(randomPlanets.get(k))) {
                    count++;
                }
            }
            System.out.println("Планета " + onePlanet + " повторяется " + count + " раз");
        }
    }

    static ArrayList<String> GetUniquePlanets(ArrayList<String> randomPlanets) {
        ArrayList<String> uniquePlanets = new ArrayList<>();

        for (int i = 0; i < randomPlanets.size(); i++) {
            if (uniquePlanets.indexOf(randomPlanets.get(i)) == -1) {
                uniquePlanets.add(randomPlanets.get(i));
            }
        }

        return uniquePlanets;
    }
}
