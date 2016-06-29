
public class TriangleDiamondLauncher {
    public static void main(String[] args) {
        doExercise();
    }


    private static void doExercise() {

        UserInput userExercise = new UserInput();
        TriangleDiamond triangle = new TriangleDiamond();
        TriangleDiamond diamond = new TriangleDiamond();



        int numberOfAsterisks;
        String [] exerciseName = new String[]{"(1) Draw a right triangle", "(2) Draw isosceles triangle", "(3) Draw diamond", "(4) Draw diamond with Name"};


        switch (userExercise.selectExercise(exerciseName)) {
            case 1:
                numberOfAsterisks = getNumberOfAsterisks();
                triangle.drawRightTriangle(numberOfAsterisks);
                break;
            case 2:
                numberOfAsterisks = getNumberOfAsterisks();
                triangle.drawIsoscelesTriangle(numberOfAsterisks);
                break;
            case 3:
                numberOfAsterisks = getNumberOfAsterisks();
                break;
            case 4:
                numberOfAsterisks = getNumberOfAsterisks();
                break;

        }
    }


    public static int getNumberOfAsterisks() {

        UserInput userAsterisk = new UserInput();
        System.out.println("Number of Lines");
        int numberOfAsterisk = userAsterisk.getInput();
        System.out.println();
        return numberOfAsterisk;
    }


}
