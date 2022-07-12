package by.introduction_to_java_online.main.tasks.module_5.basics_of_OOP.task_1;

public class TextLogic {
    private TextFile textFile;

    public TextLogic() {
    }

    public TextLogic(TextFile textFile) {
        this.textFile = textFile;
    }

    public TextFile getTextFile() {
        return textFile;
    }

    public void setTextFile(TextFile textFile) {
        this.textFile = textFile;
    }

    public TextFile createTextFile(String name, String content, String directory) {
        textFile = new TextFile(name, content, directory);
        return textFile;
    }

    public void renameTextFile(TextFile textFile) {
        FileInputOutput fileInputOutput = new FileInputOutput();
        textFile.setName(fileInputOutput.inputSomeInformation());
    }

    public TextFile addSomeContent(TextFile textFile, String newContent) {
        textFile.setContent(textFile.getContent() + " " + newContent);
        return textFile;
    }

    public TextFile deleteTextFile(TextFile textFile) {
        FileInputOutput fileInputOutput = new FileInputOutput();
        fileInputOutput.outputSomeInformation("This file is deleted.");
        return null;
    }

}
