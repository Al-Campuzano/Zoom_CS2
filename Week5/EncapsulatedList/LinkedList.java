public class LinkedList {

  private ListNode listHead;

  public LinkedList() {
    listHead = null;
  }

  // Prints the list from the node index passed in, or from the start
  public void printListFrom() {
    printListFrom(0);
  }

  public void printListFrom(int start) {
    System.out.println("----------\nStart List\n----------");
    ListNode currNode = listHead;
    int counter = 0;
    while (currNode != null) {
      if (start <= counter) {
        System.out.println("\t" + currNode.data);
      }
      currNode = currNode.next;
      counter++;
    }
    System.out.println("----------\nEnd List\n----------");
  }

  // Add a node to the beginning of the list, and return the new
  // start of the list
  public ListNode addURLToBeginning(ListNode newNode) {
    newNode.next = listHead;
    listHead = newNode;
    return listHead;
  }

  // Add a node to the end of the list "this" belongs to
  public void addURLToEnd(ListNode newNode) {
    ListNode currNode = listHead;
    while (currNode.next != null) {
      currNode = currNode.next;
    }

    currNode.next = newNode;
  }

}
