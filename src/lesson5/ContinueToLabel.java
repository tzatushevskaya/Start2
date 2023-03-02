package lesson5;

public class ContinueToLabel {
    public static void main(String[] args) {

        myNewLabel:
        for (int i = 1; i < 10; i++) {
            System.out.print("\nOuter loop: run  " + i + " , inner loop: ");

            for (int j = 1; j < 10; j++ ) {
                if (j == 5) continue myNewLabel;
                System.out.print(j);
            }
        }

        System.out.println("\ncat\nand\ndog");
        System.out.print("and a bird");



    }

}
