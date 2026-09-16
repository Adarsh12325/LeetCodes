# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def pairSum(self, head: Optional[ListNode]) -> int:
        sum1 = 0
        max1 = 0
        l = []
        temp = head
        while temp:
            l.append(temp.val)
            temp = temp.next
        for i in range(len(l)):
            sum1 = l[i]+l[len(l)-i-1]
            max1 = max(max1,sum1)
        return max1