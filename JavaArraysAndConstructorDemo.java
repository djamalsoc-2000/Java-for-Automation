package myown;

public class Jamal2 {

	String globalName;
	
	Jamal2() {
		this.globalName = "Aziab";
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		
		//int array
		var myArray = new int[][] {{12, 30, 40, 50}, {19, 39, 49, 59}};
		
		System.out.print(myArray[0][0]);
		
		//string array
		String[] names = {"Aziab", "Imad", "Bob"};
		System.out.println(names[2]);
		
		var namesWithVar = new String[] {"Aziab", "Imad", "Bob"};
		System.out.println(namesWithVar[2].toUpperCase());
		
		System.out.println(namesWithVar);

	}
	
	private void myCuystomMethod(String myArgs) {
		//globalName = "myName";
		System.out.println(myArgs);
		
		System.out.println("Global Name is:" + globalName)
	}

}
