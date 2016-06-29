
public class LineLauncher {

    public static void main(String[] args) {
        doExercise();
    }


    public static void doExercise() {

        Line line = new Line();

        int numberOfAsterisks = 0;
        String direction = "";

        switch (selectExercise()) {
            case 1:
                direction = "horizontal";
                numberOfAsterisks = 1;
                break;
            case 2:
                direction = "vertical";
                numberOfAsterisks = getNumberOfAsterisks();
                break;
            case 3:
                direction = "horizontal";
                numberOfAsterisks = getNumberOfAsterisks();
                break;
        }

        line.drawLine(numberOfAsterisks, direction);

    }

    public static int selectExercise() {

        UserInput exercise = new UserInput();

        System.out.println("Select the exercise: ");
        System.out.println("(1) Easiest exercise ever");
        System.out.println("(2) Vertical Line");
        System.out.println("(3) Horizontal Line");

        int numberOfExercise = exercise.getInput();
        return numberOfExercise;
    }

    public static int getNumberOfAsterisks() {

        UserInput userAsterisk = new UserInput();
        System.out.println("Number of Lines");
        int numberOfAsterisk = userAsterisk.getInput();
        System.out.println();
        return numberOfAsterisk;
    }


}