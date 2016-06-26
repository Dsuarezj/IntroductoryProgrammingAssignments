/**
 * Created by dsuarez on 6/26/16.
 */

import java.util.Scanner;


public class DrawARightTriangle {

    public static void main(String[] args) {

        String asterisk = "*";
        Scanner userInput = new Scanner(System.in);

        System.out.println("Ingrese n:");

        int numberofAsterisk= userInput.nextInt();

        for (int i = 1; i <= numberofAsterisk; i++) {
            for( int j = 0; j < i; j++ ){
                System.out.print(asterisk);
            }
            System.out.println();

        }
    }
}
