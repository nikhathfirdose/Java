import java.util.*;

public class Main{

public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  String a = sc.next();
  StringBuilder r = new StringBuilder();
  r.append(a);
  StringBuilder m = r.reverse();
  if(m.toString().equals(a)){
    System.out.println("yes");
  }else{
    System.out.println("noya");
  }
 }

}