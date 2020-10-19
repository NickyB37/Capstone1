import java.util.Scanner;

public class Translate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner scnr = new Scanner(System.in);
        
		String word;
       do {
		System.out.println("Enter a word to translate.");
		word = scnr.nextLine();
		if (word.isEmpty()) {
			System.out.println("No word was entered");
		}
		else {
			
			System.out.println(covertLine(word));
		//	System.out.println(translateWord(word));
			break;
		}			
	
       
       } while (true);
		
       
        
		
	}

	private static String translateWord(String englishWord) {
		englishWord = englishWord.toLowerCase();
		int leadingConsonants = countLeadingConsonants(englishWord);
		boolean startsWithVowel = leadingConsonants == 0;

		if (startsWithVowel) {
			return englishWord + "way";
		} else {
			String prefix = englishWord.substring(0, leadingConsonants);
			String remainingLetters = englishWord.substring(leadingConsonants);
			return remainingLetters + prefix + "ay";
		 
		
		}
	}

	private static int countLeadingConsonants(String word) {
		// loop through the letters in the word. When we hit the first
		// vowel, return how many consonants we counted before it.
		for (int i = 0; i < word.length(); i++) {
			if (isVowel(word.charAt(i))) {
				return i ;
			
			}
		}
		// If no vowels were found, the word is all consonants
		return word.length();
	}

	private static boolean isVowel(char letter) {
		if(letter == 'a') {
			return true;
		}
		if(letter == 'e') {	
			return true;
		}
		if(letter == 'o') {
			return true;
		}
		if(letter == 'u') {	
			return true;	
		}
		return false;
					
	}
  
     private static String covertLine(String str) {
    	 String end = " ";
    	 String delim = "\\s+";
		String []words = str.split(delim);
    	 for(int i = 0 ;i< words.length;i++) {
			if(isVowel(words[i].toLowerCase().charAt(0))) {
			end += words[i]+"way";
			}
			else {
				end += words[i].substring(1)+ words[i].substring(0,1) + "ay"+" ";
			}
			
			
    	   
    	 
     }
		return end;

	
	
  
	   
   
	}

}
