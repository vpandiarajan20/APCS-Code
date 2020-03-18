package com.company;

public class Main {

    public static void main(String[] args) {
// Uncomment the tests as you are ready.
        System.out.println("min(3,4)\t3\t" + min(3,4));
        System.out.println("min(4,3)\t3\t" + min(3,4));
        int[] a = {1,5,3,7,2,65,8};
        int[] b = {9,6,34,23,8,6,5,3,2};
        System.out.println("min(a)\t\t1\t" + min(a));
        System.out.println("min(b)\t\t2\t" + min(b));
        System.out.println("add(a,b)\t{10,11,37,30,10,71,13,3,2}\t" + pp(add(a,b)));
        int[] c = copy(a);
        c[0] = 5;
        System.out.println("copy(a)\t\t1\t"+a[0]);
        System.out.println("resize(a,3)\t{1,5,3}\t" + pp(resize(a,3)));
        System.out.println("resize(a,3)\t7\t" + a.length);
        System.out.println("resize(a,9)\t{1,5,3,7,2,65,8,0,0}\t" + pp(resize(a,9)));
        System.out.println("resize(a,9)\t7\t" + a.length);
        int[] d = {1,2,3,4};
        int[] e = {5,6,7};
        System.out.println("append(d,e)\t{1,2,3,4,5,6,7}\t" + pp(append(d,e)));
        System.out.println("append(d,e)\t4\t" + d.length);
        System.out.println("append(d,e)\t3\t" + e.length);
        System.out.println("append(null,e)\t{5,6,7}\t\t" + pp(append(null,e)));
        System.out.println("append(d,null)\t{1,2,3,4}\t" + pp(append(d,null)));
        System.out.println("subArray(a,3,5)\t{7,2}\t" + pp(subArray(a,3,5)));
        System.out.println("subArray()\t7\t" + a.length);
        System.out.println("subArray(a,4,7)\t{2,65,8}\t" + pp(subArray(a,4,7)));
        System.out.println("subArray(a,3,3)\tnull\t" + pp(subArray(a,3,3)));
        System.out.println("subArray(a,5,3)\tnull\t" + pp(subArray(a,5,3)));
        makeSorted(a);
        System.out.println("makeSorted(a)\t{1,2,3,5,7,8,65}\t" + pp(a));
        System.out.println("sort(b)\t{2,3,5,6,6,8,9,23,34}\t" + pp(sort(b)));
        System.out.println("merge(a,d)\t{1,1,2,2,3,3,4,5,7,8,65}\t" + pp(merge(a,d)));
    }
    public static int min(int a, int b) {
        if(a>b)
            return b;
        else if (b == a)
            return 0;
        return a;
        // Returns the smaller of a and b.
    }
    public static int min(int[] a)
    {
        int returnValue = min(a[0],a[1]);
        for(int i = 2; i<a.length;i++)
            returnValue = min(returnValue,a[i]);
        return returnValue;
        // Returns the smallest element.
    }
    public static int[] add(int[] a, int[] b) {
        if (a.length < b.length) {
            int add[] = new int[b.length];
            for (int i = 0; i < b.length; i++){
                if(i>=a.length)
                    add[i] = b[i];
                else
                    add[i] = (a[i] + b[i]);
            }

            return add;
        }
        int add[] = new int[b.length];
        for (int i = 0; i < a.length; i++)
            add[i] = (a[i] + b[i]);
        return add;
        // Add elements by index. Ex, {1,2,3} + {4,5,6} =>
        //{5,7,9}. If the arrays are different sizes, add corresponding elements and do
        //nothing with the others. {1,2}+{1,2,3} => {2,4,3}
    }

    public static String pp(int[] a) {
        if(a == null)
            return null;
        String s = "{";
        for(int i = 0; i<a.length; i++)
            s += a[i] + ",";
        // Returns a nice looking string such as "{1,2,3}"
        s += "}";
        return s;
    }
    public static int[] copy(int[] a) {
        int copy[] = new int[a.length];
        for(int i =0; i<a.length; i++)
            copy[i] = a[i];
        return copy;
        // Returns a separate array with the same elements.
    }
    public static int[] resize(int[] a, int newLength) {
        int resized[] = new int[newLength];
        if(a.length != newLength)
            if(a.length<newLength) {
                for (int i = 0; i < newLength; i++) {
                    if (i < a.length)
                        resized[i] = a[i];
                    else
                        resized[i] = 0;
                }
            } else if(a.length>newLength)
                for(int i = 0; i<newLength; i++)
                    resized[i] = a[i];
        return resized;
        // Returns a new array with extra spaces
        //added (filled with 0's) or truncated (cut off). Ex, resize( {1,2,3,4,5} , 8) =>
        //{1,2,3,4,5,0,0,0}. Ex, resize( {1,2,3,4,5} , 3) => {1,2,3}.
    }
    public static int[] append(int[] a, int[] b) {
        if(a == null)
            return b;
        if(b == null)
            return a;
        int c[] = new int[a.length + b.length];
        for(int i = 0; i<c.length; i++) {
            if (i < a.length)
                c[i] = a[i];
            else
                c[i] = b[i-a.length];
        }
        return c;
    }
    // Returns a single array with a appended to b. Remember to consider null!
    public static int[] subArray(int[]a, int firstIncluded, int firstExcluded) {
        if(firstIncluded == firstExcluded || firstExcluded>a.length || firstIncluded>firstExcluded)
            return null;
        int b[] = new int[firstExcluded-firstIncluded];
        int c=0;
        for(int i = firstIncluded; i<firstExcluded; i++) {
            b[c] = a[i];
            c++;
        }
      /* // Returns a new array. Like substring, returns the subarray that starts at firstIncluded, and
      ends at firstExcluded-1. If the subarray contains no elements, or if the
      indexes are out of bounds, return null. Ex, subArray({0,1,2,3,4,5},2,4) =>
      {2,3}. subArray({1,2,3},1,1) => null. subArray({1,2,3},1,4) => null. */
        return b;
    }
    public static void makeSorted(int[] a) {
        // Sort ascending using Bubble Sort.
        for(int i =0; i< a.length; i++) {
            for (int b = 0; b < a.length-1; b++)
                if (a[b] > a[b+1]) {
                    int temp = a[b+1];
                    a[b+1] = a[b];
                    a[b] = temp;
                }
        }
    }
    public static int[] sort(int[] a) {
        // Return an ascending sorted version of the argument using Bubble Sort without changing the argument.
        int b[] = copy(a);
        makeSorted(b);
        return b;
    }
    public static int[] merge(int[] a, int[] b) {
        int[] rV = append(a,b);
        makeSorted(rV);
        return rV;
       /* ASSUME a AND b ARE SORTED ASCENDING! Combine
       a and b 1 element at a time from either a or b. At each step, take the smaller
       element from a and b, then remove it from consideration. Repeat until all
       elements from a and b are merged. The result should be a new array that is
       still sorted. */
    }
}




