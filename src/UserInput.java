import java.util.Scanner;

public class UserInput {

    public int getInput() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value:");
        return input.nextInt();
    }
}
