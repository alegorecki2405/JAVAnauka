package naukajavy;

public class Zadanie3 {

	public static void main(String[] args) {
		for(int i = -99;i<99;i++) {
			if (i%2!=0 && (i<-10 || i>10)) {
				System.out.println(i);
			}
		}

	}

}
