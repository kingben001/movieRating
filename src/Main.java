import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("What is your age?");
        int age = keyboard.nextInt();

        if (age <= 0){
            System.out.println("Please enter a real age");
        }
        if (age > 0){
            System.out.println("G rated films are appropriate for everyone");
        }
        if (age >= 5){
            System.out.println("PG");
        }
        if (age >= 13){
            System.out.println("PG-13");
        }
        if (age >= 17){
            System.out.println("R");
            System.out.println("Anyone under 17 will not be able to purchase a ticket for a rated R movie without an accompanying adult. ");
        }


    }
}
