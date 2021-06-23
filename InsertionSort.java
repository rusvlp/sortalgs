/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortalgs;

import java.util.Arrays;

/**
 *
 * @author rus_VLP
 */
public class InsertionSort {
    public static void sort(int[] arr){
        int tmp = 0, buf = 0, tmpc = 0;
        
        for (int i = 1; i<arr.length; i++){
            tmp = arr[i];
            
            int j = i;
            while (j > 0 && arr[j-1] > tmp){
                arr[j] = arr[j-1];
                j--;
            }
            arr[j] = tmp;
        }
       
    }
}
