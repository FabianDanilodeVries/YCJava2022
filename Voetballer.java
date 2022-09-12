package HelloWorldPackage;

public class Voetballer extends Sporter{
	String naam;
	int leeftijd;
	String sport;
	boolean heeftDopSchoenen;
	public Voetballer(String naamP, int leeftijdP, String sportP, boolean heeftDopSchoenenP) {
			naam = naamP;
			leeftijd = leeftijdP;
			sport = sportP;
			heeftDopSchoenen = heeftDopSchoenenP;
	}
	static void testMethod(String in) {
		System.out.println(in + " in Voetballer");
	}
}
