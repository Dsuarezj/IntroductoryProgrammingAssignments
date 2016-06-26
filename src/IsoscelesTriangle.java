/**
 * Created by dsuarez on 6/26/16.
 */

import java.util.Scanner;


public class IsoscelesTriangle {

    public static void main(String[] args) {
        String asterisk = "*";
        Scanner userInput = new Scanner(System.in);

        System.out.println("Ingrese n:");

        int numberofAsterisk= userInput.nextInt();

        for (int i = 0; i < numberofAsterisk; i++) {
            for (int k = i; k < numberofAsterisk; k++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(asterisk);
                System.out.print(" ");
            }
            System.out.println("");
        }


    }
}
