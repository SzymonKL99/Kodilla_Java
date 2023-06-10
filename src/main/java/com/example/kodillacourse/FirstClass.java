package com.example.kodillacourse;
import java.util.HashSet;
import java.util.Set;
public class FirstClass {
    public static void main(String[] args) {
        Set<String> OrderNumberSet = new HashSet<>();

        OrderNumberSet.add("OR-123");
        OrderNumberSet.add("OR-341");
        OrderNumberSet.add("OR-123");
        OrderNumberSet.add("OR-221");
        OrderNumberSet.add("OR-122");
        OrderNumberSet.add("OR-122");

        for (String OrderNumber : OrderNumberSet) {
            System.out.println("Order number: " + OrderNumber);
        }
    }
}
