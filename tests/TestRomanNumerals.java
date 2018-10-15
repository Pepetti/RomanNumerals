import static org.junit.Assert.*;
import org.junit.Test;

public class TestRomanNumerals {

		@Test
		public void testThreeSymbols() throws RomanNumeralsException {
			//Act
			String symbol = "III";
			int result = RomanNumerals.convertToInteger(symbol);
			int Arabic = 3;
			
			assertEquals (result, Arabic);
		}
		@Test
		public void testThreeSymbols2() throws RomanNumeralsException {
			//Act
			String symbol = "XXX";
			int result = RomanNumerals.convertToInteger(symbol);
			int Arabic = 30;
			
			assertEquals (result, Arabic);
		}
		
		@Test
		public void testThreeSymbols3() throws RomanNumeralsException {
			//Act
			String symbol = "CCC";
			int result = RomanNumerals.convertToInteger(symbol);
			int Arabic = 300;
			
			assertEquals (result, Arabic);
		}
		
		@Test
		public void testThreeSymbols4() throws RomanNumeralsException {
			//Act
			String symbol = "MMM";
			int result = RomanNumerals.convertToInteger(symbol);
			int Arabic = 3000;
			
			assertEquals (result, Arabic);
		}
		
		@Test (expected = RomanNumeralsException.class)
		public void testFourSymbols() throws RomanNumeralsException {
			//Act
			String symbol = "IIII";
			// This statement should cause an exception
			RomanNumerals.convertToInteger(symbol);
			
		}
		
		@Test (expected = RomanNumeralsException.class)
		public void testFourSymbols2() throws RomanNumeralsException {
			//Act
			String symbol = "XXXX";
			// This statement should cause an exception
			RomanNumerals.convertToInteger(symbol);
						
		}
		
		@Test (expected = RomanNumeralsException.class)
		public void testFourSymbols3() throws RomanNumeralsException {
			//Act
			String symbol = "CCCC";
			// This statement should cause an exception
			RomanNumerals.convertToInteger(symbol);
		}
		
		@Test (expected = RomanNumeralsException.class)
		public void testFourSymbols4() throws RomanNumeralsException {
			//Act
			String symbol = "MMMM";
			// This statement should cause an exception
			RomanNumerals.convertToInteger(symbol);
		}
		
		@Test
		public void testNeverRepeatedSymbols1() throws RomanNumeralsException {
			//Act
			String symbol = "V";
			int result = RomanNumerals.convertToInteger(symbol);
			int Arabic = 5;
			
			assertEquals (result, Arabic);
		}
		
		@Test
		public void testNeverRepeatedSymbols2() throws RomanNumeralsException {
			//Act
			String symbol = "L";
			int result = RomanNumerals.convertToInteger(symbol);
			int Arabic = 50;
			
			assertEquals (result, Arabic);
		}
		
		@Test
		public void testNeverRepeatedSymbols3() throws RomanNumeralsException {
			//Act
			String symbol = "D";
			int result = RomanNumerals.convertToInteger(symbol);
			int Arabic = 500;
			
			assertEquals (result, Arabic);
		}
		
		@Test (expected = RomanNumeralsException.class)
		public void testFaultyRepeatedSymbols1() throws RomanNumeralsException {
			//Act
			String symbol = "VV";
			// This statement should cause an exception
			RomanNumerals.convertToInteger(symbol);
		}
		
		@Test (expected = RomanNumeralsException.class)
		public void testFaultyRepeatedSymbols2() throws RomanNumeralsException {
			//Act
			String symbol = "LL";
			// This statement should cause an exception
			RomanNumerals.convertToInteger(symbol);
		}
		
		@Test (expected = RomanNumeralsException.class)
		public void testFaultyRepeatedSymbols3() throws RomanNumeralsException {
			//Act
			String symbol = "DD";
			// This statement should cause an exception
			RomanNumerals.convertToInteger(symbol);
		}
		
		@Test
		public void testSubtraction() throws RomanNumeralsException {
			//Act
			String symbol = "IV";
			// This statement should cause an exception
			int result = RomanNumerals.convertToInteger(symbol);
			int Arabic = 4;
			
			assertEquals (result, Arabic);
		}
		
