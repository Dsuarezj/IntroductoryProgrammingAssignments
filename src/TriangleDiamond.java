public class TriangleDiamond {


    public static void drawDiamondWithName(int numberOfLines) {
        drawTopDiamond(numberOfLines);
        System.out.println("Denisse");
        drawBottomDiamond(numberOfLines);
    }

    public static void drawDiamond(int numberOfLines) {
        Line line = new Line();
        drawTopDiamond(numberOfLines);
        line.drawLine(numberOfLines, "space");
        System.out.println();
        drawBottomDiamond(numberOfLines);
    }

    public static void drawTopDiamond(int numberOfLines) {
        Line line = new Line();

        for (int i = 1; i < numberOfLines; i++) {
            for (int j = 0; j < (numberOfLines - i); j++)
                System.out.print(" ");
            line.drawLine(i, "space");
            System.out.println();
        }
    }

    public static void drawBottomDiamond(int numberOfLines) {
        Line line = new Line();

        for (int i = numberOfLines - 1; i >= 1; i--) {
            for (int j = 0; j < (numberOfLines - i); j++)
                System.out.print(" ");
            line.drawLine(i, "space");
            System.out.println();
        }
    }

    public static void drawIsoscelesTriangle(int numberOfLines) {
        Line line = new Line();

        for (int i = 0; i < numberOfLines; i++) {
            for (int k = i; k < numberOfLines; k++) {
                System.out.print(" ");
            }
            line.drawLine(i + 1, "space");
            System.out.println("");
        }
    }

    public static void drawRightTriangle(int numberOfLines) {

        Line line = new Line();

        for (int i = 1; i <= numberOfLines; i++) {
            line.drawLine(i, "space");
            System.out.println();
        }
    }


}
