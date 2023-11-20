n=int(input())
score=list(map(int,input().split()))

max=max(score)
total = 0
for i in score:
    total+=i/max*100

print(total/n)


