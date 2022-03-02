package Hashing;

import java.security.DomainCombiner;

public class Day_1 {
	
	public static void main(String args[])
	{
		String allowed = "ab";
		String[] words = {"ad","bd","aaab","baa","badab"};
		int res = countConsistentStrings(allowed,words);
		System.out.println(res);
		
	}
	
	 public static int countConsistentStrings(String allowed, String[] words) {
	        
	        int count=0;
	        for(int i=0;i<words.length;i++)
	        {
	            String str = words[i];
	            int c =0;
	            for(int j=0;j<str.length();j++)
	            {
	                char ch = str.charAt(j);
	                
	                if(allowed.indexOf(ch)!=-1){
	                    c++;
	                }
	            }
	            
	            if(c==str.length())
	                count++;
	        }
	        return count;
	        
	    }

}
