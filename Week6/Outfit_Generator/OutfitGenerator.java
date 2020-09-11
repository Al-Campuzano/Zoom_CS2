import java.util.*;

public class OutfitGenerator {

  // The outfit properties, used to match articles of clothing
  private String name;
  private String color;
  private String season;
  private boolean isFancy;
  private boolean isPlain;
  private int numPieces;
  private boolean hasGreen;
  private boolean hasBlue;

  private ArrayList<Clothing> wardrobe; // all Clothing options to build outfit from
  private Map<String, Clothing> outfit; // the built outfit

  //// Constructors
  public OutfitGenerator() {
    this("Unnamed outfit", 2);
  }
  public OutfitGenerator(String newName, int newNumbPieces) {
    name = newName;
    numPieces = newNumbPieces;
    hasGreen = false;
    hasBlue = false;
    wardrobe = new ArrayList<Clothing>(30);
    outfit = new HashMap<String, Clothing>();
  }

  //// Getters

  //// Setters

  //// Methods

  public void getNewOutfit() {
    // clear old outfit (if any) before making a new one
    outfit.clear();
    hasGreen = false;
    hasBlue = false;

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
    String outfitColor = color.toLowerCase();
    if (outfitColor.equals("green")) {
      hasGreen = true;
    } else if (outfitColor.equals("blue")) {
      hasBlue = true;
    }
    isFancy = item.isFancy();
    isPlain = item.isPlain();
    season = item.season();

    // to avoid an endless loop in case a good combination cannot be found
    int safety = 0;
    // loop while outfit is not complete
    while (outfit.size() < numPieces && safety < 300) {
      // get random item
      item = getRandomItem();
      itemType = item.getClass().getName();
      // if item type is not already in outfit
      // and all matches pass then add item to outfit
      if (!outfit.containsKey(itemType) && checkMatches(item)){
        System.out.println(item);
        // update the outfit season type to the one from the new garbment
        if (season.toLowerCase().equals("all")) {
          season = item.season();
        }
        if (item.color().toLowerCase().equals("green")) {
          hasGreen = true;
        } else if (item.color().toLowerCase().equals("blue")) {
          hasBlue = true;
        }
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
    return fancyMatches(item) && plainMatches(item)
       && colorMatches(item) && seasonMatches(item);
  }

  // Check that the outfit and the article of clothing are both "fancy"
  private boolean fancyMatches(Clothing garb) {
    return isFancy == garb.isFancy();
  }

  // Return true 50% of the time, so there is some possibility of plain and
  // colourful articles to mix
  private boolean plainMatches(Clothing garb) {
    Random rand = new Random();
    return rand.nextInt(2) == 1;
  }

  private boolean colorMatches(Clothing garb) {
    //String outfitColor = color.toLowerCase();
    String garbColor = garb.color().toLowerCase();

    if ((hasGreen && garbColor.equals("blue"))
       || (hasBlue && garbColor.equals("green"))) {
         System.out.println("GREEN AND BLUE");
         return false;
       }
    return true;
  }

  // seasonMatches()
  private boolean seasonMatches(Clothing garb) {
    String outfitSeason = season.toLowerCase();
    String garbSeason = garb.season().toLowerCase();

    if (outfitSeason.equals("all") || garbSeason.equals("all") || outfitSeason.equals(garbSeason)) {
      return true;
    }

    if ((outfitSeason.equals("not summer") && garbSeason.equals("winter"))
       || (outfitSeason.equals("winter") && garbSeason.equals("not summer"))) {
      return true;
    }

    return false;
  }

}
