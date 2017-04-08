import java.math.*;

class Euler_012{
  public static void main(String[] args) {
    long begin = System.currentTimeMillis();
    for(int i = 0; true; i++){
      if(findFactors(findTriangle(i)) > 500){
          System.out.println(findTriangle(i));
          break;
      }
    }
    long end = System.currentTimeMillis();
		System.out.println(end-begin + "ms");
  }

  public static int findTriangle(int term){
    //how to compute a triangle number: triangle = (n * n+1)/2
    return term = term * (term+1) / 2;
  }

  public static long findFactors(long factored){
    long factors = 0;
    //test against the square root to check for squares as to reduce number search
    int limit = (int)Math.sqrt(factored);
    //ternary operator to check for primes
    for(int i = 1; i<=limit; i++){
      if (factored % i == 0){ factors += (factored % i == i ?  1 : 2); }
    }
    return factors;
  }
}
