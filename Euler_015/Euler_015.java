import java.math.*;

class Euler_015{
  public static void main(String[] args) {
    long begin = System.currentTimeMillis();
    BigInteger latticePathCount = BigInteger.ZERO;
    BigInteger _2n = BigInteger.ZERO;
    BigInteger _n2 = BigInteger.ZERO;

    _2n = factorial(40);
    _n2 = factorial(20);
    _n2 = _n2.multiply(_n2);

    latticePathCount = _2n.divide(_n2);
    System.out.println(_2n);
    System.out.println(_n2);
    System.out.println(latticePathCount);
    long end = System.currentTimeMillis();
		System.out.println(end-begin + "ms");

  }
  static BigInteger factorial(int n)
  {
    BigInteger result = BigInteger.ONE;
    BigInteger index = BigInteger.ZERO;

    for (int i = 1; i <= n; i++){
        index = new BigInteger(Integer.toString(i));
        result = result.multiply(index);
    }
    return result;
  }
}
