/**
 * Created by dsuarez on 6/27/16.
 */
import java.util.Scanner;

public class PrimeFactorsExercise {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        System.out.println("Ingresa un número:");
        int userNumber= userInput.nextInt();

        generate(userNumber);
        
    }

    static void generate(int number){
        System.out.println("Los factores de " + number + " son (es):");
        int primeFactors = 0;

        for (int i = 2; i<=(number); i++) {
            while (number % i == 0) {
                number /= i;
                if (primeFactors !=i ){
                    primeFactors = i;
                    System.out.println(primeFactors);
                }
            }
        }
    }

}
