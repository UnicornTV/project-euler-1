import java.math.*;
import java.util.*;

class Euler_017{
  static Map<Integer, Integer> wordCounts = new HashMap<Integer, Integer>(){{
    put(0,0);
    //one
    put(1,3);
    //two
    put(2,3);
    //three
    put(3,5);
    //four
    put(4,4);
    //five
    put(5,4);
    //six
    put(6,3);
    //seven
    put(7,5);
    //eight
    put(8,5);
    //nine
    put(9,4);
    //ten
    put(10,3);
    //eleven
    put(11,6);
    //twelve
    put(12,6);
    //thirteen
    put(13,8);
    //fourteen
    put(14,8);
    //fifteen
    put(15,7);
    //sixteen
    put(16,7);
    //seventeen
    put(17,9);
    //eighteen
    put(18,8);
    //nineteen
    put(19,8);
    //twenty
    put(20,6);
    //thirty
    put(30,6);
    //forty
    put(40,5);
    //fifty
    put(50,5);
    //sixty
    put(60,5);
    //seventy
    put(70,7);
    //eighty
    put(80,6);
    //ninety
    put(90,6);
    //One Hundred
    put(100,10);
    //Two Hundred
    put(200,10);
    //Three Hundred
    put(300,12);
    //Four Hundred
    put(400,11);
    //Five Hundred
    put(500,11);
    //Six Hundred
    put(600,10);
    //Seven Hundred
    put(700,12);
    //Eight Hundred
    put(800,12);
    //Nine Hundred
    put(900,11);
    //One Thousand
    put(1000,11);
  }};

  public static void main(String[] args) {
    long begin = System.currentTimeMillis();

    int number_of_letters = 0;

    for(int i = 1;i < 1001;i++){
        number_of_letters += processDigits(i);
      }
    //three hundred and three
    System.out.println(processDigits(303));
    System.out.println(number_of_letters);

    long end = System.currentTimeMillis();
		System.out.println(end-begin + "ms");
  }

  static int processDigits(int digits){
    int process_digit_letter_count = 0;
    String digitString = Integer.toString(digits);

    if (digits < 20){
      return wordCounts.get(digits);
    }

    for(int i = 0; i < digitString.length(); i++){
      char digit = digitString.charAt(i);
      int number = Character.getNumericValue(digit);

      if(digitString.length() == 4)
      {
        process_digit_letter_count += wordCounts.get(1000);
      }else if(digitString.length() > 2)
      {
        //hundreds number
        if(i == 0){
          number *= 100;
          process_digit_letter_count += wordCounts.get(number);
        }else if(i == 1){
          //tens number
          number *= 10;
          process_digit_letter_count += wordCounts.get(number);
          //add and
          process_digit_letter_count += (digits % 100 != 0 ? 3 : 0);
        }else if (i == 2){
          //ones number
          process_digit_letter_count += wordCounts.get(number);
        }
      }else
      {
        //tens number
        if(i == 0){
          number *= 10;
          process_digit_letter_count += wordCounts.get(number);
        }else{
          //ones number
          process_digit_letter_count += wordCounts.get(number);
        }
      }

    }
    return process_digit_letter_count;
  }
}
