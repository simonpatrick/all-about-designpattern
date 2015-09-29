class StrategyContext
  def execute(&strategy)
    strategy.call(self)
  end

  def to_s
    'context'
  end
end

context = StrategyContext.new
context.execute do |context|
  puts "opeartion1 from #{context}"
end

context.execute do |context|
  puts "opeartion2 from #{context}"
end

