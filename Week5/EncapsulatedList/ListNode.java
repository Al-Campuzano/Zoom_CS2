public class ListNode {
  public ReadThis data;
  public ListNode next;

  public static int totalNodes = 0;

  public ListNode(ReadThis newData) {
    this(newData, null);
  }

  public ListNode(ReadThis newData, ListNode newNext) {
    data = newData;
    next = newNext;
    totalNodes++;
  }

  public static void printNumNodes() {
    System.out.println(totalNodes + " have been created so far.");
  }

  // Get the length of the list, assuming "this" is
  // the beginning
  public int getLength()
  {
      // To get the length, walk through the list one
      // node at a time, adding one for each node we
      // visit

      int length = 0;

      ListNode currNode = this;
      while (currNode != null)
      {
          length++;
          currNode = currNode.next;
      }

      return length;
  }
}
