package by.introduction_to_java_online.main.tasks.module_3.string_pattern;

import by.introduction_to_java_online.main.tasks.TrainingIO;
import by.introduction_to_java_online.main.tasks.module_3.string_pattern.task_1.Task1;
import by.introduction_to_java_online.main.tasks.module_3.string_pattern.task_1.Task2;
import by.introduction_to_java_online.main.tasks.module_3.string_pattern.task_1.Task3;
import by.introduction_to_java_online.main.tasks.module_3.string_pattern.task_2.AnalyzerOFTheText;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Start {
    TrainingIO trainingIO = new TrainingIO();

    public void startingPartOne() {
        String string = "We are delighted to announce the launch of a new online-only, author-pays, journal, " +
                "Transportation Engineering (TRENG) Amaway. Transportation Engineering is a new Gold Open Access multidisciplinary " +
                "and multi-scale journal offering authors the opportunity to publish in forefront areas of engineering related " +
                "to vehicles & systems infrastructure, vehicle-based interconnectivity technology and integration aspects " +
                "(linking of vehicles to their physical surroundings).\nTransportation Engineering will publish full " +
                "research papers, review papers and short communications (new ideas, controversial opinions, proof of " +
                "concept). The scope of Transportation engineering covers all as aspects of transport engineering, " +
                "including both vehicle engineering (including automotive, aerospace, and naval) and civil engineering " +
                "(planning, design, construction, maintenance, and operation for all type of systems infrastructures). " +
                "The journal welcomes papers on all topics related to transportation engineering as well as integrated " +
                "research where intelligent vehicles and intelligent infrastructure meet in order to address the safety " +
                "and quality of life of the end users.\nAs an open access journal all submitted manuscripts will undergo " +
                "fast but rigorous peer review and after acceptance, a publication fee is charged to cover all editorial, " +
                "production, and archiving costs. Different publication fees apply for the two types of papers: USD 1000 " +
                "for full papers and USD 500 for short communications (excluding taxes). Note: These prices are waived " +
                "until December 2020. All articles will be immediately and permanently free for everyone to read and download.";
        Task1 sortByNumberOfSentences = new Task1();
        Task2 sortVerbsByLength = new Task2();
        Task3 sortByNumberOfCharacterInTokens = new Task3();
        trainingIO.printing("Initial string: \n" + string);
        boolean processing = true;
        while (processing) {
            int choice;
            trainingIO.printing("To sort paragraphs by number of sentences enter 1. To sort verbs by length in the sentences enter 2. To sort tokens in a sentence by the number of occurrences of a given character, enter 3. To exit enter 4. ");
            trainingIO.printing(">>>");
            choice = Integer.parseInt(trainingIO.input());
            switch (choice) {
                case (1) -> sortByNumberOfSentences.sortingByNumberOFSentences(string);
                case (2) -> sortVerbsByLength.sortingSentencesByVerbsLength(string);
                case (3) -> sortByNumberOfCharacterInTokens.sortingByNumberOfCharacterInTokens(string);
                case (4) -> {
                    trainingIO.printing("Exit from the program.");
                    processing = false;
                }
            }
        }
    }

    public void startingPartTwo() {
        String XMLString = "<notes>\n" +
                "\t<note id = \"1\">\n" +
                "\t\t<to>Вася</to>\n" +
                "\t\t<from>Света</from>\n" +
                "\t\t<heading>Напоминание</heading>\n" +
                "\t\t<body>Позвони мне заврта!</body>\n" +
                "\t</note>\n" +
                "\t<note id = \"2\">\n" +
                "\t\t<to>Петя</to>\n" +
                "\t\t<from>Маша</heading>\n" +
                "\t\t<heading>Важное напоминание</heading>\n" +
                "\t\t</body>\n" +
                "\t</note>\n" +
                "</notes>";
        Pattern pattern = Pattern.compile(".+\n|.+$");
        Matcher matcher = pattern.matcher(XMLString);
        String str;
        AnalyzerOFTheText analyzerOFTheText = new AnalyzerOFTheText();
        while (matcher.find()) {
            str = matcher.group().trim();
            trainingIO.printing(str);
            analyzerOFTheText.analysisOfTheText(str);
            trainingIO.printing("-------------------------------------------------------------------------------");
        }
    }
}


