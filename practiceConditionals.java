
import java.util.Scanner;
import java.util.Random;
public class practiceConditionals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random ran = new Random();

        System.out.print("Enter number of matches you want to play:");
        int match = sc.nextInt();
        System.out.println(" ");
        int userWin = 0;
        int compWin = 0;
        while(match > 0){
            match -= 1;
            System.out.println("Pick your choice from the following:");
            System.out.println("Stone -> 1");
            System.out.println("Paper -> 2");
            System.out.println("Scissor -> 3");
            int userChoice = sc.nextInt();

            switch (userChoice){
                case 1 -> System.out.println("you have chosen Stone");
                case 2 -> System.out.println("you have chosen Paper");
                case 3 -> System.out.println("you have chosen Scissor");
            }

            int compChoice = ran.nextInt(1,4);
            switch (compChoice){
                case 1 -> System.out.println("Computer have chosen Stone");
                case 2 -> System.out.println("Computer have chosen Paper");
                case 3 -> System.out.println("Computer have chosen Scissor");
            }

            if(userChoice == compChoice){
                System.out.println("Match drawn");
            } else if (userChoice == 1 && compChoice == 2) {
                System.out.println(" ");
                System.out.println("Computer has Won");
                System.out.println(" ");
                compWin += 1;
            } else if (userChoice == 1 && compChoice == 3) {
                System.out.println(" ");
                System.out.println("You have Won");
                System.out.println(" ");
                userWin += 1;
            } else if (userChoice == 2 && compChoice == 1) {
                System.out.println(" ");
                System.out.println("You have Won");
                System.out.println(" ");
                userWin += 1;
            } else if (userChoice == 2 && compChoice == 3) {
                System.out.println(" ");
                System.out.println("Computer has Won");
                System.out.println(" ");
                compWin += 1;
            } else if (userChoice == 3 && compChoice == 2) {
                System.out.println(" ");
                System.out.println("You have Won");
                System.out.println(" ");
                userWin += 1;
            } else if (userChoice == 3 && compChoice == 1) {
                System.out.println(" ");
                System.out.println("Computer has Won");
                System.out.println(" ");
                compWin += 1;
            }

        }
        System.out.println("Score:");
        System.out.println("You - Computer");
        System.out.printf(" %d  -  %d", userWin, compWin);
    }
}
