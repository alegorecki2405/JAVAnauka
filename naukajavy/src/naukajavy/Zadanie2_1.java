package naukajavy;

import java.util.*;

public class Zadanie2_1 {

	public static void main(String[] args) {
		String zmienna;
		
		Scanner odczyt = new Scanner(System.in);
		zmienna = odczyt.nextLine();
		zmienna = zmienna.toLowerCase();
		Hashtable<String,Integer> tab = new Hashtable<String,Integer>();
		
		tab.put("stycze�",1);
		tab.put("luty",2);
		tab.put("marzec",3);
		tab.put("kwiecie�",4);
		tab.put("maj",5);
		tab.put("czerwiec",6);
		tab.put("lipiec",7);
		tab.put("sierpie�",8);
		tab.put("wrzesien",9);
		tab.put("pazdiernik",10);
		tab.put("listopad",11);
		tab.put("grudzien",12);
		
		int[] how_much_days = {31,29,31,30,31,30,31,31,30,31,30,31};
		System.out.println(tab.get(zmienna));
		System.out.println(how_much_days[tab.get(zmienna)-1]);
	}

}
