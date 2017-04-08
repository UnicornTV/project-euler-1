class Euler_004{
  public static void main(String[] args) {
    int total = 0;
    int a = 999;
    int b = 999;

    while (a >= 900){
      total = a * b;
      if (isPalindrome(total)){
        break;
      }
      a--;
      if (a == 900){
        a = 999;
        b--;
      }
    }
    System.out.println(total);
  }

  static boolean isPalindrome(int n){
    int result = 0;
    int remainder;
    int initial = n;

    while (n > 0){
      remainder = n % 10;
      n /= 10;
      result = result * 10 + remainder;
    }

    if (result == initial) {
      return true;
    }else{
      return false;
    }
  }
}
