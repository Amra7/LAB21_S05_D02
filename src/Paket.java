
public class Paket {
public static void main(String[] args) {
	
	System.out.println("Unesi dimenzije paketa: ");
	
	System.out.println("Unesi sirinu paketa: ");
	int w =TextIO.getlnInt();
	System.out.println("Unesi duzinu paketa: ");
	int l =TextIO.getlnInt();
	System.out.println("Unesi visinu paketa: ");
	int h =TextIO.getlnInt();
	System.out.println("Unesi stvarnu tezinu: ");
	int stvarnaTezina = TextIO.getlnInt();
	
	int wTezina=0;
	int cijena = racunajCijenu(wTezina, stvarnaTezina, w,h,l);
	System.out.printf("Cijena je paketa je %d KM", cijena);
}

private static  int racunajCijenu(int wTezina, int stvarnaTezina, int w, int h, int l) {
	
	 wTezina = volumetrijskaTezina(w,h,l);
    int cijena= 0;
			
	if (wTezina > stvarnaTezina)	{
		 cijena = wTezina *3;
	}else {
		 cijena = stvarnaTezina *3;
	}
	
	return cijena;
}

private static int volumetrijskaTezina(int w, int h, int l) {
	int volumetrijskTezina = (w*h*l)/5000;
	return volumetrijskTezina;
	
}
}
