
public class LineLauncher {


    public static void main(String[] args) {
        DoExercise();
    }


    public static void DoExercise() {

        UserInput exercise = new UserInput();
        UserInput userAsterisk = new UserInput();
        Line line = new Line ();

        System.out.println("Select the exercise: ");
        System.out.println("(1) Easiest exercise ever");
        System.out.println("(2) Vertical Line");
        System.out.println("(3) Horizontal Line");

        int numberOfExercise = exercise.getInput();
        int numberOfAsterisk = 0;
        String direction ="";

        switch (numberOfExercise) {
            case 1:
                direction = "horizontal";
                numberOfAsterisk =1;
                break;
            case 2:
                direction = "vertical";
                numberOfAsterisk= getNumberOfAsterisk();
                break;
            case 3:
                direction = "horizontal";
                numberOfAsterisk= getNumberOfAsterisk();
                break;
        }

        line.drawLine(numberOfAsterisk,direction);

    }

    public static int getNumberOfAsterisk(){

        UserInput userAsterisk = new UserInput();
        int numberOfAsterisk = 0;
        System.out.println("Number of Lines");
        System.out.println();
        numberOfAsterisk=userAsterisk.getInput();
        return numberOfAsterisk;


    }


}
