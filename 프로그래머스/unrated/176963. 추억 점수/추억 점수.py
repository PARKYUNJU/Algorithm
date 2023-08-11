def solution(name,yearning,photo):
    count=0
    answer = []
    mydic={name[i]: yearning[i]
           for i in range(len(name))} #name(키):yearning(밸류) 딕셔너리 만들기
    
    for i in range(len(photo)):
        for j in range(len(photo[i])):
            value=mydic.get(photo[i][j]) #만약 name에 없는 이름이라면 키 에러가 나므로 0을 더해줌
            
            if value==None:
                count+=0
                
            else: #name에 존재한다면
                index = mydic[photo[i][j]] #해당 name의 yearning을 찾아서
                count+=index #더해줌
        answer.append(count)
        count=0 #끝나면 count 0으로 초기화하고 다음배열 순회

    return answer
