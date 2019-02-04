package com.rahul.collection;

import java.util.ConcurrentModificationException;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.*;
public class CopyOnWriteArrayList_Concurrent {

    public static void main(String[] args) throws InterruptedException {

        List<String> numList = new CopyOnWriteArrayList<String>();
        numList.add("1");
        numList.add("2");
        numList.add("3");
        numList.add("4");
        
        //This thread will iterate the list
        Thread thread1 = new Thread(){ 
            public void run(){ 
                try{ 
                    Iterator<String> i = numList.iterator(); 
                    while (i.hasNext()){ 
                        System.out.println(i.next()); 
                        // Using sleep to simulate concurrency
                        Thread.sleep(1000); 
                    }     
                }catch(ConcurrentModificationException e){ 
                    System.out.println("thread1 : Concurrent modification detected "
                      +"on this list"); 
                    e.printStackTrace();
                }catch(InterruptedException e){
                    
                } 
            } 
        }; 
        thread1.start(); 
       // thread1.join();
        // This thread will try to add to the collection,
        // while the collection is iterated by another thread.
        Thread thread2 = new Thread(){ 
            public void run(){ 
              try{ 
                // Using sleep to simulate concurrency
                  Thread.sleep(2000);
                  // adding new value to the shared list
                  numList.add("5"); 
                  System.out.println("new value added to the list"); 
                  System.out.println("List " + numList);
              }catch(ConcurrentModificationException e){ 
                  System.out.println("thread2 : Concurrent modification detectet on the List"); 
              } catch(InterruptedException e){}
          } 
        }; 
        thread2.start();    
    }
}
