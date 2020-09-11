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

     // name, color, fancy, plain, winter
     Shirt shirt1 = new Shirt("T-shirt", "green", false, true, false);
     Shirt shirt2 = new Shirt("Long-sleeved shirt", "red", false, false, false);
     Shirt shirt3 = new Shirt("Dress shirt", "blue", true, true, false);
     Shirt shirt4 = new Shirt("Turtleneck", "grey", true, true, false);
     Shirt shirt5 = new Shirt("Tank-top", "Pink", false, false, false);
     Shirt shirt6 = new Shirt();
     sample.add(shirt1);
     sample.add(shirt2);
     sample.add(shirt3);
     sample.add(shirt4);
     sample.add(shirt5);
     sample.add(shirt6);
     // For pants it's name, color, fancy, plain, and long
     sample.add(new Pants("Jeans", "black", false, true, true));
     sample.add(new Pants("Khakis", "brown", false, true, true));
     sample.add(new Pants("Slacks", "green", true, true, true));
     sample.add(new Pants("Shorts", "black", false, false, false));
     sample.add(new Pants("Dress pants", "blue", true, true, true));
     sample.add(new Pants());

     sample.add(new Outerwear());
     sample.add(new Outerwear("Coat", "brown", true, true, false));
     sample.add(new Outerwear("Jacket", "white", false, true, true));
     sample.add(new Outerwear("Poncho", "green", false, false, false));
     sample.add(new Outerwear("Trench coat", "black", true, true, true));
     sample.add(new Outerwear("Hoodie", "purple", false, true, false));

     return sample;
   }

}
