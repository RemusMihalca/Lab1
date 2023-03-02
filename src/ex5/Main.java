package ex5;

import java.util.Random;

public class Main
{
    public static void main(String[] args)
    {
        Random random = new Random();
        int n = random.nextInt(21);

        System.out.println("nr generat = " + n);

        int a = 0;
        int b = 1;
        int tmp = 0;

        while (b < n)
        {
            tmp = a;
            a = b;
            b = tmp + b;
        }

        if (b == n)
            System.out.println("apartine sirului Fibonacci");
        else
            System.out.println("NU apartine sirului");
    }
}

