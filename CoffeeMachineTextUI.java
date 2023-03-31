import java.util.Scanner;
public class CoffeeMachineTextUI {
    enum Coffee { ESPRESSO, LATTE, CAPPUCCINO };
    CoffeeMachine machine = new CoffeeMachine(400, 540, 120, 9, 550);

    Scanner scanner = new Scanner(System.in);
    
    public boolean execute(String action) {
        boolean done = false;
        switch (action) {
            case "buy" -> doBuyCoffee();
            case "fill" -> doFilling();
            case "take" -> doTakeMoney();
            case "remaining" -> printState();
            case "exit" -> {
                done = true;
            }
            default -> {
            }
            // do nothing
        }
        return done;
    }
    public void doTakeMoney() {
        System.out.println("I gave you $" + machine.cash);
        machine.cash = 0;
    }
    public void doFilling() {
        System.out.println("Write how many ml of water you want to add:");
        int addedWater = scanner.nextInt();
        machine.water += addedWater;

        System.out.println("Write how many ml of milk you want to add:");
        int addedMilk = scanner.nextInt();
        machine.milk += addedMilk;

        System.out.println("Write how many grams of coffee beans you want to add:");
        int addedBeans = scanner.nextInt();
        machine.beans += addedBeans;

        System.out.println("Write how many disposable cups you want to add:");
        int addedCups = scanner.nextInt();
        machine.cups += addedCups;
    }

    public void doBuyCoffee() {
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
        String option = scanner.next();
        if (option.equals("back")) {
            // go back to main
        } else {
            int coffeeType = Integer.parseInt(option);
            Coffee coffee = Coffee.values()[coffeeType - 1];

            switch (coffee) {
                case ESPRESSO -> machine.makeEspresso();

                case LATTE -> machine.makeLatte();
                
                case CAPPUCCINO -> machine.makeCappuccino();
                
                default -> {
                }
                // do nothing
            }
        }
    }

    public void printState() {
        System.out.println("\nThe coffee machine has:");
        System.out.printf("%d ml of water\n", machine.water);
        System.out.printf("%d ml of milk\n", machine.milk);
        System.out.printf("%d g of coffee beans%n", machine.beans);
        System.out.printf("%d disposable cups%n", machine.cups);
        System.out.printf("$%d of money%n", machine.cash);

    }
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            Gui machine = new Gui(400, 540, 120, 9, 550);
            boolean done = false;
            do {
                System.out.println("\nWrite action (buy, fill, take, remaining, exit): ");
                String action = scanner.next();
                done = machine.execute(action);
            } while (!done);
        }
    }
}
