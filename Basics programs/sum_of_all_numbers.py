s=input()
sum=0
for ch in s:
    if ch.isdigit():
        sum+=int(ch)
print(sum)
