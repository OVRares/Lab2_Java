package ex1;
import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) throws IOException {
        String nume_fis="src/ex1/judete_in.txt";
        BufferedReader flux_in;
        flux_in = new BufferedReader(new FileReader(nume_fis));

        int line_nr = 0;
        String[] array = new String[42];
        String linie = flux_in.readLine();
        while (linie != null)
        {
            array[line_nr] = linie;
            line_nr++;
            linie = flux_in.readLine();
        }

        for (int i=0; i< line_nr; i++)
            System.out.println(array[i]);

        Arrays.sort(array);
        System.out.println("");
        for (int i=0; i< line_nr; i++)
            System.out.println(array[i]);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Judetul cautat este: ");
        String name = scanner.nextLine();

        System.out.println(name + " se afla pe pozitia " + (1 + Arrays.binarySearch(array,name)));


    }
}
