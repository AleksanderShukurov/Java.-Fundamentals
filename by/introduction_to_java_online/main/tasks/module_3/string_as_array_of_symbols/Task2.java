package by.introduction_to_java_online.main.tasks.module_3.string_as_array_of_symbols;
/*
Условие:
Замените в строке все вхождения word на letter.
 */

public class Task2 {
    String wordToLetterConvert(String stringWord) {
        char[] charString = stringWord.toCharArray();
        int count = 0;
        for (int i = 0; i < charString.length; i++) {
            if (charString[i] == 'w' && charString[i + 1] == 'o' && charString[i + 2] == 'r' && charString[i + 3] == 'd') {
                count += 2;
            }
        }
        char[] newString = new char[stringWord.length() + count];
        for (int i = 0, j = 0; i < newString.length || j < charString.length; i++, j++) {
            if (charString[j] == 'w' && charString[j + 1] == 'o' && charString[j + 2] == 'r' && charString[j + 3] == 'd') {
                newString[i] = 'l';
                newString[i + 1] = 'e';
                newString[i + 2] = 't';
                newString[i + 3] = 't';
                newString[i + 4] = 'e';
                newString[i + 5] = 'r';
                i += 5;
                j += 3;
            } else {
                newString[i] = charString[j];
            }
        }
        stringWord = new String(newString);
        return stringWord;
    }
}
