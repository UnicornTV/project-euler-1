#ruby - just-works
total = 0 
n = 1

def fibonacci(n)
	if n <= 2
		return 1
	else 
		fibonacci(n-1) + fibonacci(n-2)
	end
end

while fibonacci(n) < 4_000_000
	if fibonacci(n) % 2 == 0
		total += fibonacci(n)
	end
	n += 1
end

p total


#ruby - refactored

four_mil = 4_000_000
i = [1,1]
c = 0
sum = 0

while c < four_mil
	c = i[0] + i[1]
	i[0] = i[1]
	i[1] = c
	if c % 2 == 0
		sum += c
	end
end

p sum
