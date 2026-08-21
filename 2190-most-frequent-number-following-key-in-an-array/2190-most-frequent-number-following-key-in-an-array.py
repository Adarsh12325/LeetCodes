class Solution:
    def mostFrequent(self, nums: List[int], key: int) -> int:
        s = {}
        l1 = []
        for i in range(1,len(nums)):
            if nums[i-1]==key:
                l1.append(nums[i])
        max1 = 0
        for i in range(len(l1)):
            s[l1[i]] = s.get(l1[i],0)+1
            max1 = max(max1,s[l1[i]])
        a = 0
        for i in range(len(l1)):
            if s[l1[i]]==max1:
                a = l1[i]
                break
        return a
         