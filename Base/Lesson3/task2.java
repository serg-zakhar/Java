// Заполнить список названиями планет солнечной системы в произвольном порядке с повторениями. 
// Вывести список планет и количество повторений.

package Base.Lesson3;

import java.util.ArrayList;
import java.util.Random;

public class task2 {
    public static void main(String[] args) {
        String[] planets = new String[] {"Меркурий", "Венера", "Земля", "Марс", "Юпитер", "Сатурн", "Нептун", "Плутон"};
        ArrayList<String> planetList = new ArrayList<>();
        Random rand = new Random();
        for (int i = 0; i < 20; i++) {
            int index = rand.nextInt(8);
            planetList.add(planets[index]);
        }

        for (int i = 0; i < planets.length; i++) {
            int count = 0;
            for (String planet : planetList) {
                if (planet.equals(planets[i])) count ++;
            }
            System.out.println(planets[i] + " : " + count + "\n");
        }
        System.out.println(planetList);
    }
}
