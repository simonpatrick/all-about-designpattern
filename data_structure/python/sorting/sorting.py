data = [1, 4, 5, 2, 9, 0]
print(sorted(data))


def bubble_sort(source):
    length = len(source)
    for i in range(length - 1):
        for j in range(length - 1):
            if source[j] > source[j + 1]:
                temp = source[j]
                source[j] = source[j + 1]
                source[j + 1] = temp

    return source


print(bubble_sort(data))


def insert_sorting(source):
    for i in range(1, len(source)):
        temp = source[i]
        j = i
        while j > 0 and source[j - 1] > temp:
            source[j] = source[j - 1]
            j -= 1
        source[j] = temp
    return source


print(insert_sorting(data))

