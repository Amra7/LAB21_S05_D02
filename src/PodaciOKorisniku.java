
public class PodaciOKorisniku {
public static void main(String[] args) {
	
	User podaci = new User ();
	
	System.out.println("Kako se zovete?");
	podaci.ime = TextIO.getln();
	
	System.out.println("Kako se prezivate?");
	podaci.prezime = TextIO.getln();
	
	System.out.println("Koliko godina imeate?");
	podaci.godine = TextIO.getlnInt();
	
    System.out.printf("%s %s ima %d godina.", podaci.ime, podaci.prezime, podaci.godine);
	
}
}
