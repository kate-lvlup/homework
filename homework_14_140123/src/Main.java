import java.io.File;
import java.io.IOException;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("********Task1********");
        MethodsImplementation.getDirectoriesFiles("D:\\Katya Level Up\\Level up JAVA\\homework\\homework_14_140123");
        System.out.println("********Task2********");
        MethodsImplementation.createTextFile();
        MethodsImplementation.writeIntoTextFile();
        MethodsImplementation.readTextFile();
        System.out.println("********Task3********");
        MethodsImplementation.countSymbolsAndFiles();
        System.out.println("********Task4********");
        MethodsImplementation.renameFile();
        System.out.println("********Task5********");
        ViceVersa.createFile();
        ViceVersa.printStrings();
        System.out.println("********Task6********");
        MethodsImplementation.newLineTransition();
        System.out.println("********Task7********");
        MethodsImplementation.copyFile();
        System.out.println("********Task8********");
        MethodsImplementation.compareTextFiles();
        MethodsImplementation.compareFiles();
    }
}





