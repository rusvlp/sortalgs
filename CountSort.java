/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortalgs;

import java.util.Arrays;

/**
 *
 * @author Vlad
 */
public class CountSort {
    
    public static void sort(int[] arr){
        int min = arr[0], max = arr[0], tmp = 0;
        for (int i = 0; i<arr.length; i++){       // нашли минимальное и максимальное число в массиве
            if (arr[i]>max) max = arr[i];
            if (arr[i]<min) min = arr[i];
        }
        
        int size = max - min + 1;
        
        int nums[] = new int[size];
        
        for (int i = 0; i<arr.length; i++){
            nums[arr[i]-min]++;
        }
        
        for (int i = 0, k = 0; i<nums.length; i++)
           for (int j = 0; j<nums[i]; j++){
               arr[k] = i+min;
               k++;
        }
       
    }
    
    public static int[] sortNew(int[] arr){
        int[] res = new int[arr.length];
        for (int i = 0; i<res.length; i++) res[i] = arr[i];
        
        sort(res);
        
        return res;
    }
}
