/**
 *  Esta clase hija Latte, hereda los atributos de la clase padre. Además incluye dos atributos propios de este tipo de café
 *  milkType y syrupFlavor.
 */
public class Latte extends Coffee {
    //To store the kind of milk used in the latte
    String milkType;
    // To store the syrup flavor to be added on the latte
    String syrupFlavor;

    // Inicializando el constructor
    public Latte(String name, String roast, double price, String milkType, String syrupFlavor) {
        super(name, roast, price);

        this.milkType = milkType;
        this.syrupFlavor = syrupFlavor;
    }

    // Sobreescribimos el method grindBeans() y agregamos un mensaje personalizado para la clase.
    @Override
    public void grindBeans() {
        super.grindBeans();
        System.out.println("Grinding coffee beans coarsely for a latte (medium grind)");
    }

    // Sobreescribimos el method brewCoffee() y agregamos un mensaje personalizado para la clase.
    @Override
    public void brewCoffee() {
        super.brewCoffee();
        if (!(syrupFlavor.equals("no"))) {
            System.out.println("Adding " + syrupFlavor + "syrup to the cup");
        }
        System.out.println("\nSteaming " + milkType + "milk...");
        System.out.println("combine coffee with steamed milk, and...");
        System.out.println("Adding a layer of foam.");

    }

    // Sobreescribimos el method printInfo() y agregamos un mensaje personalizado para la clase.
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Your latte has whole " + milkType + " and " + syrupFlavor + ".");
        System.out.println("Your total bill is " + price + ".");
    }
}
