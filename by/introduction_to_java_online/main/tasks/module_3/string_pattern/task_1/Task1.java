package by.introduction_to_java_online.main.tasks.module_3.string_pattern.task_1;

/*
Условие:
Создать приложение, разбирающее текст (текст хранится в строке) и позволяющее выполнять с текстом три различные операции:
1. Отсортировать абзацы по количеству предложений;
2. В каждом предложении отсортировать слова по длине;
3. Отсортировать лексемы в предложении по убыванию количества вхождений заданного символа, а в случае равенства - по алфовиту.
 */

import by.introduction_to_java_online.main.tasks.TrainingIO;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task1 {
    TrainingIO trainingIO = new TrainingIO();

    public void sortingByNumberOFSentences(String string) {
        String[] strings = string.split("[\n]");
        int[] numberOfSentences = new int[strings.length];
        int count = 0;
        String temp;
        int tempVar;
        Pattern pattern = Pattern.compile("[.!?]");

        for (int i = 0; i < strings.length; i++) {
            Matcher matcher = pattern.matcher(strings[i]);
            while (matcher.find()) {
                count++;
            }
            numberOfSentences[i] = count;
            count = 0;
        }
        for (int i = 0; i < numberOfSentences.length - 1; ) {
            if (numberOfSentences[i + 1] > numberOfSentences[i]) {
                temp = strings[i];
                tempVar = numberOfSentences[i];
                strings[i] = strings[i + 1];
                numberOfSentences[i] = numberOfSentences[i + 1];
                strings[i + 1] = temp;
                numberOfSentences[i + 1] = tempVar;
                i = 0;
            } else i++;
        }
        for (String s : strings) {
            trainingIO.printing(s + "\n");
        }
    }
}
