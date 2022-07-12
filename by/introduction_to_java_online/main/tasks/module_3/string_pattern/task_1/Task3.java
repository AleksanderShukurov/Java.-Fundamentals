package by.introduction_to_java_online.main.tasks.module_3.string_pattern.task_1;

import by.introduction_to_java_online.main.tasks.TrainingIO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
Условие:
3. отсортировать лексемы в предложении по убыванию количества вхождений заданного символа, а в случае равенства - по алфовиту.
 */

public class Task3 {
    TrainingIO trainingIO = new TrainingIO();

    public String sortingByNumberOfCharacterInTokens(String string) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        trainingIO.printing("Enter character for sorting >>");
        String str = null;
        try {
            str = reader.readLine();
        } catch (IOException e) {
            e.getStackTrace();
        }
        Pattern pattern1 = Pattern.compile("[^.!?]+[!.?]");
        ArrayList<String> arrayOFSentences = new ArrayList<>();
        LexemeSortByCharacter lexemeSortByCharacter = new LexemeSortByCharacter();
        string = string.replaceAll("[,:;_&-]", "");
        Matcher matcher = pattern1.matcher(string);
        while (matcher.find()) {
            arrayOFSentences.add(matcher.group().trim());
        }
        lexemeSortByCharacter.sortingLexemeByCharacter(string, str);
        return string;
    }
}
