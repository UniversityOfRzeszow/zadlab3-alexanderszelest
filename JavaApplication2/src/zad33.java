/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author xszel
 */
public class zad33 {

    public static int rekurencja(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * rekurencja(n - 1);
        }
    }

    public static int iteracja(int n) {
        int x = 1;
        {
            for (int i = 1; i <= n; i++) {
                x = x * i;
            }
        }
        return x;
    }

    public static void main(String[] args) {
        Scanner odczyt = new Scanner(System.in);
        System.out.println("Podaj liczbe");
        int n = odczyt.nextInt();
        System.out.println("1- Rekurencja 2-Iteracja");
        int wybor = odczyt.nextInt();
        switch (wybor) {
            case 1:
                System.out.println(" rekurencja " + rekurencja(n));
                break;
            case 2:
                System.out.println("iteracja " + iteracja(n));
                break;

        }
