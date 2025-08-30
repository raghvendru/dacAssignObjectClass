package Extras;

public class NumberToWords {

	private static final String[] ones = { "", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine",
			"Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen",
			"Nineteen" };

	private static final String[] tens = { "", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty",
			"Ninety" };

	public static String convert(int num) {
		if (num == 0)
			return "Zero";
		return helper(num).trim();
	}

	private static String helper(int num) {
		if (num < 20) {
			return ones[num];
		} else if (num < 100) {
			return tens[num / 10] + " " + ones[num % 10];
		} else if (num < 1000) {
			return ones[num / 100] + " Hundred " + helper(num % 100);
		} else if (num < 100000) { 
			return helper(num / 1000) + " Thousand " + helper(num % 1000);
		} else if (num < 10000000) { 
			return helper(num / 100000) + " Lakh " + helper(num % 100000);
		} else { 
			return helper(num / 10000000) + " Crore " + helper(num % 10000000);
		}
	}

	public static void main(String[] args) {
		int number = 122341;
		System.out.println(number + " in words: " + convert(number));
	}
}
