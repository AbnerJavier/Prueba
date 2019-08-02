/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2_burbujas;
import java.util.Scanner;
/**
 *
 * @author AbnerJavier
 */
public class Lab2_Burbujas {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner (System.in);
        System.out.println("De que tamaño quiere su arreglo: ");
        n = sc.nextInt();
        int array[] = new int[n];
        for(int con=0;con<array.length;con++)
        {
            System.out.println("Ingrese dato "+(con+1));
            array[con] = sc.nextInt();
        }
        int aux, i, j;
        boolean swapped = false;
        do
        {
            swapped = false;
        for(i=1;i<array.length;i++)
            {
                if(array[i] < array[i-1])
                {
                    aux = array[i-1];
                    array[i-1] = array[i];
                    array[i] = aux;
                    swapped = true;
                }
            }
        }while(swapped == true);
        System.out.println("\n\nMétodo de Burbujas");
        for(j = 0;j<array.length;j++)
        {
            System.out.println(array[j]);
        }
    }
    
}
