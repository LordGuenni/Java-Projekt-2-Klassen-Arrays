package com.example;
import java.util.Scanner;
import java.util.Arrays;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args )
    {
        double [] array = new double[10];

        int x;
        x = 0; 

        while(x < 10){;

            Scanner sc = new Scanner(System.in);

            System.out.println("Befüllen Sie Stelle " + x + " des arrays");

            System.out.println("Welche Zahl wollen Sie einfügen ?");

            double b = sc.nextDouble();
   
            array[x] = b;
            x = x + 1;

            if(x == 10){
                sc.close();
            }

        }
        System.out.println(Arrays.toString(array));
        
        // System.out.printf("Zahlenfolge \n" + array[0] + "\n" + array[1] + "\n" + array[2] + "\n"+ array[3] + "\n"+ array[4] + "\n"+ array[5]+  "\n" + array[6] + "\n"+ array[7]+ "\n" + array[8] + "\n"+array[9]);
    }
}
