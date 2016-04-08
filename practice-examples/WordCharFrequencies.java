import java.io.IOException;
	import java.io.StringReader;
	import java.util.ArrayList;
	import java.util.Map;
	import java.util.TreeMap;


	public class  WordCharFrequencies {

		
		public static void main(String[] args) {
			System.out.println(" java WordCharFrequencies");
			
		String wordOccurrence = "Don't trouble trouble unless trouble troubles you";
			     
		String[] words = wordOccurrence.split(" ");
		
		Map<String, Integer> wordCounts = new TreeMap<String, Integer>();
			   
			   
			  ArrayList <Character> cList = new ArrayList <Character>();
			   for (String word : words) {
			      Integer count = wordCounts.get(word);
			      cList.add(word.charAt(0));
			           if (count == null) {
			            count = 0;
			        }
			        wordCounts.put(word, count + 1);
			    }
			     System.out.println(wordCounts);
			    
			     
			     Map<Character, Integer> charCounts = new TreeMap<Character, Integer>();  
			    
			     for (char c : cList){
			    	  Integer count = charCounts.get(c);
			    	  
			           if (count == null) {
			        	   charCounts.put(c, 1);
			        }
			           else charCounts.put(c, count + 1);
			        	
			        
			        
			    }
			     System.out.println(charCounts);
			    	 	 
		 }
	}
			
