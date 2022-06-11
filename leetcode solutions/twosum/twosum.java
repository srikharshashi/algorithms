class Solution {
    public int[] twoSum(int[] nums, int target) {
         int arr[]=new int[2];
        if(nums.length==2)
        {
             arr[0]=0;arr[1]=1; return arr;
        }
        
        Map<Integer,Integer> mapp=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            int k=target-nums[i];
            if(mapp.containsKey(k))
            {
                arr[0]=i;arr[1]=mapp.get(k);
                break;
            }
            mapp.put(nums[i],i);
        }
       
        
        
        
        return arr;
    }
}