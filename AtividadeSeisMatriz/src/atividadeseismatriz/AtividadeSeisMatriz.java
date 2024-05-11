/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividadeseismatriz;

import java.util.Scanner;

/**
 *
 * @author GabrielVM
 */
public class AtividadeSeisMatriz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Cria matrizes quadradas
        System.out.println("Matriz 1:");
        int[][] matriz = inputMatriz(4);

        int input = 0;
        do {
            //Menu
            input = menu();

            System.out.println();

            switch (input) {
                case 1 ->
                    printMatriz(matriz);
                case 2 ->
                    somaQuadradosColuna(matriz, 0);
                case 3 ->
                    somaLinha(matriz, 2);
                case 4 ->
                    somaDiagonalPrincipal(matriz);
                case 5 ->
                    somaLinhaIndexPares(matriz, 1);
            }
        } while (input != 6);

    }

    private static void printMatriz(int[][] matriz) {

        for (int[] m : matriz) {
            System.out.print("| ");
            for (int y = 0; y < m.length; y++) {
                int totalWidth = 10;
                int padding = (totalWidth - String.valueOf(m[y]).length()) / 2;
                System.out.printf("%" + padding / 2 + "d%" + padding / 2 + "s", m[y], "");
            }
            System.out.println("|");
        }

    }

    private static void somaQuadradosColuna(int[][] matriz, int coluna) {
        //Validar se coluna existe
        if (coluna < 0 || coluna > matriz.length) {
            System.out.println("A coluna não existe no contexto!");
        }

        //Calcular
        int somaDosQuadrados = 0;
        for (int[] c : matriz) {
            somaDosQuadrados += (int) Math.pow(c[coluna], 2);
        }

        //Exibir na tela
        System.out.println("Coluna " + (coluna + 1) + ": ");
        printColumn(matriz, coluna);
        System.out.print("Soma dos quadrados: " + somaDosQuadrados);
        System.out.println();
    }

    private static void somaLinha(int[][] matriz, int linha) {

        int somaDaLinha = 0;
        for (int c : matriz[linha]) {
            somaDaLinha += c;
        }

        //Exibir na tela
        System.out.print("Linha " + (linha + 1) + ": ");
        printLine(matriz[linha]);
        System.out.print("Soma da linha: " + somaDaLinha);
        System.out.println();
    }

    private static void somaLinhaIndexPares(int[][] matriz, int linha) {
        //Calcular
        int[] vSoma = null;
        int iVSoma = 0;
        vSoma = new int[matriz.length / 2];

        int somaDaLinha = 0;
        for (int i = 0; i < matriz[linha].length; i++) {
            if (i % 2 == 0) {
                somaDaLinha += matriz[linha][i];
                vSoma[iVSoma++] = matriz[linha][i];
            }
        }

        //Exibir na tela
        System.out.print("Indices pares linha " + (linha + 1) + ": ");
        printLine(vSoma);
        System.out.print("Soma dos indices pares da linha: " + somaDaLinha);
        System.out.println();
    }

    private static void somaDiagonalPrincipal(int[][] matriz) {
        //Soma diagonal
        int[] diagonal = new int[matriz.length];
        int soma = 0;
        for (int i = 0; i < matriz.length; i++) {
            soma += matriz[i][i];
            diagonal[i] = matriz[i][i];
        }

        //Exibir na tela
        System.out.print("Diagonal principal: ");
        printLine(diagonal);
        System.out.print("Soma diagonal principal: " + soma);
        System.out.println();
    }

    private static int menu() {

        System.out.println();
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("| 1  -  Imprimir matriz                                                  |");
        System.out.println("| 2  -  Somar os quadrados de todos os elementos da primeira coluna      |");
        System.out.println("| 3  -  Somar todos os elementos da terceira linha                       |");
        System.out.println("| 4  -  Somar os elementos da diagonal principal                         |");
        System.out.println("| 5  -  Somar todos os elementos de índice par da segunda linha          |");
        System.out.println("| 6  -  Sair                                                             |");
        System.out.println("--------------------------------------------------------------------------");
        System.out.println();
        Scanner input = new Scanner(System.in);

        int intInput = 0;
        System.out.print("Didite uma opção: ");
        intInput = input.nextInt();
        while (intInput < 1 || intInput > 6) {
            System.out.print("Didite uma opção entre 1 e 6: ");
            intInput = input.nextInt();
        }

        return intInput;
    }

    private static int[][] inputMatriz(int size) {

        Scanner input = new Scanner(System.in);

        int[][] matriz = new int[size][size];

        for (int x = 0; x < size; x++) {
            for (int y = 0; y < size; y++) {
                System.out.print("Digite o valor da posição [" + x + "][" + y + "]: ");
                matriz[x][y] = input.nextInt();
            }
        }

        System.out.print("\n");

        return matriz;

    }

    private static void printLine(int[] vetor) {

        String txt = "";
        for (int v : vetor) {
            txt += " " + v + ",";
        }

        txt = "[" + txt.substring(1, txt.length() - 1) + "]";

        System.out.println(txt);
    }

    private static void printColumn(int[][] vetor, int coluna) {

        for (int[] v : vetor) {
            System.out.print("| ");
            int totalWidth = 10;
            int padding = (totalWidth - String.valueOf(v[coluna]).length()) / 2;
            System.out.printf("%" + padding / 2 + "d%" + padding / 2 + "s", v[coluna], "");
            System.out.println("|");
        }
    }
}
