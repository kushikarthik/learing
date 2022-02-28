package AsstPraticeProjects;


class defAccessSpecifier
{ 
  void display() 
     { 
         System.out.println("Now you are using defalut access specifier"); 
     } 
} 

 class accessSpecifiers1 extends defAccessSpecifier {

	public static void main(String[] args) {
		
		System.out.println("Dafault Access Specifier");
		defAccessSpecifier obj = new defAccessSpecifier(); 		  
        obj.display(); 

	}
}



class priaccessspecifier 
{ 
   private void display() 
    { 
        System.out.println("Now you are using private access specifier"); 
    } 
} 

 class accessSpecifiers2 {

	public static void main(String[] args) {
		
		System.out.println("Private Access Specifier");
		priaccessspecifier  obj = new priaccessspecifier(); 
         
        //obj.display();

	}
}





 class proaccessspecifiers {

	protected void display() 
    { 
        System.out.println("This is protected access specifier"); 
    } 
}
 
