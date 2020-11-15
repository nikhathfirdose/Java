import java.util.*;

// import com.sun.tools.javac.util.ArrayUtils;

public class Main{

public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  int a = sc.nextInt();
  String num = Integer.toString(a);
  StringBuilder sb = new StringBuilder();
  sb.append(num);
  StringBuilder rev =  sb.reverse();
  if(rev.toString().equals(num)){
    System.out.println("yes");
  }else{
    System.out.println("no");
  }
  

 

 }

}