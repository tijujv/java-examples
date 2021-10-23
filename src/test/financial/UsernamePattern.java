package test.financial;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UsernamePattern {

	private Pattern pattern;
	private Matcher matcher;

	public static boolean validateReg(String username) {
		/*
		 * if(username.length() <6 || username.length() > 20 ||
		 * username.chars().filter(ch -> ch == '.').count() > 1 ) return false; else
		 */
		// ^[a-zA-Z][a-zA-Z0-9.][a-zA-Z0-9]${6,20}
		return username.matches("^[a-zA-Z][a-zA-Z0-9.]{5,19}$");
	}
	
	
	// Function to validate the username
	public static boolean isValidUsername(String name) {
		String regex = "^[A-Za-z]\\w{5,29}$";
		Pattern p = Pattern.compile(regex);
		// If the username is empty return false
		if (name == null) {
			return false;
		}
		// Pattern class contains matcher() methodto find matching between given username  and regular expression.
		Matcher m = p.matcher(name);
		// Return if the username matched the ReGex
		return m.matches();
	}
	
	 // simple regex
    //private static final String USERNAME_PATTERN = "^[a-z0-9\\._-]{5,20}$";

    // strict regex
    private static final String USERNAME_PATTERN =
            "^[a-zA-Z0-9]([._-](?![._-])|[a-zA-Z0-9]){3,18}[a-zA-Z0-9]$";

    private static final Pattern pattern1 = Pattern.compile(USERNAME_PATTERN);

    public static boolean isValid(final String username) {
    	// https://mkyong.com/regular-expressions/how-to-validate-username-with-regular-expression/
        Matcher matcher = pattern1.matcher(username);
        return matcher.matches();
    }

    
    public static boolean validate(String username) { // Financial
        Pattern pattern;
	    Matcher matcher;
	    if(username.chars().filter(ch -> ch == '.').count() > 1 )
	    	return false;
        return username.matches("^[a-zA-Z]([.]|[a-zA-Z0-9]){4,18}[a-zA-Z0-9]$");
    }

	public static void main(String[] args) {
		System.out.println("--------------  Invalid username");
		System.out.println(validate("rob"));
		System.out.println(validate("abcdefghijklmnopqrstu"));
		System.out.println(validate("Robert Domek"));
		System.out.println(validate("Robert.Domek."));

		System.out.println("-------------- Valid username");
		System.out.println(validate("Robert"));
		System.out.println(validate("Robert.Domek"));
		
		
		/*
		 * System.out.println("------------- isValidUsername"); String str1 =
		 * "Geeksforgeeks"; System.out.println(isValidUsername(str1)); // Test Case: 2
		 * String str3 = "1Geeksforgeeks"; System.out.println(isValidUsername(str3)); //
		 * Test Case: 3 String str5 = "Ge"; System.out.println(isValidUsername(str5));
		 */

	}
}