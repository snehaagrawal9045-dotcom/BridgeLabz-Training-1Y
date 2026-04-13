package com.gla.Workshop;
import java.util.*;
public class Frequency {
    public static void main(String[] args) {
            String str = "hello";

            HashMap<Character, Integer> freq = new HashMap<>();

            for (char ch : str.toCharArray()) {
                if (freq.containsKey(ch)) {
                    freq.put(ch, freq.get(ch) + 1);
                } else {
                    freq.put(ch, 1);
                }
            }

            System.out.println(freq);
        }
        }




