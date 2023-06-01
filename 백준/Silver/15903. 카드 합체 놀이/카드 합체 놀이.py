import sys
input=sys.stdin.readline

m,n=map(int,input().split())
arr=list(map(int,input().split()))

arr.sort()

for i in range(n):
    num=arr[0]+arr[1]
    arr[0]=num
    arr[1] =num
    arr.sort()

print(sum(arr))
