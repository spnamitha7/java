import java.util.*;
public class Hashmap {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        HashMap<Integer,String> n=new HashMap<>();
        for(int i=0;i<7;i++){
            int nu=sc.nextInt();
            String nnn=sc.nextLine();
            n.put(nu,nnn);
        }
        System.out.println("print the roll no");
        int nn=sc.nextInt();
        System.out.println(n.get(nn));
        if(n.containsKey(103)){
            System.out.println("contains the key");
        }
        if(n.containsKey(105)){
            n.remove(105);
        }
    }
}
