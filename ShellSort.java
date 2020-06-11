/*
Code by r00xid
*/

import java.util.*;

public class ShellSort 
{ 

    int sort(int arr[]) 
    { 
        int n = arr.length; 
  
        for (int gap = n/2; gap > 0; gap /= 2) 
        { 

            for (int i = gap; i < n; i += 1) 
            { 

                int temp = arr[i]; 
                int j; 
                for (j = i; j >= gap && arr[j - gap] < temp; j -= gap){ //j <= gap && arr[j - gap] > temp (ASC) j >= gap && arr[j - gap] < temp(Desc)
                   arr[j] = arr[j - gap];

                }  
                arr[j] = temp;

            }
        System.out.println("GAP : "+gap+" STEP "+Arrays.toString(arr)); 
        } 
        return 0; 
    } 
  
    public static void main(String args[]) 
    { 
        int arr[] = {50,82,56,77,32,90,95,88,62,99}; 
        System.out.println("Array before sorting"+Arrays.toString(arr));
  
        ShellSort ob = new ShellSort(); 
        ob.sort(arr); 
        System.out.println("Array after sorting"+Arrays.toString(arr));
    } 
}  
