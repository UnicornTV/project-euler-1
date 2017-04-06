import java.math.BigInteger;

public class Euler_025
{
  public static void main(String[] args)
  {
    int count = 2;
    BigInteger sum = new BigInteger("0");
    BigInteger thousandDigits = (new BigInteger("10")).pow(999);
    BigInteger[] bigFib = {BigInteger.ONE, BigInteger.ONE};

    while(sum.compareTo(thousandDigits) != 1)
    {
      sum = bigFib[0].add(bigFib[1]);
      bigFib[0] = bigFib[1];
      bigFib[1] = sum;
      count++;
    }
    System.out.println(count);
  }
}
