package naukajavy;

import java.util.*;

public class Zadanie2_2 {

	public static void main(String[] args) {
		Scanner odczyt = new Scanner(System.in);
		boolean x = true;
		String haslo;
		String hasla[] = {"QAZwsx#1","XD","XDDDDDDD"};
		do {
			haslo = odczyt.next();
			for(String element : hasla)
			{

				if(element.equals(haslo))
				{
					x=false;
				}

			}
		}
		while(x);
		System.out.println("ta no w koncu sie udalo");

		

	}

}
