package HW;

import java.util.Scanner;

public class Sound {
    public static void main(String[] args) {

        double echoTime;
        double lightningTime;

        Scanner input = new Scanner(System.in);

        System.out.println("Сколько времени в секундах прошло между вспышкой молнии и ударом грома?");
        lightningTime = input.nextDouble();

        System.out.println("Сколько времени в секундах прошло до того, как Вы услышали эхо?");
        echoTime = input.nextDouble();

        double lightningDist = 343 * lightningTime ;

        double objectDist = 343 * echoTime/2.0 ;

        System.out.println("Расстояние до места удара молнии составляет " + lightningDist + " метров");
        System.out.println("Расстояние до объекта составляет " + objectDist + " метров");
    }
}
