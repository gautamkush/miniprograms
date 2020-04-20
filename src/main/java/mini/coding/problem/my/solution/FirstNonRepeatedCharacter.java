package mini.coding.problem.my.solution;

import java.util.Scanner;

public class FirstNonRepeatedCharacter {
public static void main(String[] args) {
	System.out.println("Enter String : ");
	Scanner scan=new Scanner(System.in);
	String str=scan.next();
	for (char ch : str.toCharArray()) {
		int count=0;
		for (int i = 0; i < str.length(); i++) {
			if(ch==str.charAt(i))
			{
				count++;
			}
		}
		if(count>1)
		{
			System.out.println(ch);
			break;
		}
	}
}
}
