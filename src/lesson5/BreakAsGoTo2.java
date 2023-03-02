package lesson5;

public class BreakAsGoTo2 {
    public static void main(String[] args) {


          for(int i=1; i<13; i++) {
              System.out.println(i + " month ");

              for (int j=1; j<5; j++) {

                  System.out.println(j + " week ");

                  for (int k=1; k<8; k++) {
                      System.out.println(k + " day ");
//                      if (k == 1) break;
                  }
                  System.out.println("After loop with counter k");
              }
              System.out.println("After loop with counter j");
          }
          System.out.println("After loop with counter i");
    }
}
