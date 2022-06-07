package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Random rd = new Random();
        int[] array = new int[10];
        for (int i = 0; i <array.length; i++) {
            array[i] = rd.nextInt(2);
        }
        System.out.println("Сортировка массива: ");
        arraySort(array);
        System.out.println();


        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            arrayList.add(rd.nextInt(2));
        }
        System.out.println("\nСортировка ArrayList: ");
        arraySort(arrayList);
        System.out.println();


        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            linkedList.add(rd.nextInt(2));
        }
        System.out.println("Сортировка LinkedList: ");
        arraySort(linkedList);
    }

    public static void arraySort(int[] array) {
        Arrays.sort(array);
        for (int a : array) {
            System.out.print(a + " ");
        }
    }
    public static void arraySort(ArrayList<Integer> arrayList) {
        Collections.sort(arrayList);
        System.out.println(arrayList);
    }
    public static void arraySort(LinkedList<Integer> linkedList) {
        Collections.sort(linkedList);
        System.out.println(linkedList);
    }
}