
public class RomanNumeralsOperators {
	
	public void checkMaxRepeat (String romanNumeral) throws RomanNumeralsException {

		if (romanNumeral.indexOf("I", romanNumeral.indexOf("I") + 3) != -1 
				|| romanNumeral.indexOf("X", romanNumeral.indexOf("X") + 3) != -1 
				|| romanNumeral.indexOf("C", romanNumeral.indexOf("C") + 3) != -1
				|| romanNumeral.indexOf("M", romanNumeral.indexOf("M") + 3) != -1){
			throw new RomanNumeralsException();
		}	
	}
	public void checkNeverRepeat (String romanNumeral) throws RomanNumeralsException {
		
		if (romanNumeral.indexOf("V", romanNumeral.indexOf("V") + 1) != -1 
				|| romanNumeral.indexOf("L", romanNumeral.indexOf("L") + 1) != -1 
				|| romanNumeral.indexOf("D", romanNumeral.indexOf("D") + 1) != -1) {
			throw new RomanNumeralsException();
		}	
	}
}
