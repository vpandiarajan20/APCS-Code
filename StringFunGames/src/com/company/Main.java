package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println(stage3("OXOXOXOOOOOOOXOXOXO"));
    }
    public static int stage1(String s) {
        int returnValue = 0;
        String letter, pLetter;
        for(int i = 1; i< s.length(); i++){
            letter = s.substring(i,i+1);
            pLetter = s.substring(i-1, i);
            if(letter.compareTo("X") == 0 && 0 == pLetter.compareTo("O"))
                returnValue++;
            else if (letter.compareTo("O") == 0 && 0 == pLetter.compareTo("X"))
                returnValue--;
        }
        return returnValue;
    }
    public static int stage2(String s) {
        int returnValue = 0;
        String letter, pLetter;
        for(int i = 1; i< s.length(); i++){
            letter = s.substring(i,i+1);
            pLetter = s.substring(i-1, i);
            if(letter.compareTo("X") == 0 && 0 == pLetter.compareTo("O"))
                returnValue++;
            else if (letter.compareTo("O") == 0 && 0 == pLetter.compareTo("X"))
                returnValue--;
            else if (letter.compareTo("O") == 0 && 0 == pLetter.compareTo("O"))
                returnValue= returnValue - 1;
            else if (letter.compareTo("X") == 0 && 0 == pLetter.compareTo("X"))
                returnValue = returnValue +1;
        }
        return returnValue;
    }

    public static int stage3(String s) {
        String letter;
        int returnReal = 0;

        for(int i = 1; i < s.length(); i++) {
            int returnValue = 0;
            for (; (i != (s.length())) && (s.substring(i - 1, i).compareTo(s.substring(i, i + 1)) != 0); i++) {//a
                //System.out.println("i = " + i);

                letter = s.substring(i - 1, i + 1);
                //System.out.println("letter is " + letter);

                if (letter.compareTo("OX") == 0) {//b

                    if (returnValue <= 0) {
                        returnValue *= (-1);
                        returnValue++;
                    } else if (returnValue > 0)
                        returnValue++;

                }//b
                else if (letter.compareTo("XO") == 0) {//c
                    if (returnValue >= 0) {
                        returnValue *= (-1);
                        returnValue--;
                    } else if (returnValue < 0)
                        returnValue--;
                }//c

            }//a
            returnReal += returnValue;
            //System.out.println(returnReal + " " + returnValue);

        }
        return returnReal;
    }//class
    public static String[] stage4(int num) {
        String s = "" + num;
        String[] arr = new String[s.length()];
        for(int i =0; i<s.length(); i++)
            arr[i] = s.substring(i, i + 1);
        return arr;
    }
}





