package AsstPraticeProjects;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ArrayDemo {
	public static void main(String[] args)
	{
		int ar1[]= {101,102};
		System.out.println(ar1.length);
		System.out.println(ar1);
		for(int i=0;i<ar1.length;i++)
		{
			System.out.println(ar1[i]);
		}
		Pattern p=Pattern.compile("[Hello welcome to eluru]");
		Matcher m=p.matcher("adefal");
		while(m.find())
		{
			System.out.println(m.start()+""+m.group());
		}
		
		int ar2[]=new int[4];
		System.out.println(ar2.length);
		ar2[0]=111;
		ar2[2]=255;
		for(int i=0;i<ar2.length;i++)
		{
			System.out.println(ar2[i]);
		}
		
		int[][] a= {{1,2},{4,3},{5,4}};
		System.out.println(a);
		System.out.println(a[1]);
		System.out.println(a[2][3]);
		
	}

}


