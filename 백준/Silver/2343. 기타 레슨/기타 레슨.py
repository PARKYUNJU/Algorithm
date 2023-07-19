import sys
iput=sys.stdin.readline

n,m=map(int,input().split())


arr=list(map(int,input().split()))

answer=0
start=max(arr)
end=sum(arr)

while start<=end:
    mid=(start+end)//2
    count=0
    sum=0
    for i in range(n):
        if sum+arr[i]>mid:
            count+=1
            sum=0
        sum+=arr[i]
    if sum:
        count+=1 # 그냥 하나로 쪼개질떄?
    if count>m: # 너무 많이 쪼개짐 = 기준이 너무 작다
        start=mid+1
    else : # 원하는 블루레이 수에 맞춰서 잘라짐 = 혹시모르니까 더 줄여서 잘라보자. 일단 answer에 저장하고
        end=mid-1
        answer=mid

print(answer)