import java.util.*;
public class hashset {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      HashSet<Integer> n=new HashSet<>();
      for(int i=0;i<7;i++){
        n.add(sc.nextInt());
      }  
      if(n.contains(30)){
        System.out.println("30 is present");
      }else{
        System.out.println("30 is not present");
      }
      n.add(30);
      System.out.println(n);
    }
}
