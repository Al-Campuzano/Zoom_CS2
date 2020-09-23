public class DoubleFactorial {

  public static int factorial2(int n) {
    // base case can be either n is one or zero
    // because we're skipping every other number in the product
    // except 1
    if (n == 1 || n == 0) {
      return 1;
    }
    return n * factorial2(n-2);
  }

  public static void main(String[] args) {

    System.out.println("Double Factorial");
    System.out.println(factorial2(4)); // 8
    System.out.println(factorial2(5)); // 15
    System.out.println(factorial2(6)); // 48
    System.out.println(factorial2(7)); // 105

  }

}
