package by.introduction_to_java_online.main.tasks.module_5.basics_of_OOP.task_1;

public class File implements Directory {
    private String name;
    private String content;
    private String path;

    public File() {
    }

    public File(String name, String content, String path) {
        this.name = name;
        this.content = content;
        directory(path);
    }

    public File(String s) {
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    @Override
    public void directory(String path) {
        this.path = path;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        File file = (File) o;

        if (name != null ? !name.equals(file.name) : file.name != null) return false;
        if (content != null ? !content.equals(file.content) : file.content != null) return false;
        return path != null ? path.equals(file.path) : file.path == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (content != null ? content.hashCode() : 0);
        result = 31 * result + (path != null ? path.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "File{" +
                "name='" + name + '\'' +
                ", content='" + content + '\'' +
                ", path='" + path + '\'' +
                '}';
    }
}
