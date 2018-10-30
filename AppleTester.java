
public class AppleTester {

	public static void main(String[] args){
		
		//Creates the default object of class Apple
		Apple standard = new Apple();
		System.out.println(standard.toString());
		System.out.println();
		
		//Creates an object of class Apple which mutates the default
		Apple proper = new Apple("Granny Smith", 0.75, 0.99);
		System.out.println(proper.toString());
		System.out.println();
		
		//Creates an object of class Apple which has invalid values entered
		Apple invalid = new Apple("iPad", 2.5, -200);
		System.out.println(invalid.toString());
	}
}
