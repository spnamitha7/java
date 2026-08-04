import java.util.*;
public class DecisionMaking {
 public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the number 1 ");
    int a=sc.nextInt();
    System.out.println("enter the number 2 ");
    int b=sc.nextInt();

    if(a>=18){
        System.out.println("eligible to vote");
    }
    
    if(a%2==0){
        System.out.println("a is even");
    }else{
        System.out.println("a is odd");
    }

    if(a>b){
        System.out.println("a is greater");
    }else if(b>a){
        System.out.println("b is greater");
    }else if(b==a){
        System.out.println("both are equal");
    }


    if(a>=60){
        if(b>=18){
            System.out.println("eligible for admission");
        }else{
            System.out.println("age not eligible");
        }
    }else{
        System.out.println("marks not eligible");
    }
 }
}
