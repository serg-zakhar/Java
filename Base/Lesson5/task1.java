package Base.Lesson5;

import java.util.HashMap;

// Создать структуру для хранения Номеров паспортов и Фамилий сотрудников организации.
// 123456 Иванов
// 321456 Васильев
// 234561 Петрова
// 234432 Иванов
// 654321 Петрова
// 345678 Иванов
// Вывести данные по сотрудникам с фамилией Иванов.

public class task1 {
    public static void main(String[] args) {
        HashMap<Integer, String> passports = new HashMap<>();
        passports.put(123456, "Иванов");
        passports.put(321456, "Васильев");
        passports.put(234561, "Петрова");
        passports.put(234432, "Иванов");
        passports.put(654321, "Петрова");
        passports.put(345678, "Иванов");
        for (var passport : passports.entrySet()){
            if (passport.getValue().equals("Иванов")) {
                System.out.println(passport.getValue() + ": " + passport.getKey());
            }
        }
    }
    
}
