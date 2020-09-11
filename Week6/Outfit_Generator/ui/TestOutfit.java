// This tester class just creates an instance of the OutfitGenerator
// then calls its getNewOutfit() method twice to get two new random outfits

package ui;

import data.OutfitGenerator;

public class TestOutfit {

  public static void main(String[] args) {

    System.out.println("Welcome to the outfit generator!\n");
    OutfitGenerator og = new OutfitGenerator("Random", 5);

    og.getNewOutfit();
    System.out.println("\n----Second outfit----\n");
    og.setName("Three-piece");
    og.setNumPieces(3);
    og.getNewOutfit();

  }

}
