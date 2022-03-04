package Hashing;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class KthDistinctStringinanArray {

	public static void main(String[] args) {
		String[] arr = {"d","b","c","b","c","a"}; int k = 2;
		String res = kthDistinct(arr,k);
		System.out.print(res);

	}
	
	public static String kthDistinct(String[] arr, int k) {
        HashMap<String,Integer> map = new LinkedHashMap<>();
        for(String str : arr)
            map.put(str,map.getOrDefault(str,0)+1);
        for(String s : arr){
            if(map.get(s)==1)
                k--;
            if(k==0) return s;
        }
        return "";
        
    }

}
