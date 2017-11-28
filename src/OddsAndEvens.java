import java.util.*;

public class OddsAndEvens {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Let's play a game called \"Odds and Evens\"");
        System.out.println("What is your good name?");
        String name = input.next();
        System.out.println("Hi " + name + ",what do you choose? (O)dds or (E)vens ");
        String choose = input.next();
        String odds = "O";
        String odds1="o";
        String evens = "E";
        String evens1="e";
        if (choose.equals(odds) || choose.equals(odds1)) {
            System.out.println(name + " has picked odds! The computer will be evens.");
        } else if (choose.equals(evens) || choose.equals(evens1)) {
            System.out.println(name + " has picked evens! The computer will be odds.");
        } else {
            System.out.println("Invalid input!");
        }
        System.out.println("---------------------------------------------------------------");


        System.out.println("How many \"finger\" do you put out?");
        int userNumber = input.nextInt();
        Random rand = new Random();
        int computerNumber = rand.nextInt(6);
        System.out.println("The computer plays " + computerNumber + " \"fingers\" ");
        System.out.println("---------------------------------------------------------------");


        int sum = userNumber + computerNumber;
        System.out.println(userNumber + " + " + computerNumber + " =" + sum);
        if (sum % 2 == 0) {
            System.out.println(sum + " is..... even!");
            if (choose.equals(evens) || choose.equals(evens1)) {
                System.out.println(name + " Wins!");
            } else if (choose.equals(odds) || choose.equals(odds1)) {
                System.out.println("Computer Wins!");
            }
        } else if (sum % 2 != 0) {
            System.out.println(sum + " is..... odd!");
            if (choose.equals(odds) || choose.equals(odds1)) {
                System.out.println(name + " Wins!");
            } else if (choose.equals(evens) || choose.equals(evens1)) {
                System.out.println("Computer Wins!");
            }
        }
        System.out.println("---------------------------------------------------------------");

    }
}

