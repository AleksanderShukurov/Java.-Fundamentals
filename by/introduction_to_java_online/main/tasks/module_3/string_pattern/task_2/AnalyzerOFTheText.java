package by.introduction_to_java_online.main.tasks.module_3.string_pattern.task_2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
Условие:
Дана строка, содержащая следующий текст (xml-документ):
<notes>
	<note id = "1">
		<to>Вася</to>
		<from>Света</from>
		<heading>Напоминание</heading>
		<body>Позвони мне заврта!</body>
	</note>
	<note id = "2">
		<to>Петя</to>
		<from>Маша</heading>
		<heading>Важное напоминание</heading>
		</body>
	</note>
</notes>
Напишите анализатор, позволяющий последовательно возвращать содержимое узлов xml-документа и его тип(открывающий тег,
закрывающий тег, содержимое тега, тег без тела). Пользоваться готовыми парсерами XML для решения данной задачи нельзя.
 */

public class AnalyzerOFTheText {
    public void analysisOfTheText(String XMLString) {
        Pattern patternFirst = Pattern.compile("^<\\w+>$");
        Pattern patternSecond = Pattern.compile("^</\\w+>$");
        Pattern patternThird = Pattern.compile("(<\\w+>)(.+)(</\\w+>)");
        Pattern patternFourth = Pattern.compile("(<\\w+)\\s+(\\w+)\\s+\\W\\s+(\".+\">)");
        Pattern patternFifth = Pattern.compile("^</body>");
        Matcher matcherFirst = patternFirst.matcher(XMLString);
        Matcher matcherSecond = patternSecond.matcher(XMLString);
        Matcher matcherThird = patternThird.matcher(XMLString);
        Matcher matcherFourth = patternFourth.matcher(XMLString);
        Matcher matcherFifth = patternFifth.matcher(XMLString);
        if (matcherThird.find()) {
            System.out.print("Opening tag - " + matcherThird.group(1).trim() + "; ");
            System.out.print("tag content - " + matcherThird.group(2).trim() + "; ");
            System.out.println("Closing tag - " + matcherThird.group(3).trim() + ".");
        } else if ((matcherFourth.find())) {
            System.out.print("Opening tag with attribute - " + matcherFourth.group(1).trim() + "; ");
            System.out.print("Name of the attribute - " + matcherFourth.group(2).trim() + "; ");
            System.out.println("Meaning of the attribute - " + matcherFourth.group(3).trim() + ".");
        } else if (matcherFifth.find()) {
            System.out.println("Teg without body - " + matcherFifth.group().trim() + ". ");
        } else if (matcherFirst.find()) {
            System.out.println("Opening tag - " + matcherFirst.group().trim() + ".");
        } else if (matcherSecond.find()) {
            System.out.println("Closing tag - " + matcherSecond.group().trim() + ".");
        }
    }
}
