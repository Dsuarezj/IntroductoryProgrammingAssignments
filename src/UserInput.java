import java.util.Scanner;

public class UserInput {

    public int getInput() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value:");
        return input.nextInt();
    }

    public static int selectExercise(String[] exerciseName) {

        UserInput exercise = new UserInput();
        System.out.println("Select the exercise: ");

        for (int i = 0; i < exerciseName.length; i++) {
            System.out.println(exerciseName[i]);
        }

        int numberOfExercise = exercise.getInput();
        return numberOfExercise;
    }
}
