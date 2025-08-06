package stringnew;

public class Stringnew1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="hi hello";
String s1=new String("hi world");
System.out.println(s1);
System.out.println(s);
//charat-to return character in the string based on index position
System.out.println(s.charAt(5));
//length=to return size of string
System.out.println(s.length());
//concat-to add two strings
System.out.println(s.concat(s1));
//contains-to check whether a character or a word is present in the string
System.out.println(s1.contains("hi"));
System.out.println(s1.contains(s));
System.out.println(s.contains(s1));
System.out.println(s1.contains("world"));
//touppercase-to convert small lettercase to capital letter
System.out.println(s.toUpperCase());
//tolowercase-to convert uppercase to lowercase letters
System.out.println(s.toLowerCase());
//equals-to compare 2strings are equal
System.out.println(s.equals(s1));
String a="java";
String b="java";
String c="Java";
System.out.println(a.equals(b));
System.out.println(b.equals(c));
//equalsignorecase-to ignore the case
System.out.println(b.equalsIgnoreCase(c));
String d =new String("java");
System.out.println(b.equals(d));
System.out.println(b==d);
//equal operator checks the content
//equal method checks the location
System.out.println(a==b);
//isempty-to check string is empty or not
System.out.println(s.isEmpty());
String v="";
System.out.println(v.isEmpty());
//valueof-to convert any datatype to string

int x=4;
System.out.println(String.valueOf(x));













	}

}
