package main.java.collection;

import java.util.NoSuchElementException;

public class Test {
    public static void main(String[] args) {
        IntegerCollection collection =new IntegerCollection();

        for (int i = 0; i < 5; i++) {
            collection.add(i);
            System.out.println(collection);
        }
        try {
            collection.add(null);  // try to add null value
        }catch (ClassCastException e){
            System.out.println(e.getMessage());
        }

        System.out.println("collection.maxValue() = " + collection.maxValue());
        System.out.println("collection.minValue() = " + collection.minValue());
        System.out.println("collection.getAvg() = " + collection.getAvg());

        try {
            System.out.println("collection.searchByIndex(2) = " + collection.searchByIndex(2));
            System.out.println("collection.searchByIndex(20) = " + collection.searchByIndex(20));
            System.out.println("collection.searchByValue() = " + collection.searchByValue(20));
            collection.remove(collection.searchByIndex(0));
            collection.remove(collection.searchByIndex(0));
        }catch (NoSuchElementException e){
            System.out.println(e.getMessage());
        }
        System.out.println(collection);

    }
}

