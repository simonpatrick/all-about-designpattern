# We use blocks for command implementation.
# 1. class that uses commands-blocks

class CommandUser
  def initialize(&command)
    @command=command
  end

  def operation
    @command.call if @command!=nil
  end
end

command_user =CommandUser.new do
  puts 'command1'
end

command_user.operation
