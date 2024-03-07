package ex2;

public class Vers {
    private String v_linie;
    Vers (String l)
    {
        v_linie = l;
    }

    public int getWordCount()
    {
       String[] s = v_linie.split(" ");
       return s.length;
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
