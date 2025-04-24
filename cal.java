import java.util.*;

public class cal{
  public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    System.out.println("1.add 2.sub 3.mul 4.div 5.mod");
    System.out.print("Enter yout option: ");
    int n=sc.nextInt();
    if(n==1){
      System.out.println(a+b);
    }
    else if(n==2){
      System.out.println(a-b);
    }
    else if(n==3){
      System.out.println(a*b);
    }
    else if(n==4){
      System.out.println(a/b);
    }
    else{
      System.out.println(a%b);
    }
    sc.close();
  }
}