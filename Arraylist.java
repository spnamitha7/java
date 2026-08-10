import java.util.*;
public class Arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> n=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<5;i++){
            n.add(sc.nextInt());
        }
        for(int i=0;i<n.size();i++){
            if(n.get(i).equals(30)){
                n.remove(i);
            }
        }
        for(int i=0;i<n.size();i++){
            if(n.get(i).equals(40)){
                n.set(i,45);
            }
        }
        for(int i=0;i<n.size();i++){
            System.out.println(n.get(i));
        }
        System.out.println(n.size());
sc.nextLine();
        ArrayList<String> nee=new ArrayList<>();
        for(int i=0;i<5;i++){
            nee.add(sc.nextLine());
        }
        boolean found=false;
        for(int i=0;i<nee.size();i++){
            if(nee.get(i).equalsIgnoreCase("ravi")){
                System.out.println("ravi is found");
                nee.remove(i);
                  found=true;
                  break;
            }
        }
        if(!found){
            System.out.println("Not found");
        }
        for(int i=0;i<nee.size();i++){
            System.out.print(nee.get(i)+ " ");
        }
    }
}
