package com.example.java21playground.sequenced_collction;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;

public class SequencedCollections {

    public void sequencedCollections(){
        System.out.println("Arraylist Example");
        var arrayList = new ArrayList<>(Arrays.asList("Banana", "Cherry","Date"));
        // before java 21 add first and last elements
        arrayList.add(0,"Apple");
        arrayList.add(arrayList.size(),"Elderberry");
        System.out.println(arrayList);
        System.out.println(arrayList.get(0));
        System.out.println(arrayList.get(arrayList.size()-1));

        // with java 21 add first and last elements
        arrayList.addFirst("Apple");
        arrayList.addLast("Elderberry");


        System.out.println("\n Deque example");
        var deque = new ArrayDeque<>(Arrays.asList("Banana", "Cherry","Date"));
        // before java 21 add first and last elements
        deque.addFirst("Apple");
        deque.addLast("Elderberry");
        System.out.println(deque);
        System.out.println(deque.getFirst());
        System.out.println(deque.getLast());

        // with java 21 add first and last elements
        deque.addFirst("Apple");
        deque.addLast("Elderberry");


        System.out.println("\nLinkedHashSet example");
        var linkedHashSet = new LinkedHashSet<>(Arrays.asList("Banana", "Cherry","Date"));
        linkedHashSet.add("Elderberry");
        System.out.println(linkedHashSet);
        System.out.println(linkedHashSet.iterator().next());
        System.out.println(linkedHashSet.toArray()[linkedHashSet.size()-1]);

        // with java 21 add first and last elements
        linkedHashSet.addFirst("Apple");
        linkedHashSet.addLast("Elderberry");

        /**
         * In above linked hash set addFirst is newly added feature in java 21
         * But some collections not supported that like TreeSet it will throw unsupported operation
         * */

    }
}
