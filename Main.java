import java.util.*;
 import java.lang.Math;
  public class Main{
  
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int low = sc.nextInt();
      int high = sc.nextInt();
      for(int i=low;i<=high;i++){
          int count=0;
          double sq = Math.sqrt((double)i);
          for(int j=2;j<=sq;j++){
              if(i%j==0){
                  count++;
                  break;
              }
          }
          if(count==0){
          System.out.println(i);
          }
      }
   }
  }