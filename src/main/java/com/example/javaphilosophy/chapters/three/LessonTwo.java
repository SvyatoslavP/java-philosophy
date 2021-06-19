package com.example.javaphilosophy.chapters.three;

public class LessonTwo {
    public static void main(String[] args) {
        int x = 0;
        int[] arr = {20};
        x = testOne(x, testTwo(x, arr));
        System.out.println(x + " " + arr[0]);
    }

    private static int testOne(int x, int[] arr) {
        x += 30;
        arr[0] = 40;
        return 42;
    }

    private static int[] testTwo(int x, int[] arr) {
        x = 50;
        arr = new int[]{60};
        return arr;
    }
}
