class Solution:
    def findDegrees(self, matrix: list[list[int]]) -> list[int]:
        l = []
        c = len(matrix)

        for i in range(c):
            sum = 0
            for j in range(c):
                sum+=matrix[i][j]
            l.append(sum)
        return l