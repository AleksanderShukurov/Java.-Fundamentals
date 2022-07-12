package by.introduction_to_java_online.main.tasks.module_3.string_pattern.task_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SortByLexemeCount {
    public String sortingByCountOfLexeme(String string, String str) {
        string = string.replaceAll("[,:;_&-]", "").toLowerCase(Locale.ROOT);
        Pattern patternSecond = Pattern.compile("\\w+");
        Pattern pattern = Pattern.compile(str);
        String[] strings;
        int countFirst = 0;
        int countSecond = 0;
        ArrayList<String> varArrayFirst = new ArrayList<>();
        ArrayList<String> varArraySecond = new ArrayList<>();
        ArrayList<String> list = new ArrayList<>();
        Matcher matcher = patternSecond.matcher(string);
        while (matcher.find()) {
            list.add(matcher.group().trim());
        }
        strings = list.toArray(new String[0]);
        for (int i = 1; i < list.size(); i++) {
            Matcher matcherSecond = pattern.matcher(strings[i - 1]);
            Matcher matcherThird = pattern.matcher(strings[i]);
            while (matcherSecond.find()) {
                countFirst++;
            }
            while (matcherThird.find()) {
                countSecond++;
            }
            if (countFirst < countSecond) {
                String temp = strings[i - 1];
                strings[i - 1] = strings[i];
                strings[i] = temp;
                i = 0;
            }
            countFirst = 0;
            countSecond = 0;
        }

        for (String s : strings) {
            Matcher matcherFour = pattern.matcher(s);
            if (matcherFour.find()) {
                varArrayFirst.add(s);
            } else {
                varArraySecond.add(s);
            }
        }
        Collections.sort(varArraySecond);
        String[] firstArray = new String[varArrayFirst.size()];
        String[] secondArray = new String[varArraySecond.size()];
        firstArray = varArrayFirst.toArray(firstArray);
        secondArray = varArraySecond.toArray(secondArray);
        String[] finalStringArray = Arrays.copyOf(firstArray, firstArray.length + secondArray.length);
        System.arraycopy(secondArray, 0, finalStringArray, firstArray.length, secondArray.length);
        StringBuilder builder = new StringBuilder(firstArray.length + secondArray.length);
        for (String varString : finalStringArray) {
            builder.append(varString);
            builder.append(" ");
        }
        string = builder.toString();
        return string;
    }
}
