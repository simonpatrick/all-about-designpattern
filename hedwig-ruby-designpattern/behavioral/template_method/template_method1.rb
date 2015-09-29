# Defines the skeleton of an algorithm in an operation, deferring some steps
# to subclasses. Let subclasses redefine certain steps of an algorithm without
# changing the algorithm's structure.

# 1. template

module AlgorithmTemplate
  def step1
    raise 'Called abstract class'
  end
  def step2
    raise 'Called abstract class'
  end
  def step3
    raise 'Called abstract class'
  end
  def do_something
    step1
    step2
    step3
  end
end

class MyAlgorithmTemplate1
  include AlgorithmTemplate
  protected

  def step1
    puts 'algorithm1'
  end
  def step2
    puts 'algorithm1'
  end
  def step3
    puts 'algorithm1'
  end
end

# module is a little bit interface like

class MyAlgorithmTemplate2
  include AlgorithmTemplate
  protected

  def step1
    puts 'algorithm2'
  end
  def step2
    puts 'algorithm2'
  end
  def step3
    puts 'algorithm2'
  end
end

t1=MyAlgorithmTemplate1.new
t2=MyAlgorithmTemplate2.new

t1.do_something
t2.do_something
