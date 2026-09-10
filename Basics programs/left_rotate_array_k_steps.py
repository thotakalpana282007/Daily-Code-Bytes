#write a program to rotate the array by k positions
#1st method 

def reverse(arr,l,r):
    while l<r:
        arr[l],arr[r]=arr[r],arr[l]
        l+=1
        r-=1

arr=list(map(int,input().split()))
k=int(input())%len(arr)
reverse(arr,0,k-1)
reverse(arr,k,len(arr)-1)
reverse(arr,0,len(arr)-1)
print(arr)


#2nd method using inbuilt methods
arr=list(map(int,input().split()))
n=len(arr)
k=int(input())%n
arr[0:k]=reversed(arr[0:k])
arr[k:n]=reversed(arr[k:n])
arr[:]=reversed(arr[0:n])
print(arr)
