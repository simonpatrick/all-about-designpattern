__author__ = 'patrick'

"""
1. define a pivot data
2. smaller than pivot, put in left side, other wise put in right side
3. do 1 and 2 for left side and right side
"""


def quick_sort(source):
    if len(source) <= 1:
        return source

    pivot = source.pop()
    less = []
    greater = []

    for item in source:
        if item > pivot:
            greater.append(item)
        else:
            less.append(item)

    return quick_sort(less) + [pivot] + quick_sort(greater)


data = [0, 2, 4, 5, 19, 8, 3, 4, 22, 100, 1, 90, 87, 11]

print(quick_sort(data))
