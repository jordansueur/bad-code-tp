import java.util.Scanner; // jojo

public class Main {

    public static void play(int max) {
        Scanner input = new Scanner(System.in);
        boolean playAgain = true, found = false;
        int number, maxGuess, minGuess, guess;
        
        while(playAgain==true) {
            maxGuess = max;
            number = (int)(Math.random() * max + 1);
            minGuess = 0;

            while(found==false) {
                guess = -1;
                System.out.println("Enter a number between " + minGuess + " and " + maxGuess);
                do {
                    try {
                        guess = input.nextInt();
                    } catch (Exception e) {
                        System.out.println("Please, only answer with a number");
                        input.next();
                    }
                } while (guess < 0);

                if(guess == number) {
                    System.out.println("You found the number !");
                    found = true;
                } else {
                    if(guess < number) {
                    System.out.println("The number is more than " + guess);
                    minGuess = guess;
                    }

                    else {
                    System.out.println("The number is less than " + guess);
                    maxGuess = guess;
                    }
                    
                    found = false;
                }
            }

            System.out.println("Play again ?");
            if("yes".equals(input.next())) {
                playAgain = true;
            } else {
                playAgain = false;
            }
        }
    }

    public static void main(String[] args) {
        play(99);
    }

}
