import sys
input=sys.stdin.readline

n,m=map(int,input().split())
count=1
while(m!=n):
    if m<n:
        count=-1
        break;
    if m%2 ==0:
        m=m/2
    else:
        m=(m-1)/10
    count+=1




print(count)