public class Line {

    public void drawLine(int numberOfAsterisk, String direction) {

        String asterisk = "*";
        for (int i = 0; i < numberOfAsterisk; i++) {
            System.out.print(asterisk);
            if (direction == "vertical")
                System.out.println();
            if (direction == "space")
                System.out.print(" ");

        }
    }
}
