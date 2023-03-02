package lesson4;

import java.util.Scanner;

public class DecrFor {
    public static void main(String[] args) {

        int x;

        for (x = 100; x > -100; x-=5) {
            System.out.println(x);
        }

        System.out.println("last x is " + x);

        for (int count = 1; count > 5; count++) {
            System.out.println("WARNING!!! THIS SHOULD NOT BE PRINTED");
        }

        int i,j;

        for (i=0, j=10; i<j; i++, j--) System.out.println("i & j: " + i + " " + j);

        Scanner input = new Scanner(System.in);

//        System.out.println("Guess the symbol to exit.");
//        for (i = 0; input.next().charAt(0) != 'q'; i++)
//            System.out.println("You did not guess, try again! It is your " + (i+2) + " try:");
//        System.out.println("Congrats!");

        int k=0;

        for (; k < 10;){
            System.out.println("Run nr. " + k);
            k++;
        }

        for (; ;){
            System.out.println("Enter q to exit.");
            if (input.next().charAt(0) == 'q') break;
        }

        int a;
        for (a = 0;a < 100; a++);

        System.out.println("a is equal to " + a);

        int factorial = 1;

        for (i = 1; i <=5; factorial *= i++);

        System.out.println("sum is equal to " + factorial);
    }
}
