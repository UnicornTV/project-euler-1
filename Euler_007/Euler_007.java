class Euler_7{
  public static void main(String[] args) {
    int count = 6;
    int check = 14;

    while (check < 200000){
      if (isPrime(check)){
        count++;
      }
      if(count == 10001){
        break;
      }
      check++;
    }
    System.out.println(check);
  }

  static boolean isPrime(int n)
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
