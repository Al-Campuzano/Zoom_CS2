public class ListNode {
  private ReadThis data;
  private ListNode next;

  private static int totalNodes = 0;

  public ListNode(ReadThis newData) {
    this(newData, null);
  }

  public ListNode(ReadThis newData, ListNode newNext) {
    data = newData;
    next = newNext;
    totalNodes++;
  }

  public ReadThis getData() { return data; }
  public ListNode getNext() { return next; }

  public void setNext(ListNode newNext) { next = newNext; }

  public static void printNumNodes() {
    System.out.println(totalNodes + " have been created so far.");
  }
}
