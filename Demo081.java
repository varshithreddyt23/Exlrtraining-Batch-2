class Demo081 {
    public static void main(String[] args) {
        int[] array = {16, 17, 4, 3, 5, 2};
        printLeaders(array);
    }

    public static void printLeaders(int[] array) {
        int n = array.length;
        int maxFromRight = array[n - 1];
        System.out.print(maxFromRight + " ");  // Last element is always a leader

        for (int i = n - 2; i >= 0; i--) {
            if (array[i] > maxFromRight) {
                maxFromRight = array[i];
                System.out.print(maxFromRight + " ");
            }
        }
    }
}
