import sys
input=sys.stdin.readline

n,k=map(int,input().split())
arr=list(map(int,input().split()))
start,end=0,0
answer=0
counter=[0]*(max(arr)+1) #양의정수로만 이루어졌기 때문에 1부터 편하게 넣을거임
while end<n:
    if counter[arr[end]]<k:
        counter[arr[end]] += 1
        end+=1
    else:
        counter[arr[start]]-=1
        start+=1
    answer=max(answer,end-start)


print(answer)

