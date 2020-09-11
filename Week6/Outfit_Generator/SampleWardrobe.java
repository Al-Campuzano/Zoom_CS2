import java.util.ArrayList;

public class SampleWardrobe {

   private ArrayList<Clothing> sample;

   public SampleWardrobe() {
     sample = new ArrayList<Clothing>(30);
   }

   public ArrayList<Clothing> getSampleWardrobe() {
    // Shirts (t-shirts, sweaters, button-up shirts, turtlenecks, etc.)
    // Pants (jeans, khakis, slacks, capris, shorts, etc.)
    // Outerwear (spring coat, winter jacket, etc.)
    // Shoes (dress shoes, running shoes, steel-toed boots, etc.)
    // Accessories (rings, earrings, watches, ties, etc.)

     // name, color, season, fancy, plain
     Shirt shirt1 = new Shirt("T-shirt", "green", "all", false, true);
     Shirt shirt2 = new Shirt("Long-sleeved shirt", "red", "not summer", false, false);
     Shirt shirt3 = new Shirt("Dress shirt", "blue", "all", true, true);
     Shirt shirt4 = new Shirt("Turtleneck", "grey", "not summer", true, true);
     Shirt shirt5 = new Shirt("Tank-top", "Pink", "summer", false, false);
     Shirt shirt6 = new Shirt();
     sample.add(shirt1);
     sample.add(shirt2);
     sample.add(shirt3);
     sample.add(shirt4);
     sample.add(shirt5);
     sample.add(shirt6);

     sample.add(new Pants("Jeans", "black", "all", false, true));
     sample.add(new Pants("Khakis", "brown", "all", false, true));
     sample.add(new Pants("Slacks", "green", "all", true, true));
     sample.add(new Pants("Shorts", "black", "summer", false, false));
     sample.add(new Pants("Dress pants", "blue", "all", true, true));
     sample.add(new Pants());

     sample.add(new Outerwear());
     sample.add(new Outerwear("Coat", "brown", "not summer", true, true));
     sample.add(new Outerwear("Jacket", "white", "not summer", false, true));
     sample.add(new Outerwear("Poncho", "green", "all", false, false));
     sample.add(new Outerwear("Trench coat", "black", "all", true, true));
     sample.add(new Outerwear("Hoodie", "purple", "all", false, true));

     return sample;
   }

}
