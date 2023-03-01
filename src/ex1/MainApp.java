package ex1;


import java.util.Scanner;

class Dreptunghi
{
    int lungime;
    int latime;
    public Dreptunghi(int lungime, int latime)
    {
        this.lungime = lungime;
        this.latime = latime;
    }

    public int area()
    {
        int area = 0;

        area = this.lungime * this.latime;
        return area;
    }

    public int perimeter()
    {
        int perimeter = 0;
        perimeter = 2 * (this.lungime + this.latime);
        return perimeter;
    }
}

public class MainApp
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Dati lungimea dreptunghiului");
        int lungime = scanner.nextInt();

        System.out.println("Dati latimea dreptunghiului");
        int latime = scanner.nextInt();

        Dreptunghi dreptunghi = new Dreptunghi(lungime, latime);

        System.out.println("aria: " + dreptunghi.area());
        System.out.println("perimetru: " + dreptunghi.perimeter());
    }
}
