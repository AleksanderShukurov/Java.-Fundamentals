package by.introduction_to_java_online.main.tasks.module_5.basics_of_OOP.task_1;


public class TextFile extends File {
    private final String TYPE = ".TXT";

    public TextFile() {
    }

    public TextFile(String name, String content, String fileDirectory) {
        super(name, content, fileDirectory);
    }

    public String getTYPE() {
        return TYPE;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        TextFile file = (TextFile) o;

        return TYPE != null ? TYPE.equals(file.TYPE) : file.TYPE == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (TYPE != null ? TYPE.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "TextFile{" +
                "TYPE='" + TYPE + '\'' +
                '}';
    }
}
