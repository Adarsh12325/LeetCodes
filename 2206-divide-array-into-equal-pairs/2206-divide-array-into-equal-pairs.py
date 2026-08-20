class Solution:
    def divideArray(self, nums: List[int]) -> bool:
        n = len(nums)//2
        s = {}
        c = 0
        for i in range(len(nums)):
            s[nums[i]] = s.get(nums[i],0)+1
        for i in range(len(nums)):
            if s[nums[i]] % 2==0:
                c+=1
        if 2*n==c:
            return True
        else:
            return False
        