import java.math.*;

public class Euler_9
{
    static int c = 0;

    public static void main(String[] args) {
      for(int a = 1; a<500; a++){
        for(int b = a; b<500; b++){
          Boolean check = isSquare(a*a + b*b);
          if(check && a+b+c == 1000){
            System.out.println(a*b*c);
            break;
          }
        }
      }
    }

    static Boolean isSquare(int n){
      int root = (int)Math.sqrt(n);
      if (root * root == n){
        c = root;
        return true;
      }
      return false;
    }

}
