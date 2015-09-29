# chain of responsibility:
#
# - Avoid coulpling the sender of a request to it's receiver by giving more than
# - one object a chance to handle the request. Chains the receiving object and passes
# - the request along the chain until an object handles it.

class Chain
  def handle
  end

  def initialize(next_in_chain)
    @next_in_chain=next_in_chain
  end
end

class MyChain <Chain
  def initialize(name, next_in_chain=nil)
    super(next_in_chain)
    @name=name
  end

  def handle
    puts 'Handling by '+@name+'.'
    if (@next_in_chain!=nil)
      @next_in_chain.handle
    end
  end
end

chain = MyChain.new('chain1', MyChain.new('chain2', MyChain.new('chain3', MyChain.new('chain5', MyChain.new('chain4')))))
chain.handle
