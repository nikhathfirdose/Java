import java.util.*;

// import com.sun.tools.javac.util.ArrayUtils;

public class Main{

public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
  while(true){
  System.out.println("Size:");
  int size = sc.nextInt();

  if(size<0){
   System.out.println("Invalid");
  break;

  }
  int[] arr = new int[size];
  int[] arr2 = new int[size];
  for(int i=0;i<size;i++){
    arr[i] = sc.nextInt();
  }
  for(int i=0;i<size;i++){
    arr2[i] = sc.nextInt();
  }
  int sum,mul;
for(int i=0;i<size;i++){
  sum=0;
  int temp1=arr[i];
  int temp2=arr2[i];
  while(temp1!=0){
    sum+= temp1%10;
    temp1/=10;
  }
//  System.out.println(sum);
    mul=1;
    while(temp2!=0){
      mul*= temp2%10;
      temp2/=10;
    }

  if(sum==mul){
     System.out.println(arr[i]+ ","+arr2[i]);
  }
  else{
     System.out.println("no match");
     break;
  }
  }

break;
  }
//  System.out.println(88789%10);


  
}
}