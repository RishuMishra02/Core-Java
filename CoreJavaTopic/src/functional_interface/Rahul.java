package functional_interface;

import java.util.function.Predicate;
import java.util.*;
public class Rahul{
    public static void main (String[] args) {
    List<Integer> list= Arrays.asList(5,2,4,6,7,8,66,3,78,4,8,89);
        HashSet set=new HashSet(list);
        System.out.println("All numbers");
        show(set,n->true);
        
        System.out.println("Odd Number");
        show(set,n->n%2==0);
        
    }
        public static void show(HashSet<Integer>set,Predicate<Integer> predicate){
            for (Integer n:set ){
                if(predicate.negate().test(n)){
                    System.out.println(n);
                }
            } 
        }

}