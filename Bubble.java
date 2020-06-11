/*
Code by r00xid
*/

import java.util.*;

public class Bubble
{
    void bubbleSort(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n-1; i++){
            for (int j = 0; j < n-i-1; j++){
                if (arr[j] > arr[j+1]) // if arr[j] > arr[j+1] (Ascending) elif if arr[j] < arr[j+1]
                {
                    // swap temp and arr[i]
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
            System.out.println("Step ke- : "+(i+1)+Arrays.toString(arr));
        }
    }
 

    public static void main(String args[])
    {
        Bubble ob = new Bubble();
        int arr[] = {7,4,5,8,10};
        System.out.println("NOT Sorted : "+Arrays.toString(arr));
        ob.bubbleSort(arr);
        System.out.println("Sorted : "+Arrays.toString(arr));
        
    }
}