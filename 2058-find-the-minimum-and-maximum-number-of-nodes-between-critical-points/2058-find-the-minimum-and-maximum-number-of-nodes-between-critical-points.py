# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def nodesBetweenCriticalPoints(self, head: Optional[ListNode]) -> List[int]:
        l = []
        c = 1
        temp = head

        while temp.next.next:
            if (temp.val < temp.next.val > temp.next.next.val or
                temp.val > temp.next.val < temp.next.next.val):
                l.append(c + 1)

            temp = temp.next
            c += 1
        print()

        if len(l) < 2:
            return [-1, -1]

        min1 = float('inf')

        for i in range(1, len(l)):
            min1 = min(min1, l[i] - l[i - 1])

        max1 = l[-1] - l[0]

        return [min1, max1]