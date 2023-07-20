import sys
input=sys.stdin.readline

n,m=map(int,input().split())
arr=[0]*n

for i in range(n):
    arr[i]=int(input())

l = min(arr)
r = max(arr) * m
ans=r
while l <= r:
    total = 0
    mid = (l + r) // 2

    for i in range(n):
        total += mid // arr[i]

    if total >= m:
        r = mid -1
        ans = min(ans, mid)

    else:
        l = mid + 1

print(ans)