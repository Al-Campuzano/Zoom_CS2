import java.util.*;

public class OutfitGenerator {

  // The outfit properties, used to match articles of clothing
  private String name;
  private String color;
  private boolean isFancy;
  private boolean isPlain;
  private boolean forSummer;

  private ArrayList<Clothing> wardrobe; // all Clothing options to build outfit from
  private Map<String, Clothing> outfit; // the built outfit

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
    SampleWardrobe sample = new SampleWardrobe();
    wardrobe = sample.getSampleWardrobe();
    System.out.println("getOutfit method for " + name);
    //System.out.println(wardrobe);
    System.out.println(getRandomItem());
    Clothing item = getRandomItem(); // get the first item from wardrobe
    outfit.put(item.getClass().getName(), item); // put that item in the outfit map
    // loop while outfit is not full
    // get random item
    // if item type is not already in outfit
    // check for matches
    // if all matches pass then add item to outfit
    // print items in outfit
    // done
  }

  // getSampleWardrobe()

  private Clothing getRandomItem() {
    Random rand = new Random();
    int index = rand.nextInt(wardrobe.size());
    return wardrobe.get(index);
  }

  // colorMatches(Clothing garb)

  // fancyMatches()

  // seasonMatches()

  // plainMatches()

}
