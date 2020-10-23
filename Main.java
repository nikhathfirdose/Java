import java.util.*;
 import java.lang.Math;
  public class Main{
  
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int t = sc.nextInt();
      for(int i=0;i<t;i++){
          double n= sc.nextDouble();
          int count=0;
          double x = Math.sqrt(n);
          for(int j=2;j<(int)x;j++){
              if(n%j==0){
                  count+=1;
                  break;
              }
          }
          if(count==1){
              System.out.println("not prime");
          }else{
              System.out.println("prime");
          }
      }
  
   }
  }