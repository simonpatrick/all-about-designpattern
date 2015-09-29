require 'observer'

class Observer
  def initialize(name)
    @name=name
  end

  def update(value)
    puts "updated #{@name},value:#{value}"
  end
end

class MyObservable
  include Observable

  def my_property=(property)
    @my_property=property
    changed
    notify_observers(property)
  end
end

observer1 = Observer.new("n1")
observer2 = Observer.new("n2")
observer3 = Observer.new("n3")

observer4 = Proc.new { puts "testing " }

observer4.instance_eval do
  def update(value)
    puts "updated from lambda (update is :#{value})"
  end
end

my_observable = MyObservable.new

my_observable.add_observer observer1
my_observable.add_observer observer2
my_observable.add_observer observer3
my_observable.add_observer observer4

my_observable.my_property = 'red'

puts 'Deleting observer 3 ----------'

my_observable.delete_observer observer3

my_observable.my_property = 'green'
