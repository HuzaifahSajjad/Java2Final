import java.util.*;
public class AvariceAndGluttony {
    static int gluttony = 0;
    static int money = 0;
    static boolean running = true;

    static ArrayList<Resources> inventory = new ArrayList<>();

    public static void main(String[] args) throws InterruptedException {
        Scanner input = new Scanner(System.in);
        System.out.println("\n!! AVARICE & GLUTTONY !!");
        System.out.println("Type 'lore' if you want to remember the painful reason you started all of this, or anything else to forget your pain:");

        String loreChoice = input.nextLine();

        if (loreChoice.equalsIgnoreCase("lore")) {
            clearScreen();
            Thread.sleep(1000);
            System.out.println("The worst day of your life has occurred.");
            Thread.sleep(2000);
            System.out.println("You don't even want to think about the possibility... that this is real.");
            Thread.sleep(2000);
            System.out.println("That the wonderful, wonderful Phil Collins");
            Thread.sleep(500);
            System.out.println("is no more.");
            System.out.println();
            Thread.sleep(1750);
            System.out.println("There's no point to anything anymore.");
            Thread.sleep(1750);
            System.out.println("Your life means nothing.");
            Thread.sleep(1750);
            System.out.println("Nothing can fill the hole in your heart...");
            Thread.sleep(1000);
            System.out.println("You have ran off into the mountains to cry, but from the heights you notice something.");
            Thread.sleep(1000);
            System.out.println("A town... probably living a sad life, with Phil Collins dead and everything...");
            Thread.sleep(1000);
            System.out.println("You suddenly feel like attacking it and stealing stuff for some reason.");
            Thread.sleep(1000);
            System.out.println("Probably because you don't care anymore.");
            Thread.sleep(1000);
            System.out.println("After all, with Phil Collins dead...");
            Thread.sleep(1000);
            System.out.println("The only thing left for you to do... is satiate your...");
            Thread.sleep(1000);
            System.out.println("!! AVARICE & GLUTTONY !!");
        }

        System.out.println("type start to play");

        while (true) {
            String start = input.nextLine();
            if (start.equalsIgnoreCase("start")) break;
        }

        clearScreen();

        while (running) {
            System.out.println("\n--- THERE MIGHT BE OPTIONS ---");
            System.out.println("1. Scavenge");
            System.out.println("2. Inventory");
            System.out.println("3. Stats");
            System.out.println("4. Quit");

            String choice = input.nextLine();

            switch (choice) {
                case "1":
                    Thread.sleep(500);
                    clearScreen();
                    scavenge();
                    break;
                case "2":
                    Thread.sleep(500);
                    clearScreen();
                    showInventory(input);
                    break;
                case "3":
                    Thread.sleep(500);
                    clearScreen();
                    showStats();
                    break;
                case "4":
                    running = false;
                    clearScreen();
                    System.out.println("Forget everything. Not even money and consumption can help you anymore. Goodbye...");
                    break;
                default:
                    System.out.println("Nuh-uh");
                    Thread.sleep(500);
                    clearScreen();
            }
        }

        input.close();
    }

    static void scavenge() throws InterruptedException {
        String found = Resources.allResources[
                new Random().nextInt(Resources.allResources.length)
                ];

        Resources item = new Resources(found);
        inventory.add(item);

        System.out.println(item.name);
        System.out.println(item.obtainDescription);
    }

    static void showInventory(Scanner input) throws InterruptedException {
        if (inventory.isEmpty()) {
            System.out.println("You used up everything.");
            Thread.sleep(500);
            clearScreen();
            return;
        }

        for (int i = 0; i < inventory.size(); i++) {
            System.out.println((i + 1) + ": " + inventory.get(i).name);
        }

        System.out.println("Pick an item number to interact with, or type back:");
        String choice = input.nextLine();

        if (choice.equalsIgnoreCase("back")) return;

        try {
            int index = Integer.parseInt(choice) - 1;
            Resources item = inventory.get(index);
            clearScreen();
            interactWithItem(item, index);
        } catch (Exception e) {
            System.out.println("You're grasping at air!");
            Thread.sleep(500);
            clearScreen();
        }
    }

    static void interactWithItem(Resources item, int index) throws InterruptedException {
        Scanner input = new Scanner(System.in);

        System.out.println("\n" + item.name);
        System.out.println("1. Analyze");
        System.out.println("2. Consume");
        System.out.println("3. Sell");

        String choice = input.nextLine();

        switch (choice) {
            case "1":
                System.out.println(item.analyzeDescription);
                Thread.sleep(500);
                clearScreen();
                break;
            case "2":
                System.out.println(item.useDescription);
                gluttony += item.consumptionPoints;
                inventory.remove(index);
                Thread.sleep(500);
                clearScreen();
                break;
            case "3":
                System.out.println(item.sellDescription);
                money += item.sellMoneys;
                inventory.remove(index);
                Thread.sleep(500);
                clearScreen();
                break;
            default:
                System.out.println("You blankly stared at your hoard.");
                Thread.sleep(500);
                clearScreen();
        }
    }

    static void showStats() throws InterruptedException {
        Thread.sleep(500);
        clearScreen();
        System.out.println("Gluttony: Satiated by about " + gluttony);
        System.out.println("Avarice: Satiated by $" + money);
    }

    static void clearScreen() {
        for (int i = 0; i < 50; i++) {
            System.out.println();
        }
    }
}
