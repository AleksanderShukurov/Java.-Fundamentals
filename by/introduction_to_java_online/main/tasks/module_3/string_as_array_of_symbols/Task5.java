package by.introduction_to_java_online.main.tasks.module_3.string_as_array_of_symbols;
/*
Удалить в строке все лишние пробелы, то есть серии подряд идущих пробелов заменить на одиночные пробелы.
Крайние пробелы в строке удалить.
 */

public class Task5 {
    String spacesDelete(String string) {
        char[] charString = string.toCharArray();
        int count = 0;
        if ((charString[0] == ' ')) {
            count++;
        }
        if (charString[charString.length - 1] == ' ') {
            count++;
        }
        for (int i = 1; i < charString.length - 1; i++) {
            if (charString[i] == ' ') {
                while (charString[i + 1] == ' ') {
                    count++;
                    i++;
                }
            }
        }
        char[] newString = new char[charString.length - count];
        for (int i = 0, j = 1; i < newString.length || j < charString.length - 2; i++, j++) {
            if (charString[j] == ' ') {
                newString[i] = ' ';
                while (charString[j + 1] == ' ')
                    j++;
            } else {
                newString[i] = charString[j];
            }
        }
        string = new String(newString);
        return string;
    }
}

