
class Solution:
    def numDistinct(self, s: str, t: str) -> int:
        m, n = len(s), len(t)
        dp = [1] + [0]*n
        for i in range(1 , m + 1):
            for j in range( min(i,n) , 0, - 1):
                if s[i - 1] == t[j - 1]:
                    dp[j] += dp[j - 1]
        return dp[n]