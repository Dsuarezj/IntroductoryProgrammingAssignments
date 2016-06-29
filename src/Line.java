/**
 * Methods used for Triangle Exercises
 */
public class Line {

    public void drawLine(int numberOfAsterisk, String direction,String character) {

        for (int i = 0; i < numberOfAsterisk; i++) {
            System.out.print(character);
            if (direction == "vertical")
                System.out.println();
            if (direction == "space")
                System.out.print(" ");
        }
    }
}
