class Solution:
    def frequencySort(self, nums: List[int]) -> List[int]:
        s = {}
        for i in range(len(nums)):
            s[nums[i]] = s.get(nums[i],0)+1
        nums.sort(key=lambda x: (s[x],-x))
        return nums

            
                 