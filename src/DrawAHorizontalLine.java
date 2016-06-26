/**
 * Created by dsuarez on 6/26/16.
 */

import java.util.Scanner;

public class DrawAHorizontalLine {

    public static void main(String[] args) {

        String asterisk = "*";
        Scanner userInput = new Scanner(System.in);

        System.out.println("Ingrese n:");

        int numberofAsterisk= userInput.nextInt();

        for (int i = 0; i < numberofAsterisk; i++)
            System.out.print(asterisk);
    }
}
