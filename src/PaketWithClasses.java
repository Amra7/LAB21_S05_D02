public class PaketWithClasses {
	public static void main(String[] args) {

		System.out.println("Unesi dimenzije paketa: ");

		Dimensions nizDimenzija = unosenjeDimenzija();

		float cijena = racunajCijenu(nizDimenzija);
		System.out.printf("Cijena je paketa je %f KM", cijena);
	}

	private static Dimensions unosenjeDimenzija() {
		Dimensions nizDim = new Dimensions();

		System.out.println("Unesi sirinu paketa: ");
		nizDim.width = TextIO.getFloat();

		System.out.println("Unesi duzinu paketa: ");
		nizDim.length = TextIO.getFloat();

		System.out.println("Unesi visinu paketa: ");
		nizDim.height = TextIO.getFloat();

		System.out.println("Unesi stvarnu tezinu: ");
		nizDim.weight = TextIO.getFloat();

		return nizDim;
	}

	private static float racunajCijenu(Dimensions nizDimenzija) {

		float wTezina = volumetrijskaTezina(nizDimenzija);
		float cijena = 0;

		if (wTezina > nizDimenzija.weight) {
			cijena = wTezina * 3;
		} else {
			cijena = nizDimenzija.weight * 3;
		}

		return cijena;
	}

	private static float volumetrijskaTezina(Dimensions nizDimenzija) {
		float volumetrijskTezina = nizDimenzija.width * nizDimenzija.height
				* nizDimenzija.length / 5000;
		return volumetrijskTezina;

	}
}
