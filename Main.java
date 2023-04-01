public class Main {

  /**
   * Solving this without a third variable means performing calculations on the two values only.
   *
   * It's similar to how it would've been made with a 3rd variable but instead of it
   * we store and update the results between the 2 existing ones.
   *
   * Let's take this example: a=2, b=4
   *
   * a = 2 + 4 // a = 6
   * b = 6 - 4 // b = 2 (swapped)
   * a = 6 - 2 // a = 4 (swapped)
   *
   * Works because it follows the <b>Inverse Property</b>.
   */
  public static void swapNumbers(int a, int b) {
    a += b;
    b = a - b;
    a -= b;
  }

  /**
   * Similar to how we did it in the example using only +/-, here we will be using the ^(XOR) operator.
   *
   * Let's take the same example from above: a=2(0100), b=4(0010)
   *
   * a = a ^ b // a = 6(0110)
   * b = a ^ b // b = 2(0100) -> swapped
   * a = a ^ b // a = 4(0010) -> swapped
   *
   * It works because it follows the <b>Additive Inverse Property</b>
   */
  public static void swapNumbersXor(int a, int b) {
    a ^= b;
    b = a ^ b;
    a ^= b;
  }
}
