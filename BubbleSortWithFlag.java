public class BubbleSortWithFlag {
    public static int[] sort(int[] array) {
        int n = array.length;
        int numTrocas = 0;
        int numIteracoes = 0;
        boolean swapped;
        
        do {
            swapped = false;
            for (int i = 1; i < n; i++) {
                numIteracoes++;
                if (array[i - 1] > array[i]) {
                    int temp = array[i - 1];
                    array[i - 1] = array[i];
                    array[i] = temp;
                    numTrocas++;
                    swapped = true;
                }
            }
            n--;
        } while (swapped);
        
        return new int[] {numTrocas, numIteracoes};
    }
}
