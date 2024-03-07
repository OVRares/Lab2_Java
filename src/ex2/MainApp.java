package ex2;

import java.io.*;

public class MainApp {
    public static void main(String[] args) throws IOException {
        String nume_fis = "src/ex2/cantec_in.txt";
        BufferedReader flux_in;
        flux_in = new BufferedReader(new FileReader(nume_fis));
        int line_nr = 0;
        String line;
        line = flux_in.readLine();
        while (line != null) {
            line_nr++;
            line = flux_in.readLine();
        }
        System.out.println(line_nr);
        flux_in.close();

        Vers[] strofa;
        strofa = new Vers[line_nr];
        flux_in = new BufferedReader(new FileReader(nume_fis));
        PrintStream flux_out;
        flux_out = new PrintStream("src/ex2/cantec_out.txt");

        int j=0;
        line = flux_in.readLine();
        while (line != null) {
            strofa[j] = new Vers(line);
            line = flux_in.readLine();
            j++;

        }
        flux_in.close();

        for (j = 0; j < line_nr; j++)
            flux_out.println(strofa[j].conVowel() + " " + strofa[j].getWordCount() + " " + strofa[j].getVowelCount()
            + " " + strofa[j].addStar());


    }
}
