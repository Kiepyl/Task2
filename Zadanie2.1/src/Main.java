import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int cena = 40;
        double znizka = 1;
        System.out.println("Podaj wiek: ");
        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt();
        System.out.println("Podaj miasto: ");
        String miasto = sc.next();
        System.out.println("Podaj dzien tyg: ");
        String dzien = sc.next();
        if (w < 10) znizka = 0;
        if (w >= 10 && w <=18) znizka -= 0.5;
        if (miasto.equals("warszawa")||miasto.equals("Warszawa")) znizka -= 0.1;
        if (dzien.equals("czwartek")||dzien.equals("Czwartek")) znizka = 0;
        if (znizka < 0) znizka = 0;
        System.out.println("Wiek: " + w + " Miasto: " + miasto + " Dzien tyg: " + dzien);
        System.out.println("Cena biletu po znizkach: " + cena*znizka);
    }
}