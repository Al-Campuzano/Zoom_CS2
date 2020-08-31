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

  // Add a node after a given node, starting the search at the listHead
  public void addNodeAfterNode(ListNode newNode, ListNode addAfter) {
    ListNode currNode = listHead;

    // Use short-circuiting: if currNode ends up being
    // null, the first part of the and expression will be
    // false and the second part will never get evaluated
    // (this avoids a null pointer exception)
    while (currNode != null &&
           !currNode.data.equals(addAfter.data)) {
      currNode = currNode.next;
    }

    // currNode will either be null if we got to the
    // end of the list without finding the node,
    // or the node we want to add the new one after
    if (currNode != null) {
      newNode.next = currNode.next;
      currNode.next = newNode;
    }
  }

}
