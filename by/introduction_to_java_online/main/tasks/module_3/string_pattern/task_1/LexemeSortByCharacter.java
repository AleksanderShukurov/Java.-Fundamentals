package by.introduction_to_java_online.main.tasks.module_3.string_pattern.task_1;

import by.introduction_to_java_online.main.tasks.TrainingIO;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LexemeSortByCharacter {
    TrainingIO trainingIO = new TrainingIO();

    public void sortingLexemeByCharacter(String string, String str) {
        Pattern patternThird = Pattern.compile("[^.!?]+[!.?]");
        ArrayList<String> arrayOFSentences = new ArrayList<>();
        ArrayList<String> newArrayOFSentences = new ArrayList<>();
        Matcher matcher = patternThird.matcher(string);
        SortByLexemeCount sortByLexemeCount = new SortByLexemeCount();
        while (matcher.find()) {
            arrayOFSentences.add(matcher.group().trim());
        }
        for (String arrayOFSentence : arrayOFSentences) {
            newArrayOFSentences.add(sortByLexemeCount.sortingByCountOfLexeme(arrayOFSentence, str));
        }

        for (String newArrayOFSentence : newArrayOFSentences) {
            trainingIO.printing(newArrayOFSentence);
        }
    }
}

