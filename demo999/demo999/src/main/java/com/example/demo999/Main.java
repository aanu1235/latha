package com.example.demo999;
 import java.util.*;  
public class Main {  
     public static void main(String args[]){  
        Set<String> mySubjects = new HashSet<>();  
         mySubjects.add("Java");  
        mySubjects.add("Spring");  
        System.out.println("My Subjects:"); 
        for(String subject : mySubjects){  
         System.out.println(subject);  
        }
     } 
 }
       