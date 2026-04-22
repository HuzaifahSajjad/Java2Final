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
            "Fractured Soul of Phil Collins",
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
                this.consumptionPoints = 3;
                this.sellMoneys = 18;
                break;
            case "Cyber Infrastructure":
                this.name = name;
                this.obtainDescription = "You decided to perform a tailgating attack on a local datacenter (not AI), and murdered the guy you followed in after taking a piece of computer!";
                this.analyzeDescription = "Smells metallic, shines with flashing lights... it won't taste good but you may have other uses for it.";
                this.useDescription = "You ate the Cyber Infrastructure. Tastes... cyber. Your Gluttony is not very satiated (+1)";
                this.sellDescription = "You sold the Cyber Infrastructure to the nearest AI datacenter. Your Avarice is rather satiated! (+$100)";
                this.consumptionPoints = 1;
                this.sellMoneys = 50;
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
        recipes.put(Arrays.asList("Pollen", "Ice"), "Philosopher's Stone");
        recipes.put(Arrays.asList("Samosas", "Philosopher's Stone"), "Elixir of Life");
        recipes.put(Arrays.asList("Cyber Infrastructure", "Elixir of Life"), "Empty Vessel");
        recipes.put(Arrays.asList("Soul of Phil Collins", "Empty Vessel"), "GAME END");
    }
}
