import sys
input=sys.stdin.readline

a=input()
b=input()

start,end=0,0
answer=0
while end<len(a):
    if a[start:end] in b:
        end+=1
    else:
        start+=1
    answer=max(answer,end-start)
print(answer-1)

