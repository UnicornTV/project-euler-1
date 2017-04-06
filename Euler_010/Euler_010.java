import java.math.*;

public class Euler_10{
  public static void main(String[] args) {
    long sum = 0;
    int count = 1;
    while(count < 2000000){
      if(isPrime(count)){
        sum += count;
      }
      count += 2;
    }
    sum += 2;
    System.out.println(sum);
  }
  public static boolean isPrime(int n)
  {
    if (n == 1)
    {
      return false;
    }
        int k = (int) Math.sqrt(n);
            for (int i = 2; i <= k; i++)
            {
                if (n % i == 0)
                    return false;
            }
            return true;
  }
}
