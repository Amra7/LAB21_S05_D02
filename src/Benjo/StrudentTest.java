package Benjo;

public class StrudentTest {
	public static void main(String[] args) {

		Student s1 = new Student();
		// System.out.println("Upisi ime: ");
		// s1.ime = TextIO.getln();

		// System.out.println("Upisi prezime: ");
		// s1.prezime = TextIO.getln();

		// System.out.println("Broj indexa: ");
		// s1.brIndexa = TextIO.getlnInt();

		s1.ime = "Emina";
		s1.prezime = "Narcis";
		s1.brojStudenata = 1;
		s1.brIndexa = s1.brojStudenata;

		ispis(s1);
		int velicina = 5;
		Student[] brojStudenata = napraviNiz(velicina);
		ispisiNiz(brojStudenata);
		bubbleSortStudenti(brojStudenata);
		System.out.println("Sortirano");
		ispisiNiz(brojStudenata);
		
		Student s2 =new Student();
		s2.ime = "Edib";
		s2.prezime="Munja";
		s2.brIndexa =4;
		ispis(s2);
		
		Student s3 =new Student();
		s3.ime = "Nedzad";
		s3.prezime="Drug od Munje";
		s3.brIndexa =1;
		ispis(s3);
		
		zamijeniStudente(s2,s3);
		
	}

	private static void zamijeniStudente(Student s2, Student s3) {
		s3.ime = s2.ime;
		s3.prezime = s2.prezime;
		s3.brIndexa = s2.brIndexa;
		
	}

	public static void bubbleSortStudenti(Student[] brojStudenata) {
		for (int i = 0; i < brojStudenata.length; i++) {
			for (int j = i + 1; j < brojStudenata.length; j++) {
				if (brojStudenata[i].brIndexa > brojStudenata[j].brIndexa) {
					Student temp = brojStudenata[i];
					brojStudenata[i] = brojStudenata[j];
					brojStudenata[j] = temp;
				}
			}

		}

	}
	

	public static void ispisiNiz ( Student[] niz) {
		for (int i = 0; i < niz.length; i++) {
			ispis(niz[i]);
			}
        System.out.println();
	}

	public static Student[] napraviNiz(int velicina) {
		Student[] niz = new Student[velicina];
		for (int i = 0; i < niz.length; i++) {
			niz[i] = new Student();
			niz[i].ime = "Emina";
			niz[i].prezime = "Vaka Naka" + Integer.toString(i);
			niz[i].brojStudenata++;
			niz[i].brIndexa = (int) (1 + Math.random() * 100);
		}
		return niz;
	}

	public static void ispis(Student s1) {
		System.out.printf(
				"\nIme %s \nPrezime: %s" + "\nIndex: %s \nBrStud: %s", s1.ime,
				s1.prezime, s1.brIndexa, s1.brojStudenata);
	}

}
