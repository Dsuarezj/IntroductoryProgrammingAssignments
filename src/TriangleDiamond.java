import java.util.Scanner;

/**
 * Methods used for Triangle and Diamonds Exercises
 */
public class TriangleDiamond {

    public static void main(String[] args) {
        String asterisk = "*";
        Scanner userInput = new Scanner(System.in);

        System.out.println("Ingrese n:");

        int numberOfAsterisk = userInput.nextInt();

        for (int i = 0; i < numberOfAsterisk; i++) {
            for (int k = i; k < numberOfAsterisk; k++) {
                System.out.print(" ");
            }
            Line line = new Line();
            line.drawLine(i + 1, "space");
            System.out.println("");
        }

    }

}
