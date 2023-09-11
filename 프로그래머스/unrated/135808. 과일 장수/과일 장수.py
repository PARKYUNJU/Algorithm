def solution(k, m, score):
    answer = 0
    score.sort(reverse=True)
    #m개씩 포장
    #최대로 나올 수 있는 상자 개수
    box=len(score)//m
    for i in range(0,box*m,m):
        answer+=min(score[i:i+m])*m

    return answer