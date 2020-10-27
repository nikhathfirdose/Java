import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for(int i=0;i<arr.length;i++){
        arr[i] = sc.nextInt();
    }
    int max=arr[0];
    int min=arr[0];
    for(int j=0;j<arr.length-1;j++){
        
        if(arr[j+1]>max){
            max = arr[j+1];
        }else if(arr[j+1]<min){
            min = arr[j+1];
        }
    }
    int result = max-min;
    System.out.println(result);
 }

}