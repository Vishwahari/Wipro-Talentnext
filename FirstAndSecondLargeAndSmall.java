class FirstAndSecondLargeAndSmall{
    public static void main(String[] args){
        int [] arr = {10, 4, 50, 25, 30};
        int largest1 = arr[0];
        int largest2 = arr[0];
        int smallest1 = arr[0];
        int smallest2 = arr[0];

        for(int i =1;i<arr.length;i++){
            if(largest1<arr[i]){
                largest2 = largest1;
                largest1 = arr[i];
            }
            else if (arr[i] > largest2 && arr[i] != largest1) {
                 largest2 = arr[i];
            }

            if(smallest1>arr[i]){
                smallest2 = smallest1;
                smallest1 = arr[i];
            }
            else if(arr[i]<smallest2 && arr[i]!=smallest1){
                smallest2  = arr[i];
            }
        }
        System.out.println("1st largest number: "+largest1+" Second Largest number: "+largest2);
        System.out.println("1st smallest number: "+smallest1+" Second smallest number: "+smallest2);
    }
}
