package AsstPraticeProjects;
import java.util.regex.*;

public class RegEx {
	
	public static void main(String[] args) {
		String pattern = "[a-zA-Z]+";
		String check = "My Password contains 5,% and All the numbers for 1 to 8";
		Pattern p = Pattern.compile(pattern);
		Matcher c = p.matcher(check);
		
		while (c.find())
	      	System.out.println( check.substring( c.start(), c.end() ) );
		}

		

	}


