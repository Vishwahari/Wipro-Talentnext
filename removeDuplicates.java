class removeDuplicates {
    public static void main(String[] args) {
        int [] arr = {12, 34, 12, 45, 67, 89};
        int n = arr.length;
        int [] unique = new int[n];
        int k = 0; // position for unique elements

        for (int i = 0; i < n; i++) {
            boolean found = false;
            for (int j = 0; j < k; j++) {
                if (arr[i] == unique[j]) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                unique[k] = arr[i]; // use k, not i
                k++;
            }
        }

        System.out.print("After eliminating duplicates: ");
        for (int i = 0; i < k; i++) {
            System.out.print(unique[i] + " ");
        }
    }
}
