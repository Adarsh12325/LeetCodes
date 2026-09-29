class Solution:
    def mergeAlternately(self, word1: str, word2: str) -> str:
        l1 = []
        n = max(len(word1),len(word2))
        m = min(len(word1),len(word2))
        i = 0
        j = 0
        while i<len(word1) and j<len(word2):
            l1.append(word1[i])
            l1.append(word2[j])
            i+=1
            j+=1
        for i in range(m,n):
            if len(word1)>len(word2):
                l1.append(word1[i])
            else:
                l1.append(word2[i])
        
        return "".join(l1)

