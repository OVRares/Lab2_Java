package ex2;

import java.util.Locale;

public class Vers {
    private final String v_linie;
    Vers (String l)
    {
        this.v_linie = l;
    }

    public int getWordCount()
    {
       String[] s = v_linie.split(" ");
       return s.length;
    }


    public String addStar()
    {
        if (v_linie.endsWith("en"))
            return "*";
        else
            return "";
    }

    public String conVowel()
    {
        int rnd = (int)(Math.random() +1);
        if (rnd < 0.1)
            return v_linie.toUpperCase(Locale.ROOT);
        else
            return v_linie;

    }

    public int getVowelCount()
    {
        int count = 0;
        for (int i=0;i<v_linie.length(); i++)
            if (v_linie.charAt(i) == 'a' || v_linie.charAt(i) == 'i' ||
                    v_linie.charAt(i) == 'u' || v_linie.charAt(i) == 'e' || v_linie.charAt(i) == 'o')
                count++;
        else
            if (v_linie.charAt(i) == 'A' || v_linie.charAt(i) == 'I' ||
                    v_linie.charAt(i) == 'U' || v_linie.charAt(i) == 'E' || v_linie.charAt(i) == 'O')
                count++;
        return count;




    }




}
