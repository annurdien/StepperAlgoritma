/*
Code by r00xid
*/

import java.util.*;
public class InsertionSort { 

   public void sort(int arr[]) 
    { 
        int n = arr.length; 
        for (int i = 1; i < n; ++i) { 
            int key = arr[i]; 
            int j = i - 1; 
            while (j >= 0 && arr[j] > key) { //if arr[j] > key (Ascending) else if arr[j] < key (Ascending)
                arr[j + 1] = arr[j]; 
                j = j - 1; 
            } 
            arr[j + 1] = key;
            System.out.println("Step ke -"+(i+1)+Arrays.toString(arr)); 
        } 
    } 
  

    public static void main(String args[]) 
    { 
        int arr[] = { 5,2,4,6,1,3 }; 
        System.out.println("Step ke -1 "+Arrays.toString(arr)); 
        InsertionSort ob = new InsertionSort(); 
        ob.sort(arr); 
  
        System.out.println(Arrays.toString(arr)); 
    } 
} 