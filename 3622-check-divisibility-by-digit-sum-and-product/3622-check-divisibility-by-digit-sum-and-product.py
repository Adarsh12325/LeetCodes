class Solution:
    def checkDivisibility(self, n: int) -> bool:
        x = n
        s = 0
        p = 1
        while(x>0):
            d = x%10
            s+=d
            p*=d
            x=x//10
        s1 = s+p
        if n%s1==0:
            return True
        else:
            return False
