__author__ = 'patrick'


def count_to(count):
    numbers = ["one", "two", "three", "four", "five"]
    for pos,number in zip(range(count),numbers):
        yield number

