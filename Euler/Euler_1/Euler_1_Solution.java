//counter = 0
//(0...1000).each { |i|
//counter += i if i % 3 == 0 || i % 5 == 0 }

class Euler_1_Solution{
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
