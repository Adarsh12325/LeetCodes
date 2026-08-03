class Solution:
    def haveConflict(self, event1: List[str], event2: List[str]) -> bool:
        a1,b1 = event1
        a2,b2 = event2
        return a1<=a2<=b1 or a2<=a1<=b2