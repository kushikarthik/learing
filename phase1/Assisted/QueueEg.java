package AsstPraticeProjects;


import java.util.*;

public class QueueEg
{
public static void main(String[] args) 
{
        		Queue<String> locationsQueue = new LinkedList<>();
                locationsQueue.add("HYD");
        		locationsQueue.add("ELURU");
        		locationsQueue.add("MUMBAI");
        		locationsQueue.add("CHENNAI");
        		locationsQueue.add("BANAGLORE");
System.out.println("Queue is : " + locationsQueue);
        		System.out.println("Head of Queue : " + locationsQueue.peek());
        		locationsQueue.remove();
        		System.out.println("After removing Head of Queue : " + locationsQueue);
        		System.out.println("Size of Queue : " + locationsQueue.size());
    	}
}

