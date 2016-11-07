require 'benchmark'

# (0...1000).each do |i|
# 	if i % 3 == 0 || i % 5 == 0 
# 		counter += i
# 	end
# end





# counter = 0
# (0...1000).each { |i| counter += i if i % 3 == 0 || i % 5 == 0 }


# puts counter
	
# puts Benchmark.measure {
#   counter = 0
#   (0...1000).each { |i| counter += i if i % 3 == 0 || i % 5 == 0 } 
#  }


puts Benchmark.measure {
	@fib_hash = {}

	def best_fib(n) 
	  @fib_hash[n] =                                                                    
	    if n <= 1                                                                       
	      n                                                                             
	    else 
	      @fib_hash[n] ||= best_fib(n-1) + best_fib(n-2)                                
	    end                                                                              
	end 
best_fib(1000)
}



