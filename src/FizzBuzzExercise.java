public class FizzBuzzExercise {

    public static void main(String[] args) {

        FizzBuzz();

    }

    static void FizzBuzz() {

        int fizzNumber = 3;
        int buzzNumber = 5;

        for (int numberGame = 1; numberGame <= 100; numberGame++) {

            if (numberGame % fizzNumber == 0 && numberGame % buzzNumber == 0)
                System.out.println("FizzBuzz");
            else if (numberGame % fizzNumber == 0)
                System.out.println("Fizz");
            else if (numberGame % buzzNumber == 0)
                System.out.println("Buzz");
            else
                System.out.println(numberGame);

        }

    }


}
