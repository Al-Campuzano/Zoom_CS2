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

  


  // Remove the first node in the list, and return
  // the new head
  public ListNode removeFirstNode()
  {
      // We just need to cut out the head node,
      // making the second node in the list the head
      // (if there isn't one, that's ok, head will
      // just become null)
      return next;
  }


  // Remove the last node from the list, and return
  // the head in case it changes because the list
  // is now empty
  public ListNode removeLastNode()
  {
      // If there's only one item in the list,
      // the new list should be empty (i.e. head
      // is null)
      if (next == null)
      {
          return null;
      }

      // Otherwise, find the last node to remove
      else
      {
          // First we have to actually find the end of the list,
          // but we also have to hang onto the node right before the
          // last one so we can update its next reference
          ListNode prevNode = null;
          ListNode currNode = this;
          while (currNode.next != null)
          {
              prevNode = currNode;
              currNode = currNode.next;
          }

          // currNode is the last one in the list; now we can cut it out
          // using the previous node
          prevNode.next = null;

          // The head isn't changing in this case, so
          // just return this
          return this;
      }
  }


  // Remove the given node from the list, and return
  // the head in case it changes
  public ListNode removeNode(ListNode toRemove)
  {
      // Check if the head is the one to remove;
      // if so, link it out by returning a new head
      // (which can be null)
      if (data.equals(toRemove.data))
      {
          return next;
      }

      // Otherwise, we can search the list for the
      // node to remove and link it out
      else
      {

          ListNode currNode = this;

          // Stop when the next node's data equals the data
          // we want to remove
          while (currNode.next != null &&
                 !currNode.next.data.equals(toRemove.data))
          {
              currNode = currNode.next;
          }

          // If currNode's next is null, then we never found the
          // node to remove
          if (currNode.next != null)
          {
              currNode.next = currNode.next.next;
          }

          // If we got this far, the head hasn't changed
          return this;
      }
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
