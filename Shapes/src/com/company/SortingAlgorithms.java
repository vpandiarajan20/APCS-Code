
package com.company;

public class SortingAlgorithms {
    public static void selectionSort(int[] a){
        int storage=0;
        for(int i=0; i<a.length-1; i++){
            for(int j=i+1; j<a.length; j++){
                if(a[i] > a[j]){
                    storage = a[i];
                    a[i] = a[j];
                    a[j] = storage;
                }
            }
        }
    }
    public static void selectionSort(Comparable[] a){
        Comparable storage;
        for(int i=0; i<a.length-1; i++){
            for(int j=i+1; j<a.length; j++){
                if(a[i].compare(j)==1){
                    storage = a[i];
                    a[i] = a[j];
                    a[j] = storage;
                }
            }
        }
    }
}


