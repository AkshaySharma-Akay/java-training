package com.epsilon.training.assignment.second;


public class Second {

	// Assignment 11
	public static char[] reverseString(String str) {
		int n = str.length();
		char s[] = new char[n];
		for (int i = 0, j = n - 1; i < n && j >= 0; i++, j--) {
			s[i] = str.charAt(j);
		}
		return s;
	}

	public static void reverseCharArray(char[] s, int x, int y) {
		int n = s.length;
		for (int i = x, j = y; i <= j && j < n; i++, j--) {
			char tmp = s[i];
			s[i] = s[j];
			s[j] = tmp;
		}
	}

	public static String reverseByWords(String sentence) {
		int n = sentence.length();
		char[] s = reverseString(sentence);
		int x = 0;
		for (int i = 0; i < n; i++) {
			if (s[i] == ' ') {
				reverseCharArray(s, x, i - 1);
				x = i + 1;
			}
		}
		if (s[n - 1] != ' ')
			reverseCharArray(s, x, n - 1);
		return String.valueOf(s);
	}

	// Assignment 12
	public static String inWords(int num) { 
		return null;
	}
	
	// Assignment 13
	public static int getRandom()
	{
		int ans = (int)(Math.random() * 100);
		return ans;
	}
//	public static String generatePassword(int length) {
//		String password="";
//		String s="abcdefghijklmnopqrstuvwxyzABCDEFG";
//		
//		ar.addAll(Arrays.asList(sChar));
//		
//		for()
//		for(int i=0;i<length;i++) {
//			int rand = getRandom();
//			rand = rand%72;
//			if(rand >=0 && rand <= 9) {
//				password += rand;
//			}
//			else if(rand >=10 && rand <= 36)
//			{
//				rand = rand - 10;
//				password += (char)('a' + rand);
//			}else if(rand >= 37 && rand <= 62)
//			{
//				rand = rand - 37;
//				password += (char)('A' + rand);
//			}else {
//				rand = rand - 63;
//				password += specialChar[rand];
//			}
//		}
//		return password;
//	}

//	// Assignment 14
//	public static void main(String[] args) {
//		String out = reverseByWords("my name is vinod and i live in bangalore");
//		// the variable "out" should be equal to "bangalore in live i and vinod is name
//		// my".
//		System.out.println("Password of Length 5: " + generatePassword(5));
//	}
	
	//Assignment 
	

}
