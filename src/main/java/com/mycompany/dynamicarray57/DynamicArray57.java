package com.mycompany.dynamicarray57;

public class DynamicArray57 {

    public static void main(String[] args) {
        Array list = new Array();
        list.print();
        int newArray[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        list.addFirst(100);
        list.addFirst(200);
        list.addFirst(300);
        list.addFirst(400);
        list.addFirst(500);
        list.addLast(888);
        list.addFirst(120);
        list.addFirst(130);
        list.addFirst(140);
        list.addFirst(150);
        list.addFirst(141);
        list.addFirst(151);
        list.addIndex(555, 5);
        System.out.println("Array after adding elements on different position-->");
        list.print();
        System.out.println("======================");
        list.removeIndex(5);
        System.out.println("Updated Array after removing element from index 5-->");
        System.out.println("======================");
        list.print();

        list.mergeIndex(newArray, 5);
        System.out.println("======================");
        System.out.println("Array after merging second array-");
        list.print();
        System.out.println("======================");
        list.sorting();
        System.out.println("Resulting sorted Array--->");
        list.print();
    }
}
