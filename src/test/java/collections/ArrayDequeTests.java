package collections;

import org.junit.jupiter.api.Test;

import java.util.*;

public class ArrayDequeTests {

    @Test
    void arrayDequeAsQueueTest() {
        Queue<String> q = new ArrayDeque<>();
        q.offer("first");
        q.offer("second");
        q.offer("third");

        //peek returns current head //poll returns current head and removes from the queue
        System.out.println(q.peek()); // first
        System.out.println(q.peek()); // first
        System.out.println(q.poll()); // first,
        System.out.println(q.peek()); // second
        System.out.println(q.poll()); // second
        System.out.println(q.poll()); // third
        System.out.println(q.isEmpty()); // true
    }

    @Test
    void linkedListAsQueueTest() {
        Queue<String> q = new LinkedList<>();
        q.offer("first");
        q.offer("second");
        q.offer("third");

        //peek returns current head //poll returns current head and removes from the queue
        System.out.println(q.peek()); // first
        System.out.println(q.peek()); // first
        System.out.println(q.poll()); // first,
        System.out.println(q.peek()); // second
        System.out.println(q.poll()); // second
        System.out.println(q.poll()); // third
        System.out.println(q.isEmpty()); // true
    }

    @Test
    void arrayDequeAsStackTest() {
        Deque<String> stack = new ArrayDeque<>();
        stack.offerLast("first");
        stack.offerLast("second");
        stack.offerLast("third");

        System.out.println(stack); // [first, second, third]
        System.out.println(stack.pollLast()); // third
        System.out.println(stack.pollLast()); // second
        System.out.println(stack.pollLast()); // first

        System.out.println(stack.pollLast()); // null
    }

    @Test
    void oldStackTest() {
        Stack<String> stack = new Stack<>();
        stack.push("first");
        stack.push("second");
        stack.push("third");

        System.out.println(stack); // [first, second, third]
        System.out.println(stack.pop()); // "third"
        System.out.println(stack.pop()); // "second"
        System.out.println(stack.pop()); // "first"

        System.out.println(stack.pop()); // throws EmptyStackException
    }
}
