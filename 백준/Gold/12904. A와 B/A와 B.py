import sys
# input=sys.stdin.readline()
# 위에처럼 받으면 개행문자도 포함됨. 한줄씩 입력받기 때문
#그래서 문자열 길이가 개행문자를 포함하게 되니 주의!

s=input()
t=input()

while len(t)!=len(s):
    if t[len(t)-1]=="A":
        t=t[0:len(t)-1]

    else:
        t = t[0:len(t) - 1]
        t = "".join(reversed(t))

if t==s:
    print("1")
else:
    print("0")
