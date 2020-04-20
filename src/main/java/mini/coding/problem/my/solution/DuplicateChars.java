package mini.coding.problem.my.solution;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DuplicateChars {
public static void main(String[] args) {
	System.out.println("Enter string");
	Scanner scan=new Scanner(System.in);
	String str=scan.next();
	Map<Character,Integer> dupChr=new HashMap();
	for(int i=0;i<str.length();i++)
	{
		Character ch=str.charAt(i);
		dupChr.compute(ch, (key,val) -> val==null?1:++val);
	}
	System.out.println(dupChr);
}
}
