class RubyDataStructures::StackAsArray
  attr_reader :length,:top

  def initialize(size=1)
    @length=size
    self.reset
  end

  def empty?
    @top.nil?
  end

  def full?
    @top==@length-1
  end

  def singleton?
    @top==0
  end

  def push(element)
    raise "Stack Overflow- the stack is full" if self.full?
    if self.empty?
      @top=0
    else
      @top=@top+1
    end

    @array[@top] =element
  end

  def pop
    raise "Stack UnderFlow " if self.empty?

    x=@array[@top]
    if self.singleton?
      @top=nil
    else
      @top=@top-1
    end
    return x
  end

  def reset
    @array=Array.new(@length)
    @top=nil
  end

  alias_method :reset!, :reset

  def size
    @array.size
  end

  def first
    @array.first
  end

  def last
    @array.last
  end

  def each
    @array.each do
      yield
    end
  end
end