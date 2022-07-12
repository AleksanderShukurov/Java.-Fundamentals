package by.introduction_to_java_online.main.tasks.module_3.string_as_object;

/*
Условие:
Строка X состоит из нескольких предлоэений, каждое из которых кончается точкой, восклицательным или вопросительным
знаком. Определить количество предложений в строке Х.
 */

public class Task10 {
    int numberOfSentenceInTheStringDefining(String string) {
        int count = 0;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == 46 || string.charAt(i) == 33 || string.charAt(i) == 63) {
                count++;
            }
        }
        return count;
    }
}
