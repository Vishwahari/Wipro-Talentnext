class MinAndMax{
    public static void main(String [] args){
        int [] arr = {10,30,50,5,60};
        int max =arr[0];
        int min =arr[0];
        for(int i = 1 ;i<arr.length;i++){
            if(max<arr[i]) max = arr[i];

            if(min>arr[i]) min =arr[i];
        }
        System.out.println("MAX: "+max);
        System.out.println("Min: "+min);

    }
}
