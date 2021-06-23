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
        
        for (int i = 0; i<arr.length-1; i++){
            tmp = arr[i+1];
            for (int j = 0; j<i; j++){
              if (tmp<arr[j]){
                  arr[j] = tmp;
                  buf++;
              }
              tmpc = arr[j+buf];
              arr[j+buf] = arr[j];
              arr[j] = tmp;
              System.out.println(Arrays.toString(arr));
            }
        }
    }
}
