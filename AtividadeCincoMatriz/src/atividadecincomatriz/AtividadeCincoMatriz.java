/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividadecincomatriz;

import java.util.Random;

/**
 *
 * @author GabrielVM
 */
public class AtividadeCincoMatriz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Gerar numero aleatório para tamanho da matriz
        Random rand = new Random(System.currentTimeMillis());

        //Gera numero entre 2 e 10
        int numMatriz = rand.nextInt((10 - 2) + 1) + 2;
        
        //Cria matrizes quadradas
        int[][] Matriz1 = gerarMatriz(numMatriz);
        int[][] Matriz2 = gerarMatriz(numMatriz);

        //Exibir no terminal
        System.out.println("Matriz 1:");
        printMatriz(Matriz1);

        System.out.println("\nMatriz 2:");
        printMatriz(Matriz2);

        System.out.println("\nSoma Matriz 1 e 2:");
        printMatriz(somaMatriz(Matriz1, Matriz2));

    }

    private static int[][] somaMatriz(int[][] matriz1, int[][] matriz2) {
        if ((matriz1.length != matriz2.length) || (matriz1[0].length != matriz2[0].length)) {
            //As matrizes possuem tamanhos diferentes, não podem ser somadas.
            return null;
        }

        int xLength = matriz1.length;
        int yLength = matriz1[0].length;

        int[][] retrunMatriz = new int[xLength][yLength];

        for (int x = 0; x < xLength; x++) {
            for (int y = 0; y < yLength; y++) {
                retrunMatriz[x][y] = matriz1[x][y] + matriz2[x][y];
            }
        }

        return retrunMatriz;
    }

    private static int[][] gerarMatriz(int size) {

        Random rand = new Random(System.nanoTime());

        int minimo = 5;
        int maximo = 100;

        int[][] matriz = new int[size][size];
        
        for (int x = 0; x < size; x++) {
            for (int y = 0; y < size; y++) {
                //gera um numero entre <minimo> e o <maximo>.
                matriz[x][y] = rand.nextInt((maximo - minimo) + 1) + minimo;
            }
        }
        
        return matriz;
    }

    private static void printMatriz(int[][] matriz) {

        for (int x = 0; x < matriz.length; x++) {
            System.out.print("| ");
            for (int y = 0; y < matriz[x].length; y++) {
                int totalWidth = 10;
                int padding = (totalWidth - String.valueOf(matriz[x][y]).length()) / 2;
                System.out.printf("%"+padding/2+"d%"+padding/2+"s", matriz[x][y],"");
            }
            System.out.println("|");
        }

    }

}
