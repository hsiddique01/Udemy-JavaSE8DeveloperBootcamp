package main;

public class HelloWorld {

	public static void main(String[] watEva) {
		String[] arrayOfWhatToPrint = {
				"Stay",
				"the",
				"fuck",
				"home!",
				"It's",
				"COVID-19"};
		String printMe = "";
		for(String itemInArray: arrayOfWhatToPrint) {
			if (!itemInArray.equals(arrayOfWhatToPrint[0])) {
				printMe = printMe + " " + itemInArray;
			} else {
				printMe = itemInArray;
			}
		}
		System.out.println(printMe);

	}

}
