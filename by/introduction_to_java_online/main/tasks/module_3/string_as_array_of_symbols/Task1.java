package by.introduction_to_java_online.main.tasks.module_3.string_as_array_of_symbols;
/*
Условие:
Дан массив названий переменных в camelCase. Преобразовать названия в snake_case.
 */

public class Task1 {
    String[] camelCaseToSnakeCaseTransformation(String[] stringsArray) {
        char[] string;
        for (int k = 0; k < stringsArray.length; k++) {
            String s = stringsArray[k];
            string = s.toCharArray();
            int count = 0;
            for (char c : string) {
                count = 0;
                if (c >= 65 && c <= 90) {
                    count++;
                }
            }
            char[] newString = new char[s.length() + count];
            for (int j = 0, p = 0; j < newString.length; j++, p++) {
                if (string[p] >= 65 && string[p] <= 90) {
                    newString[j] = '_';
                    newString[j + 1] = (char) (string[p] + 32);
                    j++;
                    continue;
                }
                newString[j] = string[p];
            }
            stringsArray[k] = new String(newString);

        }

        return stringsArray;
    }

}

