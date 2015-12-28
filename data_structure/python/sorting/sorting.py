
data=[1,4,5,2,9,0]
print(sorted(data))

def buble_sort(data):
    length=len(data)
    for i in range(length-1):
        for j in range(length-1):
            if(data[j]>data[j+1]):
                temp=data[j]
                data[j]=data[j+1]
                data[j+1]=temp

    return data

print(buble_sort(data))

def insert_sorting(data):
    for i in range(1,len(data)):
        temp=data[i]
        j=i
        while j>0 and data[j-1] >temp:
            data[j]=data[j-1]
            j-=1
        data[j]=temp
    return data

print(insert_sorting(data))
