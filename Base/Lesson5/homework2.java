package Base.Lesson5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

// Пусть дан список сотрудников:
// Иван Иванов
// Светлана Петрова
// Кристина Белова
// Анна Мусина
// Анна Крутова
// Иван Юрин
// Петр Лыков
// Павел Чернов
// Петр Чернышов
// Мария Федорова
// Марина Светлова
// Мария Савина
// Мария Рыкова
// Марина Лугова
// Анна Владимирова
// Иван Мечников
// Петр Петин
// Иван Ежов

// Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений.
// Отсортировать по убыванию популярности Имени.

public class homework2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        HashMap<String, Integer> names = new HashMap<>();
        list.add("Иван Иванов");
        list.add("Светлана Петрова");
        list.add("Кристина Белова");
        list.add("Анна Мусина");
        list.add("Анна Крутова");
        list.add("Иван Юрин");
        list.add("Петр Лыков");
        list.add("Павел Чернов");
        list.add("Петр Чернышов");
        list.add("Мария Федорова");
        list.add("Марина Светлова");
        list.add("Мария Савина");
        list.add("Мария Рыкова");
        list.add("Марина Лугова");
        list.add("Анна Владимирова");
        list.add("Иван Мечников");
        list.add("Петр Петин");
        list.add("Иван Ежов");
        // System.out.println(list);
        for (String item : list) {
            String name = item.split(" ")[0];
            // System.out.println(name);
            if (!names.keySet().contains(name)) {
                names.put(name, 1);
            } else {
                names.put(name, names.get(name) + 1);
            }           
        }
        names.entrySet().stream().sorted(Map.Entry.<String, Integer>comparingByValue()
        .reversed()).forEach(System.out::println);
    }

}
