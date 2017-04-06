var n: Int = 600851475143
var factor: Int = 2

while n > factor
{
    if n % factor == 0
    {
      n = n/factor
      factor = 2
    }else
    {
      factor += 1
    }
}

print(factor)
print(n)
