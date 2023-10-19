def solution(id_list, report, k):
    answer = []
    신고횟수 = {}  # 각 유저 신고당한 횟수
    신고리스트 = {}
    정지리스트 = []
    for i in id_list:
        신고횟수[i] = 0
        신고리스트[i] = []

    for i in report:
        유저, 신고 = i.split(" ")
        if 신고 not in 신고리스트.get(유저):
            신고횟수[신고] += 1
            신고리스트[유저].append(신고)

    for key, value in 신고횟수.items():
        if value >= k:
            정지리스트.append(key)

    count = 0
    for key, value in 신고리스트.items():
        for j in 정지리스트:
            if j in value:
                count += 1
        answer.append(count)
        count = 0

    return answer
