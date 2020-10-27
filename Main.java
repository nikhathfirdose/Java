import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
   Scanner sc = new Scanner(System.in);
   int n = sc.nextInt();
   int[] arr = new int[n];
   for(int i=0; i<arr.length;i++){
       arr[i] = sc.nextInt();
   }
   int d = sc.nextInt();
   int count=0;
   for(int j=0; j<arr.length;j++){
       if(arr[j]==d){
           System.out.println(j);
           
           break;
       }
       count++;
   }
//   System.out.println(count);
    if(count==(arr.length)){
        System.out.println(-1);
    }
 }

}