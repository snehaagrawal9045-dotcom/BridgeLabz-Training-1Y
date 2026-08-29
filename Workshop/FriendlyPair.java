package com.gla.Workshop;
import java.util.*;
public class FriendlyPair {
   static void main(){
       Scanner sc = new Scanner(System.in);
       int a = sc.nextInt();
       int b = sc.nextInt();
       int s1=0;
       int s2=0;
       for(int i=0;i<a;i++){
           if(a%i==0){
               s1 +=1;

           }
       }
       for(int i=1;i<b;i++){
           if(b%i==0){
               s2 +=i;
           }
       }
       if(s1==a&& s2==b){
           System.out.println("Friendly pair");
       }
       else{
           System.out.println("not friendly pair");
       }
   }

    }

