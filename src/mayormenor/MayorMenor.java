/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mayormenor;

import java.util.Scanner;

/**
 *
 * @author kirito205
 */
public class MayorMenor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("dame el numero absoluto");
        Scanner leerNumero=new Scanner(System.in);
        Scanner leerNumero2=new Scanner(System.in);
        Scanner leerNumero3=new Scanner(System.in);
        int[] numeroArreglo=new int[3];
        numeroArreglo[0]=leerNumero.nextInt();
        numeroArreglo[1]=leerNumero2.nextInt();
        numeroArreglo[2]=leerNumero3.nextInt();
        int Mayor=numeroArreglo[0];
        int Menor=numeroArreglo[1];
        for (int i = 0; i < 3; i++) {
            if (Mayor<numeroArreglo[i]) {
                Mayor=numeroArreglo[i];
            }
            if (Menor>numeroArreglo[i]) {
                Menor=numeroArreglo[i];
            }
        }
        System.out.println("menor:"+Menor+"mayor:"+Mayor);
    }
    
}
