import java.util.ArrayList;

public class BinaryTree
{
    private String     data;
    private BinaryTree leftChild;
    private BinaryTree rightChild;

    // A constructor that takes root data only and
    // makes a tree with no children (i.e., a leaf)
    public BinaryTree(String d)
    {
        data = d;
        leftChild = null;
        rightChild = null;
    }

    // A constructor that takes root data as well as two subtrees
    // which then become children to this new larger tree.
    public BinaryTree(String d, BinaryTree left, BinaryTree right)
    {
        data = d;
        leftChild = left;
        rightChild = right;
    }

    // Get methods
    public String getData() { return data; }
    public BinaryTree getLeftChild() { return leftChild; }
    public BinaryTree getRightChild() { return rightChild; }

    // Set methods
    public void setData(String d) { data = d; }
    public void setLeftChild(BinaryTree left) { leftChild = left; }
    public void setRightChild(BinaryTree right) { rightChild = right; }


    // Return the height of the tree
    public int height()
    {
        // Base case: if there are no more children, return 1
        if (leftChild == null && rightChild == null)
        {
            return 1;
        }

        // Recursive case: one or neither child is null
        if (leftChild == null)
        {
            return 1 + rightChild.height();
        }
        else if (rightChild == null)
        {
            return 1 + leftChild.height();
        }
        else
        {
            return 1 + Math.max(leftChild.height(),
                                rightChild.height());
        }
    }


    // Return all the leaves of the tree
    public ArrayList<String> leafData()
    {
        ArrayList<String> result = new ArrayList<String>();

        if (data != null)
        {
            // Base case: check if the current tree is a leaf, and if so,
            // add the data
            if ((leftChild == null) && (rightChild == null))
            {
                result.add(data);
            }
        }

        // Recursive case: collect the leaves of the children and add them
        if (leftChild != null)
        {
            result.addAll(leftChild.leafData());
        }
        if (rightChild != null)
        {
            result.addAll(rightChild.leafData());
        }

        // Return all the leaves part of this tree
        return result;
    }

    // Returns whether or not a tree has the same structure and contents as another tree.
    // Two trees with the same structure and content have the same left/right children
    // locations all the way through from the root to the leaves, where the data at
    // each node is also equal.
    public boolean hasSameContentsAs(BinaryTree tree) {

      // if the two Trees are identical then no need to keep going, return true
      if (this == tree) {
        return true;
      }

      // if the data in the two Trees is not the same then no need to keep going,
      // return false
      if (!data.equals(tree.getData())) {
        return false;
      }

      // set up a couple of local variables to save time and space when checking
      // the left and right children of the "tree"
      BinaryTree treeLeft = tree.getLeftChild();
      BinaryTree treeRight = tree.getRightChild();
      // assume that the left and right results are true unless otherwise changed below
      boolean leftResult = true;
      boolean rightResult = true;

      // if one of the nodes does not have the same children as the other
      // they're not the same
      if ((leftChild != null && treeLeft == null) ||
        (leftChild == null && treeLeft != null) ||
        (rightChild != null && treeRight == null) ||
        (rightChild == null && treeRight != null))
        {
          return false;
        }

      // if both nodes have no children then compare the data in them and return
      // the result
      if (leftChild == null && treeLeft == null
        && rightChild == null && treeRight == null)
        {
          return data.equals(tree.getData());
        }

      // if we've reached the point then we know we have to keep traversing
      // through the trees. So we check that the left children is not null on both
      // objects and call the recursive method. Then do the same on the right.
      if (leftChild != null && treeLeft != null) {
        leftResult = leftChild.hasSameContentsAs(treeLeft);
      }

      if (rightChild != null && treeRight != null) {
        rightResult = rightChild.hasSameContentsAs(treeRight);
      }

      // return if leftResult and rightResult are both true
      return leftResult && rightResult;
    }

    // returns the total number of nodes in the given tree
    public int numberOfNodes() {

      // Base case: if there are no more children, return 1
      if (leftChild == null && rightChild == null) {
          return 1;
      }
      int result = 0;

      // call the recursive function on both sides (if not null)
      // and add the result to the running total
      if (leftChild != null) {
        result += leftChild.numberOfNodes();
      }
      if (rightChild != null) {
        result += rightChild.numberOfNodes();
      }

      // return result plus one to count the current node
      return ++result; // result + 1
    }
}
