package burbuja;

import java.util.Random;
/**
 *
 * @author juan carlos quiroz aguilar
 */
public class Burbuja {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int tam = 10;
        int aux ;
        int [] A = new int[tam];
        Random rd = new Random();
        
        for (int i = 0; i < A.length; i++) {
            A[i]= rd.nextInt(100) + 1;
        }
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + ",");
        }
        System.out.println("");
        
        for (int i = 0; i < A.length - 1; i++) {
            for (int j = 0; j < A.length - i - 1; j++) {
                if (A[j+1] < A[j]) {
                    aux = A[j+1];
                    A[j+1] = A[j];
                    A[j] = aux;
                }
            }
        }
        
        System.out.println("El arreglo se ordeno");
        
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + ",");
        }
        System.out.println("");
        
    }    
}

