package ex3;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        int div = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("nr= ");
        int nr = scan.nextInt();

        for(int i=2;i<=nr/2;i++)
        {
            if(nr%i==0)
            {
                div++;
                System.out.println(i);
            }
        }
        if(div==0)
            System.out.println("Nr prim");
    }
}
