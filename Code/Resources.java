import java.util.*;

public class Resources {
    protected String name;
    protected String obtainDescription;
    protected String analyzeDescription;
    protected String useDescription;
    protected String sellDescription;
    protected int consumptionPoints = 0;
    protected int sellMoneys = 0;
    public static String[] scavengeableResources = {
            "Pollen",
            "Cyber Infrastructure",
            "Oil",
            "Gun",
            "Impoliteness",
            "Lighter",
            "Ice",
            "Mr. Potato",
            "BREAD",
            "Fish!",
            "Alphabet Soup"
    };
    public static String[] craftableResources = {
            "Rowdy Crude",
            "Chill Pollens",
            "Soul of Phil Collins",
            "Uncooked Samosas",
            "Samosas",
            "Spoonerism Machine",
            "Philosopher's Stone",
            "Elixir of Life",
            "Empty Vessel",
            "GAME END"
    };
    public Resources (String name) {
        this.name = name;
        switch(name) {
            case "Pollen":
                this.name = name;
                this.obtainDescription = "You decided to enslave the local bee population. Swathes of pollen appear at your feet!";
                this.analyzeDescription = "Your eyes and nose feel horrendous... but you heard that this stuff tastes real good. Not TOO filling though.";
                this.useDescription = "You sneezed a bunch, but you consumed the Pollen. Your Gluttony is kind of satiated (+10)";
                this.sellDescription = "You sold the bucket of Pollen to the black market, knowing someone over there's gonna have a rough time. Your Avarice is slightly satiated (+$18)";
                this.consumptionPoints = 10;
                this.sellMoneys = 18;
                break;
            case "Cyber Infrastructure":
                this.name = name;
                this.obtainDescription = "You decided to perform a tailgating attack on a local datacenter (not AI), and murdered the guy you followed in after taking a piece of computer!";
                this.analyzeDescription = "Smells metallic, shines with flashing lights... you couldn't think of much use for it, but you can sell it.";
                this.useDescription = "You couldn't think of anything to do with the Cyber Infrastructure but eat it. Tastes... cyber. Your Gluttony is not very satiated (+1)";
                this.sellDescription = "You sold the Cyber Infrastructure to the nearest AI datacenter. Your Avarice is VERY satiated! (+$30)";
                this.consumptionPoints = 1;
                this.sellMoneys = 30;
                break;
            case "Oil":
                this.name = name;
                this.obtainDescription = "You decided to monopolize the oil industry! Rockefeller would be proud.";
                this.analyzeDescription = "Black, fluid, smells bad. How crude. A certain country really loves this stuff, though...";
                this.useDescription = "You burned the oil and watched the flames. So pretty... Your gluttony is slightly satiated (+3)";
                this.sellDescription = "You sold five barrels of oil to the United States, but priced them even higher than what their actions marked it up to! Your Avarice is SUPER satiated! (+$600)";
                this.consumptionPoints = 3;
                this.sellMoneys = 600;
                break;
            case "Gun":
                this.name = name;
                this.obtainDescription = "You decided to blackmail the weapons dealer into giving you their most lethal weapon!";
                this.analyzeDescription = "Sleek... only one good use for this.";
                this.useDescription = "You murdered one of the weapons dealers, unrelated to the one you blackmailed. Your Gluttony is VERY satiated! (+50)";
                this.sellDescription = "You sold the gun on the black market. Your Avarice is VERY satiated! (+$300)";
                this.consumptionPoints = 50;
                this.sellMoneys = 300;
                break;
            case "Impoliteness":
                this.name = name;
                this.obtainDescription = "You decided to flip off some random person you never met... with your ring finger for some reason!";
                this.analyzeDescription = "The manifestation of the act of being rude for no reason. Very purple.";
                this.useDescription = "You flipped off the same person from earlier, with your ACTUAL middle finger this time. Felt cathartic. Your Gluttony is VERY satiated! (+50)";
                this.sellDescription = "You flipped off the black market dealer, and they pickpocketed you in turn! Your Avarice is the opposite of satiated. (-$20, yes this can give you anti-money)";
                this.consumptionPoints = 50;
                this.sellMoneys = -20;
                break;
            case "Lighter":
                this.name = name;
                this.obtainDescription = "You decided to loot a chest next to some weird incomplete rectangle made of obsidian. Found a Lighter!";
                this.analyzeDescription = "Can destroy anything with amazing flames.";
                this.useDescription = "You started a forest fire and watched the ecosystem burn. Your Gluttony is VERY satiated! (+50)";
                this.sellDescription = "You sold the Lighter. Nothing noteworthy happened. How sad. Your Avarice is not very satiated (+$2)";
                this.consumptionPoints = 50;
                this.sellMoneys = 2;
                break;
            case "Ice":
                this.name = name;
                this.obtainDescription = "You decided to mine the local glacier with your bare hands, destroying the animals' habitat. Ow...";
                this.analyzeDescription = "A chill chunk of water. Unrelated to the American organization.";
                this.useDescription = "You ground up the ice and ate it. Your Gluttony is slightly satiated (+5)";
                this.sellDescription = "You sold the ice to the nearest AI datacenter. Unfortunately, that's not how they get water so you gave it away for nothing. (+$0)";
                this.consumptionPoints = 5;
                this.sellMoneys = 0;
                break;
            case "Mr. Potato":
                this.name = name;
                this.obtainDescription = "You decided to perform witchcraft on a potato and turn it into a Peppa Pig character! And then you kidnapped him. Obviously.";
                this.analyzeDescription = "He's begging for mercy.";
                this.useDescription = "You ate Mr. Potato. Yum! Your Gluttony is VERY satiated! (+50)";
                this.sellDescription = "You sold Mr. Potato for ransom! Your Avarice is VERY satiated! (+$300)";
                this.consumptionPoints = 50;
                this.sellMoneys = 300;
                break;
            case "BREAD":
                this.name = name;
                this.obtainDescription = "You decided to become an acolyte of Famine, destroying the town's food supply! And it gave you special privilege to said food supply as well!";
                this.analyzeDescription = "The representative of human food.";
                this.useDescription = "You ate the bread. Your Gluttony is SUPER satiated! (+400)";
                this.sellDescription = "You took advantage of the famine you caused and sold the bread for marked up prices! Your Avarice is SUPER satiated! (+$500)";
                this.consumptionPoints = 400;
                this.sellMoneys = 500;
                break;
            case "Fish!":
                this.name = name;
                this.obtainDescription = "You decided to eat gas station sushi, black out, and wake up in a sewer surrounded by fish. You know what that means!";
                this.analyzeDescription = "Seafood special.";
                this.useDescription = "You ate the fish. Raw. Better than the gas station sushi somehow! Your Gluttony is VERY satiated! (+100)";
                this.sellDescription = "You sold the fish in a seafood market. Your Avarice is slightly satiated (+$10)";
                this.consumptionPoints = 70;
                this.sellMoneys = 10;
                break;
            case "Alphabet Soup":
                this.name = name;
                this.obtainDescription = "You decided to break into the supermarket and rob it of the alphabet soup specifically for some reason!";
                this.analyzeDescription = "Can you count the alphabet backwards? Neither can I.";
                this.useDescription = "You drank the Alphabet Soup. It did not help with the reverse counting issue at all but it was good! Your Gluttony is VERY satiated! (+200)";
                this.sellDescription = "You sold the Alphabet Soup to a preschool, then stole an extra $30 afterwards because you're just that evil. Your Avarice is rather satiated (+$45)";
                this.consumptionPoints = 50;
                this.sellMoneys = 15;
                break;
        }
    }
    public static HashMap<List<String>, String> recipes = new HashMap<>();
    static {
        recipes.put(Arrays.asList("Pollen", "Ice"), "Chill Pollens");
        recipes.put(Arrays.asList("Oil", "Impoliteness"), "Rowdy Crude");
        recipes.put(Arrays.asList("Mr. Potato", "BREAD"), "Uncooked Samosas");
        recipes.put(Arrays.asList("Uncooked Samosas", "Lighter"), "Samosas");
        recipes.put(Arrays.asList("Cyber Infrastructure", "Alphabet Soup"), "Spoonerism Machine");
        recipes.put(Arrays.asList("Spoonerism Machine", "Chill Pollens"), "Soul of Phil Collins");
        recipes.put(Arrays.asList("Fractured Soul of Phil Collins", "Fractured Soul of Phil Collins"), "Fractured Soul of Phil Collins");
        recipes.put(Arrays.asList("Fish!", "Gun"), "Philosopher's Stone");
        recipes.put(Arrays.asList("Samosas", "Philosopher's Stone"), "Elixir of Life");
        recipes.put(Arrays.asList("Cyber Infrastructure", "Elixir of Life"), "Empty Vessel");
        recipes.put(Arrays.asList("Soul of Phil Collins", "Empty Vessel"), "GAME END");
    }
}
