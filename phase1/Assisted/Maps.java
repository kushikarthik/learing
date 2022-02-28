package AsstPraticeProjects;

import java.util.*;

public class Maps {
	public static void main(String[] args) {
		
		
		HashMap<Integer,String> a=new HashMap<Integer,String>();      
	      a.put(1,"zxc");    
	      a.put(2,"ZXC");    
	      a.put(3,"LKM");   
	       
	      System.out.println("\nHashmap are ");  
	      for(Map.Entry m:a.entrySet()){    
	       System.out.println(m.getKey()+" "+m.getValue());    
	      }
	      
	    
	       
	      Hashtable<Integer,String> b=new Hashtable<Integer,String>();  
	      
	      b.put(1,"SAI");  
	      b.put(2,"sai");  
	      b.put(3,"naik");  
	       

	      System.out.println("\n HashTable are ");  
	      for(Map.Entry n:b.entrySet()){    
	       System.out.println(n.getKey()+" "+n.getValue());    
	      }
	      
	      
	      //TreeMap
	      
	      TreeMap<Integer,String> c=new TreeMap<Integer,String>();    
	      c.put(1,"abc");    
	      c.put(2,"ABC");    
	      c.put(3,"qwe");       
	      
	      System.out.println("\nTreeMap are ");  
	      for(Map.Entry l:c.entrySet()){    
	       System.out.println(l.getKey()+" "+l.getValue());    
	      }    
	      
	   }  

}

