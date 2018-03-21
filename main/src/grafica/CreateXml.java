package grafica;

import catalog.Catalog;

import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.file.Paths;

public class CreateXml {

    public  void write(String path, Catalog catalog) throws Exception{
        XMLEncoder encoder =
                new XMLEncoder(
                        new BufferedOutputStream(
                                new FileOutputStream(String.valueOf(Paths.get(path)))));
        encoder.writeObject(catalog);
        encoder.close();
    }

    public  Object read(String filename) throws Exception {
        XMLDecoder decoder =
                new XMLDecoder(new BufferedInputStream(
                        new FileInputStream(filename)));
        Object o = (Object)decoder.readObject();
        decoder.close();
        return o;
    }
}
