package main;

public class HelloWorld {

	public static void main(String[] watEva) {
		String[] arrayOfWhatToPrint = {
				"Hello,",
				"Home"};
		String printMe = "";
		for(String itemInArray: arrayOfWhatToPrint) {
			if (!itemInArray.equals(arrayOfWhatToPrint[0])) {
				printMe = printMe + " " + itemInArray;
			} else {
				printMe = itemInArray;
			}
		}
		System.out.println(printMe);
		System.out.println("Just a test");

	}

}
