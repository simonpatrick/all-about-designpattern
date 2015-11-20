class RubyDataStructures::SinglyLinkedList
  def initialize
    @sentinel= RubyDataStructures::SinglyLinkedList::Element.new(self,nil)
    self.reset
  end

  def head
    @sentinel.next
  end

  def empty?
    self.head==@sentinel
  end

  def reset
    @sentinel.next=@sentinel
  end

  def insert(item)
    element = RubyDataStructures::SinglyLinkedList::Element.new(self, item)
    element.next=@sentinel.next
    @sentinel.next=element
  end

  def search(key)
    element = self.head
    while(element!=@sentinel) do
      element=element.next
    end

    return element
  end

  def delete(key)
    element = self.head
    prev_element=@sentinel
    while(element!=@sentinel)&&(element.key!=key)
      prev_element=element
      element=element.next
    end

    if element==@sentinel
      raise "Argument Error - NO Element with key found"
    else
      prev_element.next=element.next
    end
  end
end