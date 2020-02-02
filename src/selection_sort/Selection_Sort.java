/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package selection_sort;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class Selection_Sort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        System.out.println("Enter size: "); 
        int size = sc.nextInt();
        int[] arr = new int[size];
       
        System.out.println("Enter "+size+" Elements:");     
        for (int i = 0; i < size; i++) {
             arr[i] = sc.nextInt();
        }
        for (int i = 0; i < size; i++) {
            int min = arr[i];
            int minA=i;
            for (int j = i+1; j < size; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    minA = j;
                }
            }
            int temp = arr[i];
            arr[i]= min;
            arr[minA] = temp;
        }
        System.out.println("Sorted Array:");
            for (int i= 0; i < size; i++) {
            System.out.println(arr[i]);
            
            }
    }
    
}
