$:.unshift File.join(File.dirname(__FILE__),'..','lib')

require 'test/unit'
require 'RubyDataStructures'

class StackAsArrayTest < Test::Unit::TestCase
  def test_stack_as_array
    stack = RubyDataStructures::StackAsArray.new(3)

    assert stack.empty?
    assert !stack.singleton?
    assert !stack.full?

    assert_raise RuntimeError, "Stack Underflow - The stack is empty" do
      stack.pop
    end

    stack.push(1)
    assert !stack.empty?
    assert stack.singleton?
    assert !stack.full?

    stack.push(2)
    assert !stack.empty?
    assert !stack.singleton?
    assert !stack.full?

    stack.push(3)
    assert !stack.empty?
    assert !stack.singleton?
    assert stack.full?

    assert_raise RuntimeError, "Stack Overflow - The stack is full" do
      stack.push(4)
    end

    assert_equal 3, stack.pop
    assert !stack.empty?
    assert !stack.singleton?
    assert !stack.full?

    assert_equal 2, stack.pop
    assert !stack.empty?
    assert stack.singleton?
    assert !stack.full?

    stack.push(7)
    assert !stack.empty?
    assert !stack.singleton?
    assert !stack.full?

    assert_equal 7, stack.pop
    assert !stack.empty?
    assert stack.singleton?
    assert !stack.full?

    assert_equal 1, stack.pop
    assert stack.empty?
    assert !stack.singleton?
    assert !stack.full?

    assert_raise RuntimeError, "Stack Underflow - The stack is empty" do
      stack.pop
    end
  end

  def test_stack_as_array_reset
    stack = RubyDataStructures::StackAsArray.new(3)

    assert stack.empty?
    assert !stack.singleton?
    assert !stack.full?

    stack.push(1)
    stack.push(2)

    assert !stack.empty?
    assert !stack.full?

    stack.reset

    assert stack.empty?
    assert !stack.full?
  end
end
