abstract public class Clothing {

  private String _name;
  private String _color;
  private boolean _isFancy;
  private boolean _isPlain;
  private boolean _isForWinter;

  //// Getters
  public String name() { return _name; }
  public String color() { return _color; }
  public boolean isFancy() { return _isFancy; }
  public boolean isPlain() { return _isPlain; }
  public boolean isForWinter() { return _isForWinter; }

  //// Setters
  public void setName(String name) { _name = name; }
  public void setColor(String color) { _color = color; }
  public void setIsFancy(boolean isFancy) { _isFancy = isFancy; }
  public void setIsPlain(boolean isPlain) { _isPlain = isPlain; }
  public void setIsForWinter(boolean isForWinter) { _isForWinter = isForWinter; }

  //// toString abstract method
  public abstract String toString();
}