import java.util.*;
public class exception {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        try{
            int div=10/n;
        }catch(Exception e){
System.out.println(e);
        }finally{
            System.out.println("errors are handled");
        }
    }
}
