import java.util.Arrays;

/** Functions for checking if a given string is an anagram. */
public class Anagram {
	public static void main(String args[]) {
		// Tests the isAnagram function.
		System.out.println(isAnagram("silent","listen"));  // true
		System.out.println(isAnagram("William Shakespeare","I am a weakish speller")); // true
		System.out.println(isAnagram("Madam Curie","Radium came")); // true
		System.out.println(isAnagram("Tom Marvolo Riddle","I am Lord Voldemort")); // true

		// Tests the preProcess function.
		System.out.println(preProcess("What? No way!!!"));
		
		// Tests the randomAnagram function.
		System.out.println("silent and " + randomAnagram("silent") + " are anagrams.");
		
		// Performs a stress test of randomAnagram 
		String str = "1234567";
		Boolean pass = true;
		//// 10 can be changed to much larger values, like 1000
		for (int i = 0; i < 10; i++) {
			String randomAnagram = randomAnagram(str);
			System.out.println(randomAnagram);
			pass = pass && isAnagram(str, randomAnagram);
			if (!pass) break;
		}
		System.out.println(pass ? "test passed" : "test Failed");
	}  

	// Returns true if the two given strings are anagrams, false otherwise.
	public static boolean isAnagram(String str1, String str2) {
	str1 = str1.replaceAll("[^a-zA-Z]", "").toLowerCase();
	str2 = str2.replaceAll("[^a-zA-Z]", "").toLowerCase();
	
	if (str1.length() != str2.length()) {
    return false;
	}
		char[] arr1 = str1.toCharArray();
		char[] arr2 = str2.toCharArray();
	
		Arrays.sort(arr1);
    	Arrays.sort(arr2);
		
		
	return true;
	}
	   
	// Returns a preprocessed version of the given string: all the letter characters are converted
	// to lower-case, and all the other characters are deleted, except for spaces, which are left
	// as is. For example, the string "What? No way!" becomes "whatnoway"
	public static String preProcess(String str) {
	String input = "What? No way!!!";
	String letter = str.replaceAll("[^a-zA-Z]", "");;
	return letter.trim().toLowerCase();     
	
		
	}
	
	   
	// Returns a random anagram of the given string. The random anagram consists of the same
	// characters as the given string, re-arranged in a random order. 
	public static String randomAnagram(String str) {
	int l = str.length();
	//int lastJ = 0;
	int j = -1;
	String temp="";
	for (int i = 0; i < l; i++) {
		//if(lastJ != j){
		j = (int)(Math.random()*(l));
	temp  += str.charAt(j);}
		
	
		//Replace the following statement with your code	}

		
		return temp;	
			
	}
	

}