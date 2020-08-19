public class TestTape {

  public static void printTapeArray(ScotchTape[] tapeArray) {
    for (int i=0; i < tapeArray.length; i++) {
      System.out.println(tapeArray[i].colour + " (" + tapeArray[i].length + " cm, "
                        + tapeArray[i].weight + " oz)");
    }
  }

  public static void stickTape(ScotchTape tape, double percentToUse) {
    tape.weight -= (int)(tape.weight * percentToUse);
    tape.length -= (int)(tape.length * percentToUse);
  }

  public static void main(String[] args) {

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

    stickTape(tapesArray[0], 0.5);
    stickTape(tapesArray[1], 0.3);
    stickTape(tapesArray[2], 0.9);

    System.out.println();

    printTapeArray(tapesArray);

  }

}
