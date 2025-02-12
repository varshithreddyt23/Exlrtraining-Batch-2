class Demo080 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        shiftLeftAndMoveFirstToLast(array); 
        for (int i : array) {
            System.out.print(i + " ");
        }
    }

    public static void shiftLeftAndMoveFirstToLast(int[] array) {
        if (array == null || array.length <= 1) {
            return;
        }

        int firstElement = array[0];
        for (int i = 0; i < array.length - 1; i++) {
            array[i] = array[i + 1];
        }
        array[array.length - 1] = firstElement;
    }
}
