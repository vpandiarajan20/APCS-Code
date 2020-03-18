package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
/*Task 4: Using nested for loops, create a 2d array with this pattern:
0 1 2 3 4 5 6 7 8 9
10 11 12 13 14 15 16 17 18 19
20 21 22 23 24 25 26 27 28 29
30 31 32 33 34 35 36 37 38 39
40 41 42 43 44 45 46 47 48 49
50 51 52 53 54 55 56 57 58 59
60 61 62 63 64 65 66 67 68 69
70 71 72 73 74 75 76 77 78 79
80 81 82 83 84 85 86 87 88 89
90 91 92 93 94 95 96 97 98 99*/
        int[][] a = new int[10][10];
        for (int i = 0; i < a.length; i++)
            for (int j = 0; j < a[i].length; j++)
                a[i][j] = i * 10 + j;
/*Task 5: Using nested for loops, create a 2d array with this pattern:
0-0 0-1 0-2 0-3 0-4 0-5 0-6 0-7 0-8 0-9
1-0 1-1 1-2 1-3 1-4 1-5 1-6 1-7 1-8 1-9
2-0 2-1 2-2 2-3 2-4 2-5 2-6 2-7 2-8 2-9
3-0 3-1 3-2 3-3 3-4 3-5 3-6 3-7 3-8 3-9
4-0 4-1 4-2 4-3 4-4 4-5 4-6 4-7 4-8 4-9
5-0 5-1 5-2 5-3 5-4 5-5 5-6 5-7 5-8 5-9
6-0 6-1 6-2 6-3 6-4 6-5 6-6 6-7 6-8 6-9
7-0 7-1 7-2 7-3 7-4 7-5 7-6 7-7 7-8 7-9
8-0 8-1 8-2 8-3 8-4 8-5 8-6 8-7 8-8 8-9
9-0 9-1 9-2 9-3 9-4 9-5 9-6 9-7 9-8 9-9 */
        String[][] b = new String[10][10];
        for (int i = 0; i < b.length; i++)
            for (int j = 0; j < b[i].length; j++)
                b[i][j] = i + "-" + j;
/*Task 6: Using nested for loops, create a 2d array with this pattern:
1 0 1 0 1 0 1 0 1 0
0 1 0 1 0 1 0 1 0 1
1 0 1 0 1 0 1 0 1 0
0 1 0 1 0 1 0 1 0 1
1 0 1 0 1 0 1 0 1 0
0 1 0 1 0 1 0 1 0 1
1 0 1 0 1 0 1 0 1 0
0 1 0 1 0 1 0 1 0 1
1 0 1 0 1 0 1 0 1 0
0 1 0 1 0 1 0 1 0 1 */
        int[][] c = new int[10][10];
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c[i].length; j++) {
                if ((i + j) % 2 == 0) {
                    c[i][j] = 1;
                } else {
                    c[i][j] = 0;
                }
            }
        }
        String[] alphabet = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        String[][] alpha = new String[7][8];
        int count = 0;
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j <= i; j++) {
                alpha[i][j] = alphabet[count];
                count++;
                if(count == 25)
                    break;
            }
        }
        System.out.println(pp2dInt(a));
        System.out.println(pp2dString(b));
        System.out.println(pp2dInt(c));
        System.out.println(pp2dString(alpha));

    }

    /*Task 1: Create a pp2dInt function that takes a 2d int array and
    returns a nice looking string with curly brackets, commas, and new
    lines ("\n") between the rows. Example, "{{1,2,3},\n{4,5},\n{6,7,8}}"*/
    public static String pp2dInt(int[][] a) {
        String returnValue = "{";
        for (int i = 0; i < a.length; i++) {
            returnValue += "{";
            for (int j = 0; j < a[i].length; j++)
                returnValue = returnValue + a[i][j] + ",";
            returnValue = returnValue + "},\n";
        }
        return returnValue + "}";
    }

    /*Task 2: Create a pp2dDouble function that takes a 2d double array and
    returns a nice looking String with curly brackets, commas, and new
    lines ("\n") between the rows. Example,
    "{{1.1,2.1,3.1},\n{4.1,5.1},\n{6.1,7.1,8.1}}"*/
    public static String pp2dDouble(double[][] a) {
        String returnValue = "{";
        for (int i = 0; i < a.length; i++) {
            returnValue += "{";
            for (int j = 0; j < a[i].length; j++)
                returnValue = returnValue + a[i][j] + ",";
            returnValue = returnValue + "},\n";
        }
        return returnValue + "}";
    }

    /*Task 3: Create a pp2dString function that takes a 2d String array and
    returns a nice looking string with curly brackets, commas, and new
    lines ("\n") between the rows. No double quotes necessary. Example,
    "{{1a,2a,3a},\n{4a,5a},\n{6a,7a,8a}}"*/
    public static String pp2dString(String[][] a) {
        String returnValue = "{";
        for (int i = 0; i < a.length; i++) {
            returnValue += "{";
            for (int j = 0; j < a[i].length; j++)
                returnValue = returnValue + a[i][j] + ",";
            returnValue = returnValue + "},\n";
        }
        return returnValue + "}";
    }

    public static String alphabet(int a) {
  /*Task 7: Using nested for loops, create a 2d array with this pattern
  (create a subfunction that given int, returns a letter):
  a
  b c
  d e f
  g h i j
  k l m n o
  p q r s t u
  v q x y z*/
        String[] alphabet = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        return alphabet[a];
    }
}



