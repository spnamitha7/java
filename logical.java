import java.util.*;
public class logical {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();
        sc.nextLine();
        String citizen=sc.nextLine();
        if(age>=18 && citizen.equalsIgnoreCase("indian")){
            System.out.println("eligible to vote");
        }else{
            System.out.println("Not eligible to vote");
        }
    }
}
