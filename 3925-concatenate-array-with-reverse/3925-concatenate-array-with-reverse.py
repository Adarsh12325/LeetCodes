class Solution:
    def concatWithReverse(self, nums: list[int]) -> list[int]:
        l = []
        n = len(nums)
        for i in range(2*n):
            if i>=n:
                l.append(nums[n-i-1])
            else:
                l.append(nums[i])
        return l
