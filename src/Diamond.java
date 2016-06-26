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

        for (int i = 0; i < numberofAsterisk; i++) {


            if(i<numberofAsterisk/2)
            {
                for(int k=1;k<numberofAsterisk/2-i;k++)
                {
                    System.out.print(" ");
                }
                for(int j=0;j<=i;j++)
                {
                    System.out.print(asterisk);
                    System.out.print(" ");
                }
                System.out.println();

            }
            if(i>numberofAsterisk/2 )
            {
                for(int k=0;k<i-(numberofAsterisk/2);k++)
                {
                    System.out.print(" ");
                }
                for(int j=0;j<=numberofAsterisk-i-1;j++)
                {
                    System.out.print(asterisk);
                    System.out.print(" ");
                }
                System.out.println();

            }
        }

    }
}
