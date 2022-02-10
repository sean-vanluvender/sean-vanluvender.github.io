import java.util.Scanner;

public class mySavings {
    public static void main(String [] args) {

        Scanner in = new Scanner(System.in);
        piggyBank get = new piggyBank();

        boolean forever = true;
        System.out.println("1. Show total in bank.\n2. Add a penny.\n3. Add a nickel.\n4. Add a dime.\n5. Add a quarter.\n6. Take money out of the bank.\nEnter 0 to quit.");
        while (forever == true) {
            System.out.print("INPUT: ");
            int choice = in.nextInt();

            if (choice == 1) {
                System.out.println("You have " + get + " in your bank.\n");
            }else if (choice == 2) {
                get.addPenny();
            }else if (choice == 3) {
                get.addNickel();
            }else if (choice == 4) {
                get.addDime();
            }else if (choice == 5) {
                get.addQuarter();
            }else if (choice == 6) {
                get.resetMoney();
            }else if (choice == 0) {
                System.out.println("Have a nice day!");
                System.exit(0);
            }else{
                System.out.println("Invalid input, try again.\n");
            }
        }
    }
}