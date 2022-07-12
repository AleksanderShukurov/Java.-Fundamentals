package by.introduction_to_java_online.main.tasks.module_4.aggregation_and_composition.task_1;

public class Word {
    private String word;


    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }


    public Word() {
    }

    public Word(String... word) {
        for (String s : word) {
            this.word = s;
        }
    }

}
