package book;
import documents.Document;

import java.io.Serializable;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class Book extends Document {

    public String publisher;

    public Book(String title, String path, Integer year, String authors) {
        super(title, path,year, Arrays.asList(authors));
    }


    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getPublisher() {

        return publisher;
    }


}
