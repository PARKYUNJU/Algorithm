def solution(a, b, n):
    answer = 0
    while n>=a:
        남은병=n%a
        n=(n // a) * b #받은병
        answer+=n
        n+=남은병 #받은병 + 남은병

    return answer
