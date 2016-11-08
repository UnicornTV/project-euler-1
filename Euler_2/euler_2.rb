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
