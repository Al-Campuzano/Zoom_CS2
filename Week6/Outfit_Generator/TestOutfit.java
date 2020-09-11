public class TestOutfit {

  public static void main(String[] args) {

    System.out.println("Welcome to the outfit generator!\n");
    OutfitGenerator og = new OutfitGenerator("Random", 5);

    og.getNewOutfit();
    System.out.println("\n----Second outfit----\n");
    og.getNewOutfit();

  }

}
