package Hashing;

import java.util.HashMap;

public class CheckiftheSentenceIsPangram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String sentence = "thequickbrownfoxjumpsoverthelazydog";
		boolean bool = checkIfPangram(sentence);
		System.out.print(bool);

	}
	
	public static boolean checkIfPangram(String sentence) {
	    
        if(sentence.length()<26) return false;
        HashMap<Character,Integer> map =new HashMap<>();
        for(int i=0;i<sentence.length();i++)
        {
            char c = sentence.charAt(i);
            map.put(c,map.getOrDefault(c,0)+1);
        }
       return map.size()==26 ? true : false;
        // HashSet<Character> set = new HashSet<>();
        // for(int i=0;i<sentence.length();i++)
        //     set.add(sentence.charAt(i));
        // System.out.println(set.size());
        // return set.size()==26 ? true : false;
        
        
    }

}
