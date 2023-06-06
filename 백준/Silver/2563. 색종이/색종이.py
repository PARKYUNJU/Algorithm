
import sys
input=sys.stdin.readline

n=int(input())

# arr=[list(map(int,input().split())) for _ in range(n)]

paper=[[0 for _ in range(101)] for _ in range(101)]


for _ in range(n):
    x,y=map(int,input().split())
    for i in range(x,x+10):
        for j in range(y,y+10):
            paper[i][j]=1

count=0
for i in paper:
    count+=i.count(1)

print(count)
