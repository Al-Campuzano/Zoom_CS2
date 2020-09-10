import java.util.*;

public class OutfitGenerator {

  // The outfit properties, used to match articles of clothing
  private String name;
  private String color;
  private boolean isFancy;
  private boolean isPlain;
  private boolean isForWinter;
  private int numPieces;

  private ArrayList<Clothing> wardrobe; // all Clothing options to build outfit from
  private Map<String, Clothing> outfit; // the built outfit

  //// Constructors
  public OutfitGenerator() {
    this("Unnamed outfit", 2);
  }
  public OutfitGenerator(String newName, int newNumbPieces) {
    name = newName;
    numPieces = newNumbPieces;
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

    Clothing item = getRandomItem(); // get the first item from wardrobe
    System.out.println(item);
    String itemType = item.getClass().getName();
    outfit.put(itemType, item); // put that item in the outfit map

    // set the outfit's attributes so we can compare them to the other
    // pieces to be added
    color = item.color();
    isFancy = item.isFancy();
    isPlain = item.isPlain();
    isForWinter = item.isForWinter();

int safety = 0; // to avoid an endless loop
    // loop while outfit is not complete
    while (outfit.size() < numPieces && safety < 100) {
      // get random item
      item = getRandomItem();
      itemType = item.getClass().getName();
      // if item type is not already in outfit
      if (!outfit.containsKey(itemType) && plainMatches(item) && fancyMatches(item)
         && colorMatches(item) && seasonMatches(item)){
        // check for matches
        // if all matches pass then add item to outfit
        System.out.println(item);
        outfit.put(itemType, item);
      }
      //System.out.println(outfit.keySet());

      safety++;
    }
System.out.println(outfit);
System.out.println(safety);


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
  private boolean colorMatches(Clothing garb) {
    if ((color.toLowerCase() == "green" && garb.color().toLowerCase() == "blue")
       || (color.toLowerCase() == "blue" && garb.color().toLowerCase() == "green")) {
         return false;
       }
    return true;
  }

  // fancyMatches()
  private boolean fancyMatches(Clothing garb) {
    return isFancy == garb.isFancy();
  }

  // seasonMatches()
  private boolean seasonMatches(Clothing garb) {
    return isForWinter == garb.isForWinter();
  }
  // plainMatches()
  private boolean plainMatches(Clothing garb) {
    Random rand = new Random();
    return rand.nextInt(2) == 1;
  }

}
