import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class RomanNumerals {
	public static int convertToInteger(String romanNumeral) throws RomanNumeralsException {
		String input = romanNumeral.toUpperCase();
		int result = 0;
		int i = 0;
		List<RomanNumeral> romanNumerals = RomanNumeral.getReverseSortedValues();
		
		RomanNumeralsOperators operators = new RomanNumeralsOperators();
		operators.checkMaxRepeat(input);
		operators.checkNeverRepeat(input);
		
		while ((input.length() > 0) && (i < romanNumerals.size())) {
			RomanNumeral symbol = romanNumerals.get(i);
			if (input.startsWith(symbol.name())) {
				result += symbol.getValue();
				input = input.substring(symbol.name().length());
			} else {
				i++;
			}
		}
		
		if (input.length() > 0) {
			throw new IllegalArgumentException(romanNumeral);
		}
		return result;
	}
	
	enum RomanNumeral {
		I(1), IV(4), V(5), IX(9), X(10), XL(40), L(50), XC(90), C(100), CD(400), D(500), CM(900), M(1000);
		
		private int value;
		
		RomanNumeral(int value) {
			this.value = value;
		}
		
		public int getValue() {
			return value;
		}
		
		public static List<RomanNumeral> getReverseSortedValues(){
			return Arrays.stream(values()).sorted(Comparator.comparing((RomanNumeral e) -> e.value).reversed()).collect(Collectors.toList());
		}
	}
}
