class Euler_6{
  public static void main(String[] args) {
    System.out.println(difference(100));
  }

  static int difference(int n){
    int sum = 0;
    int diff = 0;
    int square = 0;

    for (int i = 0; i<=n; i++){
      sum += (i * i);
      square += i;
    }
    square *= square;
    diff = square - sum;

    return diff;
  }
}
