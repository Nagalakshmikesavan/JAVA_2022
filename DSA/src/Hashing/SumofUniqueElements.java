package Hashing;

import java.util.HashMap;

public class SumofUniqueElements {
	public static void main(String args[])
	{
		int nums[] = {3,6,2,3,3};
		int res = sumOfUnique(nums);
		System.out.println(res);
		
	}
	public static int sumOfUnique(int[] nums) {
        
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        
        int sum= 0;
        for(int val : nums)
        {
            if(map.get(val)==1)
                sum +=val;
        }
        return sum;
 

}
}
