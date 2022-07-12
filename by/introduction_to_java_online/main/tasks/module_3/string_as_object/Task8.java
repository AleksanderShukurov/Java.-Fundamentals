package by.introduction_to_java_online.main.tasks.module_3.string_as_object;

import java.util.Locale;

/*
Условие:
Вводится строка слов, разделенных пробелами. Найти самое длинное слово и вывести его на экран. Случай, когда самых
длинных слов может быть несколько, не обрабатывать.
 */

public class Task8 {
    String searchForTheLongestWord(String string) {
        int maxLongestWordIndex = 0;
        int maxLongestWordIndexTemp = 0;
        int maxLongestWordLastIndex = 0;
        int maxLongestWordLastIndexTemp = 0;
        int count = 1;
        int maxCount = 0;
        String tempString = string.toLowerCase(Locale.ROOT);
        for (int i = 0; i < tempString.length(); i++) {
            if (tempString.charAt(i) >= 97 && tempString.charAt(i) <= 122) {
                maxLongestWordIndexTemp = i;
                while (tempString.charAt(i + 1) >= 97 && tempString.charAt(i + 1) <= 122) {
                    i++;
                    maxLongestWordLastIndexTemp = i + 1;
                    count++;
                }
            }
            if (count > maxCount) {
                maxCount = count;
                maxLongestWordIndex = maxLongestWordIndexTemp;
                maxLongestWordLastIndex = maxLongestWordLastIndexTemp;
            }
        }
        string = string.substring(maxLongestWordIndex, maxLongestWordLastIndex);

        return string;
    }

}
