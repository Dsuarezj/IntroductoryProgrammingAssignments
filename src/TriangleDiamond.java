import java.util.Scanner;

/**
 * Methods used for Triangle and Diamonds Exercises
 */
public class TriangleDiamond {

    public static void main(String[] args) {
     drawDiamond(3);
    }


    public static void drawDiamond(int numberOfLines){
        Line line = new Line();

        for (int i = 1; i <= numberOfLines; i++)
        {
            for (int j = 0; j < (numberOfLines - i); j++)
                System.out.print(" ");
            line.drawLine(i, "space");
            System.out.println();
        }

        for (int i = numberOfLines - 1; i >= 1; i--)
        {
            for (int j = 0; j < (numberOfLines - i); j++)
                System.out.print(" ");
            line.drawLine(i, "space");
            System.out.println();
        }

        System.out.println();
    }


    public static void drawIsoscelesTriangle(int numberOfLines){
        Line line = new Line();

        for (int i = 0; i < numberOfLines; i++) {
            for (int k = i; k < numberOfLines; k++) {
                System.out.print(" ");
            }
            line.drawLine(i + 1, "space");
            System.out.println("");
        }
    }

    public static void drawRightTriangle (int numberOfLines){

        Line line = new Line();

        for (int i = 1; i <= numberOfLines; i++) {
            line.drawLine(i, "space");
            System.out.println();
        }
    }


}
