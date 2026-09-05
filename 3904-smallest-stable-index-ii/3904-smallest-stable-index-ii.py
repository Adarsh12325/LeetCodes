class Solution:
    def firstStableIndex(self, nums: list[int], k: int) -> int:
        n = len(nums)
        s = [0]*n
        s[-1] = nums[-1]
        for i in range(n-2,-1,-1):
            s[i] = min(nums[i],s[i+1])
        p = nums[0]
        for i in range(n):
            p = max(nums[i],p)
            if p-s[i]<=k:
                return i
        return -1