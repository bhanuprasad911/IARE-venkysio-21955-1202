ans=[]
temp=""
def reverse(s,i,n):
    global ans,temp
    if i>=n:
        ans.append(temp)
        return 
    if(s[i]==" "):
        ans.append(temp)
        temp=" "
    temp=s[i]+temp
    reverse(s,i+1,n)
para=input()
reverse(para,0,len(para))
print(" ".join(ans))
