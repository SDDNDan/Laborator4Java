package serialization;
        import catalog.Catalog;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.nio.file.Paths;

public class Serialization {
    public Serialization(String path, Catalog catalog) {
        try {
            FileOutputStream fileOut = new FileOutputStream(String.valueOf(Paths.get(path)));
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(catalog);
            out.close();
            fileOut.close();
            System.out.printf("Serialized data is saved in "+Paths.get(path));
        } catch (IOException i) {
            i.printStackTrace();
        }
    }


}
