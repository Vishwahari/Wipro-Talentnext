import java.util.*;
public class WithoutTen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr  = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int index = 0;
        for(int i=0;i<n;i++){
            if(arr[i]!=10){
                arr[index] = arr[i];
                index++;
            }
        }

        for(int i =index;i<n;i++){
            arr[i]=0;
        }
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) { 
                System.out.print(",");
            }
        }
        System.out.print("]");
    }
}
