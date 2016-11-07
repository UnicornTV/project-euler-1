require 'benchmark'

counter = 0
(0...1000).each { |i| counter += i if i % 3 == 0 || i % 5 == 0 }

puts counter
	
puts Benchmark.measure {
  counter = 0
  (0...1000).each { |i| counter += i if i % 3 == 0 || i % 5 == 0 } 
 }





