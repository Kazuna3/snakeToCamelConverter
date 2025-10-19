public class SnakeToCamelConverter {

	public static String convert(String input) {

		if (input == null || input.isEmpty()) {

			return input;

		}

		String[] parts = input.split("_");
		StringBuilder result = new StringBuilder();

		for (int i = 0; i < parts.length; i++) {

			String part = parts[i].toLowerCase();

			if (i == 0) {

				result.append(part);

			} else {

				result.append(Character.toUpperCase(part.charAt(0)));
				result.append(part.substring(1));

			}

		}

		return result.toString();

	}

	// テスト用の main メソッド
	public static void main(String[] args) {

		System.out.println(convert("ABC_DEF_GHI")); // abcDefGhi
		System.out.println(convert("XXX_YYYY")); // xxxYyyy

	}

}
