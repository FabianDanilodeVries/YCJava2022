package HelloWorldPackage;
public class Demo {

	public static void main(String[] args) {
		Sporter sporter1 = new Sporter("bob", 25, "Tennis");
		Sporter sporter2 = new Sporter("Henk", 30, "Voetbal");
		Voetballer v1 = new Voetballer("Leslie", 26, "basketbal", true);
		Voetballer.testMethod(v1.naam);
		Sporter.testMethod("iets");
		abstractSubClass i = new abstractSubClass(1);
		i.abstractMethod();
	}

}

