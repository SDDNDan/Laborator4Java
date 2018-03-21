package article;
import documents.Document;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;

public class Article extends Document   {

    String journal;

    public Article(String title, String path,Integer year, String ...authors) {
        super(title, path,year, Arrays.asList(authors));
        try
        {
            int i,j;
            FileReader f=null;
            f=new FileReader(path);
            if (year>2018) throw  new IllegalArgumentException();
            for ( i=0;i<authors.length;i++) {
                for (j=0;j<authors[i].length();j++)
                if ( (authors[i].charAt(j)<'A' || authors[i].charAt(j)>'Z') && (authors[i].charAt(j)<'a' || authors[i].charAt(j)>'z'))
                    throw new IllegalArgumentException();
            }
        }
        catch(FileNotFoundException e)
        {
            System.err.println("The path "+ path + " is invalid");
            System.exit(1);
        }
        catch(IllegalArgumentException e)
        {
            System.err.println("Year or authos  input  is invalid");
            System.exit(1);
        }

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
