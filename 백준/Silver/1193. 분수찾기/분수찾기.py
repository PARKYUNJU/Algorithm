import sys
input=sys.stdin.readline

a=int(input())

lastIndex=0
line=0

while a>lastIndex:
    line+=1
    lastIndex+=line

num=lastIndex-a
if line%2==0: #짝수 줄이라면
    down=num+1
    up=line-num
else:
    up=num+1
    down=line-num

print(str(up)+"/"+str(down))
