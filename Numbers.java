

import java.util.Scanner;


public class Numbers {

    public static void main(String[] args) {

        int a, b, c;

        Scanner input = new Scanner(System.in);

        System.out.print("1. Sayıyı Giriniz : ");

        a = input.nextInt();
        ;

        System.out.print("2. Sayıyı Giriniz; ");

        b = input.nextInt();

        System.out.print("3. Sayıyı Giriniz; ");

        c = input.nextInt();

        if ((a > b) && (a > c)) {
            if (b > c) {
                System.out.println("A > B > C ");
            }
            else {
                System.out.println("A > C > B");
            }

        } else if ((b > a) && (b > c)) {

            if (a > c) {
                System.out.println("C > A > C ");
            } else {
                System.out.println("B > C > A");
            }
        } else if ((c > b) && (c > a)) {

            if (a > b) {
                System.out.println("C > B > A ");
            }
            else {System.out.println("C > B > A ");}
        }
    }
}