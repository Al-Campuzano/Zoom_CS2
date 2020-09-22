package data;

import java.util.*;

public class OutfitGenerator {

  // The generator properties
  // MAX_TRIES is set up to prevent a possible endless loop if
  // no outfit can be set up with the given articles of Clothing
  private static final int MAX_TRIES = 1000;
  private String name; // Name for the outfit
  private int numPieces; // Number of pieces the outfit should consist of
  private ArrayList<Clothing> wardrobe; // all Clothing options to build outfit from

  //// Constructors
  public OutfitGenerator() {
    this("Unnamed outfit", 2);
  }

  public OutfitGenerator(String newName, int newNumbPieces) {
    name = newName;
    numPieces = newNumbPieces;
    SampleWardrobe sample = new SampleWardrobe();
    wardrobe = sample.getSampleWardrobe();
  }

  //// Setters
  public void setNumPieces(int newNumbPieces) { numPieces = newNumbPieces; }
  public void setName(String newName) { name = newName; }

  //// Methods
  // creates a new outfit using random pieces from the wardrobe based on some
  // matching criteria
  public void getNewOutfit() {

    Clothing item = getRandomItem(); // get the first item from wardrobe

    // instantiate the outfit and add the first item
    Outfit outfit = new Outfit(name, item.color(), item.season(), item.isFancy(), item.isPlain());
    outfit.add(item);

    // to avoid an endless loop in case a good combination cannot be found
    int safetyCounter = 0;
    // loop while outfit is not complete and safetyCounter is less than MAX_TRIES
    while (outfit.size() < numPieces && safetyCounter < MAX_TRIES) {
      // get random item
      item = getRandomItem();
      String itemType = item.getClass().getName();
      // if item type is not already in outfit
      // and all matches pass then add item to outfit
      if (!outfit.hasType(itemType) && checkMatches(outfit, item)){
        outfit.add(item);
      }
      safetyCounter++;
    }

    // if we have a full suit then print all the items
    // else print a sorry message
    if(outfit.size() == numPieces) {
      outfit.print();
    } else {
      System.out.println("An outfit could not be found for you. Please try again!");
    }
  }

  // gets a random piece of Clothing from wardrobe
  private Clothing getRandomItem() {
    Random rand = new Random();
    int index = rand.nextInt(wardrobe.size());
    return wardrobe.get(index);
  }

  // one method to call all the other "check" methods
  private boolean checkMatches(Outfit outfit, Clothing item) {
    return fancyMatches(outfit, item) && plainMatches(outfit, item)
       && colorMatches(outfit, item) && seasonMatches(outfit, item);
  }

  // Check that the outfit and the article of clothing are both "fancy"
  private boolean fancyMatches(Outfit outfit, Clothing garb) {
    return outfit.isFancy() == garb.isFancy();
  }

  // Check that outfit and new item both match
  // Outfit will switch out its Plain attribute to prevent
  // all plain or all colorful items
  private boolean plainMatches(Outfit outfit, Clothing garb) {
    return outfit.isPlain() == garb.isPlain();
  }

  // reject blue items if the outfit contains green
  // reject green items if the outfit contains blue
  private boolean colorMatches(Outfit outfit, Clothing garb) {
    String garbColor = garb.color().toLowerCase();

    if ((outfit.hasGreen() && garbColor.equals("blue"))
       || (outfit.hasBlue() && garbColor.equals("green"))) {
         return false;
       }
    return true;
  }

  // if either the outfit or the new item are set to be for "all" seasons
  // or if either of them is set to "not summer" and the other to "winter"
  // then the new piece will match the outfit so return true, if not then false
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
