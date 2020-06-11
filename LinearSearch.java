/*
Code by r00xid
*/

import java.util.*;

public class LinearSearch  
{  
public static int search(int arr[], int x) 
{ 
    System.out.println("LIST = { "+Arrays.toString(arr)+" }");
    System.out.println("i=0, x="+x);
    int n = arr.length; 
    for(int i = 0; i < n; i++) 
    { 

        if(arr[i] == x){
            System.out.println("Index {"+i+"} "+arr[i]+" == "+x+" [EQUAL] "); 
            return i;
        }else if (arr[i] != x) {
            System.out.println("Index {"+i+"} "+arr[i]+" != "+x+" [NOT EQUAL] "); 
        }    
     System.out.println("i = "+i+" + 1 = "+(i+1) );       
    } 
    return -1;
} 
  
public static void main(String args[]) 
{ 
    int arr[] = { 2, 3, 4, 10, 40 };  
    int x = 10; 
      
    int result = search(arr, x); 
    if(result == -1) 
        System.out.print("Element is not present in array"); 
    else
        System.out.print("Element is present at index " + result); 
} 
} 