package by.introduction_to_java_online.main.tasks.module_3.string_pattern.task_1;

import by.introduction_to_java_online.main.tasks.TrainingIO;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.util.Comparator.comparingInt;

/*
Условие:
2. В каждом предложении отсортировать слова по длине;
Note:
В решении умышленно не приводилась строка к нижнему регистру, для реализации этого, необходимо 27 строку заменить на:
arrayOFSentences.add(matcher.group().trim().toLowerCase(Locale.ROOT));
 */

public class Task2 {
    TrainingIO trainingIO = new TrainingIO();

    public void sortingSentencesByVerbsLength(String string) {
        Pattern pattern = Pattern.compile("\\w+");
        Pattern pattern1 = Pattern.compile("[^.!?]+[!.?]");
        string = string.replaceAll("[,:;_&-]", "");
        Comparator<String> comparator = comparingInt(String::length);
        ArrayList<String> arrayOFSentences = new ArrayList<>();
        Matcher matcher = pattern1.matcher(string);
        while (matcher.find()) {
            arrayOFSentences.add(matcher.group().trim());
        }
        String[] tempArr = new String[arrayOFSentences.size()];
        for (int i = 0; i < arrayOFSentences.size(); i++) {
            Matcher matcher1 = pattern.matcher(arrayOFSentences.get(i));
            ArrayList<String> tempArrayOFWords = new ArrayList<>();
            while (matcher1.find()) {
                tempArrayOFWords.add(matcher1.group().trim());
            }
            StringBuilder builder = new StringBuilder(tempArrayOFWords.size());
            String[] stringVar = tempArrayOFWords.toArray(new String[0]);
            Arrays.sort(stringVar, comparator);
            for (String str : stringVar) {
                builder.append(str).append(" ");
            }
            tempArr[i] = builder.toString();
        }
        for (String s : tempArr) {
            trainingIO.printing(s);
        }

    }
}

