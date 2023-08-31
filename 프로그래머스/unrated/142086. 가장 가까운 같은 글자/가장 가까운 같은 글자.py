def solution(s):
    answer = []
    
    for i in range(len(s)):
        if s[i] in s[:i]:
            indexes=[j #숫자를 indexes 라는 배열에 넣을건데 
                     for j, letter in enumerate(s[:i]) #enumerate 안에 들어간 문자열을 인덱스랑 같이 돌면서 
                     if letter==s[i]] #지금 글자랑 같은 놈의 인덱스만 배열에 넣을거야
            
            answer.append(i-max(indexes))
            indexes=[]
        else:
            answer.append(-1)
        
    return answer