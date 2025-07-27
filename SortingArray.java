class SortingArray {
    public static void main(String[] args) {
        int[] arr = {50, 20, 10, 30};

        Arrays.sort(arr);  // sorts in ascending order

        System.out.print("Sorted array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
