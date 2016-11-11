var start = 1, finish = 20, lcm = 1
var sum = lcm

for i in start...finish{
	while sum % i != 0{
		sum += lcm
	}
	lcm = sum
}

print(sum)
