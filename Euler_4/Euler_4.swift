var total: Int = 0
var a: Int = 999
var b: Int = 999


func isPalindrome(n: Int) -> Bool
{
  var result: Int = 0
  var remainder: Int
  var change: Int = n

  while change > 0{
    remainder = change % 10
    change /= 10
    result = result * 10 + remainder
  }

  if result == n{
    return true
  }else{
    return false
  }

}

while a >= 900
{
  total = a * b
  if isPalindrome(n: total){
    break
  }
  a -= 1
  if a == 900{
    a = 999
    b -= 1
  }
}
print (total)
