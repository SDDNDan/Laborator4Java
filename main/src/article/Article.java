package article;
import documents.Document;
import java.util.Arrays;

public class Article extends Document   {

    String journal;

    public Article(String title, String path,Integer year, String ...authors) {
        super(title, path,year, Arrays.asList(authors));
    }

    public void setJournal(String journal) {
        this.journal = journal;
    }

    public String getJournal() {

        return journal;
    }

    public Article(String name, String path) {
        super(name, path);
    }
}
