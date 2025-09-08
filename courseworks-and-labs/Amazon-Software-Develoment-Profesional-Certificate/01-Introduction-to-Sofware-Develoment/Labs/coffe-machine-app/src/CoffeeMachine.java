/**
 * Simula el funcionamiento de una máquina de café virtual.
 *
 * Esta clase gestiona los recursos internos como agua, leche, granos de café y dinero. Permite al usuario interactuar
 * con la máquina para comprar diferentes tipos de café (espresso, latte, cappuccino), reponer los suministros y consultar
 * el estado actual de los recursos.</p>
 */

import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        while(true) {
            System.out.println("\nWelcome to the Coffee Machine!");
            System.out.println("Select an option to continue:");
            System.out.println("1. Espresso");
            System.out.println("2. Latte");
            System.out.println("3. Exit");
            System.out.print("Enter your choice (1, 2, or 3): ");

            int choice = keyboard.nextInt();

            switch (choice) {
                case 1:
                    // Initialize the name of Espresso
                    String espressoName = "Espresso";

                    // Initialize the price of Espresso per serving
                    double espressoPrice = 2.50;

                    // Ask the user for the type of roast and store it in espressoRoast
                    System.out.println("What roast would you like? (light, medium, dark: ");
                    String espressoRoast = keyboard.next();

                    // Ask the user for the number of shots and store it in numberOfShots
                    System.out.println("How many serving would you like? (a number please)");
                    int numberOfShots = keyboard.nextInt();

                    Espresso myEspresso = new Espresso(espressoName, espressoRoast, espressoPrice, numberOfShots);
                    myEspresso.grindBeans();
                    myEspresso.brewCoffee();
                    myEspresso.printInfo();
                    break;

                case 2:
                    String latteName = "Latte";
                    double lattePrice = 3.50;

                    // Ask the user for the type of roast and store it in latteRoast
                    System.out.println("What roast would you like? (light, medium, dark: ");
                    String latteRoast = keyboard.next();

                    // Ask the user for the milk type and store it in milkType
                    System.out.println("What milk type would you like? (whole, skim, almond, oat): ");
                    String milkType = keyboard.next();

                    // Ask the user if they want syrup or not
                    System.out.println("Do your prefer a syrup (yes/ no): ");
                    String syrupInput = keyboard.next();

                    String syrupFlavor = "no";
                    // if syrupWanted is yes, Ask the user for the syrup flavor and store it in syrupFlavor
                    if(syrupInput.equalsIgnoreCase("yes")) {
                        System.out.println("Which flavor would you like? (vanilla, caramel, hazelnut)");
                        syrupFlavor = keyboard.next();
                    }

                    Latte myLatte = new Latte(latteName, latteRoast, lattePrice, milkType, syrupFlavor);
                    myLatte.grindBeans();
                    myLatte.brewCoffee();
                    myLatte.printInfo();
                    break;

                case 3:
                    System.out.println("Thank for use the coffee machine.");
                    return;
                default:
                    System.out.println("Invalid choice. Please enter 1, 2 or 3.");
            }
        }
    }
}
