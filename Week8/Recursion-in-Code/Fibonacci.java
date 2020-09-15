public class Fibonacci {

  public static int Fib(int n) {
    if (n == 0 || n == 1) {
      return n;
    }
    return Fib(n-1) + Fib(n-2);
  }

  public static void main(String[] args) {

    System.out.println("Fibonacci Sequence");
    for (int i = 0; i < 15; i++) {
      System.out.print(Fib(i) + ", ");
    }
  }

}
