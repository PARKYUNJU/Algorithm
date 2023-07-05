import sys
input=sys.stdin.readline
from collections import deque

n,m,v=map(int,input().split())

graph=[[] for _ in range(n+1)]
visited=[0]*(n+1)

# 그래프 연결
for _ in range(m):
    a,b=map(int,input().split())
    graph[a].append(b)
    graph[b].append(a)


# 그래프의 각 원소들을 정렬
for i in range(1, n + 1):
    graph[i].sort()

#조건 : 단, 방문할 수 있는 정점이 여러 개인 경우에는 정점 번호가 작은 것을 먼저 방문하고

def dfs(a):
    visited[a]=1
    print(a,end=' ')
    for i in graph[a]:
        if(visited[i]==0):
            dfs(i)


def bfs1(start):
    queue = deque([start])#deque:양방향 삽입 가능 큐
    visited[start] = True

    while queue:#해당 노드에 연결된 리스트를 큐에 넣고 다 돌기
        node = queue.popleft()
        print(node, end=' ')

        for neighbor in graph[node]:
            if not visited[neighbor]:
                queue.append(neighbor)
                visited[neighbor] = True


dfs(v)
visited=[0]*(n+1)
print()
bfs1(v)

