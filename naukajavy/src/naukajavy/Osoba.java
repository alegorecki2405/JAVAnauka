package naukajavy;

public class Osoba {
	private String imie;
	private String nazwisko;
	private int rok;
	private int pensja;
	
	public void ustaw(String nimie,String nnazwisko, int nrok, int npensja) {
		this.imie = nimie;
		this.nazwisko = nnazwisko;
		this.rok = nrok;
		this.pensja = npensja;
		
	}
	public String wypisz() {
		String calosc = imie+" "+nazwisko+" "+rok+" "+pensja;
		return calosc;
	}
	public int ileLat()
	{
		return 2019-rok;
	}
	public float naEuro(float kurs) {
		return pensja/kurs;
	}
}
