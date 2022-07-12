package by.introduction_to_java_online.main.tasks.module_3.string_as_object;
/*
Условие:
Из заданной строки получить новую, повторив каждый символ дважды.
 */

public class Task6 {
    String doublingTheString(String string) {
        StringBuilder stringBuilder = new StringBuilder(string);
        for (int i = 0; i < stringBuilder.length(); i += 2) {
            stringBuilder.insert(i + 1, stringBuilder.charAt(i));
        }
        string = stringBuilder.toString();
        return string;
    }
}
