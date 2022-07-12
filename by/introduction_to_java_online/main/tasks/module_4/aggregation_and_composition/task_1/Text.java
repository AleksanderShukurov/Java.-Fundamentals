package by.introduction_to_java_online.main.tasks.module_4.aggregation_and_composition.task_1;

public class Text {
    private String text;
    private String title;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Text() {
    }

    public Text(Sentence[] sentences, String title) {
        for (int i = 0; i < sentences.length; i++) {
            if (i == 0) {
                this.text = sentences[i].getSentence();
            } else {
                this.text = this.text + " " + sentences[i].getSentence();
            }

        }
        this.title = title;
    }

    @Override
    public String toString() {
        return "text= " + text + ", title='" + title + "'";
    }

    //Метод вывода на консоль текста, заголовок текста.
    public void printingText(Text text) {
        System.out.println("text= " + text.getText() + ", title = '" + text.getTitle() + "'");

    }

    //Метод дополнения текста.
    public void textAdd(String... addedPart) {
        for (int i = 0; i < addedPart.length; i++) {
            if (i == addedPart.length - 1) {
                this.text = this.text + " " + addedPart[i] + ".";
            } else {
                this.text = this.text + " " + addedPart[i];
            }
        }
    }
}
