package HelloWorldPackage;
public class Sporter {
	String naam;
	int leeftijd;
	String sport;
	boolean heeftDopSchoenen;
	Sporter (String naamP, int leeftijdP, String sportP) {
		naam = naamP;
		leeftijd = leeftijdP;
		sport = sportP;
		
		System.out.println("Nieuwe sporter: " + firstLetterToUpper(naam) + " is " + leeftijd + " jaar oud en speelt " + (sport).toLowerCase());
	}
	Sporter(){}
	
	static String firstLetterToUpper(String stringIn) {
		return stringIn.substring(0, 1).toUpperCase() + stringIn.substring(1);
	}
	static void testMethod(String in) {
		System.out.println(in);
	}
}
