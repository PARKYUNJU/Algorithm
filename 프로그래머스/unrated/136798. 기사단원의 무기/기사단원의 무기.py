import math
def solution(number, limit, power):
    answer = 0

    for i in range(1, number + 1):
        a = 약수개수(i)
        if a <= limit:
            answer += a
        else:
            answer += power

    return answer


def 약수개수(number):
    count = 0
    for i in range(1, int(number ** (1 / 2) + 1)):
        if (number % i == 0):
            count += 1
            if i**2!=number:
                count+=1
    return count         