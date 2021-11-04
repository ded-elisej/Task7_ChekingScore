import java.util.Scanner;

public class ChekingScoreWithCycleIf {
    //in this program a user entering his score at test and check he passed or failed
    public static void main (String [] args){
        System.out.print("Please, enter your score: ");
        int score = new Scanner(System.in).nextInt();
        while (score < 0 || score > 100) {
            System.out.println("Please, check what did you enter and try again:");
            score = new Scanner(System.in).nextInt();

        }
        if (score >= 70 & score <= 100){
            System.out.println("Congrats! you've passed the test.");
        } else if (score >= 0 & score < 70){
            System.out.println("Sorry, you've failed the test.");
        } else System.out.println("Thanks!");
    }
}
