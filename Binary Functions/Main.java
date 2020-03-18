package com.company;

public class Main {

   public static void main(String[] args) {
       // write your code here
       int[] a = createBin(12345678);
       for(int i = 0; i<a.length; i++)
           System.out.println(a[i]);
   }

   //Constructors
public static int getDigits(int a, int biggestDigit, int smallestDigit) {
       int returnValue = 0;
       returnValue = a % (int)Math.pow(10, biggestDigit+1);
       returnValue = returnValue/ (int)Math.pow(10, smallestDigit);
       return returnValue;

   }
   public static int[] createBin(int binaryNumber) {
       // The argument will be an integer in binary notation, so its digits will be only 0's and 1's.
       // Return an array that separates each digit.
       int[] rv= new int[8];
       for(int i = 0; i<rv.length; i++){
           rv[7-i] = getDigits(binaryNumber,i, i);
       }
       return rv;
   }
   public static int[] createBin(String binaryNumber) {
       // The argument will be a String in binary notation, so its characters will be only 0's and 1's, no spaces.
       // You may assume the String will be 8 characters long. Return an array that separates each digit.
       int[] rv = new int[8];
       for(int i = 0; i<rv.length; i++){s
           rv[i] = Integer.parseInt(binaryNumber.substring(i,i+1));
       }
       return rv;
   }
   //Accessor
   public static int intValue(int[] b) {
       // Given a Binary number, evaluate its integer value using 2's complement.
       int returnvalue = 0;
       returnvalue = b[1] * -128 + b[2] * 64 + b[3] * 32 + b[4] * 16 + b[5] * 8 + b[6] * 4 + b[7] * 2 + b[8] * 1;
       return returnvalue;
   }
   public static int[] doubleValue(int[] b) {
       int [] rv = {-8*b[0] + 4*b[1] + 2*b[2] + b[3], -8*b[4] + 4*b[5] + 2*b[6] + b[7]};
       return rv;
       // Given a Binary number, evaluate its double values using 2's complement.
       // Return an int[] containing its {exponent , mantissa}.
   }
   //Conversions
   public static int[] intToBinary(int a) {
       // Converts an integer to a binary number.
       // Ex, intToBinary(7) => {0,0,0,0,0,1,1,1}.
       int [] rv = new int[8];
       if(a<0) {
           rv[0] = 1;
           a = a + 128;
       }
       for(int i =1; i<rv.length; i++)
           if(a>Math.pow(2,8-i))
           {
               rv[i] = 1;
               a = a-(int)Math.pow(2,8-i);
           }
       return rv;
   }
   /*public static int[] doubleToBinary(double a) {
       // Converts a double to a binary number.
       // Ex, doubleToBinary(1.25) => {1,1,1,0,0,1,0,1}     
   } */
}
