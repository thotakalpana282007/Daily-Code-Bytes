def findMostFrequentCharacter(s):
    freq={}
    maxi=0
    for ch in s:
        value=freq.get(ch,0)+1
        maxi=max(maxi,value)
        freq[ch]=value
    for ch in s:
        if freq[ch]==maxi:
            return ch
s=input()
print(findMostFrequentCharacter(s))
