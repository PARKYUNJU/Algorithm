def solution(players, callings):
    players_dict = {index: value
                    for value, index in enumerate(players)} # 선수(키): 등수(value)
    for who in callings:
        idx = players_dict[who] # 호명된 선수의 현재 등수 딕셔너리에서 키로 검색하기 (3등)
        #현재등수 -1하기
        #앞등수 +1하기
        players_dict[who]-=1 #현재 말 등수(value)를 앞으로 땡겨주기 (players_dict["kai"]=3)
        players_dict[players[idx-1]]+=1  #앞등수(2등) 말을 뒤로 밀어주기
        players[idx-1],players[idx]=players[idx],players[idx-1]
        
        #맨처음에 idx=players.index(who) 이런식으로하면 매번 배열을 순회하며 현재말의 인덱스를 찾기 때문에 딕셔너리로 저장해서 바로바로 접근하는게 빠름

    return players
