package Lesson5;

import java.util.HashMap;

// Даны 2 строки, написать метод, который вернет true, если эти строки являются изоморфными и false, если нет.
// Строки изоморфны, если одну букву в первом слове можно заменить на некоторую букву во втором слове, при этом

// 1. повторяющиеся буквы одного слова меняются на одну и ту же букву с сохранением порядка следования.
// (Например, add - egg изоморфны)
// 2. буква может не меняться, а остаться такой же. (Например, note - code)

public class task2 {
    public static void main(String[] args) {
        String firstWord = "paper";
        String secondWord = "title";
        System.out.println(isIsomorph(firstWord, secondWord));
    }

    static boolean isIsomorph(String firstWord, String secondWord) {
        if (firstWord.length() != secondWord.length())
            return false;
        HashMap<Character, Character> dict = new HashMap<>();

        for (int i = 0; i < firstWord.length(); i++) {
            if (dict.containsKey(firstWord.charAt(i)) && (dict.get(firstWord.charAt(i)) != secondWord.charAt(i)))
                return false;
            else
                dict.put(firstWord.charAt(i), secondWord.charAt(i));
        }
        return true;
    }
}
