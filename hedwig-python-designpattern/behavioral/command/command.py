import os

__author__ = 'patrick'


class MoveFileCommand(object):
    def __init__(self, src, dest):
        self.src = src
        self.dest = dest

    def execute(self):
        print('renaming {} to {}'.format(self.src, self.dest))
        os.rename(self.src, self.dest)

    def undo(self):
        print('renaming {} to {}'.format(self.dest, self.src))
        os.rename(self.dest, self.src)


def main():

    command_stack = [MoveFileCommand('foo.txt', 'bar.txt'), MoveFileCommand('bar.txt', 'baz.txt')]
    # commands are just pushed into the command stack

    # they can be executed later on
    for cmd in command_stack:
        cmd.execute()

    # and can also be undone at will
    for cmd in reversed(command_stack):
        cmd.undo()

if __name__ == '__main__':
    main()
