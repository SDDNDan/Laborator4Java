package catalog;
import deserialization.Deserialization;
import documents.Document;
import serialization.Serialization;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Catalog implements Serializable{

        public List<Document> documentList = new ArrayList<>();

        public void add(Document document)
        {

            documentList.add(document);
        }
        public void save(String path)
        {
            Serialization serialization;
            serialization = new Serialization(path,this);

        }
        public void load(String path)
        {
            Deserialization deserialization = new Deserialization();
            Catalog catalogAux = deserialization.Deserialization(path);
        this.documentList.clear();
        for(Document i : catalogAux.documentList)
        {
            this.documentList.add(i);
        }


    }
    public void list()
    {
        for(Document i : this.documentList)
        {
            System.out.println("Titlul : "+i.title);
            System.out.println("Pathul : "+i.pathList);
            System.out.println("Anul : "+i.year);
            System.out.println("Autorii : "+i.authors);
            System.out.println();
        }
    }


}
