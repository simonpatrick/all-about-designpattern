class Mediator
  def operation1
  end
  def operation2
  end
end

class MyMediator <Mediator
  def operation1
    puts 'mediator: operator1'
  end
  def operation2
    puts 'mediator: operator2'
  end
end

class Product1
  def initialize(mediator)
    @mediator=mediator
  end

  def perform
    @mediator.operation1
  end
end

class Product2
  def initialize(mediator)
    @mediator=mediator
  end

  def perform
    @mediator.operation2
  end
end

class Product3
  def initialize(mediator)
    @mediator = mediator
  end

  def perform
    @mediator.operation2
  end
end

mediator = MyMediator.new

product11 = Product1.new(mediator)
product12 = Product1.new(mediator)

product21 = Product2.new(mediator)
product22 = Product2.new(mediator)

product31 = Product3.new(mediator)
product32 = Product3.new(mediator)

product11.perform
product12.perform

product21.perform
product22.perform

product31.perform
product32.perform
