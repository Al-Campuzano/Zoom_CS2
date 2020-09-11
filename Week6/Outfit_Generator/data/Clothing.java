package data;

abstract public class Clothing {

  private String _name;
  private String _color;
  private String _season;
  private boolean _isFancy;
  private boolean _isPlain;

  //// Getters
  public String name() { return _name; }
  public String color() { return _color; }
  public String season() { return _season; }
  public boolean isFancy() { return _isFancy; }
  public boolean isPlain() { return _isPlain; }

  //// Setters
  public void setName(String name) { _name = name; }
  public void setColor(String color) { _color = color; }
  public void setSeason(String season) { _season = season; }
  public void setIsFancy(boolean isFancy) { _isFancy = isFancy; }
  public void setIsPlain(boolean isPlain) { _isPlain = isPlain; }

  //// toString abstract method
  public abstract String toString();

}
