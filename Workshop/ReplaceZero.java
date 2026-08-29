package com.gla.Workshop;

public class ReplaceZero {
    public static void main(String[] args){
        int arr[] = {1, 2, 3, 2, 5};

        int target = 1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                arr[i] = 0;
            }
        }

        // print array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    }

