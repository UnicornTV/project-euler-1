import java.math.*;

class Euler_016{
  public static void main(String[] args) {
    long begin = System.currentTimeMillis();
    BigInteger _2_to_the_thousand = new BigInteger("2");
    _2_to_the_thousand = _2_to_the_thousand.pow(1000);
    System.out.println(sumTheDigits(_2_to_the_thousand));
    long end = System.currentTimeMillis();
		System.out.println(end-begin + "ms");
  }

  static long sumTheDigits(BigInteger lotsDigits){
    String string_of_numbers = lotsDigits.toString();
    long sum = 0;

    for(int i = 0; i<string_of_numbers.length(); i++){
      char digit = string_of_numbers.charAt(i);
      int number = Character.getNumericValue(digit);
      sum += number;
    }
    return sum;
  }
}
