package shell;

import book.Book;
import catalog.Catalog;
import documents.Document;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Shell implements AddCommand,SaveCommand,LoadCommand,ListCommand {
    private Catalog catalog=new Catalog();
    public Shell() {

        int argumentsNumber = 0, i;
        boolean brack = false;
        String[] arguments = new String[200];
        String commandLine = new String();
        arguments[argumentsNumber]=new String();
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            System.out.println("Insert command-");
            try {
                commandLine = new String();
                argumentsNumber=0;
                arguments[argumentsNumber]=new String();

                commandLine = console.readLine();
                for (i = 0; i < commandLine.length(); i++) {
                    if (commandLine.charAt(i) == ' ' && brack == true) {
                        arguments[argumentsNumber] = arguments[argumentsNumber] + commandLine.charAt(i);
                    }
                    if (commandLine.charAt(i) == ' ' && brack == false) {
                        argumentsNumber++;
                        arguments[argumentsNumber]=new String();
                    }
                    if (commandLine.charAt(i) != ' ' && commandLine.charAt(i) != '"') {
                        arguments[argumentsNumber] = arguments[argumentsNumber] + commandLine.charAt(i);
                    }
                    if (commandLine.charAt(i) == '"') {
                        if (brack == false) brack = true;
                        else {
                            brack = false;
                        }


                        }

                }
                argumentsNumber++;
                if (argumentsNumber == 0) throw new IllegalArgumentException();
                if (arguments[0].compareTo("add")!=0 && arguments[0].compareTo("list")!=0 && arguments[0].compareTo("save")!=0 && arguments[0].compareTo("load")!=0) {
                    throw new IllegalArgumentException();
                }
                if (arguments[0].compareTo("add")==0)
                {
                    if (argumentsNumber-1<5) throw new IllegalArgumentException();
                    if (arguments[1].compareTo("book")==0) {
                            int year;
                            year= Integer.valueOf(arguments[4]);
                            Book book=new Book(arguments[2],arguments[3],year,arguments[5]);
                            this.add(book);
                    }
                    if (arguments[1].compareTo("article")==0){
                        int year;
                        year= Integer.valueOf(arguments[4]);
                        Book book=new Book(arguments[2],arguments[3],year,arguments[5]);
                        this.add(book);
                    }

                }
                if (arguments[0].compareTo("save")==0) {
                    if (argumentsNumber!=2) throw new IllegalArgumentException();
                    this.save(arguments[1]);
                }
                if (arguments[0].compareTo("load")==0){
                    if (argumentsNumber!=2) throw new IllegalArgumentException();
                    this.load(arguments[1]);
                }
                if (arguments[0].compareTo("list")==0){
                    if (argumentsNumber!=1) throw new IllegalArgumentException();
                    this.list();
                }


            } catch (IllegalArgumentException I) {
                System.err.println("Invalid  arguments ");
                System.exit(1);
            } catch (IOException E) {
                System.err.println("IO invalid exception");
                System.exit(1);
            }

        }
    }

    @Override
    public void add( Document document) {
        catalog.add(document);

    }

    @Override
    public void save(String path) {
        catalog.save(path);

    }

    @Override
    public void load(String path) {
        catalog.load(path);

    }

    @Override
    public void list() {
        catalog.list();

    }
}
