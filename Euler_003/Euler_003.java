class Euler_003{
  public static void main(String[] args) {
    // writing long integer literals requires
    // that you add an 'L' to the end or else you
    // get an error
    long n = 600851475143L;
    int factor = 2;

    while(n > factor){
      if (n % factor == 0){
        n = n/factor;
        factor = 2;
      }else{
        factor += 1;
      }
    }
    System.out.println(factor);
    System.out.println(n);
  }
}
