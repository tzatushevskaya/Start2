package lesson4;

import java.util.Scanner;

public class GuessUpd {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        char ch;
        char answer = 'S';

        System.out.println("The letter you should guess is in the range from A to Z.");
        System.out.println("Try to guess it:");

        ch = input.next().charAt(0);

        System.out.println("This is your result: ");
        if (ch == answer) System.out.println("You won!");
        else {
            System.out.print("Sorry, but the necessary letter is closer to the ");
            if (ch < answer) System.out.println("end of alphabet.");
            else System.out.println("beginning of alphabet.");
        }
    }
}
