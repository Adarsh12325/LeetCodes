class Solution:
    def largestInteger(self, nums: List[int], k: int) -> int:
        n = len(nums)
        w = n-k+1
        c = {}
        for i in range(w):
            s = set()
            for j in range(i,i+k):
                s.add(nums[j])
            for v in s:
                c[v] = c.get(v,0)+1
        a = -1
        for v,f in c.items():
            if f == 1:
                a = max(a,v)
        return a
                
