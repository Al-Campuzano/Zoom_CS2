public class TestTape {

  public static void printTapeArray(ScotchTape[] tapeArray) {
    for (int i=0; i < tapeArray.length; i++) {
      System.out.println(tapeArray[i].colour + " (" + tapeArray[i].length + " cm, "
                        + tapeArray[i].weight + " oz)");
    }
  }

  public static void stickTape(ScotchTape tape, float percentToUse) {

  }

  public static void main(String[] args) {

    System.out.println("Testing tape");

    ScotchTape tapesArray[] = new ScotchTape[3];

    tapesArray[0] = new ScotchTape();
    tapesArray[0].colour = "clear";
    tapesArray[0].weight = 3;
    tapesArray[0].length = 22;

    tapesArray[1] = new ScotchTape();
    tapesArray[1].colour = "green";
    tapesArray[1].weight = 1;
    tapesArray[1].length = 15;

    tapesArray[2] = new ScotchTape();
    tapesArray[2].colour = "blue";
    tapesArray[2].weight = 2;
    tapesArray[2].length = 19;

    printTapeArray(tapesArray);

  }

}
