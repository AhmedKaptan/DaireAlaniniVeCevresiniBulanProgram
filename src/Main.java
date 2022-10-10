import  java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a,r;
        double pi=3.14,area;

        Scanner inp = new Scanner(System.in);

        System.out.print("Daire yarı çapını giriniz : ");
        r =inp.nextInt();

        System.out.print("Merkez acisinin olcusunu giriniz = ");
        a = inp.nextInt();

        Double alan = pi * r * r;
        Double cevre = 2 * pi * r;
         area =(pi * (r*r)*a )/360;


        System.out.println("Daire alanı : "+ alan);
        System.out.println("Dairenin cevresi : " + cevre);
        System.out.println("Daire  diliminin alanı : " + area);


    }
}