/**
 * Esta clase hija Espresso, hereda los atributos de la clase padre Coffee. Además incluye un atributo propio para este tipo
 * de café, que aloja el número de shots por agregar al café numberOfShots.
 */

public class Espresso extends Coffee {

    // To store the number of serving for this Espresso
    int numberOfShots;

    // Constructor initialized all attributes inherit of coffee and exclusive feature "numberOfShots"
    public Espresso(String name, String roast, double price, int numberOfShots) {

        super(name, roast, price);
        this.numberOfShots = numberOfShots;
    }

    // Sobreescribimos el method grindBeans() y agregamos un mensaje personalizado para la clase.
    @Override
    public void grindBeans() {
        System.out.println("\nThe espresso beans finely");
    }

    // Sobreescribimos el method brewCoffee() y agregamos un mensaje personalizado para la clase.
    @Override
    public void brewCoffee() {
        System.out.println("Brewing the espresso under high pressure...");
    }

    // Sobreescribimos el method printInfo() y agregamos un mensaje personalizado para la clase.
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println(
                "The number of serving is: " + numberOfShots +
                "\nYour " + name + " with a " + roast + " roast." + "Total bill is: " + (price * numberOfShots) + "$.");
    }
}
