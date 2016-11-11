package main

import "fmt"

func main() {
	fmt.Println(difference(100))
}
func difference(n int) int {
	sum, square, diff := 0, 0, 0

	for i := 1; i <= n; i++ {
		sum += (i * i)
		square += i
	}
	square *= square

	diff = square - sum

	return diff
}
