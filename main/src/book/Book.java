package book;
import documents.Document;
import shell.AddCommand;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.time.Year;
import java.util.Arrays;
import java.util.IllegalFormatCodePointException;

public class Book extends Document  {

    public String publisher;

    public Book(String title, String path, Integer year, String authors) {
        super(title, path,year, Arrays.asList(authors));
        FileReader f=null;
        try
        {
            int i;
            f=new FileReader(path);
            if (year>2018) throw  new IllegalArgumentException();
            for ( i=1;i<authors.length()-1;i++) {
                if ( (authors.charAt(i)<'A' || authors.charAt(i)>'Z') && (authors.charAt(i)<'a' || authors.charAt(i)>'z') && authors.charAt(i)!=' ' && authors.charAt(i)!='.')
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


    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getPublisher() {

        return publisher;
    }


}
