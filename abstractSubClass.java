package HelloWorldPackage;

public class abstractSubClass extends abstractClass {
	abstractSubClass(int i) {
		testInt = i;
	}

	void abstractMethod() {
		System.out.println("Overridden method in abstractSubClass");
	}
}
