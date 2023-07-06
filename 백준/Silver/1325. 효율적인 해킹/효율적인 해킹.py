from collections import deque

n, m = map(int, input().split())
graph = [[] for _ in range(n + 1)]

for _ in range(m):
    a, b = map(int, input().split())
    graph[b].append(a)

max_count = 0
answer = []

for i in range(1, n + 1):
    visited = [False] * (n + 1)
    count = 0

    queue = deque([i])
    visited[i] = True

    while queue:
        node = queue.popleft()
        count += 1

        for neighbor in graph[node]:
            if not visited[neighbor]:
                visited[neighbor] = True
                queue.append(neighbor)

    if count > max_count:
        max_count = count
        answer = [i]
    elif count == max_count:
        answer.append(i)

for a in answer:
    print(a, end=' ')
