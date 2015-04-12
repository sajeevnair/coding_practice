class Anagram{
	public static void main (String[] args){
	
		String str1 = args[0];
		String str2 = args[1];

		if(isAnagram(str1, str2)) { System.out.println("The given strings are anagrams"); } 
		else { System.out.println("The two strings are not anagrams");}			
	}

	public static Boolean isAnagram(String str1, String str2){
		if(str1.length() != str2.length())
			return false;
		
		Integer[] map = new Integer[128];
		
		for (int i = 0; i < str1.length(); i++){
			if(map[str1.charAt(i)] == null) { map[str1.charAt(i)] = 1; } else { map[str1.charAt(i)]++; }
		}

		for (int i = 0; i < str2.length(); i++){
			if(map[str2.charAt(i)] == null) { return false; } else { map[str2.charAt(i)]--;}
				
		}

		for (int i = 0; i < str2.length(); i++){
			if  (map[str2.charAt(i)] != 0) 
				return false;
				
		}
		
		return true;		
				
	}
	
	
}