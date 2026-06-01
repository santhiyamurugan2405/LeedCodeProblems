class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        HashSet<Integer> hs=new HashSet<>();
        int l=0;
        long sum=0,maxS=0;
        for(int r=0;r<nums.length;r++){
            while(hs.contains(nums[r])){
                hs.remove(nums[l]);
                sum-=nums[l];
                l++;
            }
            hs.add(nums[r]);
            sum+=nums[r];
            if(r-l+1==k){
                maxS=Math.max(sum,maxS);
                hs.remove(nums[l]);
                sum-=nums[l];
                l++;
            }
        }
         return maxS;
    }
}