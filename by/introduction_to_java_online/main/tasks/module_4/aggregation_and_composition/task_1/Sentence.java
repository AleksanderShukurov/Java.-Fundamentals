package by.introduction_to_java_online.main.tasks.module_4.aggregation_and_composition.task_1;

/*
Условие:
Создать объект класса Текст, используя классы Предложение, Слово. Методы: дополнить текст, вывести на консоль текст,
заголовок текста.
 */

public class Sentence {
    private String sentence;

    public String getSentence() {
        return sentence;
    }

    public void setSentence(String sentence) {
        this.sentence = sentence;
    }

    public Sentence() {
    }

    public Sentence(Word[] words) {
        for (int i = 0; i < words.length; i++) {
            if (i == 0) {
                this.sentence = words[i].getWord();
            } else if (i == words.length - 1) {
                this.sentence = this.sentence + " " + words[i].getWord() + ".";
            } else {
                this.sentence = this.sentence + " " + words[i].getWord();
            }
        }

    }
}


