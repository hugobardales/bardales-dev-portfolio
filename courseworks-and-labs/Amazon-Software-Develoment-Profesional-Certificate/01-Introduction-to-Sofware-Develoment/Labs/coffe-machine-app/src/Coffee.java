/**
 * Esta clase Coffee es la súper clase o llamado también clase padre de tipo abstracto que heredaràn la clase 'Latte' y
 * la clase 'Espresso'.
 * Está diseñada para encapsular todos los atributos y comportamientos comunes a las variantes de cafe mencionadas.
 */

public class Coffee {
    String name;            // "Espresso", "Late", "Mocha"
    String roast;           // "Light", "Medium", "Dark"
    int caffeineLevelInMg;  // calculating on base the roast
    double price;           // In dollars for example

    // Initializing Constructor
    public Coffee(String name, String roast, double price) {
        this.name = name;
        this.roast = roast;
        this.price = price;

        // The constructor calls the method to set the caffeine level based on the roast
        setCaffeineLevel();
    }

    //Method to set the caffeine level of the coffee based on the roast
    public void setCaffeineLevel() {
        if (roast.equalsIgnoreCase("Light")) {
            caffeineLevelInMg = 50;
        } else if (roast.equalsIgnoreCase("medium")) {
            caffeineLevelInMg = 100;
        } else if (roast.equalsIgnoreCase("Dark")) {
            caffeineLevelInMg = 150;
        } else {
            caffeineLevelInMg = 0;
        }
    }

    // Methods to simulation coffee preparation
    public void grindBeans() {
        System.out.println("\nGrinding beans for " + name + "...");
    }

    // Method to simulation brew
    public  void brewCoffee() {
        System.out.println("\nBrewing your favorite " + name + "...");
    }

    // Method to print information about the coffee
    public void printInfo() {
        System.out.println("\nYou ordered a " + name + " with a " + roast + " roast.");
        System.out.println("The caffeine level in your coffee is " + caffeineLevelInMg + " mg.");
    }
}
