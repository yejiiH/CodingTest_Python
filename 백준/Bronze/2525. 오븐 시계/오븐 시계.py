hour,minutes=map(int,input().split())
time = int(input())

if minutes+time<60:
    minutes=minutes+time
    print(hour,minutes)


else:
    hour+=(minutes+time)//60
    minutes=(minutes+time)%60
    if hour==24:
        print(0,minutes)
    elif hour > 24:
        print(hour-24,minutes)
    else:
        print(hour,minutes)




