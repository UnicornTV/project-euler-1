class Euler_001{
  public static void main(String[] args) {
    int counter = 0;
    for(int i = 3; i < 1000; i++){
      if(i % 3 == 0 || i % 5 == 0){
        counter += i;
      }
    }
    System.out.println(counter);
  }
}
