class Euler_015{
  public static void main(String[] args) {
    int latticePathCount = 0;

    latticePathCount = (int)factorial(2*20)/(int)(factorial(20)*factorial(20));

  }
  static double factorial(int n)
  {
    double result = 1;
    for (double i = 1; i <= n; i++)
        result *= i;
    return result;
  }
}
