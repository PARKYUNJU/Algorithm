from collections import deque
def solution(new_id):
    answer = ''
    onlyUse=['-','_','.']
    #1단계
    answer=new_id.lower() 
    
    #2단계
    for i in answer:
        if i.isalnum()==False:
            if i not in onlyUse:
                answer=answer.replace(i,"")
    print(answer)
    #3단계
    queue=deque()
    queue.append(answer[0])
    for i in range(1,len(answer)):
        if answer[i]=='.':
            if queue[-1]!='.':
                queue.append(answer[i])
        else:
            queue.append(answer[i])
    answer=''.join(queue)
    print(answer)
    
    #4단계
    if len(answer)==1:
        if answer[0]=='.':
            answer=answer.replace(answer[0],'')
    else:
        answer=answer.strip('.')
    
    print(answer)
    
    #5단계
    if len(answer)==0:
        answer=answer.join('a')
    print(answer)
                
    #6단계
    if len(answer)>=16:
        answer=answer[0:15]
    answer=answer.rstrip('.')
    print(answer)
    
    #7단계
    if len(answer)<=2:
        while len(answer)<3:
            answer=answer+answer[-1]
    print(answer)
    return answer