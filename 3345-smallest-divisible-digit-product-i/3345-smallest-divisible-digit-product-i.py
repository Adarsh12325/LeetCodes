class Solution:
    def smallestNumber(self, n: int, t: int) -> int:
        min1 = 100
        l = []
        while(min1>=n):
            p = 1
            x = min1
            while x!=0:
                d = x%10
                p *= d
                x = x//10
            if p%t==0:
                l.append(min1)
            min1-=1
        return min(l)