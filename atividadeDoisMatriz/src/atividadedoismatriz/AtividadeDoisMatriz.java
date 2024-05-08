/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividadedoismatriz;

/**
 *
 * @author aborg
 */
public class AtividadeDoisMatriz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        double[][] matriz = new double[50][50];
        entraMatriz(matriz);
        double[] diagonalPrincipal = extraiDiagonal(matriz);
        imprimirVetor(diagonalPrincipal);
    }

    public static void entraMatriz(double[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                //entra numeros aleatorios ate 99
                matriz[i][j] = (int) (Math.random() * 100);
            }
        }
    }

    public static double[] extraiDiagonal(double[][] matriz) {
        double[] diagonalPrincipal = new double[matriz.length];
        for (int i = 0; i < matriz.length; i++) {
            diagonalPrincipal[i] = matriz[i][i];
        }
        return diagonalPrincipal;
    }

    public static void imprimirVetor(double[] vetor) {
        System.out.println("Conteudo da diagonal principal: ");
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }
    }

}
