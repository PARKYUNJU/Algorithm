def solution(s):
    answer = 1
    start=s[0]
    same,diff =1,0

    for i in range(1 ,len(s)):
        if same==diff:
            answer+=1
            start=s[i]
        if s[i]==start:
            same+=1
        else:
            diff+=1

        
        
    return answer