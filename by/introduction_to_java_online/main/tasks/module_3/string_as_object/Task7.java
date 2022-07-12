package by.introduction_to_java_online.main.tasks.module_3.string_as_object;

/*
Условие:
Вводится строка. Требуется удалить из нее повторяющиеся символы и все пробелы. Например, если было введено
"abc cde def" , то должно быть выведено "abcdef".
 */

public class Task7 {
    String spaceAndDoublesDel(String string) {
        string = string.trim().replace(" ", "");
        StringBuilder stringBuilder = new StringBuilder(string);
        for (int i = 0; i < stringBuilder.length(); i++) {
            for (int j = i + 1; j < stringBuilder.length() - 1; j++) {
                if (stringBuilder.charAt(i) == stringBuilder.charAt(j)) {
                    stringBuilder.deleteCharAt(j);
                }
            }
        }
        string = stringBuilder.toString();
        return string;
    }
}
