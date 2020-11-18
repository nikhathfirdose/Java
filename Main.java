import java.util.*;

// import com.sun.tools.javac.util.ArrayUtils;

public class Main{

public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 while(true){
 System.out.println("Product:");
 String prod = sc.nextLine();
 int dis=0;
 if(prod.toLowerCase().equals("m")){
   dis = 10;
 }
 else if(prod.toLowerCase().equals("n")){
   dis = 20;
 }
 else if(prod.toLowerCase().equals("o")){
   dis = 30;
 }
 else if(prod.toLowerCase().equals("p")){
   dis = 40;
 }
 else{
 System.out.println("Invalid");
 break;
   
 }
 System.out.println("Price:");

 int price = sc.nextInt();

 if(price<100){
 System.out.println("Invalid again");
 break;

 }

 System.out.println(prod+price);
 break;

 }
}
}