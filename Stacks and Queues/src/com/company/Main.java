package com.company;

public class Main {

    public static void main(String[] args) {
        // Task 1
        int[] a = createStack();
        push(a, 9);
        push(a,8);
        push(a,7);
        push(a,6);
        push(a,5);
        push(a,4);
        push(a,3);
        pop(a);
        pop(a);
        System.out.println(pop(a));
        push(a,1);
        push(a,2);
        push(a,3);
        push(a,4);
        pop(a);
        pop(a);
        pop(a);
        pop(a);
        System.out.println(pop(a));
        // Task 2
        int[] bathroomList = createStack();
        System.out.println("This is not the best structure for this type of list, there should be a queue instead, " +
                "because in should be first in,first out, not last in, first out.");
        // Task 3
        int[] b = createQueue();
        enqueue(b, 9);
        enqueue(b,8);
        enqueue(b,7);
        enqueue(b,6);
        enqueue(b,5);
        enqueue(b,4);
        enqueue(b,3);
        dequeue(b);
        dequeue(b);
        System.out.println(dequeue(b));
        enqueue(b,1);
        enqueue(b,2);
        enqueue(b,3);
        enqueue(b,4);
        dequeue(b);
        dequeue(b);
        dequeue(b);
        dequeue(b);
        System.out.println(dequeue(b));
        System.out.println(dumpQueue(b));
        //Task 4
        int[] parkingLot = createQueue();
        System.out.println("You would expect the first car in to be the last one to leave, since it's a dead end alley." +
                "However, queue makes it so that the first car in leaves first, so it is not usable here.");
        //Task 5
        int[] task5 = createStack();
        push(a, 9);
        push(a,8);
        push(a,7);
        push(a,6);
        push(a,5);
        push(a,4);
        push(a,3);
        pop(a);
        pop(a);
        System.out.println("Each of these numbers could represent flavors of ice cream, in which case the pop would" +
                "be the equivalent of the top ice cream scoop being eaten");
        //Task 6
        int[] task6 = createQueue();
        enqueue(b, 1);
        enqueue(b,2);
        enqueue(b,3);
        dequeue(b);
        dequeue(b);
        System.out.println("Each of these numbers could represent cars moving through a tunnel, or a queue. Each dequeue " +
                "would represent a car exiting the tunnel, and each enqueue an entrance.");
        // Test Code
        int[] myStack = createStack();
        for(int i=10; i>0; i--)
            push(myStack,i);
        System.out.println("You should print [10,9,8,7,6,5,4,3,2,1]");
        System.out.println(prettyPrintStack(myStack));
        System.out.println("This should print 1\n2\n3\n4\n5\n6\n7\n8\n9\n10");
        for(int i=10; i>0; i--)
            System.out.println(pop(myStack));
        System.out.println("If you add too many elements into the stack, you should print out an error.");
        for(int i=0; i<110; i++)
            push(myStack, i);
    }
    // Creation functions
    public static int[] createStack(){
        int[] a = new int[101];
        a[0] = 0;
        return a;
    } // Create and return a stack, which is a 101 element integer array.
    // Create push and pop functions.
    public static void push(int[] stack, int data) {
        // This function should push data onto the stack and increment the number of elements by 1.
        if(stack[0] < 100) {
            stack[0] = stack[0] + 1;
            stack[stack[0]] = data;
        }
    }

    public static int pop(int[] stack){
        // This function should pop data off of the stack and decrement the number of elements by 1.
        if(stack[0] > 0) {
            int returnValue = stack[stack[0]];
            stack[0] = stack[0] - 1;
            return returnValue;
        }
        return 0;
    }
    // Accessor Functions
    public static String prettyPrintStack(int[] stack) {
        String returnValue ="";
        for(int i = 1; i<=stack[0]; i++)
            returnValue += stack[i] + ", ";
        returnValue = "[" + returnValue + "]";
        return returnValue;
        // Return as a string the stack using square brackets with each term separated by
        //commas.Ex, {3, 1, 2, 3, 4} => [1, 2, 3]because the number of terms is 3, so the stack goes from index 1 to
        //3, not including 4 and above.
    }
    public static String dumpStack(int[] stack){
        String returnValue ="";
        for(int i = 0; i<stack.length; i++)
            returnValue += stack[i] + ", ";
        return "[" + returnValue + "]";
        // Return the entire array, including the 0th element representing the number of terms.
        // Ex, {1,2,3,4,2} => {1,2,3,4,2}. It's not a proper stack, so use {}'s.
    }
    // Creation functions
    public static int[] createQueue(){
        int[] a = new int[101];
        a[0] = 0;
        return a;
    }
    // Create and return a queue, which is a 101 element integer array.
    // Create enqueue and dequeue functions.
    public static void enqueue(int[] queue, int data){
        if(queue[0]< 100){
            int ind = queue[0]+1;
            queue[ind]=data;
            queue[0]++;
        }
    }
    // This function should enqueue data onto the queue and increment the number of elements by 1.
    public static int dequeue(int[] queue) {
        int storage = queue[0];
        int firstElement = queue[1];
        for (int i = 1; i < storage; i++) {
            queue[i] = queue[i + 1];
        }
        queue[0]--;
        return firstElement;
    }
    // This function should dequeue data from the queue and decrement the number of element by 1.
    // Accessor Functions
    public static String prettyPrintQueue(int[] queue){
        String returnValue ="";
        for(int i = 1; i<queue[0]; i++)
            returnValue += queue[i] + ", ";
        return "[" + returnValue + "]";
    }
    // Return as a String the queue using square brackets with each term separated by commas.
    // Ex, {2,1,2,3,4} => [1,2] because the number of elements is 2, so the queue goes from index 1 to 2, not
    // including 3 and above.
    public static String dumpQueue(int[] queue){
        String returnValue ="";
        for(int i = 0; i<queue.length; i++)
            returnValue += queue[i] + ", ";
        return "[" + returnValue + "]";
    }
    // Return the entire array, including the 0th element representing the number of
    // elements. Ex, {1,2,3,4,2} => [1,2,3,4,2]. It's not a proper queue, so use {}'s.

}

