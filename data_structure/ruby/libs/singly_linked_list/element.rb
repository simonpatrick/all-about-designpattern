class RubyDataStructures::SinglyLinkedList::Element
  attr_accessor :key
  attr_accessor :next

  def initialize(list,key)
    @list =list
    @key =key
  end
end