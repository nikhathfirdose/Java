import java.util.*;
import java.lang.Math; 
  public class Main{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int sourceBase = scn.nextInt();
     int  destBase= scn.nextInt();
     int x = getValueIndecimal(n,sourceBase);
     int y = getValueInBase(x,destBase);
     System.out.println(y);
   }  
   
   public static int getValueIndecimal(int n, int b){
      int ans =0;
      int i=0;
      while(n>0){
         int rem = n%10;
         ans+=rem*(int)Math.pow(b,i);
         i++;
         n/=10;
      }
      return ans;
   }
    public static int getValueInBase(int n, int b){
        int ans=0;
        int i=0;
        while(n>0){
            int rem = n%b;
            ans+=(rem*(int)Math.pow(10,i));
            n/=b;
            i++;
        }
        return ans;
        
   }
  }