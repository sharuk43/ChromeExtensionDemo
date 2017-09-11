public class ParseHTML {

	public static String parseString(String str) {
		String numbers = "hai";

		for (String line : str.split("\n")) {
			if (line.matches("[\\d]{10}"))
				numbers += "";
		}

		return numbers;
	}
}
