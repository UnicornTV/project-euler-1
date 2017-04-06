let upperLimit = 1000

var count = 0

for index in 3...(upperLimit - 1){
    
    if index % 3 == 0 || index % 5 == 0 {
        count += index
    }
}

print(count)
