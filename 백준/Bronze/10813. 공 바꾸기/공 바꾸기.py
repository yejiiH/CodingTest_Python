n,m=map(int,input().split())
basket=[i for i in range(1,n+1)]

for _ in range(m):
    a,b=map(int,input().split())
    basket[a-1],basket[b-1]=basket[b-1],basket[a-1]

for i in range(n):
    print(basket[i],end=" ")


