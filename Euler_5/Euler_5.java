class Euler_5{
  public static void main(String[] args) {
    int start = 1;
    int finish = 20;
    int lcm = 1;
    int sum = lcm;

    for(int i = start; i < finish; i++){
      while (sum % i != 0){
        sum += lcm;
      }
      lcm = sum;
    }
    System.out.println(sum);
  }
}
