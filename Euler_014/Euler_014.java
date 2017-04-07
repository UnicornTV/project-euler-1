public class Euler_014{
  public static void main(String[] args) {
    long begin = System.currentTimeMillis();

    long n = 0;
    int chain = 0;
    int longest_chain = 0;
    int longest_chain_starting_number = 0;
    
    for(int startingNumber = 999999; startingNumber>=1; startingNumber--){
      chain = 0;
      n = startingNumber;
      while(n != 1){
        if(n % 2 == 0){
          n /= 2;
        }else{
          n = 3*n + 1;
        }
        chain++;
      }
      chain++;
      if(chain > longest_chain){
        longest_chain = chain;
        longest_chain_starting_number = startingNumber;
      }

    }

    System.out.println(longest_chain);
    System.out.println(longest_chain_starting_number);

    long end = System.currentTimeMillis();
		System.out.println(end-begin + "ms");
  }
}
