import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    static int[] merge(int[] arr1, int[] arr2){
        int n1 = arr1.length;
        int n2 = arr2.length;
        int[] result = new int[n1 + n2];
        int i = 0, j = 0, k = 0; 
        
        while (i < n1 && j < n2) {
            if (arr1[i] <= arr2[j]) {
                result[k] = arr1[i];
                k++;
                i++;
            } 
            else{
                result[k] = arr2[j];
                k++;
                j++;
            }
        }
        

        while (i < n1){
            result[k] = arr1[i];
            k++;
            i++;
        } 
        while (j < n2){
            result[k] = arr2[j];
            k++;
            j++;
        } 
        
        return result;
    }
    
    public static void main (String[] args) throws java.lang.Exception
    {
        int[] arr1 = {10,30,50};
        int[] arr2 = {20,40,60};
        
        System.out.println(Arrays.toString(merge(arr1, arr2)));
    }
}

