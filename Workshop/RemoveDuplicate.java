package com.gla.Workshop;
import java.util.ArrayList;
import java.util.HashSet;
public class RemoveDuplicate {
    public static void main(String[] args){
     ArrayList<String> list = new ArrayList<>();
     list.add("Ram");
     list.add("Radhe");
     list.add("megha");
      list.add("Ram");
        list.add("megha");
        list.add("megha");
        System.out.println("Original List: + list");
        HashSet<String> set= new HashSet<>(list);
        ArrayList<String> uniquelist=new ArrayList<>(set);
        System.out.println("List after removing duplicate " + uniquelist);

    }
}
