public class BaseResources {
    protected String name;
    protected String obtainDescription;
    protected String analyzeDescription;
    protected String useDescription;
    protected String sellDescription;
    protected String type;
    protected int consumptionPoints = 0;
    protected int sellMoneys = 0;
    public static String[] resourceTypes = {"Scavenged", "Crafted", "Spooned"};
    public static String[] allResources = {
            "Pollen",
            "Rowdy Crude",
            "Silicon",
            "Fruit",
            "Chill Pollens",
            "Soul of Phil Collins",
            "Fractured Soul of Phil Collins",
            "Oil",
            "Samosas",
            "Gun",
            "Spoonerism Machine",
            "Impoliteness",
            "Lighter",
            "Ice"
    };
    public Resources (String name) {
        this.name = name;
        switch(name) {
            case "Pollen":
                this.name = name;
                this.obtainDescription = "You decided to enslave the local bee population. Swathes of pollen appear at your feet!";
                this.analyzeDescription = "Your eyes and nose feel horrendous... but you heard that this stuff tastes real good.";
                this.useDescription = "You sneezed a bunch, but you consumed the Pollen. Your Gluttony is slightly satiated (+3)";
                this.sellDescription = "You sold the Pollen in a bucket. Your Avarice is slightly satiated (+$18)";
                this.type = resourceTypes[0];
                this.consumptionPoints = 3;
                this.sellMoneys = 18;
                break;
        }
    }
}
