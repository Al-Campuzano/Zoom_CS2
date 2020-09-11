// This class simply sets up an ArrayList with sample Clothing items
// for the OutfitGenerator to use

package data;

import java.util.ArrayList;

public class SampleWardrobe {

   private ArrayList<Clothing> sample;

   public SampleWardrobe() {
     sample = new ArrayList<Clothing>(40);
   }

   public ArrayList<Clothing> getSampleWardrobe() {
     // The constructors take the following arguments:
     // String name, String color, String season, boolean fancy, boolean plain

     // add shirts
     sample.add(new Shirt());
     sample.add(new Shirt("T-shirt", "green", "all", false, true));
     sample.add(new Shirt("Long-sleeved shirt", "red", "not summer", false, false));
     sample.add(new Shirt("Dress shirt", "blue", "all", true, true));
     sample.add(new Shirt("Turtleneck", "grey", "not summer", true, true));
     sample.add(new Shirt("Tank-top", "Pink", "summer", false, false));
     sample.add(new Shirt("Dress shirt", "yellow", "all", true, false));

     // add pants
     sample.add(new Pants());
     sample.add(new Pants("Jeans", "black", "all", false, true));
     sample.add(new Pants("Khakis", "brown", "all", false, true));
     sample.add(new Pants("Snow pants", "green", "winter", false, false));
     sample.add(new Pants("Shorts", "black", "summer", false, false));
     sample.add(new Pants("Dress pants", "blue", "all", true, true));
     sample.add(new Pants("Dress pants", "red", "all", true, false));

     // add outerwear
     sample.add(new Outerwear());
     sample.add(new Outerwear("Coat", "brown", "not summer", true, true));
     sample.add(new Outerwear("Coat", "orange", "not summer", true, false));
     sample.add(new Outerwear("Jacket", "white", "winter", false, true));
     sample.add(new Outerwear("Poncho", "green", "all", false, false));
     sample.add(new Outerwear("Trench coat", "black", "all", true, true));
     sample.add(new Outerwear("Hoodie", "purple", "all", false, false));

     // add shoes
     sample.add(new Shoe());
     sample.add(new Shoe("Snow boots", "green", "winter", false, false));
     sample.add(new Shoe("Dress shoes", "black", "all", true, true));
     sample.add(new Shoe("Dress shoes", "blue", "all", true, false));
     sample.add(new Shoe("Sandals", "blue", "summer", false, false));
     sample.add(new Shoe("Snow boots", "blue", "winter", false, false));
     sample.add(new Shoe("Crocs", "pink", "summer", false, true));

     // add accessories
     sample.add(new Accessory());
     sample.add(new Accessory("Earrings", "silver", "all", true, true));
     sample.add(new Accessory("Ring", "gold", "all", false, true));
     sample.add(new Accessory("Tie", "purple", "all", true, false));
     sample.add(new Accessory("Watch", "black", "all", false, false));
     sample.add(new Accessory("Toque", "yellow", "not summer", false, false));
     sample.add(new Accessory("Visor", "white", "summer", false, true));

     return sample;
   }

}
