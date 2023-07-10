n,l,w=map(int,input().split())

bus=list(map(int,input().split()))



time,index=0,0
bridge=[0]*l

while bridge:
    time+=1
    bridge.pop(0)
    if bus:
        if sum(bridge)+bus[index]<=w:
            bridge.append(bus[index])
            bus.pop(0)


        else:
            bridge.append(0)


print(time)









