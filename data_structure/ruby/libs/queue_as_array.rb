class RubyDataStructures::QueueAsArray

  def initialize(size=1)
    @length =size
    self.reset
  end

  def empty?
    @head.nil?
  end

  def full?
    @head=@tail
  end

  def enqueue(element)
    raise "Queue Overflow" if self.full?

    @array[@tail] =element

    if @head.nil?
      @head=0
    end

    if @tail==@length-1
      @tail=0
    else
      @tail=@tail+1
    end
  end

  def dequeue
    raise "Queue UnderFLow" if self.empty?

    x=@array[@head]

    if @head ==@length-1
      @head=0
    else
      @head=@head+1
    end

    if @head==@tail
      self.reset
    end
    return x
  end

  def reset
    @array=Array.new(@length)
    @head=nil
    @tail=0
  end
end