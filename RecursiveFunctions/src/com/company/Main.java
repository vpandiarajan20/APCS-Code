package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println(doubler("Hello"));
        System.out.println(cRaZyCaSe("hello"));
        System.out.println(mod5(6));
        System.out.println(starNumber(123));
    }
    //task 1
    public static int mod5(int arg){
        if(arg < 5)
            return arg;
        return mod5(arg-5);
    } // returns the arg mod 5 without using %
    //task 1a
    public static int modN(int arg, int n){
        if(arg < n)
            return arg;
        return modN(arg-n,n);
    } // returns the arg mod n without using %
    //task 2
    public static String doubler(String s){
        if(s.length() == 1)
            return s + s;
        return s.substring(0,1) + s.substring(0,1) + doubler(s.substring(1));
    }
    //task 3
    public static String cRaZyCaSe(String s){
        if(s.length() == 1)
            return s;
        if(s.length() == 2)
            return s.substring(0,1).toLowerCase() + s.substring(1,2).toUpperCase();
        return cRaZyCaSe(s.substring(0,2)) + cRaZyCaSe(s.substring(2,s.length()));
    }
    //task 4
    public static String starNumber(int n){
        String s = "*" + n;
        if(s.length() == 2)
            return s + "*";
        return s.substring(0,2) + starNumber(Integer.parseInt((s.substring(2))));
    } // Return the number with stars between digits. starNumber(123) -> *1*2*3*
    //task 5
    public static int factorial(int n){
        if(n == 1)
            return 1;
        return factorial(n-1)*n;
    } // Returns n!. factorial(5) -> 5*4*3*2*1 = 120
    //task 6
    public static int fib(int n){
        if( n==1 || n == 2)
            return 1;
        else
            return fib(n-1) + fib(n-2);
    } // Returns the nth Fibonacci number. fib(3) -> 2, fib(5) -> 5
    //task 7
    public static int pascal(int row, int column) {
        if (column == 0) {
            return 1;
        }
        else if (column == row) {
            return 1;
        }
        else {
            return pascal(row - 1, column - 1) + pascal(row - 1, column);
        }
    }
    //task 8 part a
    public static String NLWS(String s){
        String rv = "";
        if(s.length() <=1 ) {
            if(s.indexOf(" ") == -1)
                rv= s;
        }
        else
            for(int i= 0; i<s.length(); i++){
                rv += NLWS(s.substring(i,i+1));
            }
        return rv;
    }
    //task 8 part b
    public static String BV(String s){
        int vl=firstVowel(s);
        return s.substring(0, vl-1);
    }

    public static int firstVowel(String word){
        int i;
        for(i=0; i<word.length();i++){
            switch(word.charAt(i)){
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                case 'y':
                    return i;
            }
        }
        return -1;
    }
    //task 8 part c
    public static String AV(String s){
        int vl=firstVowel(s);
        return s.substring(vl+1, s.length());
    }

    //task 8 part d
    public static String FW(String s){
        return s.substring(0, s.indexOf(" "));
    }

    //task 8 part e
    public static String BFW(String s){
        int t = FW(s).length();
        return (s.substring(s.indexOf(FW(s)) + t+1, s.length()));
    }
}


