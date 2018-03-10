package documents;

import java.io.Serializable;
import java.nio.file.Path;
import java.util.List;

public abstract class Document implements Serializable{

    public String title;
    public transient String path;
    public String pathList;
    public Integer year;
    public List<String> authors;

    public Document(String title, String path) {
        this.title = title;
        this.path = path;
        this.pathList = path;
    }

    public Document(String title, String path, Integer year, List<String> authors) {
        this.title=title;
        this.path = path;
        this.year = year;
        this.authors = authors;
        this.pathList = path;

    }


    public void setName(String title) {
        this.title = title;
    }

    public void setPath(String path) {
        this.path = path;
        this.pathList = path;
    }
}
