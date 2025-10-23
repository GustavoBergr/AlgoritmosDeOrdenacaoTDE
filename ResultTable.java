public class ResultTable {
    public static void printResults(int bubbleTrocas, int bubbleIteracoes, 
                                     int selectionTrocas, int selectionIteracoes, 
                                     int cocktailTrocas, int cocktailIteracoes) {
        // Ranqueando os algoritmos com base nas trocas
        String[] trocasRanking = rankAlgorithmsByTrocas(bubbleTrocas, selectionTrocas, cocktailTrocas);
        String[] iteracoesRanking = rankAlgorithmsByIteracoes(bubbleIteracoes, selectionIteracoes, cocktailIteracoes);

        System.out.println("\nRanqueamento de Algoritmos com Menos Trocas:");
        System.out.println("| Posição | Algoritmo        | Trocas |");
        System.out.println("|---------|------------------|--------|");
        System.out.printf("| %-7s | %-16s | %-6d |\n", "1º", trocasRanking[0], getTrocas(trocasRanking[0], bubbleTrocas, selectionTrocas, cocktailTrocas));
        System.out.printf("| %-7s | %-16s | %-6d |\n", "2º", trocasRanking[1], getTrocas(trocasRanking[1], bubbleTrocas, selectionTrocas, cocktailTrocas));
        System.out.printf("| %-7s | %-16s | %-6d |\n", "3º", trocasRanking[2], getTrocas(trocasRanking[2], bubbleTrocas, selectionTrocas, cocktailTrocas));

        System.out.println("\nRanqueamento de Algoritmos com Menos Interações:");
        System.out.println("| Posição | Algoritmo        | Iterações |");
        System.out.println("|---------|------------------|-----------|");
        System.out.printf("| %-7s | %-16s | %-9d |\n", "1º", iteracoesRanking[0], getIteracoes(iteracoesRanking[0], bubbleIteracoes, selectionIteracoes, cocktailIteracoes));
        System.out.printf("| %-7s | %-16s | %-9d |\n", "2º", iteracoesRanking[1], getIteracoes(iteracoesRanking[1], bubbleIteracoes, selectionIteracoes, cocktailIteracoes));
        System.out.printf("| %-7s | %-16s | %-9d |\n", "3º", iteracoesRanking[2], getIteracoes(iteracoesRanking[2], bubbleIteracoes, selectionIteracoes, cocktailIteracoes));
    }

    private static String[] rankAlgorithmsByTrocas(int bubbleTrocas, int selectionTrocas, int cocktailTrocas) {
        if (bubbleTrocas <= selectionTrocas && bubbleTrocas <= cocktailTrocas) {
            return selectionTrocas <= cocktailTrocas
                    ? new String[]{"BubbleSort", "SelectionSort", "CocktailSort"}
                    : new String[]{"BubbleSort", "CocktailSort", "SelectionSort"};
        } else if (selectionTrocas <= bubbleTrocas && selectionTrocas <= cocktailTrocas) {
            return bubbleTrocas <= cocktailTrocas
                    ? new String[]{"SelectionSort", "BubbleSort", "CocktailSort"}
                    : new String[]{"SelectionSort", "CocktailSort", "BubbleSort"};
        } else {
            return bubbleTrocas <= selectionTrocas
                    ? new String[]{"CocktailSort", "BubbleSort", "SelectionSort"}
                    : new String[]{"CocktailSort", "SelectionSort", "BubbleSort"};
        }
    }

    private static String[] rankAlgorithmsByIteracoes(int bubbleIteracoes, int selectionIteracoes, int cocktailIteracoes) {
        if (bubbleIteracoes <= selectionIteracoes && bubbleIteracoes <= cocktailIteracoes) {
            return selectionIteracoes <= cocktailIteracoes
                    ? new String[]{"BubbleSort", "SelectionSort", "CocktailSort"}
                    : new String[]{"BubbleSort", "CocktailSort", "SelectionSort"};
        } else if (selectionIteracoes <= bubbleIteracoes && selectionIteracoes <= cocktailIteracoes) {
            return bubbleIteracoes <= cocktailIteracoes
                    ? new String[]{"SelectionSort", "BubbleSort", "CocktailSort"}
                    : new String[]{"SelectionSort", "CocktailSort", "BubbleSort"};
        } else {
            return bubbleIteracoes <= selectionIteracoes
                    ? new String[]{"CocktailSort", "BubbleSort", "SelectionSort"}
                    : new String[]{"CocktailSort", "SelectionSort", "BubbleSort"};
        }
    }

    private static int getTrocas(String algorithm, int bubbleTrocas, int selectionTrocas, int cocktailTrocas) {
        switch (algorithm) {
            case "BubbleSort":
                return bubbleTrocas;
            case "SelectionSort":
                return selectionTrocas;
            case "CocktailSort":
                return cocktailTrocas;
            default:
                return 0;
        }
    }

    private static int getIteracoes(String algorithm, int bubbleIteracoes, int selectionIteracoes, int cocktailIteracoes) {
        switch (algorithm) {
            case "BubbleSort":
                return bubbleIteracoes;
            case "SelectionSort":
                return selectionIteracoes;
            case "CocktailSort":
                return cocktailIteracoes;
            default:
                return 0;
        }
    }
}
