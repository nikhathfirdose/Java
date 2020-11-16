import java.util.*;

// import com.sun.tools.javac.util.ArrayUtils;

public class Main{

public static void main(String[] args) {
  // Scanner sc = new Scanner(System.in);

  String a = "aaa hhh sdhfk";
  String arr[]= a.split(" ");
  String res[] = new String[7];
  // System.out.println(arr.length);
  for(int i=0;i<arr.length;i++){
    res[i] = (arr[i].toString().substring(0,1).toUpperCase())+ arr[i].substring(1);
  }
    for(int i=0;i<arr.length;i++){
    System.out.print(res[i]+" ");
  }

}
}