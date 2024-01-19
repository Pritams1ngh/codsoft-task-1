import java.util.*;

class NumberGame {
    public static void main(String[] args) {
        System.out.println("--------------------NumberGame------------------");
        Scanner sc = new Scanner(System.in);
        Random a = new Random();
        int b = a.nextInt(101);
        System.out.println("Guess the Generated number. You only have 10 attempts");
        int i = 1;
        do {
            System.out.println("Guess a number between 1 to 100. Guess Number " + i);
            int guess = sc.nextInt();
            if (guess == b) {
                System.out.println("Congratulations!! Your guess is correct\nYou have won the Game");
                break;
            }

            if (guess > b) {
                System.out.println("Your guess is higher");
            }

            if (guess < b) {
                System.out.println("Your guess is lower");
            }
            i++;

            if (i > 10) {
                System.out.println("Commiserations. Your chances are over. The correct guess was " + b);
            }

        } while (i <= 10);

    }
}