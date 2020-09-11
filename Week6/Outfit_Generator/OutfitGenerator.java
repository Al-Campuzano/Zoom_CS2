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
    outfit.clear(); // clear old outfit (if any) before making a new one
    SampleWardrobe sample = new SampleWardrobe();
    wardrobe = sample.getSampleWardrobe();
    System.out.println(name + " Outfit:");

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

    // to avoid an endless loop in case a good combination cannot be found
    int safety = 0;
    // loop while outfit is not complete
    while (outfit.size() < numPieces && safety < 500) {
      // get random item
      item = getRandomItem();
      itemType = item.getClass().getName();
      // if item type is not already in outfit
      // and all matches pass then add item to outfit
      if (!outfit.containsKey(itemType) && checkMatches(item)){
        System.out.println(item);
        outfit.put(itemType, item);
      }
      safety++;
    }
System.out.println(safety);


    // print items in outfit
  }

  private Clothing getRandomItem() {
    Random rand = new Random();
    int index = rand.nextInt(wardrobe.size());
    return wardrobe.get(index);
  }

  private boolean checkMatches(Clothing item) {
    return seasonMatches(item) && plainMatches(item)
        && fancyMatches(item) && colorMatches(item);
  }

  private boolean colorMatches(Clothing garb) {
    String outfitColor = color.toLowerCase();
    String garbColor = garb.color().toLowerCase();
    if ((outfitColor == "green" && garbColor == "blue")
       || (outfitColor == "blue" && garbColor == "green")) {
         System.out.println("GREEN AND BLUE");
         return false;
       }
    return true;
  }

  // Check that the outfit and the article of clothing are both "fancy"
  private boolean fancyMatches(Clothing garb) {
    return isFancy == garb.isFancy();
  }

  // seasonMatches()
  private boolean seasonMatches(Clothing garb) {
    return isForWinter == garb.isForWinter();
  }
  // Return true 50% of the time, so there is some possibility of plain and
  // colourful articles to mix
  private boolean plainMatches(Clothing garb) {
    Random rand = new Random();
    return rand.nextInt(2) == 1;
  }

}
