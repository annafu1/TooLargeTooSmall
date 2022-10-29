import java.util.Scanner;
/**
 * Created by iyasuwatts on 10/17/17.
 */
//create a scanner for input
//create a generator that will randomly choose a number from 1-10
//choose how many guesses they can have
//ask user to guess numbers from 1-5
//loop through the guesses
//take the number and if guess right, print "correct guess"
//else if number too big, print "too large"
//else if number too small, print "too small"
// if the number of guesses is reached, print out no more guesses and say the guess number
public class Main {

    public static void main(String[] args){
       Scanner guessingGame = new Scanner(System.in);
       int generateNumber = (int) (5 * Math.random());
       int guesses = 3;
       int i, guessNumber;
       System.out.println("Choose a number between 1 to 5");
       for (i = 0; i < guesses; i++) {
                   guessNumber = guessingGame.nextInt();
                   if (generateNumber == guessNumber) {
                       System.out.println ("Correct guess");
                   } else if (generateNumber > guessNumber && i != guesses - 1) {
                       System.out.println("Too big");
                   } else if (generateNumber < guessNumber && i != guesses - 1)
                       System.out.println("Too small");
                   }
        if (i == guesses) {
            System.out.println("No more guesses");
            System.out.println("The number was " + generateNumber);
        }
    }
}
