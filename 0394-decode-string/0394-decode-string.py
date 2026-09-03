class Solution:
    def decodeString(self, s: str) -> str:
        stk = []
        for i in range(len(s)):
            if s[i] != "]":
                stk.append(s[i])
            else:
                s1 = ""
                while stk[-1] != "[":
                    s1 = stk.pop() + s1
                stk.pop()
                s2 = ""
                while stk and stk[-1].isdigit():
                    s2 = stk.pop() + s2
                stk.append(int(s2)*s1)
        return "".join(stk)
                

                    