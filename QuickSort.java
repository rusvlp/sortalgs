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
public class QuickSort {
    
    public static void sort(int[] arr, int start, int end){
        int pindex = (end - start + 1) / 2;
        boolean sorted = true;
        
        for (int i = 0; i<arr.length-1; i++)
            if (arr[i]>arr[i+1]) sorted = false;
        
        int tmp = 0;
        if (start < 0|| end < 0){
            start = 0;
            end = arr.length-1;
        } else if (start == end || pindex == start || pindex == end) return;
       
      
        int pivot = arr[pindex];
        
        for (int i = start, j = end; i<pindex; i++, j--){
            if (arr[i] > pivot){
                tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
                
                
            }
        }
        
        if (sorted) return;
        /*
        System.out.print("Start - ");
        System.out.print(start);
        System.out.print(" Pindex - ");
        System.out.print(pindex);
        System.out.print(" End - ");
        System.out.print(end);
        System.out.print(" Array:");
        System.out.println(Arrays.toString(arr));
        */
        sort(arr, start, pindex);
        sort(arr, pindex, end);
        
        
        
        return;
    }
    
    public static int[] sortNew(int[] arr){
        int[] res = new int[arr.length];
        
        for (int i = 0; i<arr.length; i++) res[i] = arr[i];
        
        int end = arr.length-1;
        sort(res, 0, end);
        return res;
    }
}
