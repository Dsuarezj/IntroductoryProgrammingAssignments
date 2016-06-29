
public class LineLauncher {

    public static void main(String[] args) {
        doExercise();
    }


    public static void doExercise() {

        Line line = new Line();
        UserInput userExercise =new UserInput();
        int numberOfAsterisks = 0;
        String direction = "";

        switch (userExercise.selectExercise(new String[]{"(1) Easiest exercise ever", "(2) Vertical Line", "(3) Horizontal Line"})) {
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


    public static int getNumberOfAsterisks() {

        UserInput userAsterisk = new UserInput();
        System.out.println("Number of Lines");
        int numberOfAsterisk = userAsterisk.getInput();
        System.out.println();
        return numberOfAsterisk;
    }


}