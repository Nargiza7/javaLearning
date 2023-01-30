package com.nargi.javalearning2;

public class Loops {
    public static void main(String[] args) {
        // for loop cogunlukla diziler ile kullaniriz
        int[] myNumbers = {12, 13, 14, 15, 16};


        for (int i = 0; i < myNumbers.length; i++) {
            int x = myNumbers[i] / 3 * 5;
            System.out.println(x);
        }
        for (int number : myNumbers) {
            System.out.println(number / 3 * 5);
        }
        for (int a = 0; a < 10; a++) {
            int b = a * 10;
            System.out.println(b);
        }

        //while su sundan kucuk oldugu surece

        int j= 0;
        while (j<10)
        {
            int m = j*10;
            System.out.println(m);

        }
    }
}
