import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  int a = sc.nextInt();
  int count=0;
  if(a%2==0 || a==1){
    System.out.println("noya");
    System.exit(0);

  }
  for(int i=3; i<Math.sqrt(a); i++){
    if(a%i==0){
      count++;
      break;
    }
    
  }
  if(count==0){
    System.out.println("yes");
  }else{
    System.out.println("noya");
    System.out.println(Math.sqrt(a));
  }

 }

}