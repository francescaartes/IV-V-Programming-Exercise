/*
    Artes, Francesca Q.
    BSCpE 1-1
    
    This program calcuates the Distance Traveled in each hour of the time period.

	JAVA
*/

import java.util.Scanner;

public class DistanceTraveled {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int speed, time;

        System.out.println("This program calcuates the Distance Traveled in each hour of the time period.");
        System.out.println(" ");
        
        System.out.print("What is the speed of your vehicle in mph? ");
        speed = in.nextInt();

        System.out.print("How many hours did you traveled? ");
        time = in.nextInt();
        
        System.out.println(" ");
        showDistanceTraveled(speed, time);
    }
    private static void showDistanceTraveled(int speed, int time) {
        System.out.println("Hour\t\tDistance Traveled");
        System.out.println("---------------------------------");
        for (int hours = 0; hours < time; hours++) {
            int distance = speed * (hours + 1);
            System.out.println((String.valueOf(hours + 1) + "\t\t" + String.valueOf(distance)));
        }
    }
}