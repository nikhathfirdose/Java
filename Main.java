import java.util.*;
import java.lang.Math;
    public class Main{
    
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int num = sc.nextInt();
      int temp=num;
      int count=0;
      while(temp!=0){
          temp/=10;
          count++;
      }
      
      int val = (int)Math.pow(10,(count-1));
      while(val!=0){
          
          int q = num/val;
          System.out.println(q);
          
          num%=val;
          val/=10;
          
      }
      
     }
    }