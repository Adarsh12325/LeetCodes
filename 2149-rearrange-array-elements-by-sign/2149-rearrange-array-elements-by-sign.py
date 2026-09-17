class Solution:
    def rearrangeArray(self, nums: List[int]) -> List[int]:
        l1 = []
        l2 = []
        l3 = []
        for i in nums:
            if i<0:
                l2.append(i)
            else:
                l1.append(i)
        j = 0
        k = 0
        for i in range(len(nums)):
            if i%2==0:
                l3.append(l1[j])
                j+=1
            else:
                l3.append(l2[k])
                k+=1
        return l3
            