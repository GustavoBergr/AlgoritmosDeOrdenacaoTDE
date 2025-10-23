public class SelectionSort {
    public static int[] sort(int[] array) {
        int n = array.length;
        int numTrocas = 0;
        int numIteracoes = 0;
        
        for (int i = 0; i < n - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < n; j++) {
                numIteracoes++;
                if (array[j] < array[minIdx]) {
                    minIdx = j;
                }
            }
            if (minIdx != i) {
                int temp = array[i];
                array[i] = array[minIdx];
                array[minIdx] = temp;
                numTrocas++;
            }
        }
        
        return new int[] {numTrocas, numIteracoes};
    }
}
