s = list(input())

stack = []
answer = 0
count = 1

for i in range(len(s)):

    if s[i] == "(":
        stack.append(s[i])
        count *= 2

    elif s[i] == "[":
        stack.append(s[i])
        count *= 3

    elif s[i] == ")":
        if not stack or stack[-1] == "[":
            answer = 0
            break
        if s[i-1] == "(":
            answer += count
        stack.pop()
        count //= 2

    else:
        if not stack or stack[-1] == "(":
            answer = 0
            break
        if s[i-1] == "[":
            answer += count

        stack.pop()
        count //= 3

if stack:
    print(0)
else:
    print(answer)