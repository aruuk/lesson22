package com.company;

import java.util.*;
import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        /*try {
            Student student1 = new Student("name", 2);
            Student student2 = new Student("name", 10);
            ArrayList<Student> studentArrayList = new ArrayList<>();
            studentArrayList.add(student1);
            studentArrayList.add(student2);
            //studentArrayList.get(3);

            for (Student s : studentArrayList) {
                System.out.println(s.toString());
            }

        }catch (IndexOutOfBoundsException e){
            System.out.println("sorry");
        }catch (InputMismatchException e){
            throw new Error();
        }catch (Exception e){
            System.out.println("it is wrong");
        }finally{
            System.out.println("end");
        } */



//        LinkedList<Integer> list = new LinkedList<>();
//        int counter = 0;
//        for (int i = 0; i < 20; i++) {
//            int random = new Random().nextInt(20);
//            list.add(random);
//            counter += random;
//            System.out.print(random + ", ");
//        }
//        System.out.println("\nsum: "+ counter);
//
//        Set<Integer> nums = new HashSet<>(list);
//        nums.addAll(list);
//        long sum = nums.stream().mapToInt(x -> x).sum();
//        nums.forEach(System.out::print);
//        System.out.println(sum);


    ArrayList<Integer> list = new ArrayList<Integer>();
    Random random = new Random();
        System.out.println("random numbers:");
        for (int i = 0; i < 50; i++) {
            list.add(random.nextInt(0,100));
        }
        System.out.println(list);

    ArrayList<Integer> list1 = new ArrayList<>();
        System.out.println("even numbers: ");
        for (int i: list) {
        if (i % 2 == 0){
            System.out.print(i+ ", ");
        }
        }

    ArrayList<Integer> list2 = new ArrayList<>();
        System.out.println("\nnon-even numbers: ");
        for (int j: list ) {
            if (j % 2 != 0){
                System.out.print(j + ", ");
            }
        }


//    for (int i = 0; i <= 50; i++)
//    {
//        int a = (int)(Math.random()* 100 + 0);
//        Integer b = new Integer(a);
//        list.add(i + b);
//    }
//    System.out.println(list);



//    ArrayList<Integer> list1 = new ArrayList<>();
//    System.out.println("chetnye: ");
//        list1.addAll(list);
//        if (list1.get(list) % 2 == 0) {
//            System.out.println(list1);
//        }
//    System.out.println(list1);



//    ArrayList<Integer> list2 = new ArrayList<>();
//        System.out.println("\n");
//        System.out.print("ne chetnye: ");
    }
}

