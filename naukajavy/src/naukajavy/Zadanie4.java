package naukajavy;

public class Zadanie4 {
	static int obwod(int a,int b,int c) {
		int obwod = a+b+c;
		return obwod;
	}
	static boolean czy_prostokatny(int a,int b,int c) {
		
		if(a*a+b*b==c*c) {
			return true;
		}
		else if(b*b+c*c==a*a)
		{
			return true;
		}
		else if(a*a+c*c==b*b)
		{
			return true;
		}
		return false;
	}
	static boolean czy_to_kuntot(int a, int b, int c) {
		if(a+b > c && a+c > b && b+c > a)
		{
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		int a,b,c;
		a=4;
		b=3;
		c=5;
		
		System.out.println(obwod(a,b,c));
		
		System.out.println(czy_prostokatny(a,b,c));
		
		System.out.println(czy_to_kuntot(a,b,c));
	}

}
