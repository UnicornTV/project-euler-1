let upperLimit = 4000000

let baseNumber = 1

var count = (0, baseNumber, baseNumber)
var sum = 0

while (sum < upperLimit){
    if count.2 % 2 == 0 {
        sum += count.2
    }
    count.0 = count.1
    count.1 = count.2
    count.2 = count.0 + count.1
}
print(sum)
