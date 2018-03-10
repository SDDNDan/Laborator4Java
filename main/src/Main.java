import article.Article;
import book.Book;
import catalog.Catalog;
import technical.manual.Manual;
import java.nio.file.Paths;


public class Main {
    public static void main(String[] args) {

        Catalog catalog = new Catalog();
        catalog.add (new Book("The Art of Computer Programming", "d:/books/programming/tacp.ps", 1967, "Donald E. Knuth"));
        catalog.add (new Article("Mastering the Game of Go without Human Knowledge", "d:/articles/AlphaGo.pdf", 2017, "David Silver", "Julian Schrittwieser", "Karen Simonyan"));
        catalog.add (new Manual("Cookbook", "d:/stuff/cookbook.doc"));
        catalog.save("C:/Users/Dan/Desktop/catalog.dat");
        Catalog catalog2 = new Catalog();
        catalog2.load("C:/Users/Dan/Desktop/catalog.dat");
        catalog2.list();




    }
}
