/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividadeummatriz;

/**
 *
 * @author aborg
 */
public class AtividadeUmMatriz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int [][] mat = new int[10][15];
        
        entraMatriz(mat);
        imprimiLinha(mat);
        imprimiColuna(mat);
     }   
        public static void entraMatriz(int[][] mat){
            for (int i = 0; i < mat.length;  i++){
                for(int j =0; j < mat[0].length; j++){
                    //entra numeros aleatorios ate 99
                    mat[i][j] = (int) (Math.random()*100);
                }
            }
        }
        
        public static void imprimiLinha(int[][] mat){
           for(int i =0; i < mat.length;i++){ 
               int soma = 0;
               for(int j = 0 ;j < mat[0].length;j++){
                   soma += mat[i][j];
               }
               System.out.println("Soma dos elementos da linha " +(i+1)+ ":" +soma+ "(" + (soma % 2 ==0 ? "par" : "impar") + ")") ;
           }
        }
        
        public static void imprimiColuna(int[][] mat){
            for(int j = 0; j < mat[0].length; j ++){
                int soma = 0;
                for(int i = 0; i < mat.length; i++){
                    soma += mat[i][j];
                }
                System.out.println("Soma dos elementos da coluna " + (j + 1) + ": " + soma + " (" + (soma % 2 == 0 ? "par" : "impar") + ")");
            }
        }
    
    
}
