package Basics;

import java.util.Arrays;

public class DisariumNumber {

    public static void main(String[] args) {

        int[] a = {1234, 1245, 345, 221,135,89};

        System.out.println(Arrays.toString(onlyDisarium(a)));
    }

    public static int[] onlyDisarium(int[] a) {

        int count = 0;

        for (int arr : a) {

            if (isDisarium(arr)) {
                count++;
            }
        }

        int[] newArray = new int[count];

        int index = 0;

        for (int arr : a) {

            if (isDisarium(arr)) {
                newArray[index] = arr;
                index++;
            }
        }

        return newArray;
    }

    public static boolean isDisarium(int num) {

        int sum = 0;
        int count = 0;

    
        for (int i = num; i > 0; i /= 10) {
            count++;
        }

        
        for (int i = num; i > 0; i /= 10) {

            int ld = i % 10;
            int prod = 1;

            int countCopy = count;

            while (countCopy > 0) {
                prod *= ld;
                countCopy--;
            }

            sum += prod;
            count--;
        }

        return sum == num;
    }
}