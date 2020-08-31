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
        System.out.println("\t" + currNode.getData());
      }
      currNode = currNode.getNext();
      counter++;
    }
    System.out.println("----------\nEnd List\n----------");
  }

  // Add a node to the beginning of the list, and return the new
  // start of the list
  public ListNode addURLToBeginning(String newURL) {
    return addURLToBeginning(new ListNode(new ReadThis(newURL)));
  }

  public ListNode addURLToBeginning(ListNode newNode) {
    newNode.setNext(listHead);
    listHead = newNode;
    return listHead;
  }

  // Add a node to the end of the list
  public void addURLToEnd(String newURL) {
    addURLToEnd(new ListNode(new ReadThis(newURL)));
  }

  public void addURLToEnd(ListNode newNode) {
    ListNode currNode = listHead;
    while (currNode.getNext() != null) {
      currNode = currNode.getNext();
    }

    currNode.setNext(newNode);
  }

  // Add a node after a given node, starting the search at the listHead
  public void addNodeAfterNode(ListNode newNode, ListNode addAfter) {
    ListNode currNode = listHead;

    // Use short-circuiting: if currNode ends up being
    // null, the first part of the and expression will be
    // false and the second part will never get evaluated
    // (this avoids a null pointer exception)
    while (currNode != null &&
           !currNode.getData().equals(addAfter.getData())) {
      currNode = currNode.getNext();
    }

    // currNode will either be null if we got to the
    // end of the list without finding the node,
    // or the node we want to add the new one after
    if (currNode != null) {
      newNode.setNext(currNode.getNext());
      currNode.setNext(newNode);
    }
  }

  // Remove the first node in the list, and return
  // the new head
  public ListNode removeFirstURL() {
    // We just need to cut out the head node,
    // making the second node in the list the head
    // (if there isn't one, that's ok, head will
    // just become null)
    listHead = listHead.getNext();
    return listHead;
  }

  // Remove the last node from the list, and return
  // the head in case it changes because the list
  // is now empty
  public ListNode removeLastURL() {
    // If there's only one item in the list,
    // the new list should be empty (i.e. head
    // is null)
    if (listHead.getNext() == null) {
      listHead = null;
      return listHead;
    } else { // Otherwise, find the last node to remove
      // First we have to actually find the end of the list,
      // but we also have to hang onto the node right before the
      // last one so we can update its next reference
      ListNode prevNode = null;
      ListNode currNode = listHead;
      while (currNode.getNext() != null) {
        prevNode = currNode;
        currNode = currNode.getNext();
      }

      // currNode is the last one in the list; now we can cut it out
      // using the previous node
      prevNode.setNext(null);

      // The head isn't changing in this case, so
      // just return this
      return listHead;
    }
  }

  // Remove the given node from the list, and return
  // the head in case it changes
  public ListNode removeNode(ListNode toRemove) {
    // Check if the head is the one to remove;
    // if so, link it out by returning a new head
    // (which can be null)
    if (listHead.getData().equals(toRemove.getData())) {
      listHead = listHead.getNext();
      return listHead;
    } else {
      // Otherwise, we can search the list for the
      // node to remove and link it out
      ListNode currNode = listHead;

      // Stop when the next node's data equals the data
      // we want to remove
      while (currNode.getNext() != null &&
             !currNode.getNext().getData().equals(toRemove.getData())) {
        currNode = currNode.getNext();
      }

      // If currNode's next is null, then we never found the
      // node to remove
      if (currNode.getNext() != null) {
        currNode.setNext(currNode.getNext().getNext());
      }

      // If we got this far, the head hasn't changed
      return listHead;
    }
  }

  public void clearList() {
    listHead = null;
  }

  // Get the length of the list
  public int getLength() {
    // To get the length, walk through the list one
    // node at a time, adding one for each node we
    // visit

    int length = 0;

    ListNode currNode = listHead;
    while (currNode != null) {
      length++;
      currNode = currNode.getNext();
    }

    return length;
  }

}
