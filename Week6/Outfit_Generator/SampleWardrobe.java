import java.util.ArrayList;

public class SampleWardrobe {

   private ArrayList<Clothing> sample;

   public SampleWardrobe() {
     sample = new ArrayList<Clothing>(30);
   }

   public ArrayList<Clothing> getSampleWardrobe() {
//      Shirts (t-shirts, sweaters, button-up shirts, turtlenecks, etc.)
// Pants (jeans, khakis, slacks, capris, shorts, etc.)
// Outerwear (spring coat, winter jacket, etc.)
// Shoes (dress shoes, running shoes, steel-toed boots, etc.)
// Accessories (rings, earrings, watches, ties, etc.)

     // name, color, fancy, plain, summer
     Shirt shirt1 = new Shirt("T-shirt", "green", false, true, true);
     Shirt shirt2 = new Shirt("Sweater", "red", false, false, false);
     Shirt shirt3 = new Shirt("Dress shirt", "blue", true, true, true);
     Shirt shirt4 = new Shirt("Turtleneck", "grey", true, true, false);
     Shirt shirt5 = new Shirt("Tank-top", "pink", false, false, true);
     sample.add(shirt1);
     sample.add(shirt2);
     sample.add(shirt3);
     sample.add(shirt4);
     sample.add(shirt5);
     sample.add(new Pants("Jeans", "blue", false, true, true));
     sample.add(new Pants("Khakis", "brown", false, true, true));
     sample.add(new Pants("Slacks", "green", true, true, true));
     sample.add(new Pants("Shorts", "black", false, false, true));
     sample.add(new Pants("Dress pants", "blue", true, true, true));
     
     return sample;
   }

}
