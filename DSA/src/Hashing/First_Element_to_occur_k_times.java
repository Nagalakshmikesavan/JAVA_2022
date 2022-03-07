package Hashing;

import java.util.HashMap;

public class First_Element_to_occur_k_times {

	public static void main(String[] args) {
		
		int A[] = {1, 7, 4, 3, 4, 8, 7};
		int res = firstElementKTime(A,7,2);
		System.out.println(res);

	}

	 public static int firstElementKTime(int[] a, int n, int k) { 
	        HashMap<Integer,Integer> map = new HashMap<>();
	        map.put(a[0],0);
	        for(int i : a)
	        {
	            if(map.containsKey(i))
	            {
	                if(map.get(i)==k-1)
	                    return i;
	            }
	            map.put(i,map.getOrDefault(i,0)+1);
	        }
	        return -1;
	        
	    } 
}
