package Hashing;

import java.util.HashMap;

public class Largestsubarraywith0sum {

	public static void main(String[] args) {
		int N = 8;
				int arr[] = {15,-2,2,-8,1,7,10,23};
				System.out.println(maxLen(arr,N));

	}
	
	static int maxLen(int arr[], int n)
    {
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,-1);
        int sum =0,max=0;
        for(int i=0;i<arr.length;i++)
        {
            sum += arr[i];
            if(map.containsKey(sum))
            {
                int len = i - map.get(sum);
                if(len>max) max = len;
            }else{
                map.put(sum,i);
            }
            
        }
        return max;

}
}