public class DvaKorisnika {
	public static void main(String[] args) {

		System.out.println("Unesite podatke prvog korisnika: ");
		User prviKorisnik = unosenjePodataka();
		ispisPodataka(prviKorisnik);

		System.out.println("Unesite podatke drugog korisnika: ");
		User drugiKorisnik = unosenjePodataka();
		ispisPodataka(drugiKorisnik);
		
	if ( prviKorisnik.godine > drugiKorisnik.godine){
		ispisPodataka(prviKorisnik);
	} else {
		ispisPodataka(drugiKorisnik);
	}

	}

	private static void ispisPodataka(User one) {
		System.out.printf(" %s %s ima %d godina. %n", one.ime, one.prezime,
				one.godine);

	}

	private static User unosenjePodataka() {
		User one = new User();
		
		System.out.println("Kako se zovete?");
		one.ime = TextIO.getln();

		System.out.println("Kako se prezivate?");
		one.prezime = TextIO.getln();

		System.out.println("Koliko godina imate?");
		one.godine = TextIO.getlnInt();

		return one;
	}
}
