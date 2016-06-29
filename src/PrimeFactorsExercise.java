public class PrimeFactorsExercise {

    public static void main(String[] args) {
        UserInput userNumber = new UserInput();

        System.out.println("Enter yor number you want to calculate its prime factor");

        generatePrimeFactors(userNumber.getInput());
    }

    static void generatePrimeFactors(int number) {

        for (int i = 2; i <= (number); i++) {
            while (number % i == 0) {
                number /= i;
                System.out.println(i);
            }
        }
    }


}

