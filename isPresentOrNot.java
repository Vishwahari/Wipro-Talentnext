class isPresentOrNot{
    public static void main(String [] args){
        int [] arr = {1,4,34,56,7};
        int target  = 96;
        boolean isFound = false;
        for(int i =0;i<arr.length;i++){
            if(arr[i] == target){
                 isFound = true; 
                 System.out.print(i);
                 break;
            }
        }
        if(!isFound) System.out.print(-1);
    }
}
