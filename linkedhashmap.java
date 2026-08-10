import java.util.*;
public class linkedhashmap {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        LinkedHashMap<Integer,String> n=new LinkedHashMap<>();
        for(int i=0;i<5;i++){
            int num=sc.nextInt();
            sc.nextLine();
            String s=sc.nextLine();
            n.put(num,s);
        }
        if(n.containsKey(103)){
            System.out.println(n.get(103));
        }
        if(n.containsKey(105)){
            n.remove(105);
        }
        for(Map.Entry<Integer,String> entry:n.entrySet()){
System.out.println(entry.getKey()+ "  "+entry.getValue());
        }
    }
}
