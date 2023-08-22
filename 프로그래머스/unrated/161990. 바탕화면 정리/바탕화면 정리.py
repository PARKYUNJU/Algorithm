def solution(wallpaper):
    result=[]

    h=len(wallpaper)
    w=len(wallpaper[0])

    x=[]
    y=[]

    for i in range(h):
        for j in range(w):
            if wallpaper[i][j]=='#':
                x.append(i)
                y.append(j)
    result.append(min(x))
    result.append(min(y))
    result.append(max(x)+1)
    result.append(max(y)+1)

    return result