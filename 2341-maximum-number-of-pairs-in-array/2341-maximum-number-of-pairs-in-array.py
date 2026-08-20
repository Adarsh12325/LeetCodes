class Solution:
    def numberOfPairs(self, nums: List[int]) -> List[int]:
        s = {}
        for i in range(len(nums)):
            s[nums[i]] = s.get(nums[i],0)+1
        p = 0
        l = 0
        for c in s.values():
            p += c//2
            l += c%2
        return [p,l]