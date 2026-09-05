class Solution:
    def permute(self, nums: List[int]) -> List[List[int]]:
        a = []
        p = []
        def dfs():
            if len(p)==len(nums):
                a.append(p[:])
                return
            for i in nums:
                if i in p:
                    continue
                p.append(i)
                dfs()
                p.pop()
        dfs()
        return a