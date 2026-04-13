package com.gla.Workshop;

public class PrimeNumber {
    public static void main(String[] args){
        System.out.println("Prime numbers between 1 and 100");
        for(int num =2;num<=100;num++){
            boolean IsPrime = true;
            for(int i=2;i<=Math.sqrt(num);i++){
                if(num%i==0){
                    IsPrime=false;
                    break;
                }
            }
            if(IsPrime){
                System.out.println(num + "");
            }
        }
    }
}
