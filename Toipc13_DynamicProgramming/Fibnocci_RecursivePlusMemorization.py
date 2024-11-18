def fib(dp,n):
    
    if n<=1:
        return n
    
    if dp[n]!=0:
        return dp[n]
    
    dp[n]= fib(dp,n-1)+fib(dp,n-2)
    
    return dp[n]


n=10
dp=[0]*(n+1)
ans=fib(dp,n)
print(ans)