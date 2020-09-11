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

  //// Methods
  public void add(Clothing item) {
    String itemType = item.getClass().getName();
    pieces.put(itemType, item);
    updateOutfit(item);
  }

  public int size() {
    return pieces.size();
  }

  public boolean hasType(String type) {
    return pieces.containsKey(type);
  }

  private void updateOutfit(Clothing item) {
    if (_isPlain == item.isPlain()) {
      _isPlain = !_isPlain;
    }
    if (_season.toLowerCase().equals("all")) {
      _season = item.season();
    }
    if (item.color().toLowerCase().equals("green")) {
      _hasGreen = true;
    } else if (item.color().toLowerCase().equals("blue")) {
      _hasBlue = true;
    }
  }

  public void print() {
    System.out.println(_name + " outfit:");
    Collection<Clothing> vals = pieces.values();
    vals.forEach(System.out::println);
  }

}
