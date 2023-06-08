import sys
input=sys.stdin.readline


n=int(input())

arr=list(map(int,input().split()))
arr.insert(0,0)
studNum=int(input())


def changeSwitch(index):
    if arr[index] == 0:
        arr[index] = 1
    else:
        arr[index] = 0
    return


for _ in range(studNum):
    gender,switch=map(int,input().split())
    if gender==1:
       # print("boy")
        for i in range(1,n+1):
            if i%switch==0:
                changeSwitch(i)
    else:
        #print("girl")
        changeSwitch(switch) #일단 기준 번호 바꾸고
        for i in range(n//2):
            if switch+i>n or switch-i<1:
                break
            if arr[switch-i]==arr[switch+i]:
                changeSwitch(switch-i)
                changeSwitch(switch+i)
            else:
                break


            # 스위치 기준으로 양쪽이 최대 대칭일 때까지 고르기
            # 양쪽이 같다면 다음 대칭을 찾아서 계속 진행


for i in range(1,n+1):
    print(arr[i],end=" ")
    if i % 20 == 0 :
            print()


