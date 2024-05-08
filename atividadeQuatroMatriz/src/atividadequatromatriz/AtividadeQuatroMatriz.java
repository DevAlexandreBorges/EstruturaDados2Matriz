/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividadequatromatriz;

/**
 *
 * @author aborg
 */
public class AtividadeQuatroMatriz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[][] matriz1 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int[][] matriz2 = {
            {9, 8, 7},
            {6, 5, 4},
            {3, 2, 1}
        };

        int[][] resultado = multiplicarMatrizes(matriz1, matriz2);

        System.out.println("Matriz 1:");
        imprimirMatriz(matriz1);

        System.out.println("\nMatriz 2:");
        imprimirMatriz(matriz2);

        System.out.println("\nResultado da multiplicacao:");
        imprimirMatriz(resultado);
    }

    public static int[][] multiplicarMatrizes(int[][] matriz1, int[][] matriz2) {
        int linhas1 = matriz1.length;
        int colunas1 = matriz1[0].length;
        int colunas2 = matriz2[0].length;

        int[][] resultado = new int[linhas1][colunas2];

        for (int i = 0; i < linhas1; i++) {
            for (int j = 0; j < colunas2; j++) {
                for (int k = 0; k < colunas1; k++) {
                    resultado[i][j] += matriz1[i][k] * matriz2[k][j];
                }
            }
        }

        return resultado;
    }

    public static void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
    }
    

