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

	public static void ispisiNiz(Student[] niz) {
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
