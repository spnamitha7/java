import java.util.*;
public class Reversearray {
    static void rev(int arr[]){
        int i=0;
        int j=arr.length-1;
        while(j>i){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }

    }
    public static void main(String[] args) {
        int arr[]={3,2,6,1,5,73,34};
        rev(arr);
        System.out.println(Arrays.toString(arr));
    }
    
}
