def solution(cards1, cards2, goal):
    result=""

    for i in range(len(goal)):
        if cards1 and cards1[0]==goal[0]:
            cards1.pop(0)
            goal.pop(0)
        elif cards2 and cards2[0]==goal[0]:
            cards2.pop(0)
            goal.pop(0)
        

    if goal:
        result="No"
    else:
        result="Yes"
    
    return result