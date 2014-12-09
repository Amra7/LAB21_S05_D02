
public class CopyOfPaket {
public static void main(String[] args) {
	
	System.out.println("Unesi dimenzije paketa: ");
	
	float [] nizDimenzija = unosenjeDimenzija();
	
	float cijena = racunajCijenu(nizDimenzija);
	System.out.printf("Cijena je paketa je %d KM", cijena);
}

private static float[] unosenjeDimenzija() {
	float [] nizDim= new float [4];
	
	System.out.println("Unesi sirinu paketa: ");
	float w =TextIO.getFloat();
	nizDim[0] =w;
	System.out.println("Unesi duzinu paketa: ");
	float l =TextIO.getFloat();
	nizDim[1] =l;
	System.out.println("Unesi visinu paketa: ");
	float h =TextIO.getFloat();
	nizDim[2] =h;
	System.out.println("Unesi stvarnu tezinu: ");
	float stvarnaTezina = TextIO.getFloat();
	nizDim[3] =stvarnaTezina;
	
	return nizDim;
}

private static  float racunajCijenu( float [] nizDimenzija) {
	
	float  wTezina = volumetrijskaTezina(nizDimenzija[0],nizDimenzija[1],nizDimenzija[2]);
	float cijena= 0;
			
	if (wTezina > nizDimenzija[3])	{
		 cijena = wTezina *3;
	}else {
		 cijena = nizDimenzija[3] *3;
	}
	
	return cijena;
}

private static float volumetrijskaTezina(float w, float h, float l) {
	float volumetrijskTezina = (w*h*l)/5000;
	return volumetrijskTezina;
	
}
}
