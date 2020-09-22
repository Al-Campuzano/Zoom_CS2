package data;

import java.util.*;

public class Outfit {

  // The outfit properties, used to match articles of clothing
  private String _name;
  private String _color;
  private String _season;
  private boolean _isFancy;
  private boolean _isPlain;
  private boolean _hasGreen;
  private boolean _hasBlue;

  private Map<String, Clothing> pieces; // the built outfit

  //// Constructor
  public Outfit(String name, String color, String season, boolean isFancy,
         boolean isPlain) {
          _name = name;
          _color = color;
          _season = season;
          _isFancy = isFancy;
          _isPlain = isPlain;
          if (color.toLowerCase().equals("green")) {
            _hasGreen = true;
          } else {
            _hasGreen = false;
          }
          if (color.toLowerCase().equals("blue")) {
            _hasBlue = true;
          } else {
            _hasBlue = false;
          }
          pieces = new HashMap<String, Clothing>();
        }

  //// Getters
  public String season() { return _season; }
  public boolean isFancy() { return _isFancy; }
  public boolean isPlain() { return _isPlain; }
  public boolean hasBlue() { return _hasBlue; }
  public boolean hasGreen() { return _hasGreen; }
  public int size() { return pieces.size(); }
  public boolean hasType(String type) {
    return pieces.containsKey(type);
  }

  //// Methods
  // add a piece of Clothing to the outfit HashMap
  public void add(Clothing item) {
    String itemType = item.getClass().getName();
    pieces.put(itemType, item);
    updateOutfit(item);
  }

  // Makes updates to the outfit attributes so matches can be
  // made more effectively. The passed in "item" is the new piece
  // that has been added to the outfit
  private void updateOutfit(Clothing item) {
    // if the outfit is set to be the same plain or colorful as
    // the new item then change the outfit attribute
    // Done to prevent all plain or all colorful pieces
    if (_isPlain == item.isPlain()) {
      _isPlain = !_isPlain;
    }
    // if the outfit is set to be for all seasons when a new item is added
    // then update the season attribute. In case the new item being added is
    // more restrictive
    if (_season.toLowerCase().equals("all")) {
      _season = item.season();
    }
    // update the hasGreen and/or hasBlue attributes if the new item is
    // one of those colors. This to prevent blue and green together in the outfit
    if (item.color().toLowerCase().equals("green")) {
      _hasGreen = true;
    } else if (item.color().toLowerCase().equals("blue")) {
      _hasBlue = true;
    }
  }

  // Prints all the items in the outfit
  public void print() {
    System.out.println(_name + " outfit:");
    Collection<Clothing> vals = pieces.values();
    vals.forEach(System.out::println);
  }

}
