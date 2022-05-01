package yt;

import java.util.Scanner;

public class video1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Isminizi girin:");
        String isim = in.next();
        System.out.println("hosgeldin" + " " + isim);

        int x[] = {100,200,300};
        int []y = new int[100];
        int [][]z = new int[100][20];

        System.out.println(x[2]);
        /*System.out.println(x[20]);
        System.out.println(y[2]);
        System.out.println(z[3][7]);*/

        String str = "Supra";
        int t[] = {100,200,300};
        System.out.println(t.length);
        System.out.println(str);
    }
}
