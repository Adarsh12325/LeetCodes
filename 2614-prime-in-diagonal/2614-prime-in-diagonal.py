class Solution:
    def prime(self,x):
        if x<=1:
            return False
        for i in range(2,int(x**0.5)+1):
            if x%i==0:
                return False
                break
            
        return True
    def diagonalPrime(self, nums: List[List[int]]) -> int:
        n=len(nums)
        max1 = 0
        print(n)
        for i in range(n):
            for j in range(n):
                if i==j or j==n-i-1:
                    if self.prime(nums[i][j]):
                        max1 = max(max1,nums[i][j])
        return max1

