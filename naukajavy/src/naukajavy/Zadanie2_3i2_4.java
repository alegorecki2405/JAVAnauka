package naukajavy;

import java.util.*;

public class Zadanie2_3i2_4 {
	
	public static boolean czytab(int liczba,int [] tab) {
		for(int i =0;i<6;i++)
		{
			if(liczba == tab[i])
			{
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		int[] tab = new int[6];
		Random r = new Random();
		for(int i= 0;i<6;i++)
		{
			boolean x = true;
			int y = r.nextInt(49)+1;
			for(int j : tab)
			{
				if(j == y) {
					x = false;
				}
			}
			if(x)
			{
				tab[i]=y;
			}
			else
			{
				i--;
			}
		}
		for(int i= 0;i<6;i++)
		{
			System.out.println(tab[i]);
		}
		Scanner odczyt = new Scanner(System.in);
		int x = odczyt.nextInt();
		System.out.println(czytab(x,tab));
		
		
	}

}
