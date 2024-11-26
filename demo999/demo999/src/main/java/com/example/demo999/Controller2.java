package.com.example.demo999;
import java.util.*;  
public class Main {  
 
    public static void main(String args[]){  
        Map<Integer,String> mysubjects = new HashMap<Integer,String>();  
 
        mysubjects.put(1,"Java");  
        mysubjects.put(2,"Spring");  
        for(Map.Entry subject : mysubjects.entrySet()) 
           System.out.println(subject.getKey()+" - "+subject.getValue());  
 
    }  
}
