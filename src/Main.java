package com.company;

import com.company.Task1.*;
import com.company.Task2.ClassesExample;
import com.company.Task4.ImmutableClassStudent;
import com.company.Task3.Sort;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        System.out.println("TASK 1 TEST");
        System.out.println("Balance of the racket: "+BuildRacketRunner.runBuildRacket().getBalance());

        System.out.println("\nTASK 2 TEST");
        ClassesExample.runInnerClassExample();

        System.out.println("\nTASK 3 TEST");
        int[] array = new int[10000];
        System.out.println("Array before sorting : ");
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) Math.round((Math.random() * 1000) - 500);
            System.out.print(array[i] + " ");
        }
        System.out.println("\n");
        Sort.bubbleSort(array);
        System.out.println("\nArray after sorting : ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("\n");

        System.out.println("\nTASK 4 TEST");
        Date date = new Date();
        ImmutableClassStudent student = new ImmutableClassStudent("Alina", "ImmutableClass", 1, date);
        System.out.println("Student's name : " + student.getName() + "; Student's ID : " + student.getId() + " ; Student's  name of Project : " + student.getWorkName() + " ; Date when student upload Project : " + student.getDate());
    }
}
