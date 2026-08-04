class Solution:
    def findMissingElements(self, nums: List[int]) -> List[int]:
        nums.sort()
        s = set(nums)
        m = []
        n = len(nums)
        x = nums[0]
        y = nums[n-1]
        for i in range(x,y+1):
            if i not in s:
                m.append(i)
        return m