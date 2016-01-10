package ie.gmit.sw;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.HashSet;

public class StopWordsMap {
	private static HashSet<String> set = new HashSet<String>(); 

	public StopWordsMap() throws Exception {
		super();
		parse("./stopWords.txt");
	}
	
	public boolean compare(String word) {
		// true if stop word is found
		if(set.contains(word)) return true;
				
		return false;
	}
	
	// Create hashset of words to ignore(stopwords)
	private void parse(String filename) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(filename)));
		StringBuffer sb = new StringBuffer();
		
		int i;
		while((i = br.read()) != -1) {
			char next = (char)i;
			
			if (next != '\n') sb.append(next);
			
			else {
				String sWord = sb.toString().toUpperCase();
				sb = new StringBuffer();
								
				set.add(sWord);
			}
		}
		br.close();
		System.out.println(set);
	}
}