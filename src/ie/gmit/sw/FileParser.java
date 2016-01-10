package ie.gmit.sw;

import java.io.*;
import java.util.*;

public class FileParser {
	
	private Map<String, Integer> wordMap = new HashMap<String, Integer>();
	private StopWordsMap s = new StopWordsMap();

	public FileParser(String fileName) throws Exception {
		super();
		parse(fileName);
	}
	
	public void parse(String file) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
		StringBuffer sb = new StringBuffer();
		
		int j;
		// Continue reading until EOF
		while((j = br.read()) != -1){
			char next = (char)j;
			
			if (next >= 'A' && next <= 'z' || next == '\''){
				sb.append(next);
			}
			
			else {
				String word = sb.toString().toUpperCase();
				sb = new StringBuffer();
				
				// Only add word to map that aren't in StopWordsMap
				if (!s.compare(word) && word.length() > 0) {
					int frequency = 0;
					
					if(wordMap.containsKey(word)){
						frequency = wordMap.get(word);
					}
					frequency++;
					wordMap.put(word, frequency);
				}
			}
		}
		
		for(String word : wordMap.keySet())  {
			double score = getScore(word);
			
			System.out.println("word: " + word + " freq: " + wordMap.get(word) + " score " + score);
			
		}
		br.close();		
	}	
	
	private double getScore(String word) {
		double score;
		
		double freq = (double)wordMap.get(word);
		int total = wordMap.size();
		
		score = (freq+total)/total;
		score = round(score, 3);
		return score;
	}


	private double round(double val, int places)
	{
		String s = String.format("%."+places+"f", val);
			double result = Double.parseDouble(s);
		    return result;
	}
	
	public Map<String, Integer> getMap()
	{
		System.out.println("Here is your map");
		return wordMap;
	}
}
