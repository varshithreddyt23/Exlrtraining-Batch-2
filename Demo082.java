class Demo082 {
    public static void main(String[] args) {
        int[] array1 = {1, 3, 5};
        int[] array2 = {2, 4, 6};
        int[] mergedArray = mergeArrays(array1, array2);
        for (int i : mergedArray) {
            System.out.print(i + " ");
        }
    }

    public static int[] mergeArrays(int[] array1, int[] array2) {
        int[] mergedArray = new int[array1.length + array2.length];
        int index = 0;
        for (int i = 0; i < array1.length; i++) {
            mergedArray[index++] = array1[i];
        }
        for (int i = 0; i < array2.length; i++) {
            mergedArray[index++] = array2[i];
        }

        return mergedArray;
    }
}
