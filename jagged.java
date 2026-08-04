import java.util.*;
public class jagged {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[][]=new int[n][];
        for(int i=0;i<n;i++){
            int col=sc.nextInt();
            arr[i]=new int[col];
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        int sum=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<arr[i].length;j++){
                sum+=arr[i][j];
            }
        }
System.out.println(sum);

int lar=arr[0][0];
for(int i=0;i<n;i++){
    for(int j=0;j<arr[i].length;j++){
        if(arr[i][j]>=lar){
            lar=arr[i][j];
        }
    }
}
System.out.println(lar);
    }
}
