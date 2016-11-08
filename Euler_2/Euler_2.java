class Euler_2{
  public static void main(String[] args) {
    int c = 0;
    int sum = 0;
    int[] i = {1,1};

    while (c < 4000000){
      c = i[0] + i[1];
      i[0] = i[1];
      i[1] = c;
      if (c % 2 == 0){
        sum += c;
      }
    }
    System.out.println(sum);
  }
}
