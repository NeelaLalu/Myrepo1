package stringnew;

public class Builderbuffer {
	public static void main(String args[])
	{
		StringBuffer sb=new StringBuffer("hihello");
		System.out.println(sb);
		StringBuilder sb1=new StringBuilder("helloworld");
		System.out.println(sb1);
		//insert-to add new element into the string
		sb.insert(7, "neela");
		System.out.println(sb);
		//append-to add new string to the last
		sb1.append("everyone");
		System.out.println(sb1);
		//replace-to replace a particular string based on index.
		sb.replace(0, 6, "welcome");
		System.out.println(sb);
		//reverse-to reverse a string
		sb.reverse();
		System.out.println(sb);
		//delete-to delete a string based on index
		sb1.delete(5, 10);
		System.out.println(sb1);
		
		
		
		
		
	}

}
