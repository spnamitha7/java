import java.util.Scanner;
public class loop {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(i +" * "+ n +" = " +i*n);
        }
        int i=1;
        while(i<=10){
            System.out.println(i + " * "+ n + " = "+i*n);
            i++;
        }
         int k=1;
        do{
            System.out.println(k + " * "+ n+" = "+k*n);
            k++;
        }while(k<=10);
    }
}
