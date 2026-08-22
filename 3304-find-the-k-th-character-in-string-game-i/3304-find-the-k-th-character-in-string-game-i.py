class Solution:
    def kthCharacter(self, k: int) -> str:
        s = "abcdefghijklmnopqrstuvwxyz"
        x = (k-1).bit_count()
        return s[x]