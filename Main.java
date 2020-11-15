import java.util.*;

// import com.sun.tools.javac.util.ArrayUtils;

public class Main{

public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  int num = sc.nextInt();
  int temp=num;
  int size = (int)Math.log10(num)+1;
  int sum=0;
  for(int i=0; i<size; i++){
    int x = num%10;
    int mul=1;
    for(int j=0; j<size; j++){
      mul*=x;
    }
    sum+=mul;
    num/=10;

  }
  //  System.out.println(sum);153
  if(sum == temp){
    System.out.println("yes");
  }else{
     System.out.println("no");
  }
  

 

 }

}