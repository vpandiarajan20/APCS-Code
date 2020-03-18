package com.company;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
            //Task 1
            ArrayList<Double> a = new ArrayList<>();
            a.add(1.0);
            a.add(1, 3.0);
            a.get(1);
            a.set(1, 5.0);
            a.remove(0);
            System.out.println(a.size());

            //Task 3
            QueueAL<String> b = new QueueAL<>();
            b.enqueue(new String("Al"));
            b.enqueue("Bob");
            b.enqueue("Carl");
            System.out.println(b.dequeue());
            System.out.println(b.dequeue());
            System.out.println(b.dequeue());

            //Task 4
            ArrayList<ArrayList<Integer>> c = new ArrayList<>();
            for(int i = 1; i < 4; i++) {
                c.add(new ArrayList<>(i));
                for(int j = 1; j < c.get(i).size() + 1; j++) {
                    c.get(i).add(j);
                }
            }

            //Task 5
            ArrayList<QueueAL<Rectangle>> d = new ArrayList<>();
            for(int i = 0; i < 100; i++) {
                d.add(new QueueAL<>(2));
                if(i == 0)
                    d.get(i).enqueue(new Rectangle(1, 0));
                else
                    d.get(i).enqueue(new Rectangle(1, i + 1));
        }
    }
}
