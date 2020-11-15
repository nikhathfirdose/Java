import java.util.*;

public class Main{

public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  int a=0,b=0,c=1;
  int x = sc.nextInt();
  for(int i=0;i<x;i++){
    a=b;
    b=c;
    c=a+b;
    System.out.print(a+",");


  }
 }

}