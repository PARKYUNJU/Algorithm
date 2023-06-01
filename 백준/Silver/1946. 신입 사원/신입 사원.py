import sys
input = sys.stdin.readline

n = int(input())  # 몇번 검사할건지
count = [0] * n
for i in range(n):
    first = int(input())  # 첫번째 집합
    arr1 = [0] * first  # 첫번째 집합의 서류,면접을 담을 리스트(이차원으로 선언 안해줘도 됨)
    for j in range(first):
        a, b = map(int, input().split())  # 서류, 면접
        arr1[j] = [a, b]
    arr1_sorted = sorted(arr1, key=lambda x: x[0])
    # 일단 서류 기준으로 쭉 정렬
    # 서류 점수가 높은 순으로 정렬하기 때문에 내림차순 (reverse=True) -> 시간초과남

    count1 = 1;  # 일단 서류1등은 무조건 합격
    # 서류로 정렬하고 면접은 직전끼리만 비교하면됨

    mMax = arr1_sorted[0][1]  # 면접점수 통과의 기준은 직전 사람의 면접 점수
    for j in range(1, first):
        if arr1_sorted[j][1] < mMax:
            mMax = arr1_sorted[j][1]
            count1 += 1

    print(count1)