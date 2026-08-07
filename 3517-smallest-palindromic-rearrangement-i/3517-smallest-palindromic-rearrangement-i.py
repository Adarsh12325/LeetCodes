class Solution:
    def smallestPalindrome(self, s: str) -> str:
        n = len(s)
        h = sorted(s[:n//2])
        m = [s[n//2]] if n%2 else []
        return ''.join(h+m+h[::-1])



        
            