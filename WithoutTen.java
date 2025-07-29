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

        for(int a:arr){
            System.out.print(a);
        }
    }
}
