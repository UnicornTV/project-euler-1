var counter: Int = 0

for index in 1..<1000
{
  if index % 3 == 0 || index % 5 == 0
  {
    counter += index
  }
}
print(counter)
