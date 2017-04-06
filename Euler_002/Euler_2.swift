let four_mil: Int = 4000000
var i:  [Int] = [1,1]
var c: Int = 0
var sum: Int = 0

while c < four_mil{
	c = i[0] + i[1]
	i[0] = i[1]
	i[1] = c
	if c % 2 == 0{
		sum += c
	}
}
print(sum)
