import java.util.*;

public class OutfitGenerator {

  private String name;
  private String color;
  private boolean isFancy;
  private boolean isPlain;
  private boolean forSummer;
  private ArrayList<Clothing> wardrobe;
  private Map<String, Clothing> outfit;

  //// Constructors
  public OutfitGenerator() {
    this("Unnamed outfit");
  }
  public OutfitGenerator(String newName) {
    name = newName;
    wardrobe = new ArrayList<Clothing>(30);
    outfit = new HashMap<String, Clothing>();
  }

  //// Getters

  //// Setters

  //// Methods

  public void getOutfit() {
    System.out.println("getOutfit method for " + name);
  }

  // getRandomItem()

  // colorMatches(Clothing garb)

  // fancyMatches()

  // seasonMatches()

  // plainMatches()

}
