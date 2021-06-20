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
public class SortAlgs {


    public static void main(String[] args) {
       int[] arr = {1, 56, 23, 78, 15};
       
       System.out.println(Arrays.toString(arr));
       int[] res = QuickSort.sortNew(arr);
       System.out.println(Arrays.toString(res));
    }
    
}


