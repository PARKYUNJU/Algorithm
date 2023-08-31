def solution(t, p):
    answer = 0
    pnum = int(p)
    for i in range(len(t) - len(p)+1):  # i는 인덱스 숫자
        if int(t[i:i + len(p)]) <= pnum:
            answer += 1
        
    return answer