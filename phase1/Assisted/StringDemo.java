package AsstPraticeProjects;

public class StringDemo {
	public static void main(String[] args) {
		//methods of strings
		System.out.println("Methods of Strings");
		
		String s=new String("Hi this is karthik and joining class from webex");
		String s2=new String("Hi this is karthik and leaveing class from webex");
		System.out.println(s.length());

		//substring
		
		System.out.println(s.substring(2));

		//String Comparison
		
		System.out.println(s.compareTo(s2));

		//IsEmpty
		
		System.out.println(s.isEmpty());

		//toLowerCase
		
		System.out.println(s.toLowerCase());
		
		//replace
		
		String replace=s.replaceAll("and", "me");
		System.out.println(replace);

		//equals
		
		System.out.println(s.equals(s2));
 
		

		//replace method
		StringBuffer sb=new StringBuffer("ASDFGHJLK");
		sb.replace(0, 2, "Abc");
		System.out.println(sb);

		//delete method
		sb.delete(0, 1);
		System.out.println(sb);
		
		            		
	}


}

