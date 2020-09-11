import java.util.*;

public class OutfitGenerator {

  // The generator properties
  private static final int MAX_TRIES = 1000;
  private String name;
  private int numPieces;
  private ArrayList<Clothing> wardrobe; // all Clothing options to build outfit from

  //// Constructors
  public OutfitGenerator() {
    this("Unnamed outfit", 2);
  }

  public OutfitGenerator(String newName, int newNumbPieces) {
    name = newName;
    numPieces = newNumbPieces;
    wardrobe = new ArrayList<Clothing>(50);
  }

  //// Methods

  public void getNewOutfit() {

    SampleWardrobe sample = new SampleWardrobe();
    wardrobe = sample.getSampleWardrobe();

    Clothing item = getRandomItem(); // get the first item from wardrobe

    // instantiate the outfit and add the first item
    Outfit outfit = new Outfit(name, item.color(), item.season(), item.isFancy(), item.isPlain());
    outfit.add(item);

    // to avoid an endless loop in case a good combination cannot be found
    int safety = 0;
    // loop while outfit is not complete and safety is less than MAX_TRIES
    while (outfit.size() < numPieces && safety < MAX_TRIES) {
      // get random item
      item = getRandomItem();
      String itemType = item.getClass().getName();
      // if item type is not already in outfit
      // and all matches pass then add item to outfit
      if (!outfit.hasType(itemType) && checkMatches(outfit, item)){
        outfit.add(item);
      }
      safety++;
    }

    if(safety < MAX_TRIES) {
      outfit.print();
    } else {
      System.out.println("An outfit could not be found for you. Please try again!");
    }
  }

  private Clothing getRandomItem() {
    Random rand = new Random();
    int index = rand.nextInt(wardrobe.size());
    return wardrobe.get(index);
  }

  private boolean checkMatches(Outfit outfit, Clothing item) {
    return fancyMatches(outfit, item) && plainMatches(outfit, item)
       && colorMatches(outfit, item) && seasonMatches(outfit, item);
  }

  // Check that the outfit and the article of clothing are both "fancy"
  private boolean fancyMatches(Outfit outfit, Clothing garb) {
    return outfit.isFancy() == garb.isFancy();
  }

  // Return true 50% of the time, so there is some possibility of plain and
  // colourful articles to mix
  private boolean plainMatches(Outfit outfit, Clothing garb) {
    return outfit.isPlain() == garb.isPlain();
  }

  private boolean colorMatches(Outfit outfit, Clothing garb) {
    String garbColor = garb.color().toLowerCase();

    if ((outfit.hasGreen() && garbColor.equals("blue"))
       || (outfit.hasBlue() && garbColor.equals("green"))) {
         return false;
       }
    return true;
  }

  // seasonMatches()
  private boolean seasonMatches(Outfit outfit, Clothing garb) {
    String outfitSeason = outfit.season().toLowerCase();
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
