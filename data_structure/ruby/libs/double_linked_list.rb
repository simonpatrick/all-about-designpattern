class RubyDataStructures::DoublyLinkedList < RubyDataStructures::SinglyLinkedList
  def initialize
    @sentinel = RubyDataStructures::DoublyLinkedList::Element.new(self, nil)
    self.reset
  end

  def reset
    super
    @sentinel.previous=@sentinel
  end

  def tail
    @sentinel.previous
  end

  def insert(item)
    element = RubyDataStructures::DoublyLinkedList::Element.new(self, item)
    element.next = @sentinel.next
    @sentinel.next =element
    element.next.previous=element
    element.previous=@sentinel
  end

  def delete(key)
    element = search(key)

    if element==@sentinel
      raise "Argument Error - No Element Found"
    else
      element.previous.next=element.next
      element.next.previous =element.previous
    end
  end
end