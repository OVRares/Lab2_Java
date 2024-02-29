package ex1;
import java.io.*;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) throws IOException {
        String nume_fis="src/ex1/judete_in.txt";
        BufferedReader flux_in;
        flux_in = new BufferedReader(new FileReader(nume_fis));

        int line_nr = 0;
        while (flux_in.readLine() != null)
            line_nr++;

        String[] array = new String[line_nr];

        for (int i=0; i< line_nr; i++)
            array[i] = flux_in.readLine();

        for (int i=0; i< line_nr; i++)
            System.out.println(array[i]);


    }
}
