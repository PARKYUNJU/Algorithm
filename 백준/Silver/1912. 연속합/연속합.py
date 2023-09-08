import sys
input=sys.stdin.readline

n = int(input())
array = list(map(int, input().split()))

d = [0] * n
d[0] = array[0]
for i in range(1, n):
    d[i] = max(array[i], d[i-1]+array[i]) #지금 현재 원소와 이전까지 부분합 중 큰걸 d[i]에 넣음
print(max(d))