		@Test
		public void testSubtraction2() throws RomanNumeralsException {
			//Act
			String symbol = "IX";
			// This statement should cause an exception
			int result = RomanNumerals.convertToInteger(symbol);
			int Arabic = 9;
			
			assertEquals (result, Arabic);
		}
		
		@Test
		public void testSubtraction3() throws RomanNumeralsException {
			//Act
			String symbol = "XL";
			// This statement should cause an exception
			int result = RomanNumerals.convertToInteger(symbol);
			int Arabic = 40;
			
			assertEquals (result, Arabic);
		}
		
		@Test
		public void testSubtraction4() throws RomanNumeralsException {
			//Act
			String symbol = "XC";
			// This statement should cause an exception
			int result = RomanNumerals.convertToInteger(symbol);
			int Arabic = 90;
			
			assertEquals (result, Arabic);
		}
		
		@Test
		public void testSubtraction5() throws RomanNumeralsException {
			//Act
			String symbol = "CD";
			// This statement should cause an exception
			int result = RomanNumerals.convertToInteger(symbol);
			int Arabic = 400;
			
			assertEquals (result, Arabic);
		}
		@Test
		public void testSubtraction6() throws RomanNumeralsException {
			//Act
			String symbol = "CM";
			// This statement should cause an exception
			int result = RomanNumerals.convertToInteger(symbol);
			int Arabic = 900;
			
			assertEquals (result, Arabic);
		}
		
		@Test (expected = IllegalArgumentException.class)
		public void testFaultySubtraction() throws RomanNumeralsException {
			//Act
			String symbol = "IL";
			// This statement should cause an exception
			RomanNumerals.convertToInteger(symbol);
		}
		
		@Test (expected = IllegalArgumentException.class)
		public void testFaultySubtraction2() throws RomanNumeralsException {
			//Act
			String symbol = "XD";
			// This statement should cause an exception
			RomanNumerals.convertToInteger(symbol);
		}
		
		@Test (expected = IllegalArgumentException.class)
		public void testFaultySubtraction4() throws RomanNumeralsException {
			//Act
			String symbol = "IL";
			// This statement should cause an exception
			RomanNumerals.convertToInteger(symbol);
		}
		
		@Test (expected = IllegalArgumentException.class)
		public void testFaultySubtraction3() throws RomanNumeralsException {
			//Act
			String symbol = "XXC";
			// This statement should cause an exception
			RomanNumerals.convertToInteger(symbol);
		}
		@Test (expected = IllegalArgumentException.class)
		public void testFaultySubtraction5() throws RomanNumeralsException {
			//Act
			String symbol = "IIX";
			// This statement should cause an exception
			RomanNumerals.convertToInteger(symbol);
		}
		
		@Test (expected = IllegalArgumentException.class)
		public void testFaultySubtraction6() throws RomanNumeralsException {
			//Act
			String symbol = "VX";
			// This statement should cause an exception
			RomanNumerals.convertToInteger(symbol);
		}
		
		@Test (expected = IllegalArgumentException.class)
		public void testFaultySubtraction7() throws RomanNumeralsException {
			//Act
			String symbol = "LC";
			// This statement should cause an exception
			RomanNumerals.convertToInteger(symbol);
		}
		
		@Test (expected = IllegalArgumentException.class)
		public void testFaultySubtraction8() throws RomanNumeralsException {
			//Act
			String symbol = "DM";
			// This statement should cause an exception
			RomanNumerals.convertToInteger(symbol);
		}
		
		@Test
		public void testRomanNumeralToArabic() throws RomanNumeralsException {
			//Act
			String symbol = "MCMLXXXIV";
			// This statement should cause an exception
			int result = RomanNumerals.convertToInteger(symbol);
			int Arabic = 1984;
			
			assertEquals (result, Arabic);
		}
		@Test
		public void testRomanNumeralToArabic2() throws RomanNumeralsException {
			//Act
			String symbol = "MMXIV";
			// This statement should cause an exception
			int result = RomanNumerals.convertToInteger(symbol);
			int Arabic = 2014;
			
			assertEquals (result, Arabic);
		}

	}
