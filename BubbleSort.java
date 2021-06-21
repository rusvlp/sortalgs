/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortalgs;

/**
 *
 * @author Vlad
 */
public class BubbleSort {
    
    public static void sort(int[] arr){
        int tmp = 0;
        boolean sorted = true;
        
        while (true){
            for (int i = 0; i<arr.length-1; i++){
                if (arr[i]>arr[i+1]){
                    tmp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = tmp;
                    
                    sorted = false;
                }
            }
            if (sorted) return;
            sorted = true;
        }
    }
    
    public static int[] sortNew(int[] arr){
        int[] res = new int[arr.length];
        
        for (int i = 0; i<arr.length; i++) res[i] = arr[i];
        
        sort(res);
        return res;
    }
}
