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
  public static boolean isPrime(int n){
    if (n%2 == 0){
      return false;
    }
    double max = Math.sqrt(n);
    double divisor = 3.0;

    while(divisor <= max){
      if (n%divisor == 0){
        return false;
      }
      divisor += 2;
    }
    return true;
  }
}
