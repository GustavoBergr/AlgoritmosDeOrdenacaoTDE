public class CocktailSort {
    public static int[] sort(int[] array) {
        int n = array.length;
        int numTrocas = 0;
        int numIteracoes = 0;
        boolean swapped = true;
        
        while (swapped) {
            swapped = false;
            for (int i = 0; i < n - 1; i++) {
                numIteracoes++;
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    numTrocas++;
                    swapped = true;
                }
            }
            if (!swapped) break;
            swapped = false;
            n--;
            for (int i = n - 2; i >= 0; i--) {
                numIteracoes++;
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    numTrocas++;
                    swapped = true;
                }
            }
        }
        
        return new int[] {numTrocas, numIteracoes};
    }
}
