package com.example.javaphilosophy.chapters.three;

public class LessonOne {
    public static void main(String[] args) {
        int x = 0;
        int[] arr = {20};
        testOne(x, arr);
        System.out.println(x + " " + arr[0]);
        testTwo(x, arr);
        System.out.println(x + " " + arr[0]);
    }

    private static void testOne(int xyz, int[] arr) {
        xyz += 30;
        arr[0] = 40;
    }

    private static void testTwo(int x, int[] array) {
        x = 50;
        array = new int[]{60};
    }

}