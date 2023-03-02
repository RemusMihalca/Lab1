package ex2;

import java.io.*;

public class Main
{
    public static void main(String[] args) throws IOException
    {
        //String nume_fis = "in.txt";
        //String out_fis = "out.txt";
        BufferedReader flux_in;
        flux_in = new BufferedReader(new InputStreamReader(new FileInputStream( "src/ex2/in.txt")));
        PrintStream flux_out = new PrintStream("src/ex2/out.txt");

        int s, suma = 0, c = 0;
        String linie;
        Float Ma;
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;

        while ((linie = flux_in.readLine()) != null)
        {
            s = Integer.parseInt(linie);
            if (s < min)
                min = s;
            if (s > max)
                max = s;
            c++;
            suma = suma + s;
        }
        Ma = (float)suma / (float)c;
        System.out.println("minimul: " + min + " maximul: " + max + " suma: " + suma + " media aritmetica: " + Ma);
        flux_out.println("minimul: " + min + " maximul: " + max + " suma: " + suma + " media aritmetica: " + Ma);
    }
}
