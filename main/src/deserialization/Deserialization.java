package deserialization;

import catalog.Catalog;
import documents.Document;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Deserialization {
    Catalog catalog;

    public Deserialization() {
    }

    public Catalog Deserialization(String path) {
        try {
            FileInputStream fileIn = new FileInputStream(String.valueOf(Paths.get(path)));
            ObjectInputStream in = new ObjectInputStream(fileIn);
            this.catalog = (Catalog)in.readObject();
            in.close();
            fileIn.close();
            System.out.println("Deserialized data is done");
            return catalog;
        } catch (IOException i) {
            i.printStackTrace();
            return catalog;
        } catch (ClassNotFoundException c) {
            System.out.println("Catalog class not found");
            c.printStackTrace();
            return catalog;
        }
    }

}
