public class SortComparison {
    public static void main(String[] args) {
        int[] vetor1 = {12, 18, 9, 25, 17, 31, 22, 27, 16, 13, 19, 23, 20, 30, 14, 11, 15, 24, 26, 28};
        int[] vetor2 = {5, 7, 9, 10, 12, 14, 15, 17, 19, 21, 22, 23, 24, 25, 27, 28, 29, 30, 31, 32};
        int[] vetor3 = {99, 85, 73, 60, 50, 40, 35, 30, 25, 20, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6};

        int bubbleTrocas = 0, bubbleIteracoes = 0;
        int selectionTrocas = 0, selectionIteracoes = 0;
        int cocktailTrocas = 0, cocktailIteracoes = 0;

        System.out.println("\nBubble Sort com Flag de Parada");
        bubbleTrocas = testAlgorithm(new BubbleSortWithFlag(), vetor1, vetor2, vetor3)[0];
        bubbleIteracoes = testAlgorithm(new BubbleSortWithFlag(), vetor1, vetor2, vetor3)[1];

        System.out.println("\nSelection Sort");
        selectionTrocas = testAlgorithm(new SelectionSort(), vetor1, vetor2, vetor3)[0];
        selectionIteracoes = testAlgorithm(new SelectionSort(), vetor1, vetor2, vetor3)[1];

        System.out.println("\nCocktail Sort");
        cocktailTrocas = testAlgorithm(new CocktailSort(), vetor1, vetor2, vetor3)[0];
        cocktailIteracoes = testAlgorithm(new CocktailSort(), vetor1, vetor2, vetor3)[1];

        ResultTable.printResults(bubbleTrocas, bubbleIteracoes, selectionTrocas, selectionIteracoes, cocktailTrocas, cocktailIteracoes);
    }

    private static int[] testAlgorithm(Object sorter, int[] vetor1, int[] vetor2, int[] vetor3) {
        int[] result = new int[2];

        if (sorter instanceof BubbleSortWithFlag) {
            BubbleSortWithFlag bubbleSorter = (BubbleSortWithFlag) sorter;
            result[0] = bubbleSorter.sort(vetor1.clone())[0];
            result[1] = bubbleSorter.sort(vetor1.clone())[1];
        } else if (sorter instanceof SelectionSort) {
            SelectionSort selectionSorter = (SelectionSort) sorter;
            result[0] = selectionSorter.sort(vetor1.clone())[0];
            result[1] = selectionSorter.sort(vetor1.clone())[1];
        } else if (sorter instanceof CocktailSort) {
            CocktailSort cocktailSorter = (CocktailSort) sorter;
            result[0] = cocktailSorter.sort(vetor1.clone())[0];
            result[1] = cocktailSorter.sort(vetor1.clone())[1];
        }

        return result;
    }
}
