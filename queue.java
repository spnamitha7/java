import java.util.*;
public class queue{
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    Queue<String> n=new LinkedList<>();
     for(int i=0;i<5;i++){
        n.add(sc.nextLine());
     }
     System.out.println(n.peek());
     System.out.println(n.poll());
     System.out.println(n);
   }
}