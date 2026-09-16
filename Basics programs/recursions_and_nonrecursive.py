a,b=map(int,input().split())
s=a
for i in range(1,b+1):
    s+=1
print("sum using iterative approach :",s)

def sum(a,b):
    add=0
    if a==0:
        return b
    elif b==0:
        return a
    else:
        add=sum(a,b-1)+1
    return add

print("Sum using recursive :",sum(a,b))
