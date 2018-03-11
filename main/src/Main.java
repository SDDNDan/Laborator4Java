import article.Article;
import book.Book;
import catalog.Catalog;
import shell.Shell;
import technical.manual.Manual;
import java.nio.file.Paths;


public class Main {
    public static void main(String[] args) {


         //Shell shell=new Shell();

        Catalog catalog = new Catalog();
        catalog.add (new Book("The Art of Computer Programming", "E:/facultate/programare avansata/lab4/Files/book.txt", 2019, "Donald E. Knuth"));
        catalog.add (new Article("Mastering the Game of Go without Human Knowledge", "d:/articles/AlphaGo.pdf", 2017, "David Silver", "Julian Schrittwieser", "Karen Simonyan"));
        catalog.add (new Manual("Cookbook", "d:/stuff/cookbook.doc"));
        catalog.save("E:/facultate/programare avansata/lab4/Files/catalog.dat");
        Catalog catalog2 = new Catalog();
        catalog2.load("E:/facultate/programare avansata/lab4/Files/catalog.dat");
        catalog2.list();




    }
}
