/**
 * Created by dsuarez on 6/26/16.
 */


import java.util.Scanner;


public class Diamond {

    public static void main(String[] args) {

        String asterisk = "*";
        Scanner userInput = new Scanner(System.in);

        System.out.println("Ingrese n:");

        int numberofAsterisk= userInput.nextInt();

        for (int i = 1; i <= numberofAsterisk; i++)
        {
            for (int j = 0; j < (numberofAsterisk - i); j++)
                System.out.print(" ");
            for (int j = 1; j <= i; j++)
            {
                System.out.print(asterisk);
                System.out.print(" ");
            }

            System.out.println();


        }

        for (int i = numberofAsterisk - 1; i >= 1; i--)
        {
            for (int j = 0; j < (numberofAsterisk - i); j++)
                System.out.print(" ");
            for (int j = 1; j <= i; j++)
            {
                System.out.print(asterisk);
                System.out.print(" ");
            }

            System.out.println();
        }

        System.out.println();

    }
}
