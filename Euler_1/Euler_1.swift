var counter: Int = 0

for index in 3...999
{
  if index % 3 == 0 || index % 5 == 0
  {
    counter += index
  }
}
print(counter)
