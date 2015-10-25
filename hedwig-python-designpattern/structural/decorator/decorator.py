from functools import wraps

__author__ = 'patrick'

"""https://docs.python.org/2/library/functools.html#functools.wraps"""
"""https://stackoverflow.com/questions/739654/how-can-i-make-a-chain-of-function-decorators-in-python/739665#739665"""


def make_bold(fn):
    @wraps(fn)
    def wrapped():
        return "<br>" + fn() + "</br>"

    return wrapped


def make_italic(fn):
    @wraps(fn)
    def wrapped():
        return "<i>" + fn() + "</i>"

    return wrapped


@make_bold
@make_italic
def hello():
    """a decorated hello world"""
    return "hello world"


if __name__ == '__main__':
    print('result:{}   name:{}   doc:{}'.format(hello(), hello.__name__, hello.__doc__))
    result = hello()
    print(result)
