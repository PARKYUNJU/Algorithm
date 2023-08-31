def solution(n, m, section):
    answer = 1
    start=section[0]
    for i in range(1,len(section)):
        if section[i]-start>=m: #롤러의 길이보다 크면 한번 더 칠해야 하므로
            answer+=1
            start=section[i]
    
        
    return answer