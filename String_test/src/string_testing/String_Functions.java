package string_testing;

public class String_Functions {

	public static void main(String[] args) {
		
		//CharAt()  -- returns value of the character at specified index
		String a1 = "AnkitThakur";
		char ch=a1.charAt(0);		//returns the char value at the respective index  
		System.out.println(ch);  
		
		//Compare
		
		// It compares values of string for equality
		String s1="Sachin";  
		String s2="SACHIN";  
		System.out.println(s1.equals(s2));//false  
		System.out.println(s1.equalsIgnoreCase(s2));//true 
		
		//The = = operator compares references not values
		String s4="Sachin";  
		String s5="Sachin";  
		String s3=new String("Sachin");  
		System.out.println(s5==s4);//true (because both refer to same instance)  
		System.out.println(s3==s5);//false(because s3 refers to instance created in non-pool  

		//compareTo() -- returns integer value
		 String s12="Sachin";  
		 String s13="Ratan";  
		 System.out.println(s12.compareTo(s13));//1(because s12>s13) 
		 
		//Concat
		 String s21="Sachin ";  
		 String s22="Tendulkar";  
		 String s23=s21.concat(s22);  
		 System.out.println(s23);//Sachin Tendulkar  

		 //valueof() -- coverts given type such as int, long, float, double, boolean, char and char array into string 
		 int a=10;  
		 String s=String.valueOf(a);  
		 System.out.println(s+10);  // 1010

		//Length()  -- returns length of the string
		String a2="python";  
		System.out.println("String length is: "+a2.length());
		
		//substring  -- returns value from start index to end index
		String a3="javatpoint";
		System.out.println(a3.substring(2,6));//start index is inclusive and end index is exclusive
		System.out.println(a3.substring(1));

		//contains() -- returns boolean value for verifying string inside master string
		String name="what do you know about me what";  
		System.out.println(name.contains("what"));  

		//toString() -- returns the string representation of the object
		
	}	
		
		
	}

