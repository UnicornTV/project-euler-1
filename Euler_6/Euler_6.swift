func difference(n: Int) -> Int{
  var sum = 0, diff = 0, square = 0

  for i in (1...n){
    sum += (i * i)
    square += i
  }

  square *= square
  diff = square - sum
  return diff
}

print(difference(n:100))
