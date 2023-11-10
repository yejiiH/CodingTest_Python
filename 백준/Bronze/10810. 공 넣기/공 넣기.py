n,m=map(int,input().split())
basket=[0]*n

for _ in range(m):
    a,b,c = map(int,input().split())

    for i in range(a,b+1):
        basket[i-1]=c
        
for i in range(n):
    print(basket[i],end=" ")
