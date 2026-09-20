s=input()
total_sum=0
for i,ch in enumerate(s):
  char_value=26-(ord(ch)-ord('a'))
  total_sum+=char_value*(i+1)
print(total_sum)
