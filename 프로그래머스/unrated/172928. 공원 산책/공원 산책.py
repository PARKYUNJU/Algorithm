def solution(park, routes):

    arrow={"E":(0,1),"W":(0,-1),"N":(-1,0),"S":(1,0)}

    sx,sy=0,0 #시작점

    h=len(park)
    w=len(park[0])

    #시작점 찾기
    for i in range(h):
        for j in range(w):
            if park[i][j]=='S':
                sx,sy=i,j

    for i in range(len(routes)):
        way,count=routes[i].split()
        cx, cy = sx, sy

        for j in range(int(count)):
            nx = sx+int(arrow[way][0])
            ny = sy+int(arrow[way][1])
            if 0<=nx<=h-1 and 0<=ny<=w-1 and (park[nx][ny] != 'X'):
                sx, sy = nx, ny
            else:
                sx, sy = cx, cy
                break
    answer=[]
    answer.append(sx)
    answer.append(sy)
    return answer