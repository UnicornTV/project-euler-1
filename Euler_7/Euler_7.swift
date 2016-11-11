import Foundation
//we import Foundation in order to use sqrt(x)

func isPrime(n: Int) -> Bool{
  if n % 2 == 0{
  	return false
  }
  let n_double = Double(n)
  let max = sqrt(n_double)
  var divisor = 3.0

  while divisor <= max{
  	var remain = n_double.truncatingRemainder(dividingBy: divisor)
  	if remain == 0{
  		return false
  	}
  	divisor += 2
  }
  return true
}

var count = 6, check = 14
while check < 200000{
  if isPrime(n:check){
    count += 1
  }
  if count == 10001{
    break
  }
  check += 1
}

print(check)
